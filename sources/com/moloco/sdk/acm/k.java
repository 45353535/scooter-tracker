package com.moloco.sdk.acm;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f54087b = new k("INITIALIZED", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f54088c = new k("INITIALIZING", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f54089d = new k("UNINITIALIZED", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k[] f54090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f54091f;

    static {
        k[] kVarArrD = d();
        f54090e = kVarArrD;
        f54091f = qf.a.a(kVarArrD);
    }

    public k(String str, int i10) {
    }

    public static final /* synthetic */ k[] d() {
        return new k[]{f54087b, f54088c, f54089d};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f54090e.clone();
    }
}
