package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f79025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f79026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f79027c;

    public k0(h0 h0Var, l0 l0Var, i0 i0Var) {
        this.f79025a = h0Var;
        this.f79026b = l0Var;
        this.f79027c = i0Var;
    }

    public final h0 a() {
        return this.f79025a;
    }

    public final i0 b() {
        return this.f79027c;
    }

    public final l0 c() {
        return this.f79026b;
    }

    public final String toString() {
        return "ServiceSideScreenshotConfig(apiCaptorConfig=" + this.f79025a + ", serviceCaptorConfig=" + this.f79026b + ", contentObserverCaptorConfig=" + this.f79027c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k0(W w10) {
        C5611e c5611eA = w10.a();
        h0 h0Var = c5611eA != null ? new h0(c5611eA) : null;
        a0 a0VarC = w10.c();
        l0 l0Var = a0VarC != null ? new l0(a0VarC) : null;
        C5622p c5622pB = w10.b();
        this(h0Var, l0Var, c5622pB != null ? new i0(c5622pB) : null);
    }
}
