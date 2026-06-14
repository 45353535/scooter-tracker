package hc;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import ic.a;
import ic.h0;
import ic.u;
import ic.v;
import id.a0;
import id.u0;
import id.z0;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import pd.b0;
import pd.d0;
import pd.h0;
import pd.i0;
import pd.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jd.f f73140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0 f73141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FrameLayout f73142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ld.c f73143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ed.a f73144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final uc.a f73145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final fd.f f73146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ic.a f73147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ic.h0 f73148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private s f73149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f73150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WeakReference f73151m;

    static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f73152f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final qd.a invoke() {
            Function0 function0B = ec.a.b();
            if (function0B != null) {
                return (qd.a) function0B.invoke();
            }
            return null;
        }
    }

    private static final class b implements uc.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f73153a;

        public b(r adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            this.f73153a = new WeakReference(adView);
        }

        @Override // uc.r
        public void a(id.t brokenCreativeEvent) {
            Intrinsics.checkNotNullParameter(brokenCreativeEvent, "brokenCreativeEvent");
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.z(brokenCreativeEvent);
            }
        }

        @Override // uc.r
        public void b() {
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.r();
            }
        }

        @Override // uc.r
        public void c() {
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.Y();
            }
        }

        @Override // uc.r
        public void d() {
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.I0();
            }
        }

        @Override // uc.r
        public void e(uc.a adController, a0 error) {
            Intrinsics.checkNotNullParameter(adController, "adController");
            Intrinsics.checkNotNullParameter(error, "error");
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.g0(error);
            }
        }

        @Override // uc.r
        public void f() {
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.e0();
            }
        }

        @Override // uc.r
        public void g() {
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.B0();
            }
        }

        @Override // uc.r
        public void h() {
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.c0(new a0("Ad loading timeout after display"));
                rVar.r();
            }
        }

        @Override // uc.r
        public void i(uc.a adController) {
            Intrinsics.checkNotNullParameter(adController, "adController");
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.A0();
            }
        }

        @Override // uc.r
        public void j(uc.a adController) {
            Intrinsics.checkNotNullParameter(adController, "adController");
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.y0();
            }
        }

        @Override // uc.r
        public void onAdClicked() {
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.o0();
            }
        }

        @Override // uc.r
        public void a() {
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.i0();
            }
        }

        @Override // uc.r
        public void b(z0 privacySheetParams) {
            Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.d0(privacySheetParams);
            }
        }

        @Override // uc.r
        public void c(uc.t tVar, a0 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.l0(error);
            }
        }

        @Override // uc.r
        public void d(uc.t adPhaseController) {
            Intrinsics.checkNotNullParameter(adPhaseController, "adPhaseController");
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.C(adPhaseController);
            }
        }

        @Override // uc.r
        public void f(fd.l placeholderView) {
            Intrinsics.checkNotNullParameter(placeholderView, "placeholderView");
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.s(placeholderView);
            }
        }

        @Override // uc.r
        public void g(fd.l placeholderView) {
            Intrinsics.checkNotNullParameter(placeholderView, "placeholderView");
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.Z(placeholderView);
            }
        }

        @Override // uc.r
        public void h(uc.a adController) {
            Intrinsics.checkNotNullParameter(adController, "adController");
            r rVar = (r) this.f73153a.get();
            if (rVar != null) {
                rVar.s0();
            }
        }
    }

    private static final class c implements a.InterfaceC0919a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f73154a;

        public c(r adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            this.f73154a = new WeakReference(adView);
        }

        @Override // ic.a.InterfaceC0919a
        public void a() {
            r rVar = (r) this.f73154a.get();
            if (rVar != null) {
                rVar.D0();
            }
        }

        @Override // ic.a.InterfaceC0919a
        public void b() {
            r rVar = (r) this.f73154a.get();
            if (rVar != null) {
                rVar.E0();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, id.c adParams) {
        ic.h0 h0VarA;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        jd.f fVar = new jd.f("AdView");
        this.f73140b = fVar;
        this.f73141c = new h0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f73142d = frameLayout;
        ld.c cVar = new ld.c(context);
        this.f73143e = cVar;
        addView(frameLayout, i0.c());
        addView(cVar, i0.c());
        ic.j jVarA = ic.j.f74267i.a();
        String string = fVar.toString();
        Intrinsics.checkNotNullExpressionValue(string, "tag.toString()");
        ed.c cVar2 = new ed.c(string, jVarA);
        this.f73144f = cVar2;
        ed.b bVarO = cVar2.o();
        this.f73145g = new uc.q(context, adParams, new b(this), new tc.l(bVarO, jVarA));
        fd.f fVar2 = new fd.f(context);
        this.f73146h = fVar2;
        addView(fVar2, i0.c());
        fVar2.d();
        this.f73147i = new ic.b(this, adParams.f(), new c(this));
        Context appContext = context.getApplicationContext();
        id.k kVarB = adParams.b();
        if (kVarB != null) {
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            h0VarA = ic.i0.a(kVarB, appContext, new cd.a(a.f73152f, bVarO, jVarA));
        } else {
            h0VarA = null;
        }
        this.f73148j = h0VarA;
        this.f73150l = false;
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
    }

    private final void A(final a0 a0Var) {
        if (this.f73144f.a(false)) {
            v.b(this.f73140b, "notifyAdFailToLoad - %s", a0Var);
            b0.b(new Runnable() { // from class: hc.o
                @Override // java.lang.Runnable
                public final void run() {
                    r.x(this.f73136b, a0Var);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0() {
        w0();
    }

    private final void B(final z0 z0Var) {
        b0.b(new Runnable() { // from class: hc.i
            @Override // java.lang.Runnable
            public final void run() {
                r.y(this.f73126b, z0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0() {
        v.g(this.f73140b, "onPreparingForShowStarted", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(final uc.t tVar) {
        v.g(this.f73140b, "onPreparingForShowComplete", new Object[0]);
        b0.b(new u() { // from class: hc.k
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                r.D(tVar, this);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(uc.t adPhaseController, r this$0) {
        Intrinsics.checkNotNullParameter(adPhaseController, "$adPhaseController");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (adPhaseController.a(this$0.f73142d)) {
            this$0.e0();
            this$0.H0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0() {
        r rVar;
        v.g(this.f73140b, "onViewOnScreen", new Object[0]);
        ic.h0 h0Var = this.f73148j;
        if (h0Var != null) {
            rVar = this;
            ic.h0.n(h0Var, this.f73140b, rVar, null, null, false, new h0.a(0L, null, 3, null), 12, null);
        } else {
            rVar = this;
        }
        rVar.f73145g.d();
        rVar.f73145g.onShown();
        j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0() {
        v.g(this.f73140b, "onViewOutOfScreen", new Object[0]);
        F0();
    }

    private final void F0() {
        this.f73147i.stop();
        this.f73145g.f();
        q0();
    }

    private final void H0() {
        if (this.f73150l && i0.j(this)) {
            this.f73144f.l();
            this.f73147i.start();
            if (this.f73147i.b()) {
                D0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0() {
        this.f73146h.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y() {
        b0.b(new u() { // from class: hc.d
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                r.f0(this.f73119b);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(final fd.l lVar) {
        v.g(this.f73140b, "showPlaceholder (%s)", lVar);
        b0.b(new u() { // from class: hc.n
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                r.t(lVar, this);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f73142d.removeAllViews();
        this$0.removeAllViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(r this$0, a0 error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        s sVar = this$0.f73149k;
        if (sVar != null) {
            sVar.onAdFailToShow(this$0, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(final a0 a0Var) {
        if (this.f73144f.f()) {
            v.b(this.f73140b, "notifyAdFailToShow - %s", a0Var);
            b0.b(new Runnable() { // from class: hc.f
                @Override // java.lang.Runnable
                public final void run() {
                    r.b0(this.f73122b, a0Var);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(z0 z0Var) {
        v.g(this.f73140b, "onOpenPrivacySheet", new Object[0]);
        B(z0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0() {
        this.f73146h.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f73141c.c(this$0);
        t.d(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(a0 a0Var) {
        A(a0Var);
    }

    private final void j0() {
        if (this.f73144f.b(true)) {
            v.g(this.f73140b, "notifyAdAppeared", new Object[0]);
            b0.b(new Runnable() { // from class: hc.b
                @Override // java.lang.Runnable
                public final void run() {
                    r.k0(this.f73117b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        s sVar = this$0.f73149k;
        if (sVar != null) {
            sVar.onAdAppeared(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(a0 a0Var) {
        v.b(this.f73140b, "onPreparingForShowFail - %s", a0Var);
        c0(new a0("No phase loaded"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0() {
        this.f73144f.e();
        v.g(this.f73140b, "notifyAdClicked", new Object[0]);
        b0.b(new Runnable() { // from class: hc.l
            @Override // java.lang.Runnable
            public final void run() {
                r.p0(this.f73131b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        s sVar = this$0.f73149k;
        if (sVar != null) {
            sVar.onAdClicked(this$0);
        }
    }

    private final void q0() {
        if (this.f73144f.b(false)) {
            v.g(this.f73140b, "notifyAdDisappeared", new Object[0]);
            b0.b(new Runnable() { // from class: hc.a
                @Override // java.lang.Runnable
                public final void run() {
                    r.r0(this.f73116b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        s sVar = this$0.f73149k;
        if (sVar != null) {
            sVar.onAdDisappeared(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(final fd.l lVar) {
        v.g(this.f73140b, "hidePlaceholder (%s)", lVar);
        b0.b(new u() { // from class: hc.m
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                r.v(this.f73132b, lVar);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0() {
        if (this.f73144f.k()) {
            v.g(this.f73140b, "notifyAdExpired", new Object[0]);
            b0.b(new Runnable() { // from class: hc.p
                @Override // java.lang.Runnable
                public final void run() {
                    r.t0(this.f73138b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(fd.l placeholderView, r this$0) {
        Intrinsics.checkNotNullParameter(placeholderView, "$placeholderView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (placeholderView.getParent() == this$0) {
            return;
        }
        b9.u.F(placeholderView);
        this$0.addView(placeholderView, i0.c());
        placeholderView.bringToFront();
        placeholderView.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        s sVar = this$0.f73149k;
        if (sVar != null) {
            sVar.onAdExpired(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f73141c.b(this$0);
        this$0.f73145g.e();
    }

    private final void u0() {
        if (this.f73144f.j()) {
            v.g(this.f73140b, "notifyAdFinished", new Object[0]);
            b0.b(new Runnable() { // from class: hc.h
                @Override // java.lang.Runnable
                public final void run() {
                    r.v0(this.f73125b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(r this$0, fd.l placeholderView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(placeholderView, "$placeholderView");
        this$0.removeView(placeholderView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        s sVar = this$0.f73149k;
        if (sVar != null) {
            sVar.onAdFinished(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(r this$0, id.t brokenCreativeEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(brokenCreativeEvent, "$brokenCreativeEvent");
        s sVar = this$0.f73149k;
        if (sVar != null) {
            sVar.onBrokenCreativeEvent(this$0, brokenCreativeEvent);
        }
    }

    private final void w0() {
        if (this.f73144f.a(true)) {
            v.g(this.f73140b, "notifyAdLoaded", new Object[0]);
            b0.b(new Runnable() { // from class: hc.j
                @Override // java.lang.Runnable
                public final void run() {
                    r.x0(this.f73128b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(r this$0, a0 error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        s sVar = this$0.f73149k;
        if (sVar != null) {
            sVar.onAdFailToLoad(this$0, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        s sVar = this$0.f73149k;
        if (sVar != null) {
            sVar.onAdLoaded(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(r this$0, z0 privacySheetParams) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(privacySheetParams, "$privacySheetParams");
        s sVar = this$0.f73149k;
        if (sVar != null) {
            sVar.onOpenPrivacySheet(this$0, privacySheetParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0() {
        if (this.f73144f.i()) {
            v.g(this.f73140b, "notifyAdShown", new Object[0]);
            b0.b(new Runnable() { // from class: hc.g
                @Override // java.lang.Runnable
                public final void run() {
                    r.z0(this.f73124b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(final id.t tVar) {
        if (this.f73144f.h()) {
            return;
        }
        b0.b(new Runnable() { // from class: hc.e
            @Override // java.lang.Runnable
            public final void run() {
                r.w(this.f73120b, tVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        s sVar = this$0.f73149k;
        if (sVar != null) {
            sVar.onAdShown(this$0);
        }
    }

    public final void C0() {
        r rVar;
        if (this.f73144f.c()) {
            ic.h0 h0Var = this.f73148j;
            if (h0Var != null) {
                rVar = this;
                ic.h0.n(h0Var, this.f73140b, rVar, null, null, false, null, 60, null);
            } else {
                rVar = this;
            }
            rVar.f73145g.c();
        }
    }

    public final void G0() {
        this.f73145g.g();
    }

    public final void J0(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        h0();
        X(activity);
        jd.i.b(activity, getRequiredOrientation());
        d0.b(activity, false, 1, null);
        k0.n(this);
        jd.i.a(activity, this, false);
        activity.setContentView(this, i0.c());
    }

    public final void X(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f73151m = new WeakReference(activity);
    }

    @Nullable
    public final s getAdViewListener() {
        return this.f73149k;
    }

    @Nullable
    public final Activity getAttachedActivity() {
        WeakReference weakReference = this.f73151m;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    @Nullable
    public final u0 getRequiredOrientation() {
        return this.f73145g.h();
    }

    public final void h0() {
        d0.e(getAttachedActivity());
        n0();
    }

    public final void i0() {
        h0();
        b0.b(new u() { // from class: hc.c
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                r.u(this.f73118b);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    public final void m0() {
        v.g(this.f73140b, "destroy", new Object[0]);
        ic.h0 h0Var = this.f73148j;
        if (h0Var != null) {
            h0Var.b();
        }
        this.f73149k = null;
        this.f73141c.a();
        this.f73145g.a();
        this.f73147i.a();
        b0.b(new u() { // from class: hc.q
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                r.a0(this.f73139b);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
        this.f73144f.a();
        h0();
    }

    public final void n0() {
        WeakReference weakReference = this.f73151m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f73151m = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        v.g(this.f73140b, "onAttachedToWindow", new Object[0]);
        this.f73150l = true;
        H0();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v.g(this.f73140b, "onDetachedFromWindow", new Object[0]);
        this.f73150l = false;
        F0();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View changedView, int i10) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        v.g(this.f73140b, "onVisibilityChanged - %s", jd.h.g(i10));
        if (i0.i(i10)) {
            H0();
        } else {
            F0();
        }
    }

    public final void setAdViewListener(@Nullable s sVar) {
        this.f73149k = sVar;
    }

    public final void setWatermark(@Nullable Drawable drawable) {
        this.f73143e.setWatermark(drawable);
    }

    @Override // android.view.View
    public String toString() {
        String string = this.f73140b.toString();
        Intrinsics.checkNotNullExpressionValue(string, "tag.toString()");
        return string;
    }
}
