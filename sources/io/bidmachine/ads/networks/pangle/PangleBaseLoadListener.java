package io.bidmachine.ads.networks.pangle;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import java.util.concurrent.atomic.AtomicBoolean;
import od.c;

/* JADX INFO: loaded from: classes12.dex */
abstract class PangleBaseLoadListener<UnifiedAdCallbackType extends c, PangleAd> implements PAGLoadListener<PangleAd> {

    @NonNull
    private final UnifiedAdCallbackType callback;

    @NonNull
    private final AtomicBoolean isDestroyed = new AtomicBoolean(false);

    PangleBaseLoadListener(@NonNull UnifiedAdCallbackType unifiedadcallbacktype) {
        this.callback = unifiedadcallbacktype;
    }

    public void destroy() {
        this.isDestroyed.set(true);
    }

    @NonNull
    final UnifiedAdCallbackType getCallback() {
        return this.callback;
    }

    public boolean isDestroyed() {
        return this.isDestroyed.get();
    }

    abstract void onAdLoadComplete(PangleAd panglead);

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PangleAd panglead) {
        if (isDestroyed()) {
            return;
        }
        onAdLoadComplete(panglead);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.mo
    public final void onError(int i10, String str) {
        if (isDestroyed()) {
            return;
        }
        this.callback.onAdLoadFailed(new ae.a(ae.a.f4247q, i10, str));
    }
}
