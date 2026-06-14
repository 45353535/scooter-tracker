package io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadData;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalLoadListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalRewardedAd;
import io.bidmachine.ads.networks.gam_dynamic.NetworkParams;
import io.bidmachine.ads.networks.gam_dynamic.TaskExecutor;
import io.bidmachine.protobuf.Waterfall;

/* JADX INFO: loaded from: classes12.dex */
class d extends InternalRewardedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RewardedAd f79327a;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends RewardedAdLoadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f79328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InternalLoadListener f79329b;

        public b(d dVar, InternalLoadListener internalLoadListener) {
            this.f79328a = dVar;
            this.f79329b = internalLoadListener;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final LoadAdError loadAdError) {
            this.f79328a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79342b.a(loadAdError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(RewardedAd rewardedAd) {
            InternalAdLoadData internalAdLoadDataA = e.a(rewardedAd);
            this.f79328a.onAdLoaded(internalAdLoadDataA);
            this.f79329b.onAdLoaded(this.f79328a, internalAdLoadDataA);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(final RewardedAd rewardedAd) {
            rewardedAd.setOnPaidEventListener(new c());
            this.f79328a.f79327a = rewardedAd;
            this.f79328a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79344b.a(rewardedAd);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(LoadAdError loadAdError) {
            this.f79329b.onAdLoadFailed(this.f79328a, e.a(ae.a.f4247q, loadAdError));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements OnPaidEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f79330a;

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.f79330a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79346b.a(adValue);
                }
            });
        }

        private c(@NonNull d dVar) {
            this.f79330a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AdValue adValue) {
            this.f79330a.onPaidEvent(e.a(adValue));
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.d$d, reason: collision with other inner class name */
    private static final class C0936d implements OnUserEarnedRewardListener {
        private C0936d() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(RewardItem rewardItem) {
        }
    }

    d(NetworkParams networkParams, TaskExecutor taskExecutor, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, InternalAdListener internalAdListener) {
        super(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    protected void destroyAd() {
        RewardedAd rewardedAd = this.f79327a;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(null);
            this.f79327a.setOnPaidEventListener(null);
            this.f79327a = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    protected void loadAd(Context context, InternalLoadListener internalLoadListener) {
        RewardedAd.load(context, getAdUnitId(), e.a(getAdUnit()), (RewardedAdLoadCallback) new b(this, internalLoadListener));
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAd
    protected void showAd(Activity activity, InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        RewardedAd rewardedAd = this.f79327a;
        if (rewardedAd == null) {
            internalFullscreenAdPresentListener.onAdShowFailed(ae.a.i("Internal GAM rewarded object is null or not loaded"));
        } else {
            rewardedAd.setFullScreenContentCallback(new io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.b(internalFullscreenAdPresentListener));
            this.f79327a.show(activity, new C0936d());
        }
    }
}
