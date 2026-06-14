package j$.time;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.time.chrono.InterfaceC5639b;
import j$.time.chrono.InterfaceC5642e;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements j$.time.temporal.m, j$.time.temporal.o, InterfaceC5639b, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f84659d = K(-999999999, 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f84660e = K(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f84662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f84663c;

    static {
        K(1970, 1, 1);
    }

    public static g K(int i10, int i11, int i12) {
        j$.time.temporal.a.YEAR.w(i10);
        j$.time.temporal.a.MONTH_OF_YEAR.w(i11);
        j$.time.temporal.a.DAY_OF_MONTH.w(i12);
        return D(i10, i11, i12);
    }

    public static g L(long j10) {
        long j11;
        j$.time.temporal.a.EPOCH_DAY.w(j10);
        long j12 = 719468 + j10;
        if (j12 < 0) {
            long j13 = ((j10 + 719469) / 146097) - 1;
            j11 = j13 * 400;
            j12 += (-j13) * 146097;
        } else {
            j11 = 0;
        }
        long j14 = ((j12 * 400) + 591) / 146097;
        long j15 = j12 - ((j14 / 400) + (((j14 / 4) + (j14 * 365)) - (j14 / 100)));
        if (j15 < 0) {
            j14--;
            j15 = j12 - ((j14 / 400) + (((j14 / 4) + (365 * j14)) - (j14 / 100)));
        }
        int i10 = (int) j15;
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        long j16 = j14 + j11 + ((long) (i11 / 10));
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new g(aVar.f84698b.a(j16, aVar), i12, i13);
    }

    public static g E(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        g gVar = (g) nVar.p(j$.time.temporal.r.f84721f);
        if (gVar != null) {
            return gVar;
        }
        throw new b("Unable to obtain LocalDate from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName());
    }

    public static g D(int i10, int i11, int i12) {
        int i13 = 28;
        if (i12 > 28) {
            if (i11 != 2) {
                i13 = (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.t.f84589c.getClass();
                if (j$.time.chrono.t.k(i10)) {
                    i13 = 29;
                }
            }
            if (i12 > i13) {
                if (i12 == 29) {
                    throw new b("Invalid date 'February 29' as '" + i10 + "' is not a leap year");
                }
                throw new b("Invalid date '" + l.F(i11).name() + " " + i12 + "'");
            }
        }
        return new g(i10, i11, i12);
    }

    public static g Q(int i10, int i11, int i12) {
        if (i11 == 2) {
            j$.time.chrono.t.f84589c.getClass();
            i12 = Math.min(i12, j$.time.chrono.t.k((long) i10) ? 29 : 28);
        } else if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
            i12 = Math.min(i12, 30);
        }
        return new g(i10, i11, i12);
    }

    public g(int i10, int i11, int i12) {
        this.f84661a = i10;
        this.f84662b = (short) i11;
        this.f84663c = (short) i12;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.k(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u n(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.p(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (!aVar.t()) {
            throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
        int i10 = f.f84607a[aVar.ordinal()];
        if (i10 == 1) {
            return j$.time.temporal.u.e(1L, J());
        }
        if (i10 == 2) {
            return j$.time.temporal.u.e(1L, I() ? 366 : 365);
        }
        if (i10 != 3) {
            return i10 != 4 ? ((j$.time.temporal.a) qVar).f84698b : this.f84661a <= 0 ? j$.time.temporal.u.e(1L, 1000000000L) : j$.time.temporal.u.e(1L, 999999999L);
        }
        return j$.time.temporal.u.e(1L, (l.F(this.f84662b) != l.FEBRUARY || I()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.n
    public final int k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return F(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.EPOCH_DAY) {
                return u();
            }
            if (qVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return F(qVar);
            }
            return ((((long) this.f84661a) * 12) + ((long) this.f84662b)) - 1;
        }
        return qVar.k(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int F(j$.time.temporal.q qVar) {
        int i10;
        int i11 = f.f84607a[((j$.time.temporal.a) qVar).ordinal()];
        short s10 = this.f84663c;
        int i12 = this.f84661a;
        switch (i11) {
            case 1:
                return s10;
            case 2:
                return H();
            case 3:
                i10 = (s10 - 1) / 7;
                return i10 + 1;
            case 4:
                if (i12 < 1) {
                    return 1 - i12;
                }
                return i12;
            case 5:
                return G().getValue();
            case 6:
                i10 = (s10 - 1) % 7;
                return i10 + 1;
            case 7:
                return ((H() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.t("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((H() - 1) / 7) + 1;
            case 10:
                return this.f84662b;
            case 11:
                throw new j$.time.temporal.t("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i12;
            case 13:
                return i12 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.InterfaceC5639b
    public final j$.time.chrono.m a() {
        return j$.time.chrono.t.f84589c;
    }

    public final int H() {
        return (l.F(this.f84662b).C(I()) + this.f84663c) - 1;
    }

    public final d G() {
        return d.C(((int) j$.com.android.tools.r8.a.x(u() + 3, 7)) + 1);
    }

    public final boolean I() {
        j$.time.chrono.t tVar = j$.time.chrono.t.f84589c;
        long j10 = this.f84661a;
        tVar.getClass();
        return j$.time.chrono.t.k(j10);
    }

    public final int J() {
        short s10 = this.f84662b;
        return s10 != 2 ? (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31 : I() ? 29 : 28;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final g m(j$.time.temporal.o oVar) {
        if (oVar instanceof g) {
            return (g) oVar;
        }
        return (g) oVar.w(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final g d(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (g) qVar.n(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.w(j10);
        int i10 = f.f84607a[aVar.ordinal()];
        short s10 = this.f84663c;
        short s11 = this.f84662b;
        int i11 = this.f84661a;
        switch (i10) {
            case 1:
                int i12 = (int) j10;
                if (s10 != i12) {
                    return K(i11, s11, i12);
                }
                return this;
            case 2:
                return T((int) j10);
            case 3:
                return N(j$.com.android.tools.r8.a.z(j10 - t(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (i11 < 1) {
                    j10 = 1 - j10;
                }
                return U((int) j10);
            case 5:
                return N(j10 - ((long) G().getValue()));
            case 6:
                return N(j10 - t(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return N(j10 - t(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return L(j10);
            case 9:
                return N(j$.com.android.tools.r8.a.z(j10 - t(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i13 = (int) j10;
                if (s11 != i13) {
                    j$.time.temporal.a.MONTH_OF_YEAR.w(i13);
                    return Q(i11, i13, s10);
                }
                return this;
            case 11:
                return O(j10 - (((((long) i11) * 12) + ((long) s11)) - 1));
            case 12:
                return U((int) j10);
            case 13:
                if (t(j$.time.temporal.a.ERA) != j10) {
                    return U(1 - i11);
                }
                return this;
            default:
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
    }

    public final g U(int i10) {
        if (this.f84661a == i10) {
            return this;
        }
        j$.time.temporal.a.YEAR.w(i10);
        return Q(i10, this.f84662b, this.f84663c);
    }

    public final g T(int i10) {
        if (H() == i10) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int i11 = this.f84661a;
        long j10 = i11;
        aVar.w(j10);
        j$.time.temporal.a.DAY_OF_YEAR.w(i10);
        j$.time.chrono.t.f84589c.getClass();
        boolean zK = j$.time.chrono.t.k(j10);
        if (i10 == 366 && !zK) {
            throw new b("Invalid date 'DayOfYear 366' as '" + i11 + "' is not a leap year");
        }
        l lVarF = l.F(((i10 - 1) / 31) + 1);
        if (i10 > (lVarF.D(zK) + lVarF.C(zK)) - 1) {
            lVarF = l.f84676a[((((int) 1) + 12) + lVarF.ordinal()) % 12];
        }
        return new g(i11, lVarF.getValue(), (i10 - lVarF.C(zK)) + 1);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final g e(long j10, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (g) sVar.j(this, j10);
        }
        switch (f.f84608b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return N(j10);
            case 2:
                return N(j$.com.android.tools.r8.a.z(j10, 7));
            case 3:
                return O(j10);
            case 4:
                return P(j10);
            case 5:
                return P(j$.com.android.tools.r8.a.z(j10, 10));
            case 6:
                return P(j$.com.android.tools.r8.a.z(j10, 100));
            case 7:
                return P(j$.com.android.tools.r8.a.z(j10, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.u(t(aVar), j10), aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final g P(long j10) {
        if (j10 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return Q(aVar.f84698b.a(((long) this.f84661a) + j10, aVar), this.f84662b, this.f84663c);
    }

    public final g O(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f84661a) * 12) + ((long) (this.f84662b - 1)) + j10;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j12 = 12;
        return Q(aVar.f84698b.a(j$.com.android.tools.r8.a.y(j11, j12), aVar), ((int) j$.com.android.tools.r8.a.x(j11, j12)) + 1, this.f84663c);
    }

    public final g N(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = ((long) this.f84663c) + j10;
        if (j11 > 0) {
            short s10 = this.f84662b;
            int i10 = this.f84661a;
            if (j11 <= 28) {
                return new g(i10, s10, (int) j11);
            }
            if (j11 <= 59) {
                long J = J();
                if (j11 <= J) {
                    return new g(i10, s10, (int) j11);
                }
                if (s10 < 12) {
                    return new g(i10, s10 + 1, (int) (j11 - J));
                }
                int i11 = i10 + 1;
                j$.time.temporal.a.YEAR.w(i11);
                return new g(i11, 1, (int) (j11 - J));
            }
        }
        return L(j$.com.android.tools.r8.a.u(u(), j10));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j10, j$.time.temporal.b bVar) {
        return j10 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j10, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object p(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.r.f84721f ? this : j$.com.android.tools.r8.a.n(this, aVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.a(this, mVar);
    }

    @Override // j$.time.chrono.InterfaceC5639b
    public final InterfaceC5642e v(j jVar) {
        return LocalDateTime.F(this, jVar);
    }

    @Override // j$.time.chrono.InterfaceC5639b
    public final long u() {
        long j10 = this.f84661a;
        long j11 = this.f84662b;
        long j12 = 365 * j10;
        long j13 = (((367 * j11) - 362) / 12) + (j10 >= 0 ? ((j10 + 399) / 400) + (((3 + j10) / 4) - ((99 + j10) / 100)) + j12 : j12 - ((j10 / (-400)) + ((j10 / (-4)) - (j10 / (-100))))) + ((long) (this.f84663c - 1));
        if (j11 > 2) {
            j13 = !I() ? j13 - 2 : j13 - 1;
        }
        return j13 - 719528;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC5639b interfaceC5639b) {
        if (interfaceC5639b instanceof g) {
            return C((g) interfaceC5639b);
        }
        return j$.com.android.tools.r8.a.e(this, interfaceC5639b);
    }

    public final int C(g gVar) {
        int i10 = this.f84661a - gVar.f84661a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f84662b - gVar.f84662b;
        return i11 == 0 ? this.f84663c - gVar.f84663c : i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && C((g) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC5639b
    public final int hashCode() {
        int i10 = this.f84661a;
        return (((i10 << 11) + (this.f84662b << 6)) + this.f84663c) ^ (i10 & (-2048));
    }

    @Override // j$.time.chrono.InterfaceC5639b
    public final String toString() {
        int i10 = this.f84661a;
        int iAbs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i10 > 9999) {
                sb2.append('+');
            }
            sb2.append(i10);
        } else if (i10 < 0) {
            sb2.append(i10 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i10 + 10000);
            sb2.deleteCharAt(0);
        }
        String str = TokenBuilder.TOKEN_DELIMITER;
        short s10 = this.f84662b;
        sb2.append(s10 < 10 ? "-0" : TokenBuilder.TOKEN_DELIMITER);
        sb2.append((int) s10);
        short s11 = this.f84663c;
        if (s11 < 10) {
            str = "-0";
        }
        sb2.append(str);
        sb2.append((int) s11);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new r((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
