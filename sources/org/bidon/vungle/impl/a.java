package org.bidon.vungle.impl;

import android.app.Activity;
import com.vungle.ads.VungleAdSize;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerFormat f97831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdUnit f97832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f97833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f97835f;

    /* JADX INFO: renamed from: org.bidon.vungle.impl.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1152a {
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

    public a(Activity activity, BannerFormat bannerFormat, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97830a = activity;
        this.f97831b = bannerFormat;
        this.f97832c = adUnit;
        this.f97833d = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97834e = extra != null ? extra.getString(Reporting.Key.PLACEMENT_ID) : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97835f = extra2 != null ? extra2.optString("payload") : null;
    }

    public final Activity a() {
        return this.f97830a;
    }

    public final VungleAdSize b() {
        int i10 = C1152a.$EnumSwitchMapping$0[this.f97831b.ordinal()];
        if (i10 == 1) {
            return VungleAdSize.MREC;
        }
        if (i10 == 2) {
            return VungleAdSize.BANNER_LEADERBOARD;
        }
        if (i10 == 3) {
            return VungleAdSize.BANNER;
        }
        if (i10 == 4) {
            return DeviceInfo.INSTANCE.isTablet() ? VungleAdSize.BANNER_LEADERBOARD : VungleAdSize.BANNER;
        }
        throw new m();
    }

    public final String c() {
        return this.f97835f;
    }

    public final String d() {
        return this.f97834e;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97832c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97833d;
    }
}
