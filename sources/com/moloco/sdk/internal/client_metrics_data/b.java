package com.moloco.sdk.internal.client_metrics_data;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final /* synthetic */ b[] Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f54148a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f54149c = new b("SDKInitAttempt", 0, "sdk_init_attempt");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f54150d = new b("SDKInitSuccess", 1, "sdk_init_success");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f54151e = new b("SDKInitFailure", 2, "sdk_init_failure");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f54152f = new b("SDKPerformInitAttempt", 3, "sdk_perform_init_attempt");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f54153g = new b("SDKFetchInitAttempt", 4, "sdk_fetch_init_attempt");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f54154h = new b("SDKInitCacheRead", 5, "sdk_init_cache_read");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f54155i = new b("SDKInitCacheWrite", 6, "sdk_init_cache_write");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f54156j = new b("SDKInitCacheClear", 7, "sdk_init_cache_clear");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f54157k = new b("SDKInitFailureDifferentAppKey", 8, "sdk_init_failure_different_app_key");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f54158l = new b("CreateAd", 9, "create_ad");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f54159m = new b("LoadAdAttempt", 10, "load_ad_attempted");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f54160n = new b("LoadAdSuccess", 11, "load_ad_success");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f54161o = new b("LoadAdFailed", 12, "load_ad_failed");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f54162p = new b("NativeAdLoadAdAttempted", 13, "native_ad_load_attempted");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f54163q = new b("NativeLoadAd", 14, "native_ad_load");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f54164r = new b("BidTokenGetRequest", 15, "bid_token_get_request");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f54165s = new b("BidTokenGetResponse", 16, "bid_token_get_response");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f54166t = new b("BidTokenFetch", 17, "bid_token_fetch");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f54167u = new b("BidTokenDurationTimeoutOneSecond", 18, "bid_token_duration_crossed_1s");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f54168v = new b("BidTokenDurationTimeoutThreeSecond", 19, "bid_token_duration_crossed_3s");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f54169w = new b("ServerBidTokenFetch", 20, "sbt_fetch");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f54170x = new b("ServerBidTokenCached", 21, "sbt_cached");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f54171y = new b("ServerBidTokenApiFetch", 22, "sbt_api_fetch");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f54172z = new b("ServerBidTokenAsyncRefresh", 23, "sbt_async_fetch");
    public static final b A = new b("ClientBidTokenBuild", 24, "bid_token_build");
    public static final b B = new b("ClientBidTokenCached", 25, "cbt_cached");
    public static final b C = new b("ShowAdAttempt", 26, "show_ad_attempted");
    public static final b D = new b("ShowAdSuccess", 27, "show_ad_success");
    public static final b E = new b("ShowAdFailed", 28, "show_ad_failed");
    public static final b F = new b("AdClicked", 29, "ad_clicked");
    public static final b G = new b("AdClickedDeduped", 30, "ad_clicked_deduped");
    public static final b H = new b("CrashDetected", 31, "crash_detected");
    public static final b I = new b("WebviewLoadAd", 32, "webview_load_ad");
    public static final b J = new b("WebviewHtmlAdError", 33, "webview_html_ad_error");
    public static final b K = new b("WebviewHtmlAdRetryAttempt", 34, "webview_html_ad_retry_attempt");
    public static final b L = new b("WebviewHtmlAdIgnoredError", 35, "webview_html_ad_ignored_error");
    public static final b M = new b("WebviewEventHandled", 36, "webview_event_handled");
    public static final b N = new b("WebviewEventMultipleHandlers", 37, "webview_event_multiple_handlers");
    public static final b O = new b("WebviewPageLoadStart", 38, "webview_page_load_start");
    public static final b P = new b("WebviewPageLoadEnd", 39, "webview_page_load_end");
    public static final b Q = new b("WebviewPageLoadFinishCallback", 40, "webview_page_load_finish_callback");
    public static final b R = new b("WebviewRequiredContentLoaded", 41, "webview_required_content_loaded");
    public static final b S = new b("StoreLaunchStarted", 42, "store_launch_started");
    public static final b T = new b("StoreLaunchComplete", 43, "store_launch_complete");
    public static final b U = new b("TemplateBridgeNotifyReadyInvoked", 44, "template_bridge_notify_ready_invoked");
    public static final b V = new b("TemplateBridgeNotifyReadyCompleted", 45, "template_bridge_notify_ready_completed");
    public static final b W = new b("TemplateBridgeViewVisibleInvoked", 46, "template_bridge_view_visible_invoked");
    public static final b X = new b("TemplateBridgeViewVisibleCompleted", 47, "template_bridge_view_visible_completed");
    public static final b Y = new b("FullscreenWebviewActivityOnCreate", 48, "fullscreen_webview_activity_create");

    static {
        b[] bVarArrD = d();
        Z = bVarArrD;
        f54148a0 = qf.a.a(bVarArrD);
    }

    public b(String str, int i10, String str2) {
        this.f54173b = str2;
    }

    public static final /* synthetic */ b[] d() {
        return new b[]{f54149c, f54150d, f54151e, f54152f, f54153g, f54154h, f54155i, f54156j, f54157k, f54158l, f54159m, f54160n, f54161o, f54162p, f54163q, f54164r, f54165s, f54166t, f54167u, f54168v, f54169w, f54170x, f54171y, f54172z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) Z.clone();
    }

    public final String g() {
        return this.f54173b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f54173b;
    }
}
