package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f56008b = new a("STATIC_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f56009c = new a("VAST_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f56010d = new a("MRAID_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f56011e = new a("NATIVE_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f56012f = new a("VAST_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f56013g = new a("MRAID_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f56014h = new a("STATIC_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f56015i = new a("VAST_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f56016j = new a("MRAID_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f56017k = new a("STATIC_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ a[] f56018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f56019m;

    static {
        a[] aVarArrD = d();
        f56018l = aVarArrD;
        f56019m = qf.a.a(aVarArrD);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] d() {
        return new a[]{f56008b, f56009c, f56010d, f56011e, f56012f, f56013g, f56014h, f56015i, f56016j, f56017k};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f56018l.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
