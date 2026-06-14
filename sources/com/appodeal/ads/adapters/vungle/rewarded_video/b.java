package com.appodeal.ads.adapters.vungle.rewarded_video;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.vungle.ads.Ad;
import com.vungle.ads.FullscreenAd;
import com.vungle.ads.RewardedAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedRewarded {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RewardedAd f12604a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedRewardedParams adTypeParams = (UnifiedRewardedParams) unifiedAdParams;
        com.appodeal.ads.adapters.vungle.a adUnitParams2 = (com.appodeal.ads.adapters.vungle.a) adUnitParams;
        UnifiedRewardedCallback callback = (UnifiedRewardedCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            callback.onAdLoadFailed(LoadingError.InternalError);
            return;
        }
        RewardedAd rewardedAd = new RewardedAd(resumedActivity, adUnitParams2.f12595a, null, 4, null);
        rewardedAd.setAdListener(new a(callback));
        Ad.DefaultImpls.load$default(rewardedAd, null, 1, null);
        this.f12604a = rewardedAd;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        RewardedAd rewardedAd = this.f12604a;
        if (rewardedAd != null) {
            rewardedAd.setAdListener(null);
        }
        this.f12604a = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback callback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        RewardedAd rewardedAd = this.f12604a;
        if (rewardedAd == null || !rewardedAd.canPlayAd().booleanValue()) {
            callback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
            return;
        }
        RewardedAd rewardedAd2 = this.f12604a;
        if (rewardedAd2 != null) {
            FullscreenAd.DefaultImpls.play$default(rewardedAd2, null, 1, null);
        }
    }
}
