package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class rt0 implements ne3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5 f115588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t42 f115589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final st0 f115590c;

    public rt0(v5 v5Var, t42 t42Var, m42 m42Var, Iterator it, m30 m30Var) {
        this.f115588a = v5Var;
        this.f115589b = t42Var;
        this.f115590c = new st0(v5Var, t42Var, m42Var, it, m30Var);
    }

    @Override // yads.ne3
    public final void a() {
        this.f115588a.a(u5.f116512p);
        this.f115589b.a();
        this.f115590c.a();
    }

    @Override // yads.ne3
    public final void b() {
        this.f115588a.a(u5.f116512p);
        this.f115589b.a();
        this.f115590c.f115932e.a(l30.f112936f);
    }

    @Override // yads.ne3
    public final void c() {
    }
}
