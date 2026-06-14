package io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0;

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
    private final AdSize f79317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdManagerAdView f79318b;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends AdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f79319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InternalLoadListener f79320b;

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            InternalAdPresentListener adPresentListener = this.f79319a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdClicked();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(final LoadAdError loadAdError) {
            this.f79319a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79332b.a(loadAdError);
                }
            });
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            InternalAdPresentListener adPresentListener = this.f79319a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdShown();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            this.f79319a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79331b.a();
                }
            });
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
        }

        private b(@NonNull a aVar, @NonNull InternalLoadListener internalLoadListener) {
            this.f79319a = aVar;
            this.f79320b = internalLoadListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            InternalAdLoadData internalAdLoadDataA = e.a(this.f79319a.f79318b);
            this.f79319a.onAdLoaded(internalAdLoadDataA);
            this.f79320b.onAdLoaded(this.f79319a, internalAdLoadDataA);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(LoadAdError loadAdError) {
            this.f79320b.onAdLoadFailed(this.f79319a, e.a(ae.a.f4247q, loadAdError));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements OnPaidEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f79321a;

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.f79321a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79334b.a(adValue);
                }
            });
        }

        private c(@NonNull a aVar) {
            this.f79321a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AdValue adValue) {
            this.f79321a.onPaidEvent(e.a(adValue));
        }
    }

    a(NetworkParams networkParams, TaskExecutor taskExecutor, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, InternalAdListener internalAdListener, AdSize adSize) {
        super(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener);
        this.f79317a = adSize;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    protected void destroyAd() {
        AdManagerAdView adManagerAdView = this.f79318b;
        if (adManagerAdView != null) {
            adManagerAdView.setOnPaidEventListener(null);
            this.f79318b.destroy();
            this.f79318b = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalBannerAd
    protected View getAdView() {
        return this.f79318b;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    public void loadAd(Context context, InternalLoadListener internalLoadListener) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.f79318b = adManagerAdView;
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f79318b.setAdUnitId(getAdUnitId());
        this.f79318b.setAdListener(new b(internalLoadListener));
        this.f79318b.setOnPaidEventListener(new c());
        this.f79318b.setAdSize(this.f79317a);
        this.f79318b.loadAd(e.a(getAdUnit()));
    }
}
