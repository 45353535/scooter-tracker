package yads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class sd0 implements ne3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5 f115748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t42 f115749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m30 f115750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f115751d;

    public sd0(v5 v5Var, int i10, t42 t42Var, m30 m30Var) {
        this.f115748a = v5Var;
        this.f115749b = t42Var;
        this.f115750c = m30Var;
        this.f115751d = new AtomicInteger(i10);
    }

    @Override // yads.ne3
    public final void a() {
        if (this.f115751d.decrementAndGet() == 0) {
            this.f115748a.a(u5.f116512p);
            this.f115749b.a();
        }
    }

    @Override // yads.ne3
    public final void b() {
        if (this.f115751d.getAndSet(0) > 0) {
            this.f115748a.a(u5.f116512p);
            this.f115750c.a(l30.f112936f);
            this.f115749b.a();
        }
    }

    @Override // yads.ne3
    public final void c() {
    }
}
