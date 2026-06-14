package net.pubnative.lite.sdk.api;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import net.pubnative.lite.sdk.AdCache;
import net.pubnative.lite.sdk.CacheListener;
import net.pubnative.lite.sdk.DeviceInfo;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.analytics.ReportingController;
import net.pubnative.lite.sdk.analytics.ReportingEvent;
import net.pubnative.lite.sdk.api.ApiClient;
import net.pubnative.lite.sdk.api.RequestManager;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdRequest;
import net.pubnative.lite.sdk.models.AdRequestFactory;
import net.pubnative.lite.sdk.models.AdSize;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.models.PNAdRequest;
import net.pubnative.lite.sdk.models.PNAdRequestFactory;
import net.pubnative.lite.sdk.models.request.OpenRTBAdRequest;
import net.pubnative.lite.sdk.utils.AdTopicsAPIManager;
import net.pubnative.lite.sdk.utils.AtomManager;
import net.pubnative.lite.sdk.utils.CheckUtils;
import net.pubnative.lite.sdk.utils.HeaderBiddingUtils;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.PNInitializationHelper;
import net.pubnative.lite.sdk.utils.PrebidUtils;
import net.pubnative.lite.sdk.utils.json.JsonOperations;
import net.pubnative.lite.sdk.vpaid.VideoAdCache;
import net.pubnative.lite.sdk.vpaid.VideoAdCacheItem;
import net.pubnative.lite.sdk.vpaid.VideoAdProcessor;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class RequestManager {
    private static final String TAG = "RequestManager";
    final JSONObject jsonCacheParams;
    private AdCache mAdCache;
    private String mAdFormat;
    private final AdRequestFactory mAdRequestFactory;
    private AdSize mAdSize;
    private ApiClient mApiClient;
    private String mAppToken;
    private boolean mAutoCacheOnLoad;
    private boolean mCacheFinished;
    private boolean mCacheStarted;
    private Long mCacheTimeMilliseconds;
    private String mCustomUrl;
    private DeviceInfo mDeviceInfo;
    private final PNInitializationHelper mInitializationHelper;
    private IntegrationType mIntegrationType;
    private boolean mIsDestroyed;
    private final JSONObject mPlacementParams;
    private final ReportingController mReportingController;
    private RequestListener mRequestListener;
    private Long mRequestTimeMilliseconds;
    private VideoAdCache mVideoCache;
    private String mZoneId;

    /* JADX INFO: renamed from: net.pubnative.lite.sdk.api.RequestManager$1, reason: invalid class name */
    class AnonymousClass1 implements ApiClient.AdRequestListener {
        final /* synthetic */ AdRequest val$adRequest;

        AnonymousClass1(AdRequest adRequest) {
            this.val$adRequest = adRequest;
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1, Throwable th2) {
            RequestListener requestListener = RequestManager.this.mRequestListener;
            if (requestListener != null) {
                requestListener.onRequestFail(th2);
            }
        }

        @Override // net.pubnative.lite.sdk.api.ApiClient.AdRequestListener
        public void onFailure(final Throwable th2) {
            if (RequestManager.this.mIsDestroyed) {
                return;
            }
            Logger.w(RequestManager.TAG, th2.getMessage());
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: net.pubnative.lite.sdk.api.b
                @Override // java.lang.Runnable
                public final void run() {
                    RequestManager.AnonymousClass1.a(this.f95843b, th2);
                }
            });
        }

        @Override // net.pubnative.lite.sdk.api.ApiClient.AdRequestListener
        public void onSuccess(Ad ad2) {
            if (RequestManager.this.mIsDestroyed) {
                return;
            }
            Logger.d(RequestManager.TAG, "Received ad response for zone id: " + this.val$adRequest.zoneId);
            RequestManager requestManager = RequestManager.this;
            requestManager.reportAdResponse(this.val$adRequest, ad2, requestManager.mIntegrationType);
            RequestManager.this.processAd(this.val$adRequest, ad2);
        }
    }

    public static final class AdFormat {
        public static final String HTML = "html";
        public static final String VIDEO = "video";
    }

    public interface RequestListener {
        void onRequestFail(Throwable th2);

        void onRequestSuccess(Ad ad2);
    }

    public RequestManager() {
        this(null);
    }

    public static /* synthetic */ void a(RequestManager requestManager, AdRequest adRequest) {
        requestManager.requestAdFromApi(adRequest);
        if (adRequest != null) {
            try {
                requestManager.jsonCacheParams.put(Reporting.Key.AD_REQUEST, adRequest.toString());
            } catch (JSONException e10) {
                e10.printStackTrace();
                HyBid.reportException((Exception) e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processAd(AdRequest adRequest, Ad ad2) {
        AdCache adCache = this.mAdCache;
        if (adCache == null || adCache != HyBid.getAdCache()) {
            this.mAdCache = HyBid.getAdCache();
        }
        VideoAdCache videoAdCache = this.mVideoCache;
        if (videoAdCache == null || videoAdCache != HyBid.getVideoAdCache()) {
            this.mVideoCache = HyBid.getVideoAdCache();
        }
        ad2.setZoneId(adRequest.zoneId);
        this.mAdCache.put(adRequest.zoneId, ad2);
        AdTopicsAPIManager.setTopicsAPIEnabled(this.mApiClient.getContext(), ad2);
        int i10 = ad2.assetgroupid;
        if (i10 != 4 && i10 != 15) {
            RequestListener requestListener = this.mRequestListener;
            if (requestListener != null) {
                requestListener.onRequestSuccess(ad2);
                return;
            }
            return;
        }
        if (this.mAutoCacheOnLoad) {
            cacheAd(ad2);
            return;
        }
        RequestListener requestListener2 = this.mRequestListener;
        if (requestListener2 != null) {
            requestListener2.onRequestSuccess(ad2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportAdCache() {
        if (this.mReportingController == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType(Reporting.EventType.CACHE);
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
        JsonOperations.mergeJsonObjects(this.jsonCacheParams, getPlacementParams());
        reportingEvent.mergeJSONObject(this.jsonCacheParams);
        this.mReportingController.reportEvent(reportingEvent);
    }

    private void reportAdRequest(PNAdRequest pNAdRequest) {
        if (this.mReportingController == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("request");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
        reportingEvent.setTimestamp(String.valueOf(System.currentTimeMillis()));
        if (getAdSize() != null) {
            reportingEvent.setAdSize(getAdSize().toString());
        }
        reportingEvent.setPlacementId(pNAdRequest.zoneId);
        reportingEvent.setSessionDuration(pNAdRequest.sessionduration);
        reportingEvent.setImpDepth(pNAdRequest.impdepth);
        reportingEvent.setAgeOfApp(pNAdRequest.ageofapp);
        reportingEvent.setRequestType("apiv3");
        this.mReportingController.reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void reportAdResponse(net.pubnative.lite.sdk.models.AdRequest r6, net.pubnative.lite.sdk.models.Ad r7, net.pubnative.lite.sdk.models.IntegrationType r8) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.api.RequestManager.reportAdResponse(net.pubnative.lite.sdk.models.AdRequest, net.pubnative.lite.sdk.models.Ad, net.pubnative.lite.sdk.models.IntegrationType):void");
    }

    public void cacheAd(Ad ad2) {
        cacheAd(ad2, null);
    }

    public void destroy() {
        this.mRequestListener = null;
        this.mIsDestroyed = true;
    }

    public AdSize getAdSize() {
        return this.mAdSize;
    }

    public PNInitializationHelper getInitializationHelper() {
        return this.mInitializationHelper;
    }

    public IntegrationType getIntegrationType() {
        return this.mIntegrationType;
    }

    public JSONObject getPlacementParams() {
        JSONObject placementParams;
        JSONObject jSONObject = new JSONObject();
        JsonOperations.mergeJsonObjects(jSONObject, this.mPlacementParams);
        if (getAdSize() != null) {
            JsonOperations.putJsonString(jSONObject, Reporting.Key.AD_SIZE, getAdSize().toString());
        }
        JsonOperations.putJsonBoolean(jSONObject, Reporting.Key.OM_ENABLED, HyBid.isViewabilityMeasurementActivated() && HyBid.getViewabilityManager() != null);
        ApiClient apiClient = this.mApiClient;
        if (apiClient != null && (placementParams = apiClient.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams);
        }
        return jSONObject;
    }

    public boolean isAutoCacheOnLoad() {
        return this.mAutoCacheOnLoad;
    }

    public boolean isRewarded() {
        return false;
    }

    public void requestAd() {
        if (CheckUtils.NoThrow.checkArgument(this.mInitializationHelper.isInitialized(), "HyBid SDK has not been initialized. Please call HyBid#initialize in your application's onCreate method.") && CheckUtils.NoThrow.checkNotNull(HyBid.getDeviceInfo(), "HyBid SDK has not been initialized yet. Please call HyBid#initialize in your application's onCreate method.") && CheckUtils.NoThrow.checkNotNull(HyBid.getUserDataManager(), "HyBid SDK has not been initialized yet. Please call HyBid#initialize in your application's onCreate method.") && CheckUtils.NoThrow.checkNotNull(this.mZoneId, "zone id cannot be null") && CheckUtils.NoThrow.checkArgument(!this.mIsDestroyed, "RequestManager has been destroyed")) {
            if (HyBid.isTestMode()) {
                Logger.w(TAG, "You are using Verve HyBid SDK on test mode. Please disable test mode before submitting your application for production.");
            }
            this.mCacheStarted = false;
            this.mCacheFinished = false;
            this.mAdRequestFactory.createAdRequest(TextUtils.isEmpty(this.mAppToken) ? null : this.mAppToken, this.mZoneId, getAdSize(), isRewarded(), false, new AdRequestFactory.Callback() { // from class: net.pubnative.lite.sdk.api.a
                @Override // net.pubnative.lite.sdk.models.AdRequestFactory.Callback
                public final void onRequestCreated(AdRequest adRequest) {
                    RequestManager.a(this.f95842a, adRequest);
                }
            });
        }
    }

    void requestAdFromApi(AdRequest adRequest) {
        if (this.mApiClient == null) {
            this.mApiClient = HyBid.getApiClient();
        }
        if (this.mDeviceInfo == null) {
            this.mDeviceInfo = HyBid.getDeviceInfo();
        }
        try {
            this.jsonCacheParams.put("timestamp", String.valueOf(System.currentTimeMillis()));
        } catch (JSONException e10) {
            e10.printStackTrace();
            HyBid.reportException((Exception) e10);
        }
        Logger.d(TAG, "Requesting ad for zone id: " + adRequest.zoneId);
        if (adRequest instanceof PNAdRequest) {
            reportAdRequest((PNAdRequest) adRequest);
        } else {
            reportAdRequest((OpenRTBAdRequest) adRequest);
        }
        if (!TextUtils.isEmpty(this.mCustomUrl)) {
            this.mApiClient.setCustomUrl(this.mCustomUrl);
        }
        this.mApiClient.getAd(adRequest, this.mDeviceInfo.getUserAgent(), new AnonymousClass1(adRequest));
    }

    public void sendAdSessionDataToAtom(Ad ad2, Double d10) {
        if (ad2 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (ad2.getCreativeId() != null && !ad2.getCreativeId().isEmpty()) {
                    jSONObject.put("creative_id", ad2.getCreativeId());
                }
                if (ad2.getCampaignId() != null && !ad2.getCampaignId().isEmpty()) {
                    jSONObject.put("campaign_id", ad2.getCampaignId());
                }
                jSONObject.put(AtomManager.BID_PRICE, HeaderBiddingUtils.getBidFromPoints(ad2.getECPM(), PrebidUtils.KeywordMode.THREE_DECIMALS));
                String str = this.mAdFormat;
                if (str == null) {
                    str = "native";
                }
                jSONObject.put(AtomManager.AD_FORMAT, str);
                jSONObject.put(AtomManager.RENDERING_STATUS, AtomManager.RENDERING_SUCCESS);
                jSONObject.put("Viewability", d10 != null ? d10.doubleValue() : 0.0d);
                HashMap map = new HashMap();
                String string = jSONObject.toString();
                map.put(AtomManager.AD_SESSION_DATA, string);
                AtomManager.setAdSessionData(map);
                if (string.isEmpty()) {
                    return;
                }
                ReportingEvent reportingEvent = new ReportingEvent();
                reportingEvent.setEventType(Reporting.EventType.SEND_ADSESSION_DATA);
                reportingEvent.setTimestamp(System.currentTimeMillis());
                map.put(AtomManager.AD_SESSION_DATA, string);
                reportingEvent.setAdSessionData(string);
                ReportingController reportingController = this.mReportingController;
                if (reportingController != null) {
                    reportingController.reportEvent(reportingEvent);
                }
            } catch (JSONException e10) {
                Logger.d(TAG, "Error while sending ad session data to Atom: " + e10.getMessage());
            }
        }
    }

    public void setAdFormat(String str) {
        AdRequestFactory adRequestFactory = this.mAdRequestFactory;
        if (adRequestFactory != null) {
            adRequestFactory.setAdFormat(str);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.mAdSize = adSize;
        if (adSize != null) {
            JsonOperations.putJsonString(this.mPlacementParams, Reporting.Key.AD_SIZE, adSize.toString());
        } else {
            JsonOperations.removeJsonValue(this.mPlacementParams, Reporting.Key.AD_SIZE);
        }
    }

    public void setAppToken(String str) {
        this.mAppToken = str;
    }

    public void setAutoCacheOnLoad(boolean z10) {
        this.mAutoCacheOnLoad = z10;
    }

    public void setCustomUrl(String str) {
        this.mCustomUrl = str;
    }

    public void setIntegrationType(IntegrationType integrationType) {
        if (integrationType != null) {
            this.mIntegrationType = integrationType;
        }
        AdRequestFactory adRequestFactory = this.mAdRequestFactory;
        if (adRequestFactory != null) {
            adRequestFactory.setIntegrationType(integrationType);
            JsonOperations.putJsonString(this.mPlacementParams, "integration_type", integrationType.getCode());
        }
    }

    public void setMediationVendor(String str) {
        AdRequestFactory adRequestFactory = this.mAdRequestFactory;
        if (adRequestFactory != null) {
            adRequestFactory.setMediationVendor(str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JsonOperations.putJsonString(this.mPlacementParams, Reporting.Key.MEDIATION_VENDOR, str);
        }
    }

    public void setRequestListener(RequestListener requestListener) {
        this.mRequestListener = requestListener;
    }

    public void setZoneId(String str) {
        this.mZoneId = str;
    }

    public RequestManager(AdSize adSize) {
        this(HyBid.getApiClient(), HyBid.getDeviceInfo(), HyBid.getAdCache(), HyBid.getVideoAdCache(), new PNAdRequestFactory(), HyBid.getReportingController(), adSize, new PNInitializationHelper());
    }

    public void cacheAd(final Ad ad2, final CacheListener cacheListener) {
        if (ad2 == null || TextUtils.isEmpty(ad2.getVast()) || this.mCacheStarted || this.mCacheFinished) {
            if (cacheListener != null) {
                cacheListener.onCacheSuccess();
                return;
            }
            return;
        }
        this.mCacheStarted = true;
        this.mCacheFinished = false;
        try {
            this.jsonCacheParams.put("ad_type", "VAST");
            this.jsonCacheParams.put("vast", ad2.getVast());
        } catch (JSONException e10) {
            e10.printStackTrace();
            HyBid.reportException((Exception) e10);
        }
        this.mRequestTimeMilliseconds = Long.valueOf(System.currentTimeMillis());
        new VideoAdProcessor().process(this.mApiClient.getContext(), ad2.getVast(), getAdSize(), new VideoAdProcessor.Listener() { // from class: net.pubnative.lite.sdk.api.RequestManager.2
            @Override // net.pubnative.lite.sdk.vpaid.VideoAdProcessor.Listener
            public void onCacheError(Throwable th2) {
                RequestListener requestListener;
                if (RequestManager.this.mIsDestroyed) {
                    return;
                }
                Logger.w(RequestManager.TAG, th2.getMessage());
                RequestManager requestManager = RequestManager.this;
                requestManager.mCacheStarted = false;
                requestManager.mCacheFinished = false;
                if (requestManager.mAutoCacheOnLoad && (requestListener = requestManager.mRequestListener) != null) {
                    requestListener.onRequestFail(th2);
                    return;
                }
                CacheListener cacheListener2 = cacheListener;
                if (cacheListener2 != null) {
                    cacheListener2.onCacheFailed(th2);
                }
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdProcessor.Listener
            public void onCacheSuccess(AdParams adParams, String str, EndCardData endCardData, String str2, List<String> list) {
                RequestListener requestListener;
                RequestManager requestManager = RequestManager.this;
                if (requestManager.mIsDestroyed) {
                    return;
                }
                requestManager.mCacheTimeMilliseconds = Long.valueOf(System.currentTimeMillis());
                if (list != null && !list.isEmpty()) {
                    JsonOperations.putStringArray(RequestManager.this.mPlacementParams, Reporting.Key.OM_VENDORS, list);
                }
                try {
                    RequestManager requestManager2 = RequestManager.this;
                    requestManager2.jsonCacheParams.put(Reporting.Key.CACHE_TIME, String.valueOf(requestManager2.mCacheTimeMilliseconds.longValue() - RequestManager.this.mRequestTimeMilliseconds.longValue()));
                } catch (JSONException e11) {
                    Logger.w(RequestManager.TAG, e11.getMessage());
                    HyBid.reportException((Exception) e11);
                }
                RequestManager.this.reportAdCache();
                ad2.setHasEndCard((adParams.getEndCardList() == null || adParams.getEndCardList().isEmpty()) ? false : true);
                RequestManager.this.mVideoCache.put(ad2.getZoneId(), new VideoAdCacheItem(adParams, str, endCardData, str2));
                RequestManager requestManager3 = RequestManager.this;
                requestManager3.mCacheStarted = false;
                requestManager3.mCacheFinished = true;
                if (requestManager3.mAutoCacheOnLoad && (requestListener = requestManager3.mRequestListener) != null) {
                    requestListener.onRequestSuccess(ad2);
                    return;
                }
                CacheListener cacheListener2 = cacheListener;
                if (cacheListener2 != null) {
                    cacheListener2.onCacheSuccess();
                }
            }
        });
    }

    public RequestManager(ApiClient apiClient, AdRequestFactory adRequestFactory) {
        this(null, apiClient, adRequestFactory);
    }

    public RequestManager(AdSize adSize, ApiClient apiClient, AdRequestFactory adRequestFactory) {
        this(apiClient, HyBid.getDeviceInfo(), HyBid.getAdCache(), HyBid.getVideoAdCache(), adRequestFactory, HyBid.getReportingController(), adSize, new PNInitializationHelper());
    }

    RequestManager(ApiClient apiClient, DeviceInfo deviceInfo, AdCache adCache, VideoAdCache videoAdCache, AdRequestFactory adRequestFactory, ReportingController reportingController, AdSize adSize, PNInitializationHelper pNInitializationHelper) {
        this.mIntegrationType = IntegrationType.STANDALONE;
        this.mAutoCacheOnLoad = true;
        this.mCacheStarted = false;
        this.mCacheFinished = false;
        this.mRequestTimeMilliseconds = 0L;
        this.mCacheTimeMilliseconds = 0L;
        this.mApiClient = apiClient;
        this.mDeviceInfo = deviceInfo;
        this.mAdCache = adCache;
        this.mVideoCache = videoAdCache;
        this.mReportingController = reportingController;
        this.mAdRequestFactory = adRequestFactory;
        this.mInitializationHelper = pNInitializationHelper;
        JSONObject jSONObject = new JSONObject();
        this.mPlacementParams = jSONObject;
        if (adSize == null) {
            this.mAdSize = AdSize.SIZE_320x50;
        } else {
            this.mAdSize = adSize;
        }
        JsonOperations.putJsonString(jSONObject, Reporting.Key.AD_SIZE, this.mAdSize.toString());
        JsonOperations.putJsonString(jSONObject, "integration_type", IntegrationType.HEADER_BIDDING.getCode());
        JSONObject jSONObject2 = new JSONObject();
        this.jsonCacheParams = jSONObject2;
        String str = this.mAppToken;
        if (str == null || TextUtils.isEmpty(str)) {
            this.mAppToken = HyBid.getAppToken();
        }
        try {
            jSONObject2.put("app_token", this.mAppToken);
        } catch (JSONException e10) {
            e10.printStackTrace();
            HyBid.reportException((Exception) e10);
        }
    }

    private void reportAdRequest(OpenRTBAdRequest openRTBAdRequest) {
        if (this.mReportingController == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("request");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
        reportingEvent.setTimestamp(String.valueOf(System.currentTimeMillis()));
        if (getAdSize() != null) {
            reportingEvent.setAdSize(getAdSize().toString());
        }
        reportingEvent.setPlacementId(openRTBAdRequest.zoneId);
        reportingEvent.setRequestType("ortb");
        this.mReportingController.reportEvent(reportingEvent);
    }
}
