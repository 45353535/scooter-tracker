package io.bidmachine.ads.networks.pangle;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import od.h;
import od.i;
import od.j;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class PangleInterstitialAd extends h {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private LoadListener loadListener;

    @Nullable
    private PAGInterstitialAd pagInterstitialAd;

    private static final class LoadListener extends PangleBaseLoadListener<i, PAGInterstitialAd> implements PAGInterstitialAdLoadListener {

        @NonNull
        private final PangleInterstitialAd pangleInterstitialAd;

        LoadListener(@NonNull PangleInterstitialAd pangleInterstitialAd, @NonNull i iVar) {
            super(iVar);
            this.pangleInterstitialAd = pangleInterstitialAd;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // io.bidmachine.ads.networks.pangle.PangleBaseLoadListener
        public void onAdLoadComplete(PAGInterstitialAd pAGInterstitialAd) {
            this.pangleInterstitialAd.setPAGInterstitialAd(pAGInterstitialAd);
            getCallback().onAdLoaded();
        }
    }

    private static final class ShowListener extends PangleBaseShowAdListener<i> implements PAGInterstitialAdInteractionListener {
        ShowListener(@NonNull i iVar) {
            super(iVar);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            i callback = getCallback();
            callback.onAdFinished();
            callback.onAdClosed();
        }
    }

    PangleInterstitialAd() {
    }

    @Override // od.b
    public void onDestroy() {
        LoadListener loadListener = this.loadListener;
        if (loadListener != null) {
            loadListener.destroy();
            this.loadListener = null;
        }
        PAGInterstitialAd pAGInterstitialAd = this.pagInterstitialAd;
        if (pAGInterstitialAd != null) {
            pAGInterstitialAd.setAdInteractionListener(null);
            this.pagInterstitialAd = null;
        }
    }

    void setPAGInterstitialAd(@Nullable PAGInterstitialAd pAGInterstitialAd) {
        this.pagInterstitialAd = pAGInterstitialAd;
    }

    @Override // od.h
    public void show(@NonNull ContextProvider contextProvider, @NonNull i iVar, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            iVar.onAdShowFailed(ae.a.i(LogConstants.MSG_ACTIVITY_IS_NULL));
            return;
        }
        PAGInterstitialAd pAGInterstitialAd = this.pagInterstitialAd;
        if (pAGInterstitialAd == null) {
            iVar.onAdShowFailed(ae.a.i("Pangle interstitial object is null"));
        } else {
            pAGInterstitialAd.setAdInteractionListener(new ShowListener(iVar));
            this.pagInterstitialAd.show(activity);
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull i iVar, @NonNull j jVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        PangleParams pangleParams = new PangleParams(kVar);
        if (pangleParams.isValid(iVar)) {
            PAGInterstitialRequest pAGInterstitialRequest = new PAGInterstitialRequest();
            pAGInterstitialRequest.setAdString(pangleParams.bidPayload);
            LoadListener loadListener = new LoadListener(this, iVar);
            this.loadListener = loadListener;
            PAGInterstitialAd.loadAd(pangleParams.slotId, pAGInterstitialRequest, loadListener);
        }
    }
}
