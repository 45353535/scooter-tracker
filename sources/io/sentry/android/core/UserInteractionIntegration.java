package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import io.sentry.ILogger;
import io.sentry.g7;
import io.sentry.v7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class UserInteractionIntegration implements io.sentry.r1, Closeable, Application.ActivityLifecycleCallbacks, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Application f82355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.sentry.b1 f82356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SentryAndroidOptions f82357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f82358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f82359f;

    public UserInteractionIntegration(Application application, io.sentry.util.t tVar) {
        this.f82355b = (Application) io.sentry.util.w.c(application, "Application is required");
        this.f82358e = tVar.d("androidx.core.view.GestureDetectorCompat", this.f82357d);
        this.f82359f = tVar.d("androidx.lifecycle.Lifecycle", this.f82357d);
    }

    private void d(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f82357d;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(g7.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f82356c == null || this.f82357d == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new io.sentry.android.core.internal.gestures.b();
        }
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            return;
        }
        window.setCallback(new io.sentry.android.core.internal.gestures.h(callback, activity, new io.sentry.android.core.internal.gestures.g(activity, this.f82356c, this.f82357d), this.f82357d));
    }

    private void e(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f82357d;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(g7.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            io.sentry.android.core.internal.gestures.h hVar = (io.sentry.android.core.internal.gestures.h) callback;
            hVar.c();
            if (hVar.a() instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(hVar.a());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.r1
    public void c(io.sentry.b1 b1Var, v7 v7Var) {
        this.f82357d = (SentryAndroidOptions) io.sentry.util.w.c(v7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) v7Var : null, "SentryAndroidOptions is required");
        this.f82356c = (io.sentry.b1) io.sentry.util.w.c(b1Var, "Scopes are required");
        boolean z10 = this.f82357d.isEnableUserInteractionBreadcrumbs() || this.f82357d.isEnableUserInteractionTracing();
        ILogger logger = this.f82357d.getLogger();
        g7 g7Var = g7.DEBUG;
        logger.c(g7Var, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z10));
        if (z10) {
            if (!this.f82358e) {
                v7Var.getLogger().c(g7.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.f82355b.registerActivityLifecycleCallbacks(this);
            this.f82357d.getLogger().c(g7Var, "UserInteractionIntegration installed.", new Object[0]);
            io.sentry.util.o.a("UserInteraction");
            if (this.f82359f) {
                Activity activityB = d1.c().b();
                if ((activityB instanceof LifecycleOwner) && ((LifecycleOwner) activityB).getLifecycle().getState() == Lifecycle.State.RESUMED) {
                    d(activityB);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f82355b.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f82357d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(g7.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        d(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
