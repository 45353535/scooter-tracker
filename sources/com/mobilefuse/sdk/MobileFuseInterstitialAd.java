package com.mobilefuse.sdk;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mobilefuse.sdk.AdController;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
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
public class MobileFuseInterstitialAd implements WinningBidInfoSource, MutableAd {
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

    public interface Listener extends BaseAdListener {
        void onAdClosed() throws Throwable;
    }

    public MobileFuseInterstitialAd(@NonNull Context context, @NonNull String str) {
        this(context, str, false);
    }

    public static /* synthetic */ Unit a(MobileFuseInterstitialAd mobileFuseInterstitialAd, String str) {
        mobileFuseInterstitialAd.loadAdFromBiddingTokenInternal(str);
        return Unit.f93236a;
    }

    public static /* synthetic */ void b(MobileFuseInterstitialAd mobileFuseInterstitialAd, AdError adError, ObservableConfig observableConfig) {
        mobileFuseInterstitialAd.getClass();
        try {
            MobileFuse.logDebug("Ad Error: " + adError);
            Listener listener = mobileFuseInterstitialAd.adListener;
            if (listener != null) {
                listener.onAdError(adError);
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(mobileFuseInterstitialAd, th2);
        }
    }

    private AdController.AdListener createListener() {
        return new AdController.AdListener() { // from class: com.mobilefuse.sdk.MobileFuseInterstitialAd.1
            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdClicked(String str) throws Throwable {
                MobileFuseInterstitialAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdClickedAction(str, MobileFuseInterstitialAd.this.adInstanceInfo));
                Listener listener = MobileFuseInterstitialAd.this.adListener;
                if (listener != null) {
                    listener.onAdClicked();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdClosed() throws Throwable {
                MobileFuseInterstitialAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_CLOSED, MobileFuseInterstitialAd.this.adInstanceInfo));
                MobileFuseInterstitialAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceAction(TelemetryActionSdkEvents.AD_INSTANCE_DESTROYED, MobileFuseInterstitialAd.this.adInstanceInfo));
                MobileFuseInterstitialAd mobileFuseInterstitialAd = MobileFuseInterstitialAd.this;
                AdController adControllerNewInstance = mobileFuseInterstitialAd.adController.newInstance(mobileFuseInterstitialAd.adControllerListener);
                MobileFuseInterstitialAd.this.adController.destroy();
                MobileFuseInterstitialAd mobileFuseInterstitialAd2 = MobileFuseInterstitialAd.this;
                mobileFuseInterstitialAd2.adController.adListener = null;
                mobileFuseInterstitialAd2.adController = adControllerNewInstance;
                Listener listener = mobileFuseInterstitialAd2.adListener;
                if (listener != null) {
                    listener.onAdClosed();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdControllerUpdated(AdController adController) throws Throwable {
                MobileFuse.logDebug("[Interstitial::AdmCacheMonitor] onAdControllerUpdated");
                MobileFuseInterstitialAd mobileFuseInterstitialAd = MobileFuseInterstitialAd.this;
                adController.adListener = mobileFuseInterstitialAd.adControllerListener;
                AdController adController2 = mobileFuseInterstitialAd.adController;
                adController2.adListener = null;
                adController2.destroy();
                MobileFuseInterstitialAd.this.adController = adController;
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdError(AdError adError) throws Throwable {
                Listener listener;
                MobileFuseInterstitialAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdErrorAction(MobileFuseInterstitialAd.this.adInstanceInfo, adError != null ? adError.getErrorMessage() : ""));
                AdError adError2 = AdError.AD_RUNTIME_ERROR;
                if (adError != adError2) {
                    Listener listener2 = MobileFuseInterstitialAd.this.adListener;
                    if (listener2 != null) {
                        listener2.onAdError(adError);
                        return;
                    }
                    return;
                }
                MobileFuseInterstitialAd mobileFuseInterstitialAd = MobileFuseInterstitialAd.this;
                AdController.AdState adState = mobileFuseInterstitialAd.adController.adState;
                if (adState == AdController.AdState.NOT_FILLED) {
                    Listener listener3 = mobileFuseInterstitialAd.adListener;
                    if (listener3 != null) {
                        listener3.onAdNotFilled();
                        return;
                    }
                    return;
                }
                if (adState == AdController.AdState.RENDERED) {
                    Listener listener4 = mobileFuseInterstitialAd.adListener;
                    if (listener4 != null) {
                        listener4.onAdError(adError2);
                        return;
                    }
                    return;
                }
                if (adState != AdController.AdState.LOADED || (listener = mobileFuseInterstitialAd.adListener) == null) {
                    return;
                }
                listener.onAdError(adError2);
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdExpired(float f10) throws Throwable {
                MobileFuseInterstitialAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdExpiryAction(f10, MobileFuseInterstitialAd.this.adInstanceInfo));
                MobileFuseInterstitialAd mobileFuseInterstitialAd = MobileFuseInterstitialAd.this;
                AdController adControllerNewInstance = mobileFuseInterstitialAd.adController.newInstance(mobileFuseInterstitialAd.adControllerListener);
                try {
                    MobileFuseInterstitialAd.this.adController.destroy();
                    MobileFuseInterstitialAd.this.adController = null;
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
                MobileFuseInterstitialAd mobileFuseInterstitialAd2 = MobileFuseInterstitialAd.this;
                mobileFuseInterstitialAd2.adController = adControllerNewInstance;
                Listener listener = mobileFuseInterstitialAd2.adListener;
                if (listener != null) {
                    listener.onAdExpired();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdLoaded() throws Throwable {
                MobileFuseInterstitialAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_LOADED, MobileFuseInterstitialAd.this.adInstanceInfo));
                Listener listener = MobileFuseInterstitialAd.this.adListener;
                if (listener != null) {
                    listener.onAdLoaded();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdNotFilled(int i10) throws Throwable {
                MobileFuseInterstitialAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_NOT_FILLED, MobileFuseInterstitialAd.this.adInstanceInfo));
                Listener listener = MobileFuseInterstitialAd.this.adListener;
                if (listener != null) {
                    listener.onAdNotFilled();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdRendered() throws Throwable {
                MobileFuseInterstitialAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_RENDERED, MobileFuseInterstitialAd.this.adInstanceInfo));
                Listener listener = MobileFuseInterstitialAd.this.adListener;
                if (listener != null) {
                    listener.onAdRendered();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onFullscreenChanged(boolean z10) {
            }
        };
    }

    public static /* synthetic */ Unit d(MobileFuseInterstitialAd mobileFuseInterstitialAd) {
        mobileFuseInterstitialAd.loadAdInternal();
        return Unit.f93236a;
    }

    private void detectTestModeFromPlacementId() throws Throwable {
        String str;
        ObservableConfig observableConfig = this.observableConfig;
        if (observableConfig == null || (str = this.placementId) == null) {
            return;
        }
        PlacementUtil.detectTestMode(str, observableConfig, new Callback() { // from class: com.mobilefuse.sdk.v
            @Override // com.mobilefuse.sdk.internal.Callback
            public final void call(Object obj) {
                this.f53433a.placementId = (String) obj;
            }
        });
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

    /* JADX INFO: Access modifiers changed from: private */
    public void showAdInternal() {
        try {
            this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createShowAdAction(isLoaded(), this.adInstanceInfo));
            if (isLoaded()) {
                this.adController.showFullscreenAd();
            } else {
                MobileFuse.logError("Interstitial Ad failed to show because there is no ad loaded. Ensure that you call loadAd() and check that an ad is loaded before calling showAd().");
            }
        } catch (Throwable th2) {
            StabilityHelper.logAdRenderingException(this, th2, this.observableConfig);
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
        MobileFuseServices.requireAllServices(new Function0() { // from class: com.mobilefuse.sdk.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MobileFuseInterstitialAd.d(this.f53445b);
            }
        });
    }

    public void loadAdFromBiddingToken(final String str) {
        MobileFuseServices.requireAllServices(new Function0() { // from class: com.mobilefuse.sdk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MobileFuseInterstitialAd.a(this.f53443b, str);
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
            this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.w
                @Override // java.lang.Runnable
                public final void run() {
                    this.f53442b.showAdInternal();
                }
            });
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    MobileFuseInterstitialAd(@NonNull Context context, @NonNull String str, boolean z10) {
        this.handler = Utils.getHandler();
        AdController.AdType adType = AdController.AdType.INTERSTITIAL;
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
            observableConfig.setValue(ObservableConfigKey.MRAID_AD_SKIPOFFSET_SECONDS, Float.valueOf(5.0f));
            adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceCreatedAction(adInstanceInfo));
            observableConfig.setValue(ObservableConfigKey.AD_INSTANCE_INFO, adInstanceInfo);
            mutableAdController.init();
            observableConfig.setValue(ObservableConfigKey.AD_ERROR_CALLBACK, new AdErrorCallback() { // from class: com.mobilefuse.sdk.z
                @Override // com.mobilefuse.sdk.utils.AdErrorCallback
                public final void onError(AdError adError, ObservableConfig observableConfig2) {
                    MobileFuseInterstitialAd.b(this.f53446a, adError, observableConfig2);
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
