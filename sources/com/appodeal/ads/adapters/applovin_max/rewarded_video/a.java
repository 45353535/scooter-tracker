package com.appodeal.ads.adapters.applovin_max.rewarded_video;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.appodeal.ads.adapters.applovin_max.j;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends j implements MaxRewardedAdListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final UnifiedRewardedCallback f12070f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UnifiedRewardedCallback callback, String countryCode) {
        super(callback, countryCode);
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f12070f = callback;
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public final void onUserRewarded(MaxAd maxAd, MaxReward reward) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f12070f.onAdFinished();
    }
}
