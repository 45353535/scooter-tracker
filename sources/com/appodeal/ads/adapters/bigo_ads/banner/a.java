package com.appodeal.ads.adapters.bigo_ads.banner;

import com.appodeal.ads.adapters.bigo_ads.unified.c;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import kotlin.jvm.internal.Intrinsics;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.BannerAd;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnifiedBannerCallback f12157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f12158c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, UnifiedBannerCallback callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12158c = bVar;
        this.f12157b = callback;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad2) {
        BannerAd banner = (BannerAd) ad2;
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.f12158c.f12159a = banner;
        ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.bigo_ads.unified.a.a(banner.getBid());
        this.f12157b.onAdRevenueReceived(impressionLevelDataA);
        this.f12157b.onAdLoaded(banner.adView(), banner.getHeight(), impressionLevelDataA);
    }
}
