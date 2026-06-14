package io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadData;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalInterstitialAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalLoadListener;
import io.bidmachine.ads.networks.gam_dynamic.NetworkParams;
import io.bidmachine.ads.networks.gam_dynamic.TaskExecutor;
import io.bidmachine.protobuf.Waterfall;

/* JADX INFO: loaded from: classes12.dex */
class c extends InternalInterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdManagerInterstitialAd f79387a;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends AdManagerInterstitialAdLoadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f79388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InternalLoadListener f79389b;

        public b(c cVar, InternalLoadListener internalLoadListener) {
            this.f79388a = cVar;
            this.f79389b = internalLoadListener;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final LoadAdError loadAdError) {
            this.f79388a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79402b.a(loadAdError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AdManagerInterstitialAd adManagerInterstitialAd) {
            InternalAdLoadData internalAdLoadDataA = e.a(adManagerInterstitialAd);
            this.f79388a.onAdLoaded(internalAdLoadDataA);
            this.f79389b.onAdLoaded(this.f79388a, internalAdLoadDataA);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(final AdManagerInterstitialAd adManagerInterstitialAd) {
            adManagerInterstitialAd.setOnPaidEventListener(new C0941c());
            this.f79388a.f79387a = adManagerInterstitialAd;
            this.f79388a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79400b.a(adManagerInterstitialAd);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(LoadAdError loadAdError) {
            this.f79389b.onAdLoadFailed(this.f79388a, e.a(ae.a.f4247q, loadAdError));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.c$c, reason: collision with other inner class name */
    static final class C0941c implements OnPaidEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f79390a;

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.f79390a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79404b.a(adValue);
                }
            });
        }

        private C0941c(@NonNull c cVar) {
            this.f79390a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AdValue adValue) {
            this.f79390a.onPaidEvent(e.a(adValue));
        }
    }

    c(NetworkParams networkParams, TaskExecutor taskExecutor, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, InternalAdListener internalAdListener) {
        super(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    protected void destroyAd() {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f79387a;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(null);
            this.f79387a.setOnPaidEventListener(null);
            this.f79387a = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    protected void loadAd(Context context, InternalLoadListener internalLoadListener) {
        AdManagerInterstitialAd.load(context, getAdUnitId(), e.a(getAdUnit()), new b(this, internalLoadListener));
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAd
    protected void showAd(Activity activity, InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f79387a;
        if (adManagerInterstitialAd == null) {
            internalFullscreenAdPresentListener.onAdShowFailed(ae.a.i("Internal GAM interstitial object is null or not loaded"));
        } else {
            adManagerInterstitialAd.setFullScreenContentCallback(new io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.b(internalFullscreenAdPresentListener));
            this.f79387a.show(activity);
        }
    }
}
