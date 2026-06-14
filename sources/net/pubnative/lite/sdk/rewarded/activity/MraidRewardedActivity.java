package net.pubnative.lite.sdk.rewarded.activity;

/* JADX INFO: loaded from: classes3.dex */
public class MraidRewardedActivity extends HyBidRewardedActivity {
    @Override // net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity, android.app.Activity
    protected void onDestroy() {
        this.mViewModel.destroyAd();
        super.onDestroy();
    }

    @Override // net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mViewModel.pauseAd();
    }

    @Override // net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity, android.app.Activity
    protected void onResume() {
        this.mViewModel.resumeAd();
        super.onResume();
    }
}
