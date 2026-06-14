package eg;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes3.dex */
class j0 extends kotlinx.coroutines.a implements Deferred {
    public j0(CoroutineContext coroutineContext, boolean z10) {
        super(coroutineContext, true, z10);
    }

    static /* synthetic */ Object b1(j0 j0Var, Continuation continuation) throws Throwable {
        Object objI = j0Var.I(continuation);
        pf.b.g();
        return objI;
    }

    @Override // kotlinx.coroutines.Deferred
    public Object await(Continuation continuation) {
        return b1(this, continuation);
    }

    @Override // kotlinx.coroutines.Deferred
    public mg.c e0() {
        mg.c cVarF0 = f0();
        Intrinsics.checkNotNull(cVarF0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return cVarF0;
    }

    @Override // kotlinx.coroutines.Deferred
    public Object o() {
        return Z();
    }
}
