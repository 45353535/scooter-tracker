package kotlinx.coroutines;

import eg.b1;
import eg.p0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z {
    public static final eg.s a(Job job) {
        return a0.a(job);
    }

    public static final void c(CoroutineContext coroutineContext, CancellationException cancellationException) {
        a0.c(coroutineContext, cancellationException);
    }

    public static final void d(Job job, String str, Throwable th2) {
        a0.d(job, str, th2);
    }

    public static final Object g(Job job, Continuation continuation) {
        return a0.g(job, continuation);
    }

    public static final void h(CoroutineContext coroutineContext, CancellationException cancellationException) {
        a0.h(coroutineContext, cancellationException);
    }

    public static final void i(Job job, CancellationException cancellationException) {
        a0.i(job, cancellationException);
    }

    public static final p0 l(Job job, p0 p0Var) {
        return a0.l(job, p0Var);
    }

    public static final void m(CoroutineContext coroutineContext) {
        a0.m(coroutineContext);
    }

    public static final void n(Job job) {
        a0.n(job);
    }

    public static final Job o(CoroutineContext coroutineContext) {
        return a0.o(coroutineContext);
    }

    public static final p0 p(Job job, boolean z10, b1 b1Var) {
        return a0.p(job, z10, b1Var);
    }

    public static final boolean r(CoroutineContext coroutineContext) {
        return a0.r(coroutineContext);
    }
}
