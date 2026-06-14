package io.bidmachine.ads.networks.gam;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.modules.common.internal.LogConstants;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;

/* JADX INFO: loaded from: classes12.dex */
class GAMInterstitial extends od.h {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private InternalGAMInterstitialAd gamInterstitialAd;

    @NonNull
    private final GAMNetwork gamNetwork;

    @Nullable
    private Listener listener;

    private static final class Listener extends GAMFullscreenAdListener<InternalGAMInterstitialAd> implements InternalGAMInterstitialAdListener {

        @NonNull
        private final GAMInterstitial gamInterstitial;

        private Listener(@NonNull od.i iVar, @NonNull GAMInterstitial gAMInterstitial) {
            super(iVar);
            this.gamInterstitial = gAMInterstitial;
        }

        @Override // io.bidmachine.ads.networks.gam.GAMFullscreenAdListener
        public void onAdLoaded(@NonNull InternalGAMInterstitialAd internalGAMInterstitialAd) {
            this.gamInterstitial.gamInterstitialAd = internalGAMInterstitialAd;
            super.onAdLoaded(internalGAMInterstitialAd);
        }
    }

    protected GAMInterstitial(@NonNull GAMNetwork gAMNetwork) {
        this.gamNetwork = gAMNetwork;
    }

    @Override // od.b
    public void onDestroy() {
        this.listener = null;
        InternalGAMInterstitialAd internalGAMInterstitialAd = this.gamInterstitialAd;
        if (internalGAMInterstitialAd != null) {
            internalGAMInterstitialAd.destroy();
            this.gamInterstitialAd = null;
        }
    }

    @Override // od.b
    public void onShown() {
        super.onShown();
        InternalGAMInterstitialAd internalGAMInterstitialAd = this.gamInterstitialAd;
        if (internalGAMInterstitialAd != null) {
            internalGAMInterstitialAd.onAdShown();
        }
    }

    @Override // od.h
    public void show(@NonNull ContextProvider contextProvider, @NonNull od.i iVar, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            iVar.onAdShowFailed(ae.a.i(LogConstants.MSG_ACTIVITY_IS_NULL));
            return;
        }
        InternalGAMInterstitialAd internalGAMInterstitialAd = this.gamInterstitialAd;
        if (internalGAMInterstitialAd == null) {
            iVar.onAdShowFailed(ae.a.i("InternalGAM interstitial object is null"));
            return;
        }
        if (internalGAMInterstitialAd.isExpired()) {
            iVar.onAdShowFailed(ae.a.i("InternalGAM interstitial object is expired"));
            return;
        }
        if (!this.gamInterstitialAd.isLoaded()) {
            iVar.onAdShowFailed(ae.a.i("InternalGAM interstitial object not loaded"));
            return;
        }
        Listener listener = this.listener;
        if (listener == null) {
            iVar.onAdShowFailed(ae.a.i("InternalGAM interstitial listener is null"));
        } else {
            this.gamInterstitialAd.show(activity, listener);
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull od.i iVar, @NonNull od.j jVar, @NonNull od.k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        if (new GAMParams(kVar).isValid(iVar)) {
            Listener listener = new Listener(iVar, this);
            this.listener = listener;
            this.gamNetwork.loadInterstitial(networkAdUnit, listener);
        }
    }
}
