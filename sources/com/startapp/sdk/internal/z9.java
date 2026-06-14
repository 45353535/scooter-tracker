package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public abstract class z9 implements Runnable, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9 f65678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9 f65679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q9 f65680c;

    public z9(g9 g9Var, j9 j9Var, q9 q9Var) {
        this.f65678a = g9Var;
        this.f65679b = j9Var;
        this.f65680c = q9Var;
    }

    public abstract int a();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((z9) obj).f65679b.f64752c - this.f65679b.f64752c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int iA = a();
            q9 q9Var = this.f65680c;
            if (q9Var != null) {
                q9Var.a(this.f65678a, iA);
            }
        } catch (OutOfMemoryError unused) {
            if (this.f65680c != null) {
                this.f65680c.a(this.f65678a, 0);
            }
        } catch (Throwable th2) {
            try {
                if (this.f65678a.f64550a != h9.f64611f) {
                    g9.a(th2);
                }
            } finally {
                q9 q9Var2 = this.f65680c;
                if (q9Var2 != null) {
                    q9Var2.a(this.f65678a, 0);
                }
            }
        }
    }
}
