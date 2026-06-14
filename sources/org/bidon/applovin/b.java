package org.bidon.applovin;

import android.app.Activity;
import com.applovin.sdk.AppLovinAdSize;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerFormat f97072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdUnit f97073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f97074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97075e;

    public /* synthetic */ class a {
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

    public b(Activity activity, BannerFormat bannerFormat, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97071a = activity;
        this.f97072b = bannerFormat;
        this.f97073c = adUnit;
        this.f97074d = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97075e = extra != null ? extra.getString(Reporting.Key.ZONE_ID) : null;
    }

    public final Activity a() {
        return this.f97071a;
    }

    public final AppLovinAdSize b() {
        int i10 = a.$EnumSwitchMapping$0[this.f97072b.ordinal()];
        if (i10 == 1) {
            return AppLovinAdSize.MREC;
        }
        if (i10 == 2) {
            return AppLovinAdSize.BANNER;
        }
        if (i10 == 3) {
            return AppLovinAdSize.LEADER;
        }
        if (i10 == 4) {
            return DeviceInfo.INSTANCE.isTablet() ? AppLovinAdSize.LEADER : AppLovinAdSize.BANNER;
        }
        throw new m();
    }

    public final String c() {
        return this.f97075e;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97073c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97074d;
    }

    public String toString() {
        return "ApplovinBannerAuctionParams(bannerFormat=" + this.f97072b + ", adUnit=" + getAdUnit() + ")";
    }
}
