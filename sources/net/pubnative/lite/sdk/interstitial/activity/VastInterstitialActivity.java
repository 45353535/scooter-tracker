package net.pubnative.lite.sdk.interstitial.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import net.pubnative.lite.sdk.interstitial.viewModel.VastInterstitialViewModel;
import net.pubnative.lite.sdk.vpaid.HyBidActivityInteractor;

/* JADX INFO: loaded from: classes3.dex */
public class VastInterstitialActivity extends HyBidInterstitialActivity {
    private HyBidActivityInteractor mInteractor;

    public static /* synthetic */ void b(VastInterstitialActivity vastInterstitialActivity) {
        vastInterstitialActivity.fetchActivityInteractor();
        vastInterstitialActivity.mInteractor.activityResumed();
        vastInterstitialActivity.mViewModel.resumeAd();
    }

    public static /* synthetic */ void c(VastInterstitialActivity vastInterstitialActivity) {
        vastInterstitialActivity.fetchActivityInteractor();
        vastInterstitialActivity.mInteractor.activityPaused();
        vastInterstitialActivity.mViewModel.pauseAd();
    }

    private synchronized void fetchActivityInteractor() {
        this.mInteractor = HyBidActivityInteractor.getInstance();
    }

    @Override // net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fetchActivityInteractor();
        this.mInteractor.activityCreated();
        ((VastInterstitialViewModel) this.mViewModel).renderVastAd();
    }

    @Override // net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity, android.app.Activity
    protected void onDestroy() {
        fetchActivityInteractor();
        this.mInteractor.activityDestroyed();
        this.mViewModel.destroyAd();
        super.onDestroy();
    }

    @Override // net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity, android.app.Activity
    protected void onPause() {
        if (!this.mIsFinishing) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.interstitial.activity.a
                @Override // java.lang.Runnable
                public final void run() {
                    VastInterstitialActivity.c(this.f95857b);
                }
            }, 100L);
        }
        super.onPause();
    }

    @Override // net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.interstitial.activity.b
            @Override // java.lang.Runnable
            public final void run() {
                VastInterstitialActivity.b(this.f95858b);
            }
        }, 100L);
    }
}
