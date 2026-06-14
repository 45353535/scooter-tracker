package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import androidx.core.app.NotificationCompat;
import com.ironsource.C4240b4;
import io.sentry.ILogger;
import io.sentry.g7;
import io.sentry.protocol.e;
import io.sentry.v7;
import java.io.Closeable;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class AppComponentsBreadcrumbsIntegration implements io.sentry.r1, Closeable, ComponentCallbacks2, AutoCloseable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final io.sentry.i0 f82282f = new io.sentry.i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f82283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.sentry.b1 f82284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SentryAndroidOptions f82285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.o f82286e = new io.sentry.android.core.internal.util.o(io.sentry.android.core.internal.util.h.a(), 60000, 0);

    public AppComponentsBreadcrumbsIntegration(Context context) {
        this.f82283b = (Context) io.sentry.util.w.c(c1.f(context), "Context is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(long j10, Configuration configuration) {
        if (this.f82284c != null) {
            e.b bVarA = io.sentry.android.core.internal.util.p.a(this.f82283b.getResources().getConfiguration().orientation);
            String lowerCase = bVarA != null ? bVarA.name().toLowerCase(Locale.ROOT) : "undefined";
            io.sentry.e eVar = new io.sentry.e(j10);
            eVar.y(NotificationCompat.CATEGORY_NAVIGATION);
            eVar.u("device.orientation");
            eVar.v(C4240b4.i.L, lowerCase);
            eVar.w(g7.INFO);
            io.sentry.i0 i0Var = new io.sentry.i0();
            i0Var.k("android:configuration", configuration);
            this.f82284c.a(eVar, i0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(long j10, int i10) {
        if (this.f82284c != null) {
            io.sentry.e eVar = new io.sentry.e(j10);
            eVar.y("system");
            eVar.u("device.event");
            eVar.x("Low memory");
            eVar.v("action", "LOW_MEMORY");
            eVar.v("level", Integer.valueOf(i10));
            eVar.w(g7.WARNING);
            this.f82284c.a(eVar, f82282f);
        }
    }

    private void m(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f82285d;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th2) {
                this.f82285d.getLogger().b(g7.ERROR, th2, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // io.sentry.r1
    public void c(io.sentry.b1 b1Var, v7 v7Var) {
        this.f82284c = (io.sentry.b1) io.sentry.util.w.c(b1Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(v7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) v7Var : null, "SentryAndroidOptions is required");
        this.f82285d = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        g7 g7Var = g7.DEBUG;
        logger.c(g7Var, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f82285d.isEnableAppComponentBreadcrumbs()));
        if (this.f82285d.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f82283b.registerComponentCallbacks(this);
                v7Var.getLogger().c(g7Var, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.util.o.a("AppComponentsBreadcrumbs");
            } catch (Throwable th2) {
                this.f82285d.setEnableAppComponentBreadcrumbs(false);
                v7Var.getLogger().b(g7.INFO, th2, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f82283b.unregisterComponentCallbacks(this);
        } catch (Throwable th2) {
            SentryAndroidOptions sentryAndroidOptions = this.f82285d;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().b(g7.DEBUG, th2, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f82285d;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().c(g7.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(final Configuration configuration) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        m(new Runnable() { // from class: io.sentry.android.core.s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f82745b.f(jCurrentTimeMillis, configuration);
            }
        });
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(final int i10) {
        if (i10 >= 40 && !this.f82286e.a()) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            m(new Runnable() { // from class: io.sentry.android.core.t0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82759b.h(jCurrentTimeMillis, i10);
                }
            });
        }
    }
}
