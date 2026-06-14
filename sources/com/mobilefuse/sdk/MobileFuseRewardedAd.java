package com.mobilefuse.sdk;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mobilefuse.sdk.AdController;
import com.mobilefuse.sdk.MobileFuseRewardedAd;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.config.Observer;
import com.mobilefuse.sdk.internal.Callback;
import com.mobilefuse.sdk.internal.SdkInitializer;
import com.mobilefuse.sdk.internal.mute.MutableAd;
import com.mobilefuse.sdk.internal.mute.MutableAdController;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.telemetry.TelemetryActionSdkEvents;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionFactory;
import com.mobilefuse.sdk.telemetry.TelemetrySdkTypesKt;
import com.mobilefuse.sdk.utils.AdErrorCallback;
import com.mobilefuse.sdk.utils.PlacementUtil;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class MobileFuseRewardedAd implements WinningBidInfoSource, MutableAd {
    protected AdController adController;
    protected AdController.AdListener adControllerListener;

    @NonNull
    private final AdInstanceInfo adInstanceInfo;
    protected Listener adListener;

    @NonNull
    private final AdController.AdType adType;
    protected Context context;

    @NonNull
    private final Handler handler;

    @NonNull
    protected final MutableAdController mutableAdController;

    @NonNull
    protected final ObservableConfig observableConfig;
    protected String placementId;

    @Nullable
    private Observer skipAdAvailabilityObserver;

    /* JADX INFO: renamed from: com.mobilefuse.sdk.MobileFuseRewardedAd$1, reason: invalid class name */
    class AnonymousClass1 implements AdController.AdListener {
        AnonymousClass1() {
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1, Listener listener) {
            anonymousClass1.getClass();
            try {
                listener.onAdClosed();
            } catch (Throwable th2) {
                StabilityHelper.logException(anonymousClass1, th2);
            }
        }

        @Override // com.mobilefuse.sdk.AdController.AdListener
        public void onAdClicked(String str) throws Exception {
            MobileFuseRewardedAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdClickedAction(str, MobileFuseRewardedAd.this.adInstanceInfo));
            Listener listener = MobileFuseRewardedAd.this.adListener;
            if (listener != null) {
                listener.onAdClicked();
            }
        }

        @Override // com.mobilefuse.sdk.AdController.AdListener
        public void onAdClosed() throws Throwable {
            MobileFuseRewardedAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_CLOSED, MobileFuseRewardedAd.this.adInstanceInfo));
            MobileFuseRewardedAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceAction(TelemetryActionSdkEvents.AD_INSTANCE_DESTROYED, MobileFuseRewardedAd.this.adInstanceInfo));
            MobileFuseRewardedAd.this.unregisterSkipAdAvailabilityObserver();
            MobileFuseRewardedAd mobileFuseRewardedAd = MobileFuseRewardedAd.this;
            AdController adControllerNewInstance = mobileFuseRewardedAd.adController.newInstance(mobileFuseRewardedAd.adControllerListener);
            MobileFuseRewardedAd.this.adController.destroy();
            MobileFuseRewardedAd mobileFuseRewardedAd2 = MobileFuseRewardedAd.this;
            mobileFuseRewardedAd2.adController.adListener = null;
            mobileFuseRewardedAd2.adController = adControllerNewInstance;
            final Listener listener = mobileFuseRewardedAd2.adListener;
            if (listener != null) {
                SchedulersKt.getGlobalHandler().post(new Runnable() { // from class: com.mobilefuse.sdk.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        MobileFuseRewardedAd.AnonymousClass1.a(this.f53425b, listener);
                    }
                });
            }
        }

        @Override // com.mobilefuse.sdk.AdController.AdListener
        public void onAdControllerUpdated(AdController adController) throws Throwable {
            MobileFuse.logDebug("[Rewarded::AdmCacheMonitor] onAdControllerUpdated");
            MobileFuseRewardedAd mobileFuseRewardedAd = MobileFuseRewardedAd.this;
            adController.adListener = mobileFuseRewardedAd.adControllerListener;
            AdController adController2 = mobileFuseRewardedAd.adController;
            adController2.adListener = null;
            adController2.destroy();
            MobileFuseRewardedAd.this.adController = adController;
        }

        @Override // com.mobilefuse.sdk.AdController.AdListener
        public void onAdError(AdError adError) throws Exception {
            Listener listener;
            MobileFuseRewardedAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdErrorAction(MobileFuseRewardedAd.this.adInstanceInfo, adError != null ? adError.getErrorMessage() : ""));
            MobileFuseRewardedAd.this.unregisterSkipAdAvailabilityObserver();
            AdError adError2 = AdError.AD_RUNTIME_ERROR;
            if (adError != adError2) {
                Listener listener2 = MobileFuseRewardedAd.this.adListener;
                if (listener2 != null) {
                    listener2.onAdError(adError);
                    return;
                }
                return;
            }
            MobileFuseRewardedAd mobileFuseRewardedAd = MobileFuseRewardedAd.this;
            AdController.AdState adState = mobileFuseRewardedAd.adController.adState;
            if (adState == AdController.AdState.NOT_FILLED) {
                Listener listener3 = mobileFuseRewardedAd.adListener;
                if (listener3 != null) {
                    listener3.onAdNotFilled();
                    return;
                }
                return;
            }
            if (adState != AdController.AdState.RENDERED || (listener = mobileFuseRewardedAd.adListener) == null) {
                return;
            }
            listener.onAdError(adError2);
        }

        @Override // com.mobilefuse.sdk.AdController.AdListener
        public void onAdExpired(float f10) throws Throwable {
            MobileFuseRewardedAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdExpiryAction(f10, MobileFuseRewardedAd.this.adInstanceInfo));
            MobileFuseRewardedAd mobileFuseRewardedAd = MobileFuseRewardedAd.this;
            AdController adControllerNewInstance = mobileFuseRewardedAd.adController.newInstance(mobileFuseRewardedAd.adControllerListener);
            try {
                MobileFuseRewardedAd.this.adController.destroy();
                MobileFuseRewardedAd.this.adController = null;
            } catch (Exception e10) {
                StabilityHelper.logException(this, e10);
            }
            MobileFuseRewardedAd mobileFuseRewardedAd2 = MobileFuseRewardedAd.this;
            mobileFuseRewardedAd2.adController = adControllerNewInstance;
            Listener listener = mobileFuseRewardedAd2.adListener;
            if (listener != null) {
                listener.onAdExpired();
            }
        }

        @Override // com.mobilefuse.sdk.AdController.AdListener
        public void onAdLoaded() throws Exception {
            MobileFuseRewardedAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_LOADED, MobileFuseRewardedAd.this.adInstanceInfo));
            Listener listener = MobileFuseRewardedAd.this.adListener;
            if (listener != null) {
                listener.onAdLoaded();
            }
        }

        @Override // com.mobilefuse.sdk.AdController.AdListener
        public void onAdNotFilled(int i10) throws Exception {
            MobileFuseRewardedAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_NOT_FILLED, MobileFuseRewardedAd.this.adInstanceInfo));
            Listener listener = MobileFuseRewardedAd.this.adListener;
            if (listener != null) {
                listener.onAdNotFilled();
            }
        }

        @Override // com.mobilefuse.sdk.AdController.AdListener
        public void onAdRendered() throws Exception {
            MobileFuseRewardedAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_RENDERED, MobileFuseRewardedAd.this.adInstanceInfo));
            Listener listener = MobileFuseRewardedAd.this.adListener;
            if (listener != null) {
                listener.onAdRendered();
            }
        }

        @Override // com.mobilefuse.sdk.AdController.AdListener
        public void onFullscreenChanged(boolean z10) {
        }
    }

    public interface Listener extends BaseAdListener {
        void onAdClosed() throws Exception;

        void onUserEarnedReward() throws Exception;
    }

    public MobileFuseRewardedAd(@NonNull Context context, @NonNull String str) {
        this(context, str, false);
    }

    public static /* synthetic */ void a(MobileFuseRewardedAd mobileFuseRewardedAd, ObservableConfigKey observableConfigKey, Object obj) {
        mobileFuseRewardedAd.getClass();
        try {
            if (observableConfigKey == ObservableConfigKey.SKIP_AD_AVAILABLE && (obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                mobileFuseRewardedAd.triggerOnUserEarnedRewardCallback();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(mobileFuseRewardedAd, th2);
        }
    }

    public static /* synthetic */ void b(MobileFuseRewardedAd mobileFuseRewardedAd, Listener listener) {
        mobileFuseRewardedAd.getClass();
        if (listener != null) {
            try {
                listener.onUserEarnedReward();
            } catch (Exception e10) {
                StabilityHelper.logException(mobileFuseRewardedAd, e10);
            }
        }
    }

    public static /* synthetic */ Unit c(MobileFuseRewardedAd mobileFuseRewardedAd) {
        mobileFuseRewardedAd.loadAdInternal();
        return Unit.f93236a;
    }

    private AdController.AdListener createListener() {
        return new AnonymousClass1();
    }

    private Observer createSkipAdAvaiabilityObserver() {
        return new Observer() { // from class: com.mobilefuse.sdk.j0
            @Override // com.mobilefuse.sdk.config.Observer
            public final void onChanged(ObservableConfigKey observableConfigKey, Object obj) {
                MobileFuseRewardedAd.a(this.f53387a, observableConfigKey, obj);
            }
        };
    }

    private void detectTestModeFromPlacementId() throws Throwable {
        String str;
        ObservableConfig observableConfig = this.observableConfig;
        if (observableConfig == null || (str = this.placementId) == null) {
            return;
        }
        PlacementUtil.detectTestMode(str, observableConfig, new Callback() { // from class: com.mobilefuse.sdk.k0
            @Override // com.mobilefuse.sdk.internal.Callback
            public final void call(Object obj) {
                this.f53389a.placementId = (String) obj;
            }
        });
    }

    public static /* synthetic */ Unit e(MobileFuseRewardedAd mobileFuseRewardedAd, String str) {
        mobileFuseRewardedAd.loadAdFromBiddingTokenInternal(str);
        return Unit.f93236a;
    }

    public static /* synthetic */ void f(MobileFuseRewardedAd mobileFuseRewardedAd, AdError adError, ObservableConfig observableConfig) {
        mobileFuseRewardedAd.getClass();
        try {
            MobileFuse.logDebug("Ad Error: " + adError);
            Listener listener = mobileFuseRewardedAd.adListener;
            if (listener != null) {
                listener.onAdError(adError);
            }
        } catch (Exception e10) {
            StabilityHelper.logException(mobileFuseRewardedAd, e10);
        }
    }

    private void loadAdFromBiddingTokenInternal(String str) {
        try {
            if (this.adController == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(TelemetrySdkTypesKt.createParamBidResponseToken(str));
            this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceAction(TelemetryActionSdkEvents.AD_BIDDING_LOAD_REQUESTED, this.adInstanceInfo, arrayList));
            this.adController.loadAdFromBiddingToken(str);
        } catch (Throwable th2) {
            StabilityHelper.logAdErrorException(this, th2, this.observableConfig, AdError.AD_LOAD_ERROR);
        }
    }

    private void loadAdInternal() {
        try {
            if (this.adController == null) {
                return;
            }
            this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceLoadAdAction(this.adInstanceInfo));
            this.adController.loadAd();
        } catch (Throwable th2) {
            StabilityHelper.logAdErrorException(this, th2, this.observableConfig, AdError.AD_LOAD_ERROR);
        }
    }

    private void registerSkipAdAvaiabilityObserver() {
        try {
            Observer observerCreateSkipAdAvaiabilityObserver = createSkipAdAvaiabilityObserver();
            this.skipAdAvailabilityObserver = observerCreateSkipAdAvaiabilityObserver;
            this.observableConfig.registerObserver(observerCreateSkipAdAvaiabilityObserver);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAdInternal() {
        try {
            this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createShowAdAction(isLoaded(), this.adInstanceInfo));
            if (!isLoaded()) {
                MobileFuse.logError("Rewarded Ad failed to show because there is no ad loaded. Ensure that you call loadAd() and check that an ad is loaded before calling showAd().");
            } else {
                registerSkipAdAvaiabilityObserver();
                this.adController.showFullscreenAd();
            }
        } catch (Throwable th2) {
            StabilityHelper.logAdRenderingException(this, th2, this.observableConfig);
        }
    }

    private void triggerOnUserEarnedRewardCallback() {
        unregisterSkipAdAvailabilityObserver();
        final Listener listener = this.adListener;
        try {
            if (!this.adController.isAdVisibleOnScreen()) {
                return;
            } else {
                this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_EARNED_REWARD, this.adInstanceInfo));
            }
        } catch (Exception e10) {
            StabilityHelper.logException(this, e10);
        }
        try {
            this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.n0
                @Override // java.lang.Runnable
                public final void run() {
                    MobileFuseRewardedAd.b(this.f53413b, listener);
                }
            });
        } catch (Exception e11) {
            StabilityHelper.logException(this, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterSkipAdAvailabilityObserver() {
        try {
            Observer observer = this.skipAdAvailabilityObserver;
            if (observer == null) {
                return;
            }
            this.observableConfig.unregisterObserver(observer);
            this.skipAdAvailabilityObserver = null;
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public void clearBidFloor() {
        try {
            PlacementUtil.clearBidFloor(this.observableConfig);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    AdController createAdController(Context context, String str, AdInstanceInfo adInstanceInfo, int i10, int i11, ObservableConfig observableConfig, AdController.AdListener adListener) throws Throwable {
        return new AdController(context, str, this.adType, adInstanceInfo, i10, i11, observableConfig, adListener);
    }

    @Nullable
    public Float getBidFloor() {
        try {
            return PlacementUtil.getBidFloor(this.observableConfig);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            return null;
        }
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    @Nullable
    public MuteChangedListener getMuteChangedListener() {
        return this.mutableAdController.getMuteChangedListener();
    }

    @Override // com.mobilefuse.sdk.WinningBidInfoSource
    @Nullable
    public WinningBidInfo getWinningBidInfo() {
        AdController adController = this.adController;
        if (adController == null) {
            return null;
        }
        return adController.getWinningBidInfo();
    }

    void init() throws Throwable {
        this.adController = createAdController(this.context, this.placementId, this.adInstanceInfo, -1, -1, this.observableConfig, this.adControllerListener);
    }

    public boolean isLoaded() {
        return this.adController.isAdLoaded();
    }

    public boolean isLoading() {
        return this.adController.isAdLoading();
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public boolean isMuted() {
        return this.mutableAdController.isMuted();
    }

    public boolean isTestMode() {
        try {
            return PlacementUtil.isTestMode(this.observableConfig);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            return false;
        }
    }

    public void loadAd() {
        MobileFuseServices.requireAllServices(new Function0() { // from class: com.mobilefuse.sdk.l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MobileFuseRewardedAd.c(this.f53391b);
            }
        });
    }

    public void loadAdFromBiddingToken(final String str) {
        MobileFuseServices.requireAllServices(new Function0() { // from class: com.mobilefuse.sdk.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MobileFuseRewardedAd.e(this.f53393b, str);
            }
        });
    }

    public void setBidFloor(float f10) {
        try {
            PlacementUtil.setBidFloor(this.observableConfig, Float.valueOf(f10));
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public void setListener(Listener listener) {
        this.adListener = listener;
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public void setMuteChangedListener(MuteChangedListener muteChangedListener) {
        this.mutableAdController.setMuteChangedListener(muteChangedListener);
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public void setMuted(boolean z10) throws Throwable {
        this.mutableAdController.setMuted(z10);
    }

    public void setTestMode(boolean z10) {
        try {
            PlacementUtil.setTestMode(this.observableConfig, z10);
            this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceSetTestModeAction(z10, this.adInstanceInfo));
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public void showAd() {
        try {
            this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f53423b.showAdInternal();
                }
            });
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    MobileFuseRewardedAd(@NonNull Context context, @NonNull String str, boolean z10) {
        this.handler = Utils.getHandler();
        AdController.AdType adType = AdController.AdType.REWARDED;
        this.adType = adType;
        this.context = context.getApplicationContext();
        this.placementId = str;
        SdkInitializer.ensureSdkSetup(false);
        MobileFuseServices.requireAllServices();
        AdInstanceInfo adInstanceInfo = new AdInstanceInfo(this, adType.getValue(), str);
        this.adInstanceInfo = adInstanceInfo;
        ObservableConfig observableConfig = new ObservableConfig();
        this.observableConfig = observableConfig;
        MutableAdController mutableAdController = new MutableAdController(observableConfig, adInstanceInfo);
        this.mutableAdController = mutableAdController;
        try {
            observableConfig.setValue(ObservableConfigKey.DEFAULT_MUTED, Boolean.FALSE);
            observableConfig.setValue(ObservableConfigKey.MRAID_AD_SKIPOFFSET_SECONDS, Float.valueOf(10.0f));
            adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceCreatedAction(adInstanceInfo));
            observableConfig.setValue(ObservableConfigKey.AD_INSTANCE_INFO, adInstanceInfo);
            mutableAdController.init();
            observableConfig.setValue(ObservableConfigKey.AD_ERROR_CALLBACK, new AdErrorCallback() { // from class: com.mobilefuse.sdk.o0
                @Override // com.mobilefuse.sdk.utils.AdErrorCallback
                public final void onError(AdError adError, ObservableConfig observableConfig2) {
                    MobileFuseRewardedAd.f(this.f53420a, adError, observableConfig2);
                }
            });
            detectTestModeFromPlacementId();
            this.adControllerListener = createListener();
            if (z10) {
                return;
            }
            init();
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }
}
