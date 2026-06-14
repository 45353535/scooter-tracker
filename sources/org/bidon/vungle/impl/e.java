package org.bidon.vungle.impl;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdUnit f97845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f97846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f97847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97848e;

    public e(Activity activity, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97844a = activity;
        this.f97845b = adUnit;
        this.f97846c = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97847d = extra != null ? extra.getString(Reporting.Key.PLACEMENT_ID) : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97848e = extra2 != null ? extra2.optString("payload") : null;
    }

    public final Activity a() {
        return this.f97844a;
    }

    public final String b() {
        return this.f97848e;
    }

    public final String c() {
        return this.f97847d;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97845b;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97846c;
    }
}
