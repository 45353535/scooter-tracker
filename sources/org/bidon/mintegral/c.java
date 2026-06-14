package org.bidon.mintegral;

import android.app.Activity;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.out.BannerSize;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerFormat f97431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdUnit f97432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f97433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f97435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f97436g;

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
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97430a = activity;
        this.f97431b = bannerFormat;
        this.f97432c = adUnit;
        this.f97433d = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97434e = extra != null ? extra.getString(MBridgeConstans.PROPERTIES_UNIT_ID) : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97435f = extra2 != null ? extra2.getString(Reporting.Key.PLACEMENT_ID) : null;
        JSONObject extra3 = getAdUnit().getExtra();
        this.f97436g = extra3 != null ? extra3.optString("payload") : null;
    }

    public final Activity a() {
        return this.f97430a;
    }

    public final BannerSize b() {
        int i10 = a.$EnumSwitchMapping$0[this.f97431b.ordinal()];
        if (i10 == 1) {
            return new BannerSize(4, 320, 50);
        }
        if (i10 == 2) {
            return new BannerSize(5, 728, 90);
        }
        if (i10 == 3) {
            return new BannerSize(2, 300, 250);
        }
        if (i10 == 4) {
            return DeviceInfo.INSTANCE.isTablet() ? new BannerSize(5, 728, 90) : new BannerSize(4, 320, 50);
        }
        throw new m();
    }

    public final String c() {
        return this.f97436g;
    }

    public final String d() {
        return this.f97435f;
    }

    public final String e() {
        return this.f97434e;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97432c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97433d;
    }

    public String toString() {
        return "MintegralBannerAuctionParam(" + this.f97431b + ", price=" + getPrice() + ", adUnitId=" + getAdUnit() + ", placementId=" + this.f97435f + ", payload='" + this.f97436g + "')";
    }
}
