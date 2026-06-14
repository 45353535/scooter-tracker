package com.fyber.inneractive.sdk.dv.rewarded;

import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends RewardedAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f20548a;

    public a(d dVar) {
        this.f20548a = dVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        com.fyber.inneractive.sdk.dv.c cVar = this.f20548a.f20518g;
        if (cVar != null) {
            cVar.j();
            InneractiveAdRequest inneractiveAdRequest = this.f20548a.f21035a;
            String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
            com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
            d dVar = this.f20548a;
            com.fyber.inneractive.sdk.dv.handler.e.a(spotId, aVar, dVar.f21035a, (i) dVar.f21036b, loadAdError.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(RewardedAd rewardedAd) {
        RewardedAd rewardedAd2 = rewardedAd;
        d dVar = this.f20548a;
        if (dVar.f20518g != null) {
            dVar.f20520i = rewardedAd2;
            dVar.g();
            this.f20548a.f20518g.g();
        }
    }
}
