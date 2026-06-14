package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f57652c = new z("XmlParsing", 0, 100);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f57653d = new z(com.taurusx.tax.f.w.f66049y, 1, 300);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z f57654e = new z("WrapperTimeout", 2, 301);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z f57655f = new z("WrapperLimit", 3, 302);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z f57656g = new z("WrapperNoAds", 4, 303);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final z f57657h = new z(com.taurusx.tax.f.y.f66052c, 5, 400);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z f57658i = new z("LinearFileNotFound", 6, 401);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final z f57659j = new z("LinearNotSupportedMedia", 7, 403);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final z f57660k = new z(com.taurusx.tax.f.y.f66058y, 8, 600);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final z f57661l = new z("Undefined", 9, 900);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ z[] f57662m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f57663n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57664b;

    static {
        z[] zVarArrD = d();
        f57662m = zVarArrD;
        f57663n = qf.a.a(zVarArrD);
    }

    public z(String str, int i10, int i11) {
        this.f57664b = i11;
    }

    public static final /* synthetic */ z[] d() {
        return new z[]{f57652c, f57653d, f57654e, f57655f, f57656g, f57657h, f57658i, f57659j, f57660k, f57661l};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f57662m.clone();
    }

    public final int g() {
        return this.f57664b;
    }
}
