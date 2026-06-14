package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.StringValue;
import io.bidmachine.AdsFormat;
import io.bidmachine.TrackEventType;
import io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper;
import io.bidmachine.protobuf.Waterfall;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
class WaterfallLoader implements Runnable {

    @NonNull
    @VisibleForTesting
    final Queue<Waterfall.Configuration.AdUnit> adUnitQueue;

    @NonNull
    private final AdsFormat adsFormat;

    @NonNull
    private final Context applicationContext;

    @VisibleForTesting
    final int cacheSize;

    @NonNull
    private final GAMAdManager gamAdManager;

    @NonNull
    private final GAMEventTracker gamEventTracker;

    @NonNull
    private final GAMNetwork gamNetwork;

    @NonNull
    private final Listener listener;

    @NonNull
    private final NetworkParams networkParams;

    @NonNull
    private final ae.k tag;

    @NonNull
    private final TaskExecutor taskExecutor;

    @NonNull
    private final VersionWrapper versionWrapper;

    @Nullable
    private final String waterfallId;

    @NonNull
    @VisibleForTesting
    final Queue<Waterfall.Result.AdUnit> adUnitResultQueue = new ConcurrentLinkedQueue();

    @NonNull
    @VisibleForTesting
    final AtomicBoolean isLoading = new AtomicBoolean(false);

    @VisibleForTesting
    class AdListener implements InternalAdListener {
        AdListener() {
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdListener
        public void onAdDestroyed(@NonNull InternalAd internalAd, boolean z10) {
            if (z10) {
                WaterfallLoader.this.removeAdFromCaches(internalAd);
            } else {
                WaterfallLoader.this.gamAdManager.unReserveAd(internalAd);
            }
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdListener
        public void onAdExpired(@NonNull InternalAd internalAd) {
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitExpired, internalAd);
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdListener
        public void onAdShown(@NonNull InternalAd internalAd) {
            WaterfallLoader.this.removeAdFromCaches(internalAd);
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitShown, internalAd);
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdListener
        public void onPaidEvent(@NonNull InternalAd internalAd) {
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitPaidEvent, internalAd);
        }
    }

    @VisibleForTesting
    class AdLoadListener implements InternalLoadListener {
        AdLoadListener() {
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalLoadListener
        public void onAdLoadFailed(@NonNull InternalAd internalAd, @NonNull ae.a aVar) {
            Waterfall.Configuration.AdUnit adUnit = internalAd.getAdUnit();
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitLoadFinish, adUnit, internalAd, aVar);
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitLoss, internalAd);
            WaterfallLoader.this.addAdUnitResult(adUnit, Waterfall.Result.AdUnit.Status.STATUS_ERROR, null, aVar);
            internalAd.destroy();
            WaterfallLoader waterfallLoader = WaterfallLoader.this;
            waterfallLoader.loadNextAdUnit(Long.valueOf(waterfallLoader.getSleepTimeAfterMs(adUnit)));
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalLoadListener
        public void onAdLoaded(@NonNull InternalAd internalAd, @Nullable InternalAdLoadData internalAdLoadData) {
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitLoadFinish, internalAd);
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitWin, internalAd);
            WaterfallLoader.this.addAdUnitResult(internalAd.getAdUnit(), Waterfall.Result.AdUnit.Status.STATUS_SUCCESS, internalAdLoadData, null);
            InternalAd internalAdStoreOrSwapCheapestIdleAd = WaterfallLoader.this.gamAdManager.storeOrSwapCheapestIdleAd(internalAd, WaterfallLoader.this.cacheSize);
            if (internalAdStoreOrSwapCheapestIdleAd != null) {
                WaterfallLoader.this.trackEvent(TrackEventType.AdUnitCheapestDequeued, internalAdStoreOrSwapCheapestIdleAd);
                internalAdStoreOrSwapCheapestIdleAd.destroy();
            }
            WaterfallLoader.this.listener.onAdLoaded();
            WaterfallLoader.this.loadNextAdUnit(null);
        }
    }

    public interface Listener {
        void onAdLoaded();

        void onWaterfallLoadCompleted(@NonNull Queue<Waterfall.Result.AdUnit> queue);
    }

    public WaterfallLoader(@NonNull Context context, @NonNull NetworkParams networkParams, @NonNull AdsFormat adsFormat, @NonNull VersionWrapper versionWrapper, @NonNull GAMNetwork gAMNetwork, @NonNull GAMAdManager gAMAdManager, @NonNull GAMEventTracker gAMEventTracker, @NonNull TaskExecutor taskExecutor, @Nullable String str, @NonNull List<Waterfall.Configuration.AdUnit> list, int i10, @NonNull Listener listener) {
        this.tag = new ae.k(networkParams.getNetworkName() + "WaterfallLoader");
        this.applicationContext = context.getApplicationContext();
        this.networkParams = networkParams;
        this.adsFormat = adsFormat;
        this.versionWrapper = versionWrapper;
        this.gamNetwork = gAMNetwork;
        this.gamAdManager = gAMAdManager;
        this.gamEventTracker = gAMEventTracker;
        this.taskExecutor = taskExecutor;
        this.waterfallId = str;
        this.adUnitQueue = new ConcurrentLinkedQueue(list);
        this.cacheSize = i10;
        this.listener = listener;
    }

    public static /* synthetic */ void d(final WaterfallLoader waterfallLoader, Waterfall.Configuration.AdUnit adUnit) {
        Waterfall.Configuration.AdUnit adUnit2;
        InternalAd internalAdFindCheapestIdleAd = waterfallLoader.gamAdManager.findCheapestIdleAd(waterfallLoader.adsFormat);
        if (internalAdFindCheapestIdleAd != null && adUnit.getPrice() <= internalAdFindCheapestIdleAd.getAdUnit().getPrice() && waterfallLoader.gamAdManager.getLoadedAdCount(waterfallLoader.adsFormat) >= waterfallLoader.cacheSize) {
            io.bidmachine.core.a.b(waterfallLoader.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.e0
                @Override // ce.b
                public final Object get() {
                    return String.format("(%s) Stop polling. Waterfall already filled with expensive ads", this.f79289a.adsFormat);
                }
            });
            waterfallLoader.addAdUnitResult(adUnit, Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, null);
            Iterator<Waterfall.Configuration.AdUnit> it = waterfallLoader.adUnitQueue.iterator();
            while (it.hasNext()) {
                waterfallLoader.addAdUnitResult(it.next(), Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, null);
            }
            waterfallLoader.processLoadCompleted();
            return;
        }
        try {
            adUnit2 = adUnit;
            try {
                InternalAd internalAdCreateAd = waterfallLoader.versionWrapper.createAd(waterfallLoader.networkParams, waterfallLoader.taskExecutor, waterfallLoader.adsFormat, adUnit2, waterfallLoader.new AdListener());
                if (internalAdCreateAd == null) {
                    io.bidmachine.core.a.b(waterfallLoader.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.f0
                        @Override // ce.b
                        public final Object get() {
                            return String.format("(%s) Can't create InternalAd", this.f79293a.adsFormat);
                        }
                    });
                    waterfallLoader.addAdUnitResult(adUnit2, Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, ae.a.i("Can't create InternalAd"));
                    waterfallLoader.loadNextAdUnit(null);
                } else {
                    if (!TextUtils.isEmpty(waterfallLoader.waterfallId)) {
                        internalAdCreateAd.setCustomParam("gam_waterfall_id", waterfallLoader.waterfallId);
                        internalAdCreateAd.setCustomParam("gam_ad_unit_id", adUnit2.getAdUnitId());
                    }
                    internalAdCreateAd.load(waterfallLoader.applicationContext, waterfallLoader.new AdLoadListener());
                    waterfallLoader.trackEvent(TrackEventType.AdUnitLoadStart, internalAdCreateAd);
                }
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                io.bidmachine.core.a.p(th3);
                waterfallLoader.addAdUnitResult(adUnit2, Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, ae.a.l("Exception loading InternalAd object", th3));
                waterfallLoader.loadNextAdUnit(null);
            }
        } catch (Throwable th4) {
            th = th4;
            adUnit2 = adUnit;
        }
    }

    public static /* synthetic */ String g(WaterfallLoader waterfallLoader) {
        StringBuilder sb2 = new StringBuilder(String.format("(%s) Polling completed (waterfallId - %s, ad unit count - %s)", waterfallLoader.adsFormat, waterfallLoader.waterfallId, Integer.valueOf(waterfallLoader.adUnitResultQueue.size())));
        Iterator<Waterfall.Result.AdUnit> it = waterfallLoader.adUnitResultQueue.iterator();
        while (it.hasNext()) {
            sb2.append(String.format("\n> %s", GAMUtils.toString(it.next())));
        }
        return sb2.toString();
    }

    @VisibleForTesting
    void addAdUnitResult(@NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull Waterfall.Result.AdUnit.Status status, @Nullable InternalAdLoadData internalAdLoadData, @Nullable ae.a aVar) {
        this.adUnitResultQueue.add(create(adUnit, status, internalAdLoadData, aVar));
    }

    @VisibleForTesting
    long calculateLoadingDelayMs(@NonNull Waterfall.Configuration.AdUnit adUnit, @Nullable Long l10) {
        long sleepTimeBeforeMs = getSleepTimeBeforeMs(adUnit);
        return l10 != null ? sleepTimeBeforeMs + l10.longValue() : sleepTimeBeforeMs;
    }

    @NonNull
    @VisibleForTesting
    Waterfall.Result.AdUnit create(@NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull Waterfall.Result.AdUnit.Status status, @Nullable InternalAdLoadData internalAdLoadData, @Nullable ae.a aVar) {
        Waterfall.Result.AdUnit.Builder price = Waterfall.Result.AdUnit.newBuilder().setStatus(status).setPrice(adUnit.getPrice());
        if (adUnit.getAdUnitId() != null) {
            price.setAdUnitId(adUnit.getAdUnitId());
        }
        StringValue serverParams = adUnit.getServerParams();
        if (serverParams != null) {
            price.setServerParams(serverParams);
        }
        if (internalAdLoadData != null) {
            Waterfall.Result.EstimatedPrice price2 = internalAdLoadData.getPrice();
            if (price2 != null) {
                price.setEstimatedPrice(price2);
            }
            String adResponse = internalAdLoadData.getAdResponse();
            if (!TextUtils.isEmpty(adResponse)) {
                price.setAdResponse(StringValue.newBuilder().setValue(adResponse).build());
            }
        }
        if (aVar != null) {
            price.setError(Waterfall.Result.AdUnit.Error.newBuilder().setCode(aVar.e()).setDescription(aVar.g()));
        }
        return price.build();
    }

    @VisibleForTesting
    long getSleepTimeAfterMs(@NonNull Waterfall.Configuration.AdUnit adUnit) {
        if ((adUnit.hasSleepTimeAfter() ? adUnit.getSleepTimeAfter() : null) != null) {
            return r3.getValue();
        }
        return 0L;
    }

    @VisibleForTesting
    long getSleepTimeBeforeMs(@NonNull Waterfall.Configuration.AdUnit adUnit) {
        if ((adUnit.hasSleepTimeBefore() ? adUnit.getSleepTimeBefore() : null) != null) {
            return r3.getValue();
        }
        return 0L;
    }

    @VisibleForTesting
    void load() {
        if (this.isLoading.compareAndSet(false, true)) {
            io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.g0
                @Override // ce.b
                public final Object get() {
                    WaterfallLoader waterfallLoader = this.f79295a;
                    return String.format("(%s) Polling started (waterfallId - %s, ad unit count - %s)", waterfallLoader.adsFormat, waterfallLoader.waterfallId, Integer.valueOf(waterfallLoader.adUnitQueue.size()));
                }
            });
            trackEvent(TrackEventType.WaterfallLoadStart);
            loadNextAdUnit(null);
        }
    }

    @VisibleForTesting
    void loadNextAdUnit(@Nullable Long l10) {
        if (this.adUnitQueue.isEmpty()) {
            processLoadCompleted();
            return;
        }
        final Waterfall.Configuration.AdUnit adUnitPoll = this.adUnitQueue.poll();
        if (adUnitPoll == null) {
            loadNextAdUnit(l10);
            return;
        }
        final long jCalculateLoadingDelayMs = calculateLoadingDelayMs(adUnitPoll, l10);
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.b0
            @Override // ce.b
            public final Object get() {
                return String.format("(%s) Execution ad unit load started after %s ms", this.f79278a.adsFormat, Long.valueOf(jCalculateLoadingDelayMs));
            }
        });
        if (this.taskExecutor.execute(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.c0
            @Override // java.lang.Runnable
            public final void run() {
                WaterfallLoader.d(this.f79281b, adUnitPoll);
            }
        }, jCalculateLoadingDelayMs)) {
            return;
        }
        processLoadCompleted();
    }

    @VisibleForTesting
    void processLoadCompleted() {
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.d0
            @Override // ce.b
            public final Object get() {
                return WaterfallLoader.g(this.f79286a);
            }
        });
        trackEvent(TrackEventType.WaterfallLoadFinish);
        this.isLoading.set(false);
        this.listener.onWaterfallLoadCompleted(this.adUnitResultQueue);
    }

    @VisibleForTesting
    void removeAdFromCaches(@NonNull InternalAd internalAd) {
        if (this.gamAdManager.removeAdFromCaches(internalAd)) {
            this.gamNetwork.cacheWaterfall(internalAd.getAdsFormat(), true);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        load();
    }

    @VisibleForTesting
    void trackEvent(@NonNull TrackEventType trackEventType) {
        trackEvent(trackEventType, null, null, null);
    }

    @VisibleForTesting
    void trackEvent(@NonNull TrackEventType trackEventType, @NonNull InternalAd internalAd) {
        trackEvent(trackEventType, internalAd.getAdUnit(), internalAd, null);
    }

    @VisibleForTesting
    void trackEvent(@NonNull TrackEventType trackEventType, @Nullable Waterfall.Configuration.AdUnit adUnit, @Nullable InternalAd internalAd, @Nullable ae.a aVar) {
        nd.a aVarH = new nd.a().h(this.networkParams.getNetworkKey());
        if (adUnit != null) {
            aVarH.i(Double.valueOf(adUnit.getPrice()));
        }
        if (internalAd != null) {
            aVarH.g(internalAd.getCustomParamsMap());
        }
        if (!TextUtils.isEmpty(this.waterfallId)) {
            aVarH.f("gam_waterfall_id", this.waterfallId);
        }
        this.gamEventTracker.trackEvent(trackEventType, this.adsFormat, aVarH, aVar);
    }
}
