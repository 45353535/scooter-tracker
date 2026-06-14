package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.g7;
import io.sentry.v7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppLifecycleIntegration implements io.sentry.r1, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.a f82287b = new io.sentry.util.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile s1 f82288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SentryAndroidOptions f82289d;

    private void m() {
        io.sentry.g1 g1VarD = this.f82287b.d();
        try {
            s1 s1Var = this.f82288c;
            this.f82288c = null;
            if (g1VarD != null) {
                g1VarD.close();
            }
            if (s1Var != null) {
                AppState.n().q(s1Var);
                SentryAndroidOptions sentryAndroidOptions = this.f82289d;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().c(g7.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
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

    @Override // io.sentry.r1
    public void c(io.sentry.b1 b1Var, v7 v7Var) {
        io.sentry.util.w.c(b1Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(v7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) v7Var : null, "SentryAndroidOptions is required");
        this.f82289d = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        g7 g7Var = g7.DEBUG;
        logger.c(g7Var, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f82289d.isEnableAutoSessionTracking()));
        this.f82289d.getLogger().c(g7Var, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f82289d.isEnableAppLifecycleBreadcrumbs()));
        if (!this.f82289d.isEnableAutoSessionTracking() && !this.f82289d.isEnableAppLifecycleBreadcrumbs()) {
            return;
        }
        io.sentry.g1 g1VarD = this.f82287b.d();
        try {
            if (this.f82288c != null) {
                if (g1VarD != null) {
                    g1VarD.close();
                }
            } else {
                this.f82288c = new s1(b1Var, this.f82289d.getSessionTrackingIntervalMillis(), this.f82289d.isEnableAutoSessionTracking(), this.f82289d.isEnableAppLifecycleBreadcrumbs());
                AppState.n().f(this.f82288c);
                if (g1VarD != null) {
                    g1VarD.close();
                }
                v7Var.getLogger().c(g7Var, "AppLifecycleIntegration installed.", new Object[0]);
                io.sentry.util.o.a("AppLifecycle");
            }
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m();
        AppState.n().y();
    }
}
