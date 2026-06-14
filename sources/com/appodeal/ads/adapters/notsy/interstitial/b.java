package com.appodeal.ads.adapters.notsy.interstitial;

import android.content.Context;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.adapters.admob.interstitial.UnifiedAdmobInterstitial;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdContainer;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobAdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedAdmobInterstitial {
    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedAdmobAdUnitParams unifiedAdmobAdUnitParams = (UnifiedAdmobAdUnitParams) adUnitParams;
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedAdCallback;
        this.unifiedAdContainer = new UnifiedAdContainer<>();
        Context resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            resumedActivity = contextProvider.getApplicationContext();
        }
        AdManagerInterstitialAd.load(resumedActivity, unifiedAdmobAdUnitParams.getKey(), (AdManagerAdRequest) unifiedAdmobAdUnitParams.getRequest(), new a(unifiedInterstitialCallback, this.unifiedAdContainer));
    }
}
