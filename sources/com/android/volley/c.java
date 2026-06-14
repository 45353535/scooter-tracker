package com.android.volley;

import android.os.Process;
import com.android.volley.b;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes5.dex */
public class c extends Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f7499h = v.f7589b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue f7500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BlockingQueue f7501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f7502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q f7503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f7504f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f7505g;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f7506b;

        a(n nVar) {
            this.f7506b = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c.this.f7501c.put(this.f7506b);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public c(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, b bVar, q qVar) {
        this.f7500b = blockingQueue;
        this.f7501c = blockingQueue2;
        this.f7502d = bVar;
        this.f7503e = qVar;
        this.f7505g = new w(this, blockingQueue2, qVar);
    }

    private void b() throws InterruptedException {
        d((n) this.f7500b.take());
    }

    void d(n nVar) {
        nVar.addMarker("cache-queue-take");
        nVar.sendEvent(1);
        try {
            if (nVar.isCanceled()) {
                nVar.finish("cache-discard-canceled");
                return;
            }
            b.a aVar = this.f7502d.get(nVar.getCacheKey());
            if (aVar == null) {
                nVar.addMarker("cache-miss");
                if (!this.f7505g.c(nVar)) {
                    this.f7501c.put(nVar);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.b(jCurrentTimeMillis)) {
                nVar.addMarker("cache-hit-expired");
                nVar.setCacheEntry(aVar);
                if (!this.f7505g.c(nVar)) {
                    this.f7501c.put(nVar);
                }
                return;
            }
            nVar.addMarker("cache-hit");
            p networkResponse = nVar.parseNetworkResponse(new k(aVar.f7491a, aVar.f7497g));
            nVar.addMarker("cache-hit-parsed");
            if (!networkResponse.b()) {
                nVar.addMarker("cache-parsing-failed");
                this.f7502d.a(nVar.getCacheKey(), true);
                nVar.setCacheEntry(null);
                if (!this.f7505g.c(nVar)) {
                    this.f7501c.put(nVar);
                }
                return;
            }
            if (aVar.c(jCurrentTimeMillis)) {
                nVar.addMarker("cache-hit-refresh-needed");
                nVar.setCacheEntry(aVar);
                networkResponse.f7544d = true;
                if (this.f7505g.c(nVar)) {
                    this.f7503e.a(nVar, networkResponse);
                } else {
                    this.f7503e.b(nVar, networkResponse, new a(nVar));
                }
            } else {
                this.f7503e.a(nVar, networkResponse);
            }
        } finally {
            nVar.sendEvent(2);
        }
    }

    public void e() {
        this.f7504f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f7499h) {
            v.e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f7502d.initialize();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f7504f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                v.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
