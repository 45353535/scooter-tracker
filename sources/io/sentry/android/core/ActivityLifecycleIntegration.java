package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.U2;
import io.sentry.android.core.performance.h;
import io.sentry.d9;
import io.sentry.e9;
import io.sentry.f9;
import io.sentry.g7;
import io.sentry.g9;
import io.sentry.h0;
import io.sentry.h2;
import io.sentry.h3;
import io.sentry.h4;
import io.sentry.j4;
import io.sentry.n7;
import io.sentry.s5;
import io.sentry.v7;
import io.sentry.v8;
import io.sentry.w8;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityLifecycleIntegration implements io.sentry.r1, Closeable, Application.ActivityLifecycleCallbacks, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Application f82240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w0 f82241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.b1 f82242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SentryAndroidOptions f82243e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f82246h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private io.sentry.j1 f82249k;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final i f82256r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f82244f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f82245g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f82247i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private io.sentry.h0 f82248j = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final WeakHashMap f82250l = new WeakHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final WeakHashMap f82251m = new WeakHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WeakHashMap f82252n = new WeakHashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private s5 f82253o = new n7(new Date(0), 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Future f82254p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final WeakHashMap f82255q = new WeakHashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final io.sentry.util.a f82257s = new io.sentry.util.a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f82258t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final io.sentry.util.a f82259u = new io.sentry.util.a();

    public ActivityLifecycleIntegration(Application application, w0 w0Var, i iVar) {
        this.f82240b = (Application) io.sentry.util.w.c(application, "Application is required");
        this.f82241c = (w0) io.sentry.util.w.c(w0Var, "BuildInfoProvider is required");
        this.f82256r = (i) io.sentry.util.w.c(iVar, "ActivityFramesTracker is required");
        if (w0Var.d() >= 29) {
            this.f82246h = true;
        }
    }

    private void A0(v8 v8Var) {
        v8Var.g("auto.ui.activity");
    }

    private void B0(Activity activity) {
        Boolean boolValueOf;
        s5 s5Var;
        s5 s5Var2;
        final io.sentry.l1 l1Var;
        v8 v8Var;
        final WeakReference weakReference = new WeakReference(activity);
        if (this.f82242d == null || y0(activity)) {
            return;
        }
        if (!this.f82244f) {
            this.f82255q.put(activity, h3.s());
            if (this.f82243e.isEnableAutoTraceIdGeneration()) {
                io.sentry.util.h0.h(this.f82242d);
                return;
            }
            return;
        }
        C0();
        final String strI0 = i0(activity);
        io.sentry.android.core.performance.i iVarL = io.sentry.android.core.performance.h.p().l(this.f82243e);
        d9 d9Var = null;
        if (c1.r() && iVarL.m()) {
            s5 s5VarG = iVarL.g();
            boolValueOf = Boolean.valueOf(io.sentry.android.core.performance.h.p().m() == h.a.COLD);
            s5Var = s5VarG;
        } else {
            boolValueOf = null;
            s5Var = null;
        }
        g9 g9Var = new g9();
        long deadlineTimeout = this.f82243e.getDeadlineTimeout();
        g9Var.s(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
        if (this.f82243e.isEnableActivityLifecycleTracingAutoFinish()) {
            g9Var.t(this.f82243e.getIdleTimeout());
            g9Var.i(true);
        }
        g9Var.v(true);
        g9Var.u(new f9() { // from class: io.sentry.android.core.p
            @Override // io.sentry.f9
            public final void a(io.sentry.l1 l1Var2) {
                ActivityLifecycleIntegration.o(this.f82691a, weakReference, strI0, l1Var2);
            }
        });
        if (this.f82247i || s5Var == null || boolValueOf == null) {
            s5Var2 = this.f82253o;
        } else {
            d9 d9VarJ = io.sentry.android.core.performance.h.p().j();
            io.sentry.android.core.performance.h.p().w(null);
            d9Var = d9VarJ;
            s5Var2 = s5Var;
        }
        g9Var.h(s5Var2);
        g9Var.r(d9Var != null);
        A0(g9Var);
        io.sentry.l1 l1VarA = this.f82242d.A(new e9(strI0, io.sentry.protocol.h0.COMPONENT, "ui.load", d9Var), g9Var);
        v8 v8Var2 = new v8();
        A0(v8Var2);
        if (this.f82247i || s5Var == null || boolValueOf == null) {
            l1Var = l1VarA;
            v8Var = v8Var2;
        } else {
            l1Var = l1VarA;
            v8Var = v8Var2;
            this.f82249k = l1Var.p(r0(boolValueOf.booleanValue()), n0(boolValueOf.booleanValue()), s5Var, io.sentry.q1.SENTRY, v8Var2);
            M();
        }
        String strU0 = u0(strI0);
        io.sentry.q1 q1Var = io.sentry.q1.SENTRY;
        s5 s5Var3 = s5Var2;
        final io.sentry.j1 j1VarP = l1Var.p("ui.load.initial_display", strU0, s5Var3, q1Var, v8Var);
        this.f82250l.put(activity, j1VarP);
        if (this.f82245g && this.f82248j != null && this.f82243e != null) {
            final io.sentry.j1 j1VarP2 = l1Var.p("ui.load.full_display", t0(strI0), s5Var3, q1Var, v8Var);
            try {
                this.f82251m.put(activity, j1VarP2);
                this.f82254p = this.f82243e.getExecutorService().schedule(new Runnable() { // from class: io.sentry.android.core.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f82730b.R(j1VarP2, j1VarP);
                    }
                }, U2.f41836h);
            } catch (RejectedExecutionException e10) {
                this.f82243e.getLogger().a(g7.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e10);
            }
        }
        this.f82242d.x(new j4() { // from class: io.sentry.android.core.r
            @Override // io.sentry.j4
            public final void a(io.sentry.y0 y0Var) {
                this.f82734a.s(y0Var, l1Var);
            }
        });
        this.f82255q.put(activity, l1Var);
    }

    private void C0() {
        for (Map.Entry entry : this.f82255q.entrySet()) {
            e0((io.sentry.l1) entry.getValue(), (io.sentry.j1) this.f82250l.get(entry.getKey()), (io.sentry.j1) this.f82251m.get(entry.getKey()));
        }
    }

    private void D0(Activity activity, boolean z10) {
        if (this.f82244f && z10) {
            e0((io.sentry.l1) this.f82255q.get(activity), null, null);
        }
    }

    private void M() {
        s5 s5VarD = io.sentry.android.core.performance.h.p().l(this.f82243e).d();
        if (!this.f82244f || s5VarD == null) {
            return;
        }
        V(this.f82249k, s5VarD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(io.sentry.j1 j1Var, io.sentry.j1 j1Var2) {
        if (j1Var == null || j1Var.g()) {
            return;
        }
        j1Var.h(s0(j1Var));
        s5 s5VarQ = j1Var2 != null ? j1Var2.q() : null;
        if (s5VarQ == null) {
            s5VarQ = j1Var.r();
        }
        W(j1Var, s5VarQ, w8.DEADLINE_EXCEEDED);
    }

    private void U(io.sentry.j1 j1Var) {
        if (j1Var == null || j1Var.g()) {
            return;
        }
        j1Var.finish();
    }

    private void V(io.sentry.j1 j1Var, s5 s5Var) {
        W(j1Var, s5Var, null);
    }

    private void W(io.sentry.j1 j1Var, s5 s5Var, w8 w8Var) {
        if (j1Var == null || j1Var.g()) {
            return;
        }
        if (w8Var == null) {
            w8Var = j1Var.getStatus() != null ? j1Var.getStatus() : w8.OK;
        }
        j1Var.f(w8Var, s5Var);
    }

    private void b0(io.sentry.j1 j1Var, w8 w8Var) {
        if (j1Var == null || j1Var.g()) {
            return;
        }
        j1Var.l(w8Var);
    }

    private void e0(final io.sentry.l1 l1Var, io.sentry.j1 j1Var, io.sentry.j1 j1Var2) {
        if (l1Var == null || l1Var.g()) {
            return;
        }
        b0(j1Var, w8.DEADLINE_EXCEEDED);
        R(j1Var2, j1Var);
        w();
        w8 status = l1Var.getStatus();
        if (status == null) {
            status = w8.OK;
        }
        l1Var.l(status);
        io.sentry.b1 b1Var = this.f82242d;
        if (b1Var != null) {
            b1Var.x(new j4() { // from class: io.sentry.android.core.n
                @Override // io.sentry.j4
                public final void a(io.sentry.y0 y0Var) {
                    this.f82677a.z(y0Var, l1Var);
                }
            });
        }
    }

    public static /* synthetic */ void h(ActivityLifecycleIntegration activityLifecycleIntegration, io.sentry.y0 y0Var, io.sentry.l1 l1Var, io.sentry.l1 l1Var2) {
        if (l1Var2 == null) {
            activityLifecycleIntegration.getClass();
            y0Var.l(l1Var);
        } else {
            SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f82243e;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(g7.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", l1Var.getName());
            }
        }
    }

    private String i0(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private String n0(boolean z10) {
        return z10 ? "Cold Start" : "Warm Start";
    }

    public static /* synthetic */ void o(ActivityLifecycleIntegration activityLifecycleIntegration, WeakReference weakReference, String str, io.sentry.l1 l1Var) {
        activityLifecycleIntegration.getClass();
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            activityLifecycleIntegration.f82256r.k(activity, l1Var.getEventId());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f82243e;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(g7.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    public static /* synthetic */ void p(io.sentry.l1 l1Var, io.sentry.y0 y0Var, io.sentry.l1 l1Var2) {
        if (l1Var2 == l1Var) {
            y0Var.m();
        }
    }

    private String r0(boolean z10) {
        return z10 ? "app.start.cold" : "app.start.warm";
    }

    private String s0(io.sentry.j1 j1Var) {
        String description = j1Var.getDescription();
        if (description != null && description.endsWith(" - Deadline Exceeded")) {
            return description;
        }
        return j1Var.getDescription() + " - Deadline Exceeded";
    }

    private String t0(String str) {
        return str + " full display";
    }

    private String u0(String str) {
        return str + " initial display";
    }

    private void w() {
        Future future = this.f82254p;
        if (future != null) {
            future.cancel(false);
            this.f82254p = null;
        }
    }

    private boolean x0(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    private void y() {
        this.f82247i = false;
        this.f82253o = new n7(new Date(0L), 0L);
        this.f82252n.clear();
    }

    private boolean y0(Activity activity) {
        return this.f82255q.containsKey(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(io.sentry.j1 j1Var, io.sentry.j1 j1Var2) {
        io.sentry.android.core.performance.h hVarP = io.sentry.android.core.performance.h.p();
        io.sentry.android.core.performance.i iVarK = hVarP.k();
        io.sentry.android.core.performance.i iVarQ = hVarP.q();
        if (iVarK.m() && iVarK.l()) {
            iVarK.s();
        }
        if (iVarQ.m() && iVarQ.l()) {
            iVarQ.s();
        }
        M();
        io.sentry.g1 g1VarD = this.f82259u.d();
        try {
            SentryAndroidOptions sentryAndroidOptions = this.f82243e;
            if (sentryAndroidOptions == null || j1Var2 == null) {
                U(j1Var2);
                if (this.f82258t) {
                    U(j1Var);
                }
            } else {
                s5 s5VarA = sentryAndroidOptions.getDateProvider().a();
                long millis = TimeUnit.NANOSECONDS.toMillis(s5VarA.c(j1Var2.r()));
                Long lValueOf = Long.valueOf(millis);
                h2.a aVar = h2.a.MILLISECOND;
                j1Var2.m("time_to_initial_display", lValueOf, aVar);
                if (j1Var != null && this.f82258t) {
                    this.f82258t = false;
                    j1Var2.m("time_to_full_display", Long.valueOf(millis), aVar);
                    j1Var.m("time_to_full_display", Long.valueOf(millis), aVar);
                    V(j1Var, s5VarA);
                }
                V(j1Var2, s5VarA);
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

    @Override // io.sentry.r1
    public void c(io.sentry.b1 b1Var, v7 v7Var) {
        this.f82243e = (SentryAndroidOptions) io.sentry.util.w.c(v7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) v7Var : null, "SentryAndroidOptions is required");
        this.f82242d = (io.sentry.b1) io.sentry.util.w.c(b1Var, "Scopes are required");
        this.f82244f = x0(this.f82243e);
        this.f82248j = this.f82243e.getFullyDisplayedReporter();
        this.f82245g = this.f82243e.isEnableTimeToFullDisplayTracing();
        this.f82240b.registerActivityLifecycleCallbacks(this);
        this.f82243e.getLogger().c(g7.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        io.sentry.util.o.a("ActivityLifecycle");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f82240b.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f82243e;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(g7.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.f82256r.m();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.h0 h0Var;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.f82246h) {
            onActivityPreCreated(activity, bundle);
        }
        io.sentry.g1 g1VarD = this.f82257s.d();
        try {
            if (this.f82242d != null && (sentryAndroidOptions = this.f82243e) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                final String strA = io.sentry.android.core.internal.util.m.a(activity);
                this.f82242d.x(new j4() { // from class: io.sentry.android.core.j
                    @Override // io.sentry.j4
                    public final void a(io.sentry.y0 y0Var) {
                        y0Var.q(strA);
                    }
                });
            }
            B0(activity);
            final io.sentry.j1 j1Var = (io.sentry.j1) this.f82250l.get(activity);
            final io.sentry.j1 j1Var2 = (io.sentry.j1) this.f82251m.get(activity);
            this.f82247i = true;
            if (this.f82244f && j1Var != null && j1Var2 != null && (h0Var = this.f82248j) != null) {
                h0Var.b(new h0.a() { // from class: io.sentry.android.core.k
                });
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        io.sentry.g1 g1VarD = this.f82257s.d();
        try {
            io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f82252n.remove(activity);
            if (bVar != null) {
                bVar.a();
            }
            if (this.f82244f) {
                b0(this.f82249k, w8.CANCELLED);
                io.sentry.j1 j1Var = (io.sentry.j1) this.f82250l.get(activity);
                io.sentry.j1 j1Var2 = (io.sentry.j1) this.f82251m.get(activity);
                b0(j1Var, w8.DEADLINE_EXCEEDED);
                R(j1Var2, j1Var);
                w();
                D0(activity, true);
                this.f82249k = null;
                this.f82250l.remove(activity);
                this.f82251m.remove(activity);
            }
            this.f82255q.remove(activity);
            if (this.f82255q.isEmpty() && !activity.isChangingConfigurations()) {
                y();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        io.sentry.g1 g1VarD = this.f82257s.d();
        try {
            if (!this.f82246h) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f82252n.get(activity);
        if (bVar != null) {
            io.sentry.j1 j1Var = this.f82249k;
            if (j1Var == null) {
                j1Var = (io.sentry.j1) this.f82255q.get(activity);
            }
            bVar.b(j1Var);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f82252n.get(activity);
        if (bVar != null) {
            io.sentry.j1 j1Var = this.f82249k;
            if (j1Var == null) {
                j1Var = (io.sentry.j1) this.f82255q.get(activity);
            }
            bVar.c(j1Var);
            bVar.e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b(activity.getClass().getName());
        this.f82252n.put(activity, bVar);
        if (this.f82247i) {
            return;
        }
        io.sentry.b1 b1Var = this.f82242d;
        s5 s5VarA = b1Var != null ? b1Var.getOptions().getDateProvider().a() : x.a();
        this.f82253o = s5VarA;
        bVar.g(s5VarA);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        this.f82247i = true;
        io.sentry.b1 b1Var = this.f82242d;
        this.f82253o = b1Var != null ? b1Var.getOptions().getDateProvider().a() : x.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(Activity activity) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f82252n.get(activity);
        if (bVar != null) {
            SentryAndroidOptions sentryAndroidOptions = this.f82243e;
            bVar.h(sentryAndroidOptions != null ? sentryAndroidOptions.getDateProvider().a() : x.a());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        io.sentry.g1 g1VarD = this.f82257s.d();
        try {
            if (!this.f82246h) {
                onActivityPostStarted(activity);
            }
            if (this.f82244f) {
                final io.sentry.j1 j1Var = (io.sentry.j1) this.f82250l.get(activity);
                final io.sentry.j1 j1Var2 = (io.sentry.j1) this.f82251m.get(activity);
                if (activity.getWindow() != null) {
                    io.sentry.android.core.internal.util.s.d(activity, new Runnable() { // from class: io.sentry.android.core.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f82628b.z0(j1Var2, j1Var);
                        }
                    }, this.f82241c);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f82663b.z0(j1Var2, j1Var);
                        }
                    });
                }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        io.sentry.g1 g1VarD = this.f82257s.d();
        try {
            if (!this.f82246h) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.f82244f) {
                this.f82256r.f(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(final io.sentry.y0 y0Var, final io.sentry.l1 l1Var) {
        y0Var.E(new h4.c() { // from class: io.sentry.android.core.s
            @Override // io.sentry.h4.c
            public final void a(io.sentry.l1 l1Var2) {
                ActivityLifecycleIntegration.h(this.f82742a, y0Var, l1Var, l1Var2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(final io.sentry.y0 y0Var, final io.sentry.l1 l1Var) {
        y0Var.E(new h4.c() { // from class: io.sentry.android.core.o
            @Override // io.sentry.h4.c
            public final void a(io.sentry.l1 l1Var2) {
                ActivityLifecycleIntegration.p(l1Var, y0Var, l1Var2);
            }
        });
    }
}
