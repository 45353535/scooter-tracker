package io.bidmachine.ads.networks.gam.versions.v22_0_0;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam.GAMLoader;
import io.bidmachine.ads.networks.gam.GAMUnitData;
import io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener;
import io.bidmachine.ads.networks.gam.InternalGAMRewardedAd;
import io.bidmachine.ads.networks.gam.InternalLoadListener;

/* JADX INFO: loaded from: classes12.dex */
class e extends InternalGAMRewardedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RewardedAd f79259a;

    private static final class b extends RewardedAdLoadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f79260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InternalLoadListener f79261b;

        public b(e eVar, InternalLoadListener internalLoadListener) {
            this.f79260a = eVar;
            this.f79261b = internalLoadListener;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            this.f79261b.onAdLoadFailed(this.f79260a, new ae.a(ae.a.f4247q, loadAdError.getCode(), loadAdError.getMessage()));
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(RewardedAd rewardedAd) {
            this.f79260a.f79259a = rewardedAd;
            this.f79260a.onAdLoaded();
            this.f79261b.onAdLoaded(this.f79260a);
        }
    }

    private static final class c implements OnUserEarnedRewardListener {
        private c() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(RewardItem rewardItem) {
        }
    }

    e(GAMLoader gAMLoader, AdsFormat adsFormat, GAMUnitData gAMUnitData) {
        super(gAMLoader, adsFormat, gAMUnitData);
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    protected void destroyAd() {
        RewardedAd rewardedAd = this.f79259a;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(null);
            this.f79259a = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    protected void loadAd(Context context, InternalLoadListener internalLoadListener) {
        RewardedAd.load(context, getAdUnitId(), io.bidmachine.ads.networks.gam.versions.v22_0_0.a.a(getGamLoader(), getGamUnitData()), (RewardedAdLoadCallback) new b(this, internalLoadListener));
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAd
    protected void showAd(Activity activity, InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) {
        RewardedAd rewardedAd = this.f79259a;
        if (rewardedAd == null) {
            internalGAMFullscreenAdPresentListener.onAdShowFailed(ae.a.i("InternalGAM rewarded object is null or not loaded"));
        } else {
            rewardedAd.setFullScreenContentCallback(new io.bidmachine.ads.networks.gam.versions.v22_0_0.b(internalGAMFullscreenAdPresentListener));
            this.f79259a.show(activity, new c());
        }
    }
}
