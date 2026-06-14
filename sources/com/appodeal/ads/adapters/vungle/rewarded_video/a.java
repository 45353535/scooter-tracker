package com.appodeal.ads.adapters.vungle.rewarded_video;

import com.appodeal.ads.adapters.vungle.d;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.vungle.ads.BaseAd;
import com.vungle.ads.RewardedAdListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends d implements RewardedAdListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UnifiedRewardedCallback callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.vungle.ads.RewardedAdListener
    public final void onAdRewarded(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        this.f12600b.onAdFinished();
    }
}
