package io.bidmachine.ads.networks.my_target;

import ae.a;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.ads.InterstitialAd;
import com.my.target.common.models.IAdLoadingError;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import od.h;
import od.i;
import od.j;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class MyTargetInterstitial extends h {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private InterstitialAd interstitialAd;

    private static final class Listener implements InterstitialAd.InterstitialAdListener {

        @NonNull
        private final i callback;

        Listener(@NonNull i iVar) {
            this.callback = iVar;
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onClick(@NonNull InterstitialAd interstitialAd) {
            this.callback.onAdClicked();
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onDismiss(@NonNull InterstitialAd interstitialAd) {
            this.callback.onAdClosed();
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onDisplay(@NonNull InterstitialAd interstitialAd) {
            this.callback.onAdShown();
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onFailedToShow(@NonNull InterstitialAd interstitialAd) {
            this.callback.onAdShowFailed(a.i("Failed to show"));
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onLoad(@NonNull InterstitialAd interstitialAd) {
            this.callback.onAdLoaded();
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull InterstitialAd interstitialAd) {
            this.callback.onAdLoadFailed(MyTargetAdapter.mapError(iAdLoadingError));
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onVideoCompleted(@NonNull InterstitialAd interstitialAd) {
            this.callback.onAdFinished();
        }
    }

    MyTargetInterstitial() {
    }

    @Override // od.b
    public void onDestroy() {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.interstitialAd = null;
        }
    }

    @Override // od.h
    public void show(@NonNull ContextProvider contextProvider, @NonNull i iVar, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(contextProvider.getContext());
        } else {
            iVar.onAdShowFailed(a.i("MyTarget interstitial object is null"));
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull i iVar, @NonNull j jVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        MyTargetParams myTargetParams = new MyTargetParams(kVar);
        if (myTargetParams.isValid(iVar)) {
            InterstitialAd interstitialAd = new InterstitialAd(myTargetParams.slotId.intValue(), contextProvider.getContext());
            this.interstitialAd = interstitialAd;
            interstitialAd.setListener(new Listener(iVar));
            MyTargetAdapter.updateTargeting(jVar, this.interstitialAd.getCustomParams());
            this.interstitialAd.loadFromBid(myTargetParams.bidId);
        }
    }
}
