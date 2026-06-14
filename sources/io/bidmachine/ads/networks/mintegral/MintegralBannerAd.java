package io.bidmachine.ads.networks.mintegral;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import od.e;
import od.f;
import od.g;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class MintegralBannerAd extends e {

    @Nullable
    private MBBannerView mbBannerView;

    private static final class Listener implements BannerAdListener {

        @NonNull
        private final f callback;

        @NonNull
        private final MBBannerView mbBannerView;

        public Listener(@NonNull MBBannerView mBBannerView, @NonNull f fVar) {
            this.mbBannerView = mBBannerView;
            this.callback = fVar;
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void closeFullScreen(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onClick(MBridgeIds mBridgeIds) {
            this.callback.onAdClicked();
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onCloseBanner(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLeaveApp(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLoadFailed(MBridgeIds mBridgeIds, String str) {
            this.callback.onAdLoadFailed(MintegralAdapter.mapError(ae.a.f4247q, str));
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLoadSuccessed(MBridgeIds mBridgeIds) {
            this.callback.onAdLoaded(this.mbBannerView);
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLogImpression(MBridgeIds mBridgeIds) {
            this.callback.onAdShown();
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void showFullScreen(MBridgeIds mBridgeIds) {
        }
    }

    MintegralBannerAd() {
    }

    @NonNull
    private BannerSize toBannerSize(@NonNull u8.e eVar) {
        return eVar == u8.e.Size_300x250 ? new BannerSize(2, 0, 0) : eVar == u8.e.Size_320x50 ? new BannerSize(4, 0, 0) : new BannerSize(3, 0, 0);
    }

    @Override // od.b
    public void onDestroy() {
        MBBannerView mBBannerView = this.mbBannerView;
        if (mBBannerView != null) {
            mBBannerView.release();
            this.mbBannerView = null;
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull f fVar, @NonNull g gVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        MintegralParams mintegralParams = new MintegralParams(kVar);
        if (mintegralParams.isValid(fVar)) {
            MBBannerView mBBannerView = new MBBannerView(contextProvider.getApplicationContext());
            this.mbBannerView = mBBannerView;
            mBBannerView.init(toBannerSize(gVar.getAdRequestParameters().b()), mintegralParams.placementId, mintegralParams.adUnitId);
            this.mbBannerView.setAllowShowCloseBtn(false);
            this.mbBannerView.setRefreshTime(0);
            MBBannerView mBBannerView2 = this.mbBannerView;
            mBBannerView2.setBannerAdListener(new Listener(mBBannerView2, fVar));
            this.mbBannerView.loadFromBid(mintegralParams.bidToken);
        }
    }
}
