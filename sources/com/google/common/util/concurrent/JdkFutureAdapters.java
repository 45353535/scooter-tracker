package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.JdkFutureAdapters;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class JdkFutureAdapters {

    /* JADX INFO: Access modifiers changed from: private */
    static class ListenableFutureAdapter<V> extends ForwardingFuture<V> implements ListenableFuture<V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final ThreadFactory f31501f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Executor f31502g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f31503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ExecutionList f31504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f31505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Future f31506e;

        static {
            ThreadFactory threadFactoryBuild = new ThreadFactoryBuilder().setDaemon(true).setNameFormat("ListenableFutureAdapter-thread-%d").build();
            f31501f = threadFactoryBuild;
            f31502g = Executors.newCachedThreadPool(threadFactoryBuild);
        }

        ListenableFutureAdapter(Future future) {
            this(future, f31502g);
        }

        public static /* synthetic */ void i(ListenableFutureAdapter listenableFutureAdapter) {
            listenableFutureAdapter.getClass();
            try {
                Uninterruptibles.getUninterruptibly(listenableFutureAdapter.f31506e);
            } catch (Throwable unused) {
            }
            listenableFutureAdapter.f31504c.execute();
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            this.f31504c.add(runnable, executor);
            if (this.f31505d.compareAndSet(false, true)) {
                if (this.f31506e.isDone()) {
                    this.f31504c.execute();
                } else {
                    this.f31503b.execute(new Runnable() { // from class: com.google.common.util.concurrent.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            JdkFutureAdapters.ListenableFutureAdapter.i(this.f31669b);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: g */
        public Future n() {
            return this.f31506e;
        }

        ListenableFutureAdapter(Future future, Executor executor) {
            this.f31504c = new ExecutionList();
            this.f31505d = new AtomicBoolean(false);
            this.f31506e = (Future) Preconditions.checkNotNull(future);
            this.f31503b = (Executor) Preconditions.checkNotNull(executor);
        }
    }

    public static <V> ListenableFuture<V> listenInPoolThread(Future<V> future) {
        return future instanceof ListenableFuture ? (ListenableFuture) future : new ListenableFutureAdapter(future);
    }

    public static <V> ListenableFuture<V> listenInPoolThread(Future<V> future, Executor executor) {
        Preconditions.checkNotNull(executor);
        if (future instanceof ListenableFuture) {
            return (ListenableFuture) future;
        }
        return new ListenableFutureAdapter(future, executor);
    }
}
