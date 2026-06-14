package io.sentry;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShutdownHookIntegration implements r1, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runtime f82207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Thread f82208c;

    public ShutdownHookIntegration(Runtime runtime) {
        this.f82207b = (Runtime) io.sentry.util.w.c(runtime, "Runtime is required");
    }

    public static /* synthetic */ void d(ShutdownHookIntegration shutdownHookIntegration, v7 v7Var) {
        shutdownHookIntegration.f82207b.addShutdownHook(shutdownHookIntegration.f82208c);
        v7Var.getLogger().c(g7.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
        io.sentry.util.o.a("ShutdownHook");
    }

    private void h(Runnable runnable) {
        try {
            runnable.run();
        } catch (IllegalStateException e10) {
            String message = e10.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e10;
            }
        }
    }

    @Override // io.sentry.r1
    public void c(final b1 b1Var, final v7 v7Var) {
        io.sentry.util.w.c(b1Var, "Scopes are required");
        io.sentry.util.w.c(v7Var, "SentryOptions is required");
        if (!v7Var.isEnableShutdownHook()) {
            v7Var.getLogger().c(g7.INFO, "enableShutdownHook is disabled.", new Object[0]);
        } else {
            this.f82208c = new Thread(new Runnable() { // from class: io.sentry.m8
                @Override // java.lang.Runnable
                public final void run() {
                    b1Var.j(v7Var.getFlushTimeoutMillis());
                }
            }, "sentry-shutdownhook");
            h(new Runnable() { // from class: io.sentry.n8
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration.d(this.f83772b, v7Var);
                }
            });
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f82208c != null) {
            h(new Runnable() { // from class: io.sentry.l8
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration shutdownHookIntegration = this.f83712b;
                    shutdownHookIntegration.f82207b.removeShutdownHook(shutdownHookIntegration.f82208c);
                }
            });
        }
    }

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }
}
