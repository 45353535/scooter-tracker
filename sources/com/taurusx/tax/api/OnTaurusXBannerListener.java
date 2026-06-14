package com.taurusx.tax.api;

/* JADX INFO: loaded from: classes11.dex */
public interface OnTaurusXBannerListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(TaurusXAdError taurusXAdError);

    void onAdLoaded();

    void onAdShown();
}
