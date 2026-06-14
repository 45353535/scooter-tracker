package com.moloco.sdk.internal.services.bidtoken;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f55289b = new c("NEEDS_REFRESH", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f55290c = new c("EXPIRING", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f55291d = new c("NO_REFRESH_NEEDED", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c[] f55292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f55293f;

    static {
        c[] cVarArrD = d();
        f55292e = cVarArrD;
        f55293f = qf.a.a(cVarArrD);
    }

    public c(String str, int i10) {
    }

    public static final /* synthetic */ c[] d() {
        return new c[]{f55289b, f55290c, f55291d};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f55292e.clone();
    }

    public final boolean g() {
        return this == f55290c || this == f55291d;
    }
}
