package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.SimpleTimeLimiter;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class SimpleTimeLimiter implements TimeLimiter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f31579a;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.SimpleTimeLimiter$1, reason: invalid class name */
    class AnonymousClass1 implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f31580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f31581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TimeUnit f31582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set f31583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SimpleTimeLimiter f31584e;

        AnonymousClass1(SimpleTimeLimiter simpleTimeLimiter, Object obj, long j10, TimeUnit timeUnit, Set set) {
            this.f31580a = obj;
            this.f31581b = j10;
            this.f31582c = timeUnit;
            this.f31583d = set;
            this.f31584e = simpleTimeLimiter;
        }

        public static /* synthetic */ Object a(Method method, Object obj, Object[] objArr) throws Exception {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e10) {
                throw SimpleTimeLimiter.h(e10, false);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, final Method method, final Object[] objArr) throws Throwable {
            final Object obj2 = this.f31580a;
            return this.f31584e.c(new Callable() { // from class: com.google.common.util.concurrent.a0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimpleTimeLimiter.AnonymousClass1.a(method, obj2, objArr);
                }
            }, this.f31581b, this.f31582c, this.f31583d.contains(method));
        }
    }

    private SimpleTimeLimiter(ExecutorService executorService) {
        this.f31579a = (ExecutorService) Preconditions.checkNotNull(executorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object c(Callable callable, long j10, TimeUnit timeUnit, boolean z10) throws Exception {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        d(j10);
        Future futureSubmit = this.f31579a.submit(callable);
        try {
            return z10 ? futureSubmit.get(j10, timeUnit) : Uninterruptibles.getUninterruptibly(futureSubmit, j10, timeUnit);
        } catch (InterruptedException e10) {
            futureSubmit.cancel(true);
            throw e10;
        } catch (ExecutionException e11) {
            throw h(e11, true);
        } catch (TimeoutException e12) {
            futureSubmit.cancel(true);
            throw new UncheckedTimeoutException(e12);
        }
    }

    public static SimpleTimeLimiter create(ExecutorService executorService) {
        return new SimpleTimeLimiter(executorService);
    }

    private static void d(long j10) {
        Preconditions.checkArgument(j10 > 0, "timeout must be positive: %s", j10);
    }

    private static boolean e(Method method) {
        for (Class<?> cls : method.getExceptionTypes()) {
            if (cls == InterruptedException.class) {
                return true;
            }
        }
        return false;
    }

    private static Set f(Class cls) {
        HashSet hashSetNewHashSet = Sets.newHashSet();
        for (Method method : cls.getMethods()) {
            if (e(method)) {
                hashSetNewHashSet.add(method);
            }
        }
        return hashSetNewHashSet;
    }

    private static Object g(Class cls, InvocationHandler invocationHandler) {
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Exception h(Exception exc, boolean z10) throws Exception {
        Throwable cause = exc.getCause();
        if (cause == null) {
            throw exc;
        }
        if (z10) {
            cause.setStackTrace((StackTraceElement[]) ObjectArrays.concat(cause.getStackTrace(), exc.getStackTrace(), StackTraceElement.class));
        }
        if (cause instanceof Exception) {
            throw ((Exception) cause);
        }
        if (cause instanceof Error) {
            throw ((Error) cause);
        }
        throw exc;
    }

    private void i(Throwable th2) throws ExecutionException {
        if (th2 instanceof Error) {
            throw new ExecutionError((Error) th2);
        }
        if (!(th2 instanceof RuntimeException)) {
            throw new ExecutionException(th2);
        }
        throw new UncheckedExecutionException(th2);
    }

    private void j(Throwable th2) {
        if (!(th2 instanceof Error)) {
            throw new UncheckedExecutionException(th2);
        }
        throw new ExecutionError((Error) th2);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    @ParametricNullness
    public <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j10, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        d(j10);
        Future<T> futureSubmit = this.f31579a.submit(callable);
        try {
            return (T) Uninterruptibles.getUninterruptibly(futureSubmit, j10, timeUnit);
        } catch (ExecutionException e10) {
            i(e10.getCause());
            throw new AssertionError();
        } catch (TimeoutException e11) {
            futureSubmit.cancel(true);
            throw e11;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    @ParametricNullness
    public <T> T callWithTimeout(Callable<T> callable, long j10, TimeUnit timeUnit) throws Throwable {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        d(j10);
        Future<T> futureSubmit = this.f31579a.submit(callable);
        try {
            return futureSubmit.get(j10, timeUnit);
        } catch (InterruptedException e10) {
            e = e10;
            futureSubmit.cancel(true);
            throw e;
        } catch (ExecutionException e11) {
            i(e11.getCause());
            throw new AssertionError();
        } catch (TimeoutException e12) {
            e = e12;
            futureSubmit.cancel(true);
            throw e;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T newProxy(T t10, Class<T> cls, long j10, TimeUnit timeUnit) {
        Preconditions.checkNotNull(t10);
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(timeUnit);
        d(j10);
        Preconditions.checkArgument(cls.isInterface(), "interfaceType must be an interface type");
        return (T) g(cls, new AnonymousClass1(this, t10, j10, timeUnit, f(cls)));
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runUninterruptiblyWithTimeout(Runnable runnable, long j10, TimeUnit timeUnit) throws TimeoutException {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeUnit);
        d(j10);
        Future<?> futureSubmit = this.f31579a.submit(runnable);
        try {
            Uninterruptibles.getUninterruptibly(futureSubmit, j10, timeUnit);
        } catch (ExecutionException e10) {
            j(e10.getCause());
            throw new AssertionError();
        } catch (TimeoutException e11) {
            futureSubmit.cancel(true);
            throw e11;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runWithTimeout(Runnable runnable, long j10, TimeUnit timeUnit) throws Throwable {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeUnit);
        d(j10);
        Future<?> futureSubmit = this.f31579a.submit(runnable);
        try {
            futureSubmit.get(j10, timeUnit);
        } catch (InterruptedException e10) {
            e = e10;
            futureSubmit.cancel(true);
            throw e;
        } catch (ExecutionException e11) {
            j(e11.getCause());
            throw new AssertionError();
        } catch (TimeoutException e12) {
            e = e12;
            futureSubmit.cancel(true);
            throw e;
        }
    }
}
