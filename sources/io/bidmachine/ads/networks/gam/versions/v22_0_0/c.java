package io.bidmachine.ads.networks.gam.versions.v22_0_0;

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
    private final AdSize f79252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdManagerAdView f79253b;

    private static final class b extends AdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InternalGAMAd f79254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InternalLoadListener f79255b;

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            InternalGAMAdPresentListener adPresentListener = this.f79254a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdClicked();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            this.f79255b.onAdLoadFailed(this.f79254a, new ae.a(ae.a.f4247q, loadAdError.getCode(), loadAdError.getMessage()));
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            InternalGAMAdPresentListener adPresentListener = this.f79254a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdShown();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            this.f79254a.onAdLoaded();
            this.f79255b.onAdLoaded(this.f79254a);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
        }

        private b(@NonNull InternalGAMAd internalGAMAd, @NonNull InternalLoadListener internalLoadListener) {
            this.f79254a = internalGAMAd;
            this.f79255b = internalLoadListener;
        }
    }

    c(GAMLoader gAMLoader, AdsFormat adsFormat, GAMUnitData gAMUnitData, AdSize adSize) {
        super(gAMLoader, adsFormat, gAMUnitData);
        this.f79252a = adSize;
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    protected void destroyAd() {
        AdManagerAdView adManagerAdView = this.f79253b;
        if (adManagerAdView != null) {
            adManagerAdView.destroy();
            this.f79253b = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMBannerAd
    protected View getAdView() {
        return this.f79253b;
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    public void loadAd(Context context, InternalLoadListener internalLoadListener) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.f79253b = adManagerAdView;
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f79253b.setAdUnitId(getAdUnitId());
        this.f79253b.setAdListener(new b(this, internalLoadListener));
        this.f79253b.setAdSize(this.f79252a);
        this.f79253b.loadAd(io.bidmachine.ads.networks.gam.versions.v22_0_0.a.a(getGamLoader(), getGamUnitData()));
    }
}
