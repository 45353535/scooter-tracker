package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class g implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f56047b = new g("STATIC_AD_UNKNOWN_ERROR", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f56048c = new g("STATIC_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f56049d = new g("STATIC_AD_WEBVIEW_RECEIVED_ERROR", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f56050e = new g("STATIC_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g[] f56051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f56052g;

    static {
        g[] gVarArrD = d();
        f56051f = gVarArrD;
        f56052g = qf.a.a(gVarArrD);
    }

    public g(String str, int i10) {
    }

    public static final /* synthetic */ g[] d() {
        return new g[]{f56047b, f56048c, f56049d, f56050e};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f56051f.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
