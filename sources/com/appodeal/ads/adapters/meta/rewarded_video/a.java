package com.appodeal.ads.adapters.meta.rewarded_video;

import com.appodeal.ads.adapters.meta.MetaNetwork;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdListener;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements RewardedVideoAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedRewardedCallback f12489a;

    public a(UnifiedRewardedCallback unifiedRewardedCallback) {
        this.f12489a = unifiedRewardedCallback;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        this.f12489a.onAdClicked();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        this.f12489a.onAdLoaded();
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        if (ad2 != null) {
            ad2.destroy();
        }
        if (adError != null) {
            this.f12489a.printError(adError.getErrorMessage(), Integer.valueOf(adError.getErrorCode()));
        }
        this.f12489a.onAdLoadFailed(MetaNetwork.mapError(adError));
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        this.f12489a.onAdShown();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        this.f12489a.onAdClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.f12489a.onAdFinished();
    }
}
