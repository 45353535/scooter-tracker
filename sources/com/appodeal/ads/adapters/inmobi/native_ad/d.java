package com.appodeal.ads.adapters.inmobi.native_ad;

import com.appodeal.ads.ImageData;
import com.appodeal.ads.MediaAssets;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    public static final c a(InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "<this>");
        InMobiNativeImage adIcon = inMobiNative.getAdIcon();
        String url = adIcon != null ? adIcon.getUrl() : null;
        if (url == null) {
            url = "";
        }
        ImageData.Remote remote = new ImageData.Remote(url);
        String adTitle = inMobiNative.getAdTitle();
        String str = adTitle == null ? "" : adTitle;
        String adDescription = inMobiNative.getAdDescription();
        String ctaText = inMobiNative.getCtaText();
        String str2 = ctaText == null ? "" : ctaText;
        MediaAssets mediaAssets = new MediaAssets(remote, null, null, 6, null);
        float adRating = inMobiNative.getAdRating();
        return new c(inMobiNative, str, adDescription, str2, mediaAssets, adRating == 0.0f ? null : Float.valueOf(adRating));
    }
}
