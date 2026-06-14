package gc;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import hc.r;
import hc.s;
import ic.u;
import id.a0;
import id.t;
import id.z0;
import kotlin.jvm.internal.Intrinsics;
import pd.b0;
import pd.v;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ed.a f72735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f72736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f72737c;

    private final class a implements s {
        public a() {
        }

        @Override // fc.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdAppeared(r adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            m.this.C();
        }

        @Override // fc.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onAdClicked(r adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            m.this.F();
        }

        @Override // fc.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onAdDisappeared(r adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            m.this.H();
        }

        @Override // fc.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onAdExpired(r adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            m.this.K();
        }

        @Override // fc.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onAdFailToLoad(r adView, a0 error) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            Intrinsics.checkNotNullParameter(error, "error");
            m.this.r(error);
        }

        @Override // fc.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onAdFailToShow(r adView, a0 error) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            Intrinsics.checkNotNullParameter(error, "error");
            m.this.U(error);
        }

        @Override // fc.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onAdFinished(r adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            m.this.V();
        }

        @Override // fc.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(r adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            m.this.O();
        }

        @Override // fc.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onAdShown(r adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            m.this.Q();
        }

        @Override // fc.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void onBrokenCreativeEvent(r adView, t brokenCreativeEvent) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            Intrinsics.checkNotNullParameter(brokenCreativeEvent, "brokenCreativeEvent");
            m.this.q(brokenCreativeEvent);
        }

        @Override // fc.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onOpenPrivacySheet(r adView, z0 privacySheetParams) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
            m.this.s(privacySheetParams);
        }
    }

    public m(Context context, id.c adParams) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        this.f72735a = new ed.d("FullScreenAd");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f72736b = new r(applicationContext, adParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        if (this.f72735a.b(true)) {
            b0.b(new u() { // from class: gc.i
                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    m.m(this.f72729b);
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    v.b(this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(m this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        n nVar = this$0.f72737c;
        if (nVar != null) {
            nVar.onAdClicked(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(m this$0, a0 error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        n nVar = this$0.f72737c;
        if (nVar != null) {
            nVar.onAdFailToShow(this$0, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        this.f72735a.e();
        b0.b(new u() { // from class: gc.f
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                m.D(this.f72725b);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                v.b(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(m this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        n nVar = this$0.f72737c;
        if (nVar != null) {
            nVar.onAdDisappeared(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        if (this.f72735a.b(false)) {
            b0.b(new u() { // from class: gc.d
                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    m.G(this.f72722b);
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    v.b(this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(m this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        n nVar = this$0.f72737c;
        if (nVar != null) {
            nVar.onAdExpired(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        if (this.f72735a.k()) {
            b0.b(new u() { // from class: gc.j
                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    m.I(this.f72730b);
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    v.b(this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(m this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        n nVar = this$0.f72737c;
        if (nVar != null) {
            nVar.onAdFinished(this$0);
        }
    }

    private final void M() {
        if (this.f72735a.j()) {
            b0.b(new u() { // from class: gc.b
                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    m.L(this.f72720b);
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    v.b(this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(m this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        n nVar = this$0.f72737c;
        if (nVar != null) {
            nVar.onAdLoaded(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        if (this.f72735a.a(true)) {
            b0.b(new u() { // from class: gc.h
                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    m.N(this.f72728b);
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    v.b(this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(m this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        n nVar = this$0.f72737c;
        if (nVar != null) {
            nVar.onAdShown(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        if (this.f72735a.i()) {
            b0.b(new u() { // from class: gc.c
                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    m.P(this.f72721b);
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    v.b(this);
                }
            });
        }
    }

    private final void l() {
        this.f72736b.h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(m this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        n nVar = this$0.f72737c;
        if (nVar != null) {
            nVar.onAdAppeared(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(m this$0, t brokenCreativeEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(brokenCreativeEvent, "$brokenCreativeEvent");
        n nVar = this$0.f72737c;
        if (nVar != null) {
            nVar.onBrokenCreativeEvent(this$0, brokenCreativeEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(m this$0, a0 error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        n nVar = this$0.f72737c;
        if (nVar != null) {
            nVar.onAdFailToLoad(this$0, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(m this$0, z0 privacySheetParams) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(privacySheetParams, "$privacySheetParams");
        n nVar = this$0.f72737c;
        if (nVar != null) {
            nVar.onOpenPrivacySheet(this$0, privacySheetParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(final t tVar) {
        if (this.f72735a.h()) {
            return;
        }
        b0.b(new u() { // from class: gc.k
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                m.n(this.f72731b, tVar);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                v.b(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(final a0 a0Var) {
        if (this.f72735a.a(false)) {
            b0.b(new u() { // from class: gc.g
                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    m.o(this.f72726b, a0Var);
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    v.b(this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(final z0 z0Var) {
        b0.b(new u() { // from class: gc.l
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                m.p(this.f72733b, z0Var);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                v.b(this);
            }
        });
    }

    public final void J() {
        this.f72735a.a();
        this.f72736b.m0();
    }

    public final boolean R() {
        return this.f72735a.g();
    }

    public final boolean S() {
        return this.f72735a.b();
    }

    public final void T() {
        if (this.f72735a.c()) {
            this.f72736b.setAdViewListener(new a());
            this.f72736b.C0();
        }
    }

    public final void U(final a0 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        b0.b(new u() { // from class: gc.e
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                m.E(this.f72723b, error);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                v.b(this);
            }
        });
    }

    public final void V() {
        l();
        H();
        M();
    }

    public final void W(n nVar) {
        this.f72737c = nVar;
    }

    public final void X(Drawable drawable) {
        this.f72736b.setWatermark(drawable);
    }

    public final void Y(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (S()) {
            gc.a.c(this, context);
        } else {
            U(new a0("FullScreenAd not loaded"));
        }
    }

    public final void Z(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f72736b.J0(activity);
    }
}
