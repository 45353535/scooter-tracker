package com.appodeal.ads.adapters.admob.rewarded_video;

import com.appodeal.ads.adapters.admob.unified.UnifiedAdContainer;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdRevenueListener;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends RewardedAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnifiedAdContainer f11915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnifiedRewardedCallback f11916b;

    public a(UnifiedRewardedCallback unifiedRewardedCallback, UnifiedAdContainer unifiedAdContainer) {
        this.f11915a = unifiedAdContainer;
        this.f11916b = unifiedRewardedCallback;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        this.f11916b.printError(loadAdError.getMessage(), Integer.valueOf(loadAdError.getCode()));
        this.f11916b.onAdLoadFailed(UnifiedAdmobNetwork.mapError(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(RewardedAd rewardedAd) {
        RewardedAd rewardedAd2 = rewardedAd;
        super.onAdLoaded(rewardedAd2);
        this.f11915a.setAd(rewardedAd2);
        rewardedAd2.setOnPaidEventListener(new UnifiedAdRevenueListener(this.f11916b, rewardedAd2.getResponseInfo()));
        this.f11916b.onAdLoaded();
    }
}
