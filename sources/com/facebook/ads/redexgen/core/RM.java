package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.api.NativeAdViewApi;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RM implements NativeAdViewApi {
    public static View A00(C2820dL c2820dL, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C2480Ur c2480Ur = (C2480Ur) nativeAdViewAttributes.getInternalAttributes();
        C2363Qc internalNativeAd = C2363Qc.A0L(nativeAd.getInternalNativeAd());
        internalNativeAd.A1a(EnumC2481Us.A00(type.getEnumCode()));
        internalNativeAd.A1Z(c2480Ur);
        C6Q c6q = new C6Q();
        NativeAdLayout mediumRectTemplateLayout = new NativeAdLayout(c2820dL, c6q);
        c6q.A06(mediumRectTemplateLayout, c2820dL, nativeAd, c2480Ur);
        mediumRectTemplateLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (AbstractC2523Wl.A02 * type.getHeight())));
        return mediumRectTemplateLayout;
    }

    public static View A01(C2820dL c2820dL, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C2363Qc c2363QcA0L = C2363Qc.A0L(nativeAd.getInternalNativeAd());
        C2480Ur c2480Ur = (C2480Ur) nativeAdViewAttributes.getInternalAttributes();
        c2363QcA0L.A1a(EnumC2481Us.A0B);
        c2363QcA0L.A1Z(c2480Ur);
        C6Q c6q = new C6Q();
        NativeAdLayout nativeAdLayout = new NativeAdLayout(c2820dL, c6q);
        c6q.A06(nativeAdLayout, c2820dL, nativeAd, c2480Ur);
        return nativeAdLayout;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd) {
        return render(context, nativeAd, (NativeAdViewAttributes) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type) {
        return render(context, nativeAd, type, null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        try {
            return A00(RB.A03(context), nativeAd, type, nativeAdViewAttributes);
        } catch (Throwable th2) {
            return YB.A00(RB.A03(context), th2);
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        C2820dL contextWrapper;
        try {
            if (context instanceof C2820dL) {
                contextWrapper = (C2820dL) context;
            } else {
                contextWrapper = RB.A03(context);
            }
            return A01(contextWrapper, nativeAd, nativeAdViewAttributes);
        } catch (Throwable th2) {
            return YB.A00(RB.A03(context), th2);
        }
    }
}
