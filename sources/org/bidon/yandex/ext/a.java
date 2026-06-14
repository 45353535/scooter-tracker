package org.bidon.yandex.ext;

import android.content.Context;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.MobileAds;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lf.m;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.analytic.AdValue;
import org.bidon.sdk.logs.analytic.Precision;
import org.bidon.yandex.c;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f97864a = "7.17.0.0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f97865b = MobileAds.getLibraryVersion();

    /* JADX INFO: renamed from: org.bidon.yandex.ext.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1154a {
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

    public static final AdValue a(ImpressionData impressionData) {
        String rawData;
        Double dT = null;
        if (impressionData != null) {
            try {
                rawData = impressionData.getRawData();
            } catch (Exception unused) {
            }
        } else {
            rawData = null;
        }
        if (rawData != null && rawData.length() != 0) {
            String strOptString = new JSONObject(rawData).optString("revenueUSD");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            dT = StringsKt.t(strOptString);
        }
        return new AdValue(dT != null ? dT.doubleValue() : 0.0d, "USD", Precision.Precise);
    }

    public static final BidonError b(AdRequestError adRequestError) {
        Integer numValueOf = adRequestError != null ? Integer.valueOf(adRequestError.getCode()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return new BidonError.IncorrectAdUnit(c.a(), "Invalid request");
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            return new BidonError.NetworkError(c.a(), adRequestError.getDescription());
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            return new BidonError.NoFill(c.a());
        }
        return new BidonError.Unspecified(c.a(), new Throwable("Message: " + (adRequestError != null ? adRequestError.getDescription() : null) + ". Code: " + (adRequestError != null ? Integer.valueOf(adRequestError.getCode()) : null)), null, 4, null);
    }

    public static final String c() {
        return f97864a;
    }

    public static final String d() {
        return f97865b;
    }

    public static final BannerAdSize e(BannerFormat bannerFormat, Context context) {
        Intrinsics.checkNotNullParameter(bannerFormat, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = C1154a.$EnumSwitchMapping$0[bannerFormat.ordinal()];
        if (i10 == 1) {
            return BannerAdSize.INSTANCE.fixedSize(context, 320, 50);
        }
        if (i10 == 2) {
            return BannerAdSize.INSTANCE.fixedSize(context, 728, 90);
        }
        if (i10 == 3) {
            return BannerAdSize.INSTANCE.fixedSize(context, 300, 250);
        }
        if (i10 == 4) {
            return DeviceInfo.INSTANCE.isTablet() ? BannerAdSize.INSTANCE.fixedSize(context, 728, 90) : BannerAdSize.INSTANCE.fixedSize(context, 320, 50);
        }
        throw new m();
    }
}
