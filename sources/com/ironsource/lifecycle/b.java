package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.EnumC4398ka;
import com.ironsource.InterfaceC4381ja;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.lifecycle.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final b f43580m = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static AtomicBoolean f43581n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final long f43582o = 700;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43583a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43584b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43585c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f43586d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EnumC4398ka f43587e = EnumC4398ka.NONE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<InterfaceC4381ja> f43588f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f43589g = new Runnable() { // from class: com.ironsource.lifecycle.c
        @Override // java.lang.Runnable
        public final void run() {
            this.f43596b.f();
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f43590h = new Runnable() { // from class: com.ironsource.lifecycle.d
        @Override // java.lang.Runnable
        public final void run() {
            this.f43597b.g();
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f43591i = new Runnable() { // from class: com.ironsource.lifecycle.e
        @Override // java.lang.Runnable
        public final void run() {
            this.f43598b.h();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f43592j = new Runnable() { // from class: com.ironsource.lifecycle.f
        @Override // java.lang.Runnable
        public final void run() {
            this.f43599b.i();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f43593k = new Runnable() { // from class: com.ironsource.lifecycle.g
        @Override // java.lang.Runnable
        public final void run() {
            this.f43600b.j();
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a.InterfaceC0467a f43594l = new a();

    class a implements a.InterfaceC0467a {
        a() {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0467a
        public void a(Activity activity) {
            b.this.c(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0467a
        public void b(Activity activity) {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0467a
        public void onResume(Activity activity) {
            b.this.b(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        a();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Iterator<InterfaceC4381ja> it = this.f43588f.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        Iterator<InterfaceC4381ja> it = this.f43588f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        Iterator<InterfaceC4381ja> it = this.f43588f.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        Iterator<InterfaceC4381ja> it = this.f43588f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        com.ironsource.lifecycle.a.b(activity);
        com.ironsource.lifecycle.a aVarA = com.ironsource.lifecycle.a.a(activity);
        if (aVarA != null) {
            aVarA.d(this.f43594l);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d(activity);
    }

    public static b d() {
        return f43580m;
    }

    public void a(InterfaceC4381ja interfaceC4381ja) {
        if (!IronsourceLifecycleProvider.a() || interfaceC4381ja == null || this.f43588f.contains(interfaceC4381ja)) {
            return;
        }
        this.f43588f.add(interfaceC4381ja);
    }

    public void b(InterfaceC4381ja interfaceC4381ja) {
        if (this.f43588f.contains(interfaceC4381ja)) {
            this.f43588f.remove(interfaceC4381ja);
        }
    }

    public EnumC4398ka c() {
        return this.f43587e;
    }

    public boolean e() {
        return this.f43587e == EnumC4398ka.STOPPED;
    }

    void c(Activity activity) {
        int i10 = this.f43583a + 1;
        this.f43583a = i10;
        if (i10 == 1 && this.f43586d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f43593k);
            this.f43586d = false;
            this.f43587e = EnumC4398ka.STARTED;
        }
    }

    void d(Activity activity) {
        this.f43583a--;
        b();
    }

    void b(Activity activity) {
        int i10 = this.f43584b + 1;
        this.f43584b = i10;
        if (i10 == 1) {
            if (this.f43585c) {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f43592j);
                this.f43585c = false;
                this.f43587e = EnumC4398ka.RESUMED;
                return;
            }
            IronSourceThreadManager.INSTANCE.removeUiThreadTask(this.f43589g);
        }
    }

    void a(Context context) {
        Application application;
        if (!f43581n.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    void a(Activity activity) {
        int i10 = this.f43584b - 1;
        this.f43584b = i10;
        if (i10 == 0) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(this.f43589g, 700L);
        }
    }

    private void a() {
        if (this.f43584b == 0) {
            this.f43585c = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f43590h);
            this.f43587e = EnumC4398ka.PAUSED;
        }
    }

    private void b() {
        if (this.f43583a == 0 && this.f43585c) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f43591i);
            this.f43586d = true;
            this.f43587e = EnumC4398ka.STOPPED;
        }
    }
}
