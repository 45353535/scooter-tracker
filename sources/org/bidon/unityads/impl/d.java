package org.bidon.unityads.impl;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerFormat f97772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdUnit f97773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f97774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97775e;

    public d(Activity activity, BannerFormat bannerFormat, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97771a = activity;
        this.f97772b = bannerFormat;
        this.f97773c = adUnit;
        this.f97774d = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97775e = extra != null ? extra.getString(Reporting.Key.PLACEMENT_ID) : null;
    }

    public final Activity a() {
        return this.f97771a;
    }

    public final BannerFormat b() {
        return this.f97772b;
    }

    public final String c() {
        return this.f97775e;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97773c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97774d;
    }

    public String toString() {
        return "UnityAdsBannerAuctionParams(bannerFormat=" + this.f97772b + ", adUnit=" + getAdUnit() + ")";
    }
}
