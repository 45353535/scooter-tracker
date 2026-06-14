package kg;

import eg.l0;
import eg.t;
import eg.v1;
import jg.a0;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.g;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.b1;
import kotlinx.coroutines.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    private static final Void a(a0 a0Var, l0 l0Var) throws Throwable {
        a0Var.x0(new t(l0Var.getCause(), false, 2, null));
        throw l0Var.getCause();
    }

    private static final boolean b(a0 a0Var, Throwable th2) {
        return ((th2 instanceof v1) && ((v1) th2).f69179b == a0Var) ? false : true;
    }

    public static final void c(Function2 function2, Object obj, Continuation continuation) {
        Continuation continuationA = g.a(continuation);
        try {
            CoroutineContext context = continuationA.getContext();
            Object objI = jg.l0.i(context, null);
            try {
                g.b(continuationA);
                Object objE = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? pf.b.e(function2, obj, continuationA) : ((Function2) b1.g(function2, 2)).invoke(obj, continuationA);
                jg.l0.f(context, objI);
                if (objE != pf.b.g()) {
                    continuationA.resumeWith(Result.b(objE));
                }
            } catch (Throwable th2) {
                jg.l0.f(context, objI);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof l0) {
                th = ((l0) th).getCause();
            }
            Result.Companion companion = Result.f93230c;
            continuationA.resumeWith(Result.b(d.a(th)));
        }
    }

    public static final Object d(a0 a0Var, Object obj, Function2 function2) {
        return f(a0Var, true, obj, function2);
    }

    public static final Object e(a0 a0Var, Object obj, Function2 function2) {
        return f(a0Var, false, obj, function2);
    }

    private static final Object f(a0 a0Var, boolean z10, Object obj, Function2 function2) throws Throwable {
        Object tVar;
        try {
            tVar = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? pf.b.e(function2, obj, a0Var) : ((Function2) b1.g(function2, 2)).invoke(obj, a0Var);
        } catch (l0 e10) {
            a(a0Var, e10);
            throw new lf.g();
        } catch (Throwable th2) {
            tVar = new t(th2, false, 2, null);
        }
        if (tVar == pf.b.g()) {
            return pf.b.g();
        }
        Object objY0 = a0Var.y0(tVar);
        if (objY0 == c0.f93597b) {
            return pf.b.g();
        }
        a0Var.b1();
        if (!(objY0 instanceof t)) {
            return c0.h(objY0);
        }
        if (z10 || b(a0Var, ((t) objY0).f69173a)) {
            throw ((t) objY0).f69173a;
        }
        if (tVar instanceof t) {
            throw ((t) tVar).f69173a;
        }
        return tVar;
    }
}
