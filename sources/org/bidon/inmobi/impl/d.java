package org.bidon.inmobi.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f97302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdUnit f97303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f97304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f97305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97306e;

    public d(Context context, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97302a = context;
        this.f97303b = adUnit;
        this.f97304c = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97305d = extra != null ? Long.valueOf(extra.optLong(Reporting.Key.PLACEMENT_ID)) : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97306e = extra2 != null ? extra2.optString("payload") : null;
    }

    public final Context a() {
        return this.f97302a;
    }

    public final String b() {
        return this.f97306e;
    }

    public final Long c() {
        return this.f97305d;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97303b;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97304c;
    }

    public String toString() {
        return "InmobiFullscreenAuctionParams(placementId=" + this.f97305d + ", price=" + getPrice() + ")";
    }
}
