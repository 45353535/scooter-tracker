package org.bidon.dtexchange.impl;

import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdUnit f97246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f97247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f97248c;

    public a(AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97246a = adUnit;
        JSONObject extra = getAdUnit().getExtra();
        this.f97247b = extra != null ? extra.optString("spot_id") : null;
        this.f97248c = getAdUnit().getPricefloor();
    }

    public final String a() {
        return this.f97247b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f97246a, ((a) obj).f97246a);
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97246a;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97248c;
    }

    public int hashCode() {
        return this.f97246a.hashCode();
    }

    public String toString() {
        return "DTExchangeAdAuctionParams(adUnit=" + this.f97246a + ")";
    }
}
