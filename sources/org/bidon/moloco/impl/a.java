package org.bidon.moloco.impl;

import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BannerFormat f97504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdUnit f97505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f97506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f97507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97508e;

    /* JADX INFO: renamed from: org.bidon.moloco.impl.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1137a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerFormat.values().length];
            try {
                iArr[BannerFormat.MRec.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerFormat.Banner.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerFormat.LeaderBoard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerFormat.Adaptive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(BannerFormat bannerFormat, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97504a = bannerFormat;
        this.f97505b = adUnit;
        this.f97506c = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97507d = extra != null ? extra.getString("ad_unit_id") : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97508e = extra2 != null ? extra2.optString("payload") : null;
    }

    public final String a() {
        return this.f97507d;
    }

    public final BannerFormat b() {
        int i10 = C1137a.$EnumSwitchMapping$0[this.f97504a.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return this.f97504a;
        }
        if (i10 == 4) {
            return DeviceInfo.INSTANCE.isTablet() ? BannerFormat.LeaderBoard : BannerFormat.Banner;
        }
        throw new lf.m();
    }

    public final String c() {
        return this.f97508e;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97505b;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97506c;
    }
}
