package ic;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import ec.b;
import id.b1;
import id.c1;
import id.d1;
import id.i1;
import id.j0;
import id.k1;
import id.l0;
import id.m0;
import id.n0;
import id.o0;
import id.q0;
import id.s0;
import id.t0;
import id.x0;
import id.y0;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f74225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ec.b f74226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final id.k f74227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f74228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f74229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bd.g f74230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f74231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Animator f74232h;

    public final class b implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f74235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c1 f74236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Integer f74237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final id.o f74238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final WeakReference f74239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0 f74240f;

        public b(h0 h0Var, View view, boolean z10, c1 c1Var, Integer num, id.o oVar) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f74240f = h0Var;
            this.f74235a = z10;
            this.f74236b = c1Var;
            this.f74237c = num;
            this.f74238d = oVar;
            this.f74239e = new WeakReference(view);
        }

        @Override // ec.b.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bitmap successType) {
            Intrinsics.checkNotNullParameter(successType, "successType");
            h0 h0Var = this.f74240f;
            try {
                View view = (View) this.f74239e.get();
                if (view == null) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(view, "weakView.get() ?: return");
                h0Var.h(view, this.f74235a, successType, this.f74236b, this.f74237c, this.f74238d);
                Unit unit = Unit.f93236a;
            } catch (Throwable unused) {
            }
        }

        @Override // ec.b.a
        public void onError(id.a0 error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }
    }

    static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f74241f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f74242g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0 f74243h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Integer f74244i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ id.o f74245j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ a f74246k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view, boolean z10, h0 h0Var, Integer num, id.o oVar, a aVar) {
            super(1);
            this.f74241f = view;
            this.f74242g = z10;
            this.f74243h = h0Var;
            this.f74244i = num;
            this.f74245j = oVar;
            this.f74246k = aVar;
        }

        public final void a(int i10) {
            h0.s(this.f74241f, this.f74243h, this.f74244i, this.f74245j, this.f74246k, this.f74242g, i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).intValue());
            return Unit.f93236a;
        }
    }

    static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f74247f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ id.g0 f74248g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0 f74249h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Integer f74250i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ id.o f74251j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ a f74252k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view, id.g0 g0Var, h0 h0Var, Integer num, id.o oVar, a aVar) {
            super(1);
            this.f74247f = view;
            this.f74248g = g0Var;
            this.f74249h = h0Var;
            this.f74250i = num;
            this.f74251j = oVar;
            this.f74252k = aVar;
        }

        public final void a(List it) {
            Intrinsics.checkNotNullParameter(it, "it");
            h0.t(this.f74247f, this.f74249h, this.f74250i, this.f74251j, this.f74252k, true, new id.g0(this.f74248g.c(), this.f74248g.b(), it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return Unit.f93236a;
        }
    }

    static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f74253f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f74254g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0 f74255h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Integer f74256i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ id.o f74257j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ a f74258k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(View view, int i10, h0 h0Var, Integer num, id.o oVar, a aVar) {
            super(0);
            this.f74253f = view;
            this.f74254g = i10;
            this.f74255h = h0Var;
            this.f74256i = num;
            this.f74257j = oVar;
            this.f74258k = aVar;
        }

        public final void a() {
            h0.s(this.f74253f, this.f74255h, this.f74256i, this.f74257j, this.f74258k, true, this.f74254g);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f74259f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ id.g0 f74260g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0 f74261h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Integer f74262i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ id.o f74263j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ a f74264k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(View view, id.g0 g0Var, h0 h0Var, Integer num, id.o oVar, a aVar) {
            super(0);
            this.f74259f = view;
            this.f74260g = g0Var;
            this.f74261h = h0Var;
            this.f74262i = num;
            this.f74263j = oVar;
            this.f74264k = aVar;
        }

        public final void a() {
            h0.t(this.f74259f, this.f74261h, this.f74262i, this.f74263j, this.f74264k, true, this.f74260g);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeakReference f74265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Drawable f74266c;

        g(WeakReference weakReference, Drawable drawable) {
            this.f74265b = weakReference;
            this.f74266c = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            View view = (View) this.f74265b.get();
            if (view == null) {
                return;
            }
            view.setBackground(this.f74266c);
        }
    }

    public h0(Context context, ec.b repository, id.k background) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f74225a = context;
        this.f74226b = repository;
        this.f74227c = background;
        this.f74228d = new AtomicBoolean(false);
        this.f74229e = new AtomicBoolean(false);
        this.f74230f = new bd.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        this.f74231g = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Drawable newDrawable, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(newDrawable, "$newDrawable");
        Intrinsics.checkNotNullParameter(it, "it");
        pd.e eVar = pd.e.f98220a;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        newDrawable.setAlpha(eVar.r(((Float) animatedValue).floatValue()));
    }

    private final void d(View view, final Drawable drawable, a aVar) {
        b();
        if (!this.f74231g.compareAndSet(false, true)) {
            view.setBackground(drawable);
            return;
        }
        WeakReference weakReference = new WeakReference(view);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(aVar.a());
        valueAnimatorOfFloat.setInterpolator(aVar.c());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ic.g0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h0.c(drawable, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new g(weakReference, drawable));
        this.f74232h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public static /* synthetic */ void l(h0 h0Var, View view, boolean z10, Bitmap bitmap, c1 c1Var, Integer num, id.o oVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            c1Var = null;
        }
        if ((i10 & 16) != 0) {
            num = null;
        }
        if ((i10 & 32) != 0) {
            oVar = null;
        }
        h0Var.h(view, z10, bitmap, c1Var, num, oVar);
    }

    public static /* synthetic */ void m(h0 h0Var, Object obj, View view, x0 x0Var, Integer num, id.o oVar, a aVar, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            oVar = null;
        }
        if ((i10 & 32) != 0) {
            aVar = null;
        }
        h0Var.p(obj, view, x0Var, num, oVar, aVar);
    }

    public static /* synthetic */ void n(h0 h0Var, Object obj, View view, Integer num, id.o oVar, boolean z10, a aVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            oVar = null;
        }
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        if ((i10 & 32) != 0) {
            aVar = null;
        }
        h0Var.q(obj, view, num, oVar, z10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(View view, h0 h0Var, Integer num, id.o oVar, a aVar, boolean z10, int i10) {
        h0Var.g(view, z10, i10, num, oVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(View view, h0 h0Var, Integer num, id.o oVar, a aVar, boolean z10, id.g0 g0Var) {
        h0Var.k(view, z10, g0Var, num, oVar, aVar);
    }

    public final void b() {
        Animator animator = this.f74232h;
        if (animator != null) {
            animator.cancel();
            animator.removeAllListeners();
        }
        this.f74232h = null;
    }

    public final void g(View view, boolean z10, int i10, Integer num, id.o oVar, a aVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        n nVar = new n();
        nVar.j(i10);
        if (num != null) {
            nVar.e(num.intValue());
        }
        if (oVar != null) {
            n.i(nVar, oVar.b(), oVar.a(), 0.0f, 0.0f, 12, null);
            view.setPadding(oVar.b(), oVar.b() - pd.g0.k(this.f74225a, 2.0f), oVar.b(), oVar.b() + pd.g0.k(this.f74225a, 2.0f));
        }
        i(view, z10, nVar, aVar);
    }

    public final void h(View view, boolean z10, Bitmap bitmap, c1 c1Var, Integer num, id.o oVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (bitmap == null) {
            return;
        }
        ImageView.ScaleType scaleTypeA = d1.a(c1Var);
        b0 b0Var = new b0(bitmap);
        b0Var.e(scaleTypeA);
        if (num != null && num.intValue() > 0) {
            b0Var.i(num.intValue());
        }
        if (oVar != null) {
            b0Var.a(oVar.b());
            b0Var.c(oVar.a());
            view.setPadding(oVar.b(), oVar.b() - pd.g0.k(this.f74225a, 2.0f), oVar.b(), oVar.b() + pd.g0.k(this.f74225a, 2.0f));
        }
        i(view, z10, b0Var, null);
    }

    public final void i(View view, boolean z10, Drawable drawable, a aVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (this.f74228d.compareAndSet(false, z10)) {
            drawable.setAlpha((int) pd.g0.p(Float.valueOf(this.f74227c.a()), 255.0f));
            drawable.setBounds(0, 0, view.getWidth(), view.getHeight());
            if (aVar == null || !aVar.b(view)) {
                view.setBackground(drawable);
            } else {
                d(view, drawable, aVar);
            }
        }
    }

    public final void j(View view, boolean z10, id.v color, Integer num, id.o oVar, a aVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(color, "color");
        boolean zB = color.b();
        id.y yVarA = color.a();
        if (yVarA instanceof t0) {
            int iA = ((t0) yVarA).a();
            e eVar = new e(view, iA, this, num, oVar, aVar);
            if (zB) {
                this.f74230f.d(view, Integer.valueOf(iA), eVar, new c(view, z10, this, num, oVar, aVar));
                return;
            } else {
                eVar.invoke();
                return;
            }
        }
        if (yVarA instanceof id.h0) {
            id.g0 g0VarA = ((id.h0) yVarA).a();
            f fVar = new f(view, g0VarA, this, num, oVar, aVar);
            if (zB) {
                this.f74230f.h(view, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), fVar, new d(view, g0VarA, this, num, oVar, aVar));
            } else {
                fVar.invoke();
            }
        }
    }

    public final void k(View view, boolean z10, id.g0 gradient, Integer num, id.o oVar, a aVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        int iG = gradient.c().g();
        n nVar = new n(gradient.b().g(), CollectionsKt.toIntArray(gradient.a()));
        nVar.m(iG);
        if (gradient.c() == j0.Radial) {
            n.h(nVar, 0.0f, 2, 1, null);
        }
        if (num != null) {
            nVar.e(num.intValue());
        }
        if (oVar != null) {
            n.i(nVar, oVar.b(), oVar.a(), 0.0f, 0.0f, 12, null);
            view.setPadding(oVar.b(), oVar.b() - pd.g0.k(this.f74225a, 2.0f), oVar.b(), oVar.b() + pd.g0.k(this.f74225a, 2.0f));
        }
        i(view, z10, nVar, aVar);
    }

    public final void o(Object assetsHolder, View view, id.l backgroundSource, Integer num, id.o oVar, a aVar) {
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(backgroundSource, "backgroundSource");
        if (backgroundSource instanceof id.w) {
            j(view, true, ((id.w) backgroundSource).a(), num, oVar, aVar);
        } else if (backgroundSource instanceof n0) {
            r(assetsHolder, view, true, ((n0) backgroundSource).a(), num, oVar);
        }
    }

    public final void p(Object assetsHolder, View view, x0 placeholder, Integer num, id.o oVar, a aVar) {
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        y0 y0VarA = placeholder.a();
        if (y0VarA instanceof s0) {
            l(this, view, false, k.f74285a.e(((s0) y0VarA).a()), null, num, oVar, 8, null);
        } else if (y0VarA instanceof id.x) {
            j(view, false, ((id.x) y0VarA).a(), num, oVar, aVar);
        } else if (y0VarA instanceof o0) {
            r(assetsHolder, view, false, ((o0) y0VarA).a(), num, oVar);
        }
    }

    public final void q(Object assetsHolder, View view, Integer num, id.o oVar, boolean z10, a aVar) {
        id.l lVarC;
        x0 x0VarB;
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f74229e.compareAndSet(false, true) && (x0VarB = this.f74227c.b()) != null) {
            try {
                m(this, assetsHolder, view, x0VarB, num, oVar, null, 32, null);
                Unit unit = Unit.f93236a;
            } catch (Throwable unused) {
            }
        }
        boolean zD = this.f74227c.d();
        if (((!z10 || zD) && (z10 || !zD)) || (lVarC = this.f74227c.c()) == null) {
            return;
        }
        try {
            o(assetsHolder, view, lVarC, num, oVar, aVar);
            Unit unit2 = Unit.f93236a;
        } catch (Throwable unused2) {
        }
    }

    public final void r(Object assetsHolder, View view, boolean z10, m0 image, Integer num, id.o oVar) {
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(image, "image");
        b1 b1VarA = image.a().a();
        if (b1VarA instanceof id.n) {
            h(view, z10, k.c(((id.n) b1VarA).a()), image.b(), num, oVar);
            return;
        }
        if (!(b1VarA instanceof i1)) {
            if (b1VarA instanceof l0) {
                return;
            }
            boolean z11 = b1VarA instanceof k1;
        } else {
            q0 q0VarE = q0.f74599b.e(((i1) b1VarA).a());
            if (q0VarE != null) {
                this.f74226b.f(q0VarE, assetsHolder, new b(this, view, z10, image.b(), num, oVar));
            }
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f74233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TimeInterpolator f74234b;

        public a(long j10, TimeInterpolator interpolator) {
            Intrinsics.checkNotNullParameter(interpolator, "interpolator");
            this.f74233a = j10;
            this.f74234b = interpolator;
        }

        public final long a() {
            return this.f74233a;
        }

        public final boolean b(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return this.f74233a > 0 && view.isLaidOut();
        }

        public final TimeInterpolator c() {
            return this.f74234b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f74233a == aVar.f74233a && Intrinsics.areEqual(this.f74234b, aVar.f74234b);
        }

        public int hashCode() {
            return (androidx.collection.b.a(this.f74233a) * 31) + this.f74234b.hashCode();
        }

        public String toString() {
            return "AnimationConfig(durationMs=" + this.f74233a + ", interpolator=" + this.f74234b + ')';
        }

        public /* synthetic */ a(long j10, TimeInterpolator timeInterpolator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 200L : j10, (i10 & 2) != 0 ? new DecelerateInterpolator() : timeInterpolator);
        }
    }
}
