package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends AbstractC5638a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B f84545c = new B();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.m
    public final String i() {
        return "Minguo";
    }

    @Override // j$.time.chrono.m
    public final n A(int i10) {
        if (i10 == 0) {
            return E.BEFORE_ROC;
        }
        if (i10 == 1) {
            return E.ROC;
        }
        throw new j$.time.b("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.m
    public final String s() {
        return "roc";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC5639b l(j$.time.temporal.n nVar) {
        if (nVar instanceof D) {
            return (D) nVar;
        }
        return new D(j$.time.g.E(nVar));
    }

    public final j$.time.temporal.u k(j$.time.temporal.a aVar) {
        int i10 = A.f84544a[aVar.ordinal()];
        if (i10 == 1) {
            j$.time.temporal.u uVar = j$.time.temporal.a.PROLEPTIC_MONTH.f84698b;
            return j$.time.temporal.u.e(uVar.f84723a - 22932, uVar.f84726d - 22932);
        }
        if (i10 == 2) {
            j$.time.temporal.u uVar2 = j$.time.temporal.a.YEAR.f84698b;
            return j$.time.temporal.u.f(uVar2.f84726d - 1911, (-uVar2.f84723a) + 1912);
        }
        if (i10 != 3) {
            return aVar.f84698b;
        }
        j$.time.temporal.u uVar3 = j$.time.temporal.a.YEAR.f84698b;
        return j$.time.temporal.u.e(uVar3.f84723a - 1911, uVar3.f84726d - 1911);
    }

    private B() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new F((byte) 1, this);
    }
}
