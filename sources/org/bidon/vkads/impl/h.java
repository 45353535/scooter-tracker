package org.bidon.vkads.impl;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerFormat f97818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdUnit f97819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f97820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Integer f97822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f97823g;

    public h(Activity activity, BannerFormat bannerFormat, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97817a = activity;
        this.f97818b = bannerFormat;
        this.f97819c = adUnit;
        this.f97820d = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97821e = extra != null ? extra.optString("mediation") : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97822f = extra2 != null ? Integer.valueOf(extra2.optInt("slot_id")) : null;
        JSONObject extra3 = getAdUnit().getExtra();
        this.f97823g = extra3 != null ? extra3.optString("bid_id") : null;
    }

    public final Activity a() {
        return this.f97817a;
    }

    public final BannerFormat b() {
        return this.f97818b;
    }

    public final String c() {
        return this.f97823g;
    }

    public final String d() {
        return this.f97821e;
    }

    public final Integer e() {
        return this.f97822f;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97819c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97820d;
    }
}
