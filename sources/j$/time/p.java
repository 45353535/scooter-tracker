package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f84683c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f84684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f84685b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        ZoneOffset zoneOffset = pVar.f84685b;
        ZoneOffset zoneOffset2 = this.f84685b;
        boolean zEquals = zoneOffset2.equals(zoneOffset);
        j jVar = pVar.f84684a;
        j jVar2 = this.f84684a;
        if (zEquals) {
            return jVar2.compareTo(jVar);
        }
        int iCompare = Long.compare(jVar2.N() - (((long) zoneOffset2.f84540a) * 1000000000), jVar.N() - (((long) pVar.f84685b.f84540a) * 1000000000));
        return iCompare == 0 ? jVar2.compareTo(jVar) : iCompare;
    }

    static {
        j jVar = j.f84667e;
        ZoneOffset zoneOffset = ZoneOffset.f84539f;
        jVar.getClass();
        new p(jVar, zoneOffset);
        j jVar2 = j.f84668f;
        ZoneOffset zoneOffset2 = ZoneOffset.f84538e;
        jVar2.getClass();
        new p(jVar2, zoneOffset2);
    }

    public p(j jVar, ZoneOffset zoneOffset) {
        this.f84684a = (j) Objects.requireNonNull(jVar, "time");
        this.f84685b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public final p D(j jVar, ZoneOffset zoneOffset) {
        return (this.f84684a == jVar && this.f84685b.equals(zoneOffset)) ? this : new p(jVar, zoneOffset);
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).C() || qVar == j$.time.temporal.a.OFFSET_SECONDS : qVar != null && qVar.m(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u n(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                j jVar = this.f84684a;
                jVar.getClass();
                return j$.time.temporal.r.d(jVar, qVar);
            }
            return ((j$.time.temporal.a) qVar).f84698b;
        }
        return qVar.p(this);
    }

    @Override // j$.time.temporal.n
    public final int k(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f84685b.f84540a;
            }
            return this.f84684a.t(qVar);
        }
        return qVar.k(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j10, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            j jVar = this.f84684a;
            if (qVar == aVar) {
                j$.time.temporal.a aVar2 = (j$.time.temporal.a) qVar;
                return D(jVar, ZoneOffset.I(aVar2.f84698b.a(j10, aVar2)));
            }
            return D(jVar.d(j10, qVar), this.f84685b);
        }
        return (p) qVar.n(this, j10);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final p e(long j10, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return D(this.f84684a.e(j10, sVar), this.f84685b);
        }
        return (p) sVar.j(this, j10);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j10, j$.time.temporal.b bVar) {
        return j10 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j10, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object p(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f84719d || aVar == j$.time.temporal.r.f84720e) {
            return this.f84685b;
        }
        if (((aVar == j$.time.temporal.r.f84716a) || (aVar == j$.time.temporal.r.f84717b)) || aVar == j$.time.temporal.r.f84721f) {
            return null;
        }
        if (aVar == j$.time.temporal.r.f84722g) {
            return this.f84684a;
        }
        if (aVar == j$.time.temporal.r.f84718c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(this.f84684a.N(), j$.time.temporal.a.NANO_OF_DAY).d(this.f84685b.f84540a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f84684a.equals(pVar.f84684a) && this.f84685b.equals(pVar.f84685b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f84684a.hashCode() ^ this.f84685b.f84540a;
    }

    public final String toString() {
        return this.f84684a.toString() + this.f84685b.f84541b;
    }

    private Object writeReplace() {
        return new r((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(g gVar) {
        return (p) j$.com.android.tools.r8.a.a(gVar, this);
    }
}
