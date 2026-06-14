package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.m, j$.time.temporal.o, Comparable<OffsetDateTime>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f84533c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f84534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f84535b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iX;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.f84535b;
        ZoneOffset zoneOffset2 = this.f84535b;
        if (zoneOffset2.equals(zoneOffset)) {
            iX = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f84534a;
            localDateTime.getClass();
            long jR = j$.com.android.tools.r8.a.r(localDateTime, zoneOffset2);
            LocalDateTime localDateTime2 = offsetDateTime2.f84534a;
            localDateTime2.getClass();
            int iCompare = Long.compare(jR, j$.com.android.tools.r8.a.r(localDateTime2, offsetDateTime2.f84535b));
            iX = iCompare == 0 ? localDateTime.f84532b.f84674d - localDateTime2.f84532b.f84674d : iCompare;
        }
        return iX == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iX;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f84529c;
        ZoneOffset zoneOffset = ZoneOffset.f84539f;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f84530d;
        ZoneOffset zoneOffset2 = ZoneOffset.f84538e;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime C(Instant instant, w wVar) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(wVar, "zone");
        ZoneOffset zoneOffsetD = wVar.C().d(instant);
        return new OffsetDateTime(LocalDateTime.G(instant.getEpochSecond(), instant.getNano(), zoneOffsetD), zoneOffsetD);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f84534a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.f84535b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public final OffsetDateTime E(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f84534a == localDateTime && this.f84535b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.m(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u n(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.INSTANT_SECONDS && qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f84534a.n(qVar);
            }
            return ((j$.time.temporal.a) qVar).f84698b;
        }
        return qVar.p(this);
    }

    @Override // j$.time.temporal.n
    public final int k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i10 = o.f84682a[((j$.time.temporal.a) qVar).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.f84535b.f84540a;
            }
            return this.f84534a.k(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long t(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.k(this);
        }
        int i10 = o.f84682a[((j$.time.temporal.a) qVar).ordinal()];
        ZoneOffset zoneOffset = this.f84535b;
        LocalDateTime localDateTime = this.f84534a;
        if (i10 != 1) {
            return i10 != 2 ? localDateTime.t(qVar) : zoneOffset.f84540a;
        }
        localDateTime.getClass();
        return j$.com.android.tools.r8.a.r(localDateTime, zoneOffset);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f84534a;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(g gVar) {
        LocalDateTime localDateTime = this.f84534a;
        return E(localDateTime.L(gVar, localDateTime.f84532b), this.f84535b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j10, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i10 = o.f84682a[aVar.ordinal()];
            ZoneOffset zoneOffset = this.f84535b;
            LocalDateTime localDateTime = this.f84534a;
            if (i10 == 1) {
                return C(Instant.ofEpochSecond(j10, localDateTime.f84532b.f84674d), zoneOffset);
            }
            if (i10 == 2) {
                return E(localDateTime, ZoneOffset.I(aVar.f84698b.a(j10, aVar)));
            }
            return E(localDateTime.d(j10, qVar), zoneOffset);
        }
        return (OffsetDateTime) qVar.n(this, j10);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime e(long j10, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return E(this.f84534a.e(j10, sVar), this.f84535b);
        }
        return (OffsetDateTime) sVar.j(this, j10);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j10, j$.time.temporal.b bVar) {
        return j10 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j10, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object p(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f84719d || aVar == j$.time.temporal.r.f84720e) {
            return this.f84535b;
        }
        if (aVar == j$.time.temporal.r.f84716a) {
            return null;
        }
        j$.time.format.a aVar2 = j$.time.temporal.r.f84721f;
        LocalDateTime localDateTime = this.f84534a;
        if (aVar == aVar2) {
            return localDateTime.f84531a;
        }
        if (aVar == j$.time.temporal.r.f84722g) {
            return localDateTime.f84532b;
        }
        if (aVar == j$.time.temporal.r.f84717b) {
            return j$.time.chrono.t.f84589c;
        }
        if (aVar == j$.time.temporal.r.f84718c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.f84534a;
        return mVar.d(localDateTime.f84531a.u(), aVar).d(localDateTime.f84532b.N(), j$.time.temporal.a.NANO_OF_DAY).d(this.f84535b.f84540a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f84534a.equals(offsetDateTime.f84534a) && this.f84535b.equals(offsetDateTime.f84535b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f84534a.hashCode() ^ this.f84535b.f84540a;
    }

    public final String toString() {
        return this.f84534a.toString() + this.f84535b.f84541b;
    }

    private Object writeReplace() {
        return new r((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
