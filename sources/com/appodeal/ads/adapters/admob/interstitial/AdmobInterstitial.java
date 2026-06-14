package com.appodeal.ads.adapters.admob.interstitial;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdContainer;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobAdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes6.dex */
public class AdmobInterstitial extends UnifiedAdmobInterstitial<InterstitialAd, AdRequest> {
    @NonNull
    public InterstitialAdLoadCallback createLoadListener(@NonNull UnifiedInterstitialCallback unifiedInterstitialCallback, @NonNull UnifiedAdContainer<InterstitialAd> unifiedAdContainer) {
        return new a(unifiedInterstitialCallback, unifiedAdContainer);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedInterstitialParams unifiedInterstitialParams, @NonNull UnifiedAdmobAdUnitParams<AdRequest> unifiedAdmobAdUnitParams, @NonNull UnifiedInterstitialCallback unifiedInterstitialCallback) {
        this.unifiedAdContainer = new UnifiedAdContainer<>();
        Context resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            resumedActivity = contextProvider.getApplicationContext();
        }
        InterstitialAd.load(resumedActivity, unifiedAdmobAdUnitParams.getKey(), unifiedAdmobAdUnitParams.getRequest(), createLoadListener(unifiedInterstitialCallback, this.unifiedAdContainer));
    }
}
