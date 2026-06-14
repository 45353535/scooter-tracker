package net.pubnative.lite.sdk.interstitial.activity;

/* JADX INFO: loaded from: classes3.dex */
public class MraidInterstitialActivity extends HyBidInterstitialActivity {
    @Override // net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity, android.app.Activity
    protected void onDestroy() {
        this.mViewModel.destroyAd();
        super.onDestroy();
    }

    @Override // net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mViewModel.pauseAd();
    }

    @Override // net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity, android.app.Activity
    protected void onResume() {
        this.mViewModel.resumeAd();
        super.onResume();
    }
}
