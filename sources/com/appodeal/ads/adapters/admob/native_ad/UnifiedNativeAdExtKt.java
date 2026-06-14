package com.appodeal.ads.adapters.admob.native_ad;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toUnifiedNativeAd", "Lcom/appodeal/ads/unified/UnifiedNativeAd;", "Lcom/google/android/gms/ads/nativead/NativeAd;", "admob_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UnifiedNativeAdExtKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.appodeal.ads.unified.UnifiedNativeAd toUnifiedNativeAd(@org.jetbrains.annotations.NotNull final com.google.android.gms.ads.nativead.NativeAd r13) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            com.google.android.gms.ads.nativead.NativeAd$Image r0 = r13.getIcon()
            r1 = 0
            if (r0 == 0) goto L2f
            android.graphics.drawable.Drawable r2 = r0.getDrawable()
            if (r2 == 0) goto L19
            com.appodeal.ads.ImageData$LocalDrawable r0 = new com.appodeal.ads.ImageData$LocalDrawable
            r0.<init>(r2)
            r5 = r0
            goto L30
        L19:
            android.net.Uri r0 = r0.getUri()
            if (r0 == 0) goto L2f
            com.appodeal.ads.ImageData$Remote r2 = new com.appodeal.ads.ImageData$Remote
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r2.<init>(r0)
            r5 = r2
            goto L30
        L2f:
            r5 = r1
        L30:
            java.lang.String r0 = r13.getHeadline()
            java.lang.String r2 = ""
            if (r0 != 0) goto L39
            r0 = r2
        L39:
            java.lang.String r3 = r13.getBody()
            if (r3 != 0) goto L40
            r3 = r2
        L40:
            java.lang.String r4 = r13.getCallToAction()
            if (r4 != 0) goto L48
            r10 = r2
            goto L49
        L48:
            r10 = r4
        L49:
            com.appodeal.ads.MediaAssets r4 = new com.appodeal.ads.MediaAssets
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Double r2 = r13.getStarRating()
            if (r2 == 0) goto L61
            double r1 = r2.doubleValue()
            float r1 = (float) r1
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
        L61:
            r12 = r1
            com.appodeal.ads.adapters.admob.native_ad.UnifiedNativeAdExtKt$toUnifiedNativeAd$1 r6 = new com.appodeal.ads.adapters.admob.native_ad.UnifiedNativeAdExtKt$toUnifiedNativeAd$1
            r7 = r13
            r8 = r0
            r9 = r3
            r11 = r4
            r6.<init>(r8, r9, r10, r11, r12)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.admob.native_ad.UnifiedNativeAdExtKt.toUnifiedNativeAd(com.google.android.gms.ads.nativead.NativeAd):com.appodeal.ads.unified.UnifiedNativeAd");
    }
}
