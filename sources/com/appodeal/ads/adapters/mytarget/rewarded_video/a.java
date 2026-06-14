package com.appodeal.ads.adapters.mytarget.rewarded_video;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.my.target.ads.RewardedAd;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends UnifiedRewarded {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RewardedAd f12551a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        com.appodeal.ads.adapters.mytarget.a aVar = (com.appodeal.ads.adapters.mytarget.a) adUnitParams;
        RewardedAd rewardedAd = new RewardedAd(aVar.f12540a, contextProvider.getApplicationContext());
        this.f12551a = rewardedAd;
        aVar.a(rewardedAd.getCustomParams());
        this.f12551a.setListener(new b((UnifiedRewardedCallback) unifiedAdCallback));
        this.f12551a.load();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        RewardedAd rewardedAd = this.f12551a;
        if (rewardedAd != null) {
            rewardedAd.destroy();
            this.f12551a = null;
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback unifiedRewardedCallback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        RewardedAd rewardedAd = this.f12551a;
        if (rewardedAd != null) {
            rewardedAd.show();
        } else {
            unifiedRewardedCallback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        }
    }
}
