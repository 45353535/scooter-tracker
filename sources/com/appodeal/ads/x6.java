package com.appodeal.ads;

import com.appodeal.ads.unified.UnifiedInterstitialParams;

/* JADX INFO: loaded from: classes6.dex */
public final class x6 implements UnifiedInterstitialParams {
    @Override // com.appodeal.ads.unified.UnifiedAdParams
    public final String obtainPlacementId() {
        return h6.a().K();
    }

    @Override // com.appodeal.ads.unified.UnifiedAdParams
    public final String obtainSegmentId() {
        return h6.a().L().toString();
    }
}
