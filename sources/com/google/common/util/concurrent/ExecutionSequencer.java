package com.google.common.util.concurrent;

import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import j$.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
public final class ExecutionSequencer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f31456a = new AtomicReference(Futures.immediateVoidFuture());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ThreadConfinedTaskQueue f31457b = new ThreadConfinedTaskQueue();

    enum RunningState {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class TaskNonReentrantExecutor extends AtomicReference<RunningState> implements Executor, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ExecutionSequencer f31464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Executor f31465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Runnable f31466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Thread f31467e;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return compareAndSet(RunningState.NOT_RUN, RunningState.CANCELLED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g() {
            return compareAndSet(RunningState.NOT_RUN, RunningState.STARTED);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (get() == RunningState.CANCELLED) {
                this.f31465c = null;
                this.f31464b = null;
                return;
            }
            this.f31467e = Thread.currentThread();
            try {
                ExecutionSequencer executionSequencer = this.f31464b;
                Objects.requireNonNull(executionSequencer);
                ThreadConfinedTaskQueue threadConfinedTaskQueue = executionSequencer.f31457b;
                if (threadConfinedTaskQueue.f31468a == this.f31467e) {
                    this.f31464b = null;
                    Preconditions.checkState(threadConfinedTaskQueue.f31469b == null);
                    threadConfinedTaskQueue.f31469b = runnable;
                    Executor executor = this.f31465c;
                    Objects.requireNonNull(executor);
                    threadConfinedTaskQueue.f31470c = executor;
                    this.f31465c = null;
                } else {
                    Executor executor2 = this.f31465c;
                    Objects.requireNonNull(executor2);
                    this.f31465c = null;
                    this.f31466d = runnable;
                    executor2.execute(this);
                }
                this.f31467e = null;
            } catch (Throwable th2) {
                this.f31467e = null;
                throw th2;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executor;
            Thread threadCurrentThread = Thread.currentThread();
            Thread thread = null;
            byte b10 = 0;
            if (threadCurrentThread != this.f31467e) {
                Runnable runnable = this.f31466d;
                Objects.requireNonNull(runnable);
                this.f31466d = null;
                runnable.run();
                return;
            }
            ThreadConfinedTaskQueue threadConfinedTaskQueue = new ThreadConfinedTaskQueue();
            threadConfinedTaskQueue.f31468a = threadCurrentThread;
            ExecutionSequencer executionSequencer = this.f31464b;
            Objects.requireNonNull(executionSequencer);
            executionSequencer.f31457b = threadConfinedTaskQueue;
            this.f31464b = null;
            try {
                Runnable runnable2 = this.f31466d;
                Objects.requireNonNull(runnable2);
                this.f31466d = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = threadConfinedTaskQueue.f31469b;
                    if (runnable3 == null || (executor = threadConfinedTaskQueue.f31470c) == null) {
                        break;
                    }
                    threadConfinedTaskQueue.f31469b = null;
                    threadConfinedTaskQueue.f31470c = null;
                    executor.execute(runnable3);
                }
            } finally {
                threadConfinedTaskQueue.f31468a = null;
            }
        }

        private TaskNonReentrantExecutor(Executor executor, ExecutionSequencer executionSequencer) {
            super(RunningState.NOT_RUN);
            this.f31465c = executor;
            this.f31464b = executionSequencer;
        }
    }

    private static final class ThreadConfinedTaskQueue {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Thread f31468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Runnable f31469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Executor f31470c;

        private ThreadConfinedTaskQueue() {
        }
    }

    private ExecutionSequencer() {
    }

    public static /* synthetic */ void a(TrustedListenableFutureTask trustedListenableFutureTask, SettableFuture settableFuture, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, TaskNonReentrantExecutor taskNonReentrantExecutor) {
        if (trustedListenableFutureTask.isDone()) {
            settableFuture.setFuture(listenableFuture);
        } else if (listenableFuture2.isCancelled() && taskNonReentrantExecutor.d()) {
            trustedListenableFutureTask.cancel(false);
        }
    }

    public static ExecutionSequencer create() {
        return new ExecutionSequencer();
    }

    public <T> ListenableFuture<T> submit(final Callable<T> callable, Executor executor) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(executor);
        return submitAsync(new AsyncCallable<T>(this) { // from class: com.google.common.util.concurrent.ExecutionSequencer.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ExecutionSequencer f31459b;

            {
                this.f31459b = this;
            }

            @Override // com.google.common.util.concurrent.AsyncCallable
            public ListenableFuture<T> call() throws Exception {
                return Futures.immediateFuture(callable.call());
            }

            public String toString() {
                return callable.toString();
            }
        }, executor);
    }

    public <T> ListenableFuture<T> submitAsync(final AsyncCallable<T> asyncCallable, Executor executor) {
        Preconditions.checkNotNull(asyncCallable);
        Preconditions.checkNotNull(executor);
        final TaskNonReentrantExecutor taskNonReentrantExecutor = new TaskNonReentrantExecutor(executor, this);
        AsyncCallable<T> asyncCallable2 = new AsyncCallable<T>(this) { // from class: com.google.common.util.concurrent.ExecutionSequencer.2

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ExecutionSequencer f31462c;

            {
                this.f31462c = this;
            }

            @Override // com.google.common.util.concurrent.AsyncCallable
            public ListenableFuture<T> call() throws Exception {
                return !taskNonReentrantExecutor.g() ? Futures.immediateCancelledFuture() : asyncCallable.call();
            }

            public String toString() {
                return asyncCallable.toString();
            }
        };
        final SettableFuture settableFutureCreate = SettableFuture.create();
        final ListenableFuture listenableFuture = (ListenableFuture) this.f31456a.getAndSet(settableFutureCreate);
        final TrustedListenableFutureTask trustedListenableFutureTaskD = TrustedListenableFutureTask.D(asyncCallable2);
        listenableFuture.addListener(trustedListenableFutureTaskD, taskNonReentrantExecutor);
        final ListenableFuture<T> listenableFutureNonCancellationPropagating = Futures.nonCancellationPropagating(trustedListenableFutureTaskD);
        Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.r
            @Override // java.lang.Runnable
            public final void run() {
                ExecutionSequencer.a(trustedListenableFutureTaskD, settableFutureCreate, listenableFuture, listenableFutureNonCancellationPropagating, taskNonReentrantExecutor);
            }
        };
        listenableFutureNonCancellationPropagating.addListener(runnable, MoreExecutors.directExecutor());
        trustedListenableFutureTaskD.addListener(runnable, MoreExecutors.directExecutor());
        return listenableFutureNonCancellationPropagating;
    }
}
