package io.sentry;

import io.sentry.h4;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public interface y0 {
    String A();

    a4 B();

    List C();

    a4 D(h4.a aVar);

    void E(h4.c cVar);

    void F(io.sentry.protocol.x xVar);

    void a(e eVar, i0 i0Var);

    void c(Throwable th2, j1 j1Var, String str);

    void clear();

    /* JADX INFO: renamed from: clone */
    y0 m7813clone();

    h4.d d();

    k8 f();

    void g(io.sentry.protocol.x xVar);

    Map getExtras();

    io.sentry.protocol.g getFeatureFlags();

    g7 getLevel();

    v7 getOptions();

    io.sentry.protocol.o getRequest();

    k8 getSession();

    l1 getTransaction();

    io.sentry.protocol.i0 getUser();

    Queue h();

    k8 i(h4.b bVar);

    Map j();

    io.sentry.protocol.c k();

    void l(l1 l1Var);

    void m();

    io.sentry.featureflags.b n();

    void o(e1 e1Var);

    io.sentry.protocol.x p();

    void q(String str);

    e1 r();

    void s(w6 w6Var);

    List t();

    void u(a4 a4Var);

    void v(v7 v7Var);

    j1 w();

    List x();

    String y();

    List z();
}
