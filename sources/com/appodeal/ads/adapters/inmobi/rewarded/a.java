package com.appodeal.ads.adapters.inmobi.rewarded;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends InterstitialAdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedRewardedCallback f12364a;

    public a(UnifiedRewardedCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12364a = callback;
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdClicked(InMobiInterstitial inMobiInterstitial, Map map) {
        InMobiInterstitial rewarded = inMobiInterstitial;
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        Intrinsics.checkNotNullParameter(map, "map");
        this.f12364a.onAdClicked();
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDismissed(InMobiInterstitial rewarded) {
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        this.f12364a.onAdClosed();
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDisplayFailed(InMobiInterstitial rewarded) {
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        this.f12364a.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback());
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDisplayed(InMobiInterstitial rewarded, AdMetaInfo adMetaInfo) {
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        Intrinsics.checkNotNullParameter(adMetaInfo, "adMetaInfo");
        this.f12364a.onAdShown();
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus requestStatus) {
        InMobiInterstitial rewarded = inMobiInterstitial;
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        this.f12364a.printError(requestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String(), requestStatus.getStatusCode());
        this.f12364a.onAdLoadFailed(LoadingError.NoFill);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        InMobiInterstitial rewarded = inMobiInterstitial;
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        Intrinsics.checkNotNullParameter(adMetaInfo, "adMetaInfo");
        ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.inmobi.a.a(adMetaInfo);
        this.f12364a.onAdRevenueReceived(impressionLevelDataA);
        this.f12364a.onAdLoaded(impressionLevelDataA);
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onRewardsUnlocked(InMobiInterstitial rewarded, Map map) {
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        Intrinsics.checkNotNullParameter(map, "map");
        this.f12364a.onAdFinished();
    }
}
