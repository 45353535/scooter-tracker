package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b1;
import io.sentry.e9;
import io.sentry.g7;
import io.sentry.g9;
import io.sentry.h4;
import io.sentry.i0;
import io.sentry.internal.gestures.b;
import io.sentry.j4;
import io.sentry.l1;
import io.sentry.util.h0;
import io.sentry.w8;
import io.sentry.y0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f82490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b1 f82491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SentryAndroidOptions f82492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.sentry.internal.gestures.b f82493e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l1 f82494f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f82495g = b.Unknown;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f82496h = new c(null);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82497a;

        static {
            int[] iArr = new int[b.values().length];
            f82497a = iArr;
            try {
                iArr[b.Click.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82497a[b.Scroll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82497a[b.Swipe.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82497a[b.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private enum b {
        Click,
        Scroll,
        Swipe,
        Unknown
    }

    public g(Activity activity, b1 b1Var, SentryAndroidOptions sentryAndroidOptions) {
        this.f82490b = new WeakReference(activity);
        this.f82491c = b1Var;
        this.f82492d = sentryAndroidOptions;
    }

    public static /* synthetic */ void b(g gVar, y0 y0Var, l1 l1Var, l1 l1Var2) {
        if (l1Var2 != null) {
            gVar.f82492d.getLogger().c(g7.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", l1Var.getName());
        } else {
            gVar.getClass();
            y0Var.l(l1Var);
        }
    }

    public static /* synthetic */ void d(g gVar, y0 y0Var, l1 l1Var) {
        if (l1Var == gVar.f82494f) {
            y0Var.m();
        }
    }

    private void e(io.sentry.internal.gestures.b bVar, b bVar2, Map map, MotionEvent motionEvent) {
        if (this.f82492d.isEnableUserInteractionBreadcrumbs()) {
            String strJ = j(bVar2);
            i0 i0Var = new i0();
            i0Var.k("android:motionEvent", motionEvent);
            i0Var.k("android:view", bVar.f());
            this.f82491c.a(io.sentry.e.A(strJ, bVar.d(), bVar.a(), bVar.e(), map), i0Var);
        }
    }

    private View h(String str) {
        Activity activity = (Activity) this.f82490b.get();
        if (activity == null) {
            this.f82492d.getLogger().c(g7.DEBUG, "Activity is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            this.f82492d.getLogger().c(g7.DEBUG, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        this.f82492d.getLogger().c(g7.DEBUG, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
        return null;
    }

    private String i(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private static String j(b bVar) {
        int i10 = a.f82497a[bVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "unknown" : "swipe" : "scroll" : "click";
    }

    private void l(io.sentry.internal.gestures.b bVar, b bVar2) {
        boolean z10 = bVar2 == b.Click || !(bVar2 == this.f82495g && bVar.equals(this.f82493e));
        if (!this.f82492d.isTracingEnabled() || !this.f82492d.isEnableUserInteractionTracing()) {
            if (z10) {
                if (this.f82492d.isEnableAutoTraceIdGeneration()) {
                    h0.h(this.f82491c);
                }
                this.f82493e = bVar;
                this.f82495g = bVar2;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f82490b.get();
        if (activity == null) {
            this.f82492d.getLogger().c(g7.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String strB = bVar.b();
        l1 l1Var = this.f82494f;
        if (l1Var != null) {
            if (!z10 && !l1Var.g()) {
                this.f82492d.getLogger().c(g7.DEBUG, "The view with id: " + strB + " already has an ongoing transaction assigned. Rescheduling finish", new Object[0]);
                if (this.f82492d.getIdleTimeout() != null) {
                    this.f82494f.d();
                    return;
                }
                return;
            }
            m(w8.OK);
        }
        String str = i(activity) + "." + strB;
        String str2 = "ui.action." + j(bVar2);
        g9 g9Var = new g9();
        g9Var.v(true);
        long deadlineTimeout = this.f82492d.getDeadlineTimeout();
        g9Var.s(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
        g9Var.t(this.f82492d.getIdleTimeout());
        g9Var.i(true);
        g9Var.g("auto.ui.gesture_listener." + bVar.c());
        final l1 l1VarA = this.f82491c.A(new e9(str, io.sentry.protocol.h0.COMPONENT, str2), g9Var);
        this.f82491c.x(new j4() { // from class: io.sentry.android.core.internal.gestures.d
            @Override // io.sentry.j4
            public final void a(y0 y0Var) {
                this.f82483a.f(y0Var, l1VarA);
            }
        });
        this.f82494f = l1VarA;
        this.f82493e = bVar;
        this.f82495g = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(final y0 y0Var, final l1 l1Var) {
        y0Var.E(new h4.c() { // from class: io.sentry.android.core.internal.gestures.e
            @Override // io.sentry.h4.c
            public final void a(l1 l1Var2) {
                g.b(this.f82485a, y0Var, l1Var, l1Var2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(final y0 y0Var) {
        y0Var.E(new h4.c() { // from class: io.sentry.android.core.internal.gestures.f
            @Override // io.sentry.h4.c
            public final void a(l1 l1Var) {
                g.d(this.f82488a, y0Var, l1Var);
            }
        });
    }

    public void k(MotionEvent motionEvent) {
        View viewH = h("onUp");
        io.sentry.internal.gestures.b bVar = this.f82496h.f82499b;
        if (viewH == null || bVar == null) {
            return;
        }
        if (this.f82496h.f82498a == b.Unknown) {
            this.f82492d.getLogger().c(g7.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
            return;
        }
        e(bVar, this.f82496h.f82498a, Collections.singletonMap("direction", this.f82496h.i(motionEvent)), motionEvent);
        l(bVar, this.f82496h.f82498a);
        this.f82496h.j();
    }

    void m(w8 w8Var) {
        l1 l1Var = this.f82494f;
        if (l1Var != null) {
            if (l1Var.getStatus() == null) {
                this.f82494f.l(w8Var);
            } else {
                this.f82494f.finish();
            }
        }
        this.f82491c.x(new j4() { // from class: io.sentry.android.core.internal.gestures.c
            @Override // io.sentry.j4
            public final void a(y0 y0Var) {
                this.f82482a.g(y0Var);
            }
        });
        this.f82494f = null;
        if (this.f82493e != null) {
            this.f82493e = null;
        }
        this.f82495g = b.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.f82496h.j();
        this.f82496h.f82500c = motionEvent.getX();
        this.f82496h.f82501d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f82496h.f82498a = b.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        View viewH = h("onScroll");
        if (viewH != null && motionEvent != null && this.f82496h.f82498a == b.Unknown) {
            io.sentry.internal.gestures.b bVarA = j.a(this.f82492d, viewH, motionEvent.getX(), motionEvent.getY(), b.a.SCROLLABLE);
            if (bVarA == null) {
                this.f82492d.getLogger().c(g7.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                this.f82496h.f82498a = b.Scroll;
                return false;
            }
            this.f82492d.getLogger().c(g7.DEBUG, "Scroll target found: " + bVarA.b(), new Object[0]);
            this.f82496h.k(bVarA);
            this.f82496h.f82498a = b.Scroll;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewH = h("onSingleTapUp");
        if (viewH != null && motionEvent != null) {
            io.sentry.internal.gestures.b bVarA = j.a(this.f82492d, viewH, motionEvent.getX(), motionEvent.getY(), b.a.CLICKABLE);
            if (bVarA == null) {
                this.f82492d.getLogger().c(g7.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            b bVar = b.Click;
            e(bVarA, bVar, Collections.EMPTY_MAP, motionEvent);
            l(bVarA, bVar);
        }
        return false;
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f82498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private io.sentry.internal.gestures.b f82499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f82500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f82501d;

        private c() {
            this.f82498a = b.Unknown;
            this.f82500c = 0.0f;
            this.f82501d = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String i(MotionEvent motionEvent) {
            float x10 = motionEvent.getX() - this.f82500c;
            float y10 = motionEvent.getY() - this.f82501d;
            return Math.abs(x10) > Math.abs(y10) ? x10 > 0.0f ? "right" : "left" : y10 > 0.0f ? "down" : "up";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            this.f82499b = null;
            this.f82498a = b.Unknown;
            this.f82500c = 0.0f;
            this.f82501d = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(io.sentry.internal.gestures.b bVar) {
            this.f82499b = bVar;
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }
}
