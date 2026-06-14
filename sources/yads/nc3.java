package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class nc3 implements yc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xb3 f113810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc3 f113811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jd3 f113812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final md3 f113813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xd3 f113814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v5 f113815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final eh3 f113816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final oc3 f113817h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f113818i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public uc3 f113819j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f113820k;

    public nc3(xb3 xb3Var, vc3 vc3Var, jd3 jd3Var, md3 md3Var, xd3 xd3Var, v5 v5Var, fh3 fh3Var, oc3 oc3Var, boolean z10) {
        this.f113810a = xb3Var;
        this.f113811b = vc3Var;
        this.f113812c = jd3Var;
        this.f113813d = md3Var;
        this.f113814e = xd3Var;
        this.f113815f = v5Var;
        this.f113816g = fh3Var;
        this.f113817h = oc3Var;
        this.f113818i = z10;
    }

    @Override // yads.yc3
    public final void a() {
        if (this.f113820k) {
            this.f113814e.a(vd3.f116981e);
            this.f113816g.j();
        }
    }

    @Override // yads.yc3
    public final void b() {
        if (this.f113820k) {
            this.f113814e.a(vd3.f116985i);
            this.f113816g.f();
        }
    }

    @Override // yads.yc3
    public final void c() {
        this.f113820k = true;
        this.f113814e.a(vd3.f116981e);
        jd3 jd3Var = this.f113812c;
        if (!jd3Var.f112327d) {
            jd3Var.f112327d = true;
            jd3Var.f112325b.a();
            jd3Var.f112326c.post(new id3(jd3Var));
        }
        this.f113819j = new uc3(this.f113811b, this.f113816g);
        this.f113817h.b(this.f113810a);
    }

    @Override // yads.yc3
    public final void d() {
        this.f113820k = false;
        this.f113814e.a(vd3.f116983g);
        if (this.f113818i) {
            this.f113816g.b();
        }
        this.f113812c.a();
        this.f113813d.b();
        this.f113817h.c(this.f113810a);
        this.f113811b.a((nc3) null);
        this.f113817h.g(this.f113810a);
    }

    @Override // yads.yc3
    public final void e() {
        this.f113816g.g();
        this.f113820k = false;
        this.f113814e.a(vd3.f116982f);
        this.f113812c.a();
        this.f113813d.b();
        this.f113817h.h(this.f113810a);
        this.f113811b.a((nc3) null);
        this.f113817h.g(this.f113810a);
    }

    @Override // yads.yc3
    public final void f() {
        this.f113814e.a(vd3.f116981e);
        if (this.f113820k) {
            this.f113816g.c();
        }
        jd3 jd3Var = this.f113812c;
        if (!jd3Var.f112327d) {
            jd3Var.f112327d = true;
            jd3Var.f112325b.a();
            jd3Var.f112326c.post(new id3(jd3Var));
        }
        this.f113817h.d(this.f113810a);
    }

    @Override // yads.yc3
    public final void h() {
        this.f113814e.a(vd3.f116980d);
        this.f113815f.a(u5.f116518v);
        this.f113817h.j(this.f113810a);
    }

    @Override // yads.yc3
    public final void i() {
        this.f113814e.a(vd3.f116984h);
        if (this.f113820k) {
            this.f113816g.d();
        }
        this.f113817h.k(this.f113810a);
    }

    @Override // yads.yc3
    public final void onVolumeChanged(float f10) {
        this.f113816g.a(f10);
        uc3 uc3Var = this.f113819j;
        if (uc3Var != null) {
            if (f10 == 0.0f) {
                if (!uc3Var.f116614b) {
                    uc3Var.f116614b = true;
                    uc3Var.f116613a.l();
                }
            } else if (uc3Var.f116614b) {
                uc3Var.f116614b = false;
                uc3Var.f116613a.a();
            }
        }
        this.f113817h.a(this.f113810a, f10);
    }

    @Override // yads.yc3
    public final void a(xc3 xc3Var) {
        vd3 vd3Var;
        this.f113820k = false;
        xd3 xd3Var = this.f113814e;
        if (xd3Var.f117805a.contains(vd3.f116980d)) {
            vd3Var = vd3.f116986j;
        } else {
            vd3Var = vd3.f116987k;
        }
        this.f113814e.a(vd3Var);
        this.f113812c.a();
        this.f113813d.a(xc3Var);
        this.f113816g.a(xc3Var);
        this.f113817h.a(this.f113810a, xc3Var);
        this.f113811b.a((nc3) null);
        this.f113817h.g(this.f113810a);
    }
}
