package org.bidon.bigoads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdUnit f97193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f97194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f97195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f97196d;

    public e(AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97193a = adUnit;
        this.f97194b = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97195c = extra != null ? extra.getString("slot_id") : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97196d = extra2 != null ? extra2.optString("payload") : null;
    }

    public final String a() {
        return this.f97196d;
    }

    public final String b() {
        return this.f97195c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97193a;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97194b;
    }
}
