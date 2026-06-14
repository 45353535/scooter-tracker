package com.appodeal.ads.adapters.iab.mraid.unified;

import android.content.Context;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewardedCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends e {
    public k(Context context, UnifiedRewardedCallback unifiedRewardedCallback, a aVar) {
        super(context, unifiedRewardedCallback, aVar);
    }

    @Override // com.appodeal.ads.adapters.iab.mraid.unified.e, com.explorestack.iab.mraid.c
    public final void o(com.explorestack.iab.mraid.b bVar) {
        ((UnifiedRewardedCallback) this.f12246a).onAdFinished();
        ((UnifiedFullscreenAdCallback) this.f12246a).onAdClosed();
    }
}
