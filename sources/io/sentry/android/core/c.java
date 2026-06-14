package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.g7;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
final class c extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f82368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f82369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t1 f82370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.transport.p f82371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f82372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f82373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ILogger f82374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile long f82375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f82376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f82377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f82378l;

    public interface a {
        void a(ApplicationNotResponding applicationNotResponding);
    }

    c(long j10, boolean z10, a aVar, ILogger iLogger, Context context) {
        this(new io.sentry.transport.p() { // from class: io.sentry.android.core.a
            @Override // io.sentry.transport.p
            public final long getCurrentTimeMillis() {
                return SystemClock.uptimeMillis();
            }
        }, j10, 500L, z10, aVar, iLogger, new t1(), context);
    }

    public static /* synthetic */ void a(c cVar, io.sentry.transport.p pVar) {
        cVar.getClass();
        cVar.f82375i = pVar.getCurrentTimeMillis();
        cVar.f82376j.set(false);
    }

    private boolean d() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) this.f82377k.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        try {
            processesInErrorState = activityManager.getProcessesInErrorState();
        } catch (Throwable th2) {
            this.f82374h.a(g7.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th2);
            processesInErrorState = null;
        }
        if (processesInErrorState == null) {
            return false;
        }
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (it.hasNext()) {
            if (it.next().condition == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f82378l.run();
        while (!isInterrupted()) {
            this.f82370d.b(this.f82378l);
            try {
                Thread.sleep(this.f82372f);
                if (this.f82371e.getCurrentTimeMillis() - this.f82375i > this.f82373g) {
                    if (!this.f82368b && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.f82374h.c(g7.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f82376j.set(true);
                    } else if (d() && this.f82376j.compareAndSet(false, true)) {
                        this.f82369c.a(new ApplicationNotResponding("Application Not Responding for at least " + this.f82373g + " ms.", this.f82370d.a()));
                    }
                }
            } catch (InterruptedException e10) {
                try {
                    Thread.currentThread().interrupt();
                    this.f82374h.c(g7.WARNING, "Interrupted: %s", e10.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f82374h.c(g7.WARNING, "Failed to interrupt due to SecurityException: %s", e10.getMessage());
                    return;
                }
            }
        }
    }

    c(final io.sentry.transport.p pVar, long j10, long j11, boolean z10, a aVar, ILogger iLogger, t1 t1Var, Context context) {
        super("|ANR-WatchDog|");
        this.f82375i = 0L;
        this.f82376j = new AtomicBoolean(false);
        this.f82371e = pVar;
        this.f82373g = j10;
        this.f82372f = j11;
        this.f82368b = z10;
        this.f82369c = aVar;
        this.f82374h = iLogger;
        this.f82370d = t1Var;
        this.f82377k = context;
        this.f82378l = new Runnable() { // from class: io.sentry.android.core.b
            @Override // java.lang.Runnable
            public final void run() {
                c.a(this.f82365b, pVar);
            }
        };
        if (j10 < this.f82372f * 2) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", Long.valueOf(this.f82372f * 2)));
        }
    }
}
