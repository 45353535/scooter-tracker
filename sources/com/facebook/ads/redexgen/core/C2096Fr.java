package com.facebook.ads.redexgen.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2096Fr extends AbstractRunnableC2507Vt {
    public final /* synthetic */ InterfaceC2770cW A00;
    public final /* synthetic */ C2771cX A01;

    public C2096Fr(C2771cX c2771cX, InterfaceC2770cW interfaceC2770cW) {
        this.A01 = c2771cX;
        this.A00 = interfaceC2770cW;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2507Vt
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C2097Fs(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
