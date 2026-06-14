package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f58894b = new r("VAST", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f58895c = new r("MRAID", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f58896d = new r("STATIC", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ r[] f58897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f58898f;

    static {
        r[] rVarArrD = d();
        f58897e = rVarArrD;
        f58898f = qf.a.a(rVarArrD);
    }

    public r(String str, int i10) {
    }

    public static final /* synthetic */ r[] d() {
        return new r[]{f58894b, f58895c, f58896d};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f58897e.clone();
    }
}
