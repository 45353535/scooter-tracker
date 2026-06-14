package org.bidon.bigoads.impl;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;
import sg.bigo.ads.api.AdSize;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerFormat f97179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdUnit f97180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f97181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f97183f;

    /* JADX INFO: renamed from: org.bidon.bigoads.impl.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1123a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerFormat.values().length];
            try {
                iArr[BannerFormat.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerFormat.MRec.ordinal()] = 2;
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

    public a(Activity activity, BannerFormat bannerFormat, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97178a = activity;
        this.f97179b = bannerFormat;
        this.f97180c = adUnit;
        this.f97181d = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97182e = extra != null ? extra.getString("slot_id") : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97183f = extra2 != null ? extra2.optString("payload") : null;
    }

    public final Activity a() {
        return this.f97178a;
    }

    public final AdSize b() {
        int i10 = C1123a.$EnumSwitchMapping$0[this.f97179b.ordinal()];
        if (i10 == 1) {
            return AdSize.BANNER;
        }
        if (i10 == 2) {
            return AdSize.MEDIUM_RECTANGLE;
        }
        if (i10 == 3) {
            return AdSize.LEADERBOARD;
        }
        if (i10 == 4) {
            return DeviceInfo.INSTANCE.isTablet() ? AdSize.LEADERBOARD : AdSize.BANNER;
        }
        throw new m();
    }

    public final String c() {
        return this.f97183f;
    }

    public final String d() {
        return this.f97182e;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97180c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97181d;
    }
}
