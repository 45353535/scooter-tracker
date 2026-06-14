package com.appodeal.ads.adapters.meta.rewarded_video;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.facebook.ads.RewardedVideoAd;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedRewarded {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RewardedVideoAd f12490a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(contextProvider.getApplicationContext(), ((com.appodeal.ads.adapters.meta.b) adUnitParams).f12465a);
        this.f12490a = rewardedVideoAd;
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(new a((UnifiedRewardedCallback) unifiedAdCallback)).build());
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        RewardedVideoAd rewardedVideoAd = this.f12490a;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
            this.f12490a = null;
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback unifiedRewardedCallback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        RewardedVideoAd rewardedVideoAd = this.f12490a;
        if (rewardedVideoAd == null || !rewardedVideoAd.isAdLoaded() || this.f12490a.isAdInvalidated()) {
            unifiedRewardedCallback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        } else {
            this.f12490a.show();
        }
    }
}
