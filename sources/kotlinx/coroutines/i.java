package kotlinx.coroutines;

import eg.m1;
import eg.o0;
import eg.u0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final CoroutineScope a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(Job.N8) == null) {
            coroutineContext = coroutineContext.plus(a0.b(null, 1, null));
        }
        return new jg.e(coroutineContext);
    }

    public static final CoroutineScope b() {
        return new jg.e(m1.b(null, 1, null).plus(o0.c()));
    }

    public static final void c(CoroutineScope coroutineScope, String str, Throwable th2) {
        d(coroutineScope, u0.a(str, th2));
    }

    public static final void d(CoroutineScope coroutineScope, CancellationException cancellationException) {
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.N8);
        if (job != null) {
            job.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + coroutineScope).toString());
    }

    public static /* synthetic */ void e(CoroutineScope coroutineScope, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        c(coroutineScope, str, th2);
    }

    public static /* synthetic */ void f(CoroutineScope coroutineScope, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        d(coroutineScope, cancellationException);
    }

    public static final Object g(Function2 function2, Continuation continuation) {
        jg.a0 a0Var = new jg.a0(continuation.getContext(), continuation);
        Object objD = kg.b.d(a0Var, a0Var, function2);
        if (objD == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objD;
    }

    public static final void h(CoroutineScope coroutineScope) {
        z.m(coroutineScope.getCoroutineContext());
    }

    public static final boolean i(CoroutineScope coroutineScope) {
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.N8);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    public static final CoroutineScope j(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        return new jg.e(coroutineScope.getCoroutineContext().plus(coroutineContext));
    }
}
