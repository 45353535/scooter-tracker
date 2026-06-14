package com.appodeal.ads.adapters.vungle;

import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.vungle.ads.BaseAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public class d extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnifiedFullscreenAdCallback f12600b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(UnifiedFullscreenAdCallback callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12600b = callback;
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        this.f12600b.onAdClosed();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdImpression(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        this.f12600b.onAdShown();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLoaded(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        this.f12600b.onAdLoaded();
    }
}
