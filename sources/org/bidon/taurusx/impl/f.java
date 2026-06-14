package org.bidon.taurusx.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f97742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdUnit f97743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f97744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f97745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97746e;

    public f(Context context, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97742a = context;
        this.f97743b = adUnit;
        this.f97744c = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97745d = extra != null ? extra.getString(Reporting.Key.PLACEMENT_ID) : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97746e = extra2 != null ? extra2.optString("payload") : null;
    }

    public final String a() {
        return this.f97745d;
    }

    public final Context b() {
        return this.f97742a;
    }

    public final String c() {
        return this.f97746e;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97743b;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97744c;
    }
}
