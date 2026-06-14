package com.amazon.device.ads;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public interface DTBAdListener {
    void onAdClicked(View view);

    void onAdClosed(View view);

    void onAdError(View view);

    void onAdFailed(View view);

    void onAdLeftApplication(View view);

    void onAdLoaded(View view);

    void onAdOpen(View view);

    void onImpressionFired(View view);
}
