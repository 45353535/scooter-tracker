package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.unified.UnifiedBannerParams;

/* JADX INFO: loaded from: classes6.dex */
public final class ye implements UnifiedBannerParams {
    @Override // com.appodeal.ads.unified.UnifiedBannerParams
    public final int getMaxHeight(Context context) {
        return ((ee.f13290b || ee.f13291c) && j2.v(com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext()) > 720.0f) ? 90 : 50;
    }

    @Override // com.appodeal.ads.unified.UnifiedBannerParams
    public final int getMaxWidth(Context context) {
        int iRound = Math.round(j2.z(com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext()));
        return ee.f13290b ? iRound : (!ee.f13291c || iRound < 728) ? 320 : 728;
    }

    @Override // com.appodeal.ads.unified.UnifiedBannerParams
    public final boolean needLeaderBoard(Context context) {
        return ee.b(context);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdParams
    public final String obtainPlacementId() {
        return ee.a().K();
    }

    @Override // com.appodeal.ads.unified.UnifiedAdParams
    public final String obtainSegmentId() {
        return ee.a().L().toString();
    }

    @Override // com.appodeal.ads.unified.UnifiedBannerParams
    public final boolean useSmartBanners(Context context) {
        return ee.f13290b;
    }
}
