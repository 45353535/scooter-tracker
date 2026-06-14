package j$.time;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements j$.time.temporal.n, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f84679c = 0;
    private static final long serialVersionUID = -939150713474957432L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84681b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        int i10 = this.f84680a - nVar.f84680a;
        return i10 == 0 ? this.f84681b - nVar.f84681b : i10;
    }

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.d("--");
        nVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.c('-');
        nVar.g(j$.time.temporal.a.DAY_OF_MONTH, 2);
        nVar.l(Locale.getDefault(), j$.time.format.t.SMART, null);
    }

    public n(int i10, int i11) {
        this.f84680a = i10;
        this.f84681b = i11;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.DAY_OF_MONTH : qVar != null && qVar.m(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u n(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return qVar.j();
        }
        if (qVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.r.d(this, qVar);
        }
        l lVarF = l.F(this.f84680a);
        lVarF.getClass();
        int i10 = k.f84675a[lVarF.ordinal()];
        return j$.time.temporal.u.f(i10 != 1 ? (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31 : 28, l.F(r5).E());
    }

    @Override // j$.time.temporal.n
    public final int k(j$.time.temporal.q qVar) {
        return n(qVar).a(t(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long t(j$.time.temporal.q qVar) {
        int i10;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.k(this);
        }
        int i11 = m.f84678a[((j$.time.temporal.a) qVar).ordinal()];
        if (i11 == 1) {
            i10 = this.f84681b;
        } else {
            if (i11 != 2) {
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
            }
            i10 = this.f84680a;
        }
        return i10;
    }

    @Override // j$.time.temporal.n
    public final Object p(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f84717b) {
            return j$.time.chrono.t.f84589c;
        }
        return j$.time.temporal.r.c(this, aVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        if (!j$.com.android.tools.r8.a.t(mVar).equals(j$.time.chrono.t.f84589c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.m mVarD = mVar.d(this.f84680a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVarD.d(Math.min(mVarD.n(aVar).f84726d, this.f84681b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f84680a == nVar.f84680a && this.f84681b == nVar.f84681b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f84680a << 6) + this.f84681b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        int i10 = this.f84680a;
        sb2.append(i10 < 10 ? "0" : "");
        sb2.append(i10);
        int i11 = this.f84681b;
        sb2.append(i11 < 10 ? "-0" : TokenBuilder.TOKEN_DELIMITER);
        sb2.append(i11);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new r((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
