package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class t4 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final t4 f84194a = new t4();

    private t4() {
    }

    public static t4 g() {
        return f84194a;
    }

    @Override // io.sentry.b1
    public l1 A(e9 e9Var, g9 g9Var) {
        return k5.M(e9Var, g9Var);
    }

    @Override // io.sentry.b1
    public /* synthetic */ io.sentry.protocol.x B(Throwable th2) {
        return a1.b(this, th2);
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x C(io.sentry.protocol.e0 e0Var, b9 b9Var, i0 i0Var, y3 y3Var) {
        return k5.t().C(e0Var, b9Var, i0Var, y3Var);
    }

    @Override // io.sentry.b1
    public /* synthetic */ io.sentry.protocol.x D(io.sentry.protocol.e0 e0Var, b9 b9Var, i0 i0Var) {
        return a1.c(this, e0Var, b9Var, i0Var);
    }

    @Override // io.sentry.b1
    public /* synthetic */ boolean E() {
        return a1.e(this);
    }

    @Override // io.sentry.b1
    public void F(l4 l4Var, j4 j4Var) {
        k5.o(l4Var, j4Var);
    }

    @Override // io.sentry.b1
    public y0 G() {
        return k5.u();
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x H(u3 u3Var) {
        return k5.t().H(u3Var);
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x I(w6 w6Var, i0 i0Var) {
        return k5.k(w6Var, i0Var);
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x J(Throwable th2, i0 i0Var) {
        return k5.m(th2, i0Var);
    }

    @Override // io.sentry.b1
    public b1 K(String str) {
        return k5.s(str);
    }

    @Override // io.sentry.b1
    public void a(e eVar, i0 i0Var) {
        k5.i(eVar, i0Var);
    }

    @Override // io.sentry.b1
    public void b(boolean z10) {
        k5.n();
    }

    @Override // io.sentry.b1
    public void c(Throwable th2, j1 j1Var, String str) {
        k5.t().c(th2, j1Var, str);
    }

    @Override // io.sentry.b1
    public void d() {
        k5.L();
    }

    @Override // io.sentry.b1
    public void e(e eVar) {
        a(eVar, new i0());
    }

    @Override // io.sentry.b1
    public void f() {
        k5.p();
    }

    @Override // io.sentry.b1
    public v7 getOptions() {
        return k5.t().getOptions();
    }

    @Override // io.sentry.b1
    public l1 getTransaction() {
        return k5.t().getTransaction();
    }

    @Override // io.sentry.b1
    public boolean isEnabled() {
        return k5.F();
    }

    @Override // io.sentry.b1
    public void j(long j10) {
        k5.r(j10);
    }

    @Override // io.sentry.b1
    public boolean u() {
        return k5.G();
    }

    @Override // io.sentry.b1
    public io.sentry.transport.b0 v() {
        return k5.t().v();
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x w(u5 u5Var, i0 i0Var) {
        return k5.t().w(u5Var, i0Var);
    }

    @Override // io.sentry.b1
    public /* synthetic */ void x(j4 j4Var) {
        a1.d(this, j4Var);
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x y(w7 w7Var, i0 i0Var) {
        return k5.t().y(w7Var, i0Var);
    }

    @Override // io.sentry.b1
    public /* synthetic */ io.sentry.protocol.x z(u5 u5Var) {
        return a1.a(this, u5Var);
    }

    @Override // io.sentry.b1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public s0 m7817clone() {
        return k5.t().m7817clone();
    }
}
