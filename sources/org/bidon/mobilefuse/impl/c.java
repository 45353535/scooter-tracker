package org.bidon.mobilefuse.impl;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdUnit f97482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f97483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f97484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97485e;

    public c(Activity activity, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97481a = activity;
        this.f97482b = adUnit;
        this.f97483c = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97484d = extra != null ? extra.getString("signaldata") : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97485e = extra2 != null ? extra2.getString(Reporting.Key.PLACEMENT_ID) : null;
    }

    public final Activity a() {
        return this.f97481a;
    }

    public final String b() {
        return this.f97485e;
    }

    public final String c() {
        return this.f97484d;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97482b;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97483c;
    }
}
