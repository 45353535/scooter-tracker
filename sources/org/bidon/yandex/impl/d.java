package org.bidon.yandex.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f97878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdUnit f97879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f97880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f97881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97882e;

    public d(Context context, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97878a = context;
        this.f97879b = adUnit;
        this.f97880c = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97881d = extra != null ? extra.optString("ad_unit_id") : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97882e = extra2 != null ? extra2.optString("signaldata") : null;
    }

    public final String a() {
        return this.f97881d;
    }

    public final Context b() {
        return this.f97878a;
    }

    public final String c() {
        return this.f97882e;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97879b;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97880c;
    }
}
