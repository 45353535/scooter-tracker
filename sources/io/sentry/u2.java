package io.sentry;

import io.sentry.h4;
import io.sentry.util.q;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class u2 implements y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u2 f84259b = new u2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.q f84260a = new io.sentry.util.q(new q.a() { // from class: io.sentry.t2
        @Override // io.sentry.util.q.a
        public final Object a() {
            return v7.empty();
        }
    });

    private u2() {
    }

    public static u2 e() {
        return f84259b;
    }

    @Override // io.sentry.y0
    public String A() {
        return null;
    }

    @Override // io.sentry.y0
    public a4 B() {
        return new a4();
    }

    @Override // io.sentry.y0
    public List C() {
        return new ArrayList();
    }

    @Override // io.sentry.y0
    public a4 D(h4.a aVar) {
        return new a4();
    }

    @Override // io.sentry.y0
    public void E(h4.c cVar) {
    }

    @Override // io.sentry.y0
    public void F(io.sentry.protocol.x xVar) {
    }

    @Override // io.sentry.y0
    public void a(e eVar, i0 i0Var) {
    }

    @Override // io.sentry.y0
    public void c(Throwable th2, j1 j1Var, String str) {
    }

    @Override // io.sentry.y0
    public void clear() {
    }

    @Override // io.sentry.y0
    public h4.d d() {
        return null;
    }

    @Override // io.sentry.y0
    public k8 f() {
        return null;
    }

    @Override // io.sentry.y0
    public void g(io.sentry.protocol.x xVar) {
    }

    @Override // io.sentry.y0
    public Map getExtras() {
        return new HashMap();
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.g getFeatureFlags() {
        return null;
    }

    @Override // io.sentry.y0
    public g7 getLevel() {
        return null;
    }

    @Override // io.sentry.y0
    public v7 getOptions() {
        return (v7) this.f84260a.a();
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.o getRequest() {
        return null;
    }

    @Override // io.sentry.y0
    public k8 getSession() {
        return null;
    }

    @Override // io.sentry.y0
    public l1 getTransaction() {
        return null;
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.i0 getUser() {
        return null;
    }

    @Override // io.sentry.y0
    public Queue h() {
        return new ArrayDeque();
    }

    @Override // io.sentry.y0
    public k8 i(h4.b bVar) {
        return null;
    }

    @Override // io.sentry.y0
    public Map j() {
        return new HashMap();
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.c k() {
        return new io.sentry.protocol.c();
    }

    @Override // io.sentry.y0
    public void l(l1 l1Var) {
    }

    @Override // io.sentry.y0
    public void m() {
    }

    @Override // io.sentry.y0
    public io.sentry.featureflags.b n() {
        return io.sentry.featureflags.c.a();
    }

    @Override // io.sentry.y0
    public void o(e1 e1Var) {
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.x p() {
        return io.sentry.protocol.x.f84062c;
    }

    @Override // io.sentry.y0
    public void q(String str) {
    }

    @Override // io.sentry.y0
    public e1 r() {
        return z2.h();
    }

    @Override // io.sentry.y0
    public void s(w6 w6Var) {
    }

    @Override // io.sentry.y0
    public List t() {
        return new ArrayList();
    }

    @Override // io.sentry.y0
    public void u(a4 a4Var) {
    }

    @Override // io.sentry.y0
    public void v(v7 v7Var) {
    }

    @Override // io.sentry.y0
    public j1 w() {
        return null;
    }

    @Override // io.sentry.y0
    public List x() {
        return new ArrayList();
    }

    @Override // io.sentry.y0
    public String y() {
        return null;
    }

    @Override // io.sentry.y0
    public List z() {
        return new ArrayList();
    }

    @Override // io.sentry.y0
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public y0 m7818clone() {
        return e();
    }
}
