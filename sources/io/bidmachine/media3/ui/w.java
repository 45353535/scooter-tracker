package io.bidmachine.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
final class w {
    private boolean A;
    private boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.bidmachine.media3.ui.d f81763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f81764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ViewGroup f81765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ViewGroup f81766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewGroup f81767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewGroup f81768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewGroup f81769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ViewGroup f81770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ViewGroup f81771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View f81772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View f81773k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AnimatorSet f81774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AnimatorSet f81775m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AnimatorSet f81776n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AnimatorSet f81777o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AnimatorSet f81778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ValueAnimator f81779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ValueAnimator f81780r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Runnable f81781s = new Runnable() { // from class: io.bidmachine.media3.ui.j
        @Override // java.lang.Runnable
        public final void run() {
            this.f81750b.Y();
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f81782t = new Runnable() { // from class: io.bidmachine.media3.ui.p
        @Override // java.lang.Runnable
        public final void run() {
            this.f81756b.D();
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f81783u = new Runnable() { // from class: io.bidmachine.media3.ui.q
        @Override // java.lang.Runnable
        public final void run() {
            this.f81757b.H();
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Runnable f81784v = new Runnable() { // from class: io.bidmachine.media3.ui.r
        @Override // java.lang.Runnable
        public final void run() {
            this.f81758b.G();
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f81785w = new Runnable() { // from class: io.bidmachine.media3.ui.s
        @Override // java.lang.Runnable
        public final void run() {
            this.f81759b.E();
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final View.OnLayoutChangeListener f81786x = new View.OnLayoutChangeListener() { // from class: io.bidmachine.media3.ui.t
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f81760b.N(view, i10, i11, i12, i13, i14, i15, i16, i17);
        }
    };
    private boolean C = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f81788z = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f81787y = new ArrayList();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.f81764b != null) {
                w.this.f81764b.setVisibility(4);
            }
            if (w.this.f81765c != null) {
                w.this.f81765c.setVisibility(4);
            }
            if (w.this.f81767e != null) {
                w.this.f81767e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(w.this.f81772j instanceof io.bidmachine.media3.ui.b) || w.this.A) {
                return;
            }
            ((io.bidmachine.media3.ui.b) w.this.f81772j).g(250L);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.f81764b != null) {
                w.this.f81764b.setVisibility(0);
            }
            if (w.this.f81765c != null) {
                w.this.f81765c.setVisibility(0);
            }
            if (w.this.f81767e != null) {
                w.this.f81767e.setVisibility(w.this.A ? 0 : 4);
            }
            if (!(w.this.f81772j instanceof io.bidmachine.media3.ui.b) || w.this.A) {
                return;
            }
            ((io.bidmachine.media3.ui.b) w.this.f81772j).r(250L);
        }
    }

    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.bidmachine.media3.ui.d f81791b;

        c(io.bidmachine.media3.ui.d dVar) {
            this.f81791b = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(1);
            if (w.this.B) {
                this.f81791b.post(w.this.f81781s);
                w.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(3);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.bidmachine.media3.ui.d f81793b;

        d(io.bidmachine.media3.ui.d dVar) {
            this.f81793b = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(2);
            if (w.this.B) {
                this.f81793b.post(w.this.f81781s);
                w.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(3);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.bidmachine.media3.ui.d f81795b;

        e(io.bidmachine.media3.ui.d dVar) {
            this.f81795b = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(2);
            if (w.this.B) {
                this.f81795b.post(w.this.f81781s);
                w.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(3);
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(4);
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(4);
        }
    }

    class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.f81768f != null) {
                w.this.f81768f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.f81770h != null) {
                w.this.f81770h.setVisibility(0);
                w.this.f81770h.setTranslationX(w.this.f81770h.getWidth());
                w.this.f81770h.scrollTo(w.this.f81770h.getWidth(), 0);
            }
        }
    }

    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.f81770h != null) {
                w.this.f81770h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.f81768f != null) {
                w.this.f81768f.setVisibility(0);
            }
        }
    }

    public w(io.bidmachine.media3.ui.d dVar) {
        this.f81763a = dVar;
        this.f81764b = dVar.findViewById(R$id.f81469l);
        this.f81765c = (ViewGroup) dVar.findViewById(R$id.f81464g);
        this.f81767e = (ViewGroup) dVar.findViewById(R$id.f81480w);
        ViewGroup viewGroup = (ViewGroup) dVar.findViewById(R$id.f81462e);
        this.f81766d = viewGroup;
        this.f81771i = (ViewGroup) dVar.findViewById(R$id.S);
        View viewFindViewById = dVar.findViewById(R$id.G);
        this.f81772j = viewFindViewById;
        this.f81768f = (ViewGroup) dVar.findViewById(R$id.f81461d);
        this.f81769g = (ViewGroup) dVar.findViewById(R$id.f81472o);
        this.f81770h = (ViewGroup) dVar.findViewById(R$id.f81473p);
        View viewFindViewById2 = dVar.findViewById(R$id.A);
        this.f81773k = viewFindViewById2;
        View viewFindViewById3 = dVar.findViewById(R$id.f81483z);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f81761b.P(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f81761b.P(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.bidmachine.media3.ui.v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w.l(this.f81762b, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.bidmachine.media3.ui.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w.d(this.f81751b, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = dVar.getResources();
        int i10 = R$dimen.f81435b;
        float dimension = resources.getDimension(i10) - resources.getDimension(R$dimen.f81436c);
        float dimension2 = resources.getDimension(i10);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f81774l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(dVar));
        animatorSet.play(valueAnimatorOfFloat).with(J(0.0f, dimension, viewFindViewById)).with(J(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f81775m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(dVar));
        animatorSet2.play(J(dimension, dimension2, viewFindViewById)).with(J(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f81776n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(dVar));
        animatorSet3.play(valueAnimatorOfFloat).with(J(0.0f, dimension2, viewFindViewById)).with(J(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f81777o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(J(dimension, 0.0f, viewFindViewById)).with(J(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f81778p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(J(dimension2, 0.0f, viewFindViewById)).with(J(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f81779q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.bidmachine.media3.ui.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w.e(this.f81754b, valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f81780r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.bidmachine.media3.ui.o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w.k(this.f81755b, valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    private static int B(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        this.f81776n.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        V(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        this.f81774l.start();
        Q(this.f81783u, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.f81775m.start();
    }

    private static ObjectAnimator J(float f10, float f11, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean zA0 = a0();
        if (this.A != zA0) {
            this.A = zA0;
            view.post(new Runnable() { // from class: io.bidmachine.media3.ui.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81752b.Z();
                }
            });
        }
        boolean z10 = i12 - i10 != i16 - i14;
        if (this.A || !z10) {
            return;
        }
        view.post(new Runnable() { // from class: io.bidmachine.media3.ui.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f81753b.O();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        int i10;
        if (this.f81768f == null || this.f81769g == null) {
            return;
        }
        int width = (this.f81763a.getWidth() - this.f81763a.getPaddingLeft()) - this.f81763a.getPaddingRight();
        while (true) {
            if (this.f81769g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f81769g.getChildCount() - 2;
            View childAt = this.f81769g.getChildAt(childCount);
            this.f81769g.removeViewAt(childCount);
            this.f81768f.addView(childAt, 0);
        }
        View view = this.f81773k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iB = B(this.f81771i);
        int childCount2 = this.f81768f.getChildCount() - 1;
        for (int i11 = 0; i11 < childCount2; i11++) {
            iB += B(this.f81768f.getChildAt(i11));
        }
        if (iB <= width) {
            ViewGroup viewGroup = this.f81770h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f81780r.isStarted()) {
                return;
            }
            this.f81779q.cancel();
            this.f81780r.start();
            return;
        }
        View view2 = this.f81773k;
        if (view2 != null) {
            view2.setVisibility(0);
            iB += B(this.f81773k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = this.f81768f.getChildAt(i12);
            iB -= B(childAt2);
            arrayList.add(childAt2);
            if (iB <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f81768f.removeViews(0, arrayList.size());
        for (i10 = 0; i10 < arrayList.size(); i10++) {
            this.f81769g.addView((View) arrayList.get(i10), this.f81769g.getChildCount() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(View view) {
        S();
        if (view.getId() == R$id.A) {
            this.f81779q.start();
        } else if (view.getId() == R$id.f81483z) {
            this.f81780r.start();
        }
    }

    private void Q(Runnable runnable, long j10) {
        if (j10 >= 0) {
            this.f81763a.postDelayed(runnable, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i10) {
        int i11 = this.f81788z;
        this.f81788z = i10;
        if (i10 == 2) {
            this.f81763a.setVisibility(8);
        } else if (i11 == 2) {
            this.f81763a.setVisibility(0);
        }
        if (i11 != i10) {
            this.f81763a.f0();
        }
    }

    private boolean W(View view) {
        int id2 = view.getId();
        return id2 == R$id.f81462e || id2 == R$id.F || id2 == R$id.f81482y || id2 == R$id.J || id2 == R$id.K || id2 == R$id.f81474q || id2 == R$id.f81475r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        if (!this.C) {
            V(0);
            S();
            return;
        }
        int i10 = this.f81788z;
        if (i10 == 1) {
            this.f81777o.start();
        } else if (i10 == 2) {
            this.f81778p.start();
        } else if (i10 == 3) {
            this.B = true;
        } else if (i10 == 4) {
            return;
        }
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        ViewGroup viewGroup = this.f81767e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.A ? 0 : 4);
        }
        if (this.f81772j != null) {
            int dimensionPixelSize = this.f81763a.getResources().getDimensionPixelSize(R$dimen.f81437d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f81772j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f81772j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f81772j;
            if (view instanceof io.bidmachine.media3.ui.b) {
                io.bidmachine.media3.ui.b bVar = (io.bidmachine.media3.ui.b) view;
                if (this.A) {
                    bVar.h(true);
                } else {
                    int i10 = this.f81788z;
                    if (i10 == 1) {
                        bVar.h(false);
                    } else if (i10 != 3) {
                        bVar.q();
                    }
                }
            }
        }
        for (View view2 : this.f81787y) {
            view2.setVisibility((this.A && W(view2)) ? 4 : 0);
        }
    }

    private boolean a0() {
        int width = (this.f81763a.getWidth() - this.f81763a.getPaddingLeft()) - this.f81763a.getPaddingRight();
        int height = (this.f81763a.getHeight() - this.f81763a.getPaddingBottom()) - this.f81763a.getPaddingTop();
        int iB = B(this.f81765c);
        ViewGroup viewGroup = this.f81765c;
        int paddingLeft = iB - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f81765c.getPaddingRight() : 0);
        int iZ = z(this.f81765c);
        ViewGroup viewGroup2 = this.f81765c;
        return width <= Math.max(paddingLeft, B(this.f81771i) + B(this.f81773k)) || height <= (iZ - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f81765c.getPaddingBottom() : 0)) + (z(this.f81766d) * 2);
    }

    public static /* synthetic */ void d(w wVar, ValueAnimator valueAnimator) {
        wVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = wVar.f81764b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = wVar.f81765c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = wVar.f81767e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public static /* synthetic */ void e(w wVar, ValueAnimator valueAnimator) {
        wVar.getClass();
        wVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void k(w wVar, ValueAnimator valueAnimator) {
        wVar.getClass();
        wVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void l(w wVar, ValueAnimator valueAnimator) {
        wVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = wVar.f81764b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = wVar.f81765c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = wVar.f81767e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    private void y(float f10) {
        if (this.f81770h != null) {
            this.f81770h.setTranslationX((int) (r0.getWidth() * (1.0f - f10)));
        }
        ViewGroup viewGroup = this.f81771i;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup2 = this.f81768f;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
    }

    private static int z(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public boolean A(View view) {
        return view != null && this.f81787y.contains(view);
    }

    public void C() {
        int i10 = this.f81788z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        R();
        if (!this.C) {
            E();
        } else if (this.f81788z == 1) {
            H();
        } else {
            D();
        }
    }

    public void F() {
        int i10 = this.f81788z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        R();
        E();
    }

    public boolean I() {
        return this.f81788z == 0 && this.f81763a.e0();
    }

    public void K() {
        this.f81763a.addOnLayoutChangeListener(this.f81786x);
    }

    public void L() {
        this.f81763a.removeOnLayoutChangeListener(this.f81786x);
    }

    public void M(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f81764b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public void R() {
        this.f81763a.removeCallbacks(this.f81785w);
        this.f81763a.removeCallbacks(this.f81782t);
        this.f81763a.removeCallbacks(this.f81784v);
        this.f81763a.removeCallbacks(this.f81783u);
    }

    public void S() {
        if (this.f81788z == 3) {
            return;
        }
        R();
        int showTimeoutMs = this.f81763a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                Q(this.f81785w, showTimeoutMs);
            } else if (this.f81788z == 1) {
                Q(this.f81783u, 2000L);
            } else {
                Q(this.f81784v, showTimeoutMs);
            }
        }
    }

    public void T(boolean z10) {
        this.C = z10;
    }

    public void U(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (!z10) {
            view.setVisibility(8);
            this.f81787y.remove(view);
            return;
        }
        if (this.A && W(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f81787y.add(view);
    }

    public void X() {
        if (!this.f81763a.e0()) {
            this.f81763a.setVisibility(0);
            this.f81763a.n0();
            this.f81763a.k0();
        }
        Y();
    }
}
