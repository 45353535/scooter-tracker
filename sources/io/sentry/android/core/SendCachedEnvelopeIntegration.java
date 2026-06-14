package io.sentry.android.core;

import io.sentry.a5;
import io.sentry.g7;
import io.sentry.n0;
import io.sentry.v7;
import io.sentry.w4;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
final class SendCachedEnvelopeIntegration implements io.sentry.r1, n0.b, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a5 f82325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.util.q f82326c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.sentry.n0 f82328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private io.sentry.b1 f82329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SentryAndroidOptions f82330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w4 f82331h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f82327d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f82332i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f82333j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final io.sentry.util.a f82334k = new io.sentry.util.a();

    public SendCachedEnvelopeIntegration(a5 a5Var, io.sentry.util.q qVar) {
        this.f82325b = (a5) io.sentry.util.w.c(a5Var, "SendFireAndForgetFactory is required");
        this.f82326c = qVar;
    }

    public static /* synthetic */ void d(SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration, SentryAndroidOptions sentryAndroidOptions, io.sentry.b1 b1Var) {
        sendCachedEnvelopeIntegration.getClass();
        try {
            if (sendCachedEnvelopeIntegration.f82333j.get()) {
                sentryAndroidOptions.getLogger().c(g7.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                return;
            }
            if (!sendCachedEnvelopeIntegration.f82332i.getAndSet(true)) {
                io.sentry.n0 connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                sendCachedEnvelopeIntegration.f82328e = connectionStatusProvider;
                connectionStatusProvider.m0(sendCachedEnvelopeIntegration);
                sendCachedEnvelopeIntegration.f82331h = sendCachedEnvelopeIntegration.f82325b.b(b1Var, sentryAndroidOptions);
            }
            io.sentry.n0 n0Var = sendCachedEnvelopeIntegration.f82328e;
            if (n0Var != null && n0Var.A() == n0.a.DISCONNECTED) {
                sentryAndroidOptions.getLogger().c(g7.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                return;
            }
            io.sentry.transport.b0 b0VarV = b1Var.v();
            if (b0VarV != null && b0VarV.p(io.sentry.k.All)) {
                sentryAndroidOptions.getLogger().c(g7.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                return;
            }
            w4 w4Var = sendCachedEnvelopeIntegration.f82331h;
            if (w4Var == null) {
                sentryAndroidOptions.getLogger().c(g7.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
            } else {
                w4Var.a();
            }
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(g7.ERROR, "Failed trying to send cached events.", th2);
        }
    }

    private void e(final io.sentry.b1 b1Var, final SentryAndroidOptions sentryAndroidOptions) {
        try {
            io.sentry.g1 g1VarD = this.f82334k.d();
            try {
                Future futureSubmit = sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.a2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendCachedEnvelopeIntegration.d(this.f82362b, sentryAndroidOptions, b1Var);
                    }
                });
                if (((Boolean) this.f82326c.a()).booleanValue() && this.f82327d.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().c(g7.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().c(g7.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().c(g7.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                if (g1VarD != null) {
                    g1VarD.close();
                }
            } finally {
            }
        } catch (RejectedExecutionException e10) {
            sentryAndroidOptions.getLogger().a(g7.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e10);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(g7.ERROR, "Failed to call the executor. Cached events will not be sent", th2);
        }
    }

    @Override // io.sentry.r1
    public void c(io.sentry.b1 b1Var, v7 v7Var) {
        this.f82329f = (io.sentry.b1) io.sentry.util.w.c(b1Var, "Scopes are required");
        this.f82330g = (SentryAndroidOptions) io.sentry.util.w.c(v7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) v7Var : null, "SentryAndroidOptions is required");
        if (!this.f82325b.a(v7Var.getCacheDirPath(), v7Var.getLogger())) {
            v7Var.getLogger().c(g7.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            io.sentry.util.o.a("SendCachedEnvelope");
            e(b1Var, this.f82330g);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f82333j.set(true);
        io.sentry.n0 n0Var = this.f82328e;
        if (n0Var != null) {
            n0Var.N(this);
        }
    }

    @Override // io.sentry.n0.b
    public void f(n0.a aVar) {
        SentryAndroidOptions sentryAndroidOptions;
        io.sentry.b1 b1Var = this.f82329f;
        if (b1Var == null || (sentryAndroidOptions = this.f82330g) == null || aVar == n0.a.DISCONNECTED) {
            return;
        }
        e(b1Var, sentryAndroidOptions);
    }
}
