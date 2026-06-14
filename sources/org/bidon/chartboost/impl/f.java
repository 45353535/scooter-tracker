package org.bidon.chartboost.impl;

import androidx.webkit.Profile;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdUnit f97228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f97229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f97230c;

    public f(AdUnit adUnit) {
        String string;
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97228a = adUnit;
        this.f97229b = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97230c = (extra == null || (string = extra.getString("ad_location")) == null) ? Profile.DEFAULT_PROFILE_NAME : string;
    }

    public final String a() {
        return this.f97230c;
    }

    public final b1.e b() {
        return b.d();
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97228a;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97229b;
    }
}
