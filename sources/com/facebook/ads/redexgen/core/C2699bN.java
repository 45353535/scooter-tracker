package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2699bN implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C2174Is A00;

    public C2699bN(C2174Is c2174Is) {
        this.A00 = c2174Is;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.A0U.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.A00.A0U.requestLayout();
    }
}
