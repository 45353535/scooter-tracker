package com.pubmatic.sdk.common.utility;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBNetworkMonitor;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public class POBLooper {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ScheduledThreadPoolExecutor f62571i = new ScheduledThreadPoolExecutor(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f62572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private POBNetworkMonitor.POBConnectivityListener f62573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private POBNetworkMonitor f62574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ScheduledFuture f62575d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LooperListener f62576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f62577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f62578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f62579h;

    @MainThread
    public interface LooperListener {
        void invoke();
    }

    class a extends POBNetworkMonitor.POBConnectivityListener {
        a() {
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkMonitor.POBConnectivityListener
        public void onNetworkConnectionChanged(boolean z10) {
            POBLooper.this.f62572a = z10;
            POBLog.debug("POBLooper", "Network connectivity = " + POBLooper.this.f62572a, new Object[0]);
            POBLooper pOBLooper = POBLooper.this;
            pOBLooper.a(pOBLooper.f62572a);
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkMonitor.POBConnectivityListener
        public void onNetworkRegistrationFailed() {
            POBLog.warn("POBLooper", "Network registration failed", new Object[0]);
        }
    }

    class b implements Runnable {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                POBLooper.this.a();
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBTaskHandler.getInstance().runOnMainThread(new a());
        }
    }

    private void c() {
        ScheduledFuture scheduledFuture = this.f62575d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f62575d = null;
        }
    }

    private void d() {
        POBNetworkMonitor pOBNetworkMonitor;
        POBNetworkMonitor.POBConnectivityListener pOBConnectivityListener = this.f62573b;
        if (pOBConnectivityListener == null || (pOBNetworkMonitor = this.f62574c) == null) {
            return;
        }
        pOBNetworkMonitor.unregisterConnectivityListener(pOBConnectivityListener);
        this.f62573b = null;
    }

    public synchronized void destroy() {
        d();
        c();
        this.f62577f = false;
        this.f62578g = false;
    }

    public synchronized void forcePause() {
        try {
            if (this.f62578g) {
                POBLog.verbose("POBLooper", "Skipping pause as already in force-paused state.", new Object[0]);
            } else {
                POBLog.verbose("POBLooper", "Applying force-paused state.", new Object[0]);
                this.f62578g = true;
                d();
                pause();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void forceResume() {
        try {
            if (this.f62578g) {
                POBLog.verbose("POBLooper", "Removing force-paused state.", new Object[0]);
                this.f62578g = false;
                b();
                resume();
            } else {
                POBLog.verbose("POBLooper", "Skipping resume as not in force-paused state.", new Object[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void loop(long j10) {
        try {
            this.f62577f = true;
            this.f62579h = j10 * 1000;
            c();
            if (this.f62578g) {
                POBLog.verbose("POBLooper", "Deferring refresh, expecting resumeAutoRefresh to continue the refresh", new Object[0]);
            } else {
                POBLog.verbose("POBLooper", "Refreshing after %s seconds", a(this.f62579h));
                a(this.f62579h);
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void pause() {
        try {
            if (this.f62577f) {
                ScheduledFuture scheduledFuture = this.f62575d;
                if (scheduledFuture != null) {
                    this.f62579h = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                    this.f62575d.cancel(true);
                    this.f62575d = null;
                    POBLog.verbose("POBLooper", "Pausing refresh at %s seconds", a(this.f62579h));
                }
            } else {
                POBLog.verbose("POBLooper", "Deferring pausing as not yet looped.", new Object[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void resume() {
        if (this.f62578g) {
            POBLog.verbose("POBLooper", "Skipping resume as in force-paused state.", new Object[0]);
            return;
        }
        if (this.f62577f && this.f62572a) {
            POBLog.verbose("POBLooper", "Resuming refresh from %s seconds", a(this.f62579h));
            a(this.f62579h);
        }
    }

    public void setListener(@Nullable LooperListener looperListener) {
        this.f62576e = looperListener;
    }

    public void setNetworkMonitor(@NonNull POBNetworkMonitor pOBNetworkMonitor) {
        this.f62574c = pOBNetworkMonitor;
        this.f62572a = pOBNetworkMonitor.isNetworkAvailable();
    }

    private synchronized void a(long j10) {
        if (this.f62575d == null) {
            this.f62575d = f62571i.schedule(new b(), j10, TimeUnit.MILLISECONDS);
        }
    }

    private void b() {
        if (this.f62573b != null || this.f62574c == null) {
            return;
        }
        this.f62573b = new a();
        this.f62572a = this.f62574c.isNetworkAvailable();
        this.f62574c.registerConnectivityListener(this.f62573b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f62576e != null) {
            this.f62577f = false;
            POBLog.verbose("POBLooper", "Invoking scheduled method", new Object[0]);
            this.f62576e.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        if (z10) {
            resume();
        } else {
            pause();
        }
    }

    private String a(double d10) {
        return String.format(Locale.getDefault(), "%.2f", Double.valueOf(d10 / 1000.0d));
    }
}
