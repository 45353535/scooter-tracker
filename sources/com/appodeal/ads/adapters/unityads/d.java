package com.appodeal.ads.adapters.unityads;

import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.unity3d.ads.IUnityAdsLoadListener;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements IUnityAdsLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedFullscreenAdCallback f12564a;

    public d(UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        this.f12564a = unifiedFullscreenAdCallback;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsAdLoaded(String str) {
        this.f12564a.onAdLoaded();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    @Override // com.unity3d.ads.IUnityAdsLoadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onUnityAdsFailedToLoad(java.lang.String r1, com.unity3d.ads.UnityAds.UnityAdsLoadError r2, java.lang.String r3) {
        /*
            r0 = this;
            com.appodeal.ads.unified.UnifiedFullscreenAdCallback r1 = r0.f12564a
            r1.printError(r3, r2)
            com.appodeal.ads.unified.UnifiedFullscreenAdCallback r1 = r0.f12564a
            if (r2 != 0) goto La
            goto L21
        La:
            int[] r3 = com.appodeal.ads.adapters.unityads.b.f12558a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r3 = 1
            if (r2 == r3) goto L2f
            r3 = 2
            if (r2 == r3) goto L2c
            r3 = 3
            if (r2 == r3) goto L29
            r3 = 4
            if (r2 == r3) goto L26
            r3 = 5
            if (r2 == r3) goto L23
        L21:
            r2 = 0
            goto L31
        L23:
            com.appodeal.ads.networking.LoadingError r2 = com.appodeal.ads.networking.LoadingError.InternalError
            goto L31
        L26:
            com.appodeal.ads.networking.LoadingError r2 = com.appodeal.ads.networking.LoadingError.NoFill
            goto L31
        L29:
            com.appodeal.ads.networking.LoadingError r2 = com.appodeal.ads.networking.LoadingError.RequestVerificationFailed
            goto L31
        L2c:
            com.appodeal.ads.networking.LoadingError r2 = com.appodeal.ads.networking.LoadingError.TimeoutError
            goto L31
        L2f:
            com.appodeal.ads.networking.LoadingError r2 = com.appodeal.ads.networking.LoadingError.IncorrectAdunit
        L31:
            r1.onAdLoadFailed(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.unityads.d.onUnityAdsFailedToLoad(java.lang.String, com.unity3d.ads.UnityAds$UnityAdsLoadError, java.lang.String):void");
    }
}
