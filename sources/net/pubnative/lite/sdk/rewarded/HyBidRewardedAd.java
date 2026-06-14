package net.pubnative.lite.sdk.rewarded;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.AdCache;
import net.pubnative.lite.sdk.CacheListener;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.HyBidError;
import net.pubnative.lite.sdk.HyBidErrorCode;
import net.pubnative.lite.sdk.VideoListener;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.analytics.ReportingEvent;
import net.pubnative.lite.sdk.api.OpenRTBApiClient;
import net.pubnative.lite.sdk.api.RequestManager;
import net.pubnative.lite.sdk.api.RewardedRequestManager;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdSize;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.models.OpenRTBAdRequestFactory;
import net.pubnative.lite.sdk.models.Protocol;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.network.e;
import net.pubnative.lite.sdk.prefs.SessionImpressionPrefs;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenter;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenterFactory;
import net.pubnative.lite.sdk.utils.AdEndCardManager;
import net.pubnative.lite.sdk.utils.AdRequestRegistry;
import net.pubnative.lite.sdk.utils.AdTracker;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.MarkupUtils;
import net.pubnative.lite.sdk.utils.SignalDataProcessor;
import net.pubnative.lite.sdk.utils.json.JsonOperations;
import net.pubnative.lite.sdk.vpaid.VideoAdCacheItem;
import net.pubnative.lite.sdk.vpaid.VideoAdProcessor;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import net.pubnative.lite.sdk.vpaid.vast.VastUrlUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class HyBidRewardedAd implements RequestManager.RequestListener, RewardedPresenter.Listener, VideoListener {
    private static final String TAG = "HyBidRewardedAd";
    private static final int TIME_TO_EXPIRE = 1800000;
    private Ad mAd;
    private AdTracker mAdTracker;
    private final String mAppToken;
    private final Context mContext;
    private String mCustomUrl;
    private long mInitialLoadTime;
    private long mInitialRenderTime;
    private boolean mIsDestroyed;
    private boolean mIsExchange;
    private final Listener mListener;
    private RequestManager mORTBRequestManager;
    private JSONObject mPlacementParams;
    private RewardedPresenter mPresenter;
    private boolean mReady;
    private RequestManager mRequestManager;
    private SignalDataProcessor mSignalDataProcessor;
    private VideoListener mVideoListener;
    private String mZoneId;

    public interface Listener {
        void onReward();

        void onRewardedClick();

        void onRewardedClosed();

        void onRewardedLoadFailed(Throwable th2);

        void onRewardedLoaded();

        void onRewardedOpened();
    }

    public HyBidRewardedAd(Activity activity, Listener listener) {
        this((Context) activity, "", listener);
    }

    private void addReportingKey(String str, Object obj) {
        JSONObject jSONObject = this.mPlacementParams;
        if (jSONObject != null) {
            if (obj instanceof Long) {
                JsonOperations.putJsonLong(jSONObject, str, ((Long) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                JsonOperations.putJsonValue(jSONObject, str, (Integer) obj);
            } else if (obj instanceof Double) {
                JsonOperations.putJsonValue(jSONObject, str, (Double) obj);
            } else {
                JsonOperations.putJsonString(jSONObject, str, obj.toString());
            }
        }
    }

    private void cleanup() {
        this.mReady = false;
        this.mPlacementParams = new JSONObject();
        this.mInitialLoadTime = -1L;
        this.mInitialRenderTime = -1L;
        RewardedPresenter rewardedPresenter = this.mPresenter;
        if (rewardedPresenter != null) {
            rewardedPresenter.destroy();
            this.mPresenter = null;
        }
        SignalDataProcessor signalDataProcessor = this.mSignalDataProcessor;
        if (signalDataProcessor != null) {
            signalDataProcessor.destroy();
            this.mSignalDataProcessor = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializeAdTracker() {
        if (this.mAd != null) {
            this.mAdTracker = new AdTracker(null, null, this.mAd.getBeacons(Ad.Beacon.SDK_EVENT), null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerAdRequest(String str, String str2, long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j10;
        JsonOperations.putJsonString(this.mPlacementParams, Reporting.Key.AD_REQUEST, str);
        JsonOperations.putJsonString(this.mPlacementParams, Reporting.Key.AD_RESPONSE, str2);
        JsonOperations.putJsonLong(this.mPlacementParams, Reporting.Key.RESPONSE_TIME, jCurrentTimeMillis);
        AdRequestRegistry.getInstance().setLastAdRequest(str, str2, jCurrentTimeMillis);
    }

    private void renderAd() {
        RewardedPresenter rewardedPresenterCreateRewardedPresenter = new RewardedPresenterFactory(this.mContext, this.mZoneId).createRewardedPresenter(this.mAd, this, this.mRequestManager.getIntegrationType());
        this.mPresenter = rewardedPresenterCreateRewardedPresenter;
        if (rewardedPresenterCreateRewardedPresenter == null) {
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.UNSUPPORTED_ASSET));
        } else {
            rewardedPresenterCreateRewardedPresenter.setVideoListener(this);
            this.mPresenter.load();
        }
    }

    private void sendLoadTracker(Integer num) {
        AdTracker adTracker = this.mAdTracker;
        if (adTracker != null) {
            adTracker.trackSdkEvent(1, num);
        }
    }

    public void destroy() {
        cleanup();
        this.mIsDestroyed = true;
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            requestManager.destroy();
            this.mRequestManager = null;
        }
        RequestManager requestManager2 = this.mORTBRequestManager;
        if (requestManager2 != null) {
            requestManager2.destroy();
            this.mORTBRequestManager = null;
        }
    }

    public Integer getBidPoints() {
        Ad ad2 = this.mAd;
        return Integer.valueOf(ad2 != null ? ad2.getECPM().intValue() : 0);
    }

    public String getCreativeId() {
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            return ad2.getCreativeId();
        }
        return null;
    }

    public String getImpressionId() {
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            return ad2.getImpressionId();
        }
        return null;
    }

    public JSONObject getPlacementParams() {
        JSONObject placementParams;
        JSONObject placementParams2;
        JSONObject jSONObject = new JSONObject();
        JsonOperations.mergeJsonObjects(jSONObject, this.mPlacementParams);
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null && (placementParams2 = requestManager.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams2);
        }
        RewardedPresenter rewardedPresenter = this.mPresenter;
        if (rewardedPresenter != null && (placementParams = rewardedPresenter.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams);
        }
        return jSONObject;
    }

    public boolean hasEndCard() {
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            return AdEndCardManager.isEndCardEnabled(ad2).booleanValue();
        }
        return false;
    }

    protected void invokeOnClick() {
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onRewardedClick();
        }
    }

    protected void invokeOnClosed() {
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onRewardedClosed();
        }
    }

    protected void invokeOnLoadFailed(Throwable th2) {
        long jCurrentTimeMillis = -1;
        if (this.mInitialLoadTime != -1) {
            jCurrentTimeMillis = System.currentTimeMillis() - this.mInitialLoadTime;
            JsonOperations.putJsonLong(this.mPlacementParams, Reporting.Key.TIME_TO_LOAD_FAILED, jCurrentTimeMillis);
        }
        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType(Reporting.EventType.LOAD_FAIL);
            reportingEvent.setAdFormat("rewarded");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mRequestManager.getIntegrationType()));
            reportingEvent.setCustomInteger(Reporting.Key.TIME_TO_LOAD, jCurrentTimeMillis);
            Ad ad2 = this.mAd;
            if (ad2 != null) {
                reportingEvent.setImpId(ad2.getSessionId());
                reportingEvent.setCampaignId(this.mAd.getCampaignId());
                reportingEvent.setConfigId(this.mAd.getConfigId());
            }
            reportingEvent.mergeJSONObject(getPlacementParams());
            HyBid.getReportingController().reportEvent(reportingEvent);
        }
        if (th2 instanceof HyBidError) {
            HyBidError hyBidError = (HyBidError) th2;
            if (hyBidError.getErrorCode() == HyBidErrorCode.NO_FILL) {
                Logger.w(TAG, th2.getMessage());
            } else {
                Logger.e(TAG, th2.getMessage());
            }
            sendLoadTracker(Integer.valueOf(hyBidError.getErrorCode().getCode()));
        } else {
            sendLoadTracker(Integer.valueOf(HyBidErrorCode.UNKNOWN_ERROR.getCode()));
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onRewardedLoadFailed(th2);
        }
    }

    protected void invokeOnLoadFinished() {
        long jCurrentTimeMillis = -1;
        if (this.mInitialLoadTime != -1) {
            jCurrentTimeMillis = System.currentTimeMillis() - this.mInitialLoadTime;
            JsonOperations.putJsonLong(this.mPlacementParams, Reporting.Key.TIME_TO_LOAD, jCurrentTimeMillis);
        }
        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("load");
            reportingEvent.setAdFormat("rewarded");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mRequestManager.getIntegrationType()));
            reportingEvent.setCustomInteger(Reporting.Key.TIME_TO_LOAD, jCurrentTimeMillis);
            Ad ad2 = this.mAd;
            if (ad2 != null) {
                reportingEvent.setImpId(ad2.getSessionId());
                reportingEvent.setCampaignId(this.mAd.getCampaignId());
                reportingEvent.setConfigId(this.mAd.getConfigId());
            }
            reportingEvent.mergeJSONObject(getPlacementParams());
            HyBid.getReportingController().reportEvent(reportingEvent);
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onRewardedLoaded();
        }
    }

    protected void invokeOnOpened() {
        Context context = this.mContext;
        if (context != null) {
            new SessionImpressionPrefs(context).insert(this.mAd.getZoneId());
            Listener listener = this.mListener;
            if (listener != null) {
                listener.onRewardedOpened();
            }
        }
    }

    protected void invokeOnReward() {
        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("reward");
            reportingEvent.setAdFormat("rewarded");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mRequestManager.getIntegrationType()));
            reportingEvent.setHasEndCard(hasEndCard());
            reportingEvent.mergeJSONObject(this.mPlacementParams);
            Ad ad2 = this.mAd;
            if (ad2 != null) {
                reportingEvent.setImpId(ad2.getSessionId());
                reportingEvent.setCampaignId(this.mAd.getCampaignId());
                reportingEvent.setConfigId(this.mAd.getConfigId());
            }
            HyBid.getReportingController().reportEvent(reportingEvent);
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onReward();
        }
    }

    public boolean isAutoCacheOnLoad() {
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            return requestManager.isAutoCacheOnLoad();
        }
        return true;
    }

    public boolean isReady() {
        return this.mReady;
    }

    public void load() {
        addReportingKey("timestamp", String.valueOf(System.currentTimeMillis()));
        if (HyBid.getAppToken() != null) {
            addReportingKey("app_token", HyBid.getAppToken());
        }
        addReportingKey("ad_type", "rewarded");
        addReportingKey(Reporting.Key.AD_SIZE, this.mRequestManager.getAdSize().toString());
        addReportingKey("integration_type", IntegrationType.STANDALONE);
        if (!HyBid.isInitialized()) {
            this.mInitialLoadTime = System.currentTimeMillis();
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.NOT_INITIALISED));
            return;
        }
        if (TextUtils.isEmpty(this.mZoneId)) {
            this.mInitialLoadTime = System.currentTimeMillis();
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_ZONE_ID));
            return;
        }
        cleanup();
        this.mInitialLoadTime = System.currentTimeMillis();
        if (!TextUtils.isEmpty(this.mAppToken)) {
            this.mRequestManager.setAppToken(this.mAppToken);
        }
        this.mRequestManager.setZoneId(this.mZoneId);
        this.mRequestManager.setRequestListener(this);
        this.mIsExchange = false;
        this.mRequestManager.requestAd();
    }

    public void loadExchangeAd(String str) {
        addReportingKey("timestamp", String.valueOf(System.currentTimeMillis()));
        if (HyBid.getAppToken() != null) {
            addReportingKey("app_token", HyBid.getAppToken());
        }
        addReportingKey("ad_type", "rewarded");
        this.mORTBRequestManager.setAdSize(AdSize.SIZE_INTERSTITIAL);
        addReportingKey(Reporting.Key.AD_SIZE, this.mORTBRequestManager.getAdSize().toString());
        addReportingKey("integration_type", IntegrationType.STANDALONE);
        if (!HyBid.isInitialized()) {
            this.mInitialLoadTime = System.currentTimeMillis();
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.NOT_INITIALISED));
            return;
        }
        if (TextUtils.isEmpty(this.mZoneId)) {
            this.mInitialLoadTime = System.currentTimeMillis();
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_ZONE_ID));
            return;
        }
        cleanup();
        this.mInitialLoadTime = System.currentTimeMillis();
        if (!TextUtils.isEmpty(this.mAppToken)) {
            this.mORTBRequestManager.setAppToken(this.mAppToken);
        }
        if (!TextUtils.isEmpty(str)) {
            this.mORTBRequestManager.setAdFormat(str);
        }
        this.mORTBRequestManager.setZoneId(this.mZoneId);
        this.mORTBRequestManager.setRequestListener(this);
        this.mIsExchange = true;
        this.mORTBRequestManager.requestAd();
    }

    @Override // net.pubnative.lite.sdk.api.RequestManager.RequestListener
    public void onRequestFail(Throwable th2) {
        invokeOnLoadFailed(th2);
    }

    @Override // net.pubnative.lite.sdk.api.RequestManager.RequestListener
    public void onRequestSuccess(Ad ad2) {
        if (ad2 == null) {
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.NULL_AD));
            return;
        }
        this.mAd = ad2;
        initializeAdTracker();
        renderAd();
    }

    @Override // net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedClicked(RewardedPresenter rewardedPresenter) {
        invokeOnClick();
    }

    @Override // net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedClosed(RewardedPresenter rewardedPresenter) {
        invokeOnClosed();
    }

    @Override // net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedError(RewardedPresenter rewardedPresenter) {
        invokeOnLoadFailed(new HyBidError(HyBidErrorCode.ERROR_RENDERING_REWARDED));
    }

    @Override // net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedFinished(RewardedPresenter rewardedPresenter) {
        invokeOnReward();
    }

    @Override // net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedLoaded(RewardedPresenter rewardedPresenter) {
        this.mReady = true;
        invokeOnLoadFinished();
    }

    @Override // net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedOpened(RewardedPresenter rewardedPresenter) {
        if (this.mInitialRenderTime != -1) {
            addReportingKey(Reporting.Key.RENDER_TIME, Long.valueOf(System.currentTimeMillis() - this.mInitialRenderTime));
        }
        reportAdRender("rewarded", getPlacementParams());
        invokeOnOpened();
    }

    @Override // net.pubnative.lite.sdk.VideoListener
    public void onVideoDismissed(int i10) {
        VideoListener videoListener = this.mVideoListener;
        if (videoListener != null) {
            videoListener.onVideoDismissed(i10);
        }
    }

    @Override // net.pubnative.lite.sdk.VideoListener
    public void onVideoError(int i10) {
        VideoListener videoListener = this.mVideoListener;
        if (videoListener != null) {
            videoListener.onVideoError(i10);
        }
    }

    @Override // net.pubnative.lite.sdk.VideoListener
    public void onVideoFinished() {
        VideoListener videoListener = this.mVideoListener;
        if (videoListener != null) {
            videoListener.onVideoFinished();
        }
    }

    @Override // net.pubnative.lite.sdk.VideoListener
    public void onVideoSkipped() {
        VideoListener videoListener = this.mVideoListener;
        if (videoListener != null) {
            videoListener.onVideoSkipped();
        }
    }

    @Override // net.pubnative.lite.sdk.VideoListener
    public void onVideoStarted() {
        VideoListener videoListener = this.mVideoListener;
        if (videoListener != null) {
            videoListener.onVideoStarted();
        }
    }

    public void prepare() {
        prepare(null);
    }

    public void prepareAd(String str) {
        if (TextUtils.isEmpty(str)) {
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_SIGNAL_DATA));
            return;
        }
        SignalDataProcessor signalDataProcessor = new SignalDataProcessor();
        this.mSignalDataProcessor = signalDataProcessor;
        signalDataProcessor.processSignalData(str, new SignalDataProcessor.Listener() { // from class: net.pubnative.lite.sdk.rewarded.HyBidRewardedAd.1
            @Override // net.pubnative.lite.sdk.utils.SignalDataProcessor.Listener
            public void onError(Throwable th2) {
                HyBidRewardedAd.this.invokeOnLoadFailed(th2);
            }

            @Override // net.pubnative.lite.sdk.utils.SignalDataProcessor.Listener
            public void onProcessed(Ad ad2) {
                if (ad2 != null) {
                    HyBidRewardedAd.this.prepareAd(ad2);
                }
            }
        });
    }

    public void prepareCustomMarkup(String str) {
        prepareCustomMarkup("", str);
    }

    public void prepareVideoTag(String str) {
        prepareVideoTag("", str);
    }

    public void reportAdRender(String str, JSONObject jSONObject) {
        if (HyBid.getReportingController() == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType(Reporting.EventType.RENDER);
        reportingEvent.setAdFormat(str);
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mRequestManager.getIntegrationType()));
        reportingEvent.setHasEndCard(hasEndCard());
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            reportingEvent.setImpId(ad2.getSessionId());
            reportingEvent.setCampaignId(this.mAd.getCampaignId());
            reportingEvent.setConfigId(this.mAd.getConfigId());
        }
        reportingEvent.mergeJSONObject(jSONObject);
        HyBid.getReportingController().reportEvent(reportingEvent);
    }

    public void setAutoCacheOnLoad(boolean z10) {
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            requestManager.setAutoCacheOnLoad(z10);
        }
        RequestManager requestManager2 = this.mORTBRequestManager;
        if (requestManager2 != null) {
            requestManager2.setAutoCacheOnLoad(z10);
        }
    }

    public void setCustomUrl(String str) {
        this.mCustomUrl = str;
    }

    public void setMediation(boolean z10) {
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            requestManager.setIntegrationType(z10 ? IntegrationType.MEDIATION : IntegrationType.STANDALONE);
        }
        RequestManager requestManager2 = this.mORTBRequestManager;
        if (requestManager2 != null) {
            requestManager2.setIntegrationType(z10 ? IntegrationType.MEDIATION : IntegrationType.STANDALONE);
        }
    }

    public void setMediationVendor(String str) {
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            requestManager.setMediationVendor(str);
        }
        RequestManager requestManager2 = this.mORTBRequestManager;
        if (requestManager2 != null) {
            requestManager2.setMediationVendor(str);
        }
    }

    public void setVideoListener(VideoListener videoListener) {
        this.mVideoListener = videoListener;
    }

    public void show() {
        if (this.mPresenter == null || !this.mReady) {
            Logger.e(TAG, "Can't display ad. Rewarded ad not ready.");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.mInitialRenderTime = jCurrentTimeMillis;
        long j10 = this.mInitialLoadTime;
        if (jCurrentTimeMillis >= 1800000 + j10 && j10 != -1) {
            Logger.e(TAG, "Ad has expired.");
            cleanup();
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.EXPIRED_AD));
            return;
        }
        this.mPresenter.show();
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null && !this.mIsExchange) {
            requestManager.sendAdSessionDataToAtom(this.mAd, Double.valueOf(1.0d));
            return;
        }
        RequestManager requestManager2 = this.mORTBRequestManager;
        if (requestManager2 == null || !this.mIsExchange) {
            return;
        }
        requestManager2.sendAdSessionDataToAtom(this.mAd, Double.valueOf(1.0d));
    }

    public HyBidRewardedAd(Activity activity, String str, Listener listener) {
        this((Context) activity, str, listener);
    }

    public void prepare(CacheListener cacheListener) {
        Ad ad2;
        RequestManager requestManager = this.mRequestManager;
        if (requestManager == null || (ad2 = this.mAd) == null) {
            return;
        }
        requestManager.cacheAd(ad2, cacheListener);
    }

    public void prepareCustomMarkup(String str, final String str2) {
        if (TextUtils.isEmpty(str2)) {
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_ASSET));
            return;
        }
        this.mZoneId = str;
        if (MarkupUtils.isVastXml(str2)) {
            if (TextUtils.isEmpty(this.mZoneId)) {
                this.mZoneId = Protocol.VAST_1_0_WRAPPER;
                JsonOperations.putJsonString(this.mPlacementParams, Reporting.Key.ZONE_ID, Protocol.VAST_1_0_WRAPPER);
            }
            final Ad.AdType adType = Ad.AdType.VIDEO;
            final int i10 = 15;
            new VideoAdProcessor().process(this.mContext, str2, null, new VideoAdProcessor.Listener() { // from class: net.pubnative.lite.sdk.rewarded.HyBidRewardedAd.3
                @Override // net.pubnative.lite.sdk.vpaid.VideoAdProcessor.Listener
                public void onCacheError(Throwable th2) {
                    if (HyBidRewardedAd.this.mIsDestroyed) {
                        return;
                    }
                    Logger.w(HyBidRewardedAd.TAG, "onCacheError", th2);
                    HyBidRewardedAd.this.invokeOnLoadFailed(th2);
                }

                @Override // net.pubnative.lite.sdk.vpaid.VideoAdProcessor.Listener
                public void onCacheSuccess(AdParams adParams, String str3, EndCardData endCardData, String str4, List<String> list) {
                    if (HyBidRewardedAd.this.mIsDestroyed) {
                        return;
                    }
                    if (list != null && !list.isEmpty()) {
                        JsonOperations.putStringArray(HyBidRewardedAd.this.mPlacementParams, Reporting.Key.OM_VENDORS, list);
                    }
                    boolean z10 = (adParams.getEndCardList() == null || adParams.getEndCardList().isEmpty()) ? false : true;
                    VideoAdCacheItem videoAdCacheItem = new VideoAdCacheItem(adParams, str3, endCardData, str4);
                    HyBidRewardedAd.this.mAd = new Ad(i10, str2, adType);
                    HyBidRewardedAd hyBidRewardedAd = HyBidRewardedAd.this;
                    hyBidRewardedAd.mAd.setZoneId(hyBidRewardedAd.mZoneId);
                    HyBidRewardedAd.this.mAd.setHasEndCard(z10);
                    HyBidRewardedAd.this.initializeAdTracker();
                    AdCache adCache = HyBid.getAdCache();
                    HyBidRewardedAd hyBidRewardedAd2 = HyBidRewardedAd.this;
                    adCache.put(hyBidRewardedAd2.mZoneId, hyBidRewardedAd2.mAd);
                    HyBid.getVideoAdCache().put(HyBidRewardedAd.this.mZoneId, videoAdCacheItem);
                    HyBidRewardedAd hyBidRewardedAd3 = HyBidRewardedAd.this;
                    HyBidRewardedAd hyBidRewardedAd4 = HyBidRewardedAd.this;
                    RewardedPresenterFactory rewardedPresenterFactory = new RewardedPresenterFactory(hyBidRewardedAd4.mContext, hyBidRewardedAd4.mZoneId);
                    HyBidRewardedAd hyBidRewardedAd5 = HyBidRewardedAd.this;
                    hyBidRewardedAd3.mPresenter = rewardedPresenterFactory.createRewardedPresenter(hyBidRewardedAd5.mAd, hyBidRewardedAd5, hyBidRewardedAd5.mRequestManager.getIntegrationType());
                    HyBidRewardedAd hyBidRewardedAd6 = HyBidRewardedAd.this;
                    RewardedPresenter rewardedPresenter = hyBidRewardedAd6.mPresenter;
                    if (rewardedPresenter == null) {
                        hyBidRewardedAd6.invokeOnLoadFailed(new HyBidError(HyBidErrorCode.UNSUPPORTED_ASSET));
                    } else {
                        rewardedPresenter.setVideoListener(hyBidRewardedAd6);
                        HyBidRewardedAd.this.mPresenter.load();
                    }
                }
            });
            return;
        }
        if (TextUtils.isEmpty(this.mZoneId)) {
            this.mZoneId = "3";
        }
        this.mAd = new Ad(21, str2, Ad.AdType.HTML);
        initializeAdTracker();
        HyBid.getAdCache().put(this.mZoneId, this.mAd);
        RewardedPresenter rewardedPresenterCreateRewardedPresenter = new RewardedPresenterFactory(this.mContext, this.mZoneId).createRewardedPresenter(this.mAd, this, this.mRequestManager.getIntegrationType());
        this.mPresenter = rewardedPresenterCreateRewardedPresenter;
        if (rewardedPresenterCreateRewardedPresenter == null) {
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.UNSUPPORTED_ASSET));
        } else {
            rewardedPresenterCreateRewardedPresenter.setVideoListener(this);
            this.mPresenter.load();
        }
    }

    public void prepareVideoTag(final String str, String str2) {
        final String url = VastUrlUtils.formatURL(str2, VastUrlUtils.buildParameters());
        HashMap map = new HashMap();
        String userAgent = HyBid.getDeviceInfo().getUserAgent();
        if (!TextUtils.isEmpty(userAgent)) {
            map.put("User-Agent", userAgent);
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        PNHttpClient.makeRequest(this.mContext, url, map, null, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.rewarded.HyBidRewardedAd.2
            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onFailure(Throwable th2) {
                Logger.e(HyBidRewardedAd.TAG, "Request failed: " + th2.toString());
                HyBidRewardedAd.this.invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_ASSET));
            }

            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public /* synthetic */ void onFinally(String str3, int i10) {
                e.a(this, str3, i10);
            }

            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onSuccess(String str3, Map<String, List<String>> map2) {
                HyBidRewardedAd.this.registerAdRequest(url, str3, jCurrentTimeMillis);
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                HyBidRewardedAd.this.prepareCustomMarkup(str, str3);
            }
        });
    }

    public HyBidRewardedAd(Context context, String str, Listener listener) {
        this(context, null, str, listener);
    }

    public HyBidRewardedAd(Context context, String str, String str2, Listener listener) {
        this.mReady = false;
        this.mIsDestroyed = false;
        this.mInitialLoadTime = -1L;
        this.mInitialRenderTime = -1L;
        if (!HyBid.isInitialized()) {
            Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before creating a HyBidRewardedAd");
        }
        this.mRequestManager = new RewardedRequestManager();
        this.mORTBRequestManager = new RequestManager(new OpenRTBApiClient(context), new OpenRTBAdRequestFactory());
        this.mContext = context;
        this.mAppToken = str;
        this.mZoneId = str2;
        this.mListener = listener;
        this.mPlacementParams = new JSONObject();
        RequestManager requestManager = this.mRequestManager;
        IntegrationType integrationType = IntegrationType.STANDALONE;
        requestManager.setIntegrationType(integrationType);
        this.mORTBRequestManager.setIntegrationType(integrationType);
        addReportingKey(Reporting.Key.ZONE_ID, this.mZoneId);
    }

    public void prepareAd(Ad ad2) {
        if (ad2 != null) {
            this.mAd = ad2;
            initializeAdTracker();
            if (!this.mAd.getZoneId().equalsIgnoreCase(this.mZoneId)) {
                String zoneId = this.mAd.getZoneId();
                this.mZoneId = zoneId;
                JsonOperations.putJsonString(this.mPlacementParams, Reporting.Key.ZONE_ID, zoneId);
            }
            RewardedPresenter rewardedPresenterCreateRewardedPresenter = new RewardedPresenterFactory(this.mContext, this.mZoneId).createRewardedPresenter(this.mAd, this, this.mRequestManager.getIntegrationType());
            this.mPresenter = rewardedPresenterCreateRewardedPresenter;
            if (rewardedPresenterCreateRewardedPresenter != null) {
                rewardedPresenterCreateRewardedPresenter.setVideoListener(this);
                this.mPresenter.load();
                return;
            } else {
                invokeOnLoadFailed(new HyBidError(HyBidErrorCode.UNSUPPORTED_ASSET));
                return;
            }
        }
        invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_AD));
    }

    public void loadExchangeAd() {
        loadExchangeAd(null);
    }
}
