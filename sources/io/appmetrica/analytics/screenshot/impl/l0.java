package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f79030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f79031b;

    public l0(boolean z10, long j10) {
        this.f79030a = z10;
        this.f79031b = j10;
    }

    public final long a() {
        return this.f79031b;
    }

    public final boolean b() {
        return this.f79030a;
    }

    public final String toString() {
        return "ServiceSideServiceCaptorConfig(enabled=" + this.f79030a + ", delaySeconds=" + this.f79031b + ')';
    }

    public l0(a0 a0Var) {
        this(a0Var.b(), a0Var.a());
    }
}
