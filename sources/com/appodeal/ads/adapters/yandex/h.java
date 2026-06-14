package com.appodeal.ads.adapters.yandex;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import com.yandex.mobile.ads.rewarded.RewardedAdLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements RewardedAdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.adapters.yandex.rewarded_video.b f12616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RewardedAdLoader f12617b;

    public h(com.appodeal.ads.adapters.yandex.rewarded_video.b bVar, RewardedAdLoader rewardedAdLoader) {
        this.f12616a = bVar;
        this.f12617b = rewardedAdLoader;
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
    public final void onAdFailedToLoad(AdRequestError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12616a.onAdFailedToLoad(error);
        this.f12617b.setAdLoadListener(null);
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
    public final void onAdLoaded(RewardedAd rewarded) {
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        this.f12616a.onAdLoaded(rewarded);
        this.f12617b.setAdLoadListener(null);
    }
}
