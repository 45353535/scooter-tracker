package com.appodeal.ads.adapters.applovin.rewarded_video;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.appodeal.ads.adapters.applovin.e;
import com.appodeal.ads.unified.UnifiedRewardedCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends e implements AppLovinAdDisplayListener, AppLovinAdVideoPlaybackListener {
    public a(UnifiedRewardedCallback unifiedRewardedCallback) {
        super(unifiedRewardedCallback);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public final void adDisplayed(AppLovinAd appLovinAd) {
        ((UnifiedRewardedCallback) this.f11967b).onAdShown();
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public final void adHidden(AppLovinAd appLovinAd) {
        ((UnifiedRewardedCallback) this.f11967b).onAdClosed();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public final void adReceived(AppLovinAd appLovinAd) {
        ((UnifiedRewardedCallback) this.f11967b).onAdLoaded();
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public final void videoPlaybackBegan(AppLovinAd appLovinAd) {
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public final void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
        if (z10) {
            ((UnifiedRewardedCallback) this.f11967b).onAdFinished();
        }
    }
}
