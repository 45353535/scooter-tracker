package io.sentry.transport;

import io.sentry.ILogger;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.e4;
import io.sentry.g7;
import io.sentry.i0;
import io.sentry.t5;
import io.sentry.transport.e;
import io.sentry.u5;
import io.sentry.util.m;
import io.sentry.v7;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements r, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f84215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.cache.g f84216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v7 f84217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0 f84218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s f84219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o f84220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Runnable f84221h;

    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f84222a;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryAsyncConnection-");
            int i10 = this.f84222a;
            this.f84222a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u5 f84223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final i0 f84224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final io.sentry.cache.g f84225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final d0 f84226e = d0.a();

        c(u5 u5Var, i0 i0Var, io.sentry.cache.g gVar) {
            this.f84223b = (u5) io.sentry.util.w.c(u5Var, "Envelope is required.");
            this.f84224c = i0Var;
            this.f84225d = (io.sentry.cache.g) io.sentry.util.w.c(gVar, "EnvelopeCache is required.");
        }

        public static /* synthetic */ void a(c cVar, d0 d0Var, io.sentry.hints.p pVar) {
            e.this.f84217d.getLogger().c(g7.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(d0Var.d()));
            pVar.c(d0Var.d());
        }

        public static /* synthetic */ void b(c cVar, io.sentry.hints.f fVar) {
            if (!fVar.f(cVar.f84223b.b().a())) {
                e.this.f84217d.getLogger().c(g7.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            } else {
                fVar.a();
                e.this.f84217d.getLogger().c(g7.DEBUG, "Disk flush envelope fired", new Object[0]);
            }
        }

        public static /* synthetic */ void e(c cVar, boolean z10, u5 u5Var, Object obj, Class cls) {
            if (z10) {
                cVar.getClass();
            } else {
                io.sentry.util.u.a(cls, obj, e.this.f84217d.getLogger());
                e.this.f84217d.getClientReportRecorder().d(io.sentry.clientreport.f.NETWORK_ERROR, u5Var);
            }
        }

        public static /* synthetic */ void f(c cVar, boolean z10, Object obj, Class cls) {
            if (z10) {
                cVar.getClass();
            } else {
                io.sentry.util.u.a(cls, obj, e.this.f84217d.getLogger());
                e.this.f84217d.getClientReportRecorder().d(io.sentry.clientreport.f.NETWORK_ERROR, cVar.f84223b);
            }
        }

        private d0 k() {
            d0 d0Var = this.f84226e;
            this.f84223b.b().d(null);
            final boolean zH = this.f84225d.h(this.f84223b, this.f84224c);
            io.sentry.util.m.k(this.f84224c, io.sentry.hints.f.class, new m.a() { // from class: io.sentry.transport.g
                @Override // io.sentry.util.m.a
                public final void accept(Object obj) {
                    e.c.b(this.f84230a, (io.sentry.hints.f) obj);
                }
            });
            if (!e.this.f84219f.isConnected()) {
                io.sentry.util.m.l(this.f84224c, io.sentry.hints.k.class, new m.a() { // from class: io.sentry.transport.k
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.k) obj).d(true);
                    }
                }, new m.b() { // from class: io.sentry.transport.l
                    @Override // io.sentry.util.m.b
                    public final void a(Object obj, Class cls) {
                        e.c.f(this.f84236a, zH, obj, cls);
                    }
                });
                return d0Var;
            }
            final u5 u5VarE = e.this.f84217d.getClientReportRecorder().e(this.f84223b);
            try {
                u5VarE.b().d(io.sentry.l.k(e.this.f84217d.getDateProvider().a().g()));
                d0 d0VarH = e.this.f84220g.h(u5VarE);
                if (d0VarH.d()) {
                    this.f84225d.d(this.f84223b);
                    return d0VarH;
                }
                String str = "The transport failed to send the envelope with response code " + d0VarH.c();
                e.this.f84217d.getLogger().c(g7.ERROR, str, new Object[0]);
                if (d0VarH.c() >= 400 && d0VarH.c() != 429 && !zH) {
                    io.sentry.util.m.j(this.f84224c, io.sentry.hints.k.class, new m.c() { // from class: io.sentry.transport.h
                        @Override // io.sentry.util.m.c
                        public final void accept(Object obj) {
                            e.this.f84217d.getClientReportRecorder().d(io.sentry.clientreport.f.NETWORK_ERROR, u5VarE);
                        }
                    });
                }
                throw new IllegalStateException(str);
            } catch (IOException e10) {
                io.sentry.util.m.l(this.f84224c, io.sentry.hints.k.class, new m.a() { // from class: io.sentry.transport.i
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.k) obj).d(true);
                    }
                }, new m.b() { // from class: io.sentry.transport.j
                    @Override // io.sentry.util.m.b
                    public final void a(Object obj, Class cls) {
                        e.c.e(this.f84233a, zH, u5VarE, obj, cls);
                    }
                });
                throw new IllegalStateException("Sending the event failed.", e10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f84221h = this;
            final d0 d0VarK = this.f84226e;
            try {
                d0VarK = k();
                e.this.f84217d.getLogger().c(g7.DEBUG, "Envelope flushed", new Object[0]);
            } finally {
            }
        }
    }

    public e(v7 v7Var, b0 b0Var, s sVar, e4 e4Var) {
        this(p(v7Var.getMaxQueueSize(), v7Var.getEnvelopeDiskCache(), v7Var.getLogger(), v7Var.getDateProvider()), v7Var, b0Var, sVar, new o(v7Var, e4Var, b0Var));
    }

    public static /* synthetic */ void d(e eVar, io.sentry.hints.g gVar) {
        eVar.getClass();
        gVar.a();
        eVar.f84217d.getLogger().c(g7.DEBUG, "Envelope enqueued", new Object[0]);
    }

    public static /* synthetic */ void f(io.sentry.cache.g gVar, ILogger iLogger, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof c) {
            c cVar = (c) runnable;
            if (!io.sentry.util.m.h(cVar.f84224c, io.sentry.hints.e.class)) {
                gVar.h(cVar.f84223b, cVar.f84224c);
            }
            q(cVar.f84224c, true);
            iLogger.c(g7.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    private static x p(int i10, final io.sentry.cache.g gVar, final ILogger iLogger, t5 t5Var) {
        return new x(1, i10, new b(), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                e.f(gVar, iLogger, runnable, threadPoolExecutor);
            }
        }, iLogger, t5Var);
    }

    private static void q(i0 i0Var, final boolean z10) {
        io.sentry.util.m.k(i0Var, io.sentry.hints.p.class, new m.a() { // from class: io.sentry.transport.c
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                ((io.sentry.hints.p) obj).c(false);
            }
        });
        io.sentry.util.m.k(i0Var, io.sentry.hints.k.class, new m.a() { // from class: io.sentry.transport.d
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                ((io.sentry.hints.k) obj).d(z10);
            }
        });
    }

    @Override // io.sentry.transport.r
    public void b(boolean z10) {
        this.f84218e.close();
        this.f84215b.shutdown();
        this.f84217d.getLogger().c(g7.DEBUG, "Shutting down", new Object[0]);
        if (z10) {
            return;
        }
        try {
            long flushTimeoutMillis = this.f84217d.getFlushTimeoutMillis();
            if (this.f84215b.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.f84217d.getLogger().c(g7.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.f84215b.shutdownNow();
            if (this.f84221h != null) {
                this.f84215b.getRejectedExecutionHandler().rejectedExecution(this.f84221h, this.f84215b);
            }
        } catch (InterruptedException unused) {
            this.f84217d.getLogger().c(g7.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b(false);
    }

    @Override // io.sentry.transport.r
    public void j(long j10) {
        this.f84215b.c(j10);
    }

    @Override // io.sentry.transport.r
    public void k(u5 u5Var, i0 i0Var) {
        io.sentry.cache.g gVarE = this.f84216c;
        boolean z10 = false;
        if (io.sentry.util.m.h(i0Var, io.sentry.hints.e.class)) {
            gVarE = t.e();
            this.f84217d.getLogger().c(g7.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z10 = true;
        }
        u5 u5VarN = this.f84218e.n(u5Var, i0Var);
        if (u5VarN == null) {
            if (z10) {
                this.f84216c.d(u5Var);
                return;
            }
            return;
        }
        if (io.sentry.util.m.h(i0Var, UncaughtExceptionHandlerIntegration.a.class)) {
            u5VarN = this.f84217d.getClientReportRecorder().e(u5VarN);
        }
        Future futureSubmit = this.f84215b.submit(new c(u5VarN, i0Var, gVarE));
        if (futureSubmit == null || !futureSubmit.isCancelled()) {
            io.sentry.util.m.k(i0Var, io.sentry.hints.g.class, new m.a() { // from class: io.sentry.transport.b
                @Override // io.sentry.util.m.a
                public final void accept(Object obj) {
                    e.d(this.f84203a, (io.sentry.hints.g) obj);
                }
            });
        } else {
            this.f84217d.getClientReportRecorder().d(io.sentry.clientreport.f.QUEUE_OVERFLOW, u5VarN);
        }
    }

    @Override // io.sentry.transport.r
    public /* synthetic */ void o0(u5 u5Var) {
        q.b(this, u5Var);
    }

    @Override // io.sentry.transport.r
    public boolean u() {
        return (this.f84218e.q() || this.f84215b.a()) ? false : true;
    }

    @Override // io.sentry.transport.r
    public b0 v() {
        return this.f84218e;
    }

    public e(x xVar, v7 v7Var, b0 b0Var, s sVar, o oVar) {
        this.f84221h = null;
        this.f84215b = (x) io.sentry.util.w.c(xVar, "executor is required");
        this.f84216c = (io.sentry.cache.g) io.sentry.util.w.c(v7Var.getEnvelopeDiskCache(), "envelopeCache is required");
        this.f84217d = (v7) io.sentry.util.w.c(v7Var, "options is required");
        this.f84218e = (b0) io.sentry.util.w.c(b0Var, "rateLimiter is required");
        this.f84219f = (s) io.sentry.util.w.c(sVar, "transportGate is required");
        this.f84220g = (o) io.sentry.util.w.c(oVar, "httpConnection is required");
    }
}
