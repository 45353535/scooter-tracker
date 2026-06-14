package org.bidon.chartboost.impl;

import android.app.Activity;
import androidx.webkit.Profile;
import c1.b;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerFormat f97219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdUnit f97220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f97221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97222e;

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

    public c(Activity activity, BannerFormat bannerFormat, AdUnit adUnit) {
        String string;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97218a = activity;
        this.f97219b = bannerFormat;
        this.f97220c = adUnit;
        this.f97221d = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97222e = (extra == null || (string = extra.getString("ad_location")) == null) ? Profile.DEFAULT_PROFILE_NAME : string;
    }

    public final Activity a() {
        return this.f97218a;
    }

    public final String b() {
        return this.f97222e;
    }

    public final b.a c() {
        int i10 = a.$EnumSwitchMapping$0[this.f97219b.ordinal()];
        if (i10 == 1) {
            return b.a.f6471d;
        }
        if (i10 == 2) {
            return b.a.f6473f;
        }
        if (i10 == 3) {
            return b.a.f6472e;
        }
        if (i10 == 4) {
            return DeviceInfo.INSTANCE.isTablet() ? b.a.f6473f : b.a.f6471d;
        }
        throw new m();
    }

    public final b1.e d() {
        return b.d();
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97220c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97221d;
    }
}
