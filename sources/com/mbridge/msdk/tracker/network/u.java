package com.mbridge.msdk.tracker.network;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ThreadPoolExecutor f51980a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f51984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.mbridge.msdk.tracker.network.b f51985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m f51986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f51987h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f51981b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<t<?>> f51982c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<t<?>> f51983d = new PriorityBlockingQueue<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<c> f51988i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f51989j = false;

    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "NetworkDispatcher");
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                new n(u.this.f51983d, u.this.f51986g, u.this.f51985f, u.this.f51987h).run();
            } catch (Throwable unused) {
            }
        }
    }

    public interface c {
        void a(t<?> tVar, int i10);
    }

    public u(m mVar, w wVar, int i10, com.mbridge.msdk.tracker.network.b bVar) {
        this.f51984e = i10;
        this.f51985f = bVar;
        this.f51986g = mVar;
        this.f51987h = wVar;
    }

    private void a(int i10) {
        if (this.f51980a != null) {
            return;
        }
        try {
            b(i10);
        } catch (Throwable unused) {
            try {
                b(5);
            } catch (Exception unused2) {
                this.f51980a = null;
            }
        }
    }

    public void b() {
        if (!this.f51989j || this.f51980a == null) {
            a(this.f51984e);
            this.f51989j = true;
        }
    }

    <T> void c(t<T> tVar) {
        synchronized (this.f51982c) {
            this.f51982c.remove(tVar);
        }
        a(tVar, 5);
    }

    <T> void d(t<T> tVar) {
        this.f51983d.add(tVar);
    }

    private void b(int i10) {
        this.f51980a = new ThreadPoolExecutor(i10, i10, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public int a() {
        return this.f51981b.incrementAndGet();
    }

    <T> void b(t<T> tVar) {
        d(tVar);
    }

    public <T> t<T> a(t<T> tVar) {
        tVar.a(this);
        synchronized (this.f51982c) {
            this.f51982c.add(tVar);
        }
        tVar.b(a());
        tVar.a("add-to-queue");
        a(tVar, 0);
        b(tVar);
        if (this.f51980a == null) {
            a(this.f51984e);
        }
        if (!this.f51980a.isShutdown()) {
            this.f51980a.execute(new b());
        }
        return tVar;
    }

    void a(t<?> tVar, int i10) {
        synchronized (this.f51988i) {
            try {
                Iterator<c> it = this.f51988i.iterator();
                while (it.hasNext()) {
                    it.next().a(tVar, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
