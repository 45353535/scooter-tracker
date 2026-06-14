package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.j2objc.annotations.ReflectionSupport;
import com.ironsource.C4240b4;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
@ReflectionSupport(ReflectionSupport.Level.FULL)
abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Runnable f31498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Runnable f31499c;

    @VisibleForTesting
    static final class Blocker extends AbstractOwnableSynchronizer implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterruptibleTask f31500b;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return this.f31500b.toString();
        }

        private Blocker(InterruptibleTask interruptibleTask) {
            this.f31500b = interruptibleTask;
        }
    }

    private static final class DoNothingRunnable implements Runnable {
        private DoNothingRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        f31498b = new DoNothingRunnable();
        f31499c = new DoNothingRunnable();
    }

    InterruptibleTask() {
    }

    private void j(Thread thread) {
        Runnable runnable = get();
        Blocker blocker = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof Blocker;
            if (!z11 && runnable != f31499c) {
                break;
            }
            if (z11) {
                blocker = (Blocker) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f31499c;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(blocker);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    abstract void a(Throwable th2);

    abstract void b(Object obj);

    final void d() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            Blocker blocker = new Blocker();
            blocker.b(Thread.currentThread());
            if (compareAndSet(runnable, blocker)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(f31498b) == f31499c) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    abstract boolean g();

    abstract Object h();

    abstract String i();

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objH = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zG = g();
            if (!zG) {
                try {
                    objH = h();
                } catch (Throwable th2) {
                    try {
                        Platform.b(th2);
                        if (!compareAndSet(threadCurrentThread, f31498b)) {
                            j(threadCurrentThread);
                        }
                        if (zG) {
                            return;
                        }
                        a(th2);
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, f31498b)) {
                            j(threadCurrentThread);
                        }
                        if (!zG) {
                            b(NullnessCasts.a(null));
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f31498b) {
            str = "running=[DONE]";
        } else if (runnable instanceof Blocker) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + C4240b4.j.f42674e;
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + i();
    }
}
