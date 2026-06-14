package org.bidon.amazon.impl;

import android.app.Activity;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdUnit f97065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f97066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f97067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final org.bidon.amazon.f f97068e;

    public h(Activity activity, AdUnit adUnit) {
        String string;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97064a = activity;
        this.f97065b = adUnit;
        this.f97066c = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        org.bidon.amazon.f fVar = null;
        this.f97067d = extra != null ? extra.getString("slot_uuid") : null;
        JSONObject extra2 = getAdUnit().getExtra();
        if (extra2 != null && (string = extra2.getString("format")) != null) {
            org.bidon.amazon.f fVarA = org.bidon.amazon.f.f97031c.a(string);
            if (ArraysKt.contains(new org.bidon.amazon.f[]{org.bidon.amazon.f.f97034f, org.bidon.amazon.f.f97036h, org.bidon.amazon.f.f97035g}, fVarA)) {
                fVar = fVarA;
            }
        }
        this.f97068e = fVar;
    }

    public final Activity a() {
        return this.f97064a;
    }

    public final String b() {
        return this.f97067d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f97064a, hVar.f97064a) && Intrinsics.areEqual(this.f97065b, hVar.f97065b);
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97065b;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97066c;
    }

    public int hashCode() {
        return (this.f97064a.hashCode() * 31) + this.f97065b.hashCode();
    }

    public String toString() {
        return "FullscreenAuctionParams(activity=" + this.f97064a + ", adUnit=" + this.f97065b + ")";
    }
}
