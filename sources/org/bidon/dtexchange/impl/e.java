package org.bidon.dtexchange.impl;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerFormat f97260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdUnit f97261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f97262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f97263e;

    public e(Activity activity, BannerFormat bannerFormat, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97259a = activity;
        this.f97260b = bannerFormat;
        this.f97261c = adUnit;
        JSONObject extra = getAdUnit().getExtra();
        this.f97262d = extra != null ? extra.optString("spot_id") : null;
        this.f97263e = getAdUnit().getPricefloor();
    }

    public final Activity a() {
        return this.f97259a;
    }

    public final String b() {
        return this.f97262d;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97261c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97263e;
    }

    public String toString() {
        return "DTExchangeBannerAuctionParams(bannerFormat=" + this.f97260b + ", adUnit=" + getAdUnit() + ")";
    }
}
