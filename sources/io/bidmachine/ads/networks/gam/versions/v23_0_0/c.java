package io.bidmachine.ads.networks.gam.versions.v23_0_0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam.GAMLoader;
import io.bidmachine.ads.networks.gam.GAMUnitData;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener;
import io.bidmachine.ads.networks.gam.InternalGAMBannerAd;
import io.bidmachine.ads.networks.gam.InternalLoadListener;

/* JADX INFO: loaded from: classes12.dex */
class c extends InternalGAMBannerAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSize f79264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdManagerAdView f79265b;

    private static final class b extends AdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InternalGAMAd f79266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InternalLoadListener f79267b;

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            InternalGAMAdPresentListener adPresentListener = this.f79266a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdClicked();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            this.f79267b.onAdLoadFailed(this.f79266a, new ae.a(ae.a.f4247q, loadAdError.getCode(), loadAdError.getMessage()));
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            InternalGAMAdPresentListener adPresentListener = this.f79266a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdShown();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            this.f79266a.onAdLoaded();
            this.f79267b.onAdLoaded(this.f79266a);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
        }

        private b(@NonNull InternalGAMAd internalGAMAd, @NonNull InternalLoadListener internalLoadListener) {
            this.f79266a = internalGAMAd;
            this.f79267b = internalLoadListener;
        }
    }

    c(GAMLoader gAMLoader, AdsFormat adsFormat, GAMUnitData gAMUnitData, AdSize adSize) {
        super(gAMLoader, adsFormat, gAMUnitData);
        this.f79264a = adSize;
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    protected void destroyAd() {
        AdManagerAdView adManagerAdView = this.f79265b;
        if (adManagerAdView != null) {
            adManagerAdView.destroy();
            this.f79265b = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMBannerAd
    protected View getAdView() {
        return this.f79265b;
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    public void loadAd(Context context, InternalLoadListener internalLoadListener) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.f79265b = adManagerAdView;
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f79265b.setAdUnitId(getAdUnitId());
        this.f79265b.setAdListener(new b(this, internalLoadListener));
        this.f79265b.setAdSize(this.f79264a);
        this.f79265b.loadAd(io.bidmachine.ads.networks.gam.versions.v23_0_0.a.a(getGamLoader(), getGamUnitData()));
    }
}
