package com.fyber.inneractive.sdk.dv.rewarded;

import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends RewardedAdCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f20555a;

    public f(g gVar) {
        this.f20555a = gVar;
    }

    public final void onRewardedAdClosed() {
        com.fyber.inneractive.sdk.dv.interstitial.a aVar = this.f20555a.f20109j;
        if (aVar != null) {
            aVar.h();
        }
    }

    public final void onRewardedAdFailedToShow(int i10) {
    }

    public final void onRewardedAdOpened() {
        com.fyber.inneractive.sdk.dv.interstitial.a aVar = this.f20555a.f20109j;
        if (aVar != null) {
            aVar.w();
        }
    }

    public final void onUserEarnedReward(RewardItem rewardItem) {
        com.fyber.inneractive.sdk.dv.interstitial.a aVar = this.f20555a.f20109j;
        if (aVar != null) {
            aVar.onReward();
        }
    }
}
