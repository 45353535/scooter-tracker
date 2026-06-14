package com.amazon.aps.bidder.adapter;

import android.content.Context;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.listeners.ApsAdListener;

/* JADX INFO: loaded from: classes5.dex */
public interface ApsBidderInterstitialAdAdapter {
    void fetchInterstitialAd(Context context, ApsAd apsAd, ApsAdListener apsAdListener);

    void showInterstitialAd(Context context, ApsAd apsAd, ApsAdListener apsAdListener);
}
