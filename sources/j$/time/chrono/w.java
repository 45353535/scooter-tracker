package j$.time.chrono;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends AbstractC5638a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f84592c = new w();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.m
    public final String i() {
        return "Japanese";
    }

    @Override // j$.time.chrono.m
    public final String s() {
        return "japanese";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC5639b l(j$.time.temporal.n nVar) {
        if (nVar instanceof y) {
            return (y) nVar;
        }
        return new y(j$.time.g.E(nVar));
    }

    private w() {
    }

    @Override // j$.time.chrono.m
    public final n A(int i10) {
        return z.o(i10);
    }

    public final j$.time.temporal.u k(j$.time.temporal.a aVar) {
        switch (v.f84591a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.t("Unsupported field: " + aVar);
            case 5:
                z[] zVarArr = z.f84599e;
                j$.time.g gVar = zVarArr[zVarArr.length - 1].f84601b;
                int iMin = Http2Connection.DEGRADED_PONG_TIMEOUT_NS - zVarArr[zVarArr.length - 1].f84601b.f84661a;
                int i10 = zVarArr[0].f84601b.f84661a;
                int i11 = 1;
                while (i11 < zVarArr.length) {
                    z zVar = zVarArr[i11];
                    iMin = Math.min(iMin, (zVar.f84601b.f84661a - i10) + 1);
                    i11++;
                    i10 = zVar.f84601b.f84661a;
                }
                return j$.time.temporal.u.f(iMin, 999999999 - gVar.f84661a);
            case 6:
                z zVar2 = z.f84598d;
                j$.time.temporal.u uVar = j$.time.temporal.a.DAY_OF_YEAR.f84698b;
                z[] zVarArr2 = z.f84599e;
                long jMin = uVar.f84725c;
                for (z zVar3 : zVarArr2) {
                    jMin = Math.min(jMin, ((zVar3.f84601b.I() ? 366 : 365) - zVar3.f84601b.H()) + 1);
                    if (zVar3.l() != null) {
                        jMin = Math.min(jMin, zVar3.l().f84601b.H() - 1);
                    }
                }
                return j$.time.temporal.u.f(jMin, j$.time.temporal.a.DAY_OF_YEAR.f84698b.f84726d);
            case 7:
                return j$.time.temporal.u.e(y.f84594d.f84661a, 999999999L);
            case 8:
                long j10 = z.f84598d.f84600a;
                z[] zVarArr3 = z.f84599e;
                return j$.time.temporal.u.e(j10, zVarArr3[zVarArr3.length - 1].f84600a);
            default:
                return aVar.f84698b;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new F((byte) 1, this);
    }
}
