package j$.time.chrono;

import com.ironsource.C4240b4;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements InterfaceC5647j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient C5644g f84569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient ZoneOffset f84570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient j$.time.w f84571c;

    @Override // j$.time.chrono.InterfaceC5647j
    public final /* synthetic */ long B() {
        return j$.com.android.tools.r8.a.s(this);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ int k(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.h(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object p(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.p(this, aVar);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.com.android.tools.r8.a.g(this, (InterfaceC5647j) obj);
    }

    public static l C(j$.time.w wVar, ZoneOffset zoneOffset, C5644g c5644g) {
        Objects.requireNonNull(c5644g, "localDateTime");
        Objects.requireNonNull(wVar, "zone");
        if (wVar instanceof ZoneOffset) {
            return new l(wVar, (ZoneOffset) wVar, c5644g);
        }
        j$.time.zone.f fVarC = wVar.C();
        LocalDateTime localDateTimeD = LocalDateTime.D(c5644g);
        List listF = fVarC.f(localDateTimeD);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            c5644g = c5644g;
        } else {
            Object objE = fVarC.e(localDateTimeD);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            c5644g = c5644g.E(c5644g.f84560a, 0L, 0L, Duration.j(bVar.f84744d.f84540a - bVar.f84743c.f84540a, 0).f84524a, 0L);
            zoneOffset = bVar.f84744d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new l(wVar, zoneOffset, c5644g);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u n(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.INSTANT_SECONDS && qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return ((C5644g) y()).n(qVar);
            }
            return ((j$.time.temporal.a) qVar).f84698b;
        }
        return qVar.p(this);
    }

    public static l w(m mVar, j$.time.temporal.m mVar2) {
        l lVar = (l) mVar2;
        if (mVar.equals(lVar.a())) {
            return lVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.i() + ", actual: " + lVar.a().i());
    }

    @Override // j$.time.temporal.n
    public final long t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i10 = AbstractC5646i.f84567a[((j$.time.temporal.a) qVar).ordinal()];
            if (i10 == 1) {
                return B();
            }
            if (i10 != 2) {
                return ((C5644g) y()).t(qVar);
            }
            return g().f84540a;
        }
        return qVar.k(this);
    }

    public l(j$.time.w wVar, ZoneOffset zoneOffset, C5644g c5644g) {
        this.f84569a = (C5644g) Objects.requireNonNull(c5644g, "dateTime");
        this.f84570b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.f84571c = (j$.time.w) Objects.requireNonNull(wVar, "zone");
    }

    @Override // j$.time.chrono.InterfaceC5647j
    public final ZoneOffset g() {
        return this.f84570b;
    }

    @Override // j$.time.chrono.InterfaceC5647j
    public final InterfaceC5639b c() {
        return ((C5644g) y()).c();
    }

    @Override // j$.time.chrono.InterfaceC5647j
    public final j$.time.j b() {
        return ((C5644g) y()).b();
    }

    @Override // j$.time.chrono.InterfaceC5647j
    public final InterfaceC5642e y() {
        return this.f84569a;
    }

    @Override // j$.time.chrono.InterfaceC5647j
    public final j$.time.w r() {
        return this.f84571c;
    }

    @Override // j$.time.chrono.InterfaceC5647j
    public final m a() {
        return c().a();
    }

    @Override // j$.time.chrono.InterfaceC5647j
    public final InterfaceC5647j h(j$.time.w wVar) {
        return C(wVar, this.f84570b, this.f84569a);
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.m(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return w(a(), qVar.n(this, j10));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i10 = AbstractC5648k.f84568a[aVar.ordinal()];
        if (i10 == 1) {
            return e(j10 - j$.com.android.tools.r8.a.s(this), j$.time.temporal.b.SECONDS);
        }
        j$.time.w wVar = this.f84571c;
        C5644g c5644g = this.f84569a;
        if (i10 != 2) {
            return C(wVar, this.f84570b, c5644g.d(j10, qVar));
        }
        ZoneOffset zoneOffsetI = ZoneOffset.I(aVar.f84698b.a(j10, aVar));
        c5644g.getClass();
        Instant instantOfEpochSecond = Instant.ofEpochSecond(j$.com.android.tools.r8.a.r(c5644g, zoneOffsetI), c5644g.f84561b.f84674d);
        m mVarA = a();
        ZoneOffset zoneOffsetD = wVar.C().d(instantOfEpochSecond);
        Objects.requireNonNull(zoneOffsetD, "offset");
        return new l(wVar, zoneOffsetD, (C5644g) mVarA.o(LocalDateTime.G(instantOfEpochSecond.getEpochSecond(), instantOfEpochSecond.getNano(), zoneOffsetD)));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final l e(long j10, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return w(a(), this.f84569a.e(j10, sVar).w(this));
        }
        return w(a(), sVar.j(this, j10));
    }

    private Object writeReplace() {
        return new F((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC5647j) && j$.com.android.tools.r8.a.g(this, (InterfaceC5647j) obj) == 0;
    }

    public final int hashCode() {
        return (this.f84569a.hashCode() ^ this.f84570b.f84540a) ^ Integer.rotateLeft(this.f84571c.hashCode(), 3);
    }

    public final String toString() {
        String string = this.f84569a.toString();
        ZoneOffset zoneOffset = this.f84570b;
        String str = string + zoneOffset.f84541b;
        j$.time.w wVar = this.f84571c;
        if (zoneOffset == wVar) {
            return str;
        }
        return str + C4240b4.j.f42672d + wVar.toString() + C4240b4.j.f42674e;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(j$.time.g gVar) {
        return w(a(), gVar.w(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j10, j$.time.temporal.b bVar) {
        return w(a(), j$.time.temporal.r.b(this, j10, bVar));
    }
}
