package eg;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class i {
    public static final Deferred a(CoroutineScope coroutineScope, CoroutineContext coroutineContext, f0 f0Var, Function2 function2) {
        CoroutineContext coroutineContextK = a0.k(coroutineScope, coroutineContext);
        j0 c1Var = f0Var.h() ? new c1(coroutineContextK, function2) : new j0(coroutineContextK, true);
        c1Var.a1(f0Var, c1Var, function2);
        return c1Var;
    }

    public static /* synthetic */ Deferred b(CoroutineScope coroutineScope, CoroutineContext coroutineContext, f0 f0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f93267b;
        }
        if ((i10 & 2) != 0) {
            f0Var = f0.f69146b;
        }
        return g.a(coroutineScope, coroutineContext, f0Var, function2);
    }

    public static final Job c(CoroutineScope coroutineScope, CoroutineContext coroutineContext, f0 f0Var, Function2 function2) {
        CoroutineContext coroutineContextK = a0.k(coroutineScope, coroutineContext);
        j1 d1Var = f0Var.h() ? new d1(coroutineContextK, function2) : new j1(coroutineContextK, true);
        d1Var.a1(f0Var, d1Var, function2);
        return d1Var;
    }

    public static /* synthetic */ Job d(CoroutineScope coroutineScope, CoroutineContext coroutineContext, f0 f0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f93267b;
        }
        if ((i10 & 2) != 0) {
            f0Var = f0.f69146b;
        }
        return g.c(coroutineScope, coroutineContext, f0Var, function2);
    }

    public static final Object e(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        Object objC1;
        CoroutineContext context = continuation.getContext();
        CoroutineContext coroutineContextJ = a0.j(context, coroutineContext);
        kotlinx.coroutines.z.m(coroutineContextJ);
        if (coroutineContextJ == context) {
            jg.a0 a0Var = new jg.a0(coroutineContextJ, continuation);
            objC1 = kg.b.d(a0Var, a0Var, function2);
        } else {
            d.b bVar = kotlin.coroutines.d.M8;
            if (Intrinsics.areEqual(coroutineContextJ.get(bVar), context.get(bVar))) {
                y1 y1Var = new y1(coroutineContextJ, continuation);
                CoroutineContext context2 = y1Var.getContext();
                Object objI = jg.l0.i(context2, null);
                try {
                    Object objD = kg.b.d(y1Var, y1Var, function2);
                    jg.l0.f(context2, objI);
                    objC1 = objD;
                } catch (Throwable th2) {
                    jg.l0.f(context2, objI);
                    throw th2;
                }
            } else {
                kotlinx.coroutines.l lVar = new kotlinx.coroutines.l(coroutineContextJ, continuation);
                kg.a.d(function2, lVar, lVar);
                objC1 = lVar.c1();
            }
        }
        if (objC1 == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC1;
    }
}
