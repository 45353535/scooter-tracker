package io.bidmachine.ads.networks.meta_audience;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import od.h;
import od.i;
import od.j;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class MetaAudienceInterstitial extends h {

    @Nullable
    private InterstitialAd interstitialAd;

    @Nullable
    private Listener listener;

    private static final class Listener extends BaseMetaAudienceListener<i> implements InterstitialAdListener {
        Listener(@NonNull i iVar) {
            super(iVar);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            getCallback().onAdLoaded();
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDismissed(Ad ad2) {
            getCallback().onAdClosed();
            ad2.destroy();
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDisplayed(Ad ad2) {
        }
    }

    MetaAudienceInterstitial() {
    }

    @Override // od.b
    public void onDestroy() {
        this.listener = null;
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.interstitialAd = null;
        }
    }

    @Override // od.h
    public void show(@NonNull ContextProvider contextProvider, @NonNull i iVar, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd == null) {
            iVar.onAdShowFailed(ae.a.i("MetaAudience interstitial object is null"));
            return;
        }
        if (!interstitialAd.isAdLoaded()) {
            iVar.onAdShowFailed(ae.a.i("MetaAudience interstitial object not loaded"));
        } else if (this.interstitialAd.isAdInvalidated()) {
            iVar.onAdShowFailed(ae.a.i("MetaAudience interstitial object invalidated"));
        } else {
            this.interstitialAd.show();
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull i iVar, @NonNull j jVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        MetaAudienceParams metaAudienceParams = new MetaAudienceParams(kVar);
        if (metaAudienceParams.isValid(iVar)) {
            this.listener = new Listener(iVar);
            InterstitialAd interstitialAd = new InterstitialAd(contextProvider.getApplicationContext(), metaAudienceParams.placementId);
            this.interstitialAd = interstitialAd;
            interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(this.listener).withBid(metaAudienceParams.bidPayload).build());
        }
    }
}
