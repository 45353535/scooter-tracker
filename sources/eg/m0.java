package eg;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m0 {
    public static final void a(kotlinx.coroutines.m mVar, int i10) {
        Continuation continuationE = mVar.e();
        boolean z10 = i10 == 4;
        if (z10 || !(continuationE instanceof jg.i) || b(i10) != b(mVar.f93627d)) {
            d(mVar, continuationE, z10);
            return;
        }
        jg.i iVar = (jg.i) continuationE;
        CoroutineDispatcher coroutineDispatcher = iVar.f85876e;
        CoroutineContext context = iVar.getContext();
        if (jg.j.d(coroutineDispatcher, context)) {
            jg.j.c(coroutineDispatcher, context, mVar);
        } else {
            e(mVar);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final void d(kotlinx.coroutines.m mVar, Continuation continuation, boolean z10) {
        Object objG;
        Object objI = mVar.i();
        Throwable thF = mVar.f(objI);
        if (thF != null) {
            Result.Companion companion = Result.f93230c;
            objG = kotlin.d.a(thF);
        } else {
            Result.Companion companion2 = Result.f93230c;
            objG = mVar.g(objI);
        }
        Object objB = Result.b(objG);
        if (!z10) {
            continuation.resumeWith(objB);
            return;
        }
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        jg.i iVar = (jg.i) continuation;
        Continuation continuation2 = iVar.f85877f;
        Object obj = iVar.f85879h;
        CoroutineContext context = continuation2.getContext();
        Object objI2 = jg.l0.i(context, obj);
        y1 y1VarM = objI2 != jg.l0.f85891a ? a0.m(continuation2, context, objI2) : null;
        try {
            iVar.f85877f.resumeWith(objB);
            Unit unit = Unit.f93236a;
            if (y1VarM == null || y1VarM.c1()) {
                jg.l0.f(context, objI2);
            }
        } catch (Throwable th2) {
            if (y1VarM == null || y1VarM.c1()) {
                jg.l0.f(context, objI2);
            }
            throw th2;
        }
    }

    private static final void e(kotlinx.coroutines.m mVar) {
        r0 r0VarB = p1.f69163a.b();
        if (r0VarB.r0()) {
            r0VarB.y(mVar);
            return;
        }
        r0VarB.R(true);
        try {
            d(mVar, mVar.e(), true);
            do {
            } while (r0VarB.u0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
