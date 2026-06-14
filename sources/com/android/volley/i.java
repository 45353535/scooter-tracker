package com.android.volley;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes5.dex */
public class i extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue f7520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f7521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f7522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q f7523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f7524f = false;

    public i(BlockingQueue blockingQueue, h hVar, b bVar, q qVar) {
        this.f7520b = blockingQueue;
        this.f7521c = hVar;
        this.f7522d = bVar;
        this.f7523e = qVar;
    }

    private void a(n nVar) {
        TrafficStats.setThreadStatsTag(nVar.getTrafficStatsTag());
    }

    private void b(n nVar, u uVar) {
        this.f7523e.c(nVar, nVar.parseNetworkError(uVar));
    }

    private void d() throws InterruptedException {
        e((n) this.f7520b.take());
    }

    void e(n nVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        nVar.sendEvent(3);
        try {
            try {
                try {
                    nVar.addMarker("network-queue-take");
                    if (nVar.isCanceled()) {
                        nVar.finish("network-discard-cancelled");
                        nVar.notifyListenerResponseNotUsable();
                        return;
                    }
                    a(nVar);
                    k kVarA = this.f7521c.a(nVar);
                    nVar.addMarker("network-http-complete");
                    if (kVarA.f7529e && nVar.hasHadResponseDelivered()) {
                        nVar.finish("not-modified");
                        nVar.notifyListenerResponseNotUsable();
                        return;
                    }
                    p networkResponse = nVar.parseNetworkResponse(kVarA);
                    nVar.addMarker("network-parse-complete");
                    if (nVar.shouldCache() && networkResponse.f7542b != null) {
                        this.f7522d.b(nVar.getCacheKey(), networkResponse.f7542b);
                        nVar.addMarker("network-cache-written");
                    }
                    nVar.markDelivered();
                    this.f7523e.a(nVar, networkResponse);
                    nVar.notifyListenerResponseReceived(networkResponse);
                } catch (Exception e10) {
                    v.d(e10, "Unhandled exception %s", e10.toString());
                    u uVar = new u(e10);
                    uVar.g(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    this.f7523e.c(nVar, uVar);
                    nVar.notifyListenerResponseNotUsable();
                }
            } catch (u e11) {
                e11.g(SystemClock.elapsedRealtime() - jElapsedRealtime);
                b(nVar, e11);
                nVar.notifyListenerResponseNotUsable();
            }
        } finally {
            nVar.sendEvent(4);
        }
    }

    public void f() {
        this.f7524f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                d();
            } catch (InterruptedException unused) {
                if (this.f7524f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                v.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
