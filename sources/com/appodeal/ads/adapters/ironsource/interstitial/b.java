package com.appodeal.ads.adapters.ironsource.interstitial;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.ironsource.IronSourceNetwork;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ISDemandOnlyInterstitialListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f12374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnifiedInterstitialCallback f12375b;

    public b(a aVar, UnifiedInterstitialCallback unifiedInterstitialCallback) {
        this.f12374a = aVar;
        this.f12375b = unifiedInterstitialCallback;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdClicked(String str) {
        this.f12375b.onAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdClosed(String str) {
        IronSourceNetwork.unsubscribeInterstitialListener(str);
        IronSourceNetwork.setInProgressInstance(false);
        this.f12375b.onAdClosed();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        IronSourceNetwork.unsubscribeInterstitialListener(str);
        IronSourceNetwork.prepareInstance();
        if (ironSourceError == null) {
            this.f12375b.onAdLoadFailed(null);
        } else {
            this.f12375b.printError(ironSourceError.getErrorMessage(), Integer.valueOf(ironSourceError.getErrorCode()));
            this.f12375b.onAdLoadFailed(IronSourceNetwork.mapError(ironSourceError.getErrorCode()));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdOpened(String str) {
        this.f12375b.onAdShown();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdReady(String str) {
        a aVar = this.f12374a;
        if (!aVar.f12372b && !aVar.f12373c) {
            this.f12375b.onAdLoaded();
            return;
        }
        IronSourceNetwork.unsubscribeInterstitialListener(str);
        IronSourceNetwork.setInProgressInstance(false);
        if (this.f12374a.f12372b) {
            this.f12375b.onAdExpired();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        IronSourceNetwork.unsubscribeInterstitialListener(str);
        IronSourceNetwork.setInProgressInstance(false);
        if (ironSourceError != null) {
            this.f12375b.printError(ironSourceError.getErrorMessage(), Integer.valueOf(ironSourceError.getErrorCode()));
        }
        this.f12375b.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(ironSourceError != null ? ironSourceError.getErrorMessage() : "", Integer.valueOf(ironSourceError != null ? ironSourceError.getErrorCode() : 0)));
    }
}
