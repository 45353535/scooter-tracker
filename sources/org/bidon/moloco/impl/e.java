package org.bidon.moloco.impl;

import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdUnit f97519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f97520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f97521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f97522d;

    public e(AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97519a = adUnit;
        this.f97520b = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97521c = extra != null ? extra.getString("ad_unit_id") : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97522d = extra2 != null ? extra2.optString("payload") : null;
    }

    public final String a() {
        return this.f97521c;
    }

    public final String b() {
        return this.f97522d;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97519a;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97520b;
    }
}
