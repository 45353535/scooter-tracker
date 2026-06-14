package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Throwables;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ForwardingListenableFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C4240b4;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class MoreExecutors {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BlockingQueue f31525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ListenableFuture f31526c;

        @Override // java.lang.Runnable
        public void run() {
            this.f31525b.add(this.f31526c);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$3, reason: invalid class name */
    class AnonymousClass3 extends WrappingExecutorService {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Supplier f31529c;

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        protected Runnable b(Runnable runnable) {
            return Callables.e(runnable, this.f31529c);
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        protected Callable c(Callable callable) {
            return Callables.f(callable, this.f31529c);
        }
    }

    @GwtIncompatible
    @VisibleForTesting
    @J2ktIncompatible
    static class Application {
        Application() {
        }

        final void a(final ExecutorService executorService, final long j10, final TimeUnit timeUnit) {
            Preconditions.checkNotNull(executorService);
            Preconditions.checkNotNull(timeUnit);
            b(MoreExecutors.c("DelayedShutdownHook-for-" + executorService, new Runnable(this) { // from class: com.google.common.util.concurrent.MoreExecutors.Application.1

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ Application f31536e;

                {
                    this.f31536e = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        executorService.shutdown();
                        executorService.awaitTermination(j10, timeUnit);
                    } catch (InterruptedException unused) {
                    }
                }
            }));
        }

        void b(Thread thread) {
            Runtime.getRuntime().addShutdownHook(thread);
        }

        final ExecutorService c(ThreadPoolExecutor threadPoolExecutor) {
            return d(threadPoolExecutor, 120L, TimeUnit.SECONDS);
        }

        final ExecutorService d(ThreadPoolExecutor threadPoolExecutor, long j10, TimeUnit timeUnit) {
            MoreExecutors.g(threadPoolExecutor);
            ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
            a(threadPoolExecutor, j10, timeUnit);
            return executorServiceUnconfigurableExecutorService;
        }

        final ScheduledExecutorService e(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
            return f(scheduledThreadPoolExecutor, 120L, TimeUnit.SECONDS);
        }

        final ScheduledExecutorService f(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j10, TimeUnit timeUnit) {
            MoreExecutors.g(scheduledThreadPoolExecutor);
            ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
            a(scheduledThreadPoolExecutor, j10, timeUnit);
            return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static class ListeningDecorator extends AbstractListeningExecutorService {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ExecutorService f31537b;

        ListeningDecorator(ExecutorService executorService) {
            this.f31537b = (ExecutorService) Preconditions.checkNotNull(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f31537b.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f31537b.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f31537b.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f31537b.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f31537b.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f31537b.shutdownNow();
        }

        public final String toString() {
            return super.toString() + C4240b4.j.f42672d + this.f31537b + C4240b4.j.f42674e;
        }
    }

    @GwtIncompatible
    @J2ktIncompatible
    private static final class ScheduledListeningDecorator extends ListeningDecorator implements ListeningScheduledExecutorService {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ScheduledExecutorService f31538c;

        private static final class ListenableScheduledTask<V> extends ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements ListenableScheduledFuture<V> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final ScheduledFuture f31539c;

            public ListenableScheduledTask(ListenableFuture<V> listenableFuture, ScheduledFuture<?> scheduledFuture) {
                super(listenableFuture);
                this.f31539c = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                boolean zCancel = super.cancel(z10);
                if (zCancel) {
                    this.f31539c.cancel(z10);
                }
                return zCancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f31539c.getDelay(timeUnit);
            }

            @Override // java.lang.Comparable
            public int compareTo(Delayed delayed) {
                return this.f31539c.compareTo(delayed);
            }
        }

        @GwtIncompatible
        @J2ktIncompatible
        private static final class NeverSuccessfulListenableFutureTask extends AbstractFuture.TrustedFuture<Void> implements Runnable {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Runnable f31540i;

            public NeverSuccessfulListenableFutureTask(Runnable runnable) {
                this.f31540i = (Runnable) Preconditions.checkNotNull(runnable);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f31540i.run();
                } catch (Throwable th2) {
                    setException(th2);
                    throw th2;
                }
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            protected String z() {
                return "task=[" + this.f31540i + C4240b4.j.f42674e;
            }
        }

        ScheduledListeningDecorator(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f31538c = (ScheduledExecutorService) Preconditions.checkNotNull(scheduledExecutorService);
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.f31538c.scheduleAtFixedRate(neverSuccessfulListenableFutureTask, j10, j11, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.f31538c.scheduleWithFixedDelay(neverSuccessfulListenableFutureTask, j10, j11, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTaskE = TrustedListenableFutureTask.E(runnable, null);
            return new ListenableScheduledTask(trustedListenableFutureTaskE, this.f31538c.schedule(trustedListenableFutureTaskE, j10, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public <V> ListenableScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTaskF = TrustedListenableFutureTask.F(callable);
            return new ListenableScheduledTask(trustedListenableFutureTaskF, this.f31538c.schedule(trustedListenableFutureTaskF, j10, timeUnit));
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static void addDelayedShutdownHook(ExecutorService executorService, long j10, TimeUnit timeUnit) {
        new Application().a(executorService, j10, timeUnit);
    }

    private static boolean b() {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            Class.forName("com.google.appengine.api.utils.SystemProperty");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", null).invoke(null, null) != null;
    }

    static Thread c(String str, Runnable runnable) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(runnable);
        Thread threadNewThread = platformThreadFactory().newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        try {
            threadNewThread.setName(str);
        } catch (SecurityException unused) {
        }
        return threadNewThread;
    }

    static Executor d(final Executor executor, final AbstractFuture abstractFuture) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(abstractFuture);
        return executor == directExecutor() ? executor : new Executor() { // from class: com.google.common.util.concurrent.MoreExecutors.5
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e10) {
                    abstractFuture.setException(e10);
                }
            }
        };
    }

    public static Executor directExecutor() {
        return DirectExecutor.INSTANCE;
    }

    static Executor e(final Executor executor, final Supplier supplier) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(supplier);
        return new Executor() { // from class: com.google.common.util.concurrent.MoreExecutors.2
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                executor.execute(Callables.e(runnable, supplier));
            }
        };
    }

    static ScheduledExecutorService f(ScheduledExecutorService scheduledExecutorService, final Supplier supplier) {
        Preconditions.checkNotNull(scheduledExecutorService);
        Preconditions.checkNotNull(supplier);
        return new WrappingScheduledExecutorService(scheduledExecutorService) { // from class: com.google.common.util.concurrent.MoreExecutors.4
            @Override // com.google.common.util.concurrent.WrappingExecutorService
            protected Runnable b(Runnable runnable) {
                return Callables.e(runnable, supplier);
            }

            @Override // com.google.common.util.concurrent.WrappingExecutorService
            protected Callable c(Callable callable) {
                return Callables.f(callable, supplier);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.setThreadFactory(new ThreadFactoryBuilder().setDaemon(true).setThreadFactory(threadPoolExecutor.getThreadFactory()).build());
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor, long j10, TimeUnit timeUnit) {
        return new Application().d(threadPoolExecutor, j10, timeUnit);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j10, TimeUnit timeUnit) {
        return new Application().f(scheduledThreadPoolExecutor, j10, timeUnit);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ListeningExecutorService listeningDecorator(ExecutorService executorService) {
        return executorService instanceof ListeningExecutorService ? (ListeningExecutorService) executorService : executorService instanceof ScheduledExecutorService ? new ScheduledListeningDecorator((ScheduledExecutorService) executorService) : new ListeningDecorator(executorService);
    }

    @GwtIncompatible
    public static ListeningExecutorService newDirectExecutorService() {
        return new DirectExecutorService();
    }

    @GwtIncompatible
    public static Executor newSequentialExecutor(Executor executor) {
        return new SequentialExecutor(executor);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ThreadFactory platformThreadFactory() {
        if (!b()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", null).invoke(null, null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException e10) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e10);
        } catch (InvocationTargetException e11) {
            throw Throwables.propagate(e11.getCause());
        }
    }

    @CanIgnoreReturnValue
    @J2ktIncompatible
    @GwtIncompatible
    public static boolean shutdownAndAwaitTermination(ExecutorService executorService, long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10) / 2;
        executorService.shutdown();
        try {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (!executorService.awaitTermination(nanos, timeUnit2)) {
                executorService.shutdownNow();
                executorService.awaitTermination(nanos, timeUnit2);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            executorService.shutdownNow();
        }
        return executorService.isTerminated();
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor) {
        return new Application().c(threadPoolExecutor);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        return new Application().e(scheduledThreadPoolExecutor);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ListeningScheduledExecutorService listeningDecorator(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof ListeningScheduledExecutorService) {
            return (ListeningScheduledExecutorService) scheduledExecutorService;
        }
        return new ScheduledListeningDecorator(scheduledExecutorService);
    }
}
