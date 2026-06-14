package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f56511b = new t("SkipOrClose", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f56512c = new t(com.taurusx.tax.f.s.f66022o, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ t[] f56513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f56514e;

    static {
        t[] tVarArrD = d();
        f56513d = tVarArrD;
        f56514e = qf.a.a(tVarArrD);
    }

    public t(String str, int i10) {
    }

    public static final /* synthetic */ t[] d() {
        return new t[]{f56511b, f56512c};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f56513d.clone();
    }
}
