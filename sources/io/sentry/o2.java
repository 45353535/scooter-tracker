package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class o2 implements s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o2 f83776b = new o2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v7 f83777a = v7.empty();

    private o2() {
    }

    public static o2 g() {
        return f83776b;
    }

    @Override // io.sentry.b1
    public l1 A(e9 e9Var, g9 g9Var) {
        return h3.s();
    }

    @Override // io.sentry.b1
    public /* synthetic */ io.sentry.protocol.x B(Throwable th2) {
        return a1.b(this, th2);
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x C(io.sentry.protocol.e0 e0Var, b9 b9Var, i0 i0Var, y3 y3Var) {
        return io.sentry.protocol.x.f84062c;
    }

    @Override // io.sentry.b1
    public /* synthetic */ io.sentry.protocol.x D(io.sentry.protocol.e0 e0Var, b9 b9Var, i0 i0Var) {
        return a1.c(this, e0Var, b9Var, i0Var);
    }

    @Override // io.sentry.b1
    public boolean E() {
        return true;
    }

    @Override // io.sentry.b1
    public void F(l4 l4Var, j4 j4Var) {
    }

    @Override // io.sentry.b1
    public y0 G() {
        return u2.e();
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x H(u3 u3Var) {
        return io.sentry.protocol.x.f84062c;
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x I(w6 w6Var, i0 i0Var) {
        return io.sentry.protocol.x.f84062c;
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x J(Throwable th2, i0 i0Var) {
        return io.sentry.protocol.x.f84062c;
    }

    @Override // io.sentry.b1
    public b1 K(String str) {
        return w2.h();
    }

    @Override // io.sentry.b1
    public void a(e eVar, i0 i0Var) {
    }

    @Override // io.sentry.b1
    public void b(boolean z10) {
    }

    @Override // io.sentry.b1
    public void c(Throwable th2, j1 j1Var, String str) {
    }

    @Override // io.sentry.b1
    public void d() {
    }

    @Override // io.sentry.b1
    public void e(e eVar) {
    }

    @Override // io.sentry.b1
    public void f() {
    }

    @Override // io.sentry.b1
    public v7 getOptions() {
        return this.f83777a;
    }

    @Override // io.sentry.b1
    public l1 getTransaction() {
        return null;
    }

    @Override // io.sentry.b1
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.b1
    public void j(long j10) {
    }

    @Override // io.sentry.b1
    public boolean u() {
        return true;
    }

    @Override // io.sentry.b1
    public io.sentry.transport.b0 v() {
        return null;
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x w(u5 u5Var, i0 i0Var) {
        return io.sentry.protocol.x.f84062c;
    }

    @Override // io.sentry.b1
    public /* synthetic */ void x(j4 j4Var) {
        a1.d(this, j4Var);
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x y(w7 w7Var, i0 i0Var) {
        return io.sentry.protocol.x.f84062c;
    }

    @Override // io.sentry.b1
    public /* synthetic */ io.sentry.protocol.x z(u5 u5Var) {
        return a1.a(this, u5Var);
    }

    @Override // io.sentry.b1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public s0 m7815clone() {
        return f83776b;
    }
}
