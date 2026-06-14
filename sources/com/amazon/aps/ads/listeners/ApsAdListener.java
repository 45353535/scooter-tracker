package com.amazon.aps.ads.listeners;

import com.amazon.aps.ads.ApsAd;

/* JADX INFO: loaded from: classes5.dex */
public interface ApsAdListener {
    void onAdClicked(ApsAd apsAd);

    void onAdClosed(ApsAd apsAd);

    void onAdError(ApsAd apsAd);

    void onAdFailedToLoad(ApsAd apsAd);

    void onAdLoaded(ApsAd apsAd);

    void onAdOpen(ApsAd apsAd);

    void onImpressionFired(ApsAd apsAd);

    void onVideoCompleted(ApsAd apsAd);
}
