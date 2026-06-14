package org.bidon.startio.impl;

import android.app.Activity;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerFormat f97672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdUnit f97673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f97674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f97676f;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerFormat.values().length];
            try {
                iArr[BannerFormat.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerFormat.LeaderBoard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerFormat.MRec.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerFormat.Adaptive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d(Activity activity, BannerFormat bannerFormat, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97671a = activity;
        this.f97672b = bannerFormat;
        this.f97673c = adUnit;
        this.f97674d = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97675e = extra != null ? extra.optString("payload") : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97676f = extra2 != null ? extra2.optString("tag_id") : null;
    }

    public final Activity a() {
        return this.f97671a;
    }

    public final BannerFormat b() {
        return this.f97672b;
    }

    public final Pair c() {
        int i10 = a.$EnumSwitchMapping$0[this.f97672b.ordinal()];
        if (i10 == 1) {
            return TuplesKt.to(320, 50);
        }
        if (i10 == 2) {
            return TuplesKt.to(728, 90);
        }
        if (i10 == 3) {
            return TuplesKt.to(300, 250);
        }
        if (i10 == 4) {
            return DeviceInfo.INSTANCE.isTablet() ? TuplesKt.to(728, 90) : TuplesKt.to(320, 50);
        }
        throw new m();
    }

    public final String d() {
        return this.f97675e;
    }

    public final String e() {
        return this.f97676f;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97673c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97674d;
    }
}
