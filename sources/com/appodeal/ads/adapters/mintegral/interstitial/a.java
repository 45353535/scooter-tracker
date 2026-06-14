package com.appodeal.ads.adapters.mintegral.interstitial;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements NewInterstitialListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedInterstitialCallback f12501a;

    public a(UnifiedInterstitialCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12501a = callback;
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdClicked(MBridgeIds mBridgeIds) {
        this.f12501a.onAdClicked();
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        this.f12501a.onAdClosed();
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdShow(MBridgeIds mBridgeIds) {
        this.f12501a.onAdShown();
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onResourceLoadFail(MBridgeIds mBridgeIds, String str) {
        this.f12501a.printError(str, null);
        this.f12501a.onAdLoadFailed(LoadingError.NoFill);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
        this.f12501a.onAdLoaded();
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onShowFail(MBridgeIds mBridgeIds, String str) {
        this.f12501a.printError(str, null);
        UnifiedInterstitialCallback unifiedInterstitialCallback = this.f12501a;
        if (str == null) {
            str = "";
        }
        unifiedInterstitialCallback.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(str, null, 2, null));
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
        this.f12501a.onAdFinished();
    }
}
