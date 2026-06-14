package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f56023b = new d("MRAID_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f56024c = new d("MRAID_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f56025d = new d("MRAID_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f56026e = new d("MRAID_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f56027f = new d("MRAID_WEBVIEW_INTERNAL_TIMEOUT_ERROR", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f56028g = new d("MRAID_FULLSCREEN_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f56029h = new d("MRAID_FULLSCREEN_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f56030i = new d("MRAID_FULLSCREEN_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f56031j = new d("MRAID_FULLSCREEN_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f56032k = new d("MRAID_FULLSCREEN_AD_ACTIVITY_SHOW_FAILED_ERROR", 9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f56033l = new d("MRAID_BANNER_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f56034m = new d("MRAID_BANNER_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f56035n = new d("MRAID_BANNER_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f56036o = new d("MRAID_BANNER_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ d[] f56037p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f56038q;

    static {
        d[] dVarArrD = d();
        f56037p = dVarArrD;
        f56038q = qf.a.a(dVarArrD);
    }

    public d(String str, int i10) {
    }

    public static final /* synthetic */ d[] d() {
        return new d[]{f56023b, f56024c, f56025d, f56026e, f56027f, f56028g, f56029h, f56030i, f56031j, f56032k, f56033l, f56034m, f56035n, f56036o};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f56037p.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
