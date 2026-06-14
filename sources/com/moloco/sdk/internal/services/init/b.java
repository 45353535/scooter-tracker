package com.moloco.sdk.internal.services.init;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f55608b = new b("RequestTimeout", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f55609c = new b("UnknownHostHttpError", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f55610d = new b("HttpSocketError", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f55611e = new b("HttpSslError", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f55612f = new b("PersistentHttpUnavailableError", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f55613g = new b("Unknown", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b[] f55614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f55615i;

    static {
        b[] bVarArrD = d();
        f55614h = bVarArrD;
        f55615i = qf.a.a(bVarArrD);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] d() {
        return new b[]{f55608b, f55609c, f55610d, f55611e, f55612f, f55613g};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f55614h.clone();
    }
}
