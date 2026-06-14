package com.appodeal.ads.adapters.bigo_ads.rewarded;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import kotlin.jvm.internal.Intrinsics;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.RewardAdInteractionListener;
import sg.bigo.ads.api.RewardVideoAd;
import sg.bigo.ads.api.RewardVideoAdLoader;
import sg.bigo.ads.api.RewardVideoAdRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedRewarded {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RewardVideoAd f12177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f12178b;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedRewardedParams adTypeParams = (UnifiedRewardedParams) unifiedAdParams;
        com.appodeal.ads.adapters.bigo_ads.b adUnitParams2 = (com.appodeal.ads.adapters.bigo_ads.b) adUnitParams;
        UnifiedRewardedCallback callback = (UnifiedRewardedCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12178b = new a(this, callback);
        RewardVideoAdRequest rewardVideoAdRequestBuild = new RewardVideoAdRequest.Builder().withSlotId(adUnitParams2.f12156a).build();
        RewardVideoAdLoader rewardVideoAdLoaderBuild = new RewardVideoAdLoader.Builder().withAdLoadListener((AdLoadListener<RewardVideoAd>) this.f12178b).build();
        Intrinsics.checkNotNullExpressionValue(rewardVideoAdLoaderBuild, "build(...)");
        rewardVideoAdLoaderBuild.loadAd(rewardVideoAdRequestBuild);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        RewardVideoAd rewardVideoAd = this.f12177a;
        if (rewardVideoAd != null) {
            rewardVideoAd.destroy();
        }
        this.f12177a = null;
        this.f12178b = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback callback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        RewardVideoAd rewardVideoAd = this.f12177a;
        if (rewardVideoAd == null || rewardVideoAd.isExpired()) {
            callback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        } else {
            rewardVideoAd.setAdInteractionListener((RewardAdInteractionListener) this.f12178b);
            rewardVideoAd.show();
        }
    }
}
