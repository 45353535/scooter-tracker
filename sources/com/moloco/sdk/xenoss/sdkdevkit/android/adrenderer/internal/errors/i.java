package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class i implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f56054b = new i("STATIC_BANNER_AD_UNKNOWN_ERROR", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f56055c = new i("STATIC_BANNER_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f56056d = new i("STATIC_BANNER_AD_WEBVIEW_RECEIVED_ERROR", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f56057e = new i("STATIC_BANNER_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ i[] f56058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f56059g;

    static {
        i[] iVarArrD = d();
        f56058f = iVarArrD;
        f56059g = qf.a.a(iVarArrD);
    }

    public i(String str, int i10) {
    }

    public static final /* synthetic */ i[] d() {
        return new i[]{f56054b, f56055c, f56056d, f56057e};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f56058f.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
