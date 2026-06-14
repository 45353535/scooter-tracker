package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends AbstractC5638a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H f84552c = new H();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.m
    public final n A(int i10) {
        if (i10 == 0) {
            return K.BEFORE_BE;
        }
        if (i10 == 1) {
            return K.BE;
        }
        throw new j$.time.b("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.m
    public final String i() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.m
    public final String s() {
        return "buddhist";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC5639b l(j$.time.temporal.n nVar) {
        if (nVar instanceof J) {
            return (J) nVar;
        }
        return new J(j$.time.g.E(nVar));
    }

    private H() {
    }

    public final j$.time.temporal.u k(j$.time.temporal.a aVar) {
        int i10 = G.f84551a[aVar.ordinal()];
        if (i10 == 1) {
            j$.time.temporal.u uVar = j$.time.temporal.a.PROLEPTIC_MONTH.f84698b;
            return j$.time.temporal.u.e(uVar.f84723a + 6516, uVar.f84726d + 6516);
        }
        if (i10 == 2) {
            j$.time.temporal.u uVar2 = j$.time.temporal.a.YEAR.f84698b;
            return j$.time.temporal.u.f((-(uVar2.f84723a + 543)) + 1, uVar2.f84726d + 543);
        }
        if (i10 != 3) {
            return aVar.f84698b;
        }
        j$.time.temporal.u uVar3 = j$.time.temporal.a.YEAR.f84698b;
        return j$.time.temporal.u.e(uVar3.f84723a + 543, uVar3.f84726d + 543);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new F((byte) 1, this);
    }
}
