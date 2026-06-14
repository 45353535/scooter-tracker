package com.moloco.sdk.internal.services;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f55589b = new h("UNKNOWN", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f55590c = new h("PORTRAIT", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f55591d = new h("LANDSCAPE", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h[] f55592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f55593f;

    static {
        h[] hVarArrD = d();
        f55592e = hVarArrD;
        f55593f = qf.a.a(hVarArrD);
    }

    public h(String str, int i10) {
    }

    public static final /* synthetic */ h[] d() {
        return new h[]{f55589b, f55590c, f55591d};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f55592e.clone();
    }
}
