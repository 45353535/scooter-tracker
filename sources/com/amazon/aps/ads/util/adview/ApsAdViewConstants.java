package com.amazon.aps.ads.util.adview;

import com.taurusx.tax.f.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/amazon/aps/ads/util/adview/ApsAdViewConstants;", "", y.f66058y, "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ApsAdViewConstants {

    @NotNull
    public static final String ADDITIONAL_WEBVIEW_METRICS = "additional_webview_metric";

    @NotNull
    public static final String AD_INFO_FEATURE = "webviewAdInfo_feature";
    public static final int AD_INFO_MATCHER_NUMBER = 4;

    @NotNull
    public static final String AD_INFO_PATTERN = "amzn.dtb.loadAd\\(\\\"(.*)\\\", \\\"(.*)\\\", \\\"(.*)\\\".*isv: (\\w+)";

    @NotNull
    public static final String AMAZON_AD_INFO = "amazon_ad_info";

    @NotNull
    public static final String AMAZON_BRIDGE = "amzn_bridge";

    @NotNull
    public static final String AMAZON_INFO = "{bidID:'%s',aaxHost:'%s',pricePoint:'%s'}";

    @NotNull
    public static final String BID_HTML = "bid_html_template";

    @NotNull
    public static final String BID_IDENTIFIER = "bid_identifier";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String ENV_TEMPLATE = "window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,impFired:true,mobileDeviceInfo:%s};";

    @NotNull
    public static final String ENV_TEMPLATE_INFO = "window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,amznAdInfo:%s,impFired:true,mobileDeviceInfo:%s};";

    @NotNull
    public static final String EVENT_JSON_SUBTYPE = "subtype";

    @NotNull
    public static final String EVENT_SERVER_PARAMETER = "event_server_parameter";

    @NotNull
    public static final String EXPECTED_HEIGHT = "expected_height";

    @NotNull
    public static final String EXPECTED_WIDTH = "expected_width";

    @NotNull
    public static final String HOSTNAME_IDENTIFIER = "hostname_identifier";

    @NotNull
    public static final String MOBILE_DEVICE_INFO = "{os:'%s',fwk:'%s',osVersion:'%s',model:'%s',screenSize:'%s',orientation:'%s'}";

    @NotNull
    public static final String MRAID_IDENTIFIER = "MRAID_ENV";

    @NotNull
    public static final String ON_DISPLAY_AD_FAILED_TO_LOAD = "onAdFailedToLoad";

    @NotNull
    public static final String ON_DISPLAY_AD_LOADED = "onAdLoaded";

    @NotNull
    public static final String ON_END_CARD_CLOSED = "END_CARD_VIDEO_CLOSED";

    @NotNull
    public static final String ON_END_CARD_COMPANION_AD_START = "END_CARD_COMPANION_AD_START";

    @NotNull
    public static final String ON_VIDEO_AD_FAILED_TO_LOAD = "AD_FAILED_TO_LOAD";

    @NotNull
    public static final String ON_VIDEO_AD_LOADED = "AD_LOADED";

    @NotNull
    public static final String REQUEST_QUEUE = "amazon_request_queue";

    @NotNull
    public static final String SMARTBANNER_STATE = "smart_banner_state";

    @NotNull
    public static final String START_LOAD_TIME = "start_load_time";

    @NotNull
    public static final String VIDEO = "video_flag";

    @NotNull
    public static final String VIDEO_CLICK_EVENT = "AD_VIDEO_PLAYER_CLICKED";

    @NotNull
    public static final String VIDEO_COMPLETE_EVENT = "AD_VIDEO_PLAYER_COMPLETED";

    @NotNull
    public static final String VIDEO_EVENT_JS_COMMAND_TYPE = "apsvid";

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0086T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/amazon/aps/ads/util/adview/ApsAdViewConstants$Companion;", "", "<init>", "()V", "BID_HTML", "", "BID_IDENTIFIER", "HOSTNAME_IDENTIFIER", "EVENT_SERVER_PARAMETER", "EXPECTED_WIDTH", "EXPECTED_HEIGHT", "START_LOAD_TIME", "AMAZON_AD_INFO", "REQUEST_QUEUE", "SMARTBANNER_STATE", "VIDEO", "AMAZON_BRIDGE", "VIDEO_COMPLETE_EVENT", "VIDEO_CLICK_EVENT", "ON_VIDEO_AD_LOADED", "ON_VIDEO_AD_FAILED_TO_LOAD", "ON_END_CARD_CLOSED", "ON_END_CARD_COMPANION_AD_START", "ON_DISPLAY_AD_LOADED", "ON_DISPLAY_AD_FAILED_TO_LOAD", "VIDEO_EVENT_JS_COMMAND_TYPE", "EVENT_JSON_SUBTYPE", "AD_INFO_FEATURE", "ADDITIONAL_WEBVIEW_METRICS", "MRAID_IDENTIFIER", "ENV_TEMPLATE", "ENV_TEMPLATE_INFO", "AMAZON_INFO", "MOBILE_DEVICE_INFO", "AD_INFO_PATTERN", "AD_INFO_MATCHER_NUMBER", "", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String ADDITIONAL_WEBVIEW_METRICS = "additional_webview_metric";

        @NotNull
        public static final String AD_INFO_FEATURE = "webviewAdInfo_feature";
        public static final int AD_INFO_MATCHER_NUMBER = 4;

        @NotNull
        public static final String AD_INFO_PATTERN = "amzn.dtb.loadAd\\(\\\"(.*)\\\", \\\"(.*)\\\", \\\"(.*)\\\".*isv: (\\w+)";

        @NotNull
        public static final String AMAZON_AD_INFO = "amazon_ad_info";

        @NotNull
        public static final String AMAZON_BRIDGE = "amzn_bridge";

        @NotNull
        public static final String AMAZON_INFO = "{bidID:'%s',aaxHost:'%s',pricePoint:'%s'}";

        @NotNull
        public static final String BID_HTML = "bid_html_template";

        @NotNull
        public static final String BID_IDENTIFIER = "bid_identifier";

        @NotNull
        public static final String ENV_TEMPLATE = "window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,impFired:true,mobileDeviceInfo:%s};";

        @NotNull
        public static final String ENV_TEMPLATE_INFO = "window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,amznAdInfo:%s,impFired:true,mobileDeviceInfo:%s};";

        @NotNull
        public static final String EVENT_JSON_SUBTYPE = "subtype";

        @NotNull
        public static final String EVENT_SERVER_PARAMETER = "event_server_parameter";

        @NotNull
        public static final String EXPECTED_HEIGHT = "expected_height";

        @NotNull
        public static final String EXPECTED_WIDTH = "expected_width";

        @NotNull
        public static final String HOSTNAME_IDENTIFIER = "hostname_identifier";

        @NotNull
        public static final String MOBILE_DEVICE_INFO = "{os:'%s',fwk:'%s',osVersion:'%s',model:'%s',screenSize:'%s',orientation:'%s'}";

        @NotNull
        public static final String MRAID_IDENTIFIER = "MRAID_ENV";

        @NotNull
        public static final String ON_DISPLAY_AD_FAILED_TO_LOAD = "onAdFailedToLoad";

        @NotNull
        public static final String ON_DISPLAY_AD_LOADED = "onAdLoaded";

        @NotNull
        public static final String ON_END_CARD_CLOSED = "END_CARD_VIDEO_CLOSED";

        @NotNull
        public static final String ON_END_CARD_COMPANION_AD_START = "END_CARD_COMPANION_AD_START";

        @NotNull
        public static final String ON_VIDEO_AD_FAILED_TO_LOAD = "AD_FAILED_TO_LOAD";

        @NotNull
        public static final String ON_VIDEO_AD_LOADED = "AD_LOADED";

        @NotNull
        public static final String REQUEST_QUEUE = "amazon_request_queue";

        @NotNull
        public static final String SMARTBANNER_STATE = "smart_banner_state";

        @NotNull
        public static final String START_LOAD_TIME = "start_load_time";

        @NotNull
        public static final String VIDEO = "video_flag";

        @NotNull
        public static final String VIDEO_CLICK_EVENT = "AD_VIDEO_PLAYER_CLICKED";

        @NotNull
        public static final String VIDEO_COMPLETE_EVENT = "AD_VIDEO_PLAYER_COMPLETED";

        @NotNull
        public static final String VIDEO_EVENT_JS_COMMAND_TYPE = "apsvid";

        private Companion() {
        }
    }
}
