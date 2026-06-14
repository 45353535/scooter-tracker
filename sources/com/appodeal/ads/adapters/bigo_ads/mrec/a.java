package com.appodeal.ads.adapters.bigo_ads.mrec;

import com.appodeal.ads.adapters.bigo_ads.unified.c;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import kotlin.jvm.internal.Intrinsics;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.BannerAd;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnifiedMrecCallback f12166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f12167c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, UnifiedMrecCallback callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12167c = bVar;
        this.f12166b = callback;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad2) {
        BannerAd mrec = (BannerAd) ad2;
        Intrinsics.checkNotNullParameter(mrec, "mrec");
        this.f12167c.f12168a = mrec;
        ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.bigo_ads.unified.a.a(mrec.getBid());
        this.f12166b.onAdRevenueReceived(impressionLevelDataA);
        this.f12166b.onAdLoaded(mrec.adView(), impressionLevelDataA);
    }
}
