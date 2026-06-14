package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2865e5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C2015Co A01;

    public C2865e5(C2015Co c2015Co, View view) {
        this.A01 = c2015Co;
        this.A00 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
        layoutParams.height = iIntValue;
        this.A00.setLayoutParams(layoutParams);
    }
}
