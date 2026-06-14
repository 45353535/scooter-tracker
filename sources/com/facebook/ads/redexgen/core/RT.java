package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import com.facebook.ads.internal.api.NativeAdLayoutApi;
import com.facebook.ads.internal.api.NativeBannerAdViewApi;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RT implements NativeBannerAdViewApi {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.ads.internal.api.NativeAdLayoutApi, com.facebook.ads.redexgen.X.6f] */
    public static View A00(C2820dL c2820dL, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C2363Qc.A0L(nativeBannerAd.getInternalNativeAd()).A1a(EnumC2481Us.A00(type.getEnumCode()));
        ?? r12 = new C2963fg() { // from class: com.facebook.ads.redexgen.X.6f
            public InterfaceC2821dM A00;

            public final void A06(C2820dL c2820dL2, NativeBannerAd nativeBannerAd2, C2480Ur c2480Ur, NativeAdLayout nativeAdLayout) {
                MediaView mediaView = new MediaView(nativeAdLayout.getContext());
                AdOptionsView adOptionsView = new AdOptionsView(nativeAdLayout.getContext(), nativeBannerAd2, nativeAdLayout);
                c2480Ur.A09(adOptionsView, 20);
                this.A00 = new EQ(c2820dL2, nativeBannerAd2, c2480Ur, C2363Qc.A0L(nativeBannerAd2.getInternalNativeAd()).A18(), mediaView, adOptionsView);
                XP.A0K(nativeAdLayout, c2480Ur.A00());
                nativeBannerAd2.registerViewForInteraction(nativeAdLayout, mediaView, this.A00.getViewsForInteraction());
                FrameLayout.LayoutParams contentParams = new FrameLayout.LayoutParams(-1, -1);
                contentParams.gravity = 17;
                nativeAdLayout.addView(this.A00.getView(), contentParams);
            }

            @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                this.A00.unregisterView();
            }
        };
        NativeAdLayout nativeAdLayout = new NativeAdLayout(c2820dL, (NativeAdLayoutApi) r12);
        r12.A06(c2820dL, nativeBannerAd, (C2480Ur) nativeAdViewAttributes.getInternalAttributes(), nativeAdLayout);
        nativeAdLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (AbstractC2523Wl.A02 * type.getHeight())));
        return nativeAdLayout;
    }

    @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
    public final View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type) {
        return render(context, nativeBannerAd, type, null);
    }

    @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
    public final View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        try {
            return A00(RB.A03(context), nativeBannerAd, type, nativeAdViewAttributes);
        } catch (Throwable th2) {
            return YB.A00(RB.A03(context), th2);
        }
    }
}
