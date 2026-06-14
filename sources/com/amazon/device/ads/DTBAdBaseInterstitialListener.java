package com.amazon.device.ads;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public class DTBAdBaseInterstitialListener implements DTBAdInterstitialListener {
    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdClicked(View view) {
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdClosed(View view) {
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public /* synthetic */ void onAdError(View view) {
        a.a(this, view);
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdFailed(View view) {
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdLeftApplication(View view) {
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdLoaded(View view) {
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdOpen(View view) {
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onImpressionFired(View view) {
    }

    @Override // com.amazon.device.ads.DTBAdVideoListener
    public /* synthetic */ void onVideoCompleted(View view) {
        l0.a(this, view);
    }
}
