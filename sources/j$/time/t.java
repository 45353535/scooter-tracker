package j$.time;

import com.google.common.base.Ascii;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f84694b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84695a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f84695a - ((t) obj).f84695a;
    }

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.l(Locale.getDefault(), j$.time.format.t.SMART, null);
    }

    public static t C(int i10) {
        j$.time.temporal.a.YEAR.w(i10);
        return new t(i10);
    }

    public t(int i10) {
        this.f84695a = i10;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.m(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u n(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.u.e(1L, this.f84695a <= 0 ? 1000000000L : 999999999L);
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
        int i10 = s.f84692a[((j$.time.temporal.a) qVar).ordinal()];
        int i11 = this.f84695a;
        if (i10 == 1) {
            if (i11 < 1) {
                i11 = 1 - i11;
            }
            return i11;
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 3) {
            return i11 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final t d(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (t) qVar.n(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.w(j10);
        int i10 = s.f84692a[aVar.ordinal()];
        int i11 = this.f84695a;
        if (i10 == 1) {
            if (i11 < 1) {
                j10 = 1 - j10;
            }
            return C((int) j10);
        }
        if (i10 == 2) {
            return C((int) j10);
        }
        if (i10 == 3) {
            return t(j$.time.temporal.a.ERA) == j10 ? this : C(1 - i11);
        }
        throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final t e(long j10, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (t) sVar.j(this, j10);
        }
        int i10 = s.f84693b[((j$.time.temporal.b) sVar).ordinal()];
        if (i10 == 1) {
            return E(j10);
        }
        if (i10 == 2) {
            return E(j$.com.android.tools.r8.a.z(j10, 10));
        }
        if (i10 == 3) {
            return E(j$.com.android.tools.r8.a.z(j10, 100));
        }
        if (i10 == 4) {
            return E(j$.com.android.tools.r8.a.z(j10, 1000));
        }
        if (i10 == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return d(j$.com.android.tools.r8.a.u(t(aVar), j10), aVar);
        }
        throw new j$.time.temporal.t("Unsupported unit: " + sVar);
    }

    public final t E(long j10) {
        if (j10 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return C(aVar.f84698b.a(((long) this.f84695a) + j10, aVar));
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
            return j$.time.temporal.b.YEARS;
        }
        return j$.time.temporal.r.c(this, aVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        if (!j$.com.android.tools.r8.a.t(mVar).equals(j$.time.chrono.t.f84589c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return mVar.d(this.f84695a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            if (this.f84695a == ((t) obj).f84695a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f84695a;
    }

    public final String toString() {
        return Integer.toString(this.f84695a);
    }

    private Object writeReplace() {
        return new r(Ascii.VT, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(g gVar) {
        return (t) j$.com.android.tools.r8.a.a(gVar, this);
    }
}
