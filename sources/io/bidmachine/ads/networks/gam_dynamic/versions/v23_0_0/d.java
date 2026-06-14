package io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0;

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
    private RewardedAd f79391a;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends RewardedAdLoadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f79392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InternalLoadListener f79393b;

        public b(d dVar, InternalLoadListener internalLoadListener) {
            this.f79392a = dVar;
            this.f79393b = internalLoadListener;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final LoadAdError loadAdError) {
            this.f79392a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79406b.a(loadAdError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(RewardedAd rewardedAd) {
            InternalAdLoadData internalAdLoadDataA = e.a(rewardedAd);
            this.f79392a.onAdLoaded(internalAdLoadDataA);
            this.f79393b.onAdLoaded(this.f79392a, internalAdLoadDataA);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(final RewardedAd rewardedAd) {
            rewardedAd.setOnPaidEventListener(new c());
            this.f79392a.f79391a = rewardedAd;
            this.f79392a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79408b.a(rewardedAd);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(LoadAdError loadAdError) {
            this.f79393b.onAdLoadFailed(this.f79392a, e.a(ae.a.f4247q, loadAdError));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements OnPaidEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f79394a;

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.f79394a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79410b.a(adValue);
                }
            });
        }

        private c(@NonNull d dVar) {
            this.f79394a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AdValue adValue) {
            this.f79394a.onPaidEvent(e.a(adValue));
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.d$d, reason: collision with other inner class name */
    private static final class C0942d implements OnUserEarnedRewardListener {
        private C0942d() {
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
        RewardedAd rewardedAd = this.f79391a;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(null);
            this.f79391a.setOnPaidEventListener(null);
            this.f79391a = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    protected void loadAd(Context context, InternalLoadListener internalLoadListener) {
        RewardedAd.load(context, getAdUnitId(), e.a(getAdUnit()), (RewardedAdLoadCallback) new b(this, internalLoadListener));
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAd
    protected void showAd(Activity activity, InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        RewardedAd rewardedAd = this.f79391a;
        if (rewardedAd == null) {
            internalFullscreenAdPresentListener.onAdShowFailed(ae.a.i("Internal GAM rewarded object is null or not loaded"));
        } else {
            rewardedAd.setFullScreenContentCallback(new io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.b(internalFullscreenAdPresentListener));
            this.f79391a.show(activity, new C0942d());
        }
    }
}
