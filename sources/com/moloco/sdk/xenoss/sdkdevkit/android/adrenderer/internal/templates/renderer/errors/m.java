package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class m implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f56891b = new m("UNKNOWN_ERROR", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f56892c = new m("WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f56893d = new m("WEBVIEW_RECEIVED_ERROR", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f56894e = new m("WEBVIEW_REQUIRED_CONTENT_HTTP_ERROR", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f56895f = new m("WEBVIEW_RENDER_PROCESS_GONE_ERROR", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f56896g = new m("WEBVIEW_TIMEOUT_ERROR", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m f56897h = new m("WEBVIEW_NOT_AVAILABLE_ERROR", 6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ m[] f56898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f56899j;

    static {
        m[] mVarArrD = d();
        f56898i = mVarArrD;
        f56899j = qf.a.a(mVarArrD);
    }

    public m(String str, int i10) {
    }

    public static final /* synthetic */ m[] d() {
        return new m[]{f56891b, f56892c, f56893d, f56894e, f56895f, f56896g, f56897h};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f56898i.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
