package com.appodeal.ads.adapters.admobmediation.rewarded_video;

import com.appodeal.ads.adapters.admob.unified.UnifiedAdContainer;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdRevenueListener;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends RewardedAdLoadCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UnifiedRewardedCallback f11935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UnifiedAdContainer f11936d;

    public a(UnifiedRewardedCallback unifiedRewardedCallback, UnifiedAdContainer unifiedAdContainer) {
        this.f11935c = unifiedRewardedCallback;
        this.f11936d = unifiedAdContainer;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        super.onAdFailedToLoad(error);
        this.f11935c.printError(error.getMessage(), Integer.valueOf(error.getCode()));
        this.f11935c.onAdLoadFailed(UnifiedAdmobNetwork.mapError(error));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(RewardedAd rewardedAd) {
        RewardedAd rewardedAd2 = rewardedAd;
        Intrinsics.checkNotNullParameter(rewardedAd2, "rewardedAd");
        ResponseInfo responseInfo = rewardedAd2.getResponseInfo();
        Intrinsics.checkNotNullExpressionValue(responseInfo, "getResponseInfo(...)");
        ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.admobmediation.a.a(responseInfo);
        if (impressionLevelDataA != null) {
            rewardedAd2.setOnPaidEventListener(new UnifiedAdRevenueListener(this.f11935c, rewardedAd2.getResponseInfo()));
            this.f11936d.setAd(rewardedAd2);
            this.f11935c.onAdLoaded(impressionLevelDataA);
        } else {
            UnifiedRewardedCallback unifiedRewardedCallback = this.f11935c;
            LoadingError error = LoadingError.NoFill;
            Intrinsics.checkNotNullParameter(unifiedRewardedCallback, "<this>");
            Intrinsics.checkNotNullParameter(error, "error");
            unifiedRewardedCallback.printError("Admob Mediation - custom event price limit reached", Integer.valueOf(error.getCode()));
            unifiedRewardedCallback.onAdLoadFailed(error);
        }
    }
}
