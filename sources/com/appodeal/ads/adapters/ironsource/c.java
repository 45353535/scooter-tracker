package com.appodeal.ads.adapters.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements ISDemandOnlyInterstitialListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdClicked(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = (ISDemandOnlyInterstitialListener) IronSourceNetwork.interstitialListeners.get(str);
        if (iSDemandOnlyInterstitialListener != null) {
            iSDemandOnlyInterstitialListener.onInterstitialAdClicked(str);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdClosed(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = (ISDemandOnlyInterstitialListener) IronSourceNetwork.interstitialListeners.get(str);
        if (iSDemandOnlyInterstitialListener != null) {
            iSDemandOnlyInterstitialListener.onInterstitialAdClosed(str);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = (ISDemandOnlyInterstitialListener) IronSourceNetwork.interstitialListeners.get(str);
        if (iSDemandOnlyInterstitialListener != null) {
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(str, ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdOpened(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = (ISDemandOnlyInterstitialListener) IronSourceNetwork.interstitialListeners.get(str);
        if (iSDemandOnlyInterstitialListener != null) {
            iSDemandOnlyInterstitialListener.onInterstitialAdOpened(str);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdReady(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = (ISDemandOnlyInterstitialListener) IronSourceNetwork.interstitialListeners.get(str);
        if (iSDemandOnlyInterstitialListener != null) {
            iSDemandOnlyInterstitialListener.onInterstitialAdReady(str);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = (ISDemandOnlyInterstitialListener) IronSourceNetwork.interstitialListeners.get(str);
        if (iSDemandOnlyInterstitialListener != null) {
            iSDemandOnlyInterstitialListener.onInterstitialAdShowFailed(str, ironSourceError);
        }
    }
}
