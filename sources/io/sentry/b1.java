package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public interface b1 {
    l1 A(e9 e9Var, g9 g9Var);

    io.sentry.protocol.x B(Throwable th2);

    io.sentry.protocol.x C(io.sentry.protocol.e0 e0Var, b9 b9Var, i0 i0Var, y3 y3Var);

    io.sentry.protocol.x D(io.sentry.protocol.e0 e0Var, b9 b9Var, i0 i0Var);

    boolean E();

    void F(l4 l4Var, j4 j4Var);

    y0 G();

    io.sentry.protocol.x H(u3 u3Var);

    io.sentry.protocol.x I(w6 w6Var, i0 i0Var);

    io.sentry.protocol.x J(Throwable th2, i0 i0Var);

    b1 K(String str);

    void a(e eVar, i0 i0Var);

    void b(boolean z10);

    void c(Throwable th2, j1 j1Var, String str);

    s0 clone();

    void d();

    void e(e eVar);

    void f();

    v7 getOptions();

    l1 getTransaction();

    boolean isEnabled();

    void j(long j10);

    boolean u();

    io.sentry.transport.b0 v();

    io.sentry.protocol.x w(u5 u5Var, i0 i0Var);

    void x(j4 j4Var);

    io.sentry.protocol.x y(w7 w7Var, i0 i0Var);

    io.sentry.protocol.x z(u5 u5Var);
}
