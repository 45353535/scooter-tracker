package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;

/* JADX INFO: loaded from: classes12.dex */
class GAMBanner extends od.e {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private InternalGAMBannerAd gamBannerAd;

    @NonNull
    private final GAMNetwork gamNetwork;

    @Nullable
    private InternalGAMBannerAdListener listener;

    private static final class Listener extends GAMBaseAdListener<InternalGAMBannerAd, od.f> implements InternalGAMBannerAdListener {

        @NonNull
        private final GAMBanner gamBanner;

        private Listener(@NonNull GAMBanner gAMBanner, @NonNull od.f fVar) {
            super(fVar);
            this.gamBanner = gAMBanner;
        }

        @Override // io.bidmachine.ads.networks.gam.InternalGAMAdLoadListener
        public void onAdLoaded(@NonNull InternalGAMBannerAd internalGAMBannerAd) {
            this.gamBanner.gamBannerAd = internalGAMBannerAd;
            getCallback().onAdLoaded(internalGAMBannerAd.getAdView());
        }
    }

    protected GAMBanner(@NonNull GAMNetwork gAMNetwork) {
        this.gamNetwork = gAMNetwork;
    }

    @Override // od.b
    public void onDestroy() {
        this.listener = null;
        InternalGAMBannerAd internalGAMBannerAd = this.gamBannerAd;
        if (internalGAMBannerAd != null) {
            internalGAMBannerAd.destroy();
            this.gamBannerAd = null;
        }
    }

    @Override // od.b
    public void onShown() {
        super.onShown();
        InternalGAMBannerAd internalGAMBannerAd = this.gamBannerAd;
        if (internalGAMBannerAd != null) {
            internalGAMBannerAd.onAdShown();
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull od.f fVar, @NonNull od.g gVar, @NonNull od.k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        if (new GAMParams(kVar).isValid(fVar)) {
            if (!this.gamNetwork.isOverrideCallbacks()) {
                fVar.setVisibilitySource(io.bidmachine.core.k.BidMachine);
            }
            Listener listener = new Listener(fVar);
            this.listener = listener;
            this.gamNetwork.loadBanner(networkAdUnit, listener);
        }
    }
}
