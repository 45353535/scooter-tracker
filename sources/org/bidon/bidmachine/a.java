package org.bidon.bidmachine;

import android.app.Activity;
import io.bidmachine.CustomParams;
import io.bidmachine.TargetingParams;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.auction.models.AdUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f97116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdUnit f97117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Activity f97118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BannerFormat f97119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f97120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CustomParams f97121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TargetingParams f97122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f97123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f97124i;

    public a(double d10, AdUnit adUnit, Activity activity, BannerFormat bannerFormat, long j10, CustomParams customParameters, TargetingParams targetingParams, String str, String str2) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(customParameters, "customParameters");
        Intrinsics.checkNotNullParameter(targetingParams, "targetingParams");
        this.f97116a = d10;
        this.f97117b = adUnit;
        this.f97118c = activity;
        this.f97119d = bannerFormat;
        this.f97120e = j10;
        this.f97121f = customParameters;
        this.f97122g = targetingParams;
        this.f97123h = str;
        this.f97124i = str2;
    }

    public final Activity a() {
        return this.f97118c;
    }

    public final BannerFormat b() {
        return this.f97119d;
    }

    public final CustomParams c() {
        return this.f97121f;
    }

    public final String d() {
        return this.f97123h;
    }

    public final String e() {
        return this.f97124i;
    }

    public final TargetingParams f() {
        return this.f97122g;
    }

    public final long g() {
        return this.f97120e;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97117b;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97116a;
    }

    public String toString() {
        return "BMBannerAuctionParams(bannerFormat=" + this.f97119d + ", pricefloor=" + getPrice() + ", timeout=" + this.f97120e + ")";
    }
}
