package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
class GAMBannerAd extends od.e {

    @NonNull
    private final GAMNetwork gamNetwork;

    @Nullable
    @VisibleForTesting
    InternalBannerAd internalBannerAd;

    @Nullable
    @VisibleForTesting
    InternalBannerAdListener listener;

    @VisibleForTesting
    static final class Listener extends GAMBaseAdListener<InternalBannerAd, od.f> implements InternalBannerAdListener {

        @NonNull
        private final GAMBannerAd gamBannerAd;

        Listener(@NonNull od.f fVar, @NonNull GAMBannerAd gAMBannerAd) {
            super(fVar);
            this.gamBannerAd = gAMBannerAd;
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadListener
        public void onAdLoaded(@NonNull InternalBannerAd internalBannerAd) {
            this.gamBannerAd.internalBannerAd = internalBannerAd;
            if (internalBannerAd.getAdUnit().getOverrideCallbacks()) {
                getCallback().setVisibilitySource(io.bidmachine.core.k.BidMachine);
            }
            getCallback().onAdLoaded(internalBannerAd.getAdView());
        }
    }

    protected GAMBannerAd(@NonNull GAMNetwork gAMNetwork) {
        this.gamNetwork = gAMNetwork;
    }

    @Override // od.b
    @Nullable
    public Map<String, Object> getCustomParams() {
        InternalBannerAd internalBannerAd = this.internalBannerAd;
        if (internalBannerAd != null) {
            return internalBannerAd.getCustomParamsMap();
        }
        return null;
    }

    @Override // od.b
    public void onDestroy() {
        this.listener = null;
        InternalBannerAd internalBannerAd = this.internalBannerAd;
        if (internalBannerAd != null) {
            internalBannerAd.destroy();
            this.internalBannerAd = null;
        }
    }

    @Override // od.b
    public void onShown() {
        super.onShown();
        InternalBannerAd internalBannerAd = this.internalBannerAd;
        if (internalBannerAd != null) {
            internalBannerAd.onAdShown();
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull od.f fVar, @NonNull od.g gVar, @NonNull od.k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        Listener listener = new Listener(fVar, this);
        this.listener = listener;
        this.gamNetwork.loadBanner(networkAdUnit, listener);
    }
}
