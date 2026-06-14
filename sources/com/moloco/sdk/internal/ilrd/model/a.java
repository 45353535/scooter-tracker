package com.moloco.sdk.internal.ilrd.model;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f54418b = new a("MAX", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f54419c = new a("LEVELPLAY", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f54420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f54421e;

    static {
        a[] aVarArrD = d();
        f54420d = aVarArrD;
        f54421e = qf.a.a(aVarArrD);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] d() {
        return new a[]{f54418b, f54419c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f54420d.clone();
    }
}
