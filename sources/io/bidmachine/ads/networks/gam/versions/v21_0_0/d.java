package io.bidmachine.ads.networks.gam.versions.v21_0_0;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam.GAMLoader;
import io.bidmachine.ads.networks.gam.GAMUnitData;
import io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener;
import io.bidmachine.ads.networks.gam.InternalGAMInterstitialAd;
import io.bidmachine.ads.networks.gam.InternalLoadListener;

/* JADX INFO: loaded from: classes12.dex */
class d extends InternalGAMInterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdManagerInterstitialAd f79244a;

    private static final class a extends AdManagerInterstitialAdLoadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f79245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InternalLoadListener f79246b;

        public a(d dVar, InternalLoadListener internalLoadListener) {
            this.f79245a = dVar;
            this.f79246b = internalLoadListener;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            this.f79246b.onAdLoadFailed(this.f79245a, new ae.a(ae.a.f4247q, loadAdError.getCode(), loadAdError.getMessage()));
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
            this.f79245a.f79244a = adManagerInterstitialAd;
            this.f79245a.onAdLoaded();
            this.f79246b.onAdLoaded(this.f79245a);
        }
    }

    d(GAMLoader gAMLoader, AdsFormat adsFormat, GAMUnitData gAMUnitData) {
        super(gAMLoader, adsFormat, gAMUnitData);
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    protected void destroyAd() {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f79244a;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(null);
            this.f79244a = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    protected void loadAd(Context context, InternalLoadListener internalLoadListener) {
        AdManagerInterstitialAd.load(context, getAdUnitId(), io.bidmachine.ads.networks.gam.versions.v21_0_0.a.a(getGamLoader(), getGamUnitData()), new a(this, internalLoadListener));
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAd
    protected void showAd(Activity activity, InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f79244a;
        if (adManagerInterstitialAd == null) {
            internalGAMFullscreenAdPresentListener.onAdShowFailed(ae.a.i("InternalGAM interstitial object is null or not loaded"));
        } else {
            adManagerInterstitialAd.setFullScreenContentCallback(new b(internalGAMFullscreenAdPresentListener));
            this.f79244a.show(activity);
        }
    }
}
