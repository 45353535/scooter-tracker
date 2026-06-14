package eg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 {
    public static final Object a(long j10, Continuation continuation) {
        if (j10 <= 0) {
            return Unit.f93236a;
        }
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        if (j10 < Long.MAX_VALUE) {
            c(eVar.getContext()).e(j10, eVar);
        }
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    public static final Object b(long j10, Continuation continuation) {
        Object objA = a(d(j10), continuation);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    public static final kotlinx.coroutines.k c(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.d.M8);
        kotlinx.coroutines.k kVar = element instanceof kotlinx.coroutines.k ? (kotlinx.coroutines.k) element : null;
        return kVar == null ? i0.a() : kVar;
    }

    public static final long d(long j10) {
        boolean zE = kotlin.time.b.E(j10);
        if (zE) {
            return kotlin.time.b.q(kotlin.time.b.G(j10, kotlin.time.c.t(999999L, cg.b.f6836c)));
        }
        if (zE) {
            throw new lf.m();
        }
        return 0L;
    }
}
