package io.bidmachine.ads.networks.mintegral;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import od.h;
import od.i;
import od.j;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class MintegralInterstitialAd extends h {

    @Nullable
    private MBBidNewInterstitialHandler mbBidNewInterstitialHandler;

    private static final class Listener implements NewInterstitialListener {

        @NonNull
        private final i callback;

        public Listener(@NonNull i iVar) {
            this.callback = iVar;
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdClicked(MBridgeIds mBridgeIds) {
            this.callback.onAdClicked();
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            this.callback.onAdClosed();
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdShow(MBridgeIds mBridgeIds) {
            this.callback.onAdShown();
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onEndcardShow(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onResourceLoadFail(MBridgeIds mBridgeIds, String str) {
            this.callback.onAdLoadFailed(MintegralAdapter.mapError(ae.a.f4247q, str));
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
            this.callback.onAdLoaded();
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onShowFail(MBridgeIds mBridgeIds, String str) {
            this.callback.onAdShowFailed(MintegralAdapter.mapError(ae.a.f4248r, str));
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onVideoComplete(MBridgeIds mBridgeIds) {
            this.callback.onAdFinished();
        }
    }

    MintegralInterstitialAd() {
    }

    @Override // od.b
    public void onDestroy() {
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.mbBidNewInterstitialHandler;
        if (mBBidNewInterstitialHandler != null) {
            mBBidNewInterstitialHandler.setInterstitialVideoListener(null);
            this.mbBidNewInterstitialHandler = null;
        }
    }

    @Override // od.h
    public void show(@NonNull ContextProvider contextProvider, @NonNull i iVar, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.mbBidNewInterstitialHandler;
        if (mBBidNewInterstitialHandler == null || !mBBidNewInterstitialHandler.isBidReady()) {
            iVar.onAdShowFailed(ae.a.i("Interstitial object is null or not loaded"));
        } else {
            this.mbBidNewInterstitialHandler.showFromBid();
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull i iVar, @NonNull j jVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        MintegralParams mintegralParams = new MintegralParams(kVar);
        if (mintegralParams.isValid(iVar)) {
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = new MBBidNewInterstitialHandler(contextProvider.getApplicationContext(), mintegralParams.placementId, mintegralParams.adUnitId);
            this.mbBidNewInterstitialHandler = mBBidNewInterstitialHandler;
            mBBidNewInterstitialHandler.setInterstitialVideoListener(new Listener(iVar));
            this.mbBidNewInterstitialHandler.loadFromBid(mintegralParams.bidToken);
        }
    }
}
