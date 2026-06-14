package v2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.d0;
import com.facebook.internal.e;
import com.facebook.internal.r;
import com.facebook.internal.z;
import com.facebook.s;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f105685a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f105686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ScheduledExecutorService f105687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ScheduledExecutorService f105688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile ScheduledFuture f105689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f105690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicInteger f105691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile n f105692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicBoolean f105693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f105694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static long f105695k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f105696l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static WeakReference f105697m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static String f105698n;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            r.f19964e.b(d0.APP_EVENTS, g.f105686b, "onActivityCreated");
            h.a();
            g.q(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            r.f19964e.b(d0.APP_EVENTS, g.f105686b, "onActivityDestroyed");
            g.f105685a.s(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            r.f19964e.b(d0.APP_EVENTS, g.f105686b, "onActivityPaused");
            h.a();
            g.f105685a.t(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            r.f19964e.b(d0.APP_EVENTS, g.f105686b, "onActivityResumed");
            h.a();
            g.w(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
            r.f19964e.b(d0.APP_EVENTS, g.f105686b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            g.f105696l++;
            r.f19964e.b(d0.APP_EVENTS, g.f105686b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            r.f19964e.b(d0.APP_EVENTS, g.f105686b, "onActivityStopped");
            com.facebook.appevents.o.f19698b.g();
            g.f105696l--;
        }
    }

    static {
        String canonicalName = g.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f105686b = canonicalName;
        f105687c = Executors.newSingleThreadScheduledExecutor();
        f105688d = Executors.newSingleThreadScheduledExecutor();
        f105690f = new Object();
        f105691g = new AtomicInteger(0);
        f105693i = new AtomicBoolean(false);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(boolean z10) {
        if (z10) {
            m2.e.f();
        } else {
            m2.e.e();
        }
    }

    private final void l() {
        ScheduledFuture scheduledFuture;
        synchronized (f105690f) {
            try {
                if (f105689e != null && (scheduledFuture = f105689e) != null) {
                    scheduledFuture.cancel(false);
                }
                f105689e = null;
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final Activity m() {
        WeakReference weakReference = f105697m;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public static final UUID n() {
        n nVar;
        if (f105692h == null || (nVar = f105692h) == null) {
            return null;
        }
        return nVar.d();
    }

    private final int o() {
        com.facebook.internal.i iVarF = com.facebook.internal.m.f(s.n());
        return iVarF == null ? l.a() : iVarF.t();
    }

    public static final boolean p() {
        return f105696l == 0;
    }

    public static final void q(Activity activity) {
        f105687c.execute(new Runnable() { // from class: v2.e
            @Override // java.lang.Runnable
            public final void run() {
                g.r();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r() {
        if (f105692h == null) {
            f105692h = n.f105720g.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Activity activity) {
        m2.e.j(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(Activity activity) {
        AtomicInteger atomicInteger = f105691g;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(f105686b, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        l();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String strS = z.s(activity);
        m2.e.k(activity);
        f105687c.execute(new Runnable() { // from class: v2.d
            @Override // java.lang.Runnable
            public final void run() {
                g.u(jCurrentTimeMillis, strS);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(final long j10, final String activityName) {
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        if (f105692h == null) {
            f105692h = new n(Long.valueOf(j10), null, null, 4, null);
        }
        n nVar = f105692h;
        if (nVar != null) {
            nVar.k(Long.valueOf(j10));
        }
        if (f105691g.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: v2.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.v(j10, activityName);
                }
            };
            synchronized (f105690f) {
                f105689e = f105687c.schedule(runnable, f105685a.o(), TimeUnit.SECONDS);
                Unit unit = Unit.f93236a;
            }
        }
        long j11 = f105695k;
        k.i(activityName, j11 > 0 ? (j10 - j11) / ((long) 1000) : 0L);
        n nVar2 = f105692h;
        if (nVar2 != null) {
            nVar2.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(long j10, String activityName) {
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        if (f105692h == null) {
            f105692h = new n(Long.valueOf(j10), null, null, 4, null);
        }
        if (f105691g.get() <= 0) {
            o.d(activityName, f105692h, f105694j);
            n.f105720g.a();
            f105692h = null;
        }
        synchronized (f105690f) {
            f105689e = null;
            Unit unit = Unit.f93236a;
        }
    }

    public static final void w(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f105697m = new WeakReference(activity);
        f105691g.incrementAndGet();
        f105685a.l();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        f105695k = jCurrentTimeMillis;
        final String strS = z.s(activity);
        m2.e.l(activity);
        k2.b.d(activity);
        z2.e.h(activity);
        String str = f105698n;
        if (str != null && StringsKt.g0(str, "ProxyBillingActivity", false, 2, null) && !Intrinsics.areEqual(strS, "ProxyBillingActivity")) {
            f105688d.execute(new Runnable() { // from class: v2.b
                @Override // java.lang.Runnable
                public final void run() {
                    g.x();
                }
            });
        }
        final Context applicationContext = activity.getApplicationContext();
        f105687c.execute(new Runnable() { // from class: v2.c
            @Override // java.lang.Runnable
            public final void run() {
                g.y(jCurrentTimeMillis, strS, applicationContext);
            }
        });
        f105698n = strS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x() {
        t2.s.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(long j10, String activityName, Context appContext) {
        n nVar;
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        n nVar2 = f105692h;
        Long lE = nVar2 != null ? nVar2.e() : null;
        if (f105692h == null) {
            f105692h = new n(Long.valueOf(j10), null, null, 4, null);
            String str = f105694j;
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            o.b(activityName, null, str, appContext);
        } else if (lE != null) {
            long jLongValue = j10 - lE.longValue();
            if (jLongValue > f105685a.o() * 1000) {
                o.d(activityName, f105692h, f105694j);
                String str2 = f105694j;
                Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                o.b(activityName, null, str2, appContext);
                f105692h = new n(Long.valueOf(j10), null, null, 4, null);
            } else if (jLongValue > 1000 && (nVar = f105692h) != null) {
                nVar.h();
            }
        }
        n nVar3 = f105692h;
        if (nVar3 != null) {
            nVar3.k(Long.valueOf(j10));
        }
        n nVar4 = f105692h;
        if (nVar4 != null) {
            nVar4.m();
        }
    }

    public static final void z(Application application, String str) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (f105693i.compareAndSet(false, true)) {
            com.facebook.internal.e.a(e.b.CodelessEvents, new e.a() { // from class: v2.a
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    g.A(z10);
                }
            });
            f105694j = str;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }
}
