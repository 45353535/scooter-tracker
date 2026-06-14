package com.mobilefuse.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mobilefuse.sdk.AdController;
import com.mobilefuse.sdk.AppLifecycleHelper;
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
public class MobileFuseOmniAd implements WinningBidInfoSource, MutableAd {

    @NonNull
    protected AdController adController;
    protected AdController.AdListener adControllerListener;

    @NonNull
    private final AdInstanceInfo adInstanceInfo;
    protected Listener adListener;

    @NonNull
    private AdState adState;

    @NonNull
    private final AdController.AdType adType;

    @NonNull
    protected Context context;

    @NonNull
    private final Handler handler;

    @NonNull
    protected final MutableAdController mutableAdController;

    @NonNull
    protected final ObservableConfig observableConfig;
    protected String placementId;

    @NonNull
    private Position position;

    @Nullable
    private AppLifecycleHelper.ActivityLifecycleObserver renderingActivityOnDestroyListener;

    public enum AdState {
        THUMBNAIL,
        FULL_SCREEN
    }

    public interface Listener extends BaseAdListener {
        void onAdClosed();

        void onStateChange(@NonNull AdState adState);
    }

    public enum Position {
        TOP_LEFT(0),
        TOP_RIGHT(1),
        BOTTOM_LEFT(2),
        BOTTOM_RIGHT(3);

        private final int positionAnchor;

        Position(int i10) {
            this.positionAnchor = i10;
        }

        public int getPositionAnchor() {
            return this.positionAnchor;
        }
    }

    public MobileFuseOmniAd(@NonNull Context context, @NonNull String str) {
        this(context, str, false);
    }

    public static /* synthetic */ Unit a(MobileFuseOmniAd mobileFuseOmniAd, String str) {
        mobileFuseOmniAd.loadAdFromBiddingTokenInternal(str);
        return Unit.f93236a;
    }

    private boolean applyPosition(Position position) {
        if (this.position == position) {
            return false;
        }
        this.position = position;
        return true;
    }

    public static /* synthetic */ void c(MobileFuseOmniAd mobileFuseOmniAd) {
        mobileFuseOmniAd.getClass();
        try {
            AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver = mobileFuseOmniAd.renderingActivityOnDestroyListener;
            if (activityLifecycleObserver != null) {
                AppLifecycleHelper.removeActivityLifecycleObserver(activityLifecycleObserver);
                mobileFuseOmniAd.renderingActivityOnDestroyListener = null;
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(mobileFuseOmniAd, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeAdInternal() {
        try {
            if (this.adController.isAdRendering()) {
                this.adController.closeFullscreenAd();
            }
        } catch (Throwable th2) {
            StabilityHelper.logAdRenderingException(this, th2, this.observableConfig);
        }
    }

    private AdController.AdListener createListener() {
        return new AdController.AdListener() { // from class: com.mobilefuse.sdk.MobileFuseOmniAd.2
            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdClicked(String str) throws Throwable {
                MobileFuseOmniAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdClickedAction(str, MobileFuseOmniAd.this.adInstanceInfo));
                Listener listener = MobileFuseOmniAd.this.adListener;
                if (listener != null) {
                    listener.onAdClicked();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdClosed() throws Throwable {
                MobileFuseOmniAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_CLOSED, MobileFuseOmniAd.this.adInstanceInfo));
                MobileFuseOmniAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceAction(TelemetryActionSdkEvents.AD_INSTANCE_DESTROYED, MobileFuseOmniAd.this.adInstanceInfo));
                MobileFuseOmniAd mobileFuseOmniAd = MobileFuseOmniAd.this;
                AdController adControllerNewInstance = mobileFuseOmniAd.adController.newInstance(mobileFuseOmniAd.adControllerListener);
                MobileFuseOmniAd.this.adController.destroy();
                MobileFuseOmniAd mobileFuseOmniAd2 = MobileFuseOmniAd.this;
                mobileFuseOmniAd2.adController.adListener = null;
                mobileFuseOmniAd2.adController = adControllerNewInstance;
                Listener listener = mobileFuseOmniAd2.adListener;
                if (listener != null) {
                    listener.onAdClosed();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdControllerUpdated(AdController adController) throws Throwable {
                MobileFuse.logDebug("[OmniAd::RtbCacheMonitor] onAdControllerUpdated");
                MobileFuseOmniAd mobileFuseOmniAd = MobileFuseOmniAd.this;
                adController.adListener = mobileFuseOmniAd.adControllerListener;
                AdController adController2 = mobileFuseOmniAd.adController;
                adController2.adListener = null;
                adController2.destroy();
                MobileFuseOmniAd.this.adController = adController;
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdError(AdError adError) throws Throwable {
                MobileFuseOmniAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdErrorAction(MobileFuseOmniAd.this.adInstanceInfo, adError != null ? adError.getErrorMessage() : ""));
                AdError adError2 = AdError.AD_RUNTIME_ERROR;
                if (adError != adError2) {
                    Listener listener = MobileFuseOmniAd.this.adListener;
                    if (listener != null) {
                        listener.onAdError(adError);
                        return;
                    }
                    return;
                }
                MobileFuseOmniAd mobileFuseOmniAd = MobileFuseOmniAd.this;
                AdController.AdState adState = mobileFuseOmniAd.adController.adState;
                if (adState == AdController.AdState.NOT_FILLED) {
                    Listener listener2 = mobileFuseOmniAd.adListener;
                    if (listener2 != null) {
                        listener2.onAdNotFilled();
                        return;
                    }
                    return;
                }
                if (adState == AdController.AdState.RENDERED) {
                    Listener listener3 = mobileFuseOmniAd.adListener;
                    if (listener3 != null) {
                        listener3.onAdError(adError2);
                    }
                    MobileFuseOmniAd.this.closeAd();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdExpired(float f10) throws Throwable {
                MobileFuseOmniAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdExpiryAction(f10, MobileFuseOmniAd.this.adInstanceInfo));
                MobileFuseOmniAd mobileFuseOmniAd = MobileFuseOmniAd.this;
                AdController adControllerNewInstance = mobileFuseOmniAd.adController.newInstance(mobileFuseOmniAd.adControllerListener);
                try {
                    MobileFuseOmniAd.this.adController.destroy();
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
                MobileFuseOmniAd mobileFuseOmniAd2 = MobileFuseOmniAd.this;
                mobileFuseOmniAd2.adController = adControllerNewInstance;
                Listener listener = mobileFuseOmniAd2.adListener;
                if (listener != null) {
                    listener.onAdExpired();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdLoaded() throws Throwable {
                MobileFuseOmniAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_LOADED, MobileFuseOmniAd.this.adInstanceInfo));
                Listener listener = MobileFuseOmniAd.this.adListener;
                if (listener != null) {
                    listener.onAdLoaded();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdNotFilled(int i10) throws Throwable {
                MobileFuseOmniAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_NOT_FILLED, MobileFuseOmniAd.this.adInstanceInfo));
                Listener listener = MobileFuseOmniAd.this.adListener;
                if (listener != null) {
                    listener.onAdNotFilled();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdRendered() throws Throwable {
                MobileFuseOmniAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_RENDERED, MobileFuseOmniAd.this.adInstanceInfo));
                Listener listener = MobileFuseOmniAd.this.adListener;
                if (listener != null) {
                    listener.onAdRendered();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onFullscreenChanged(boolean z10) {
                if (z10) {
                    MobileFuseOmniAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_EXPANDED, MobileFuseOmniAd.this.adInstanceInfo));
                    MobileFuseOmniAd.this.adState = AdState.FULL_SCREEN;
                } else {
                    MobileFuseOmniAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_COLLAPSED, MobileFuseOmniAd.this.adInstanceInfo));
                    MobileFuseOmniAd.this.adState = AdState.THUMBNAIL;
                }
                MobileFuseOmniAd mobileFuseOmniAd = MobileFuseOmniAd.this;
                Listener listener = mobileFuseOmniAd.adListener;
                if (listener != null) {
                    listener.onStateChange(mobileFuseOmniAd.adState);
                }
            }
        };
    }

    private void detectTestModeFromPlacementId() throws Throwable {
        String str = this.placementId;
        if (str == null) {
            return;
        }
        PlacementUtil.detectTestMode(str, this.observableConfig, new Callback() { // from class: com.mobilefuse.sdk.a0
            @Override // com.mobilefuse.sdk.internal.Callback
            public final void call(Object obj) {
                this.f53362a.placementId = (String) obj;
            }
        });
    }

    public static /* synthetic */ Unit f(MobileFuseOmniAd mobileFuseOmniAd) {
        mobileFuseOmniAd.loadAdInternal();
        return Unit.f93236a;
    }

    public static /* synthetic */ void h(MobileFuseOmniAd mobileFuseOmniAd, AdError adError, ObservableConfig observableConfig) {
        mobileFuseOmniAd.getClass();
        try {
            MobileFuse.logDebug("Ad Error: " + adError);
            Listener listener = mobileFuseOmniAd.adListener;
            if (listener != null) {
                listener.onAdError(adError);
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(mobileFuseOmniAd, th2);
        }
    }

    private void loadAdFromBiddingTokenInternal(String str) {
        try {
            if (this.adController.isDestroyed()) {
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
            if (this.adController.isDestroyed()) {
                return;
            }
            this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceLoadAdAction(this.adInstanceInfo));
            this.adController.loadAd();
        } catch (Throwable th2) {
            StabilityHelper.logAdErrorException(this, th2, this.observableConfig, AdError.AD_LOAD_ERROR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenderStateInternal(@NonNull AdState adState) {
        try {
            if (isRendering()) {
                this.observableConfig.setValue(ObservableConfigKey.FULLSCREEN, Boolean.valueOf(adState == AdState.FULL_SCREEN));
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAdInternal(@NonNull Position position) {
        try {
            this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createShowAdAction(isLoaded(), this.adInstanceInfo));
            if (!isLoaded()) {
                MobileFuse.logError("Omni Ad failed to show because there is no ad loaded. Ensure that you call loadAd() and check that an ad is loaded before calling showAd().");
                return;
            }
            if (applyPosition(position)) {
                updateObservableConfigPosition(position);
            }
            this.adController.showFullscreenAd();
            startRenderingActivityOnDestroyChecking();
        } catch (Throwable th2) {
            StabilityHelper.logAdRenderingException(this, th2, this.observableConfig);
        }
    }

    private void startRenderingActivityOnDestroyChecking() throws Throwable {
        AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver = new AppLifecycleHelper.ActivityLifecycleObserver() { // from class: com.mobilefuse.sdk.MobileFuseOmniAd.1
            @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
            public void onActivityDestroyed(@NonNull Activity activity) {
                MobileFuseOmniAd mobileFuseOmniAd = MobileFuseOmniAd.this;
                if (activity != mobileFuseOmniAd.adController.renderingActivity) {
                    return;
                }
                mobileFuseOmniAd.stopRenderingActivityOnDestroyChecking();
                if (!MobileFuseOmniAd.this.adController.isDestroyed() && MobileFuseOmniAd.this.adController.isAdRendering()) {
                    MobileFuseOmniAd.this.closeAd();
                }
            }
        };
        this.renderingActivityOnDestroyListener = activityLifecycleObserver;
        AppLifecycleHelper.addActivityLifecycleObserver(activityLifecycleObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopRenderingActivityOnDestroyChecking() {
        this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.f0
            @Override // java.lang.Runnable
            public final void run() {
                MobileFuseOmniAd.c(this.f53371b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateObservableConfigPosition(@NonNull Position position) {
        try {
            if (this.position != position) {
                return;
            }
            this.observableConfig.setValue(ObservableConfigKey.POSITION, Integer.valueOf(position.getPositionAnchor()));
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

    public void closeAd() {
        try {
            this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f53363b.closeAdInternal();
                }
            });
            stopRenderingActivityOnDestroyChecking();
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

    @NonNull
    public Position getPosition() {
        return this.position;
    }

    @NonNull
    public AdState getRenderState() {
        return this.adState;
    }

    @Override // com.mobilefuse.sdk.WinningBidInfoSource
    @Nullable
    public WinningBidInfo getWinningBidInfo() {
        if (this.adController.isDestroyed()) {
            return null;
        }
        return this.adController.getWinningBidInfo();
    }

    void init() throws Throwable {
        this.adController = createAdController(this.context, this.placementId, this.adInstanceInfo, 200, 112, this.observableConfig, this.adControllerListener);
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

    public boolean isRendering() {
        if (this.adController.isDestroyed()) {
            return false;
        }
        return this.adController.isAdRendering();
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
        MobileFuseServices.requireAllServices(new Function0() { // from class: com.mobilefuse.sdk.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MobileFuseOmniAd.f(this.f53378b);
            }
        });
    }

    public void loadAdFromBiddingToken(final String str) {
        MobileFuseServices.requireAllServices(new Function0() { // from class: com.mobilefuse.sdk.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MobileFuseOmniAd.a(this.f53368b, str);
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

    public void setPosition(@NonNull final Position position) {
        try {
            if (applyPosition(position)) {
                this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53365b.updateObservableConfigPosition(position);
                    }
                });
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public void setRenderState(@NonNull final AdState adState) {
        try {
            this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f53380b.setRenderStateInternal(adState);
                }
            });
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
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
        showAd(this.position);
    }

    MobileFuseOmniAd(@NonNull Context context, @NonNull String str, boolean z10) {
        this.handler = Utils.getHandler();
        AdController.AdType adType = AdController.AdType.OMNI;
        this.adType = adType;
        this.position = Position.BOTTOM_RIGHT;
        this.adState = AdState.THUMBNAIL;
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
            observableConfig.setValue(ObservableConfigKey.DEFAULT_FORCE_SKIP_SECONDS, Float.valueOf(0.0f));
            adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceCreatedAction(adInstanceInfo));
            observableConfig.setValue(ObservableConfigKey.AD_INSTANCE_INFO, adInstanceInfo);
            observableConfig.setValue(ObservableConfigKey.POSITION, Integer.valueOf(this.position.getPositionAnchor()));
            mutableAdController.init();
            observableConfig.setValue(ObservableConfigKey.AD_ERROR_CALLBACK, new AdErrorCallback() { // from class: com.mobilefuse.sdk.e0
                @Override // com.mobilefuse.sdk.utils.AdErrorCallback
                public final void onError(AdError adError, ObservableConfig observableConfig2) {
                    MobileFuseOmniAd.h(this.f53370a, adError, observableConfig2);
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

    public void showAd(@NonNull final Position position) {
        try {
            this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.g0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f53375b.showAdInternal(position);
                }
            });
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }
}
