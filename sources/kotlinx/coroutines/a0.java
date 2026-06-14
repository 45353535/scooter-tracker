package kotlinx.coroutines;

import eg.b1;
import eg.p0;
import eg.u0;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.Job;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a0 {

    /* synthetic */ class a extends kotlin.jvm.internal.y implements Function1 {
        a(Object obj) {
            super(1, obj, b1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f93236a;
        }

        public final void invoke(Throwable th2) {
            ((b1) this.receiver).v(th2);
        }
    }

    public static final eg.s a(Job job) {
        return new y(job);
    }

    public static /* synthetic */ eg.s b(Job job, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            job = null;
        }
        return z.a(job);
    }

    public static final void c(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Job job = (Job) coroutineContext.get(Job.N8);
        if (job != null) {
            job.cancel(cancellationException);
        }
    }

    public static final void d(Job job, String str, Throwable th2) {
        job.cancel(u0.a(str, th2));
    }

    public static /* synthetic */ void e(CoroutineContext coroutineContext, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        z.c(coroutineContext, cancellationException);
    }

    public static /* synthetic */ void f(Job job, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        z.d(job, str, th2);
    }

    public static final Object g(Job job, Continuation continuation) {
        Job.a.a(job, null, 1, null);
        Object objI0 = job.i0(continuation);
        return objI0 == pf.b.g() ? objI0 : Unit.f93236a;
    }

    public static final void h(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Sequence children;
        Job job = (Job) coroutineContext.get(Job.N8);
        if (job == null || (children = job.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel(cancellationException);
        }
    }

    public static final void i(Job job, CancellationException cancellationException) {
        Iterator it = job.getChildren().iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel(cancellationException);
        }
    }

    public static /* synthetic */ void j(CoroutineContext coroutineContext, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        z.h(coroutineContext, cancellationException);
    }

    public static /* synthetic */ void k(Job job, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        z.i(job, cancellationException);
    }

    public static final p0 l(Job job, p0 p0Var) {
        return q(job, false, new o(p0Var), 1, null);
    }

    public static final void m(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.N8);
        if (job != null) {
            z.n(job);
        }
    }

    public static final void n(Job job) {
        if (!job.isActive()) {
            throw job.W();
        }
    }

    public static final Job o(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.N8);
        if (job != null) {
            return job;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static final p0 p(Job job, boolean z10, b1 b1Var) {
        return job instanceof b0 ? ((b0) job).s0(z10, b1Var) : job.U(b1Var.u(), z10, new a(b1Var));
    }

    public static /* synthetic */ p0 q(Job job, boolean z10, b1 b1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return z.p(job, z10, b1Var);
    }

    public static final boolean r(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.N8);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }
}
