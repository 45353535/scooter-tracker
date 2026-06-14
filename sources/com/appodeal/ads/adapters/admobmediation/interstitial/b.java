package com.appodeal.ads.adapters.admobmediation.interstitial;

import com.appodeal.ads.adapters.admob.interstitial.AdmobInterstitial;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdContainer;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends AdmobInterstitial {
    @Override // com.appodeal.ads.adapters.admob.interstitial.AdmobInterstitial
    public final InterstitialAdLoadCallback createLoadListener(UnifiedInterstitialCallback callback, UnifiedAdContainer unifiedAdContainer) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(unifiedAdContainer, "unifiedAdContainer");
        return new a(callback, unifiedAdContainer);
    }
}
