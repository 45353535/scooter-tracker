package io.bidmachine.ads.networks.mintegral;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoListener;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import od.h;
import od.i;
import od.j;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class MintegralRewardedAd extends h {

    @Nullable
    private MBBidRewardVideoHandler mbBidRewardVideoHandler;

    private static final class Listener implements RewardVideoListener {

        @NonNull
        private final i callback;

        public Listener(@NonNull i iVar) {
            this.callback = iVar;
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            this.callback.onAdClosed();
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onAdShow(MBridgeIds mBridgeIds) {
            this.callback.onAdShown();
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onEndcardShow(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onLoadSuccess(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onShowFail(MBridgeIds mBridgeIds, String str) {
            this.callback.onAdShowFailed(MintegralAdapter.mapError(ae.a.f4248r, str));
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onVideoAdClicked(MBridgeIds mBridgeIds) {
            this.callback.onAdClicked();
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onVideoComplete(MBridgeIds mBridgeIds) {
            this.callback.onAdFinished();
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
            this.callback.onAdLoadFailed(MintegralAdapter.mapError(ae.a.f4247q, str));
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
            this.callback.onAdLoaded();
        }
    }

    MintegralRewardedAd() {
    }

    @Override // od.b
    public void onDestroy() {
        MBBidRewardVideoHandler mBBidRewardVideoHandler = this.mbBidRewardVideoHandler;
        if (mBBidRewardVideoHandler != null) {
            mBBidRewardVideoHandler.setRewardVideoListener(null);
            this.mbBidRewardVideoHandler = null;
        }
    }

    @Override // od.h
    public void show(@NonNull ContextProvider contextProvider, @NonNull i iVar, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        MBBidRewardVideoHandler mBBidRewardVideoHandler = this.mbBidRewardVideoHandler;
        if (mBBidRewardVideoHandler == null || !mBBidRewardVideoHandler.isBidReady()) {
            iVar.onAdShowFailed(ae.a.i("Rewarded object is null or not loaded"));
        } else {
            this.mbBidRewardVideoHandler.showFromBid();
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull i iVar, @NonNull j jVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        MintegralParams mintegralParams = new MintegralParams(kVar);
        if (mintegralParams.isValid(iVar)) {
            MBBidRewardVideoHandler mBBidRewardVideoHandler = new MBBidRewardVideoHandler(contextProvider.getApplicationContext(), mintegralParams.placementId, mintegralParams.adUnitId);
            this.mbBidRewardVideoHandler = mBBidRewardVideoHandler;
            mBBidRewardVideoHandler.setRewardVideoListener(new Listener(iVar));
            this.mbBidRewardVideoHandler.loadFromBid(mintegralParams.bidToken);
        }
    }
}
