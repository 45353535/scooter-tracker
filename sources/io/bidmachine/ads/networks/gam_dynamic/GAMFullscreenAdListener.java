package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAd;

/* JADX INFO: loaded from: classes12.dex */
class GAMFullscreenAdListener<InternalAdType extends InternalFullscreenAd> extends GAMBaseAdListener<InternalAdType, od.i> implements InternalAdLoadListener<InternalAdType>, InternalFullscreenAdPresentListener {

    @NonNull
    private final GAMFullscreenAd gamFullscreenAd;

    GAMFullscreenAdListener(@NonNull od.i iVar, @NonNull GAMFullscreenAd gAMFullscreenAd) {
        super(iVar);
        this.gamFullscreenAd = gAMFullscreenAd;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener
    public void onAdClosed() {
        getCallback().onAdClosed();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener
    public void onAdComplete() {
        getCallback().onAdFinished();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadListener
    public void onAdLoaded(@NonNull InternalAdType internaladtype) {
        this.gamFullscreenAd.internalFullscreenAd = internaladtype;
        getCallback().onAdLoaded();
    }
}
