package com.appodeal.ads.adapters.mintegral.rewarded;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements RewardVideoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedRewardedCallback f12512a;

    public a(UnifiedRewardedCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12512a = callback;
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        this.f12512a.onAdClosed();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onAdShow(MBridgeIds mBridgeIds) {
        this.f12512a.onAdShown();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onLoadSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onShowFail(MBridgeIds mBridgeIds, String str) {
        this.f12512a.printError(str, null);
        UnifiedRewardedCallback unifiedRewardedCallback = this.f12512a;
        if (str == null) {
            str = "";
        }
        unifiedRewardedCallback.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(str, null, 2, null));
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onVideoAdClicked(MBridgeIds mBridgeIds) {
        this.f12512a.onAdClicked();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
        this.f12512a.onAdFinished();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        this.f12512a.printError(str, null);
        this.f12512a.onAdLoadFailed(LoadingError.NoFill);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        this.f12512a.onAdLoaded();
    }
}
