package b9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes12.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.OnClickListener f5919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected View f5920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected k f5921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5922d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f5923e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Animator.AnimatorListener f5924f = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.f5922d = false;
            l lVar = l.this;
            View view = lVar.f5920b;
            if (view == null || lVar.f5921c == null) {
                return;
            }
            view.animate().alpha(0.0f).setDuration(400L).setListener(l.this.f5924f).withLayer();
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            animator.removeAllListeners();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = l.this.f5920b;
            if (view != null) {
                view.setClickable(view.getAlpha() != 0.0f);
            }
        }
    }

    public l(View.OnClickListener onClickListener) {
        this.f5919a = onClickListener;
    }

    protected ViewGroup.MarginLayoutParams b(Context context, k kVar) {
        return new ViewGroup.MarginLayoutParams(kVar.F(context).intValue(), kVar.l(context).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void d(View view, k kVar) {
        if (view instanceof j) {
            ((j) view).setStyle(kVar);
        }
    }

    protected boolean e(View view, k kVar, k kVar2) {
        return !TextUtils.equals(kVar.D(), kVar2.D());
    }

    public void g(Context context, ViewGroup viewGroup, k kVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        k kVar2;
        k kVarG = j(context, kVar).g(kVar);
        if (!kVarG.J().booleanValue()) {
            l();
            return;
        }
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b(context, kVarG));
            kVarG.a(layoutParams);
            marginLayoutParams = layoutParams;
        } else {
            if (!(viewGroup instanceof RelativeLayout)) {
                throw new IllegalArgumentException("Parent should be instance of FrameLayout or RelativeLayout");
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(b(context, kVarG));
            kVarG.d(layoutParams2);
            marginLayoutParams = layoutParams2;
        }
        kVarG.b(context, marginLayoutParams);
        View view = this.f5920b;
        if (view == null || (kVar2 = this.f5921c) == null || e(view, kVar2, kVarG)) {
            u.F(this.f5920b);
            View viewH = h(context, kVarG);
            this.f5920b = viewH;
            viewGroup.addView(viewH, marginLayoutParams);
        } else {
            this.f5920b.setLayoutParams(marginLayoutParams);
            this.f5920b.setVisibility(0);
        }
        this.f5920b.setAlpha(kVarG.t().floatValue());
        kVarG.c(context, this.f5920b);
        this.f5920b.setOnClickListener(this.f5919a);
        this.f5921c = kVarG;
        d(this.f5920b, kVarG);
        c(context, this.f5920b, kVarG);
    }

    abstract View h(Context context, k kVar);

    public void i() {
        View view = this.f5920b;
        if (view != null) {
            view.bringToFront();
        }
    }

    protected abstract k j(Context context, k kVar);

    public void k() {
        this.f5922d = false;
        View view = this.f5920b;
        if (view == null || this.f5921c == null) {
            return;
        }
        view.animate().cancel();
        this.f5920b.removeCallbacks(this.f5923e);
        this.f5920b.setClickable(true);
        this.f5920b.setAlpha(this.f5921c.t().floatValue());
    }

    public void l() {
        if (this.f5920b != null) {
            k();
            u.F(this.f5920b);
            this.f5920b = null;
            this.f5921c = null;
        }
    }

    public void m() {
        View view;
        if (!n() || (view = this.f5920b) == null || this.f5921c == null) {
            return;
        }
        c(view.getContext(), this.f5920b, this.f5921c);
    }

    public boolean n() {
        return this.f5920b != null;
    }

    public void o(int i10) {
        View view = this.f5920b;
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public void p() {
        k kVar;
        Float fM;
        if (this.f5922d || this.f5920b == null || (kVar = this.f5921c) == null || (fM = kVar.m()) == null || fM.floatValue() == 0.0f) {
            return;
        }
        this.f5922d = true;
        this.f5920b.postDelayed(this.f5923e, (long) (fM.floatValue() * 1000.0f));
    }

    public void q() {
        if (this.f5920b == null || this.f5921c == null) {
            return;
        }
        k();
        p();
    }

    protected void c(Context context, View view, k kVar) {
    }
}
