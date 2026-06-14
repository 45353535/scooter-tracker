package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class bm0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final km2 f109049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qn2 f109050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f109051d;

    public bm0(km2 km2Var, qn2 qn2Var, jr jrVar) {
        this.f109049b = km2Var;
        this.f109050c = qn2Var;
        this.f109051d = jrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        on2 on2Var;
        if (this.f109049b.i()) {
            this.f109049b.c("canceled-at-delivery");
            return;
        }
        qn2 qn2Var = this.f109050c;
        oj3 oj3Var = qn2Var.f115102c;
        if (oj3Var == null) {
            this.f109049b.a(qn2Var.f115100a);
        } else {
            km2 km2Var = this.f109049b;
            synchronized (km2Var.f112766f) {
                on2Var = km2Var.f112767g;
            }
            if (on2Var != null) {
                on2Var.a(oj3Var);
            }
        }
        if (this.f109050c.f115103d) {
            this.f109049b.a("intermediate-response");
        } else {
            this.f109049b.c("done");
        }
        Runnable runnable = this.f109051d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
