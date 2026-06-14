package io.sentry;

import io.sentry.h9;
import java.io.Closeable;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class UncaughtExceptionHandlerIntegration implements r1, Thread.UncaughtExceptionHandler, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final io.sentry.util.a f82212g = new io.sentry.util.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f82213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b1 f82214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v7 f82215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f82216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h9 f82217f;

    public static class a extends io.sentry.hints.d implements io.sentry.hints.l, io.sentry.hints.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicReference f82218d;

        public a(long j10, ILogger iLogger) {
            super(j10, iLogger);
            this.f82218d = new AtomicReference();
        }

        @Override // io.sentry.hints.f
        public boolean f(io.sentry.protocol.x xVar) {
            io.sentry.protocol.x xVar2 = (io.sentry.protocol.x) this.f82218d.get();
            return xVar2 != null && xVar2.equals(xVar);
        }

        @Override // io.sentry.hints.f
        public void g(io.sentry.protocol.x xVar) {
            this.f82218d.set(xVar);
        }
    }

    public UncaughtExceptionHandlerIntegration() {
        this(h9.a.c());
    }

    static Throwable d(Thread thread, Throwable th2) {
        io.sentry.protocol.l lVar = new io.sentry.protocol.l();
        lVar.o(Boolean.FALSE);
        lVar.q("UncaughtExceptionHandler");
        return new io.sentry.exception.a(lVar, th2, thread);
    }

    private void e(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        f(uncaughtExceptionHandler, new HashSet());
    }

    private void f(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Set set) {
        if (uncaughtExceptionHandler == null) {
            v7 v7Var = this.f82215d;
            if (v7Var != null) {
                v7Var.getLogger().c(g7.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!set.add(uncaughtExceptionHandler)) {
            v7 v7Var2 = this.f82215d;
            if (v7Var2 != null) {
                v7Var2.getLogger().c(g7.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.f82213b;
            if (this != uncaughtExceptionHandler2) {
                f(uncaughtExceptionHandler2, set);
                return;
            }
            uncaughtExceptionHandlerIntegration.f82213b = this.f82213b;
            v7 v7Var3 = this.f82215d;
            if (v7Var3 != null) {
                v7Var3.getLogger().c(g7.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.r1
    public final void c(b1 b1Var, v7 v7Var) {
        if (this.f82216e) {
            v7Var.getLogger().c(g7.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f82216e = true;
        this.f82214c = (b1) io.sentry.util.w.c(b1Var, "Scopes are required");
        v7 v7Var2 = (v7) io.sentry.util.w.c(v7Var, "SentryOptions is required");
        this.f82215d = v7Var2;
        ILogger logger = v7Var2.getLogger();
        g7 g7Var = g7.DEBUG;
        logger.c(g7Var, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f82215d.isEnableUncaughtExceptionHandler()));
        if (this.f82215d.isEnableUncaughtExceptionHandler()) {
            g1 g1VarD = f82212g.d();
            try {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandlerB = this.f82217f.b();
                if (uncaughtExceptionHandlerB != null) {
                    this.f82215d.getLogger().c(g7Var, "default UncaughtExceptionHandler class='" + uncaughtExceptionHandlerB.getClass().getName() + "'", new Object[0]);
                    if (uncaughtExceptionHandlerB instanceof UncaughtExceptionHandlerIntegration) {
                        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandlerB;
                        if (uncaughtExceptionHandlerIntegration.f82214c == null || b1Var.G() != uncaughtExceptionHandlerIntegration.f82214c.G()) {
                            this.f82213b = uncaughtExceptionHandlerB;
                        } else {
                            this.f82213b = uncaughtExceptionHandlerIntegration.f82213b;
                        }
                    } else {
                        this.f82213b = uncaughtExceptionHandlerB;
                    }
                }
                this.f82217f.a(this);
                if (g1VarD != null) {
                    g1VarD.close();
                }
                this.f82215d.getLogger().c(g7Var, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                io.sentry.util.o.a("UncaughtExceptionHandler");
            } catch (Throwable th2) {
                if (g1VarD != null) {
                    try {
                        g1VarD.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g1 g1VarD = f82212g.d();
        try {
            if (this == this.f82217f.b()) {
                this.f82217f.a(this.f82213b);
                v7 v7Var = this.f82215d;
                if (v7Var != null) {
                    v7Var.getLogger().c(g7.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                e(this.f82217f.b());
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        v7 v7Var = this.f82215d;
        if (v7Var == null || this.f82214c == null) {
            return;
        }
        v7Var.getLogger().c(g7.INFO, "Uncaught exception received.", new Object[0]);
        try {
            a aVar = new a(this.f82215d.getFlushTimeoutMillis(), this.f82215d.getLogger());
            w6 w6Var = new w6(d(thread, th2));
            w6Var.E0(g7.FATAL);
            if (this.f82214c.getTransaction() == null && w6Var.G() != null) {
                aVar.g(w6Var.G());
            }
            i0 i0VarE = io.sentry.util.m.e(aVar);
            boolean zEquals = this.f82214c.I(w6Var, i0VarE).equals(io.sentry.protocol.x.f84062c);
            io.sentry.hints.h hVarF = io.sentry.util.m.f(i0VarE);
            if ((!zEquals || io.sentry.hints.h.MULTITHREADED_DEDUPLICATION.equals(hVarF)) && !aVar.h()) {
                this.f82215d.getLogger().c(g7.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", w6Var.G());
            }
        } catch (Throwable th3) {
            this.f82215d.getLogger().a(g7.ERROR, "Error sending uncaught exception to Sentry.", th3);
        }
        if (this.f82213b != null) {
            this.f82215d.getLogger().c(g7.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f82213b.uncaughtException(thread, th2);
        } else if (this.f82215d.isPrintUncaughtStackTrace()) {
            th2.printStackTrace();
        }
    }

    UncaughtExceptionHandlerIntegration(h9 h9Var) {
        this.f82216e = false;
        this.f82217f = (h9) io.sentry.util.w.c(h9Var, "threadAdapter is required.");
    }
}
