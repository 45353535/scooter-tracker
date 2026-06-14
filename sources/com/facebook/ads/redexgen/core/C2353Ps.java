package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2353Ps extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ViewPropertyAnimator A03;
    public final /* synthetic */ C18706j A04;
    public final /* synthetic */ AbstractC2367Qg A05;

    public C2353Ps(C18706j c18706j, AbstractC2367Qg abstractC2367Qg, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.A04 = c18706j;
        this.A05 = abstractC2367Qg;
        this.A00 = i10;
        this.A02 = view;
        this.A01 = i11;
        this.A03 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.A00 != 0) {
            this.A02.setTranslationX(0.0f);
        }
        if (this.A01 != 0) {
            this.A02.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A03.setListener(null);
        this.A04.A0U(this.A05);
        this.A04.A04.remove(this.A05);
        this.A04.A0b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
