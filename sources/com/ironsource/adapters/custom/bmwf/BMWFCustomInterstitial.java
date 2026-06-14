package com.ironsource.adapters.custom.bmwf;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseInterstitial;
import io.bidmachine.AdPlacementConfig;
import java.lang.ref.WeakReference;
import l9.c;
import l9.d;

/* JADX INFO: loaded from: classes6.dex */
public class BMWFCustomInterstitial extends LevelPlayBaseInterstitial<BMWFCustomAdapter> {

    @Nullable
    private l9.a interstitialAd;

    @Nullable
    private Listener listener;

    private static final class Listener implements c {

        @NonNull
        private final InterstitialAdListener interstitialAdListener;

        @NonNull
        private final WeakReference<BMWFCustomInterstitial> weakBMWFCustomInterstitial;

        private void destroyAd() {
            BMWFCustomInterstitial bMWFCustomInterstitial = this.weakBMWFCustomInterstitial.get();
            if (bMWFCustomInterstitial != null) {
                bMWFCustomInterstitial.destroyAd();
            }
        }

        private Listener(@NonNull BMWFCustomInterstitial bMWFCustomInterstitial, @NonNull InterstitialAdListener interstitialAdListener) {
            this.weakBMWFCustomInterstitial = new WeakReference<>(bMWFCustomInterstitial);
            this.interstitialAdListener = interstitialAdListener;
        }

        @Override // io.bidmachine.AdListener
        public void onAdClicked(@NonNull l9.a aVar) {
            this.interstitialAdListener.onAdClicked();
        }

        @Override // io.bidmachine.AdFullScreenListener
        public void onAdClosed(@NonNull l9.a aVar, boolean z10) {
            this.interstitialAdListener.onAdClosed();
            destroyAd();
        }

        @Override // io.bidmachine.AdListener
        public void onAdExpired(@NonNull l9.a aVar) {
            BMUtils.logCallbackError("Interstitial is expired");
        }

        @Override // io.bidmachine.AdListener
        public void onAdImpression(@NonNull l9.a aVar) {
            this.interstitialAdListener.onAdOpened();
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoadFailed(@NonNull l9.a aVar, @NonNull ae.a aVar2) {
            this.interstitialAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL, aVar2.e(), aVar2.g());
            destroyAd();
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoaded(@NonNull l9.a aVar) {
            this.interstitialAdListener.onAdLoadSuccess();
        }

        @Override // io.bidmachine.AdListener
        public void onAdShowFailed(@NonNull l9.a aVar, @NonNull ae.a aVar2) {
            this.interstitialAdListener.onAdShowFailed(aVar2.e(), aVar2.g());
        }
    }

    public BMWFCustomInterstitial(NetworkSettings networkSettings) {
        super(networkSettings);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void destroyAd(@NonNull AdData adData) {
        destroyAd();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(@NonNull AdData adData) {
        l9.a aVar = this.interstitialAd;
        return aVar != null && aVar.canShow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyAd() {
        this.listener = null;
        l9.a aVar = this.interstitialAd;
        if (aVar != null) {
            aVar.setListener(null);
            this.interstitialAd.destroy();
            this.interstitialAd = null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void loadAd(@NonNull AdData adData, @NonNull Context context, @NonNull InterstitialAdListener interstitialAdListener) {
        d.b bVar = (d.b) BMUtils.prepareAdRequest(new d.b(BMUtils.applyConfigParams(AdPlacementConfig.interstitialBuilder(), adData).build()), adData);
        this.listener = new Listener(interstitialAdListener);
        l9.a aVar = new l9.a(context.getApplicationContext());
        this.interstitialAd = aVar;
        aVar.setListener(this.listener);
        this.interstitialAd.load((d) bVar.build());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(@NonNull AdData adData, @NonNull Activity activity, @NonNull InterstitialAdListener interstitialAdListener) {
        if (this.interstitialAd == null || !isAdAvailable(adData)) {
            interstitialAdListener.onAdShowFailed(1000, "InterstitialAd is null or not available");
        } else {
            this.interstitialAd.show();
        }
    }
}
