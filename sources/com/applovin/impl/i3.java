package com.applovin.impl;

import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i3 implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0175a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.InterfaceC0175a f9070a;

    public i3(a.InterfaceC0175a interfaceC0175a) {
        this.f9070a = interfaceC0175a;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        t2.a((MaxAdListener) this.f9070a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        t2.b(this.f9070a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        t2.a(this.f9070a, maxAd, maxError);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        t2.c(this.f9070a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        t2.d(this.f9070a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        t2.e(this.f9070a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdRequestListener
    public void onAdRequestStarted(String str) {
        t2.a(this.f9070a, str);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        t2.a((MaxAdRevenueListener) this.f9070a, maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        t2.a(this.f9070a, maxAd, maxReward);
    }
}
