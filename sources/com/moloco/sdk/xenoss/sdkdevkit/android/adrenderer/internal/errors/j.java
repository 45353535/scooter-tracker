package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class j implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f56060b = new j("STATIC_FULLSCREEN_AD_UNKNOWN_ERROR", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f56061c = new j("STATIC_FULLSCREEN_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f56062d = new j("STATIC_FULLSCREEN_AD_WEBVIEW_RECEIVED_ERROR", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f56063e = new j("STATIC_FULLSCREEN_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j[] f56064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f56065g;

    static {
        j[] jVarArrD = d();
        f56064f = jVarArrD;
        f56065g = qf.a.a(jVarArrD);
    }

    public j(String str, int i10) {
    }

    public static final /* synthetic */ j[] d() {
        return new j[]{f56060b, f56061c, f56062d, f56063e};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f56064f.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
