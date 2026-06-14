package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2849dp extends AnimatorListenerAdapter {
    public final /* synthetic */ C17812y A00;

    public C2849dp(C17812y c17812y) {
        this.A00 = c17812y;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00.A04.postDelayed(new D5(this), 2000L);
    }
}
