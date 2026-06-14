package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5611e f78983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f78984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5622p f78985c;

    public W(C5611e c5611e, a0 a0Var, C5622p c5622p) {
        this.f78983a = c5611e;
        this.f78984b = a0Var;
        this.f78985c = c5622p;
    }

    public final C5611e a() {
        return this.f78983a;
    }

    public final C5622p b() {
        return this.f78985c;
    }

    public final a0 c() {
        return this.f78984b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.f78983a + ", serviceCaptorConfig=" + this.f78984b + ", contentObserverCaptorConfig=" + this.f78985c + ')';
    }

    public W() {
        this(new C5611e(), new a0(), new C5622p());
    }
}
