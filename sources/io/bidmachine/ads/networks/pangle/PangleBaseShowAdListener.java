package io.bidmachine.ads.networks.pangle;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.PAGAdListener;
import od.c;

/* JADX INFO: loaded from: classes12.dex */
abstract class PangleBaseShowAdListener<UnifiedAdCallbackType extends c> implements PAGAdListener {

    @NonNull
    private final UnifiedAdCallbackType callback;

    PangleBaseShowAdListener(@NonNull UnifiedAdCallbackType unifiedadcallbacktype) {
        this.callback = unifiedadcallbacktype;
    }

    @NonNull
    UnifiedAdCallbackType getCallback() {
        return this.callback;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        this.callback.onAdClicked();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        this.callback.onAdShown();
    }
}
