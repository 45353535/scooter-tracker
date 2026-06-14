package org.bidon.ironsource.impl;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdUnit f97344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f97345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f97346d;

    public h(Activity activity, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97343a = activity;
        this.f97344b = adUnit;
        this.f97345c = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97346d = extra != null ? extra.getString("instance_id") : null;
    }

    public final Activity a() {
        return this.f97343a;
    }

    public final String b() {
        return this.f97346d;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97344b;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97345c;
    }
}
