package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam.InternalGAMFullscreenAd;

/* JADX INFO: loaded from: classes12.dex */
class GAMFullscreenAdListener<GAMAdType extends InternalGAMFullscreenAd> extends GAMBaseAdListener<GAMAdType, od.i> implements InternalGAMAdLoadListener<GAMAdType>, InternalGAMFullscreenAdPresentListener {
    GAMFullscreenAdListener(@NonNull od.i iVar) {
        super(iVar);
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener
    public void onAdClosed() {
        getCallback().onAdClosed();
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener
    public void onAdComplete() {
        getCallback().onAdFinished();
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdLoadListener
    public void onAdLoaded(@NonNull GAMAdType gamadtype) {
        getCallback().onAdLoaded();
    }
}
