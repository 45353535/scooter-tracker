package org.bidon.bidmachine;

import android.content.Context;
import io.bidmachine.CustomParams;
import io.bidmachine.TargetingParams;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f97125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdUnit f97126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f97127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f97128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CustomParams f97129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TargetingParams f97130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f97131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f97132h;

    public b(double d10, AdUnit adUnit, Context context, long j10, CustomParams customParameters, TargetingParams targetingParams, String str, String str2) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customParameters, "customParameters");
        Intrinsics.checkNotNullParameter(targetingParams, "targetingParams");
        this.f97125a = d10;
        this.f97126b = adUnit;
        this.f97127c = context;
        this.f97128d = j10;
        this.f97129e = customParameters;
        this.f97130f = targetingParams;
        this.f97131g = str;
        this.f97132h = str2;
    }

    public final Context a() {
        return this.f97127c;
    }

    public final CustomParams b() {
        return this.f97129e;
    }

    public final String c() {
        return this.f97131g;
    }

    public final String d() {
        return this.f97132h;
    }

    public final TargetingParams e() {
        return this.f97130f;
    }

    public final long f() {
        return this.f97128d;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97126b;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97125a;
    }

    public String toString() {
        return "BMFullscreenAuctionParams(pricefloor=" + getPrice() + ", timeout=" + this.f97128d + ")";
    }
}
