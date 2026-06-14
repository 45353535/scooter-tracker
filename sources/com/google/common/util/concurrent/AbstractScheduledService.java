package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractScheduledService;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C4240b4;
import j$.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class AbstractScheduledService implements Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final LazyLogger f31274b = new LazyLogger(AbstractScheduledService.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractService f31275a;

    interface Cancellable {
        void cancel(boolean z10);

        boolean isCancelled();
    }

    public static abstract class CustomScheduler extends Scheduler {

        private final class ReschedulableCallable implements Callable<Void> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Runnable f31279b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final ScheduledExecutorService f31280c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final AbstractService f31281d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final ReentrantLock f31282e = new ReentrantLock();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private SupplantableFuture f31283f;

            ReschedulableCallable(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                this.f31279b = runnable;
                this.f31280c = scheduledExecutorService;
                this.f31281d = abstractService;
            }

            private Cancellable a(Schedule schedule) {
                SupplantableFuture supplantableFuture = this.f31283f;
                if (supplantableFuture == null) {
                    SupplantableFuture supplantableFuture2 = new SupplantableFuture(this.f31282e, b(schedule));
                    this.f31283f = supplantableFuture2;
                    return supplantableFuture2;
                }
                if (!supplantableFuture.f31288b.isCancelled()) {
                    this.f31283f.f31288b = b(schedule);
                }
                return this.f31283f;
            }

            private ScheduledFuture b(Schedule schedule) {
                return this.f31280c.schedule(this, schedule.f31285a, schedule.f31286b);
            }

            @CanIgnoreReturnValue
            public Cancellable reschedule() throws Exception {
                Cancellable futureAsCancellable;
                try {
                    Schedule scheduleA = CustomScheduler.this.a();
                    this.f31282e.lock();
                    try {
                        futureAsCancellable = a(scheduleA);
                        this.f31282e.unlock();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            futureAsCancellable = new FutureAsCancellable(Futures.immediateCancelledFuture());
                        } finally {
                            this.f31282e.unlock();
                        }
                    }
                    if (th != null) {
                        this.f31281d.l(th);
                    }
                    return futureAsCancellable;
                } catch (Throwable th3) {
                    Platform.b(th3);
                    this.f31281d.l(th3);
                    return new FutureAsCancellable(Futures.immediateCancelledFuture());
                }
            }

            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                this.f31279b.run();
                reschedule();
                return null;
            }
        }

        protected static final class Schedule {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f31285a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final TimeUnit f31286b;

            public Schedule(long j10, TimeUnit timeUnit) {
                this.f31285a = j10;
                this.f31286b = (TimeUnit) Preconditions.checkNotNull(timeUnit);
            }
        }

        private static final class SupplantableFuture implements Cancellable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ReentrantLock f31287a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Future f31288b;

            SupplantableFuture(ReentrantLock reentrantLock, Future future) {
                this.f31287a = reentrantLock;
                this.f31288b = future;
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
            public void cancel(boolean z10) {
                this.f31287a.lock();
                try {
                    this.f31288b.cancel(z10);
                } finally {
                    this.f31287a.unlock();
                }
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
            public boolean isCancelled() {
                this.f31287a.lock();
                try {
                    return this.f31288b.isCancelled();
                } finally {
                    this.f31287a.unlock();
                }
            }
        }

        public CustomScheduler() {
            super();
        }

        protected abstract Schedule a();

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
        final Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            return new ReschedulableCallable(abstractService, scheduledExecutorService, runnable).reschedule();
        }
    }

    private static final class FutureAsCancellable implements Cancellable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Future f31289a;

        FutureAsCancellable(Future future) {
            this.f31289a = future;
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
        public void cancel(boolean z10) {
            this.f31289a.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
        public boolean isCancelled() {
            return this.f31289a.isCancelled();
        }
    }

    public static abstract class Scheduler {
        public static Scheduler newFixedDelaySchedule(final long j10, final long j11, final TimeUnit timeUnit) {
            Preconditions.checkNotNull(timeUnit);
            Preconditions.checkArgument(j11 > 0, "delay must be > 0, found %s", j11);
            return new Scheduler() { // from class: com.google.common.util.concurrent.AbstractScheduledService.Scheduler.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
                public Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                    return new FutureAsCancellable(scheduledExecutorService.scheduleWithFixedDelay(runnable, j10, j11, timeUnit));
                }
            };
        }

        public static Scheduler newFixedRateSchedule(final long j10, final long j11, final TimeUnit timeUnit) {
            Preconditions.checkNotNull(timeUnit);
            Preconditions.checkArgument(j11 > 0, "period must be > 0, found %s", j11);
            return new Scheduler() { // from class: com.google.common.util.concurrent.AbstractScheduledService.Scheduler.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
                public Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                    return new FutureAsCancellable(scheduledExecutorService.scheduleAtFixedRate(runnable, j10, j11, timeUnit));
                }
            };
        }

        abstract Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable);

        private Scheduler() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class ServiceDelegate extends AbstractService {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private volatile Cancellable f31296p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private volatile ScheduledExecutorService f31297q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final ReentrantLock f31298r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final Runnable f31299s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ AbstractScheduledService f31300t;

        class Task implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ServiceDelegate f31301b;

            @Override // java.lang.Runnable
            public void run() {
                this.f31301b.f31298r.lock();
                try {
                    Cancellable cancellable = this.f31301b.f31296p;
                    Objects.requireNonNull(cancellable);
                    if (!cancellable.isCancelled()) {
                        this.f31301b.f31300t.d();
                    }
                } catch (Throwable th2) {
                    try {
                        Platform.b(th2);
                        try {
                            this.f31301b.f31300t.g();
                        } catch (Exception e10) {
                            Platform.b(e10);
                            AbstractScheduledService.f31274b.a().log(Level.WARNING, "Error while attempting to shut down the service after failure.", (Throwable) e10);
                        }
                        this.f31301b.l(th2);
                        Cancellable cancellable2 = this.f31301b.f31296p;
                        Objects.requireNonNull(cancellable2);
                        cancellable2.cancel(false);
                    } finally {
                        this.f31301b.f31298r.unlock();
                    }
                }
            }
        }

        public static /* synthetic */ String q(ServiceDelegate serviceDelegate) {
            return serviceDelegate.f31300t.f() + " " + serviceDelegate.state();
        }

        public static /* synthetic */ void r(ServiceDelegate serviceDelegate) {
            serviceDelegate.f31298r.lock();
            try {
                serviceDelegate.f31300t.h();
                Objects.requireNonNull(serviceDelegate.f31297q);
                serviceDelegate.f31296p = serviceDelegate.f31300t.e().schedule(serviceDelegate.f31300t.f31275a, serviceDelegate.f31297q, serviceDelegate.f31299s);
                serviceDelegate.m();
            } catch (Throwable th2) {
                try {
                    Platform.b(th2);
                    serviceDelegate.l(th2);
                    if (serviceDelegate.f31296p != null) {
                        serviceDelegate.f31296p.cancel(false);
                    }
                } finally {
                    serviceDelegate.f31298r.unlock();
                }
            }
        }

        public static /* synthetic */ void s(ServiceDelegate serviceDelegate) throws Exception {
            serviceDelegate.getClass();
            try {
                serviceDelegate.f31298r.lock();
                try {
                    if (serviceDelegate.state() != Service.State.STOPPING) {
                        return;
                    }
                    serviceDelegate.f31300t.g();
                    serviceDelegate.f31298r.unlock();
                    serviceDelegate.n();
                } finally {
                    serviceDelegate.f31298r.unlock();
                }
            } catch (Throwable th2) {
                Platform.b(th2);
                serviceDelegate.l(th2);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void e() {
            this.f31297q = MoreExecutors.f(this.f31300t.c(), new Supplier() { // from class: com.google.common.util.concurrent.g
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return AbstractScheduledService.ServiceDelegate.q(this.f31643b);
                }
            });
            this.f31297q.execute(new Runnable() { // from class: com.google.common.util.concurrent.h
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractScheduledService.ServiceDelegate.r(this.f31644b);
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void f() {
            Objects.requireNonNull(this.f31296p);
            Objects.requireNonNull(this.f31297q);
            this.f31296p.cancel(false);
            this.f31297q.execute(new Runnable() { // from class: com.google.common.util.concurrent.i
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    AbstractScheduledService.ServiceDelegate.s(this.f31645b);
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return this.f31300t.toString();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.f31275a.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.f31275a.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.f31275a.awaitTerminated();
    }

    protected ScheduledExecutorService c() {
        final ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.google.common.util.concurrent.AbstractScheduledService.1ThreadFactoryImpl
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return MoreExecutors.c(AbstractScheduledService.this.f(), runnable);
            }
        });
        addListener(new Service.Listener(this) { // from class: com.google.common.util.concurrent.AbstractScheduledService.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractScheduledService f31277b;

            {
                this.f31277b = this;
            }

            @Override // com.google.common.util.concurrent.Service.Listener
            public void failed(Service.State state, Throwable th2) {
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.shutdown();
            }

            @Override // com.google.common.util.concurrent.Service.Listener
            public void terminated(Service.State state) {
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.shutdown();
            }
        }, MoreExecutors.directExecutor());
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    protected abstract void d();

    protected abstract Scheduler e();

    protected String f() {
        return getClass().getSimpleName();
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.f31275a.failureCause();
    }

    protected void g() {
    }

    protected void h() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.f31275a.isRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() throws Exception {
        this.f31275a.startAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.f31275a.state();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() throws Exception {
        this.f31275a.stopAsync();
        return this;
    }

    public String toString() {
        return f() + " [" + state() + C4240b4.j.f42674e;
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j10, TimeUnit timeUnit) throws TimeoutException {
        this.f31275a.awaitRunning(j10, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j10, TimeUnit timeUnit) throws TimeoutException {
        this.f31275a.awaitTerminated(j10, timeUnit);
    }
}
