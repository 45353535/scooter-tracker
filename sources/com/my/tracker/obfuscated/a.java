package com.my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final e0 f61248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final y2 f61249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final w1 f61250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Application f61251g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f61245a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Handler f61246b = m.f61657a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f61247c = new AtomicBoolean();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f61255k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    long f61256l = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Runnable f61252h = new Runnable() { // from class: com.my.tracker.obfuscated.e3
        @Override // java.lang.Runnable
        public final void run() {
            this.f61467b.b();
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Runnable f61253i = new Runnable() { // from class: com.my.tracker.obfuscated.f3
        @Override // java.lang.Runnable
        public final void run() {
            this.f61504b.c();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Runnable f61254j = new Runnable() { // from class: com.my.tracker.obfuscated.g3
        @Override // java.lang.Runnable
        public final void run() {
            this.f61533b.d();
        }
    };

    /* JADX INFO: renamed from: com.my.tracker.obfuscated.a$a, reason: collision with other inner class name */
    protected final class C0784a implements Application.ActivityLifecycleCallbacks {
        protected C0784a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            a.this.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            a.this.c(activity);
        }
    }

    private a(e0 e0Var, y2 y2Var, w1 w1Var, Application application) {
        this.f61248d = e0Var;
        this.f61249e = y2Var;
        this.f61250f = w1Var;
        this.f61251g = application;
    }

    public void e() {
        if (this.f61247c.get()) {
            m.f(this.f61253i);
        }
    }

    void f() {
        x2.a("ActivityHandler: timer tick for buffering period");
        this.f61248d.a();
        e();
    }

    public static a a(e0 e0Var, y2 y2Var, w1 w1Var, Application application) {
        return new a(e0Var, y2Var, w1Var, application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.f61247c.get()) {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a(v2.a(this.f61249e.e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        p1.a(this.f61251g).d(v2.b(this.f61255k));
    }

    public void a() {
        this.f61251g.registerActivityLifecycleCallbacks(new C0784a());
    }

    void c(Activity activity) {
        if (this.f61245a.remove(activity) == null || !this.f61245a.isEmpty()) {
            return;
        }
        l2.d().b();
        this.f61247c.set(false);
        this.f61246b.removeCallbacks(this.f61252h);
        this.f61255k = System.currentTimeMillis();
        m.a(this.f61254j);
    }

    public void d(final Activity activity) {
        m.f(new Runnable() { // from class: com.my.tracker.obfuscated.d3
            @Override // java.lang.Runnable
            public final void run() {
                this.f61435b.a(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Activity activity) {
        if (this.f61245a.put(activity, Boolean.TRUE) != null || this.f61245a.size() > 1) {
            return;
        }
        l2.d().a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f61255k >= v2.a(this.f61249e.i())) {
            this.f61250f.c();
            if (this.f61249e.v()) {
                this.f61248d.g();
                a(v2.a(this.f61249e.e()));
                return;
            }
        }
        long j10 = this.f61256l - jCurrentTimeMillis;
        if (j10 > 0) {
            a(j10);
        } else {
            f();
        }
    }

    void a(long j10) {
        this.f61246b.removeCallbacks(this.f61252h);
        this.f61247c.set(true);
        this.f61246b.postDelayed(this.f61252h, j10);
        this.f61256l = System.currentTimeMillis() + j10;
    }
}
