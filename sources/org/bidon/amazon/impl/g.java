package org.bidon.amazon.impl;

import android.app.Activity;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BannerFormat f97058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Activity f97059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdUnit f97060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f97061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final org.bidon.amazon.f f97063f;

    public g(BannerFormat bannerFormat, Activity activity, AdUnit adUnit) {
        String string;
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97058a = bannerFormat;
        this.f97059b = activity;
        this.f97060c = adUnit;
        this.f97061d = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        org.bidon.amazon.f fVar = null;
        this.f97062e = extra != null ? extra.getString("slot_uuid") : null;
        JSONObject extra2 = getAdUnit().getExtra();
        if (extra2 != null && (string = extra2.getString("format")) != null) {
            org.bidon.amazon.f fVarA = org.bidon.amazon.f.f97031c.a(string);
            if (ArraysKt.contains(new org.bidon.amazon.f[]{org.bidon.amazon.f.f97032d, org.bidon.amazon.f.f97033e}, fVarA)) {
                fVar = fVarA;
            }
        }
        this.f97063f = fVar;
    }

    public final Activity a() {
        return this.f97059b;
    }

    public final String b() {
        return this.f97062e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f97058a == gVar.f97058a && Intrinsics.areEqual(this.f97059b, gVar.f97059b) && Intrinsics.areEqual(this.f97060c, gVar.f97060c);
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97060c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97061d;
    }

    public int hashCode() {
        return (((this.f97058a.hashCode() * 31) + this.f97059b.hashCode()) * 31) + this.f97060c.hashCode();
    }

    public String toString() {
        return "BannerAuctionParams(bannerFormat=" + this.f97058a + ", activity=" + this.f97059b + ", adUnit=" + this.f97060c + ")";
    }
}
