package com.mbridge.msdk.tracker;

import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ThreadPoolExecutor f51827a;

    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeTrackThread");
        }
    }

    private static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f51829a;

        public b(Runnable runnable) {
            this.f51829a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.b(this.f51829a)) {
                return;
            }
            try {
                this.f51829a.run();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f51797a) {
                    Log.e("TrackManager", "execute error", e10);
                }
            }
        }
    }

    public void a(Runnable runnable) {
        if (this.f51827a == null) {
            this.f51827a = a();
        }
        if (this.f51827a.isShutdown()) {
            return;
        }
        this.f51827a.execute(new b(runnable));
    }

    private ThreadPoolExecutor a() {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }
}
