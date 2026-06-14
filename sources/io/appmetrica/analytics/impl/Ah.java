package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class Ah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W5 f75523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f75526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Kh f75527e;

    public Ah(W5 w52, boolean z10, int i10, HashMap map, Kh kh2) {
        this.f75523a = w52;
        this.f75524b = z10;
        this.f75525c = i10;
        this.f75526d = map;
        this.f75527e = kh2;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f75523a + ", serviceDataReporterType=" + this.f75525c + ", environment=" + this.f75527e + ", isCrashReport=" + this.f75524b + ", trimmedFields=" + this.f75526d + ')';
    }
}
