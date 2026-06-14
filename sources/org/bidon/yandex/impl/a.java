package org.bidon.yandex.impl;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerFormat f97867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdUnit f97868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f97869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f97871f;

    public a(Activity activity, BannerFormat bannerFormat, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97866a = activity;
        this.f97867b = bannerFormat;
        this.f97868c = adUnit;
        this.f97869d = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97870e = extra != null ? extra.optString("ad_unit_id") : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97871f = extra2 != null ? extra2.optString("signaldata") : null;
    }

    public final Activity a() {
        return this.f97866a;
    }

    public final String b() {
        return this.f97870e;
    }

    public final BannerFormat c() {
        return this.f97867b;
    }

    public final String d() {
        return this.f97871f;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97868c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97869d;
    }
}
