package org.bidon.ironsource.impl;

import android.app.Activity;
import com.ironsource.mediationsdk.ISBannerSize;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerFormat f97323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdUnit f97324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f97325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97326e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerFormat.values().length];
            try {
                iArr[BannerFormat.MRec.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerFormat.LeaderBoard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerFormat.Banner.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerFormat.Adaptive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(Activity activity, BannerFormat bannerFormat, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97322a = activity;
        this.f97323b = bannerFormat;
        this.f97324c = adUnit;
        this.f97325d = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97326e = extra != null ? extra.getString("instance_id") : null;
    }

    public final Activity a() {
        return this.f97322a;
    }

    public final ISBannerSize b() {
        int i10 = a.$EnumSwitchMapping$0[this.f97323b.ordinal()];
        if (i10 == 1) {
            ISBannerSize RECTANGLE = ISBannerSize.RECTANGLE;
            Intrinsics.checkNotNullExpressionValue(RECTANGLE, "RECTANGLE");
            return RECTANGLE;
        }
        if (i10 == 2) {
            ISBannerSize LARGE = ISBannerSize.LARGE;
            Intrinsics.checkNotNullExpressionValue(LARGE, "LARGE");
            return LARGE;
        }
        if (i10 == 3) {
            ISBannerSize BANNER = ISBannerSize.BANNER;
            Intrinsics.checkNotNullExpressionValue(BANNER, "BANNER");
            return BANNER;
        }
        if (i10 != 4) {
            throw new lf.m();
        }
        ISBannerSize iSBannerSize = DeviceInfo.INSTANCE.isTablet() ? ISBannerSize.LARGE : ISBannerSize.BANNER;
        Intrinsics.checkNotNull(iSBannerSize);
        return iSBannerSize;
    }

    public final String c() {
        return this.f97326e;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97324c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97325d;
    }
}
