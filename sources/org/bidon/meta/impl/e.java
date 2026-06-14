package org.bidon.meta.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f97398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdUnit f97399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f97400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f97401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97402e;

    public e(Context context, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97398a = context;
        this.f97399b = adUnit;
        this.f97400c = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97401d = extra != null ? extra.optString(Reporting.Key.PLACEMENT_ID) : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97402e = extra2 != null ? extra2.optString("payload") : null;
    }

    public final Context a() {
        return this.f97398a;
    }

    public final String b() {
        return this.f97402e;
    }

    public final String c() {
        return this.f97401d;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97399b;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97400c;
    }
}
