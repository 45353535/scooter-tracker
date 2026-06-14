package org.bidon.mintegral;

import android.app.Activity;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdUnit f97425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f97426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f97427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f97429f;

    public b(Activity activity, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97424a = activity;
        this.f97425b = adUnit;
        this.f97426c = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97427d = extra != null ? extra.getString(MBridgeConstans.PROPERTIES_UNIT_ID) : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97428e = extra2 != null ? extra2.getString(Reporting.Key.PLACEMENT_ID) : null;
        JSONObject extra3 = getAdUnit().getExtra();
        this.f97429f = extra3 != null ? extra3.optString("payload") : null;
    }

    public final Activity a() {
        return this.f97424a;
    }

    public final String b() {
        return this.f97429f;
    }

    public final String c() {
        return this.f97428e;
    }

    public final String d() {
        return this.f97427d;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97425b;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97426c;
    }

    public String toString() {
        return "MintegralAuctionParam(price=" + getPrice() + ", adUnitId=" + getAdUnit() + ", placementId=" + this.f97428e + ", payload='" + this.f97429f + "')";
    }
}
