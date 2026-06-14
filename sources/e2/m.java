package e2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.OnClickListener f68877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected View f68878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f68879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f68880d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f68881e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Animator.AnimatorListener f68882f = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.f68880d = false;
            m mVar = m.this;
            View view = mVar.f68878b;
            if (view == null || mVar.f68879c == null) {
                return;
            }
            view.animate().alpha(0.0f).setDuration(400L).setListener(m.this.f68882f).withLayer();
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
            View view = m.this.f68878b;
            if (view != null) {
                view.setClickable(view.getAlpha() != 0.0f);
            }
        }
    }

    public m(View.OnClickListener onClickListener) {
        this.f68877a = onClickListener;
    }

    protected ViewGroup.MarginLayoutParams b(Context context, e eVar) {
        return new ViewGroup.MarginLayoutParams(eVar.F(context).intValue(), eVar.l(context).intValue());
    }

    public void c() {
        View view = this.f68878b;
        if (view != null) {
            view.bringToFront();
        }
    }

    public void d(int i10) {
        View view = this.f68878b;
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public void f(Context context, ViewGroup viewGroup, e eVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        e eVar2;
        e eVarG = l(context, eVar).g(eVar);
        if (!eVarG.J().booleanValue()) {
            m();
            return;
        }
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b(context, eVarG));
            eVarG.a(layoutParams);
            marginLayoutParams = layoutParams;
        } else {
            if (!(viewGroup instanceof RelativeLayout)) {
                throw new IllegalArgumentException("Parent should be instance of FrameLayout or RelativeLayout");
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(b(context, eVarG));
            eVarG.d(layoutParams2);
            marginLayoutParams = layoutParams2;
        }
        eVarG.b(context, marginLayoutParams);
        View view = this.f68878b;
        if (view == null || (eVar2 = this.f68879c) == null || h(view, eVar2, eVarG)) {
            View viewJ = j(context, eVarG);
            this.f68878b = viewJ;
            viewGroup.addView(viewJ, marginLayoutParams);
        } else {
            this.f68878b.setLayoutParams(marginLayoutParams);
            this.f68878b.setVisibility(0);
        }
        this.f68878b.setAlpha(eVarG.t().floatValue());
        eVarG.c(context, this.f68878b);
        this.f68878b.setOnClickListener(this.f68877a);
        this.f68879c = eVarG;
        g(this.f68878b, eVarG);
        e(context, this.f68878b, eVarG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void g(View view, e eVar) {
        if (view instanceof d) {
            ((d) view).setStyle(eVar);
        }
    }

    protected boolean h(View view, e eVar, e eVar2) {
        return !TextUtils.equals(eVar.D(), eVar2.D());
    }

    abstract View j(Context context, e eVar);

    public void k() {
        this.f68880d = false;
        View view = this.f68878b;
        if (view == null || this.f68879c == null) {
            return;
        }
        view.animate().cancel();
        this.f68878b.removeCallbacks(this.f68881e);
        this.f68878b.setClickable(true);
        this.f68878b.setAlpha(this.f68879c.t().floatValue());
    }

    protected abstract e l(Context context, e eVar);

    public void m() {
        if (this.f68878b != null) {
            k();
            g.F(this.f68878b);
            this.f68878b = null;
            this.f68879c = null;
        }
    }

    public void n() {
        if (o()) {
            e(this.f68878b.getContext(), this.f68878b, this.f68879c);
        }
    }

    public boolean o() {
        return this.f68878b != null;
    }

    public void p() {
        e eVar;
        Float fM;
        if (this.f68880d || this.f68878b == null || (eVar = this.f68879c) == null || (fM = eVar.m()) == null || fM.floatValue() == 0.0f) {
            return;
        }
        this.f68880d = true;
        this.f68878b.postDelayed(this.f68881e, (long) (fM.floatValue() * 1000.0f));
    }

    public void q() {
        if (this.f68878b == null || this.f68879c == null) {
            return;
        }
        k();
        p();
    }

    protected void e(Context context, View view, e eVar) {
    }
}
