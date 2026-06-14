package com.moloco.sdk.internal.client_metrics_data;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f54174c = new c("Reason", 0, "reason");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f54175d = new c("AdType", 1, "ad_type");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f54176e = new c("Result", 2, "result");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f54177f = new c("Country", 3, "country");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f54178g = new c("RetryAttempt", 4, "attempt");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f54179h = new c("Step", 5, "step");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ c[] f54180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f54181j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54182b;

    static {
        c[] cVarArrD = d();
        f54180i = cVarArrD;
        f54181j = qf.a.a(cVarArrD);
    }

    public c(String str, int i10, String str2) {
        this.f54182b = str2;
    }

    public static final /* synthetic */ c[] d() {
        return new c[]{f54174c, f54175d, f54176e, f54177f, f54178g, f54179h};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f54180i.clone();
    }

    public final String g() {
        return this.f54182b;
    }
}
