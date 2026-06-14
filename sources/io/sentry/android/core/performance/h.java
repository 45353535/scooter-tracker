package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.c1;
import io.sentry.android.core.d1;
import io.sentry.android.core.internal.util.s;
import io.sentry.android.core.w0;
import io.sentry.d9;
import io.sentry.g1;
import io.sentry.m1;
import io.sentry.o0;
import io.sentry.p2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class h extends io.sentry.android.core.performance.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile h f82709q;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static long f82708p = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final io.sentry.util.a f82710r = new io.sentry.util.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f82711b = a.UNKNOWN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m1 f82718i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private o0 f82719j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d9 f82720k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f82721l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f82722m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicInteger f82723n = new AtomicInteger();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f82724o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f82713d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f82714e = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f82715f = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f82716g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f82717h = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f82712c = c1.r();

    public enum a {
        UNKNOWN,
        COLD,
        WARM
    }

    public static /* synthetic */ void a(h hVar) {
        if (hVar.f82723n.get() == 0) {
            hVar.f82712c = false;
            m1 m1Var = hVar.f82718i;
            if (m1Var != null && m1Var.isRunning()) {
                hVar.f82718i.close();
                hVar.f82718i = null;
            }
            o0 o0Var = hVar.f82719j;
            if (o0Var == null || !o0Var.isRunning()) {
                return;
            }
            hVar.f82719j.b(true);
            hVar.f82719j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.g
            @Override // java.lang.Runnable
            public final void run() {
                h.a(this.f82707b);
            }
        });
    }

    public static h p() {
        if (f82709q == null) {
            g1 g1VarD = f82710r.d();
            try {
                if (f82709q == null) {
                    f82709q = new h();
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
        return f82709q;
    }

    public void e(c cVar) {
        this.f82717h.add(cVar);
    }

    public i g() {
        i iVar = new i();
        iVar.q("Process Initialization", this.f82713d.h(), this.f82713d.j(), f82708p);
        return iVar;
    }

    public o0 h() {
        return this.f82719j;
    }

    public m1 i() {
        return this.f82718i;
    }

    public d9 j() {
        return this.f82720k;
    }

    public i k() {
        return this.f82713d;
    }

    public i l(SentryAndroidOptions sentryAndroidOptions) {
        if (this.f82711b != a.UNKNOWN && this.f82712c) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                i iVarK = k();
                if (iVarK.m() && iVarK.c() <= TimeUnit.MINUTES.toMillis(1L)) {
                    return iVarK;
                }
            }
            i iVarQ = q();
            if (iVarQ.m() && iVarQ.c() <= TimeUnit.MINUTES.toMillis(1L)) {
                return iVarQ;
            }
        }
        return new i();
    }

    public a m() {
        return this.f82711b;
    }

    public i n() {
        return this.f82715f;
    }

    public List o() {
        ArrayList arrayList = new ArrayList(this.f82716g.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        d1.c().d(activity);
        if (this.f82723n.incrementAndGet() == 1 && !this.f82724o.get()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j10 = jUptimeMillis - this.f82713d.j();
            if (!this.f82712c || j10 > TimeUnit.MINUTES.toMillis(1L)) {
                this.f82711b = a.WARM;
                this.f82722m = true;
                this.f82713d.o();
                this.f82713d.r();
                this.f82713d.p(jUptimeMillis);
                f82708p = jUptimeMillis;
                this.f82716g.clear();
                this.f82715f.o();
            } else {
                this.f82711b = bundle == null ? a.COLD : a.WARM;
            }
        }
        this.f82712c = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        d1.c().a(activity);
        if (this.f82723n.decrementAndGet() != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.f82712c = false;
        this.f82722m = true;
        this.f82724o.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        d1.c().a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        d1.c().d(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        d1.c().d(activity);
        if (this.f82724o.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            s.d(activity, new Runnable() { // from class: io.sentry.android.core.performance.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82705b.s();
                }
            }, new w0(p2.e()));
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82706b.s();
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d1.c().a(activity);
    }

    public i q() {
        return this.f82714e;
    }

    public void r() {
        this.f82722m = false;
        this.f82716g.clear();
        this.f82717h.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void s() {
        if (!this.f82724o.getAndSet(true)) {
            h hVarP = p();
            hVarP.q().s();
            hVarP.k().s();
        }
    }

    public void t(Application application) {
        if (this.f82721l) {
            return;
        }
        boolean z10 = true;
        this.f82721l = true;
        if (!this.f82712c && !c1.r()) {
            z10 = false;
        }
        this.f82712c = z10;
        application.registerActivityLifecycleCallbacks(f82709q);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f82704b.f();
            }
        });
    }

    public void u(o0 o0Var) {
        this.f82719j = o0Var;
    }

    public void v(m1 m1Var) {
        this.f82718i = m1Var;
    }

    public void w(d9 d9Var) {
        this.f82720k = d9Var;
    }

    public boolean x() {
        return this.f82722m && this.f82712c;
    }
}
