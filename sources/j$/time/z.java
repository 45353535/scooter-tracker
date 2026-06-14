package j$.time;

import com.ironsource.C4240b4;
import j$.time.chrono.InterfaceC5639b;
import j$.time.chrono.InterfaceC5642e;
import j$.time.chrono.InterfaceC5647j;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements j$.time.temporal.m, InterfaceC5647j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f84736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f84737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f84738c;

    @Override // j$.time.chrono.InterfaceC5647j
    public final /* synthetic */ long B() {
        return j$.com.android.tools.r8.a.s(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.com.android.tools.r8.a.g(this, (InterfaceC5647j) obj);
    }

    @Override // j$.time.chrono.InterfaceC5647j
    public final j$.time.chrono.m a() {
        return ((g) c()).a();
    }

    public static z C(LocalDateTime localDateTime, w wVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(wVar, "zone");
        if (wVar instanceof ZoneOffset) {
            return new z(localDateTime, wVar, (ZoneOffset) wVar);
        }
        j$.time.zone.f fVarC = wVar.C();
        List listF = fVarC.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) listF.get(0), "offset");
            }
        } else {
            Object objE = fVarC.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.I(Duration.j(bVar.f84744d.f84540a - bVar.f84743c.f84540a, 0).f84524a);
            zoneOffset = bVar.f84744d;
        }
        return new z(localDateTime, wVar, zoneOffset);
    }

    public static z w(long j10, int i10, w wVar) {
        ZoneOffset zoneOffsetD = wVar.C().d(Instant.ofEpochSecond(j10, i10));
        return new z(LocalDateTime.G(j10, i10, zoneOffsetD), wVar, zoneOffsetD);
    }

    public z(LocalDateTime localDateTime, w wVar, ZoneOffset zoneOffset) {
        this.f84736a = localDateTime;
        this.f84737b = zoneOffset;
        this.f84738c = wVar;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.m(this);
    }

    @Override // j$.time.chrono.InterfaceC5647j
    public final InterfaceC5639b c() {
        return this.f84736a.f84531a;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u n(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) qVar).f84698b;
            }
            return this.f84736a.n(qVar);
        }
        return qVar.p(this);
    }

    @Override // j$.time.temporal.n
    public final int k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i10 = y.f84735a[((j$.time.temporal.a) qVar).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.f84737b.f84540a;
            }
            return this.f84736a.k(qVar);
        }
        return j$.com.android.tools.r8.a.h(this, qVar);
    }

    @Override // j$.time.chrono.InterfaceC5647j
    public final j b() {
        return this.f84736a.f84532b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(g gVar) {
        return C(LocalDateTime.F(gVar, this.f84736a.f84532b), this.f84738c, this.f84737b);
    }

    @Override // j$.time.temporal.n
    public final long t(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.k(this);
        }
        int i10 = y.f84735a[((j$.time.temporal.a) qVar).ordinal()];
        return i10 != 1 ? i10 != 2 ? this.f84736a.t(qVar) : this.f84737b.f84540a : j$.com.android.tools.r8.a.s(this);
    }

    @Override // j$.time.chrono.InterfaceC5647j
    public final ZoneOffset g() {
        return this.f84737b;
    }

    @Override // j$.time.chrono.InterfaceC5647j
    public final w r() {
        return this.f84738c;
    }

    @Override // j$.time.chrono.InterfaceC5647j
    public final InterfaceC5647j h(w wVar) {
        Objects.requireNonNull(wVar, "zone");
        return this.f84738c.equals(wVar) ? this : C(this.f84736a, wVar, this.f84737b);
    }

    @Override // j$.time.chrono.InterfaceC5647j
    public final InterfaceC5642e y() {
        return this.f84736a;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j10, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i10 = y.f84735a[aVar.ordinal()];
            LocalDateTime localDateTime = this.f84736a;
            w wVar = this.f84738c;
            if (i10 == 1) {
                return w(j10, localDateTime.f84532b.f84674d, wVar);
            }
            ZoneOffset zoneOffset = this.f84737b;
            if (i10 != 2) {
                return C(localDateTime.d(j10, qVar), wVar, zoneOffset);
            }
            ZoneOffset zoneOffsetI = ZoneOffset.I(aVar.f84698b.a(j10, aVar));
            return (zoneOffsetI.equals(zoneOffset) || !wVar.C().f(localDateTime).contains(zoneOffsetI)) ? this : new z(localDateTime, wVar, zoneOffsetI);
        }
        return (z) qVar.n(this, j10);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final z e(long j10, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (z) sVar.j(this, j10);
        }
        j$.time.temporal.b bVar = (j$.time.temporal.b) sVar;
        int iCompareTo = bVar.compareTo(j$.time.temporal.b.DAYS);
        ZoneOffset zoneOffset = this.f84737b;
        w wVar = this.f84738c;
        LocalDateTime localDateTime = this.f84736a;
        if (iCompareTo >= 0 && bVar != j$.time.temporal.b.FOREVER) {
            return C(localDateTime.e(j10, sVar), wVar, zoneOffset);
        }
        LocalDateTime localDateTimeE = localDateTime.e(j10, sVar);
        Objects.requireNonNull(localDateTimeE, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(wVar, "zone");
        if (wVar.C().f(localDateTimeE).contains(zoneOffset)) {
            return new z(localDateTimeE, wVar, zoneOffset);
        }
        localDateTimeE.getClass();
        return w(j$.com.android.tools.r8.a.r(localDateTimeE, zoneOffset), localDateTimeE.f84532b.f84674d, wVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j10, j$.time.temporal.b bVar) {
        return j10 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j10, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object p(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f84721f) {
            return this.f84736a.f84531a;
        }
        return j$.com.android.tools.r8.a.p(this, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f84736a.equals(zVar.f84736a) && this.f84737b.equals(zVar.f84737b) && this.f84738c.equals(zVar.f84738c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f84736a.hashCode() ^ this.f84737b.f84540a) ^ Integer.rotateLeft(this.f84738c.hashCode(), 3);
    }

    public final String toString() {
        String string = this.f84736a.toString();
        ZoneOffset zoneOffset = this.f84737b;
        String str = string + zoneOffset.f84541b;
        w wVar = this.f84738c;
        if (zoneOffset == wVar) {
            return str;
        }
        return str + C4240b4.j.f42672d + wVar.toString() + C4240b4.j.f42674e;
    }

    private Object writeReplace() {
        return new r((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
