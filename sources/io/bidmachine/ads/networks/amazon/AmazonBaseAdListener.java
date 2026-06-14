package io.bidmachine.ads.networks.amazon;

import android.view.View;
import androidx.annotation.NonNull;
import com.amazon.device.ads.DTBAdListener;
import od.c;

/* JADX INFO: loaded from: classes12.dex */
abstract class AmazonBaseAdListener<UnifiedAdCallbackType extends c> implements DTBAdListener {

    @NonNull
    private final UnifiedAdCallbackType callback;

    AmazonBaseAdListener(@NonNull UnifiedAdCallbackType unifiedadcallbacktype) {
        this.callback = unifiedadcallbacktype;
    }

    @NonNull
    UnifiedAdCallbackType getCallback() {
        return this.callback;
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdClicked(View view) {
        this.callback.onAdClicked();
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public /* synthetic */ void onAdError(View view) {
        com.amazon.device.ads.a.a(this, view);
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdFailed(View view) {
        this.callback.onAdLoadFailed(AmazonAdapter.mapError(null, ae.a.f4247q));
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdLeftApplication(View view) {
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdOpen(View view) {
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onImpressionFired(View view) {
        this.callback.onAdShown();
    }
}
