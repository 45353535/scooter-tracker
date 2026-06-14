package j$.time.chrono;

import com.vungle.ads.internal.signals.SignalManager;
import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5644g implements InterfaceC5642e, j$.time.temporal.m, j$.time.temporal.o, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient InterfaceC5639b f84560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient j$.time.j f84561b;

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object p(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.o(this, aVar);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int compareTo(InterfaceC5642e interfaceC5642e) {
        return j$.com.android.tools.r8.a.f(this, interfaceC5642e);
    }

    public static C5644g C(m mVar, j$.time.temporal.m mVar2) {
        C5644g c5644g = (C5644g) mVar2;
        if (mVar.equals(c5644g.f84560a.a())) {
            return c5644g;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.i() + ", actual: " + c5644g.f84560a.a().i());
    }

    @Override // j$.time.chrono.InterfaceC5642e
    public final m a() {
        return this.f84560a.a();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j10, j$.time.temporal.b bVar) {
        return C(this.f84560a.a(), j$.time.temporal.r.b(this, j10, bVar));
    }

    public C5644g(InterfaceC5639b interfaceC5639b, j$.time.j jVar) {
        Objects.requireNonNull(interfaceC5639b, "date");
        Objects.requireNonNull(jVar, "time");
        this.f84560a = interfaceC5639b;
        this.f84561b = jVar;
    }

    public final C5644g G(j$.time.temporal.m mVar, j$.time.j jVar) {
        InterfaceC5639b interfaceC5639b = this.f84560a;
        return (interfaceC5639b == mVar && this.f84561b == jVar) ? this : new C5644g(AbstractC5641d.C(interfaceC5639b.a(), mVar), jVar);
    }

    @Override // j$.time.chrono.InterfaceC5642e
    public final InterfaceC5639b c() {
        return this.f84560a;
    }

    @Override // j$.time.chrono.InterfaceC5642e
    public final j$.time.j b() {
        return this.f84561b;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar != null && qVar.m(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        return aVar.t() || aVar.C();
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u n(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (!((j$.time.temporal.a) qVar).C()) {
                return this.f84560a.n(qVar);
            }
            j$.time.j jVar = this.f84561b;
            jVar.getClass();
            return j$.time.temporal.r.d(jVar, qVar);
        }
        return qVar.p(this);
    }

    @Override // j$.time.temporal.n
    public final int k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).C() ? this.f84561b.k(qVar) : this.f84560a.k(qVar);
        }
        return n(qVar).a(t(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).C() ? this.f84561b.t(qVar) : this.f84560a.t(qVar);
        }
        return qVar.k(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(j$.time.g gVar) {
        return G(gVar, this.f84561b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final C5644g d(long j10, j$.time.temporal.q qVar) {
        boolean z10 = qVar instanceof j$.time.temporal.a;
        InterfaceC5639b interfaceC5639b = this.f84560a;
        if (z10) {
            boolean zC = ((j$.time.temporal.a) qVar).C();
            j$.time.j jVar = this.f84561b;
            if (zC) {
                return G(interfaceC5639b, jVar.d(j10, qVar));
            }
            return G(interfaceC5639b.d(j10, qVar), jVar);
        }
        return C(interfaceC5639b.a(), qVar.n(this, j10));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final C5644g e(long j10, j$.time.temporal.s sVar) {
        boolean z10 = sVar instanceof j$.time.temporal.b;
        InterfaceC5639b interfaceC5639b = this.f84560a;
        if (z10) {
            int i10 = AbstractC5643f.f84559a[((j$.time.temporal.b) sVar).ordinal()];
            j$.time.j jVar = this.f84561b;
            switch (i10) {
                case 1:
                    return E(this.f84560a, 0L, 0L, 0L, j10);
                case 2:
                    C5644g c5644gG = G(interfaceC5639b.e(j10 / 86400000000L, (j$.time.temporal.s) j$.time.temporal.b.DAYS), jVar);
                    return c5644gG.E(c5644gG.f84560a, 0L, 0L, 0L, (j10 % 86400000000L) * 1000);
                case 3:
                    C5644g c5644gG2 = G(interfaceC5639b.e(j10 / SignalManager.TWENTY_FOUR_HOURS_MILLIS, (j$.time.temporal.s) j$.time.temporal.b.DAYS), jVar);
                    return c5644gG2.E(c5644gG2.f84560a, 0L, 0L, 0L, (j10 % SignalManager.TWENTY_FOUR_HOURS_MILLIS) * 1000000);
                case 4:
                    return E(this.f84560a, 0L, 0L, j10, 0L);
                case 5:
                    return E(this.f84560a, 0L, j10, 0L, 0L);
                case 6:
                    return E(this.f84560a, j10, 0L, 0L, 0L);
                case 7:
                    C5644g c5644gG3 = G(interfaceC5639b.e(j10 / 256, (j$.time.temporal.s) j$.time.temporal.b.DAYS), jVar);
                    return c5644gG3.E(c5644gG3.f84560a, (j10 % 256) * 12, 0L, 0L, 0L);
                default:
                    return G(interfaceC5639b.e(j10, sVar), jVar);
            }
        }
        return C(interfaceC5639b.a(), sVar.j(this, j10));
    }

    public final C5644g E(InterfaceC5639b interfaceC5639b, long j10, long j11, long j12, long j13) {
        long j14 = j10 | j11 | j12 | j13;
        j$.time.j jVarG = this.f84561b;
        if (j14 == 0) {
            return G(interfaceC5639b, jVarG);
        }
        long j15 = j11 / 1440;
        long j16 = j10 / 24;
        long j17 = (j11 % 1440) * 60000000000L;
        long j18 = ((j10 % 24) * 3600000000000L) + j17 + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L);
        long jN = jVarG.N();
        long j19 = j18 + jN;
        long jY = j$.com.android.tools.r8.a.y(j19, 86400000000000L) + j16 + j15 + (j12 / 86400) + (j13 / 86400000000000L);
        long jX = j$.com.android.tools.r8.a.x(j19, 86400000000000L);
        if (jX != jN) {
            jVarG = j$.time.j.G(jX);
        }
        return G(interfaceC5639b.e(jY, (j$.time.temporal.s) j$.time.temporal.b.DAYS), jVarG);
    }

    @Override // j$.time.chrono.InterfaceC5642e
    public final InterfaceC5647j q(ZoneOffset zoneOffset) {
        return l.C(zoneOffset, null, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(c().u(), j$.time.temporal.a.EPOCH_DAY).d(b().N(), j$.time.temporal.a.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new F((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC5642e) && j$.com.android.tools.r8.a.f(this, (InterfaceC5642e) obj) == 0;
    }

    public final int hashCode() {
        return this.f84560a.hashCode() ^ this.f84561b.hashCode();
    }

    public final String toString() {
        return this.f84560a.toString() + "T" + this.f84561b.toString();
    }
}
