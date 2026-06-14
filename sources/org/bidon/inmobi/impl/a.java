package org.bidon.inmobi.impl;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerFormat f97292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdUnit f97293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f97294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f97295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f97296f;

    public a(Activity activity, BannerFormat bannerFormat, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97291a = activity;
        this.f97292b = bannerFormat;
        this.f97293c = adUnit;
        this.f97294d = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97295e = extra != null ? Long.valueOf(extra.optLong(Reporting.Key.PLACEMENT_ID)) : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97296f = extra2 != null ? extra2.optString("payload") : null;
    }

    public final Activity a() {
        return this.f97291a;
    }

    public final BannerFormat b() {
        return this.f97292b;
    }

    public final String c() {
        return this.f97296f;
    }

    public final Long d() {
        return this.f97295e;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97293c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97294d;
    }

    public String toString() {
        return "InmobiBannerAuctionParams(" + this.f97292b + ", placementId=" + this.f97295e + ", price=" + getPrice() + ")";
    }
}
