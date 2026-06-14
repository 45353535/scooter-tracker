package com.appodeal.ads.adapters.bigo_ads.rewarded;

import com.appodeal.ads.unified.UnifiedRewardedCallback;
import kotlin.jvm.internal.Intrinsics;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.RewardVideoAd;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends com.appodeal.ads.adapters.bigo_ads.unified.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f12176b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, UnifiedRewardedCallback callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12176b = bVar;
    }

    @Override // com.appodeal.ads.adapters.bigo_ads.unified.b, sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad2) {
        RewardVideoAd ad3 = (RewardVideoAd) ad2;
        Intrinsics.checkNotNullParameter(ad3, "ad");
        super.onAdLoaded(ad3);
        this.f12176b.f12177a = ad3;
    }
}
