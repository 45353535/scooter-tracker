package com.moloco.sdk.internal.client_metrics_data;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f54183c = new d("SDKInit", 0, "sdk_init_time");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f54184d = new d("SDKPerformInitAttempt", 1, "sdk_perform_init_time_ms");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f54185e = new d("SDKInitHttpRequest", 2, "sdk_init_request_time_ms");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f54186f = new d("SDKInitCacheRead", 3, "sdk_init_cache_read_time_ms");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f54187g = new d("SDKInitCacheWrite", 4, "sdk_init_cache_write_time_ms");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f54188h = new d("SDKInitCacheClear", 5, "sdk_init_cache_clear_time_ms");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f54189i = new d("CreateAd", 6, "create_ad_time_ms");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f54190j = new d("CreateAdAwaitAdFactory", 7, "create_ad_await_ad_factory_time_ms");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f54191k = new d("LoadAd", 8, "load_ad_time");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f54192l = new d("NativePrepareAd", 9, "native_ad_load_prepare_time");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f54193m = new d("BidTokenFetch", 10, "bid_token_fetch_time");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f54194n = new d("ServerBidTokenFetch", 11, "sbt_fetch_time_ms");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f54195o = new d("ServerBidTokenApiFetchTime", 12, "sbt_api_fetch_time_ms");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f54196p = new d("ClientBidTokenBuild", 13, "bid_token_build_time_ms");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f54197q = new d("LoadToShow", 14, "load_to_show_time");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f54198r = new d("CreateToLoad", 15, "ad_create_to_load_ms");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f54199s = new d("WebviewLoadAd", 16, "webview_load_ad_ms");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f54200t = new d("WebviewEventHandled", 17, "webview_event_handled_time_ms");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f54201u = new d("WebviewEventHandlerLatency", 18, "webview_event_handler_latency_ms");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f54202v = new d("WebviewPageLoadLatency", 19, "webview_page_load_ms");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f54203w = new d("WebviewRequiredContentLoadLatency", 20, "webview_required_content_load_ms");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ d[] f54204x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f54205y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54206b;

    static {
        d[] dVarArrD = d();
        f54204x = dVarArrD;
        f54205y = qf.a.a(dVarArrD);
    }

    public d(String str, int i10, String str2) {
        this.f54206b = str2;
    }

    public static final /* synthetic */ d[] d() {
        return new d[]{f54183c, f54184d, f54185e, f54186f, f54187g, f54188h, f54189i, f54190j, f54191k, f54192l, f54193m, f54194n, f54195o, f54196p, f54197q, f54198r, f54199s, f54200t, f54201u, f54202v, f54203w};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f54204x.clone();
    }

    public final String g() {
        return this.f54206b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f54206b;
    }
}
