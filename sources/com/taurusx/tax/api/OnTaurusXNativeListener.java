package com.taurusx.tax.api;

/* JADX INFO: loaded from: classes11.dex */
public interface OnTaurusXNativeListener {
    void onAdFailedToLoad(TaurusXAdError taurusXAdError);

    void onAdLoaded(TaurusXNativeAds taurusXNativeAds);

    void onClicked();

    void onImpression();
}
