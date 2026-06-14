package com.appodeal.ads.adapters.yandex.rewarded_video;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements RewardedAdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedRewardedCallback f12638a;

    public a(UnifiedRewardedCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12638a = callback;
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public final void onAdClicked() {
        this.f12638a.onAdClicked();
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public final void onAdDismissed() {
        this.f12638a.onAdClosed();
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public final void onAdFailedToShow(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.f12638a.printError(adError.getDescription(), null);
        this.f12638a.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(adError.getDescription(), null, 2, null));
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public final void onAdImpression(ImpressionData impressionData) {
        this.f12638a.onAdRevenueReceived(com.appodeal.ads.adapters.yandex.b.a(impressionData));
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public final void onAdShown() {
        this.f12638a.onAdShown();
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public final void onRewarded(Reward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f12638a.onAdFinished();
    }
}
