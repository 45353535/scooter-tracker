package com.appodeal.ads.adapters.yandex.rewarded_video;

import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements RewardedAdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f12639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnifiedRewardedCallback f12640b;

    public b(c cVar, UnifiedRewardedCallback unifiedRewardedCallback) {
        this.f12639a = cVar;
        this.f12640b = unifiedRewardedCallback;
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
    public final void onAdFailedToLoad(AdRequestError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12640b.printError(error.getDescription(), Integer.valueOf(error.getCode()));
        this.f12640b.onAdLoadFailed(com.appodeal.ads.adapters.yandex.b.b(error));
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
    public final void onAdLoaded(RewardedAd rewarded) {
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        this.f12639a.f12642b = rewarded;
        this.f12640b.onAdLoaded();
    }
}
