package io.sentry;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class n7 extends s5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Date f83770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f83771c;

    public n7() {
        this(l.d(), System.nanoTime());
    }

    private long h(n7 n7Var, n7 n7Var2) {
        return n7Var.g() + (n7Var2.f83771c - n7Var.f83771c);
    }

    @Override // io.sentry.s5, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public int compareTo(s5 s5Var) {
        if (!(s5Var instanceof n7)) {
            return super.compareTo(s5Var);
        }
        n7 n7Var = (n7) s5Var;
        long time = this.f83770b.getTime();
        long time2 = n7Var.f83770b.getTime();
        return time == time2 ? Long.valueOf(this.f83771c).compareTo(Long.valueOf(n7Var.f83771c)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.s5
    public long c(s5 s5Var) {
        return s5Var instanceof n7 ? this.f83771c - ((n7) s5Var).f83771c : super.c(s5Var);
    }

    @Override // io.sentry.s5
    public long f(s5 s5Var) {
        if (s5Var == null || !(s5Var instanceof n7)) {
            return super.f(s5Var);
        }
        n7 n7Var = (n7) s5Var;
        return compareTo(s5Var) < 0 ? h(this, n7Var) : h(n7Var, this);
    }

    @Override // io.sentry.s5
    public long g() {
        return l.a(this.f83770b);
    }

    public n7(Date date, long j10) {
        this.f83770b = date;
        this.f83771c = j10;
    }
}
