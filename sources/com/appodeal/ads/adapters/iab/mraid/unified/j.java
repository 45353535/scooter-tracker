package com.appodeal.ads.adapters.iab.mraid.unified;

import com.appodeal.ads.unified.UnifiedMrecCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends s {
    public j(UnifiedMrecCallback unifiedMrecCallback, a aVar) {
        super(unifiedMrecCallback, aVar);
    }

    @Override // com.explorestack.iab.mraid.k
    public final void n(com.explorestack.iab.mraid.j jVar) {
        ((UnifiedMrecCallback) this.f12246a).onAdLoaded(jVar);
    }
}
