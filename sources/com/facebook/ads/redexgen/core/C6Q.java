package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6Q extends C2963fg {
    public InterfaceC2821dM A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A06(NativeAdLayout nativeAdLayout, C2820dL c2820dL, NativeAd nativeAd, C2480Ur c2480Ur) {
        C2634aK c2634aK = new C2634aK(c2820dL);
        MediaView mediaView = new MediaView(c2820dL);
        AdOptionsView adOptionsView = new AdOptionsView(c2820dL, nativeAd, nativeAdLayout);
        c2480Ur.A09(adOptionsView, 28);
        this.A00 = new EP(c2820dL, nativeAd, c2480Ur, C2363Qc.A0L(nativeAd.getInternalNativeAd()).A18(), c2634aK, mediaView, adOptionsView);
        XP.A0K(nativeAdLayout, c2480Ur.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c2634aK, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
