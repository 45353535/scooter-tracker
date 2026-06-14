package kotlinx.coroutines;

import eg.p0;
import eg.p1;
import eg.r0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.q;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends q implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f93624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f93625i;

    static {
        Long l10;
        j jVar = new j();
        f93624h = jVar;
        r0.n0(jVar, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f93625i = timeUnit.toNanos(l10.longValue());
    }

    private j() {
    }

    private final synchronized void S0() {
        if (V0()) {
            debugStatus = 3;
            M0();
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread T0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f93624h.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean U0() {
        return debugStatus == 4;
    }

    private final boolean V0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean W0() {
        if (V0()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void X0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.q
    public void E0(Runnable runnable) {
        if (U0()) {
            X0();
        }
        super.E0(runnable);
    }

    @Override // kotlinx.coroutines.q, kotlinx.coroutines.k
    public p0 f(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return P0(j10, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zK0;
        p1.f69163a.d(this);
        eg.b.a();
        try {
            if (!W0()) {
                if (zK0) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jT0 = t0();
                if (jT0 == Long.MAX_VALUE) {
                    eg.b.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f93625i + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        S0();
                        eg.b.a();
                        if (K0()) {
                            return;
                        }
                        y0();
                        return;
                    }
                    jT0 = kotlin.ranges.g.k(jT0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jT0 > 0) {
                    if (V0()) {
                        _thread = null;
                        S0();
                        eg.b.a();
                        if (K0()) {
                            return;
                        }
                        y0();
                        return;
                    }
                    eg.b.a();
                    LockSupport.parkNanos(this, jT0);
                }
            }
        } finally {
            _thread = null;
            S0();
            eg.b.a();
            if (!K0()) {
                y0();
            }
        }
    }

    @Override // kotlinx.coroutines.q, eg.r0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "DefaultExecutor";
    }

    @Override // kotlinx.coroutines.r
    protected Thread y0() {
        Thread thread = _thread;
        return thread == null ? T0() : thread;
    }

    @Override // kotlinx.coroutines.r
    protected void z0(long j10, q.c cVar) {
        X0();
    }
}
