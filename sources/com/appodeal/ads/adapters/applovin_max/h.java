package com.appodeal.ads.adapters.applovin_max;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.appodeal.ads.unified.UnifiedAdCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h implements MaxAdRevenueListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnifiedAdCallback f12010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12011c;

    public h(UnifiedAdCallback adCallback, String countryCode) {
        Intrinsics.checkNotNullParameter(adCallback, "adCallback");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f12010b = adCallback;
        this.f12011c = countryCode;
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public final void onAdRevenuePaid(MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        this.f12010b.onAdRevenueReceived(com.appodeal.ads.adapters.applovin_max.ext.h.a(maxAd, this.f12011c));
    }
}
