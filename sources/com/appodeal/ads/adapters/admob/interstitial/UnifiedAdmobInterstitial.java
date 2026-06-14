package com.appodeal.ads.adapters.admob.interstitial;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdContainer;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobAdUnitParams;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobFullscreenDisplayListener;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* JADX INFO: loaded from: classes6.dex */
public abstract class UnifiedAdmobInterstitial<InterstitialType extends InterstitialAd, AdRequestType extends AdRequest> extends UnifiedInterstitial<UnifiedAdmobAdUnitParams<AdRequestType>> {

    @Nullable
    protected UnifiedAdContainer<InterstitialType> unifiedAdContainer;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public void onDestroy() {
        UnifiedAdContainer<InterstitialType> unifiedAdContainer = this.unifiedAdContainer;
        if (unifiedAdContainer != null) {
            unifiedAdContainer.destroy();
            this.unifiedAdContainer = null;
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public void show(@NonNull Activity activity, @NonNull UnifiedInterstitialCallback unifiedInterstitialCallback) {
        UnifiedAdContainer<InterstitialType> unifiedAdContainer = this.unifiedAdContainer;
        InterstitialType ad2 = unifiedAdContainer != null ? unifiedAdContainer.getAd() : null;
        if (ad2 == null) {
            unifiedInterstitialCallback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        } else {
            ad2.setFullScreenContentCallback(new UnifiedAdmobFullscreenDisplayListener(unifiedInterstitialCallback));
            ad2.show(activity);
        }
    }
}
