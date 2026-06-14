package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements n, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f84598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z[] f84599e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient int f84600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient j$.time.g f84601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient String f84602c;

    @Override // j$.time.temporal.n
    public final /* synthetic */ boolean f(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.l(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ int k(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.i(this, (j$.time.temporal.a) qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object p(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.q(this, aVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ long t(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.j(this, qVar);
    }

    static {
        z zVar = new z(-1, j$.time.g.K(1868, 1, 1), "Meiji");
        f84598d = zVar;
        f84599e = new z[]{zVar, new z(0, j$.time.g.K(1912, 7, 30), "Taisho"), new z(1, j$.time.g.K(1926, 12, 25), "Showa"), new z(2, j$.time.g.K(1989, 1, 8), "Heisei"), new z(3, j$.time.g.K(2019, 5, 1), "Reiwa")};
    }

    public final z l() {
        if (this == f84599e[r0.length - 1]) {
            return null;
        }
        return o(this.f84600a + 1);
    }

    public z(int i10, j$.time.g gVar, String str) {
        this.f84600a = i10;
        this.f84601b = gVar;
        this.f84602c = str;
    }

    public static z o(int i10) {
        int i11 = i10 + 1;
        if (i11 >= 0) {
            z[] zVarArr = f84599e;
            if (i11 < zVarArr.length) {
                return zVarArr[i11];
            }
        }
        throw new j$.time.b("Invalid era: " + i10);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.ERA);
    }

    public static z i(j$.time.g gVar) {
        j$.time.g gVar2 = y.f84594d;
        if (!j$.time.c.b(gVar2) ? gVar.u() >= gVar2.u() : gVar.C(gVar2) >= 0) {
            throw new j$.time.b("JapaneseDate before Meiji 6 are not supported");
        }
        z[] zVarArr = f84599e;
        for (int length = zVarArr.length - 1; length >= 0; length--) {
            z zVar = zVarArr[length];
            if (gVar.compareTo(zVar.f84601b) >= 0) {
                return zVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return this.f84600a;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u n(j$.time.temporal.q qVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (qVar != aVar) {
            return j$.time.temporal.r.d(this, qVar);
        }
        return w.f84592c.k(aVar);
    }

    public final String toString() {
        return this.f84602c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 5, this);
    }
}
