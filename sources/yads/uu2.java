package yads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uu2 extends zu2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f116782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f116783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f116784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f116785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f116786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f116787i;

    public uu2(lj2 lj2Var, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
        super(lj2Var, j10, j11);
        this.f116782d = j12;
        this.f116783e = j13;
        this.f116784f = list;
        this.f116787i = j14;
        this.f116785g = j15;
        this.f116786h = j16;
    }

    public abstract long a(long j10);

    public final long a(long j10, long j11) {
        if (a(j10) == -1) {
            long j12 = this.f116785g;
            if (j12 != -9223372036854775807L) {
                return Math.max(this.f116782d, c((j11 - this.f116786h) - j12, j10));
            }
        }
        return this.f116782d;
    }

    public abstract lj2 a(long j10, gm2 gm2Var);

    public final long b(long j10, long j11) {
        List list = this.f116784f;
        if (list != null) {
            return (((xu2) list.get((int) (j10 - this.f116782d))).f117970b * 1000000) / this.f118840b;
        }
        long jA = a(j11);
        return (jA == -1 || j10 != (this.f116782d + jA) - 1) ? (this.f116783e * 1000000) / this.f118840b : j11 - b(j10);
    }

    public final long c(long j10, long j11) {
        long j12 = this.f116782d;
        long jA = a(j11);
        if (jA != 0) {
            if (this.f116784f != null) {
                long j13 = (jA + j12) - 1;
                long j14 = j12;
                while (j14 <= j13) {
                    long j15 = ((j13 - j14) / 2) + j14;
                    long jB = b(j15);
                    if (jB < j10) {
                        j14 = j15 + 1;
                    } else {
                        if (jB <= j10) {
                            return j15;
                        }
                        j13 = j15 - 1;
                    }
                }
                return j14 == j12 ? j14 : j13;
            }
            long j16 = (j10 / ((this.f116783e * 1000000) / this.f118840b)) + this.f116782d;
            if (j16 >= j12) {
                return jA == -1 ? j16 : Math.min(j16, (j12 + jA) - 1);
            }
        }
        return j12;
    }

    public final long b(long j10) {
        long j11;
        List list = this.f116784f;
        if (list != null) {
            j11 = ((xu2) list.get((int) (j10 - this.f116782d))).f117969a - this.f118841c;
        } else {
            j11 = (j10 - this.f116782d) * this.f116783e;
        }
        return w83.a(j11, 1000000L, this.f118840b);
    }

    public boolean b() {
        return this.f116784f != null;
    }
}
