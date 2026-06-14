package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.g7;
import io.sentry.v7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class NdkIntegration implements io.sentry.r1, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f82303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f82304c;

    public NdkIntegration(Class cls) {
        this.f82303b = cls;
    }

    private void d(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // io.sentry.r1
    public final void c(io.sentry.b1 b1Var, v7 v7Var) {
        io.sentry.util.w.c(b1Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(v7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) v7Var : null, "SentryAndroidOptions is required");
        this.f82304c = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.f82304c.getLogger();
        g7 g7Var = g7.DEBUG;
        logger.c(g7Var, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || this.f82303b == null) {
            d(this.f82304c);
            return;
        }
        if (this.f82304c.getCacheDirPath() == null) {
            this.f82304c.getLogger().c(g7.ERROR, "No cache dir path is defined in options.", new Object[0]);
            d(this.f82304c);
            return;
        }
        try {
            this.f82303b.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f82304c);
            this.f82304c.getLogger().c(g7Var, "NdkIntegration installed.", new Object[0]);
            io.sentry.util.o.a("Ndk");
        } catch (NoSuchMethodException e10) {
            d(this.f82304c);
            this.f82304c.getLogger().a(g7.ERROR, "Failed to invoke the SentryNdk.init method.", e10);
        } catch (Throwable th2) {
            d(this.f82304c);
            this.f82304c.getLogger().a(g7.ERROR, "Failed to initialize SentryNdk.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f82304c;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.f82303b;
        try {
            if (cls != null) {
                try {
                    try {
                        cls.getMethod("close", null).invoke(null, null);
                        this.f82304c.getLogger().c(g7.DEBUG, "NdkIntegration removed.", new Object[0]);
                        d(this.f82304c);
                    } catch (Throwable th2) {
                        this.f82304c.getLogger().a(g7.ERROR, "Failed to close SentryNdk.", th2);
                        d(this.f82304c);
                    }
                } catch (NoSuchMethodException e10) {
                    this.f82304c.getLogger().a(g7.ERROR, "Failed to invoke the SentryNdk.close method.", e10);
                    d(this.f82304c);
                }
            }
        } catch (Throwable th3) {
            d(this.f82304c);
            throw th3;
        }
    }
}
