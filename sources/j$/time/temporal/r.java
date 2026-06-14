package j$.time.temporal;

import androidx.collection.SieveCacheKt;
import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j$.time.format.a f84716a = new j$.time.format.a(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j$.time.format.a f84717b = new j$.time.format.a(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j$.time.format.a f84718c = new j$.time.format.a(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j$.time.format.a f84719d = new j$.time.format.a(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j$.time.format.a f84720e = new j$.time.format.a(5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j$.time.format.a f84721f = new j$.time.format.a(6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j$.time.format.a f84722g = new j$.time.format.a(7);

    public static u d(n nVar, q qVar) {
        if (!(qVar instanceof a)) {
            Objects.requireNonNull(qVar, "field");
            return qVar.p(nVar);
        }
        if (nVar.f(qVar)) {
            return ((a) qVar).f84698b;
        }
        throw new t(j$.time.c.a("Unsupported field: ", qVar));
    }

    public static int a(n nVar, q qVar) {
        u uVarN = nVar.n(qVar);
        if (uVarN.f84723a < SieveCacheKt.NodeMetaAndPreviousMask || uVarN.f84726d > SieveCacheKt.NodeLinkMask) {
            throw new t("Invalid field " + qVar + " for get() method, use getLong() instead");
        }
        long jT = nVar.t(qVar);
        if (uVarN.d(jT)) {
            return (int) jT;
        }
        throw new j$.time.b("Invalid value for " + qVar + " (valid values " + uVarN + "): " + jT);
    }

    public static Object c(n nVar, j$.time.format.a aVar) {
        if (aVar == f84716a || aVar == f84717b || aVar == f84718c) {
            return null;
        }
        return aVar.a(nVar);
    }

    public static m b(m mVar, long j10, s sVar) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            mVar = mVar.e(Long.MAX_VALUE, sVar);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return mVar.e(j11, sVar);
    }
}
