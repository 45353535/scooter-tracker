package com.mbridge.msdk.config.component.common.network.connect.socket;

import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile c f46807d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f46808a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ThreadPoolExecutor f46809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f46810c;

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f46811a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Socket-Thread-" + this.f46811a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    private c() {
        int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        this.f46809b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f46810c = new AtomicBoolean(false);
    }

    private boolean b() {
        try {
            int iH = m0.h();
            if (iH > 0) {
                int iV = m0.v();
                return iV > 0 && (((double) iH) / ((double) iV)) * 100.0d <= 5.0d;
            }
        } catch (Exception e10) {
            q0.b("SocketThreadPoolManager", "Memory check failed: " + e10.getMessage());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        while (!this.f46808a.isEmpty()) {
            try {
                Runnable runnablePoll = this.f46808a.poll();
                if (runnablePoll != null) {
                    if ((runnablePoll instanceof b) && ((b) runnablePoll).e() != null) {
                        ((b) runnablePoll).e().callStart();
                    }
                    runnablePoll.run();
                }
            } catch (Throwable th2) {
                this.f46810c.set(false);
                if (!this.f46808a.isEmpty()) {
                    d();
                }
                throw th2;
            }
        }
        this.f46810c.set(false);
        if (this.f46808a.isEmpty()) {
            return;
        }
        d();
    }

    private void d() {
        if (this.f46810c.compareAndSet(false, true)) {
            this.f46809b.execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.connect.socket.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46813b.c();
                }
            });
        }
    }

    public static c a() {
        if (f46807d == null) {
            synchronized (c.class) {
                try {
                    if (f46807d == null) {
                        f46807d = new c();
                    }
                } finally {
                }
            }
        }
        return f46807d;
    }

    public void a(Runnable runnable, com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        if (runnable == null) {
            return;
        }
        if (b()) {
            if (aVar != null) {
                aVar.a("Memory low");
            }
        } else if (this.f46808a.offer(runnable)) {
            if (aVar != null) {
                aVar.m();
                a(aVar);
            }
            d();
        }
    }

    private void a(com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        ThreadPoolExecutor threadPoolExecutor;
        if (aVar == null || (threadPoolExecutor = this.f46809b) == null) {
            return;
        }
        aVar.a(threadPoolExecutor.getPoolSize(), this.f46809b.getActiveCount(), this.f46809b.getQueue().size());
    }
}
