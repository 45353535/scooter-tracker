package com.appodeal.ads.adapters.iab.mraid.unified;

import com.appodeal.ads.unified.UnifiedBannerCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12242d;

    public d(UnifiedBannerCallback unifiedBannerCallback, a aVar, int i10) {
        super(unifiedBannerCallback, aVar);
        this.f12242d = i10;
    }

    @Override // com.explorestack.iab.mraid.k
    public final void n(com.explorestack.iab.mraid.j jVar) {
        ((UnifiedBannerCallback) this.f12246a).onAdLoaded(jVar, this.f12242d);
    }
}
