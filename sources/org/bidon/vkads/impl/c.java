package org.bidon.vkads.impl;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdUnit f97801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f97802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f97803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f97804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f97805f;

    public c(Activity activity, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97800a = activity;
        this.f97801b = adUnit;
        this.f97802c = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97803d = extra != null ? extra.optString("mediation") : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97804e = extra2 != null ? Integer.valueOf(extra2.optInt("slot_id")) : null;
        JSONObject extra3 = getAdUnit().getExtra();
        this.f97805f = extra3 != null ? extra3.optString("bid_id") : null;
    }

    public final Activity a() {
        return this.f97800a;
    }

    public final String b() {
        return this.f97805f;
    }

    public final String c() {
        return this.f97803d;
    }

    public final Integer d() {
        return this.f97804e;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97801b;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97802c;
    }
}
