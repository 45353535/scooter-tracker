package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class Monitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f31518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReentrantLock f31519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Guard f31520c;

    public static abstract class Guard {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Monitor f31521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Condition f31522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f31523c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Guard f31524d;

        protected Guard(Monitor monitor) {
            this.f31521a = (Monitor) Preconditions.checkNotNull(monitor, "monitor");
            this.f31522b = monitor.f31519b.newCondition();
        }

        public abstract boolean isSatisfied();
    }

    public Monitor() {
        this(false);
    }

    private void b(Guard guard, boolean z10) {
        if (z10) {
            k();
        }
        e(guard);
        do {
            try {
                guard.f31522b.await();
            } finally {
                f(guard);
            }
        } while (!guard.isSatisfied());
    }

    private boolean c(Guard guard, long j10, boolean z10) {
        boolean z11 = true;
        while (j10 > 0) {
            if (z11) {
                if (z10) {
                    try {
                        k();
                    } catch (Throwable th2) {
                        if (!z11) {
                            f(guard);
                        }
                        throw th2;
                    }
                }
                e(guard);
                z11 = false;
            }
            j10 = guard.f31522b.awaitNanos(j10);
            if (guard.isSatisfied()) {
                if (!z11) {
                    f(guard);
                }
                return true;
            }
        }
        if (!z11) {
            f(guard);
        }
        return false;
    }

    private void d(Guard guard, boolean z10) {
        if (z10) {
            k();
        }
        e(guard);
        do {
            try {
                guard.f31522b.awaitUninterruptibly();
            } finally {
                f(guard);
            }
        } while (!guard.isSatisfied());
    }

    private void e(Guard guard) {
        int i10 = guard.f31523c;
        guard.f31523c = i10 + 1;
        if (i10 == 0) {
            guard.f31524d = this.f31520c;
            this.f31520c = guard;
        }
    }

    private void f(Guard guard) {
        int i10 = guard.f31523c - 1;
        guard.f31523c = i10;
        if (i10 == 0) {
            Guard guard2 = this.f31520c;
            Guard guard3 = null;
            while (guard2 != guard) {
                guard3 = guard2;
                guard2 = guard2.f31524d;
            }
            if (guard3 == null) {
                this.f31520c = guard2.f31524d;
            } else {
                guard3.f31524d = guard2.f31524d;
            }
            guard2.f31524d = null;
        }
    }

    private static long g(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        long jNanoTime = System.nanoTime();
        if (jNanoTime == 0) {
            return 1L;
        }
        return jNanoTime;
    }

    private boolean h(Guard guard) {
        try {
            return guard.isSatisfied();
        } catch (Throwable th2) {
            j();
            throw th2;
        }
    }

    private static long i(long j10, long j11) {
        if (j11 <= 0) {
            return 0L;
        }
        return j11 - (System.nanoTime() - j10);
    }

    private void j() {
        for (Guard guard = this.f31520c; guard != null; guard = guard.f31524d) {
            guard.f31522b.signalAll();
        }
    }

    private void k() {
        for (Guard guard = this.f31520c; guard != null; guard = guard.f31524d) {
            if (h(guard)) {
                guard.f31522b.signal();
                return;
            }
        }
    }

    private static long l(long j10, TimeUnit timeUnit) {
        return Longs.constrainToRange(timeUnit.toNanos(j10), 0L, 6917529027641081853L);
    }

    public void enter() {
        this.f31519b.lock();
    }

    public boolean enterIf(Guard guard) {
        if (guard.f31521a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f31519b;
        reentrantLock.lock();
        try {
            boolean zIsSatisfied = guard.isSatisfied();
            if (!zIsSatisfied) {
            }
            return zIsSatisfied;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean enterIfInterruptibly(Guard guard) throws InterruptedException {
        if (guard.f31521a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f31519b;
        reentrantLock.lockInterruptibly();
        try {
            boolean zIsSatisfied = guard.isSatisfied();
            if (!zIsSatisfied) {
            }
            return zIsSatisfied;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void enterInterruptibly() throws InterruptedException {
        this.f31519b.lockInterruptibly();
    }

    public void enterWhen(Guard guard) throws InterruptedException {
        if (guard.f31521a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f31519b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lockInterruptibly();
        try {
            if (guard.isSatisfied()) {
                return;
            }
            b(guard, zIsHeldByCurrentThread);
        } catch (Throwable th2) {
            leave();
            throw th2;
        }
    }

    public void enterWhenUninterruptibly(Guard guard) {
        if (guard.f31521a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f31519b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lock();
        try {
            if (guard.isSatisfied()) {
                return;
            }
            d(guard, zIsHeldByCurrentThread);
        } catch (Throwable th2) {
            leave();
            throw th2;
        }
    }

    public int getOccupiedDepth() {
        return this.f31519b.getHoldCount();
    }

    public int getQueueLength() {
        return this.f31519b.getQueueLength();
    }

    public int getWaitQueueLength(Guard guard) {
        if (guard.f31521a != this) {
            throw new IllegalMonitorStateException();
        }
        this.f31519b.lock();
        try {
            return guard.f31523c;
        } finally {
            this.f31519b.unlock();
        }
    }

    public boolean hasQueuedThread(Thread thread) {
        return this.f31519b.hasQueuedThread(thread);
    }

    public boolean hasQueuedThreads() {
        return this.f31519b.hasQueuedThreads();
    }

    public boolean hasWaiters(Guard guard) {
        return getWaitQueueLength(guard) > 0;
    }

    public boolean isFair() {
        return this.f31518a;
    }

    public boolean isOccupied() {
        return this.f31519b.isLocked();
    }

    public boolean isOccupiedByCurrentThread() {
        return this.f31519b.isHeldByCurrentThread();
    }

    public void leave() {
        ReentrantLock reentrantLock = this.f31519b;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                k();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean tryEnter() {
        return this.f31519b.tryLock();
    }

    public boolean tryEnterIf(Guard guard) {
        if (guard.f31521a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f31519b;
        if (!reentrantLock.tryLock()) {
            return false;
        }
        try {
            boolean zIsSatisfied = guard.isSatisfied();
            if (!zIsSatisfied) {
            }
            return zIsSatisfied;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void waitFor(Guard guard) throws InterruptedException {
        if (guard.f31521a != this || !this.f31519b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return;
        }
        b(guard, true);
    }

    public void waitForUninterruptibly(Guard guard) {
        if (guard.f31521a != this || !this.f31519b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return;
        }
        d(guard, true);
    }

    public Monitor(boolean z10) {
        this.f31520c = null;
        this.f31518a = z10;
        this.f31519b = new ReentrantLock(z10);
    }

    public boolean enter(long j10, TimeUnit timeUnit) throws Throwable {
        boolean zTryLock;
        long jL = l(j10, timeUnit);
        ReentrantLock reentrantLock = this.f31519b;
        boolean z10 = true;
        if (!this.f31518a && reentrantLock.tryLock()) {
            return true;
        }
        boolean zInterrupted = Thread.interrupted();
        try {
            long jNanoTime = System.nanoTime();
            long jI = jL;
            while (true) {
                try {
                    try {
                        zTryLock = reentrantLock.tryLock(jI, TimeUnit.NANOSECONDS);
                        break;
                    } catch (InterruptedException unused) {
                        jI = i(jNanoTime, jL);
                        zInterrupted = true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (zInterrupted) {
                Thread.currentThread().interrupt();
            }
            return zTryLock;
        } catch (Throwable th3) {
            th = th3;
            z10 = zInterrupted;
        }
    }

    public boolean enterInterruptibly(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f31519b.tryLock(j10, timeUnit);
    }

    public boolean waitFor(Guard guard, long j10, TimeUnit timeUnit) throws InterruptedException {
        long jL = l(j10, timeUnit);
        if (guard.f31521a == this && this.f31519b.isHeldByCurrentThread()) {
            if (guard.isSatisfied()) {
                return true;
            }
            if (!Thread.interrupted()) {
                return c(guard, jL, true);
            }
            throw new InterruptedException();
        }
        throw new IllegalMonitorStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean waitForUninterruptibly(com.google.common.util.concurrent.Monitor.Guard r7, long r8, java.util.concurrent.TimeUnit r10) throws java.lang.Throwable {
        /*
            r6 = this;
            long r8 = l(r8, r10)
            com.google.common.util.concurrent.Monitor r10 = r7.f31521a
            if (r10 != r6) goto L53
            java.util.concurrent.locks.ReentrantLock r10 = r6.f31519b
            boolean r10 = r10.isHeldByCurrentThread()
            if (r10 == 0) goto L53
            boolean r10 = r7.isSatisfied()
            r0 = 1
            if (r10 == 0) goto L18
            return r0
        L18:
            long r1 = g(r8)
            boolean r10 = java.lang.Thread.interrupted()
            r3 = r8
            r5 = r0
        L22:
            boolean r7 = r6.c(r7, r3, r5)     // Catch: java.lang.Throwable -> L30 java.lang.InterruptedException -> L33
            if (r10 == 0) goto L2f
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
        L2f:
            return r7
        L30:
            r7 = move-exception
            r0 = r10
            goto L49
        L33:
            boolean r10 = r7.isSatisfied()     // Catch: java.lang.Throwable -> L48
            if (r10 == 0) goto L41
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
            return r0
        L41:
            long r3 = i(r1, r8)     // Catch: java.lang.Throwable -> L48
            r5 = 0
            r10 = r0
            goto L22
        L48:
            r7 = move-exception
        L49:
            if (r0 == 0) goto L52
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
        L52:
            throw r7
        L53:
            java.lang.IllegalMonitorStateException r7 = new java.lang.IllegalMonitorStateException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.Monitor.waitForUninterruptibly(com.google.common.util.concurrent.Monitor$Guard, long, java.util.concurrent.TimeUnit):boolean");
    }

    public boolean enterIf(Guard guard, long j10, TimeUnit timeUnit) {
        if (guard.f31521a == this) {
            if (!enter(j10, timeUnit)) {
                return false;
            }
            try {
                boolean zIsSatisfied = guard.isSatisfied();
                if (!zIsSatisfied) {
                }
                return zIsSatisfied;
            } finally {
                this.f31519b.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    public boolean enterIfInterruptibly(Guard guard, long j10, TimeUnit timeUnit) throws InterruptedException {
        if (guard.f31521a == this) {
            ReentrantLock reentrantLock = this.f31519b;
            if (!reentrantLock.tryLock(j10, timeUnit)) {
                return false;
            }
            try {
                boolean zIsSatisfied = guard.isSatisfied();
                if (!zIsSatisfied) {
                }
                return zIsSatisfied;
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean enterWhen(com.google.common.util.concurrent.Monitor.Guard r11, long r12, java.util.concurrent.TimeUnit r14) throws java.lang.InterruptedException {
        /*
            r10 = this;
            long r0 = l(r12, r14)
            com.google.common.util.concurrent.Monitor r2 = r11.f31521a
            if (r2 != r10) goto L62
            java.util.concurrent.locks.ReentrantLock r2 = r10.f31519b
            boolean r3 = r2.isHeldByCurrentThread()
            boolean r4 = r10.f31518a
            r5 = 0
            r6 = 0
            if (r4 != 0) goto L29
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L23
            boolean r4 = r2.tryLock()
            if (r4 == 0) goto L29
            r8 = r6
            goto L34
        L23:
            java.lang.InterruptedException r11 = new java.lang.InterruptedException
            r11.<init>()
            throw r11
        L29:
            long r8 = g(r0)
            boolean r12 = r2.tryLock(r12, r14)
            if (r12 != 0) goto L34
            return r5
        L34:
            boolean r12 = r11.isSatisfied()     // Catch: java.lang.Throwable -> L4a
            if (r12 != 0) goto L4c
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 != 0) goto L3f
            goto L43
        L3f:
            long r0 = i(r8, r0)     // Catch: java.lang.Throwable -> L4a
        L43:
            boolean r11 = r10.c(r11, r0, r3)     // Catch: java.lang.Throwable -> L4a
            if (r11 == 0) goto L4d
            goto L4c
        L4a:
            r11 = move-exception
            goto L53
        L4c:
            r5 = 1
        L4d:
            if (r5 != 0) goto L52
            r2.unlock()
        L52:
            return r5
        L53:
            if (r3 != 0) goto L5e
            r10.k()     // Catch: java.lang.Throwable -> L59
            goto L5e
        L59:
            r11 = move-exception
            r2.unlock()
            throw r11
        L5e:
            r2.unlock()
            throw r11
        L62:
            java.lang.IllegalMonitorStateException r11 = new java.lang.IllegalMonitorStateException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.Monitor.enterWhen(com.google.common.util.concurrent.Monitor$Guard, long, java.util.concurrent.TimeUnit):boolean");
    }

    public boolean enterWhenUninterruptibly(Guard guard, long j10, TimeUnit timeUnit) throws Throwable {
        long jG;
        long jI;
        long jL = l(j10, timeUnit);
        if (guard.f31521a == this) {
            ReentrantLock reentrantLock = this.f31519b;
            boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            boolean zInterrupted = Thread.interrupted();
            try {
                boolean zC = true;
                if (this.f31518a || !reentrantLock.tryLock()) {
                    jG = g(jL);
                    long jI2 = jL;
                    while (true) {
                        try {
                            try {
                                break;
                            } catch (InterruptedException unused) {
                                jI2 = i(jG, jL);
                                zInterrupted = true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            zInterrupted = true;
                            if (zInterrupted) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                    if (!reentrantLock.tryLock(jI2, TimeUnit.NANOSECONDS)) {
                        if (zInterrupted) {
                            Thread.currentThread().interrupt();
                        }
                        return false;
                    }
                } else {
                    jG = 0;
                }
                while (!guard.isSatisfied()) {
                    try {
                        if (jG == 0) {
                            jG = g(jL);
                            jI = jL;
                        } else {
                            jI = i(jG, jL);
                        }
                        zC = c(guard, jI, zIsHeldByCurrentThread);
                    } catch (InterruptedException unused2) {
                        zIsHeldByCurrentThread = false;
                        zInterrupted = zC;
                    } catch (Throwable th3) {
                        reentrantLock.unlock();
                        throw th3;
                    }
                }
                if (!zC) {
                    reentrantLock.unlock();
                }
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                }
                return zC;
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }
}
