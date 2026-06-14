package com.appodeal.ads;

import com.appodeal.ads.unified.UnifiedRewardedParams;

/* JADX INFO: loaded from: classes6.dex */
public final class kd implements UnifiedRewardedParams {
    @Override // com.appodeal.ads.unified.UnifiedRewardedParams
    public final int getMaxDuration() {
        return af.f12644b;
    }

    @Override // com.appodeal.ads.unified.UnifiedAdParams
    public final String obtainPlacementId() {
        return af.a().K();
    }

    @Override // com.appodeal.ads.unified.UnifiedAdParams
    public final String obtainSegmentId() {
        return af.a().L().toString();
    }
}
