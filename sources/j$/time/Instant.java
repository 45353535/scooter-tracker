package j$.time;

import j$.time.format.DateTimeFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.o, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Instant f84526c = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public static Instant now() {
        a.f84542b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f84527a, instant2.f84527a);
        return iCompare != 0 ? iCompare : this.f84528b - instant2.f84528b;
    }

    public static Instant ofEpochSecond(long j10, long j11) {
        return C(j$.com.android.tools.r8.a.u(j10, j$.com.android.tools.r8.a.y(j11, 1000000000L)), (int) j$.com.android.tools.r8.a.x(j11, 1000000000L));
    }

    public static Instant ofEpochMilli(long j10) {
        long j11 = 1000;
        return C(j$.com.android.tools.r8.a.y(j10, j11), ((int) j$.com.android.tools.r8.a.x(j10, j11)) * 1000000);
    }

    public static Instant C(long j10, int i10) {
        if ((((long) i10) | j10) == 0) {
            return f84526c;
        }
        if (j10 < -31557014167219200L || j10 > 31556889864403199L) {
            throw new b("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j10, i10);
    }

    public Instant(long j10, int i10) {
        this.f84527a = j10;
        this.f84528b = i10;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.NANO_OF_SECOND || qVar == j$.time.temporal.a.MICRO_OF_SECOND || qVar == j$.time.temporal.a.MILLI_OF_SECOND : qVar != null && qVar.m(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u n(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int k(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.r.d(this, qVar).a(qVar.k(this), qVar);
        }
        int i10 = e.f84605a[((j$.time.temporal.a) qVar).ordinal()];
        int i11 = this.f84528b;
        if (i10 == 1) {
            return i11;
        }
        if (i10 == 2) {
            return i11 / 1000;
        }
        if (i10 == 3) {
            return i11 / 1000000;
        }
        if (i10 == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.f84698b.a(this.f84527a, aVar);
        }
        throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.n
    public final long t(j$.time.temporal.q qVar) {
        int i10;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.k(this);
        }
        int i11 = e.f84605a[((j$.time.temporal.a) qVar).ordinal()];
        int i12 = this.f84528b;
        if (i11 == 1) {
            return i12;
        }
        if (i11 == 2) {
            i10 = i12 / 1000;
        } else {
            if (i11 != 3) {
                if (i11 == 4) {
                    return this.f84527a;
                }
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
            }
            i10 = i12 / 1000000;
        }
        return i10;
    }

    public long getEpochSecond() {
        return this.f84527a;
    }

    public int getNano() {
        return this.f84528b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (Instant) qVar.n(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.w(j10);
        int i10 = e.f84605a[aVar.ordinal()];
        int i11 = this.f84528b;
        long j11 = this.f84527a;
        if (i10 != 1) {
            if (i10 == 2) {
                int i12 = ((int) j10) * 1000;
                if (i12 != i11) {
                    return C(j11, i12);
                }
            } else if (i10 == 3) {
                int i13 = ((int) j10) * 1000000;
                if (i13 != i11) {
                    return C(j11, i13);
                }
            } else {
                if (i10 != 4) {
                    throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
                }
                if (j10 != j11) {
                    return C(j10, i11);
                }
            }
        } else if (j10 != i11) {
            return C(j11, (int) j10);
        }
        return this;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final Instant e(long j10, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (Instant) sVar.j(this, j10);
        }
        switch (e.f84606b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return D(0L, j10);
            case 2:
                return D(j10 / 1000000, (j10 % 1000000) * 1000);
            case 3:
                return D(j10 / 1000, (j10 % 1000) * 1000000);
            case 4:
                return D(j10, 0L);
            case 5:
                return D(j$.com.android.tools.r8.a.z(j10, 60), 0L);
            case 6:
                return D(j$.com.android.tools.r8.a.z(j10, 3600), 0L);
            case 7:
                return D(j$.com.android.tools.r8.a.z(j10, 43200), 0L);
            case 8:
                return D(j$.com.android.tools.r8.a.z(j10, 86400), 0L);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final Instant D(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return ofEpochSecond(j$.com.android.tools.r8.a.u(j$.com.android.tools.r8.a.u(this.f84527a, j10), j11 / 1000000000), ((long) this.f84528b) + (j11 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j10, j$.time.temporal.b bVar) {
        return j10 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j10, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object p(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f84718c) {
            return j$.time.temporal.b.NANOS;
        }
        if (aVar == j$.time.temporal.r.f84717b || aVar == j$.time.temporal.r.f84716a || aVar == j$.time.temporal.r.f84720e || aVar == j$.time.temporal.r.f84719d || aVar == j$.time.temporal.r.f84721f || aVar == j$.time.temporal.r.f84722g) {
            return null;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(this.f84527a, j$.time.temporal.a.INSTANT_SECONDS).d(this.f84528b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.C(this, zoneOffset);
    }

    public long toEpochMilli() {
        long j10 = this.f84527a;
        return (j10 >= 0 || this.f84528b <= 0) ? j$.com.android.tools.r8.a.u(j$.com.android.tools.r8.a.z(j10, 1000), r5 / 1000000) : j$.com.android.tools.r8.a.u(j$.com.android.tools.r8.a.z(j10 + 1, 1000), (r5 / 1000000) - 1000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f84527a == instant.f84527a && this.f84528b == instant.f84528b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f84527a;
        return (this.f84528b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.f84609e.a(this);
    }

    private Object writeReplace() {
        return new r((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(g gVar) {
        return (Instant) j$.com.android.tools.r8.a.a(gVar, this);
    }
}
