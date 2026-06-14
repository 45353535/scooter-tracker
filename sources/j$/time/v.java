package j$.time;

import com.google.common.base.Ascii;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f84729c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84731b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v vVar = (v) obj;
        int i10 = this.f84730a - vVar.f84730a;
        return i10 == 0 ? this.f84731b - vVar.f84731b : i10;
    }

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.c('-');
        nVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.l(Locale.getDefault(), j$.time.format.t.SMART, null);
    }

    public v(int i10, int i11) {
        this.f84730a = i10;
        this.f84731b = i11;
    }

    public final v G(int i10, int i11) {
        return (this.f84730a == i10 && this.f84731b == i11) ? this : new v(i10, i11);
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.PROLEPTIC_MONTH || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.m(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u n(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.u.e(1L, this.f84730a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int k(j$.time.temporal.q qVar) {
        return n(qVar).a(t(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long t(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.k(this);
        }
        int i10 = u.f84727a[((j$.time.temporal.a) qVar).ordinal()];
        if (i10 == 1) {
            return this.f84731b;
        }
        if (i10 == 2) {
            return C();
        }
        int i11 = this.f84730a;
        if (i10 == 3) {
            if (i11 < 1) {
                i11 = 1 - i11;
            }
            return i11;
        }
        if (i10 == 4) {
            return i11;
        }
        if (i10 == 5) {
            return i11 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
    }

    public final long C() {
        return ((((long) this.f84730a) * 12) + ((long) this.f84731b)) - 1;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final v d(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (v) qVar.n(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.w(j10);
        int i10 = u.f84727a[aVar.ordinal()];
        int i11 = this.f84730a;
        if (i10 == 1) {
            int i12 = (int) j10;
            j$.time.temporal.a.MONTH_OF_YEAR.w(i12);
            return G(i11, i12);
        }
        if (i10 == 2) {
            return E(j10 - C());
        }
        int i13 = this.f84731b;
        if (i10 == 3) {
            if (i11 < 1) {
                j10 = 1 - j10;
            }
            int i14 = (int) j10;
            j$.time.temporal.a.YEAR.w(i14);
            return G(i14, i13);
        }
        if (i10 == 4) {
            int i15 = (int) j10;
            j$.time.temporal.a.YEAR.w(i15);
            return G(i15, i13);
        }
        if (i10 != 5) {
            throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
        if (t(j$.time.temporal.a.ERA) == j10) {
            return this;
        }
        int i16 = 1 - i11;
        j$.time.temporal.a.YEAR.w(i16);
        return G(i16, i13);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final v e(long j10, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (v) sVar.j(this, j10);
        }
        switch (u.f84728b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return E(j10);
            case 2:
                return F(j10);
            case 3:
                return F(j$.com.android.tools.r8.a.z(j10, 10));
            case 4:
                return F(j$.com.android.tools.r8.a.z(j10, 100));
            case 5:
                return F(j$.com.android.tools.r8.a.z(j10, 1000));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.u(t(aVar), j10), aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final v F(long j10) {
        if (j10 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return G(aVar.f84698b.a(((long) this.f84730a) + j10, aVar), this.f84731b);
    }

    public final v E(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f84730a) * 12) + ((long) (this.f84731b - 1)) + j10;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j12 = 12;
        return G(aVar.f84698b.a(j$.com.android.tools.r8.a.y(j11, j12), aVar), ((int) j$.com.android.tools.r8.a.x(j11, j12)) + 1);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j10, j$.time.temporal.b bVar) {
        return j10 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j10, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object p(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f84717b) {
            return j$.time.chrono.t.f84589c;
        }
        if (aVar == j$.time.temporal.r.f84718c) {
            return j$.time.temporal.b.MONTHS;
        }
        return j$.time.temporal.r.c(this, aVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        if (!j$.com.android.tools.r8.a.t(mVar).equals(j$.time.chrono.t.f84589c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return mVar.d(C(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f84730a == vVar.f84730a && this.f84731b == vVar.f84731b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f84731b << 27) ^ this.f84730a;
    }

    public final String toString() {
        int i10 = this.f84730a;
        int iAbs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb2.append(i10);
        } else if (i10 < 0) {
            sb2.append(i10 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i10 + 10000);
            sb2.deleteCharAt(0);
        }
        int i11 = this.f84731b;
        sb2.append(i11 < 10 ? "-0" : TokenBuilder.TOKEN_DELIMITER);
        sb2.append(i11);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new r(Ascii.FF, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(g gVar) {
        return (v) j$.com.android.tools.r8.a.a(gVar, this);
    }
}
