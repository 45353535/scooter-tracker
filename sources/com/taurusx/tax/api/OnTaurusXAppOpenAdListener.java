package com.taurusx.tax.api;

/* JADX INFO: loaded from: classes11.dex */
public interface OnTaurusXAppOpenAdListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(TaurusXAdError taurusXAdError);

    void onAdLoaded();

    void onAdShowFailed(TaurusXAdError taurusXAdError);

    void onAdShown();
}
