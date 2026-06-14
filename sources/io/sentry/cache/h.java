package io.sentry.cache;

import io.sentry.protocol.r;
import io.sentry.t0;
import io.sentry.t1;
import io.sentry.v7;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v7 f83323a;

    public h(v7 v7Var) {
        this.f83323a = v7Var;
    }

    private void h(String str) {
        d.a(this.f83323a, ".options-cache", str);
    }

    public static Object i(v7 v7Var, String str, Class cls) {
        return j(v7Var, str, cls, null);
    }

    public static Object j(v7 v7Var, String str, Class cls, t1 t1Var) {
        return d.c(v7Var, ".options-cache", str, cls, t1Var);
    }

    private void k(Object obj, String str) {
        d.d(this.f83323a, obj, ".options-cache", str);
    }

    @Override // io.sentry.t0
    public void a(Map map) {
        k(map, "tags.json");
    }

    @Override // io.sentry.t0
    public void b(String str) {
        if (str == null) {
            h("dist.json");
        } else {
            k(str, "dist.json");
        }
    }

    @Override // io.sentry.t0
    public void c(String str) {
        if (str == null) {
            h("environment.json");
        } else {
            k(str, "environment.json");
        }
    }

    @Override // io.sentry.t0
    public void d(String str) {
        if (str == null) {
            h("proguard-uuid.json");
        } else {
            k(str, "proguard-uuid.json");
        }
    }

    @Override // io.sentry.t0
    public void e(r rVar) {
        if (rVar == null) {
            h("sdk-version.json");
        } else {
            k(rVar, "sdk-version.json");
        }
    }

    @Override // io.sentry.t0
    public void f(Double d10) {
        if (d10 == null) {
            h("replay-error-sample-rate.json");
        } else {
            k(d10.toString(), "replay-error-sample-rate.json");
        }
    }

    @Override // io.sentry.t0
    public void g(String str) {
        if (str == null) {
            h("release.json");
        } else {
            k(str, "release.json");
        }
    }
}
