package com.appodeal.ads.adapters.meta.native_ad;

import com.appodeal.ads.adapters.meta.MetaNetwork;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAdListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements NativeAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedNativeCallback f12485a;

    public a(UnifiedNativeCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12485a = callback;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.f12485a.onAdClicked();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:3:0x0005, B:5:0x000e, B:13:0x0028, B:15:0x002e, B:17:0x0034, B:19:0x003c, B:21:0x0048, B:23:0x0050, B:25:0x0058, B:7:0x0015, B:9:0x001b, B:11:0x0021), top: B:29:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:3:0x0005, B:5:0x000e, B:13:0x0028, B:15:0x002e, B:17:0x0034, B:19:0x003c, B:21:0x0048, B:23:0x0050, B:25:0x0058, B:7:0x0015, B:9:0x001b, B:11:0x0021), top: B:29:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[Catch: Exception -> 0x005e, TRY_LEAVE, TryCatch #0 {Exception -> 0x005e, blocks: (B:3:0x0005, B:5:0x000e, B:13:0x0028, B:15:0x002e, B:17:0x0034, B:19:0x003c, B:21:0x0048, B:23:0x0050, B:25:0x0058, B:7:0x0015, B:9:0x001b, B:11:0x0021), top: B:29:0x0005 }] */
    @Override // com.facebook.ads.AdListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAdLoaded(com.facebook.ads.Ad r10) {
        /*
            r9 = this;
            java.lang.String r0 = "ad"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            com.facebook.ads.NativeAdBase r10 = (com.facebook.ads.NativeAdBase) r10     // Catch: java.lang.Exception -> L5e
            android.graphics.drawable.Drawable r0 = r10.getPreloadedIconViewDrawable()     // Catch: java.lang.Exception -> L5e
            r1 = 0
            if (r0 == 0) goto L15
            com.appodeal.ads.ImageData$LocalDrawable r2 = new com.appodeal.ads.ImageData$LocalDrawable     // Catch: java.lang.Exception -> L5e
            r2.<init>(r0)     // Catch: java.lang.Exception -> L5e
        L13:
            r4 = r2
            goto L28
        L15:
            com.facebook.ads.NativeAdBase$Image r0 = r10.getAdIcon()     // Catch: java.lang.Exception -> L5e
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.getUrl()     // Catch: java.lang.Exception -> L5e
            if (r0 == 0) goto L27
            com.appodeal.ads.ImageData$Remote r2 = new com.appodeal.ads.ImageData$Remote     // Catch: java.lang.Exception -> L5e
            r2.<init>(r0)     // Catch: java.lang.Exception -> L5e
            goto L13
        L27:
            r4 = r1
        L28:
            com.facebook.ads.NativeAdBase$Image r0 = r10.getAdCoverImage()     // Catch: java.lang.Exception -> L5e
            if (r0 == 0) goto L3b
            java.lang.String r0 = r0.getUrl()     // Catch: java.lang.Exception -> L5e
            if (r0 == 0) goto L3b
            com.appodeal.ads.ImageData$Remote r2 = new com.appodeal.ads.ImageData$Remote     // Catch: java.lang.Exception -> L5e
            r2.<init>(r0)     // Catch: java.lang.Exception -> L5e
            r5 = r2
            goto L3c
        L3b:
            r5 = r1
        L3c:
            com.appodeal.ads.MediaAssets r3 = new com.appodeal.ads.MediaAssets     // Catch: java.lang.Exception -> L5e
            r7 = 4
            r8 = 0
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L5e
            boolean r0 = r10 instanceof com.facebook.ads.NativeAd     // Catch: java.lang.Exception -> L5e
            if (r0 == 0) goto L4e
            com.facebook.ads.NativeAd r10 = (com.facebook.ads.NativeAd) r10     // Catch: java.lang.Exception -> L5e
            com.appodeal.ads.adapters.meta.native_ad.c r1 = com.appodeal.ads.adapters.meta.native_ad.d.a(r10, r3)     // Catch: java.lang.Exception -> L5e
        L4e:
            if (r1 != 0) goto L58
            com.appodeal.ads.unified.UnifiedNativeCallback r10 = r9.f12485a     // Catch: java.lang.Exception -> L5e
            com.appodeal.ads.networking.LoadingError r0 = com.appodeal.ads.networking.LoadingError.NoFill     // Catch: java.lang.Exception -> L5e
            r10.onAdLoadFailed(r0)     // Catch: java.lang.Exception -> L5e
            return
        L58:
            com.appodeal.ads.unified.UnifiedNativeCallback r10 = r9.f12485a     // Catch: java.lang.Exception -> L5e
            r10.onAdLoaded(r1)     // Catch: java.lang.Exception -> L5e
            return
        L5e:
            com.appodeal.ads.unified.UnifiedNativeCallback r10 = r9.f12485a
            com.appodeal.ads.networking.LoadingError r0 = com.appodeal.ads.networking.LoadingError.InternalError
            r10.onAdLoadFailed(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.meta.native_ad.a.onAdLoaded(com.facebook.ads.Ad):void");
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        if (ad2 != null) {
            ad2.destroy();
        }
        if (adError != null) {
            this.f12485a.printError(adError.getErrorMessage(), Integer.valueOf(adError.getErrorCode()));
        }
        this.f12485a.onAdLoadFailed(MetaNetwork.mapError(adError));
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
    }

    @Override // com.facebook.ads.NativeAdListener
    public final void onMediaDownloaded(Ad ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
    }
}
