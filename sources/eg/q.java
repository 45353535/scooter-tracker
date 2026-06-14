package eg;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
final class q extends kotlinx.coroutines.b0 implements p {
    public q(Job job) {
        super(true);
        r0(job);
    }

    @Override // kotlinx.coroutines.Deferred
    public Object await(Continuation continuation) throws Throwable {
        Object objI = I(continuation);
        pf.b.g();
        return objI;
    }

    @Override // eg.p
    public boolean d(Throwable th2) {
        return x0(new t(th2, false, 2, null));
    }

    @Override // kotlinx.coroutines.Deferred
    public mg.c e0() {
        mg.c cVarF0 = f0();
        Intrinsics.checkNotNull(cVarF0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return cVarF0;
    }

    @Override // kotlinx.coroutines.b0
    public boolean g0() {
        return true;
    }

    @Override // kotlinx.coroutines.Deferred
    public Object o() {
        return Z();
    }

    @Override // eg.p
    public boolean s(Object obj) {
        return x0(obj);
    }
}
