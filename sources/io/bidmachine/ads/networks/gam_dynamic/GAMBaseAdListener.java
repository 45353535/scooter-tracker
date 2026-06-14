package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam_dynamic.InternalAd;
import od.c;

/* JADX INFO: loaded from: classes12.dex */
abstract class GAMBaseAdListener<InternalAdType extends InternalAd, UnifiedAdCallbackType extends od.c> implements InternalAdLoadListener<InternalAdType>, InternalAdPresentListener {

    @NonNull
    private final UnifiedAdCallbackType callback;

    GAMBaseAdListener(@NonNull UnifiedAdCallbackType unifiedadcallbacktype) {
        this.callback = unifiedadcallbacktype;
    }

    @NonNull
    UnifiedAdCallbackType getCallback() {
        return this.callback;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    public void onAdClicked() {
        this.callback.onAdClicked();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    public void onAdExpired() {
        this.callback.onAdExpired();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadListener
    public void onAdLoadFailed(@NonNull ae.a aVar) {
        this.callback.onAdLoadFailed(aVar);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    public void onAdShowFailed(@NonNull ae.a aVar) {
        this.callback.onAdShowFailed(aVar);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    public void onAdShown() {
        this.callback.onAdShown();
    }
}
