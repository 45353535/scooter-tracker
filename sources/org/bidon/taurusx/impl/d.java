package org.bidon.taurusx.impl;

import android.app.Activity;
import com.taurusx.tax.core.AdSize;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.auction.models.AdUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements AdAuctionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f97730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerFormat f97731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdUnit f97732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f97733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f97734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f97735f;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerFormat.values().length];
            try {
                iArr[BannerFormat.MRec.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d(Activity activity, BannerFormat bannerFormat, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97730a = activity;
        this.f97731b = bannerFormat;
        this.f97732c = adUnit;
        this.f97733d = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.f97734e = extra != null ? extra.getString(Reporting.Key.PLACEMENT_ID) : null;
        JSONObject extra2 = getAdUnit().getExtra();
        this.f97735f = extra2 != null ? extra2.optString("payload") : null;
    }

    public final Activity a() {
        return this.f97730a;
    }

    public final String b() {
        return this.f97734e;
    }

    public final AdSize c() {
        return a.$EnumSwitchMapping$0[this.f97731b.ordinal()] == 1 ? AdSize.Banner_300_250 : AdSize.Banner_320_50;
    }

    public final String d() {
        return this.f97735f;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public AdUnit getAdUnit() {
        return this.f97732c;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.f97733d;
    }
}
