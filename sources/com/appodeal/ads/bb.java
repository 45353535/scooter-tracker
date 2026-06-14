package com.appodeal.ads;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.appodeal.ads.utils.Log;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class bb extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tc f13139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s7 f13140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0 f13141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f13142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f13143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f13144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f13145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ac f13146i;

    public bb(ac acVar, tc tcVar, s7 s7Var, l0 l0Var, View view, View view2, boolean z10, boolean z11) {
        this.f13146i = acVar;
        this.f13139b = tcVar;
        this.f13140c = s7Var;
        this.f13141d = l0Var;
        this.f13142e = view;
        this.f13143f = view2;
        this.f13144g = z10;
        this.f13145h = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.removeAllListeners();
        View view = this.f13142e;
        if (view != null) {
            if (view.getAnimation() != null) {
                this.f13142e.getAnimation().setAnimationListener(null);
            }
            this.f13142e.clearAnimation();
            this.f13142e.animate().setListener(null);
        }
        this.f13146i.f11901h = null;
        try {
            ac.u(this.f13142e, this.f13144g, this.f13145h);
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        View view = this.f13142e;
        if (view != null) {
            if (view.getAnimation() != null) {
                this.f13142e.getAnimation().setAnimationListener(null);
            }
            this.f13142e.clearAnimation();
            this.f13142e.animate().setListener(null);
        }
        ac acVar = this.f13146i;
        acVar.f11901h = null;
        acVar.w(this.f13139b, this.f13140c, this.f13141d, this.f13143f);
        if (this.f13143f.equals(this.f13142e)) {
            return;
        }
        try {
            ac acVar2 = this.f13146i;
            View view2 = this.f13142e;
            boolean z10 = this.f13144g;
            boolean z11 = this.f13145h;
            acVar2.getClass();
            ac.u(view2, z10, z11);
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f13146i.f11901h = new WeakReference(animator);
    }
}
