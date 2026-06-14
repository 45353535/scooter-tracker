package com.facebook.ads.redexgen.core;

import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2097Fs extends XO {
    public final /* synthetic */ C2096Fr A00;

    public C2097Fs(C2096Fr c2096Fr) {
        this.A00 = c2096Fr;
    }

    @Override // com.facebook.ads.redexgen.core.XO, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        XP.A0F(this.A00.A01);
        this.A00.A00.ADh();
    }
}
