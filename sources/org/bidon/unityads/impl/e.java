package org.bidon.unityads.impl;

import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdUnit f97776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f97777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f97778c;

    public e(AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97776a = adUnit;
        this.f97777b = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97778c = extra != null ? extra.getString(Reporting.Key.PLACEMENT_ID) : null;
    }

    public final String a() {
        return this.f97778c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.f97776a, ((e) obj).f97776a);
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97776a;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97777b;
    }

    public int hashCode() {
        return this.f97776a.hashCode();
    }

    public String toString() {
        return "UnityAdsFullscreenAuctionParams(adUnit=" + this.f97776a + ")";
    }
}
