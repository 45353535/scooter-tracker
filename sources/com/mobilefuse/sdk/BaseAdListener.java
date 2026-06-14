package com.mobilefuse.sdk;

/* JADX INFO: loaded from: classes10.dex */
public interface BaseAdListener {
    void onAdClicked();

    void onAdError(AdError adError);

    void onAdExpired();

    void onAdLoaded();

    void onAdNotFilled();

    void onAdRendered();
}
