package j$.time;

import com.vungle.ads.internal.signals.SignalManager;
import j$.time.chrono.InterfaceC5639b;
import j$.time.chrono.InterfaceC5642e;
import j$.time.chrono.InterfaceC5647j;
import j$.time.format.DateTimeFormatter;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.o, InterfaceC5642e, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f84529c = F(g.f84659d, j.f84667e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f84530d = F(g.f84660e, j.f84668f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f84531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f84532b;

    @Override // j$.time.chrono.InterfaceC5642e
    public final j$.time.chrono.m a() {
        return ((g) c()).a();
    }

    @Override // j$.time.chrono.InterfaceC5642e
    public final InterfaceC5647j q(ZoneOffset zoneOffset) {
        return z.C(this, zoneOffset, null);
    }

    public static LocalDateTime F(g gVar, j jVar) {
        Objects.requireNonNull(gVar, "date");
        Objects.requireNonNull(jVar, "time");
        return new LocalDateTime(gVar, jVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(((g) c()).u(), j$.time.temporal.a.EPOCH_DAY).d(b().N(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static LocalDateTime G(long j10, int i10, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j11 = i10;
        j$.time.temporal.a.NANO_OF_SECOND.w(j11);
        long j12 = j10 + ((long) zoneOffset.f84540a);
        long j13 = 86400;
        return new LocalDateTime(g.L(j$.com.android.tools.r8.a.y(j12, j13)), j.G((((long) ((int) j$.com.android.tools.r8.a.x(j12, j13))) * 1000000000) + j11));
    }

    public static LocalDateTime D(j$.time.temporal.n nVar) {
        if (nVar instanceof LocalDateTime) {
            return (LocalDateTime) nVar;
        }
        if (!(nVar instanceof z)) {
            if (nVar instanceof OffsetDateTime) {
                return ((OffsetDateTime) nVar).toLocalDateTime();
            }
            try {
                return new LocalDateTime(g.E(nVar), j.E(nVar));
            } catch (b e10) {
                throw new b("Unable to obtain LocalDateTime from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName(), e10);
            }
        }
        return ((z) nVar).f84736a;
    }

    public LocalDateTime(g gVar, j jVar) {
        this.f84531a = gVar;
        this.f84532b = jVar;
    }

    public final LocalDateTime L(g gVar, j jVar) {
        return (this.f84531a == gVar && this.f84532b == jVar) ? this : new LocalDateTime(gVar, jVar);
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
            if (((j$.time.temporal.a) qVar).C()) {
                j jVar = this.f84532b;
                jVar.getClass();
                return j$.time.temporal.r.d(jVar, qVar);
            }
            return this.f84531a.n(qVar);
        }
        return qVar.p(this);
    }

    @Override // j$.time.temporal.n
    public final int k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).C() ? this.f84532b.k(qVar) : this.f84531a.k(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).C() ? this.f84532b.t(qVar) : this.f84531a.t(qVar);
        }
        return qVar.k(this);
    }

    public final int C(LocalDateTime localDateTime) {
        int iC = this.f84531a.C(localDateTime.f84531a);
        return iC == 0 ? this.f84532b.compareTo(localDateTime.f84532b) : iC;
    }

    @Override // j$.time.chrono.InterfaceC5642e
    public final InterfaceC5639b c() {
        return this.f84531a;
    }

    @Override // j$.time.chrono.InterfaceC5642e
    public final j b() {
        return this.f84532b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(g gVar) {
        return L(gVar, this.f84532b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j10, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            boolean zC = ((j$.time.temporal.a) qVar).C();
            j jVar = this.f84532b;
            g gVar = this.f84531a;
            if (zC) {
                return L(gVar, jVar.d(j10, qVar));
            }
            return L(gVar.d(j10, qVar), jVar);
        }
        return (LocalDateTime) qVar.n(this, j10);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime e(long j10, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            int i10 = h.f84664a[((j$.time.temporal.b) sVar).ordinal()];
            j jVar = this.f84532b;
            g gVar = this.f84531a;
            switch (i10) {
                case 1:
                    return J(this.f84531a, 0L, 0L, 0L, j10);
                case 2:
                    LocalDateTime localDateTimeL = L(gVar.N(j10 / 86400000000L), jVar);
                    return localDateTimeL.J(localDateTimeL.f84531a, 0L, 0L, 0L, (j10 % 86400000000L) * 1000);
                case 3:
                    LocalDateTime localDateTimeL2 = L(gVar.N(j10 / SignalManager.TWENTY_FOUR_HOURS_MILLIS), jVar);
                    return localDateTimeL2.J(localDateTimeL2.f84531a, 0L, 0L, 0L, (j10 % SignalManager.TWENTY_FOUR_HOURS_MILLIS) * 1000000);
                case 4:
                    return I(j10);
                case 5:
                    return J(this.f84531a, 0L, j10, 0L, 0L);
                case 6:
                    return J(this.f84531a, j10, 0L, 0L, 0L);
                case 7:
                    LocalDateTime localDateTimeL3 = L(gVar.N(j10 / 256), jVar);
                    return localDateTimeL3.J(localDateTimeL3.f84531a, (j10 % 256) * 12, 0L, 0L, 0L);
                default:
                    return L(gVar.e(j10, sVar), jVar);
            }
        }
        return (LocalDateTime) sVar.j(this, j10);
    }

    public final LocalDateTime I(long j10) {
        return J(this.f84531a, 0L, 0L, j10, 0L);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j10, j$.time.temporal.b bVar) {
        return j10 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j10, bVar);
    }

    public final LocalDateTime J(g gVar, long j10, long j11, long j12, long j13) {
        long j14 = j10 | j11 | j12 | j13;
        j jVarG = this.f84532b;
        if (j14 == 0) {
            return L(gVar, jVarG);
        }
        long j15 = j10 / 24;
        long j16 = j15 + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L);
        long j17 = 1;
        long j18 = ((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L);
        long jN = jVarG.N();
        long j19 = (j18 * j17) + jN;
        long jY = j$.com.android.tools.r8.a.y(j19, 86400000000000L) + (j16 * j17);
        long jX = j$.com.android.tools.r8.a.x(j19, 86400000000000L);
        if (jX != jN) {
            jVarG = j.G(jX);
        }
        return L(gVar.N(jY), jVarG);
    }

    @Override // j$.time.temporal.n
    public final Object p(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f84721f) {
            return this.f84531a;
        }
        return j$.com.android.tools.r8.a.o(this, aVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC5642e interfaceC5642e) {
        if (interfaceC5642e instanceof LocalDateTime) {
            return C((LocalDateTime) interfaceC5642e);
        }
        return j$.com.android.tools.r8.a.f(this, interfaceC5642e);
    }

    public final boolean E(InterfaceC5642e interfaceC5642e) {
        if (interfaceC5642e instanceof LocalDateTime) {
            return C((LocalDateTime) interfaceC5642e) < 0;
        }
        long jU = this.f84531a.u();
        long jU2 = interfaceC5642e.c().u();
        if (jU >= jU2) {
            return jU == jU2 && this.f84532b.N() < interfaceC5642e.b().N();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f84531a.equals(localDateTime.f84531a) && this.f84532b.equals(localDateTime.f84532b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f84531a.hashCode() ^ this.f84532b.hashCode();
    }

    public final String toString() {
        return this.f84531a.toString() + "T" + this.f84532b.toString();
    }

    private Object writeReplace() {
        return new r((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
