package com.yandex.mobile.ads.nativeads;

import com.ironsource.C4240b4;
import kotlin.collections.MapsKt;
import yads.d02;
import yads.d12;
import yads.e02;

/* JADX INFO: loaded from: classes12.dex */
public final class f {
    public static e02 a(NativeAdViewBinder nativeAdViewBinder) {
        d02 d02Var = new d02(nativeAdViewBinder.getNativeAdView(), d12.f109692c, MapsKt.emptyMap());
        d02Var.f109683e.put("age", nativeAdViewBinder.getAgeView());
        d02Var.f109683e.put("body", nativeAdViewBinder.getBodyView());
        d02Var.f109683e.put("call_to_action", nativeAdViewBinder.getCallToActionView());
        d02Var.f109683e.put(C4240b4.j.D, nativeAdViewBinder.getDomainView());
        d02Var.f109683e.put("favicon", nativeAdViewBinder.getFaviconView());
        d02Var.f109683e.put("feedback", nativeAdViewBinder.getFeedbackView());
        d02Var.f109683e.put("icon", nativeAdViewBinder.getIconView());
        d02Var.f109683e.put("media", nativeAdViewBinder.getMediaView());
        d02Var.f109683e.put("price", nativeAdViewBinder.getPriceView());
        d02Var.f109683e.put("rating", nativeAdViewBinder.getRatingView());
        d02Var.f109683e.put("review_count", nativeAdViewBinder.getReviewCountView());
        d02Var.f109683e.put("sponsored", nativeAdViewBinder.getSponsoredView());
        d02Var.f109683e.put("title", nativeAdViewBinder.getTitleView());
        d02Var.f109683e.put("warning", nativeAdViewBinder.getWarningView());
        return new e02(d02Var);
    }
}
