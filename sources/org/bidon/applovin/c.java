package org.bidon.applovin;

import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdUnit f97076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f97077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f97078c;

    public c(AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97076a = adUnit;
        this.f97077b = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97078c = extra != null ? extra.getString(Reporting.Key.ZONE_ID) : null;
    }

    public final String a() {
        return this.f97078c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97076a;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97077b;
    }

    public String toString() {
        return "ApplovinFullscreenAdAuctionParams(adUnit=" + getAdUnit() + ")";
    }
}
