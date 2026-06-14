package com.appodeal.ads.adapters.meta.native_ad;

import com.appodeal.ads.MediaAssets;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    public static final c a(NativeAd nativeAd, MediaAssets mediaAssets) {
        Intrinsics.checkNotNullParameter(nativeAd, "<this>");
        Intrinsics.checkNotNullParameter(mediaAssets, "mediaAssets");
        String advertiserName = nativeAd.getAdvertiserName();
        String str = advertiserName == null ? "" : advertiserName;
        String adBodyText = nativeAd.getAdBodyText();
        String str2 = adBodyText == null ? "" : adBodyText;
        String adCallToAction = nativeAd.getAdCallToAction();
        String str3 = adCallToAction == null ? "" : adCallToAction;
        NativeAdBase.Rating adStarRating = nativeAd.getAdStarRating();
        return new c(mediaAssets, nativeAd, str, str2, str3, adStarRating != null ? Float.valueOf((float) adStarRating.getValue()) : null);
    }
}
