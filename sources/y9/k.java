package y9;

import com.google.common.math.BigIntegerMath;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final i f108469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f108470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f108471c;

    public static abstract class a extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f108472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f108473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final List f108474f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f108475g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f108476h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final long f108477i;

        public a(i iVar, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f108472d = j12;
            this.f108473e = j13;
            this.f108474f = list;
            this.f108477i = j14;
            this.f108475g = j15;
            this.f108476h = j16;
        }

        public long c(long j10, long j11) {
            long jG = g(j10);
            return jG != -1 ? jG : (int) (i((j11 - this.f108476h) + this.f108477i, j10) - d(j10, j11));
        }

        public long d(long j10, long j11) {
            if (g(j10) == -1) {
                long j12 = this.f108475g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(e(), i((j11 - this.f108476h) - j12, j10));
                }
            }
            return e();
        }

        public long e() {
            return this.f108472d;
        }

        public long f(long j10, long j11) {
            if (this.f108474f != null) {
                return -9223372036854775807L;
            }
            long jD = d(j10, j11) + c(j10, j11);
            return (j(jD) + h(jD, j10)) - this.f108477i;
        }

        public abstract long g(long j10);

        public final long h(long j10, long j11) {
            List list = this.f108474f;
            if (list != null) {
                return (((d) list.get((int) (j10 - this.f108472d))).f108483b * 1000000) / this.f108470b;
            }
            long jG = g(j11);
            return (jG == -1 || j10 != (e() + jG) - 1) ? (this.f108473e * 1000000) / this.f108470b : j11 - j(j10);
        }

        public long i(long j10, long j11) {
            long jE = e();
            long jG = g(j11);
            if (jG != 0) {
                if (this.f108474f != null) {
                    long j12 = (jG + jE) - 1;
                    long j13 = jE;
                    while (j13 <= j12) {
                        long j14 = ((j12 - j13) / 2) + j13;
                        long j15 = j(j14);
                        if (j15 < j10) {
                            j13 = j14 + 1;
                        } else {
                            if (j15 <= j10) {
                                return j14;
                            }
                            j12 = j14 - 1;
                        }
                    }
                    return j13 == jE ? j13 : j12;
                }
                long j16 = this.f108472d + (j10 / ((this.f108473e * 1000000) / this.f108470b));
                if (j16 >= jE) {
                    return jG == -1 ? j16 : Math.min(j16, (jE + jG) - 1);
                }
            }
            return jE;
        }

        public final long j(long j10) {
            List list = this.f108474f;
            return o0.c1(list != null ? ((d) list.get((int) (j10 - this.f108472d))).f108482a - this.f108471c : (j10 - this.f108472d) * this.f108473e, 1000000L, this.f108470b);
        }

        public abstract i k(j jVar, long j10);

        public boolean l() {
            return this.f108474f != null;
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final List f108478j;

        public b(i iVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f108478j = list2;
        }

        @Override // y9.k.a
        public long g(long j10) {
            return this.f108478j.size();
        }

        @Override // y9.k.a
        public i k(j jVar, long j10) {
            return (i) this.f108478j.get((int) (j10 - this.f108472d));
        }

        @Override // y9.k.a
        public boolean l() {
            return true;
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final n f108479j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final n f108480k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final long f108481l;

        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, n nVar, n nVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f108479j = nVar;
            this.f108480k = nVar2;
            this.f108481l = j13;
        }

        @Override // y9.k
        public i a(j jVar) {
            n nVar = this.f108479j;
            if (nVar == null) {
                return super.a(jVar);
            }
            io.bidmachine.media3.common.a aVar = jVar.f108456b;
            return new i(nVar.a(aVar.f80547a, 0L, aVar.f80556j, 0L), 0L, -1L);
        }

        @Override // y9.k.a
        public long g(long j10) {
            if (this.f108474f != null) {
                return r0.size();
            }
            long j11 = this.f108481l;
            if (j11 != -1) {
                return (j11 - this.f108472d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return BigIntegerMath.divide(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f108470b)), BigInteger.valueOf(this.f108473e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // y9.k.a
        public i k(j jVar, long j10) {
            List list = this.f108474f;
            long j11 = list != null ? ((d) list.get((int) (j10 - this.f108472d))).f108482a : (j10 - this.f108472d) * this.f108473e;
            n nVar = this.f108480k;
            io.bidmachine.media3.common.a aVar = jVar.f108456b;
            return new i(nVar.a(aVar.f80547a, j10, aVar.f80556j, j11), 0L, -1L);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f108482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f108483b;

        public d(long j10, long j11) {
            this.f108482a = j10;
            this.f108483b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f108482a == dVar.f108482a && this.f108483b == dVar.f108483b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f108482a) * 31) + ((int) this.f108483b);
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f108469a = iVar;
        this.f108470b = j10;
        this.f108471c = j11;
    }

    public i a(j jVar) {
        return this.f108469a;
    }

    public long b() {
        return o0.c1(this.f108471c, 1000000L, this.f108470b);
    }

    public static class e extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f108484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f108485e;

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f108484d = j12;
            this.f108485e = j13;
        }

        public i c() {
            long j10 = this.f108485e;
            if (j10 <= 0) {
                return null;
            }
            return new i(null, this.f108484d, j10);
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
