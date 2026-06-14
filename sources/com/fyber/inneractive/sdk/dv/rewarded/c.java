package com.fyber.inneractive.sdk.dv.rewarded;

import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements OnUserEarnedRewardListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f20550a;

    public c(d dVar) {
        this.f20550a = dVar;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public final void onUserEarnedReward(RewardItem rewardItem) {
        com.fyber.inneractive.sdk.dv.interstitial.a aVar = this.f20550a.f20109j;
        if (aVar != null) {
            aVar.onReward();
        }
    }
}
