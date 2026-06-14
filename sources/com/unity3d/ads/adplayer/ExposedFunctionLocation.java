package com.unity3d.ads.adplayer;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b<\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/unity3d/ads/adplayer/ExposedFunctionLocation;", "", "()V", "ATTRIBUTION_REGISTER_CLICK", "", "ATTRIBUTION_REGISTER_VIEW", "BROADCAST_EVENT", "CANCEL_SHOW_TIMEOUT", "CLICKED", "COMPLETED", "DOWNLOAD", "FAILED", "GET_AD_CONTEXT", "GET_ALLOWED_PII", "GET_CONNECTION_TYPE", "GET_DEVICE_MAX_VOLUME", "GET_DEVICE_VOLUME", "GET_PRIVACY", "GET_PRIVACY_FSM", "GET_SCREEN_HEIGHT", "GET_SCREEN_WIDTH", "GET_SESSION_TOKEN", "HEADER_BIDDING_TOKEN_INCREMENT_STARTS", "HEADER_BIDDING_TOKEN_INCREMENT_WINS", "HEADER_BIDDING_TOKEN_RESET", "INCREMENT_BANNER_IMPRESSION_COUNT", "IS_ATTRIBUTION_AVAILABLE", "IS_FILE_CACHED", "IS_OFFERWALL_AD_READY", "LEFT_APPLICATION", "LOAD_COMPLETE", "LOAD_ERROR", "LOAD_OFFERWALL_AD", "LOAD_SCAR_AD", "MARK_CAMPAIGN_STATE_SHOWN", "OM_FINISH_SESSION", "OM_GET_DATA", "OM_IMPRESSION", "OM_START_SESSION", "OPEN_URL", "REFRESH_AD_DATA", "REQUEST_GET", "REQUEST_HEAD", "REQUEST_POST", "SEND_DIAGNOSTIC_EVENT", "SEND_OPERATIVE_EVENT", "SEND_PRIVACY_UPDATE_REQUEST", "SET_ALLOWED_PII", "SET_OPPORTUNITY_TTL", "SET_ORIENTATION", "SET_PRIVACY", "SET_PRIVACY_FSM", "SHOW_OFFERWALL_AD", "SHOW_SCAR_AD", "STARTED", "STORAGE_CLEAR", "STORAGE_DELETE", "STORAGE_GET", "STORAGE_GET_KEYS", "STORAGE_READ", "STORAGE_SET", "STORAGE_WRITE", "UPDATE_CAMPAIGN_STATE", "UPDATE_TRACKING_TOKEN", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExposedFunctionLocation {

    @NotNull
    public static final String ATTRIBUTION_REGISTER_CLICK = "com.unity3d.services.ads.api.AdViewer.attributionRegisterClick";

    @NotNull
    public static final String ATTRIBUTION_REGISTER_VIEW = "com.unity3d.services.ads.api.AdViewer.attributionRegisterView";

    @NotNull
    public static final String BROADCAST_EVENT = "com.unity3d.services.ads.api.AdViewer.broadcastEvent";

    @NotNull
    public static final String CANCEL_SHOW_TIMEOUT = "com.unity3d.services.ads.api.AdViewer.cancelShowTimeout";

    @NotNull
    public static final String CLICKED = "com.unity3d.services.ads.api.AdViewer.clicked";

    @NotNull
    public static final String COMPLETED = "com.unity3d.services.ads.api.AdViewer.completed";

    @NotNull
    public static final String DOWNLOAD = "com.unity3d.services.ads.api.AdViewer.download";

    @NotNull
    public static final String FAILED = "com.unity3d.services.ads.api.AdViewer.failed";

    @NotNull
    public static final String GET_AD_CONTEXT = "com.unity3d.services.ads.api.AdViewer.getAdContext";

    @NotNull
    public static final String GET_ALLOWED_PII = "com.unity3d.services.ads.api.AdViewer.getPrivacyAllowedPii";

    @NotNull
    public static final String GET_CONNECTION_TYPE = "com.unity3d.services.core.api.DeviceInfo.getConnectionType";

    @NotNull
    public static final String GET_DEVICE_MAX_VOLUME = "com.unity3d.services.core.api.DeviceInfo.getDeviceMaxVolume";

    @NotNull
    public static final String GET_DEVICE_VOLUME = "com.unity3d.services.core.api.DeviceInfo.getDeviceVolume";

    @NotNull
    public static final String GET_PRIVACY = "com.unity3d.services.ads.api.AdViewer.getPrivacyPayload";

    @NotNull
    public static final String GET_PRIVACY_FSM = "com.unity3d.services.ads.api.AdViewer.getPrivacyFsm";

    @NotNull
    public static final String GET_SCREEN_HEIGHT = "com.unity3d.services.core.api.DeviceInfo.getScreenHeight";

    @NotNull
    public static final String GET_SCREEN_WIDTH = "com.unity3d.services.core.api.DeviceInfo.getScreenWidth";

    @NotNull
    public static final String GET_SESSION_TOKEN = "com.unity3d.services.ads.api.AdViewer.getSessionToken";

    @NotNull
    public static final String HEADER_BIDDING_TOKEN_INCREMENT_STARTS = "com.unity3d.services.ads.api.AdViewer.hbTokenIncrementStarts";

    @NotNull
    public static final String HEADER_BIDDING_TOKEN_INCREMENT_WINS = "com.unity3d.services.ads.api.AdViewer.hbTokenIncrementWins";

    @NotNull
    public static final String HEADER_BIDDING_TOKEN_RESET = "com.unity3d.services.ads.api.AdViewer.hbTokenReset";

    @NotNull
    public static final String INCREMENT_BANNER_IMPRESSION_COUNT = "com.unity3d.services.ads.api.AdViewer.incrementBannerImpressionCount";

    @NotNull
    public static final ExposedFunctionLocation INSTANCE = new ExposedFunctionLocation();

    @NotNull
    public static final String IS_ATTRIBUTION_AVAILABLE = "com.unity3d.services.ads.api.AdViewer.isAttributionAvailable";

    @NotNull
    public static final String IS_FILE_CACHED = "com.unity3d.services.ads.api.AdViewer.isFileCached";

    @NotNull
    public static final String IS_OFFERWALL_AD_READY = "com.unity3d.services.ads.api.AdViewer.isOfferwallAdReady";

    @NotNull
    public static final String LEFT_APPLICATION = "com.unity3d.services.ads.api.AdViewer.leftApplication";

    @NotNull
    public static final String LOAD_COMPLETE = "com.unity3d.services.ads.api.AdViewer.loadComplete";

    @NotNull
    public static final String LOAD_ERROR = "com.unity3d.services.ads.api.AdViewer.loadError";

    @NotNull
    public static final String LOAD_OFFERWALL_AD = "com.unity3d.services.ads.api.AdViewer.loadOfferwallAd";

    @NotNull
    public static final String LOAD_SCAR_AD = "com.unity3d.services.ads.api.AdViewer.loadScarAd";

    @NotNull
    public static final String MARK_CAMPAIGN_STATE_SHOWN = "com.unity3d.services.ads.api.AdViewer.markCampaignStateAsShown";

    @NotNull
    public static final String OM_FINISH_SESSION = "com.unity3d.services.ads.api.AdViewer.omidFinishSession";

    @NotNull
    public static final String OM_GET_DATA = "com.unity3d.services.ads.api.AdViewer.omidGetData";

    @NotNull
    public static final String OM_IMPRESSION = "com.unity3d.services.ads.api.AdViewer.omidImpression";

    @NotNull
    public static final String OM_START_SESSION = "com.unity3d.services.ads.api.AdViewer.omidStartSession";

    @NotNull
    public static final String OPEN_URL = "com.unity3d.services.ads.api.AdViewer.openUrl";

    @NotNull
    public static final String REFRESH_AD_DATA = "com.unity3d.services.ads.api.AdViewer.refreshAdData";

    @NotNull
    public static final String REQUEST_GET = "com.unity3d.services.core.api.Request.get";

    @NotNull
    public static final String REQUEST_HEAD = "com.unity3d.services.core.api.Request.head";

    @NotNull
    public static final String REQUEST_POST = "com.unity3d.services.core.api.Request.post";

    @NotNull
    public static final String SEND_DIAGNOSTIC_EVENT = "com.unity3d.services.ads.api.AdViewer.sendDiagnosticEvent";

    @NotNull
    public static final String SEND_OPERATIVE_EVENT = "com.unity3d.services.ads.api.AdViewer.sendOperativeEvent";

    @NotNull
    public static final String SEND_PRIVACY_UPDATE_REQUEST = "com.unity3d.services.ads.api.AdViewer.sendPrivacyUpdateRequest";

    @NotNull
    public static final String SET_ALLOWED_PII = "com.unity3d.services.ads.api.AdViewer.setPrivacyAllowedPii";

    @NotNull
    public static final String SET_OPPORTUNITY_TTL = "com.unity3d.services.ads.api.AdViewer.setOpportunityTTL";

    @NotNull
    public static final String SET_ORIENTATION = "com.unity3d.services.ads.api.AdViewer.setOrientation";

    @NotNull
    public static final String SET_PRIVACY = "com.unity3d.services.ads.api.AdViewer.setPrivacyPayload";

    @NotNull
    public static final String SET_PRIVACY_FSM = "com.unity3d.services.ads.api.AdViewer.setPrivacyFsm";

    @NotNull
    public static final String SHOW_OFFERWALL_AD = "com.unity3d.services.ads.api.AdViewer.showOfferwallAd";

    @NotNull
    public static final String SHOW_SCAR_AD = "com.unity3d.services.ads.api.AdViewer.showScarAd";

    @NotNull
    public static final String STARTED = "com.unity3d.services.ads.api.AdViewer.started";

    @NotNull
    public static final String STORAGE_CLEAR = "com.unity3d.services.core.api.Storage.clear";

    @NotNull
    public static final String STORAGE_DELETE = "com.unity3d.services.core.api.Storage.delete";

    @NotNull
    public static final String STORAGE_GET = "com.unity3d.services.core.api.Storage.get";

    @NotNull
    public static final String STORAGE_GET_KEYS = "com.unity3d.services.core.api.Storage.getKeys";

    @NotNull
    public static final String STORAGE_READ = "com.unity3d.services.core.api.Storage.read";

    @NotNull
    public static final String STORAGE_SET = "com.unity3d.services.core.api.Storage.set";

    @NotNull
    public static final String STORAGE_WRITE = "com.unity3d.services.core.api.Storage.write";

    @NotNull
    public static final String UPDATE_CAMPAIGN_STATE = "com.unity3d.services.ads.api.AdViewer.updateCampaignState";

    @NotNull
    public static final String UPDATE_TRACKING_TOKEN = "com.unity3d.services.ads.api.AdViewer.updateTrackingToken";

    private ExposedFunctionLocation() {
    }
}
