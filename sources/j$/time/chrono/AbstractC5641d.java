package j$.time.chrono;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5641d implements InterfaceC5639b, j$.time.temporal.m, j$.time.temporal.o, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public abstract InterfaceC5639b F(long j10);

    public abstract InterfaceC5639b G(long j10);

    public abstract InterfaceC5639b H(long j10);

    @Override // j$.time.chrono.InterfaceC5639b, j$.time.temporal.n
    public /* synthetic */ boolean f(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.k(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ int k(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public /* synthetic */ j$.time.temporal.u n(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object p(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.n(this, aVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.a(this, mVar);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int compareTo(InterfaceC5639b interfaceC5639b) {
        return j$.com.android.tools.r8.a.e(this, interfaceC5639b);
    }

    public static InterfaceC5639b C(m mVar, j$.time.temporal.m mVar2) {
        InterfaceC5639b interfaceC5639b = (InterfaceC5639b) mVar2;
        if (mVar.equals(interfaceC5639b.a())) {
            return interfaceC5639b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + mVar.i() + ", actual: " + interfaceC5639b.a().i());
    }

    @Override // j$.time.chrono.InterfaceC5639b
    public InterfaceC5642e v(j$.time.j jVar) {
        return new C5644g(this, jVar);
    }

    @Override // j$.time.temporal.m
    public InterfaceC5639b e(long j10, j$.time.temporal.s sVar) {
        boolean z10 = sVar instanceof j$.time.temporal.b;
        if (!z10) {
            if (!z10) {
                return C(a(), sVar.j(this, j10));
            }
            throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
        switch (AbstractC5640c.f84558a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return F(j10);
            case 2:
                return F(j$.com.android.tools.r8.a.z(j10, 7));
            case 3:
                return G(j10);
            case 4:
                return H(j10);
            case 5:
                return H(j$.com.android.tools.r8.a.z(j10, 10));
            case 6:
                return H(j$.com.android.tools.r8.a.z(j10, 100));
            case 7:
                return H(j$.com.android.tools.r8.a.z(j10, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.u(t(aVar), j10), (j$.time.temporal.q) aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public n D() {
        return a().A(j$.time.temporal.r.a(this, j$.time.temporal.a.ERA));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC5639b) && j$.com.android.tools.r8.a.e(this, (InterfaceC5639b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC5639b
    public int hashCode() {
        long jU = u();
        return ((int) (jU ^ (jU >>> 32))) ^ a().hashCode();
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public InterfaceC5639b m(j$.time.temporal.o oVar) {
        return C(a(), oVar.w(this));
    }

    @Override // j$.time.chrono.InterfaceC5639b
    public final String toString() {
        long jT = t(j$.time.temporal.a.YEAR_OF_ERA);
        long jT2 = t(j$.time.temporal.a.MONTH_OF_YEAR);
        long jT3 = t(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(a().toString());
        sb2.append(" ");
        sb2.append(D());
        sb2.append(" ");
        sb2.append(jT);
        String str = TokenBuilder.TOKEN_DELIMITER;
        sb2.append(jT2 < 10 ? "-0" : TokenBuilder.TOKEN_DELIMITER);
        sb2.append(jT2);
        if (jT3 < 10) {
            str = "-0";
        }
        sb2.append(str);
        sb2.append(jT3);
        return sb2.toString();
    }

    @Override // j$.time.temporal.m
    public InterfaceC5639b d(long j10, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
        }
        return C(a(), qVar.n(this, j10));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public InterfaceC5639b j(long j10, j$.time.temporal.s sVar) {
        return C(a(), j$.time.temporal.r.b(this, j10, sVar));
    }

    @Override // j$.time.chrono.InterfaceC5639b
    public long u() {
        return t(j$.time.temporal.a.EPOCH_DAY);
    }
}
