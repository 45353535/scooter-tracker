package com.mobilefuse.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdmCacheMonitor;
import com.mobilefuse.sdk.component.AdmParser;
import com.mobilefuse.sdk.config.Apply_BidResponse_to_ObservableConfigKt;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.internal.RtbLossReason;
import com.mobilefuse.sdk.internal.repository.AdLoadingConfig;
import com.mobilefuse.sdk.internal.repository.AdRepository;
import com.mobilefuse.sdk.internal.repository.BiddingAdRepository;
import com.mobilefuse.sdk.internal.repository.MfxAdRepository;
import com.mobilefuse.sdk.internal.repository.ParsedAdMarkupResponse;
import com.mobilefuse.sdk.mfx.BasicAdParser;
import com.mobilefuse.sdk.mfx.BidLossService;
import com.mobilefuse.sdk.mfx.MfxRequestAdKt;
import com.mobilefuse.sdk.mraid.MraidAdRenderer;
import com.mobilefuse.sdk.network.client.HttpClientKt;
import com.mobilefuse.sdk.network.model.AdmCreativeFormat;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.network.model.MfxBidResponseToWinningBidInfoKt;
import com.mobilefuse.sdk.privacy.PrivacyCenter;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.telemetry.Telemetry;
import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetryActionSdkEvents;
import com.mobilefuse.sdk.telemetry.TelemetryAgent;
import com.mobilefuse.sdk.telemetry.TelemetryManager;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionFactory;
import com.mobilefuse.sdk.telemetry.TelemetrySdkParamType;
import com.mobilefuse.sdk.telemetry.metricslogging.MetricRecordName;
import com.mobilefuse.sdk.vast.VastAdRenderer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;

/* JADX INFO: loaded from: classes10.dex */
public class AdController {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int adHeight;

    @NonNull
    private final AdInstanceInfo adInstanceInfo;
    AdListener adListener;
    protected BaseAdRenderer adRenderer;
    protected AdRendererConfig adRendererConfig;
    AdRepository<ParsedAdMarkupResponse> adRepository;

    @NonNull
    private final AdType adType;
    private int adWidth;

    @Nullable
    protected MfxBidResponse bidResponse;

    @NonNull
    protected final Context context;
    private FullscreenAdBridge fullscreenAdBridge;
    private boolean lockedSessionTestMode;
    private ObservableConfig observableConfig;
    private String placementId;

    @Nullable
    protected Activity renderingActivity;

    @NonNull
    private final TelemetryAgent telemetryAgent;

    @Nullable
    protected WinningBidInfo winningBidInfo;
    private Handler handler = new Handler(Looper.getMainLooper());
    private boolean hasAdRendered = false;
    protected int adBackgroundColor = -1;
    private boolean lossUrlHasBeenCalled = false;
    protected AdState adState = AdState.IDLE;
    private AdmCacheMonitor admCacheMonitor = new AdmCacheMonitor(this, getRtbCacheMonitorListener());

    public interface AdListener {
        void onAdClicked(String str) throws Throwable;

        void onAdClosed() throws Throwable;

        void onAdControllerUpdated(AdController adController) throws Throwable;

        void onAdError(AdError adError) throws Throwable;

        void onAdExpired(float f10) throws Throwable;

        void onAdLoaded() throws Throwable;

        void onAdNotFilled(int i10) throws Throwable;

        void onAdRendered() throws Throwable;

        void onFullscreenChanged(boolean z10) throws Throwable;
    }

    enum AdState {
        IDLE,
        LOADING,
        LOADED,
        NOT_FILLED,
        RENDERED,
        CLOSED,
        RTB_EXPIRED,
        DESTROYED
    }

    public enum AdType {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        OMNI("omni"),
        REWARDED("rewarded");

        private String value;

        AdType(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public interface FullscreenAdBridge {
        void onAdClosed();
    }

    public AdController(@NonNull Context context, String str, @NonNull AdType adType, @NonNull AdInstanceInfo adInstanceInfo, int i10, int i11, ObservableConfig observableConfig, AdListener adListener) throws Throwable {
        this.context = context;
        this.adWidth = i10;
        this.adHeight = i11;
        this.placementId = str;
        this.adInstanceInfo = adInstanceInfo;
        this.telemetryAgent = adInstanceInfo.getTelemetryAgent();
        this.observableConfig = observableConfig;
        this.adListener = adListener;
        this.adType = adType;
    }

    public static /* synthetic */ Unit a(AdController adController, BaseError baseError) {
        adController.getClass();
        adController.updateState(AdState.NOT_FILLED);
        AdListener adListener = adController.adListener;
        if (adListener != null) {
            try {
                adListener.onAdNotFilled(1);
            } catch (Throwable th2) {
                StabilityHelper.logException(adController, th2);
            }
        }
        return Unit.f93236a;
    }

    private void applyCurrentBackgroundColor() throws Throwable {
        BaseAdRenderer baseAdRenderer;
        int i10 = this.adBackgroundColor;
        if (i10 == -1 || (baseAdRenderer = this.adRenderer) == null) {
            return;
        }
        baseAdRenderer.setAdBackgroundColor(i10);
    }

    public static /* synthetic */ AdmParser b(AdmMediaType admMediaType) {
        return new BasicAdParser();
    }

    public static /* synthetic */ Unit c(AdController adController, ParsedAdMarkupResponse parsedAdMarkupResponse) {
        adController.getClass();
        try {
        } catch (Throwable th2) {
            StabilityHelper.logAdErrorException(adController, th2, adController.observableConfig, AdError.AD_LOAD_ERROR);
        }
        if (adController.adListener == null) {
            return Unit.f93236a;
        }
        adController.onAdRepositoryResponse(parsedAdMarkupResponse);
        return Unit.f93236a;
    }

    private void cacheAdAssets() throws Throwable {
        createAdRenderer();
        BaseAdRenderer baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            baseAdRenderer.preloadAd(getAdm());
            return;
        }
        updateState(AdState.NOT_FILLED);
        AdListener adListener = this.adListener;
        if (adListener != null) {
            adListener.onAdNotFilled(2);
        }
    }

    private void createAdRenderer() throws Throwable {
        if (isDestroyed() || this.bidResponse == null) {
            return;
        }
        AdRendererListener adRendererListener = new AdRendererListener() { // from class: com.mobilefuse.sdk.AdController.1
            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdClicked(String str) {
                try {
                    AdController.this.onAdLifecycleEvent(BaseAdLifecycleEvent.AD_CLICKED);
                    AdController.this.adListener.onAdClicked(str);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdClosed() {
                try {
                    AdService.disposeFullscreenAdLock(AdController.this);
                    SensorService.updateSensors(AdController.this.context);
                    if (AdController.this.fullscreenAdBridge != null) {
                        AdController.this.fullscreenAdBridge.onAdClosed();
                        AdController.this.fullscreenAdBridge = null;
                    }
                    AdController adController = AdController.this;
                    adController.renderingActivity = null;
                    adController.updateState(AdState.CLOSED);
                    AdController.this.adListener.onAdClosed();
                } catch (Throwable th2) {
                    StabilityHelper.logAdRenderingException(this, th2, AdController.this.observableConfig);
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdImpression() throws Throwable {
                AdController adController = AdController.this;
                if (adController.adListener != null) {
                    Telemetry.reportAdMetric(adController.adInstanceInfo.createTelemetryAdInfo(AdController.this.observableConfig), MetricRecordName.ON_AD_RENDERED);
                    AdController.this.adListener.onAdRendered();
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdRuntimeError(RtbLossReason rtbLossReason) {
                BaseAdRenderer baseAdRenderer;
                if (AdController.this.isDestroyed()) {
                    return;
                }
                try {
                    AdController.this.sendBidLossReason(rtbLossReason);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
                boolean z10 = false;
                try {
                    SensorService.updateSensors(AdController.this.context);
                    AdController.this.onAdLifecycleEvent(BaseAdLifecycleEvent.AD_RUNTIME_ERROR);
                    if (AdController.this.isAdLoaded() || AdController.this.isAdLoading()) {
                        AdController.this.updateState(AdState.NOT_FILLED);
                    }
                    AdController.this.adListener.onAdError(AdError.AD_RUNTIME_ERROR);
                    z10 = true;
                    if (AdController.this.admCacheMonitor != null) {
                        AdController.this.admCacheMonitor.destroy();
                    }
                    if (AdController.this.fullscreenAdBridge == null || (baseAdRenderer = AdController.this.adRenderer) == null) {
                        return;
                    }
                    baseAdRenderer.requestAdClose();
                } catch (Throwable th3) {
                    if (z10) {
                        StabilityHelper.logException(this, th3);
                    } else {
                        StabilityHelper.logAdRenderingException(this, th3, AdController.this.observableConfig);
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onFullscreenChanged(boolean z10) {
                try {
                    HashMap map = new HashMap();
                    map.put("fullscreen", z10 + "");
                    AdController.this.onAdLifecycleEvent(BaseAdLifecycleEvent.AD_FULLSCREEN_CHANGED, map);
                    AdListener adListener = AdController.this.adListener;
                    if (adListener != null) {
                        adListener.onFullscreenChanged(z10);
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logAdRenderingException(this, th2, AdController.this.observableConfig);
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onPreloadStatusChange(boolean z10) {
                try {
                    if (z10) {
                        AdController.this.onAllAdAssetsPreloaded();
                        return;
                    }
                    AdListener adListener = AdController.this.adListener;
                    if (adListener != null) {
                        adListener.onAdNotFilled(2);
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logAdErrorException(this, th2, AdController.this.observableConfig, AdError.AD_LOAD_ERROR);
                }
            }
        };
        AdRendererConfig.Builder adInstanceId = new AdRendererConfig.Builder().setSdkName(getSdkNameForAdRequest()).setSdkVersion(MobileFuse.getSdkVersion()).setAdvertisingId(MobileFuseSettings.getAdvertisingId()).setLimitTrackingEnabled(PrivacyCenter.isSdkLimitedToSendUserDataJavaLegacy()).setSubjectToCoppa(MobileFuse.getPrivacyPreferences().isSubjectToCoppa()).setTestMode(this.lockedSessionTestMode).setAdWidth(this.adWidth).setAdHeight(this.adHeight).setFullscreenAd(this.adType != AdType.BANNER).setObservableConfig(this.observableConfig).setTransparentBackground(isTransparentBackground()).setAdInstanceId(this.adInstanceInfo.instanceId);
        if (this.adType == AdType.OMNI) {
            ExtendedAdType omniExtendedAdType = getOmniExtendedAdType(this.bidResponse.getType(), this.bidResponse.getCreativeFormat());
            if (omniExtendedAdType == null) {
                return;
            } else {
                adInstanceId.setExtendedAdType(omniExtendedAdType);
            }
        } else if (this.bidResponse.getCreativeFormat() == AdmCreativeFormat.TRANSPARENT_INTERSTITIAL) {
            adInstanceId.setExtendedAdType(MraidAdRenderer.MraidExtendedAdType.INTERSTITIAL_TRANSPARENT);
        }
        this.adRendererConfig = adInstanceId.build();
        Apply_BidResponse_to_ObservableConfigKt.applyConfigFromBidResponse(this.observableConfig, this.bidResponse);
        BaseAdRenderer adRenderer = AdRendererFactory.getAdRenderer(this.context, this.bidResponse.getType(), this.adRendererConfig, adRendererListener);
        this.adRenderer = adRenderer;
        if (adRenderer == null) {
            MobileFuse.logDebug("Can't create ad renderer by renderer factory");
            return;
        }
        ArrayList arrayList = new ArrayList();
        String adRendererType = TelemetrySdkActionFactory.getAdRendererType(this.adRenderer.getClass().getName());
        arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.AD_RENDERER, adRendererType, true));
        this.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdInstanceAction(TelemetryActionSdkEvents.AD_INSTANCE_RENDERER_CREATED.updateExtraMessageField(adRendererType), this.adInstanceInfo, arrayList));
        this.adInstanceInfo.setRenderType(adRendererType);
        this.adRenderer.setAdLifecycleEventListener(new AdLifecycleEventListener() { // from class: com.mobilefuse.sdk.a
            @Override // com.mobilefuse.sdk.AdLifecycleEventListener
            public final void onAdLifecycleEvent(AdLifecycleEvent adLifecycleEvent, ExtendedAdType extendedAdType, Map map) throws Throwable {
                this.f53361a.onAdLifecycleEvent(adLifecycleEvent, extendedAdType, map);
            }
        });
        this.adRenderer.setAdBackgroundColor(this.adBackgroundColor);
        Activity activity = this.renderingActivity;
        if (activity != null) {
            this.adRenderer.setRenderingActivity(activity);
        }
    }

    public static /* synthetic */ AdmParser d(AdmMediaType admMediaType) {
        return new BasicAdParser();
    }

    private void destroyAdRenderer() throws Throwable {
        BaseAdRenderer baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            baseAdRenderer.destroy();
            this.adRenderer = null;
        }
    }

    public static /* synthetic */ Unit e(AdController adController, ParsedAdMarkupResponse parsedAdMarkupResponse) {
        adController.getClass();
        try {
        } catch (Throwable th2) {
            StabilityHelper.logAdErrorException(adController, th2, adController.observableConfig, AdError.AD_LOAD_ERROR);
        }
        if (adController.adListener == null) {
            return Unit.f93236a;
        }
        adController.onAdRepositoryResponse(parsedAdMarkupResponse);
        return Unit.f93236a;
    }

    public static /* synthetic */ Unit f(AdController adController, BaseError baseError) {
        adController.getClass();
        adController.updateState(AdState.NOT_FILLED);
        AdListener adListener = adController.adListener;
        if (adListener != null) {
            try {
                adListener.onAdNotFilled(1);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return Unit.f93236a;
    }

    @Nullable
    private ExtendedAdType getOmniExtendedAdType(@NonNull AdmMediaType admMediaType, @Nullable AdmCreativeFormat admCreativeFormat) {
        if (admMediaType == AdmMediaType.VIDEO) {
            return VastAdRenderer.VastExtendedAdType.THUMBNAIL;
        }
        if (admMediaType != AdmMediaType.BANNER) {
            MobileFuse.logDebug("Media type " + admMediaType + " is not supported for Omni Ad");
            return null;
        }
        if (admCreativeFormat == AdmCreativeFormat.OMNI_BREAKOUT) {
            return MraidAdRenderer.MraidExtendedAdType.SPLASH;
        }
        MobileFuse.logDebug("Can't create Ad Renderer for media type " + this.adType + " and creative format: " + this.bidResponse.getCreativeFormat());
        return null;
    }

    private AdmCacheMonitor.Listener getRtbCacheMonitorListener() {
        return new AdmCacheMonitor.Listener() { // from class: com.mobilefuse.sdk.AdController.2
            @Override // com.mobilefuse.sdk.AdmCacheMonitor.Listener
            public void onAdExpired(float f10) {
                AdController.this.sendBidLossReason(RtbLossReason.IMPRESSION_OPPORTUNITY_EXPIRED);
                try {
                    AdListener adListener = AdController.this.adListener;
                    if (adListener != null) {
                        adListener.onAdExpired(f10);
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.sdk.AdmCacheMonitor.Listener
            public void onAdmCacheExpired() {
                AdController.this.sendBidLossReason(RtbLossReason.IMPRESSION_OPPORTUNITY_EXPIRED);
                try {
                    AdController.this.updateState(AdState.RTB_EXPIRED);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.sdk.AdmCacheMonitor.Listener
            public void onNewAdFullyLoaded(AdController adController) {
                AdController.this.sendBidLossReason(RtbLossReason.IMPRESSION_OPPORTUNITY_EXPIRED);
                try {
                    AdController.this.adListener.onAdControllerUpdated(adController);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.sdk.AdmCacheMonitor.Listener
            public void onNewAdLoadFailed() {
            }

            @Override // com.mobilefuse.sdk.AdmCacheMonitor.Listener
            public void onNewAdRequested() {
            }
        };
    }

    private boolean isIncorrectMediaFormat(@Nullable String str) {
        return false;
    }

    private void onAdRepositoryResponse(@NonNull ParsedAdMarkupResponse parsedAdMarkupResponse) throws Throwable {
        onAdLifecycleEvent(BaseAdLifecycleEvent.AD_DATA_LOAD_COMPLETED, new HashMap());
        this.bidResponse = parsedAdMarkupResponse.getBidResponse();
        updateTestMode();
        this.winningBidInfo = MfxBidResponseToWinningBidInfoKt.getWinningBidInfo(this.bidResponse);
        MobileFuse.logDebug("Winning bid received with CRID: " + this.winningBidInfo.getCreativeId());
        this.admCacheMonitor.startMonitor(this.bidResponse.getExpires());
        cacheAdAssets();
        verifyTelemetryLogs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAllAdAssetsPreloaded() throws Throwable {
        updateState(AdState.LOADED);
        Telemetry.reportAdMetric(this.adInstanceInfo.createTelemetryAdInfo(), MetricRecordName.ON_AD_READY);
        AdListener adListener = this.adListener;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendBidLossReason(RtbLossReason rtbLossReason) {
        MfxBidResponse mfxBidResponse = this.bidResponse;
        if (mfxBidResponse == null || this.lossUrlHasBeenCalled || this.hasAdRendered) {
            return;
        }
        this.lossUrlHasBeenCalled = true;
        try {
            String lossUrl = mfxBidResponse.getLossUrl();
            if (lossUrl != null && !lossUrl.isEmpty()) {
                BidLossService.sendBidLoss(lossUrl, (float) this.bidResponse.getCpm(), rtbLossReason);
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private void updateTestMode() {
        try {
            MfxBidResponse mfxBidResponse = this.bidResponse;
            if (mfxBidResponse == null || mfxBidResponse.getForceTestMode() == null) {
                return;
            }
            MobileFuseSettings.setTestModeOverrideFromServer(this.bidResponse.getForceTestMode().booleanValue());
            lockSessionTestMode();
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private void verifyTelemetryLogs() {
        MfxBidResponse mfxBidResponse = this.bidResponse;
        if (mfxBidResponse == null || mfxBidResponse.getForceLogging() == null || !this.bidResponse.getForceLogging().booleanValue()) {
            return;
        }
        TelemetryManager.enableStructuredLogs();
    }

    public boolean canLoadAd() {
        AdState adState = this.adState;
        return adState == AdState.IDLE || adState == AdState.CLOSED || adState == AdState.NOT_FILLED;
    }

    public void closeFullscreenAd() throws Throwable {
        BaseAdRenderer baseAdRenderer;
        if (isAdRendering() && (baseAdRenderer = this.adRenderer) != null) {
            baseAdRenderer.requestAdClose();
        }
    }

    public void destroy() throws Throwable {
        verifyLossReason();
        if (isDestroyed()) {
            return;
        }
        AdmCacheMonitor admCacheMonitor = this.admCacheMonitor;
        if (admCacheMonitor != null) {
            admCacheMonitor.destroy();
            this.admCacheMonitor = null;
        }
        ObservableConfig observableConfig = this.observableConfig;
        if (observableConfig != null) {
            observableConfig.clearValue(ObservableConfigKey.ALLOW_CLICKTHROUGH_WITHOUT_TAP);
        }
        this.observableConfig = null;
        destroyAdRenderer();
        this.adRendererConfig = null;
        this.adRepository = null;
        updateState(AdState.DESTROYED);
        this.adListener = null;
        this.renderingActivity = null;
    }

    public int getAdBackgroundColor() {
        return this.adBackgroundColor;
    }

    @NonNull
    public AdInstanceInfo getAdInstanceInfo() {
        return this.adInstanceInfo;
    }

    public BaseAdRenderer getAdRenderer() {
        return this.adRenderer;
    }

    @NonNull
    public AdType getAdType() {
        return this.adType;
    }

    String getAdm() throws Throwable {
        MfxBidResponse mfxBidResponse = this.bidResponse;
        if (mfxBidResponse == null) {
            return null;
        }
        return mfxBidResponse.getAdm();
    }

    public Context getContext() {
        return this.context;
    }

    public ObservableConfig getObservableConfig() {
        return this.observableConfig;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public Activity getRenderingActivity() {
        return this.renderingActivity;
    }

    public String getSdkNameForAdRequest() {
        return "MobileFuse Ads";
    }

    @NonNull
    public TelemetryAgent getTelemetryAgent() {
        return this.telemetryAgent;
    }

    @Nullable
    public WinningBidInfo getWinningBidInfo() {
        return this.winningBidInfo;
    }

    public boolean isAdLoaded() {
        return this.adState == AdState.LOADED;
    }

    public boolean isAdLoading() {
        return this.adState == AdState.LOADING;
    }

    public boolean isAdRendering() {
        return this.adState == AdState.RENDERED;
    }

    public boolean isAdVisibleOnScreen() {
        BaseAdRenderer baseAdRenderer = this.adRenderer;
        if (baseAdRenderer == null) {
            return false;
        }
        return baseAdRenderer.isVisibleOnScreen();
    }

    boolean isDestroyed() {
        return this.adState == AdState.DESTROYED;
    }

    public boolean isLockedSessionTestMode() {
        return this.lockedSessionTestMode;
    }

    boolean isTransparentBackground() throws Throwable {
        AdmCreativeFormat creativeFormat;
        MfxBidResponse mfxBidResponse = this.bidResponse;
        if (mfxBidResponse == null || (creativeFormat = mfxBidResponse.getCreativeFormat()) == null) {
            return false;
        }
        return creativeFormat.getIsTransparent();
    }

    public void loadAd() throws Throwable {
        if (this.adState == AdState.DESTROYED) {
            return;
        }
        if (canLoadAd()) {
            lockSessionTestMode();
            onAdLifecycleEvent(BaseAdLifecycleEvent.AD_DATA_LOAD_STARTED, new HashMap());
            updateState(AdState.LOADING);
            Telemetry.reportAdMetric(this.adInstanceInfo.createTelemetryAdInfo(), MetricRecordName.ON_AD_LOADED);
            MfxAdRepository mfxAdRepository = new MfxAdRepository(this.telemetryAgent, new AdLoadingConfig(AdLoadingConfig.INSTANCE.nextConfigUid(), this.observableConfig, this.adWidth, this.adHeight, this.lockedSessionTestMode, this.adType.name(), this.placementId, this.adInstanceInfo.getInstanceId()), new Function1() { // from class: com.mobilefuse.sdk.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AdController.b((AdmMediaType) obj);
                }
            }, new Function5() { // from class: com.mobilefuse.sdk.f
                @Override // kotlin.jvm.functions.Function5
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    return MfxRequestAdKt.createMfxBidRequest((String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Boolean) obj4).booleanValue(), (Float) obj5);
                }
            }, HttpClientKt.getDefaultHttpClient());
            this.adRepository = mfxAdRepository;
            mfxAdRepository.loadAd(new Function1() { // from class: com.mobilefuse.sdk.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AdController.a(this.f53374b, (BaseError) obj);
                }
            }, new Function1() { // from class: com.mobilefuse.sdk.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AdController.c(this.f53377b, (ParsedAdMarkupResponse) obj);
                }
            });
            return;
        }
        MobileFuse.logDebug("Ad can't be loaded. Current state is: " + this.adState);
        AdListener adListener = this.adListener;
        if (adListener != null) {
            adListener.onAdError(AdError.AD_ALREADY_LOADED);
        }
    }

    public void loadAdFromBiddingToken(@Nullable String str) throws Throwable {
        if (isDestroyed()) {
            return;
        }
        MobileFuseServices.requireAllServices();
        if (!canLoadAd()) {
            MobileFuse.logDebug("Ad can't be loaded. Current state is: " + this.adState);
            AdListener adListener = this.adListener;
            if (adListener != null) {
                adListener.onAdError(AdError.AD_ALREADY_LOADED);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AdListener adListener2 = this.adListener;
            if (adListener2 != null) {
                adListener2.onAdNotFilled(2);
                return;
            }
            return;
        }
        lockSessionTestMode();
        onAdLifecycleEvent(BaseAdLifecycleEvent.AD_DATA_LOAD_STARTED, new HashMap());
        updateState(AdState.LOADING);
        Telemetry.reportAdMetric(this.adInstanceInfo.createTelemetryAdInfo(), MetricRecordName.ON_AD_LOADED);
        BiddingAdRepository biddingAdRepository = new BiddingAdRepository(str, this.telemetryAgent, new AdLoadingConfig(AdLoadingConfig.INSTANCE.nextConfigUid(), this.observableConfig, this.adWidth, this.adHeight, this.lockedSessionTestMode, this.adType.name(), this.placementId, this.adInstanceInfo.getInstanceId()), new Function1() { // from class: com.mobilefuse.sdk.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdController.d((AdmMediaType) obj);
            }
        });
        this.adRepository = biddingAdRepository;
        biddingAdRepository.loadAd(new Function1() { // from class: com.mobilefuse.sdk.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdController.f(this.f53364b, (BaseError) obj);
            }
        }, new Function1() { // from class: com.mobilefuse.sdk.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdController.e(this.f53367b, (ParsedAdMarkupResponse) obj);
            }
        });
    }

    void lockSessionTestMode() throws Throwable {
        if (MobileFuseSettings.isTestModeOverrideFromServer()) {
            this.lockedSessionTestMode = true;
            return;
        }
        if (MobileFuseSettings.isTestMode()) {
            this.lockedSessionTestMode = true;
            return;
        }
        ObservableConfig observableConfig = this.observableConfig;
        if (observableConfig == null) {
            this.lockedSessionTestMode = false;
        } else {
            this.lockedSessionTestMode = observableConfig.getBooleanValue(ObservableConfigKey.TEST_MODE);
        }
    }

    public AdController newInstance(AdListener adListener) throws Throwable {
        AdController adController = new AdController(this.context, this.placementId, this.adType, this.adInstanceInfo, this.adWidth, this.adHeight, this.observableConfig, adListener);
        adController.renderingActivity = this.renderingActivity;
        return adController;
    }

    public void onActivityDestroy() throws Throwable {
        BaseAdRenderer baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            baseAdRenderer.onActivityDestroy();
        }
    }

    public void onActivityPause() throws Throwable {
        BaseAdRenderer baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            baseAdRenderer.onActivityPause();
        }
    }

    public void onActivityResume() throws Throwable {
        BaseAdRenderer baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            baseAdRenderer.onActivityResume();
        }
    }

    public void onActivityStart() throws Throwable {
        BaseAdRenderer baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            baseAdRenderer.onActivityStart();
        }
    }

    public void onActivityStop() throws Throwable {
        BaseAdRenderer baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            baseAdRenderer.onActivityStop();
        }
    }

    protected void onAdLifecycleEvent(AdLifecycleEvent adLifecycleEvent) throws Throwable {
        onAdLifecycleEvent(adLifecycleEvent, null);
    }

    public void setAdBackgroundColor(int i10) throws Throwable {
        this.adBackgroundColor = i10;
        applyCurrentBackgroundColor();
    }

    public void setFullscreenAdBridge(FullscreenAdBridge fullscreenAdBridge) {
        this.fullscreenAdBridge = fullscreenAdBridge;
    }

    void setRenderingActivity(@NonNull Activity activity) throws Throwable {
        this.renderingActivity = activity;
        if (this.adRenderer != null) {
            AppLifecycleHelper.tryToRefreshFirstActivity(activity);
            this.adRenderer.setRenderingActivity(activity);
        }
    }

    public void showFullscreenAd() throws Throwable {
        AdType adType = this.adType;
        AdType adType2 = AdType.INTERSTITIAL;
        if (adType == adType2 || adType == AdType.REWARDED || adType == AdType.OMNI) {
            boolean z10 = adType == AdType.OMNI;
            Activity currentActivity = AppLifecycleHelper.getCurrentActivity();
            if (z10 && currentActivity == null) {
                AdListener adListener = this.adListener;
                if (adListener != null) {
                    adListener.onAdError(AdError.AD_RUNTIME_ERROR);
                    return;
                }
                return;
            }
            AdType adType3 = this.adType;
            if ((adType3 == adType2 || adType3 == AdType.REWARDED) && !AdService.acquireFullscreenAdLock(this)) {
                this.adListener.onAdError(AdError.AD_ALREADY_RENDERED);
                return;
            }
            if (!z10) {
                AdService.showFullscreenAd(this);
                return;
            }
            setRenderingActivity(currentActivity);
            this.admCacheMonitor.destroy();
            updateState(AdState.RENDERED);
            this.hasAdRendered = true;
            this.adRenderer.renderAd();
        }
    }

    public View showInlineAd() throws Throwable {
        if (isDestroyed()) {
            return null;
        }
        if (this.hasAdRendered) {
            AdListener adListener = this.adListener;
            if (adListener != null) {
                adListener.onAdError(AdError.AD_ALREADY_RENDERED);
            }
            return null;
        }
        this.admCacheMonitor.destroy();
        updateState(AdState.RENDERED);
        this.hasAdRendered = true;
        this.adRenderer.renderAd();
        return this.adRenderer.getAdView();
    }

    void updateState(AdState adState) {
        this.adState = adState;
    }

    public void verifyLossReason() {
        AdState adState = this.adState;
        if (adState == AdState.LOADED || adState == AdState.LOADING) {
            sendBidLossReason(RtbLossReason.AD_DESTROYED_BEFORE_SHOW_CALLED);
        }
    }

    protected void onAdLifecycleEvent(AdLifecycleEvent adLifecycleEvent, Map<String, String> map) throws Throwable {
        BaseAdRenderer baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            onAdLifecycleEvent(adLifecycleEvent, baseAdRenderer.getExtendedAdType(), map);
        } else {
            onAdLifecycleEvent(adLifecycleEvent, BaseExtendedAdType.UNKNOWN, map);
        }
    }

    void onAdLifecycleEvent(AdLifecycleEvent adLifecycleEvent, ExtendedAdType extendedAdType, Map<String, String> map) throws Throwable {
        MobileFuse.logDebug("onAdLifecycleEvent [placementId: " + this.placementId + ", event: " + adLifecycleEvent + ", adType: " + this.adType.getValue() + ", extendedAdType: " + extendedAdType + C4240b4.j.f42674e);
    }
}
