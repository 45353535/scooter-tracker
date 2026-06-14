package com.taurusx.tax.api;

/* JADX INFO: loaded from: classes11.dex */
public interface OnTaurusXInstreamListener {
    void onAdClicked();

    void onAdFailedToLoad(TaurusXAdError taurusXAdError);

    void onAdLoaded();

    void onAdShowFailed(TaurusXAdError taurusXAdError);

    void onAdShown();

    void onPlayEnd();

    void onPlayStart();

    void onProgress(int i10, int i11);

    void onSkip();
}
