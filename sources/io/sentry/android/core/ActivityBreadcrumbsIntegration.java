package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.ironsource.C4240b4;
import io.sentry.ILogger;
import io.sentry.g7;
import io.sentry.v7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityBreadcrumbsIntegration implements io.sentry.r1, Closeable, Application.ActivityLifecycleCallbacks, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Application f82236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.sentry.b1 f82237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f82238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.util.a f82239e = new io.sentry.util.a();

    public ActivityBreadcrumbsIntegration(Application application) {
        this.f82236b = (Application) io.sentry.util.w.c(application, "Application is required");
    }

    private void d(Activity activity, String str) {
        if (this.f82237c == null) {
            return;
        }
        io.sentry.e eVar = new io.sentry.e();
        eVar.y(NotificationCompat.CATEGORY_NAVIGATION);
        eVar.v("state", str);
        eVar.v("screen", e(activity));
        eVar.u("ui.lifecycle");
        eVar.w(g7.INFO);
        io.sentry.i0 i0Var = new io.sentry.i0();
        i0Var.k("android:activity", activity);
        this.f82237c.a(eVar, i0Var);
    }

    private String e(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    @Override // io.sentry.r1
    public void c(io.sentry.b1 b1Var, v7 v7Var) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(v7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) v7Var : null, "SentryAndroidOptions is required");
        this.f82237c = (io.sentry.b1) io.sentry.util.w.c(b1Var, "Scopes are required");
        this.f82238d = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        ILogger logger = v7Var.getLogger();
        g7 g7Var = g7.DEBUG;
        logger.c(g7Var, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f82238d));
        if (this.f82238d) {
            this.f82236b.registerActivityLifecycleCallbacks(this);
            v7Var.getLogger().c(g7Var, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            io.sentry.util.o.a("ActivityBreadcrumbs");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f82238d) {
            this.f82236b.unregisterActivityLifecycleCallbacks(this);
            io.sentry.b1 b1Var = this.f82237c;
            if (b1Var != null) {
                b1Var.getOptions().getLogger().c(g7.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.g1 g1VarD = this.f82239e.d();
        try {
            d(activity, "created");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        io.sentry.g1 g1VarD = this.f82239e.d();
        try {
            d(activity, "destroyed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        io.sentry.g1 g1VarD = this.f82239e.d();
        try {
            d(activity, C4240b4.i.f42623e0);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        io.sentry.g1 g1VarD = this.f82239e.d();
        try {
            d(activity, "resumed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        io.sentry.g1 g1VarD = this.f82239e.d();
        try {
            d(activity, "saveInstanceState");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        io.sentry.g1 g1VarD = this.f82239e.d();
        try {
            d(activity, C4240b4.i.f42621d0);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        io.sentry.g1 g1VarD = this.f82239e.d();
        try {
            d(activity, C4240b4.i.f42629h0);
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
}
