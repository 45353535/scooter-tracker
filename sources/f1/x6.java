package f1;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import com.chartboost.sdk.internal.interruption.InterruptionController;
import f1.n;
import f1.vc;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class x6 extends FrameLayout implements d8, f7, od, ve {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o9 f71533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g6 f71534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sa f71535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b1.e f71536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xb f71537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f71538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f71539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f71540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GestureDetector f71541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f71542k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final za f71543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h0 f71544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Job f71545n;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        public final void a() {
            x6.this.f71533b.e(true);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f71547r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f71548s;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = x6.this.new b(continuation);
            bVar.f71548s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object objG = pf.b.g();
            int i10 = this.f71547r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f71548s;
                long jR = x6.this.f71533b.r() * 1000;
                this.f71548s = coroutineScope2;
                this.f71547r = 1;
                if (eg.k0.a(jR, this) == objG) {
                    return objG;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f71548s;
                kotlin.d.b(obj);
            }
            if (kotlinx.coroutines.i.i(coroutineScope)) {
                x6.this.f71543l.h(zc.f71814f, true);
            }
            return Unit.f93236a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(Context context, o9 multiRenderable, g6 g6Var, sa adFormat, b1.e eVar, xb densityProvider) {
        d9 d9VarB;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(multiRenderable, "multiRenderable");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        this.f71533b = multiRenderable;
        this.f71534c = g6Var;
        this.f71535d = adFormat;
        this.f71536e = eVar;
        this.f71537f = densityProvider;
        Iterator it = multiRenderable.u().iterator();
        while (it.hasNext()) {
            ((m2) it.next()).i().d();
        }
        za zaVar = new za(context, null, this.f71535d, this.f71533b.q(), this.f71536e);
        this.f71543l = zaVar;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.f71533b.q().b()) {
            this.f71533b.k();
        } else {
            ec.c(this.f71533b, 0.0f, 1, null);
        }
        addView(zaVar, layoutParams);
        InterruptionController interruptionController = InterruptionController.f17965b;
        interruptionController.g(this);
        interruptionController.f(this);
        zaVar.setAdViewOverlayListener(this);
        this.f71533b.d(this);
        View viewL = this.f71533b.l();
        if (viewL != null) {
            c(viewL);
        }
        q();
        this.f71533b.t();
        for (Object obj : this.f71533b.u()) {
            if (obj instanceof kg) {
                ((kg) obj).k();
            } else if ((obj instanceof k8) && (d9VarB = ((k8) obj).b()) != null) {
                this.f71543l.e(d9VarB);
            }
        }
    }

    public static final void e(x6 this$0, View adView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adView, "$adView");
        this$0.h(adView);
    }

    public static /* synthetic */ void f(x6 x6Var, View view, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        x6Var.d(view, z10);
    }

    public static final void i(x6 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        this$0.h(view);
    }

    @Override // f1.d8
    public void a(Set activeInterruptions) {
        Intrinsics.checkNotNullParameter(activeInterruptions, "activeInterruptions");
        if (activeInterruptions.isEmpty()) {
            p();
        } else {
            o();
        }
    }

    public final void c(final View view) {
        removeView(this.f71538g);
        this.f71538g = view;
        super.addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        if (this.f71533b.t() instanceof af) {
            post(new Runnable() { // from class: f1.w6
                @Override // java.lang.Runnable
                public final void run() {
                    x6.e(this.f71436b, view);
                }
            });
        }
        q();
    }

    @Override // f1.od
    public void d() {
        Unit unit;
        g6 g6Var = this.f71534c;
        if (g6Var != null) {
            g6Var.c();
        }
        if (this.f71535d == sa.f71089d && !this.f71542k) {
            this.f71542k = true;
            g6 g6Var2 = this.f71534c;
            if (g6Var2 != null) {
                g6Var2.d();
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.p("AdContainerListener null when onAdRewarded()", null, 2, null);
            }
        }
        this.f71543l.h(zc.f71814f, false);
        if (this.f71533b.j()) {
            this.f71543l.h(zc.f71813e, true);
        } else if (this.f71535d != sa.f71087b) {
            this.f71543l.h(zc.f71812d, true);
        }
        this.f71533b.f(z9.f71783b);
    }

    @Nullable
    public final g6 getAdContainerListener$ChartboostMonetization_9_10_2_productionRelease() {
        return this.f71534c;
    }

    @Nullable
    public final h0 getRenderingContainerCalculator() {
        return this.f71544m;
    }

    public final void h(View view) {
        m2 m2VarT = this.f71533b.t();
        if (m2VarT instanceof af) {
            vc vcVarI = ((af) m2VarT).i();
            if (vcVarI.b() == vc.a.f71403e) {
                return;
            }
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            if (width <= 0 || height <= 0) {
                return;
            }
            r0 r0VarC = id.f70124a.c(vcVarI, this.f71537f, width, height);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(r0VarC.b(), r0VarC.a());
            layoutParams.gravity = 17;
            view.setLayoutParams(layoutParams);
        }
    }

    public final void j() {
        Unit unit;
        Unit unit2;
        Integer numF = this.f71533b.q().f();
        int iIntValue = numF != null ? numF.intValue() : -1;
        if (this.f71535d == sa.f71089d && iIntValue < 0) {
            g6 g6Var = this.f71534c;
            if (g6Var != null) {
                g6Var.d();
                unit2 = Unit.f93236a;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                eg.p("AdContainerListener null when onAdClosed()", null, 2, null);
            }
        }
        this.f71533b.b(y2.f71611c);
        g6 g6Var2 = this.f71534c;
        if (g6Var2 != null) {
            g6Var2.b();
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.p("AdContainerListener null when onAdClosed()", null, 2, null);
        }
    }

    public final void k() {
        this.f71533b.b(y2.f71611c);
        removeAllViews();
    }

    public final boolean l() {
        return this.f71543l.o();
    }

    public final boolean m() {
        return this.f71533b.t() instanceof af;
    }

    public final void n() {
        this.f71533b.m();
    }

    public final void o() {
        if (this.f71539h) {
            return;
        }
        this.f71539h = true;
        this.f71533b.n();
        this.f71543l.s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterruptionController interruptionController = InterruptionController.f17965b;
        interruptionController.n(this);
        if (!m()) {
            interruptionController.a();
        }
        interruptionController.m(this);
        this.f71543l.d();
        if (this.f71535d != sa.f71087b) {
            this.f71533b.b(y2.f71611c);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        GestureDetector gestureDetector = this.f71541j;
        return gestureDetector != null ? gestureDetector.onTouchEvent(event) : super.onTouchEvent(event);
    }

    public final void p() {
        if (this.f71539h) {
            this.f71539h = false;
            this.f71533b.o();
            u();
            this.f71543l.y(this.f71533b.v());
            this.f71543l.z();
        }
    }

    public final void q() {
        this.f71533b.t();
        this.f71533b.t();
        xd xdVarQ = this.f71533b.q();
        u2 u2VarE = xdVarQ.e();
        t3 t3VarG = xdVarQ.g();
        if (t3VarG == null) {
            t3VarG = t3.f71125d.a();
        }
        za zaVar = this.f71543l;
        ic icVar = ic.f70117d;
        rb rbVar = new rb(t3VarG.b().b(), t3VarG.b().a());
        rb rbVar2 = new rb(t3VarG.c().b(), t3VarG.c().a());
        rb rbVar3 = new rb(t3VarG.d().b(), t3VarG.d().a());
        String strB = u2VarE.b();
        if (strB == null) {
            strB = "";
        }
        String str = strB;
        String strA = u2VarE.a();
        if (strA == null) {
            strA = "https://docs.chartboost.com/opt-out";
        }
        zaVar.k(true, icVar, rbVar, rbVar2, rbVar3, str, strA, (128 & 128) != 0 ? false : false);
        za zaVar2 = this.f71543l;
        zc zcVar = zc.f71811c;
        zaVar2.h(zcVar, false);
        za zaVar3 = this.f71543l;
        zc zcVar2 = zc.f71814f;
        zaVar3.h(zcVar2, false);
        za zaVar4 = this.f71543l;
        zc zcVar3 = zc.f71813e;
        zaVar4.h(zcVar3, false);
        za zaVar5 = this.f71543l;
        zc zcVar4 = zc.f71812d;
        zaVar5.h(zcVar4, false);
        if (this.f71535d == sa.f71087b) {
            return;
        }
        Integer numF = xdVarQ.f();
        int iIntValue = numF != null ? numF.intValue() : -1;
        sa saVar = this.f71535d;
        sa saVar2 = sa.f71089d;
        boolean z10 = (saVar != saVar2 || iIntValue >= 0) && (this.f71533b.i() > 0 || iIntValue > 0 || this.f71533b.s() > 0);
        if (!this.f71543l.r()) {
            if (z10 && !this.f71543l.r()) {
                this.f71543l.setTimer(((this.f71542k || iIntValue < 0) ? this.f71533b.s() > 0 ? Long.valueOf(this.f71533b.s()) : Long.valueOf(this.f71533b.i()) : Integer.valueOf(iIntValue)).longValue() * 1000);
            } else if (this.f71535d == saVar2 && iIntValue < 0) {
                this.f71543l.h(zcVar2, false);
                this.f71543l.h(zcVar3, false);
                this.f71543l.h(zcVar4, true);
            } else if (this.f71533b.j()) {
                this.f71543l.h(zcVar3, true);
                this.f71543l.h(zcVar4, false);
            } else {
                this.f71543l.h(zcVar3, false);
                this.f71543l.h(zcVar4, true);
            }
        }
        this.f71543l.h(zcVar, (this.f71533b.t() instanceof z0) || (this.f71533b.t() instanceof kg));
        t3 t3VarH = xdVarQ.h();
        if (t3VarH == null) {
            t3VarH = t3.f71125d.a();
        }
        this.f71543l.j(true, ic.f70118e, new rb(t3VarH.b().b(), t3VarH.b().a()), new rb(t3VarH.c().b(), t3VarH.c().a()), new rb(t3VarH.d().b(), t3VarH.d().a()));
        if (this.f71535d != saVar2 || iIntValue < 0) {
            return;
        }
        this.f71543l.setRewardedMode(true);
    }

    public final void r() {
        if (this.f71540i) {
            return;
        }
        this.f71540i = true;
        if (!m()) {
            InterruptionController.f17965b.u();
        }
        this.f71533b.w();
        this.f71543l.y(this.f71533b.v());
        t();
    }

    public final void s() {
        View viewL = this.f71533b.l();
        if (viewL != null) {
            c(viewL);
            q();
            t();
        }
    }

    public final void setAdContainerListener$ChartboostMonetization_9_10_2_productionRelease(@Nullable g6 g6Var) {
        this.f71534c = g6Var;
    }

    public final void setRenderingContainerCalculator(@Nullable h0 h0Var) {
        this.f71544m = h0Var;
        u();
    }

    public final void t() {
        if (this.f71535d == sa.f71087b) {
            return;
        }
        if (this.f71543l.r() || this.f71533b.r() <= 0) {
            this.f71543l.h(zc.f71814f, true);
        } else {
            Job job = this.f71545n;
            if (job != null) {
                Job.a.a(job, null, 1, null);
            }
            this.f71545n = eg.i.d(kotlinx.coroutines.i.a(eg.o0.c()), null, null, new b(null), 3, null);
        }
        this.f71543l.z();
    }

    public final void u() {
        if (this.f71544m == null || this.f71535d == sa.f71087b) {
            return;
        }
        this.f71533b.t();
        h0 h0Var = this.f71544m;
        s sVarB = h0Var != null ? h0Var.b() : null;
        Insets insetsA = sVarB != null ? sVarB.a() : null;
        if (insetsA != null) {
            n.a aVar = n.f70496c;
            setPadding(aVar.b(0) ? 0 : Math.max(insetsA.left, getPaddingLeft()), aVar.d(0) ? 0 : Math.max(insetsA.top, getPaddingTop()), aVar.c(0) ? 0 : Math.max(insetsA.right, getPaddingRight()), aVar.a(0) ? 0 : Math.max(insetsA.bottom, getPaddingBottom()));
            final View view = this.f71538g;
            if (view != null) {
                post(new Runnable() { // from class: f1.v6
                    @Override // java.lang.Runnable
                    public final void run() {
                        x6.i(this.f71367b, view);
                    }
                });
            }
        }
    }

    @Override // f1.od
    public void b() {
        this.f71533b.t();
        eg.p("CTA clicked but currentAd is null.", null, 2, null);
    }

    @Override // f1.od
    public void g() {
        g6 g6Var;
        String strA = this.f71533b.q().e().a();
        if (strA.length() <= 0 || (g6Var = this.f71534c) == null) {
            return;
        }
        g6Var.a(strA);
    }

    @Override // f1.od
    public void e() {
        j();
    }

    @Override // f1.f7
    public void b(boolean z10) {
        this.f71533b.g(z10);
        this.f71543l.y(this.f71533b.v());
    }

    @Override // f1.od
    public void a(boolean z10) {
        if (z10) {
            this.f71533b.k();
        } else {
            ec.c(this.f71533b, 0.0f, 1, null);
        }
    }

    @Override // f1.od
    public void c() {
        this.f71533b.h(true);
        this.f71533b.t();
        if (this.f71533b.j()) {
            s();
        } else {
            j();
        }
    }

    public final void d(View view, boolean z10) {
        this.f71541j = z10 ? new GestureDetector(view.getContext(), new c8(0.0f, new a(), 1, null)) : null;
    }

    public /* synthetic */ x6(Context context, o9 o9Var, g6 g6Var, sa saVar, b1.e eVar, xb xbVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, o9Var, g6Var, (i10 & 8) != 0 ? sa.f71087b : saVar, eVar, (i10 & 32) != 0 ? new y7(context) : xbVar);
    }
}
