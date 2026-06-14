package com.appodeal.ads.unified;

import com.appodeal.ads.AdUnitParams;

/* JADX INFO: loaded from: classes6.dex */
public abstract class UnifiedBanner<NetworkRequestParams extends AdUnitParams> extends UnifiedViewAd<UnifiedBannerParams, UnifiedBannerCallback, NetworkRequestParams> {
    private boolean isRefreshOnRotate = false;

    public boolean isRefreshOnRotate() {
        return this.isRefreshOnRotate;
    }

    public void setRefreshOnRotate(boolean z10) {
        this.isRefreshOnRotate = z10;
    }
}
