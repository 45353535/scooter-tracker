package com.moloco.sdk.internal.publisher;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f54776b = new j0("BANNER", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f54777c = new j0("BANNER_TABLET", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j0 f54778d = new j0("MREC", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j0 f54779e = new j0("NATIVE_AD_MEDIATION", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j0 f54780f = new j0("NATIVE_BANNER", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j0 f54781g = new j0("INTERSTITIAL", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j0 f54782h = new j0(com.taurusx.tax.w.s.w.f67531f, 6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ j0[] f54783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f54784j;

    static {
        j0[] j0VarArrD = d();
        f54783i = j0VarArrD;
        f54784j = qf.a.a(j0VarArrD);
    }

    public j0(String str, int i10) {
    }

    public static final /* synthetic */ j0[] d() {
        return new j0[]{f54776b, f54777c, f54778d, f54779e, f54780f, f54781g, f54782h};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f54783i.clone();
    }
}
