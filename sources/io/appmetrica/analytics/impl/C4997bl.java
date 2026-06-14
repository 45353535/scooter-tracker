package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4997bl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5308o f76919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5438t5 f76920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActivityLifecycleListener f76921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActivityLifecycleListener f76922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5358q f76923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5258m f76924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f76925g;

    public C4997bl(C5308o c5308o, C5258m c5258m) {
        this(c5308o, c5258m, new C5438t5(), new C5358q());
    }

    public final void a(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            try {
                if (this.f76925g) {
                    C5438t5 c5438t5 = this.f76920b;
                    InterfaceC5145he interfaceC5145he = new InterfaceC5145he() { // from class: io.appmetrica.analytics.impl.cq
                        @Override // io.appmetrica.analytics.impl.InterfaceC5145he
                        public final void consume(Object obj) {
                            this.f76991a.a(activity, (C5321oc) obj);
                        }
                    };
                    c5438t5.getClass();
                    C5186j4.l().f77467c.a().execute(new RunnableC5413s5(c5438t5, interfaceC5145he));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            try {
                if (this.f76925g) {
                    C5438t5 c5438t5 = this.f76920b;
                    InterfaceC5145he interfaceC5145he = new InterfaceC5145he() { // from class: io.appmetrica.analytics.impl.dq
                        @Override // io.appmetrica.analytics.impl.InterfaceC5145he
                        public final void consume(Object obj) {
                            this.f77034a.b(activity, (C5321oc) obj);
                        }
                    };
                    c5438t5.getClass();
                    C5186j4.l().f77467c.a().execute(new RunnableC5413s5(c5438t5, interfaceC5145he));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C4997bl(C5308o c5308o, C5258m c5258m, C5438t5 c5438t5, C5358q c5358q) {
        this.f76925g = false;
        this.f76919a = c5308o;
        this.f76924f = c5258m;
        this.f76920b = c5438t5;
        this.f76923e = c5358q;
        this.f76921c = new ActivityLifecycleListener() { // from class: io.appmetrica.analytics.impl.eq
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                this.f77136a.a(activity, activityEvent);
            }
        };
        this.f76922d = new ActivityLifecycleListener() { // from class: io.appmetrica.analytics.impl.fq
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                this.f77193a.b(activity, activityEvent);
            }
        };
    }

    public final synchronized EnumC5283n a() {
        try {
            if (!this.f76925g) {
                this.f76919a.registerListener(this.f76921c, ActivityEvent.RESUMED);
                this.f76919a.registerListener(this.f76922d, ActivityEvent.PAUSED);
                this.f76925g = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f76919a.f77873b;
    }

    public final void b(Activity activity, C5321oc c5321oc) {
        if (this.f76923e.a(activity, EnumC5333p.PAUSED)) {
            c5321oc.b(activity);
        }
    }

    public final void a(Activity activity, C5321oc c5321oc) {
        if (this.f76923e.a(activity, EnumC5333p.RESUMED)) {
            c5321oc.a(activity);
        }
    }
}
