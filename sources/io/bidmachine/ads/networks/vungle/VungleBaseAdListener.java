package io.bidmachine.ads.networks.vungle;

import androidx.annotation.NonNull;
import com.vungle.ads.BaseAd;
import com.vungle.ads.BaseAdListener;
import com.vungle.ads.VungleError;
import od.c;

/* JADX INFO: loaded from: classes12.dex */
abstract class VungleBaseAdListener<UnifiedAdCallbackType extends c> implements BaseAdListener {

    @NonNull
    private final UnifiedAdCallbackType callback;

    VungleBaseAdListener(@NonNull UnifiedAdCallbackType unifiedadcallbacktype) {
        this.callback = unifiedadcallbacktype;
    }

    @NonNull
    UnifiedAdCallbackType getCallback() {
        return this.callback;
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(@NonNull BaseAd baseAd) {
        this.callback.onAdClicked();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(@NonNull BaseAd baseAd, @NonNull VungleError vungleError) {
        this.callback.onAdLoadFailed(VungleAdapter.mapError(vungleError));
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(@NonNull BaseAd baseAd, @NonNull VungleError vungleError) {
        this.callback.onAdShowFailed(VungleAdapter.mapError(vungleError));
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(@NonNull BaseAd baseAd) {
        this.callback.onAdShown();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(@NonNull BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(@NonNull BaseAd baseAd) {
    }
}
