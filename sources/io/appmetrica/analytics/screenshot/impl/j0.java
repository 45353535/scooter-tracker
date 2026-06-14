package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f79020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f79021b;

    public j0(boolean z10, k0 k0Var) {
        this.f79020a = z10;
        this.f79021b = k0Var;
    }

    public final k0 a() {
        return this.f79021b;
    }

    public final boolean b() {
        return this.f79020a;
    }

    public final String toString() {
        return "ServiceSideRemoteScreenshotConfig(enabled=" + this.f79020a + ", config=" + this.f79021b + ')';
    }

    public j0() {
        this(new J());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(J j10) {
        boolean zB = j10.b();
        W wA = j10.a();
        this(zB, wA != null ? new k0(wA) : null);
    }
}
