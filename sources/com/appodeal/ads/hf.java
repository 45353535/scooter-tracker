package com.appodeal.ads;

import com.appodeal.ads.unified.UnifiedMrecParams;

/* JADX INFO: loaded from: classes6.dex */
public final class hf implements UnifiedMrecParams {
    @Override // com.appodeal.ads.unified.UnifiedAdParams
    public final String obtainPlacementId() {
        return ve.a().K();
    }

    @Override // com.appodeal.ads.unified.UnifiedAdParams
    public final String obtainSegmentId() {
        return ve.a().L().toString();
    }
}
