package com.moloco.sdk.internal.services;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f55696b = new j0("SILENT", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f55697c = new j0("VIBRATE", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j0 f55698d = new j0("NORMAL", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ j0[] f55699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f55700f;

    static {
        j0[] j0VarArrD = d();
        f55699e = j0VarArrD;
        f55700f = qf.a.a(j0VarArrD);
    }

    public j0(String str, int i10) {
    }

    public static final /* synthetic */ j0[] d() {
        return new j0[]{f55696b, f55697c, f55698d};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f55699e.clone();
    }
}
