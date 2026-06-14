package org.bidon.mobilefuse.impl;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerFormat f97470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdUnit f97471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f97472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f97474f;

    public a(Activity activity, BannerFormat bannerFormat, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97469a = activity;
        this.f97470b = bannerFormat;
        this.f97471c = adUnit;
        this.f97472d = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97473e = extra != null ? extra.getString("signaldata") : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97474f = extra2 != null ? extra2.getString(Reporting.Key.PLACEMENT_ID) : null;
    }

    public final Activity a() {
        return this.f97469a;
    }

    public final BannerFormat b() {
        return this.f97470b;
    }

    public final String c() {
        return this.f97474f;
    }

    public final String d() {
        return this.f97473e;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97471c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97472d;
    }
}
