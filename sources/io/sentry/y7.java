package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
final class y7 implements d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f84496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f84497c;

    public y7(String str, String str2) {
        this.f84496b = str;
        this.f84497c = str2;
    }

    private n5 a(n5 n5Var) {
        if (n5Var.C().i() == null) {
            n5Var.C().x(new io.sentry.protocol.z());
        }
        io.sentry.protocol.z zVarI = n5Var.C().i();
        if (zVarI != null && zVarI.d() == null && zVarI.e() == null) {
            zVarI.f(this.f84497c);
            zVarI.h(this.f84496b);
        }
        return n5Var;
    }

    @Override // io.sentry.d0
    public /* synthetic */ w7 c(w7 w7Var, i0 i0Var) {
        return c0.a(this, w7Var, i0Var);
    }

    @Override // io.sentry.d0
    public w6 d(w6 w6Var, i0 i0Var) {
        return (w6) a(w6Var);
    }

    @Override // io.sentry.d0
    public io.sentry.protocol.e0 e(io.sentry.protocol.e0 e0Var, i0 i0Var) {
        return (io.sentry.protocol.e0) a(e0Var);
    }

    public y7() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }
}
