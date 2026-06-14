package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.UInt32Value;
import com.explorestack.protobuf.UInt64Value;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.WaterfallLoader;
import io.bidmachine.ads.networks.gam_dynamic.WaterfallNetworkRequest;
import io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper;
import io.bidmachine.protobuf.Waterfall;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
class WaterfallController {

    @NonNull
    private static final wd.e TASK_MANAGER = new xd.b();

    @NonNull
    @VisibleForTesting
    final AdsFormat adsFormat;

    @NonNull
    private final Context applicationContext;

    @VisibleForTesting
    int cacheSize;

    @NonNull
    private final GAMAdManager gamAdManager;

    @NonNull
    private final GAMEventTracker gamEventTracker;

    @NonNull
    private final GAMNetwork gamNetwork;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Nullable
    @VisibleForTesting
    String f79274id;

    @VisibleForTesting
    int maxRetryDegree;

    @NonNull
    private final NetworkParams networkParams;

    @VisibleForTesting
    long refreshTimeOutMs;

    @Nullable
    @VisibleForTesting
    String refreshUrl;

    @VisibleForTesting
    int retryBaseSec;

    @Nullable
    @VisibleForTesting
    StringValue serverParams;

    @NonNull
    private final ae.k tag;

    @NonNull
    private final TaskExecutor taskExecutor;

    @NonNull
    private final VersionWrapper versionWrapper;

    @Nullable
    @VisibleForTesting
    WaterfallLoader waterfallLoader;

    @NonNull
    @VisibleForTesting
    final List<Waterfall.Configuration.AdUnit> adUnitList = new LinkedList();

    @NonNull
    @VisibleForTesting
    final AtomicBoolean isLoading = new AtomicBoolean(false);

    @NonNull
    @VisibleForTesting
    final AtomicBoolean isPolling = new AtomicBoolean(false);

    @NonNull
    @VisibleForTesting
    final AtomicBoolean isShouldPollAfter = new AtomicBoolean(false);

    @NonNull
    @VisibleForTesting
    final AtomicInteger failedWaterfallLoadAttempts = new AtomicInteger(0);

    @VisibleForTesting
    class WaterfallCallback implements WaterfallNetworkRequest.Callback {
        WaterfallCallback() {
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.WaterfallNetworkRequest.Callback, io.bidmachine.core.b.c
        public void onCanceled() {
            WaterfallController.this.onWaterfallRequestFail("Request is canceled");
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.WaterfallNetworkRequest.Callback, io.bidmachine.core.b.InterfaceC0975b
        public void onFail(@Nullable ae.a aVar) {
            WaterfallController.this.onWaterfallRequestFail(aVar != null ? aVar.g() : "Unknown");
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.WaterfallNetworkRequest.Callback, io.bidmachine.core.b.InterfaceC0975b
        public void onSuccess(@Nullable Waterfall.Configuration configuration) {
            if (configuration != null) {
                WaterfallController.this.onWaterfallRequestSuccess(configuration);
            } else {
                WaterfallController.this.onWaterfallRequestFail("Configuration response is null");
            }
        }
    }

    @VisibleForTesting
    class WaterfallLoaderListener implements WaterfallLoader.Listener {

        @NonNull
        @VisibleForTesting
        final AtomicBoolean isAdLoaded = new AtomicBoolean(false);

        public WaterfallLoaderListener() {
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.WaterfallLoader.Listener
        public void onAdLoaded() {
            this.isAdLoaded.set(true);
            WaterfallController.this.failedWaterfallLoadAttempts.set(0);
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.WaterfallLoader.Listener
        public void onWaterfallLoadCompleted(@NonNull Queue<Waterfall.Result.AdUnit> queue) {
            WaterfallController.this.isPolling.set(false);
            if (!this.isAdLoaded.get()) {
                WaterfallController.this.failedWaterfallLoadAttempts.incrementAndGet();
            }
            WaterfallController.this.requestNextWaterfall(queue);
        }
    }

    public WaterfallController(@NonNull Context context, @NonNull NetworkParams networkParams, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration configuration, @NonNull VersionWrapper versionWrapper, @NonNull GAMNetwork gAMNetwork, @NonNull GAMAdManager gAMAdManager, @NonNull GAMEventTracker gAMEventTracker, @NonNull TaskExecutor taskExecutor) {
        this.tag = new ae.k(networkParams.getNetworkName() + "WaterfallController");
        this.applicationContext = context.getApplicationContext();
        this.networkParams = networkParams;
        this.adsFormat = adsFormat;
        this.versionWrapper = versionWrapper;
        this.gamNetwork = gAMNetwork;
        this.gamAdManager = gAMAdManager;
        this.taskExecutor = taskExecutor;
        this.gamEventTracker = gAMEventTracker;
        setWaterfallConfiguration(configuration);
    }

    public static /* synthetic */ int f(Waterfall.Configuration.AdUnit adUnit, Waterfall.Configuration.AdUnit adUnit2) {
        return -Double.compare(adUnit.getPrice(), adUnit2.getPrice());
    }

    @VisibleForTesting
    long calculateLoadingDelayMs() {
        return (long) (Math.pow(this.retryBaseSec, Math.min(this.failedWaterfallLoadAttempts.get(), this.maxRetryDegree)) * 1000.0d);
    }

    @VisibleForTesting
    void clearWaterfall() {
        this.waterfallLoader = null;
    }

    public void load(boolean z10) {
        if (this.isLoading.compareAndSet(false, true)) {
            this.isPolling.set(true);
            this.failedWaterfallLoadAttempts.set(0);
            loadWaterfall();
        } else {
            if (!z10 || this.isPolling.get()) {
                return;
            }
            this.isShouldPollAfter.set(true);
        }
    }

    @VisibleForTesting
    void loadWaterfall() {
        this.isShouldPollAfter.set(false);
        this.waterfallLoader = new WaterfallLoader(this.applicationContext, this.networkParams, this.adsFormat, this.versionWrapper, this.gamNetwork, this.gamAdManager, this.gamEventTracker, this.taskExecutor, this.f79274id, this.adUnitList, this.cacheSize, new WaterfallLoaderListener());
        final long jCalculateLoadingDelayMs = calculateLoadingDelayMs();
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.u
            @Override // ce.b
            public final Object get() {
                WaterfallController waterfallController = this.f79313a;
                return String.format("(%s) Execution waterfall load started after - %s ms (failedAttempts - %s, maxRetryDegree - %s, retryBase - %s sec)", waterfallController.adsFormat, Long.valueOf(jCalculateLoadingDelayMs), Integer.valueOf(waterfallController.failedWaterfallLoadAttempts.get()), Integer.valueOf(waterfallController.maxRetryDegree), Integer.valueOf(waterfallController.retryBaseSec));
            }
        });
        if (this.taskExecutor.execute(this.waterfallLoader, jCalculateLoadingDelayMs)) {
            return;
        }
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.v
            @Override // ce.b
            public final Object get() {
                return String.format("(%s) Fail to start loading waterfall", this.f79315a.adsFormat);
            }
        });
        processLoadCompleted();
    }

    @VisibleForTesting
    void onWaterfallRequestFail(@NonNull final String str) {
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.z
            @Override // ce.b
            public final Object get() {
                return String.format("(%s) onWaterfallRequestFail - %s", this.f79414a.adsFormat, str);
            }
        });
        loadWaterfall();
    }

    @VisibleForTesting
    void onWaterfallRequestSuccess(@NonNull Waterfall.Configuration configuration) {
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.a0
            @Override // ce.b
            public final Object get() {
                return String.format("(%s) onWaterfallRequestSuccess", this.f79275a.adsFormat);
            }
        });
        setWaterfallConfiguration(configuration);
        if (this.isShouldPollAfter.get() || !configuration.getShouldBreak()) {
            loadWaterfall();
        } else {
            processLoadCompleted();
        }
    }

    @VisibleForTesting
    void processLoadCompleted() {
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.y
            @Override // ce.b
            public final Object get() {
                return String.format("(%s) Loading completed", this.f79413a.adsFormat);
            }
        });
        clearWaterfall();
        this.isLoading.set(false);
    }

    @VisibleForTesting
    void requestNextWaterfall(@NonNull Queue<Waterfall.Result.AdUnit> queue) {
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.x
            @Override // ce.b
            public final Object get() {
                return String.format("(%s) Request next waterfall", this.f79412a.adsFormat);
            }
        });
        if (TextUtils.isEmpty(this.refreshUrl) || !io.bidmachine.core.h.I(this.refreshUrl)) {
            onWaterfallRequestFail("Request next waterfall failed (refreshUrl is null or empty or incorrect)");
            return;
        }
        Waterfall.Result.Builder builderAddAllAdUnitResults = Waterfall.Result.newBuilder().setFormat(StringValue.newBuilder().setValue(this.adsFormat.getRemoteName()).build()).addAllAdUnitResults(queue);
        String str = this.f79274id;
        if (str != null) {
            builderAddAllAdUnitResults.setWaterfallId(str);
        }
        List<Waterfall.Result.CachedAdUnit> cachedAdUnitList = this.gamAdManager.getCachedAdUnitList(this.adsFormat);
        if (cachedAdUnitList != null && !cachedAdUnitList.isEmpty()) {
            builderAddAllAdUnitResults.addAllCachedAdUnits(cachedAdUnitList);
        }
        Struct ext = this.networkParams.getExt(this.applicationContext);
        if (ext != null) {
            builderAddAllAdUnitResults.setExt(ext);
        }
        StringValue stringValue = this.serverParams;
        if (stringValue != null) {
            builderAddAllAdUnitResults.setServerParams(stringValue);
        }
        WaterfallCallback waterfallCallback = new WaterfallCallback();
        WaterfallNetworkRequest waterfallNetworkRequest = new WaterfallNetworkRequest(this.refreshUrl, builderAddAllAdUnitResults.build(), (int) this.refreshTimeOutMs);
        waterfallNetworkRequest.setCallback(waterfallCallback);
        waterfallNetworkRequest.setCancelCallback(waterfallCallback);
        waterfallNetworkRequest.request(TASK_MANAGER);
    }

    @VisibleForTesting
    void setWaterfallConfiguration(@NonNull Waterfall.Configuration configuration) {
        this.f79274id = configuration.getId();
        this.adUnitList.clear();
        List<Waterfall.Configuration.AdUnit> adUnitsList = configuration.getAdUnitsList();
        if (adUnitsList != null && !adUnitsList.isEmpty()) {
            this.adUnitList.addAll(adUnitsList);
            sortDescByPrice(this.adUnitList);
        }
        StringValue refreshUrl = configuration.hasRefreshUrl() ? configuration.getRefreshUrl() : null;
        if (refreshUrl != null) {
            String value = refreshUrl.getValue();
            if (!TextUtils.isEmpty(value) && io.bidmachine.core.h.I(value)) {
                this.refreshUrl = refreshUrl.getValue();
            }
        }
        UInt32Value cacheSize = configuration.hasCacheSize() ? configuration.getCacheSize() : null;
        this.cacheSize = cacheSize != null ? cacheSize.getValue() : 1;
        UInt32Value retryBase = configuration.hasRetryBase() ? configuration.getRetryBase() : null;
        this.retryBaseSec = retryBase != null ? retryBase.getValue() : 2;
        UInt32Value maxRetryDegree = configuration.hasMaxRetryDegree() ? configuration.getMaxRetryDegree() : null;
        this.maxRetryDegree = maxRetryDegree != null ? maxRetryDegree.getValue() : 5;
        UInt64Value refreshTimeout = configuration.hasRefreshTimeout() ? configuration.getRefreshTimeout() : null;
        this.refreshTimeOutMs = refreshTimeout != null ? refreshTimeout.getValue() : 10000L;
        this.serverParams = configuration.hasServerParams() ? configuration.getServerParams() : null;
    }

    @VisibleForTesting
    void sortDescByPrice(@NonNull List<Waterfall.Configuration.AdUnit> list) {
        Collections.sort(list, new Comparator() { // from class: io.bidmachine.ads.networks.gam_dynamic.w
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return WaterfallController.f((Waterfall.Configuration.AdUnit) obj, (Waterfall.Configuration.AdUnit) obj2);
            }
        });
    }
}
