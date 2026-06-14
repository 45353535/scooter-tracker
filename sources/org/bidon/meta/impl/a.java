package org.bidon.meta.impl;

import android.app.Activity;
import com.facebook.ads.AdSize;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerFormat f97386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdUnit f97387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f97388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f97390f;

    /* JADX INFO: renamed from: org.bidon.meta.impl.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1132a {
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

    public a(Activity activity, BannerFormat bannerFormat, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97385a = activity;
        this.f97386b = bannerFormat;
        this.f97387c = adUnit;
        this.f97388d = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97389e = extra != null ? extra.optString(Reporting.Key.PLACEMENT_ID) : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97390f = extra2 != null ? extra2.optString("payload") : null;
    }

    public final Activity a() {
        return this.f97385a;
    }

    public final AdSize b() {
        int i10 = C1132a.$EnumSwitchMapping$0[this.f97386b.ordinal()];
        if (i10 == 1) {
            AdSize BANNER_320_50 = AdSize.BANNER_320_50;
            Intrinsics.checkNotNullExpressionValue(BANNER_320_50, "BANNER_320_50");
            return BANNER_320_50;
        }
        if (i10 == 2) {
            AdSize BANNER_HEIGHT_90 = AdSize.BANNER_HEIGHT_90;
            Intrinsics.checkNotNullExpressionValue(BANNER_HEIGHT_90, "BANNER_HEIGHT_90");
            return BANNER_HEIGHT_90;
        }
        if (i10 == 3) {
            AdSize RECTANGLE_HEIGHT_250 = AdSize.RECTANGLE_HEIGHT_250;
            Intrinsics.checkNotNullExpressionValue(RECTANGLE_HEIGHT_250, "RECTANGLE_HEIGHT_250");
            return RECTANGLE_HEIGHT_250;
        }
        if (i10 != 4) {
            throw new m();
        }
        AdSize adSize = DeviceInfo.INSTANCE.isTablet() ? AdSize.BANNER_HEIGHT_90 : AdSize.BANNER_HEIGHT_50;
        Intrinsics.checkNotNull(adSize);
        return adSize;
    }

    public final String c() {
        return this.f97390f;
    }

    public final String d() {
        return this.f97389e;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97387c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97388d;
    }
}
