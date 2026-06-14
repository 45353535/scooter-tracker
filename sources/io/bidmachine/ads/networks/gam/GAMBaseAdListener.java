package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import od.c;

/* JADX INFO: loaded from: classes12.dex */
abstract class GAMBaseAdListener<GAMAdType extends InternalGAMAd, UnifiedAdCallbackType extends od.c> implements InternalGAMAdLoadListener<GAMAdType>, InternalGAMAdPresentListener {

    @NonNull
    private final UnifiedAdCallbackType callback;

    GAMBaseAdListener(@NonNull UnifiedAdCallbackType unifiedadcallbacktype) {
        this.callback = unifiedadcallbacktype;
    }

    @NonNull
    UnifiedAdCallbackType getCallback() {
        return this.callback;
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    public void onAdClicked() {
        this.callback.onAdClicked();
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    public void onAdExpired() {
        this.callback.onAdExpired();
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdLoadListener
    public void onAdLoadFailed(@NonNull ae.a aVar) {
        this.callback.onAdLoadFailed(aVar);
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    public void onAdShowFailed(@NonNull ae.a aVar) {
        this.callback.onAdShowFailed(aVar);
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    public void onAdShown() {
        this.callback.onAdShown();
    }
}
