package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class o8 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s5 f83782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s5 f83783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p8 f83784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h8 f83785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f83786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b1 f83787f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final v8 f83790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private r8 f83791j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f83788g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f83789h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f83792k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f83793l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final io.sentry.protocol.c f83794m = new io.sentry.protocol.c();

    o8(h8 h8Var, b1 b1Var, p8 p8Var, v8 v8Var, r8 r8Var) {
        this.f83784c = p8Var;
        p8Var.t(v8Var.a());
        this.f83785d = (h8) io.sentry.util.w.c(h8Var, "transaction is required");
        this.f83787f = (b1) io.sentry.util.w.c(b1Var, "Scopes are required");
        this.f83790i = v8Var;
        this.f83791j = r8Var;
        s5 s5VarC = v8Var.c();
        if (s5VarC != null) {
            this.f83782a = s5VarC;
        } else {
            this.f83782a = b1Var.getOptions().getDateProvider().a();
        }
    }

    private void G(s5 s5Var) {
        this.f83782a = s5Var;
    }

    private List t() {
        ArrayList arrayList = new ArrayList();
        for (o8 o8Var : this.f83785d.L()) {
            if (o8Var.x() != null && o8Var.x().equals(A())) {
                arrayList.add(o8Var);
            }
        }
        return arrayList;
    }

    public u8 A() {
        return this.f83784c.m();
    }

    public Map B() {
        return this.f83784c.o();
    }

    public io.sentry.protocol.x C() {
        return this.f83784c.p();
    }

    public Boolean D() {
        return this.f83784c.i();
    }

    void E(r8 r8Var) {
        this.f83791j = r8Var;
    }

    public boolean F(s5 s5Var) {
        if (this.f83783b == null) {
            return false;
        }
        this.f83783b = s5Var;
        return true;
    }

    @Override // io.sentry.j1
    public Boolean b() {
        return this.f83784c.k();
    }

    @Override // io.sentry.j1
    public j1 c(String str, String str2, s5 s5Var, q1 q1Var) {
        return p(str, str2, s5Var, q1Var, new v8());
    }

    @Override // io.sentry.j1
    public p8 e() {
        return this.f83784c;
    }

    @Override // io.sentry.j1
    public void f(w8 w8Var, s5 s5Var) {
        s5 s5Var2;
        if (this.f83788g || !this.f83789h.compareAndSet(false, true)) {
            return;
        }
        this.f83784c.v(w8Var);
        if (s5Var == null) {
            s5Var = this.f83787f.getOptions().getDateProvider().a();
        }
        this.f83783b = s5Var;
        if (this.f83790i.f() || this.f83790i.e()) {
            s5 s5VarR = null;
            s5 s5VarQ = null;
            for (o8 o8Var : this.f83785d.J().A().equals(A()) ? this.f83785d.F() : t()) {
                if (s5VarR == null || o8Var.r().e(s5VarR)) {
                    s5VarR = o8Var.r();
                }
                if (s5VarQ == null || (o8Var.q() != null && o8Var.q().d(s5VarQ))) {
                    s5VarQ = o8Var.q();
                }
            }
            if (this.f83790i.f() && s5VarR != null && this.f83782a.e(s5VarR)) {
                G(s5VarR);
            }
            if (this.f83790i.e() && s5VarQ != null && ((s5Var2 = this.f83783b) == null || s5Var2.d(s5VarQ))) {
                F(s5VarQ);
            }
        }
        Throwable th2 = this.f83786e;
        if (th2 != null) {
            this.f83787f.c(th2, this, this.f83785d.getName());
        }
        r8 r8Var = this.f83791j;
        if (r8Var != null) {
            r8Var.a(this);
        }
        this.f83788g = true;
    }

    @Override // io.sentry.j1
    public void finish() {
        l(this.f83784c.n());
    }

    @Override // io.sentry.j1
    public boolean g() {
        return this.f83788g;
    }

    @Override // io.sentry.j1
    public String getDescription() {
        return this.f83784c.c();
    }

    @Override // io.sentry.j1
    public w8 getStatus() {
        return this.f83784c.n();
    }

    @Override // io.sentry.j1
    public void h(String str) {
        this.f83784c.r(str);
    }

    @Override // io.sentry.j1
    public void i(String str, Number number) {
        if (g()) {
            this.f83787f.getOptions().getLogger().c(g7.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f83793l.put(str, new io.sentry.protocol.k(number, null));
        if (this.f83785d.J() != this) {
            this.f83785d.T(str, number);
        }
    }

    @Override // io.sentry.j1
    public void k(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.f83792k.remove(str);
        } else {
            this.f83792k.put(str, obj);
        }
    }

    @Override // io.sentry.j1
    public void l(w8 w8Var) {
        f(w8Var, this.f83787f.getOptions().getDateProvider().a());
    }

    @Override // io.sentry.j1
    public void m(String str, Number number, h2 h2Var) {
        if (g()) {
            this.f83787f.getOptions().getLogger().c(g7.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f83793l.put(str, new io.sentry.protocol.k(number, h2Var.apiName()));
        if (this.f83785d.J() != this) {
            this.f83785d.U(str, number, h2Var);
        }
    }

    @Override // io.sentry.j1
    public j1 p(String str, String str2, s5 s5Var, q1 q1Var, v8 v8Var) {
        return this.f83788g ? f3.s() : this.f83785d.V(this.f83784c.m(), str, str2, s5Var, q1Var, v8Var);
    }

    @Override // io.sentry.j1
    public s5 q() {
        return this.f83783b;
    }

    @Override // io.sentry.j1
    public s5 r() {
        return this.f83782a;
    }

    public Map s() {
        return this.f83792k;
    }

    public Map u() {
        return this.f83793l;
    }

    public String v() {
        return this.f83784c.f();
    }

    v8 w() {
        return this.f83790i;
    }

    public u8 x() {
        return this.f83784c.h();
    }

    public d9 y() {
        return this.f83784c.l();
    }

    r8 z() {
        return this.f83791j;
    }

    public o8(e9 e9Var, h8 h8Var, b1 b1Var, v8 v8Var) {
        p8 p8Var = (p8) io.sentry.util.w.c(e9Var, "context is required");
        this.f83784c = p8Var;
        p8Var.t(v8Var.a());
        this.f83785d = (h8) io.sentry.util.w.c(h8Var, "sentryTracer is required");
        this.f83787f = (b1) io.sentry.util.w.c(b1Var, "scopes are required");
        this.f83791j = null;
        s5 s5VarC = v8Var.c();
        if (s5VarC != null) {
            this.f83782a = s5VarC;
        } else {
            this.f83782a = b1Var.getOptions().getDateProvider().a();
        }
        this.f83790i = v8Var;
    }
}
