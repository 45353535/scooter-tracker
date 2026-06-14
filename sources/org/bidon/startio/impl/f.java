package org.bidon.startio.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f97684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdUnit f97685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f97686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f97687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97688e;

    public f(Context context, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97684a = context;
        this.f97685b = adUnit;
        this.f97686c = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97687d = extra != null ? extra.optString("tag_id") : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97688e = extra2 != null ? extra2.optString("payload") : null;
    }

    public final Context a() {
        return this.f97684a;
    }

    public final String b() {
        return this.f97688e;
    }

    public final String c() {
        return this.f97687d;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97685b;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97686c;
    }
}
