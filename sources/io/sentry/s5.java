package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s5 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(s5 s5Var) {
        return Long.valueOf(g()).compareTo(Long.valueOf(s5Var.g()));
    }

    public long c(s5 s5Var) {
        return g() - s5Var.g();
    }

    public final boolean d(s5 s5Var) {
        return c(s5Var) > 0;
    }

    public final boolean e(s5 s5Var) {
        return c(s5Var) < 0;
    }

    public long f(s5 s5Var) {
        return (s5Var == null || compareTo(s5Var) >= 0) ? g() : s5Var.g();
    }

    public abstract long g();
}
