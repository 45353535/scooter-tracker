package io.bidmachine.ads.networks.gam_dynamic.versions.v22_0_0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadData;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalBannerAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalLoadListener;
import io.bidmachine.ads.networks.gam_dynamic.NetworkParams;
import io.bidmachine.ads.networks.gam_dynamic.TaskExecutor;
import io.bidmachine.protobuf.Waterfall;

/* JADX INFO: loaded from: classes12.dex */
class a extends InternalBannerAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSize f79349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdManagerAdView f79350b;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends AdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f79351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InternalLoadListener f79352b;

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            InternalAdPresentListener adPresentListener = this.f79351a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdClicked();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(final LoadAdError loadAdError) {
            this.f79351a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v22_0_0.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79363b.a(loadAdError);
                }
            });
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            InternalAdPresentListener adPresentListener = this.f79351a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdShown();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            this.f79351a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v22_0_0.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79365b.a();
                }
            });
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
        }

        private b(@NonNull a aVar, @NonNull InternalLoadListener internalLoadListener) {
            this.f79351a = aVar;
            this.f79352b = internalLoadListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            InternalAdLoadData internalAdLoadDataA = e.a(this.f79351a.f79350b);
            this.f79351a.onAdLoaded(internalAdLoadDataA);
            this.f79352b.onAdLoaded(this.f79351a, internalAdLoadDataA);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(LoadAdError loadAdError) {
            this.f79352b.onAdLoadFailed(this.f79351a, e.a(ae.a.f4247q, loadAdError));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements OnPaidEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f79353a;

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.f79353a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v22_0_0.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79366b.a(adValue);
                }
            });
        }

        private c(@NonNull a aVar) {
            this.f79353a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AdValue adValue) {
            this.f79353a.onPaidEvent(e.a(adValue));
        }
    }

    a(NetworkParams networkParams, TaskExecutor taskExecutor, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, InternalAdListener internalAdListener, AdSize adSize) {
        super(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener);
        this.f79349a = adSize;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    protected void destroyAd() {
        AdManagerAdView adManagerAdView = this.f79350b;
        if (adManagerAdView != null) {
            adManagerAdView.setOnPaidEventListener(null);
            this.f79350b.destroy();
            this.f79350b = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalBannerAd
    protected View getAdView() {
        return this.f79350b;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    public void loadAd(Context context, InternalLoadListener internalLoadListener) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.f79350b = adManagerAdView;
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f79350b.setAdUnitId(getAdUnitId());
        this.f79350b.setAdListener(new b(internalLoadListener));
        this.f79350b.setOnPaidEventListener(new c());
        this.f79350b.setAdSize(this.f79349a);
        this.f79350b.loadAd(e.a(getAdUnit()));
    }
}
