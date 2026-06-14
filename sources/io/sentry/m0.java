package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b1 f83727a;

    public m0(b1 b1Var) {
        this.f83727a = b1Var;
    }

    @Override // io.sentry.b1
    public l1 A(e9 e9Var, g9 g9Var) {
        return this.f83727a.A(e9Var, g9Var);
    }

    @Override // io.sentry.b1
    public /* synthetic */ io.sentry.protocol.x B(Throwable th2) {
        return a1.b(this, th2);
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x C(io.sentry.protocol.e0 e0Var, b9 b9Var, i0 i0Var, y3 y3Var) {
        return this.f83727a.C(e0Var, b9Var, i0Var, y3Var);
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
        this.f83727a.F(l4Var, j4Var);
    }

    @Override // io.sentry.b1
    public y0 G() {
        return k5.u();
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x H(u3 u3Var) {
        return this.f83727a.H(u3Var);
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x I(w6 w6Var, i0 i0Var) {
        return this.f83727a.I(w6Var, i0Var);
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x J(Throwable th2, i0 i0Var) {
        return this.f83727a.J(th2, i0Var);
    }

    @Override // io.sentry.b1
    public b1 K(String str) {
        return this.f83727a.K(str);
    }

    @Override // io.sentry.b1
    public void a(e eVar, i0 i0Var) {
        this.f83727a.a(eVar, i0Var);
    }

    @Override // io.sentry.b1
    public void b(boolean z10) {
        this.f83727a.b(z10);
    }

    @Override // io.sentry.b1
    public void c(Throwable th2, j1 j1Var, String str) {
        this.f83727a.c(th2, j1Var, str);
    }

    @Override // io.sentry.b1
    public void d() {
        this.f83727a.d();
    }

    @Override // io.sentry.b1
    public void e(e eVar) {
        this.f83727a.e(eVar);
    }

    @Override // io.sentry.b1
    public void f() {
        this.f83727a.f();
    }

    @Override // io.sentry.b1
    public v7 getOptions() {
        return this.f83727a.getOptions();
    }

    @Override // io.sentry.b1
    public l1 getTransaction() {
        return this.f83727a.getTransaction();
    }

    @Override // io.sentry.b1
    public boolean isEnabled() {
        return this.f83727a.isEnabled();
    }

    @Override // io.sentry.b1
    public void j(long j10) {
        this.f83727a.j(j10);
    }

    @Override // io.sentry.b1
    public boolean u() {
        return this.f83727a.u();
    }

    @Override // io.sentry.b1
    public io.sentry.transport.b0 v() {
        return this.f83727a.v();
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x w(u5 u5Var, i0 i0Var) {
        return this.f83727a.w(u5Var, i0Var);
    }

    @Override // io.sentry.b1
    public /* synthetic */ void x(j4 j4Var) {
        a1.d(this, j4Var);
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x y(w7 w7Var, i0 i0Var) {
        return this.f83727a.y(w7Var, i0Var);
    }

    @Override // io.sentry.b1
    public /* synthetic */ io.sentry.protocol.x z(u5 u5Var) {
        return a1.a(this, u5Var);
    }

    @Override // io.sentry.b1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public s0 m7814clone() {
        return this.f83727a.m7817clone();
    }
}
