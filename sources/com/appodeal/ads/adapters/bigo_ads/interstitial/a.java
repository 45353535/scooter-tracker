package com.appodeal.ads.adapters.bigo_ads.interstitial;

import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import kotlin.jvm.internal.Intrinsics;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.InterstitialAd;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends com.appodeal.ads.adapters.bigo_ads.unified.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f12163b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, UnifiedInterstitialCallback callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12163b = bVar;
    }

    @Override // com.appodeal.ads.adapters.bigo_ads.unified.b, sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad2) {
        InterstitialAd ad3 = (InterstitialAd) ad2;
        Intrinsics.checkNotNullParameter(ad3, "ad");
        this.f12163b.f12164a = ad3;
        super.onAdLoaded(ad3);
    }
}
