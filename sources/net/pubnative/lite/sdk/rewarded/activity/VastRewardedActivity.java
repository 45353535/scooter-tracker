package net.pubnative.lite.sdk.rewarded.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import net.pubnative.lite.sdk.rewarded.viewModel.VastRewardedViewModel;
import net.pubnative.lite.sdk.vpaid.HyBidActivityInteractor;

/* JADX INFO: loaded from: classes3.dex */
public class VastRewardedActivity extends HyBidRewardedActivity {
    private HyBidActivityInteractor mInteractor;

    public static /* synthetic */ void b(VastRewardedActivity vastRewardedActivity) {
        vastRewardedActivity.fetchActivityInteractor();
        vastRewardedActivity.mInteractor.activityPaused();
        vastRewardedActivity.mViewModel.pauseAd();
    }

    public static /* synthetic */ void c(VastRewardedActivity vastRewardedActivity) {
        vastRewardedActivity.fetchActivityInteractor();
        vastRewardedActivity.mInteractor.activityResumed();
        vastRewardedActivity.mViewModel.resumeAd();
    }

    private synchronized void fetchActivityInteractor() {
        this.mInteractor = HyBidActivityInteractor.getInstance();
    }

    @Override // net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((VastRewardedViewModel) this.mViewModel).renderVastAd();
    }

    @Override // net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity, android.app.Activity
    protected void onDestroy() {
        fetchActivityInteractor();
        this.mInteractor.activityDestroyed();
        this.mViewModel.destroyAd();
        super.onDestroy();
    }

    @Override // net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity, android.app.Activity
    protected void onPause() {
        if (!this.mIsFinishing) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.rewarded.activity.a
                @Override // java.lang.Runnable
                public final void run() {
                    VastRewardedActivity.b(this.f95957b);
                }
            }, 100L);
        }
        super.onPause();
    }

    @Override // net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.rewarded.activity.b
            @Override // java.lang.Runnable
            public final void run() {
                VastRewardedActivity.c(this.f95958b);
            }
        }, 100L);
    }
}
