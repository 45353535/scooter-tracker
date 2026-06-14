package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class ExecutionList {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final LazyLogger f31450c = new LazyLogger(ExecutionList.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RunnableExecutorPair f31451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31452b;

    private static final class RunnableExecutorPair {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f31453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f31454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RunnableExecutorPair f31455c;

        RunnableExecutorPair(Runnable runnable, Executor executor, RunnableExecutorPair runnableExecutorPair) {
            this.f31453a = runnable;
            this.f31454b = executor;
            this.f31455c = runnableExecutorPair;
        }
    }

    private static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f31450c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public void add(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        synchronized (this) {
            try {
                if (this.f31452b) {
                    a(runnable, executor);
                } else {
                    this.f31451a = new RunnableExecutorPair(runnable, executor, this.f31451a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void execute() {
        synchronized (this) {
            try {
                if (this.f31452b) {
                    return;
                }
                this.f31452b = true;
                RunnableExecutorPair runnableExecutorPair = this.f31451a;
                RunnableExecutorPair runnableExecutorPair2 = null;
                this.f31451a = null;
                while (runnableExecutorPair != null) {
                    RunnableExecutorPair runnableExecutorPair3 = runnableExecutorPair.f31455c;
                    runnableExecutorPair.f31455c = runnableExecutorPair2;
                    runnableExecutorPair2 = runnableExecutorPair;
                    runnableExecutorPair = runnableExecutorPair3;
                }
                while (runnableExecutorPair2 != null) {
                    a(runnableExecutorPair2.f31453a, runnableExecutorPair2.f31454b);
                    runnableExecutorPair2 = runnableExecutorPair2.f31455c;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
