package com.facebook.ads;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes7.dex */
@Keep
public interface InterstitialAdListener extends AdListener {
    void onInterstitialDismissed(Ad ad2);

    void onInterstitialDisplayed(Ad ad2);
}
