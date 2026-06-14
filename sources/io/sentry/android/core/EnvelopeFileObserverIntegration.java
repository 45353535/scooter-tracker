package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.g7;
import io.sentry.r3;
import io.sentry.v7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EnvelopeFileObserverIntegration implements io.sentry.r1, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m1 f82299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ILogger f82300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f82301d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final io.sentry.util.a f82302e = new io.sentry.util.a();

    private static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        @Override // io.sentry.android.core.EnvelopeFileObserverIntegration
        protected String n(v7 v7Var) {
            return v7Var.getOutboxPath();
        }
    }

    public static /* synthetic */ void d(EnvelopeFileObserverIntegration envelopeFileObserverIntegration, io.sentry.b1 b1Var, v7 v7Var, String str) {
        io.sentry.g1 g1VarD = envelopeFileObserverIntegration.f82302e.d();
        try {
            if (!envelopeFileObserverIntegration.f82301d) {
                envelopeFileObserverIntegration.o(b1Var, v7Var, str);
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

    public static EnvelopeFileObserverIntegration m() {
        return new OutboxEnvelopeFileObserverIntegration();
    }

    private void o(io.sentry.b1 b1Var, v7 v7Var, String str) {
        m1 m1Var = new m1(str, new r3(b1Var, v7Var.getEnvelopeReader(), v7Var.getSerializer(), v7Var.getLogger(), v7Var.getFlushTimeoutMillis(), v7Var.getMaxQueueSize()), v7Var.getLogger(), v7Var.getFlushTimeoutMillis());
        this.f82299b = m1Var;
        try {
            m1Var.startWatching();
            v7Var.getLogger().c(g7.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            io.sentry.util.o.a("EnvelopeFileObserver");
        } catch (Throwable th2) {
            v7Var.getLogger().a(g7.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th2);
        }
    }

    @Override // io.sentry.r1
    public final void c(final io.sentry.b1 b1Var, final v7 v7Var) {
        io.sentry.util.w.c(b1Var, "Scopes are required");
        io.sentry.util.w.c(v7Var, "SentryOptions is required");
        this.f82300c = v7Var.getLogger();
        final String strN = n(v7Var);
        if (strN == null) {
            this.f82300c.c(g7.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.f82300c.c(g7.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", strN);
        try {
            v7Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.n1
                @Override // java.lang.Runnable
                public final void run() {
                    EnvelopeFileObserverIntegration.d(this.f82682b, b1Var, v7Var, strN);
                }
            });
        } catch (Throwable th2) {
            this.f82300c.a(g7.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.g1 g1VarD = this.f82302e.d();
        try {
            this.f82301d = true;
            if (g1VarD != null) {
                g1VarD.close();
            }
            m1 m1Var = this.f82299b;
            if (m1Var != null) {
                m1Var.stopWatching();
                ILogger iLogger = this.f82300c;
                if (iLogger != null) {
                    iLogger.c(g7.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
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

    abstract String n(v7 v7Var);
}
