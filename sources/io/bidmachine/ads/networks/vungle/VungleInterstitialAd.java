package io.bidmachine.ads.networks.vungle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import od.h;
import od.i;
import od.j;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class VungleInterstitialAd extends h {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private InterstitialAd interstitialAd;

    @Nullable
    private Listener listener;

    private static final class Listener extends VungleBaseAdListener<i> implements InterstitialAdListener {
        Listener(@NonNull i iVar) {
            super(iVar);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(@NonNull BaseAd baseAd) {
            i callback = getCallback();
            callback.onAdFinished();
            callback.onAdClosed();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(@NonNull BaseAd baseAd) {
            getCallback().onAdLoaded();
        }
    }

    VungleInterstitialAd() {
    }

    @Override // od.b
    public void onDestroy() {
        this.listener = null;
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setAdListener(null);
            this.interstitialAd = null;
        }
    }

    @Override // od.h
    public void show(@NonNull ContextProvider contextProvider, @NonNull i iVar, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd == null) {
            iVar.onAdShowFailed(ae.a.i("Vungle interstitial object is null"));
        } else if (interstitialAd.canPlayAd().booleanValue()) {
            this.interstitialAd.play(contextProvider.getApplicationContext());
        } else {
            iVar.onAdShowFailed(ae.a.i("Can't play Vungle interstitial"));
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull i iVar, @NonNull j jVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        VungleParams vungleParams = new VungleParams(kVar);
        if (vungleParams.isValid(iVar)) {
            this.listener = new Listener(iVar);
            InterstitialAd interstitialAd = new InterstitialAd(contextProvider.getApplicationContext(), vungleParams.placementId, new AdConfig());
            this.interstitialAd = interstitialAd;
            interstitialAd.setAdListener(this.listener);
            this.interstitialAd.load(vungleParams.markup);
        }
    }
}
