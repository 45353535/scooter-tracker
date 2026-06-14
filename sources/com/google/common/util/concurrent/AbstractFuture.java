package com.google.common.util.concurrent;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.gms.internal.ads.y0;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.ReflectionSupport;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
@ReflectionSupport(ReflectionSupport.Level.FULL)
public abstract class AbstractFuture<V> extends InternalFutureFailureAccess implements ListenableFuture<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final boolean f31237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final LazyLogger f31238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicHelper f31239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f31240h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f31241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Listener f31242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Waiter f31243d;

    private static abstract class AtomicHelper {
        private AtomicHelper() {
        }

        abstract boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2);

        abstract boolean b(AbstractFuture abstractFuture, Object obj, Object obj2);

        abstract boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2);

        abstract Listener d(AbstractFuture abstractFuture, Listener listener);

        abstract Waiter e(AbstractFuture abstractFuture, Waiter waiter);

        abstract void f(Waiter waiter, Waiter waiter2);

        abstract void g(Waiter waiter, Thread thread);
    }

    private static final class Cancellation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final Cancellation f31244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final Cancellation f31245d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f31246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f31247b;

        static {
            if (AbstractFuture.f31237e) {
                f31245d = null;
                f31244c = null;
            } else {
                f31245d = new Cancellation(false, null);
                f31244c = new Cancellation(true, null);
            }
        }

        Cancellation(boolean z10, Throwable th2) {
            this.f31246a = z10;
            this.f31247b = th2;
        }
    }

    private static final class Failure {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Failure f31248b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.common.util.concurrent.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f31249a;

        Failure(Throwable th2) {
            this.f31249a = (Throwable) Preconditions.checkNotNull(th2);
        }
    }

    private static final class SafeAtomicHelper extends AtomicHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f31254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f31255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f31256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f31257d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f31258e;

        SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f31254a = atomicReferenceFieldUpdater;
            this.f31255b = atomicReferenceFieldUpdater2;
            this.f31256c = atomicReferenceFieldUpdater3;
            this.f31257d = atomicReferenceFieldUpdater4;
            this.f31258e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            return androidx.concurrent.futures.a.a(this.f31257d, abstractFuture, listener, listener2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return androidx.concurrent.futures.a.a(this.f31258e, abstractFuture, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            return androidx.concurrent.futures.a.a(this.f31256c, abstractFuture, waiter, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        Listener d(AbstractFuture abstractFuture, Listener listener) {
            return (Listener) this.f31257d.getAndSet(abstractFuture, listener);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        Waiter e(AbstractFuture abstractFuture, Waiter waiter) {
            return (Waiter) this.f31256c.getAndSet(abstractFuture, waiter);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void f(Waiter waiter, Waiter waiter2) {
            this.f31255b.lazySet(waiter, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void g(Waiter waiter, Thread thread) {
            this.f31254a.lazySet(waiter, thread);
        }
    }

    private static final class SetFuture<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AbstractFuture f31259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ListenableFuture f31260c;

        SetFuture(AbstractFuture abstractFuture, ListenableFuture listenableFuture) {
            this.f31259b = abstractFuture;
            this.f31260c = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f31259b.f31241b != this) {
                return;
            }
            if (AbstractFuture.f31239g.b(this.f31259b, this, AbstractFuture.v(this.f31260c))) {
                AbstractFuture.s(this.f31259b, false);
            }
        }
    }

    private static final class SynchronizedHelper extends AtomicHelper {
        private SynchronizedHelper() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f31242c != listener) {
                        return false;
                    }
                    abstractFuture.f31242c = listener2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f31241b != obj) {
                        return false;
                    }
                    abstractFuture.f31241b = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f31243d != waiter) {
                        return false;
                    }
                    abstractFuture.f31243d = waiter2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        Listener d(AbstractFuture abstractFuture, Listener listener) {
            Listener listener2;
            synchronized (abstractFuture) {
                try {
                    listener2 = abstractFuture.f31242c;
                    if (listener2 != listener) {
                        abstractFuture.f31242c = listener;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return listener2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        Waiter e(AbstractFuture abstractFuture, Waiter waiter) {
            Waiter waiter2;
            synchronized (abstractFuture) {
                try {
                    waiter2 = abstractFuture.f31243d;
                    if (waiter2 != waiter) {
                        abstractFuture.f31243d = waiter;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return waiter2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void f(Waiter waiter, Waiter waiter2) {
            waiter.f31269b = waiter2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void g(Waiter waiter, Thread thread) {
            waiter.f31268a = thread;
        }
    }

    interface Trusted<V> extends ListenableFuture<V> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static abstract class TrustedFuture<V> extends AbstractFuture<V> implements Trusted<V> {
        TrustedFuture() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        @ParametricNullness
        public V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        @ParametricNullness
        public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j10, timeUnit);
        }
    }

    private static final class UnsafeAtomicHelper extends AtomicHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Unsafe f31261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final long f31262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final long f31263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final long f31264d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final long f31265e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f31266f;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.1
                        @Override // java.security.PrivilegedExceptionAction
                        public Unsafe run() throws Exception {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
                try {
                    f31263c = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("d"));
                    f31262b = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM));
                    f31264d = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("b"));
                    f31265e = unsafe.objectFieldOffset(Waiter.class.getDeclaredField("a"));
                    f31266f = unsafe.objectFieldOffset(Waiter.class.getDeclaredField("b"));
                    f31261a = unsafe;
                } catch (NoSuchFieldException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (PrivilegedActionException e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
            }
        }

        private UnsafeAtomicHelper() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            return y0.a(f31261a, abstractFuture, f31262b, listener, listener2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return y0.a(f31261a, abstractFuture, f31264d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            return y0.a(f31261a, abstractFuture, f31263c, waiter, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        Listener d(AbstractFuture abstractFuture, Listener listener) {
            Listener listener2;
            do {
                listener2 = abstractFuture.f31242c;
                if (listener == listener2) {
                    break;
                }
            } while (!a(abstractFuture, listener2, listener));
            return listener2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        Waiter e(AbstractFuture abstractFuture, Waiter waiter) {
            Waiter waiter2;
            do {
                waiter2 = abstractFuture.f31243d;
                if (waiter == waiter2) {
                    break;
                }
            } while (!c(abstractFuture, waiter2, waiter));
            return waiter2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void f(Waiter waiter, Waiter waiter2) {
            f31261a.putObject(waiter, f31266f, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void g(Waiter waiter, Thread thread) {
            f31261a.putObject(waiter, f31265e, thread);
        }
    }

    private static final class Waiter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final Waiter f31267c = new Waiter(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f31268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile Waiter f31269b;

        Waiter(boolean z10) {
        }

        void a(Waiter waiter) {
            AbstractFuture.f31239g.f(this, waiter);
        }

        void b() {
            Thread thread = this.f31268a;
            if (thread != null) {
                this.f31268a = null;
                LockSupport.unpark(thread);
            }
        }

        Waiter() {
            AbstractFuture.f31239g.g(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Error] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.common.util.concurrent.AbstractFuture$1] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v3 */
    static {
        boolean z10;
        Throwable th2;
        AtomicHelper safeAtomicHelper;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f31237e = z10;
        f31238f = new LazyLogger(AbstractFuture.class);
        ?? r42 = 0;
        r42 = 0;
        try {
            safeAtomicHelper = new UnsafeAtomicHelper();
            th2 = null;
        } catch (Error | Exception e10) {
            th2 = e10;
            try {
                safeAtomicHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Waiter.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Listener.class, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "b"));
            } catch (Error | Exception e11) {
                SynchronizedHelper synchronizedHelper = new SynchronizedHelper();
                r42 = e11;
                safeAtomicHelper = synchronizedHelper;
            }
        }
        f31239g = safeAtomicHelper;
        if (r42 != 0) {
            LazyLogger lazyLogger = f31238f;
            Logger loggerA = lazyLogger.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th2);
            lazyLogger.a().log(level, "SafeAtomicHelper is broken!", r42);
        }
        f31240h = new Object();
    }

    protected AbstractFuture() {
    }

    private void A() {
        for (Waiter waiterE = f31239g.e(this, Waiter.f31267c); waiterE != null; waiterE = waiterE.f31269b) {
            waiterE.b();
        }
    }

    private void B(Waiter waiter) {
        waiter.f31268a = null;
        while (true) {
            Waiter waiter2 = this.f31243d;
            if (waiter2 == Waiter.f31267c) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.f31269b;
                if (waiter2.f31268a != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.f31269b = waiter4;
                    if (waiter3.f31268a == null) {
                        break;
                    }
                } else if (!f31239g.c(this, waiter2, waiter4)) {
                    break;
                }
                waiter2 = waiter4;
            }
            return;
        }
    }

    private void l(StringBuilder sb2) {
        try {
            Object objW = w(this);
            sb2.append("SUCCESS, result=[");
            o(sb2, objW);
            sb2.append(C4240b4.j.f42674e);
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append(C4240b4.j.f42674e);
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private void m(StringBuilder sb2) {
        String strEmptyToNull;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.f31241b;
        if (obj instanceof SetFuture) {
            sb2.append(", setFuture=[");
            p(sb2, ((SetFuture) obj).f31260c);
            sb2.append(C4240b4.j.f42674e);
        } else {
            try {
                strEmptyToNull = Strings.emptyToNull(z());
            } catch (Exception | StackOverflowError e10) {
                strEmptyToNull = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strEmptyToNull != null) {
                sb2.append(", info=[");
                sb2.append(strEmptyToNull);
                sb2.append(C4240b4.j.f42674e);
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            l(sb2);
        }
    }

    private void o(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void p(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (Exception e10) {
            e = e10;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        } catch (StackOverflowError e11) {
            e = e11;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        }
    }

    private static CancellationException q(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    private Listener r(Listener listener) {
        Listener listener2 = listener;
        Listener listenerD = f31239g.d(this, Listener.f31250d);
        while (listenerD != null) {
            Listener listener3 = listenerD.f31253c;
            listenerD.f31253c = listener2;
            listener2 = listenerD;
            listenerD = listener3;
        }
        return listener2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s(AbstractFuture abstractFuture, boolean z10) {
        Listener listener = null;
        while (true) {
            abstractFuture.A();
            if (z10) {
                abstractFuture.x();
                z10 = false;
            }
            abstractFuture.n();
            Listener listenerR = abstractFuture.r(listener);
            while (listenerR != null) {
                listener = listenerR.f31253c;
                Runnable runnable = listenerR.f31251a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof SetFuture) {
                    SetFuture setFuture = (SetFuture) runnable2;
                    abstractFuture = setFuture.f31259b;
                    if (abstractFuture.f31241b == setFuture) {
                        if (f31239g.b(abstractFuture, setFuture, v(setFuture.f31260c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = listenerR.f31252b;
                    Objects.requireNonNull(executor);
                    t(runnable2, executor);
                }
                listenerR = listener;
            }
            return;
        }
    }

    private static void t(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f31238f.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object u(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            throw q("Task was cancelled.", ((Cancellation) obj).f31247b);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f31249a);
        }
        return obj == f31240h ? NullnessCasts.b() : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object v(ListenableFuture listenableFuture) {
        Throwable thTryInternalFastPathGetFailure;
        if (listenableFuture instanceof Trusted) {
            Object cancellation = ((AbstractFuture) listenableFuture).f31241b;
            if (cancellation instanceof Cancellation) {
                Cancellation cancellation2 = (Cancellation) cancellation;
                if (cancellation2.f31246a) {
                    cancellation = cancellation2.f31247b != null ? new Cancellation(false, cancellation2.f31247b) : Cancellation.f31245d;
                }
            }
            Objects.requireNonNull(cancellation);
            return cancellation;
        }
        if ((listenableFuture instanceof InternalFutureFailureAccess) && (thTryInternalFastPathGetFailure = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess) listenableFuture)) != null) {
            return new Failure(thTryInternalFastPathGetFailure);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!f31237e) && zIsCancelled) {
            Cancellation cancellation3 = Cancellation.f31245d;
            Objects.requireNonNull(cancellation3);
            return cancellation3;
        }
        try {
            Object objW = w(listenableFuture);
            if (!zIsCancelled) {
                return objW == null ? f31240h : objW;
            }
            return new Cancellation(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture));
        } catch (Error | Exception e10) {
            return new Failure(e10);
        } catch (CancellationException e11) {
            if (zIsCancelled) {
                return new Cancellation(false, e11);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e11));
        } catch (ExecutionException e12) {
            if (!zIsCancelled) {
                return new Failure(e12.getCause());
            }
            return new Cancellation(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e12));
        }
    }

    private static Object w(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    protected final boolean C() {
        Object obj = this.f31241b;
        return (obj instanceof Cancellation) && ((Cancellation) obj).f31246a;
    }

    @Override // com.google.common.util.concurrent.internal.InternalFutureFailureAccess
    protected final Throwable a() {
        if (!(this instanceof Trusted)) {
            return null;
        }
        Object obj = this.f31241b;
        if (obj instanceof Failure) {
            return ((Failure) obj).f31249a;
        }
        return null;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        Listener listener;
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        if (!isDone() && (listener = this.f31242c) != Listener.f31250d) {
            Listener listener2 = new Listener(runnable, executor);
            do {
                listener2.f31253c = listener;
                if (f31239g.a(this, listener, listener2)) {
                    return;
                } else {
                    listener = this.f31242c;
                }
            } while (listener != Listener.f31250d);
        }
        t(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public boolean cancel(boolean z10) {
        Cancellation cancellation;
        Object obj = this.f31241b;
        if (!(obj == null) && !(obj instanceof SetFuture)) {
            return false;
        }
        if (f31237e) {
            cancellation = new Cancellation(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cancellation = z10 ? Cancellation.f31244c : Cancellation.f31245d;
            Objects.requireNonNull(cancellation);
        }
        AbstractFuture<V> abstractFuture = this;
        boolean z11 = false;
        while (true) {
            if (f31239g.b(abstractFuture, obj, cancellation)) {
                s(abstractFuture, z10);
                if (!(obj instanceof SetFuture)) {
                    break;
                }
                ListenableFuture listenableFuture = ((SetFuture) obj).f31260c;
                if (!(listenableFuture instanceof Trusted)) {
                    listenableFuture.cancel(z10);
                    break;
                }
                abstractFuture = (AbstractFuture) listenableFuture;
                obj = abstractFuture.f31241b;
                if (!(obj == null) && !(obj instanceof SetFuture)) {
                    break;
                }
                z11 = true;
            } else {
                obj = abstractFuture.f31241b;
                if (!(obj instanceof SetFuture)) {
                    return z11;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    @ParametricNullness
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f31241b;
        if ((obj != null) && (!(obj instanceof SetFuture))) {
            return (V) u(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            Waiter waiter = this.f31243d;
            if (waiter != Waiter.f31267c) {
                Waiter waiter2 = new Waiter();
                do {
                    waiter2.a(waiter);
                    if (f31239g.c(this, waiter, waiter2)) {
                        do {
                            OverflowAvoidingLockSupport.a(this, nanos);
                            if (Thread.interrupted()) {
                                B(waiter2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f31241b;
                            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                return (V) u(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        B(waiter2);
                    } else {
                        waiter = this.f31243d;
                    }
                } while (waiter != Waiter.f31267c);
            }
            Object obj3 = this.f31241b;
            Objects.requireNonNull(obj3);
            return (V) u(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f31241b;
            if ((obj4 != null) && (!(obj4 instanceof SetFuture))) {
                return (V) u(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + StringUtils.COMMA;
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f31241b instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof SetFuture)) & (this.f31241b != null);
    }

    protected void n() {
    }

    protected boolean set(Object obj) {
        if (obj == null) {
            obj = f31240h;
        }
        if (!f31239g.b(this, null, obj)) {
            return false;
        }
        s(this, false);
        return true;
    }

    protected boolean setException(Throwable th2) {
        if (!f31239g.b(this, null, new Failure((Throwable) Preconditions.checkNotNull(th2)))) {
            return false;
        }
        s(this, false);
        return true;
    }

    protected boolean setFuture(ListenableFuture listenableFuture) {
        Failure failure;
        Preconditions.checkNotNull(listenableFuture);
        Object obj = this.f31241b;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f31239g.b(this, null, v(listenableFuture))) {
                    return false;
                }
                s(this, false);
                return true;
            }
            SetFuture setFuture = new SetFuture(this, listenableFuture);
            if (f31239g.b(this, null, setFuture)) {
                try {
                    listenableFuture.addListener(setFuture, DirectExecutor.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        failure = new Failure(th2);
                    } catch (Error | Exception unused) {
                        failure = Failure.f31248b;
                    }
                    f31239g.b(this, setFuture, failure);
                }
                return true;
            }
            obj = this.f31241b;
        }
        if (obj instanceof Cancellation) {
            listenableFuture.cancel(((Cancellation) obj).f31246a);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            l(sb2);
        } else {
            m(sb2);
        }
        sb2.append(C4240b4.j.f42674e);
        return sb2.toString();
    }

    protected void x() {
    }

    final void y(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(C());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String z() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    private static final class Listener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final Listener f31250d = new Listener();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f31251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f31252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Listener f31253c;

        Listener(Runnable runnable, Executor executor) {
            this.f31251a = runnable;
            this.f31252b = executor;
        }

        Listener() {
            this.f31251a = null;
            this.f31252b = null;
        }
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    @ParametricNullness
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f31241b;
            if ((obj2 != null) & (!(obj2 instanceof SetFuture))) {
                return (V) u(obj2);
            }
            Waiter waiter = this.f31243d;
            if (waiter != Waiter.f31267c) {
                Waiter waiter2 = new Waiter();
                do {
                    waiter2.a(waiter);
                    if (f31239g.c(this, waiter, waiter2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f31241b;
                            } else {
                                B(waiter2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return (V) u(obj);
                    }
                    waiter = this.f31243d;
                } while (waiter != Waiter.f31267c);
            }
            Object obj3 = this.f31241b;
            Objects.requireNonNull(obj3);
            return (V) u(obj3);
        }
        throw new InterruptedException();
    }
}
