package com.appodeal.ads.adapters.bidonmediation.ext;

import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.C4574uf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0000\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\u00020\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0004\b\b\u0010\u0005¨\u0006\f"}, d2 = {C4574uf.f45563b, "", "getAdapterVersion", "()Ljava/lang/String;", "setAdapterVersion", "(Ljava/lang/String;)V", "sdkVersion", "getSdkVersion", "setSdkVersion", "toAdmobAdSize", "Lcom/google/android/gms/ads/AdSize;", "Lorg/bidon/sdk/ads/banner/BannerFormat;", "admob_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ExtKt {

    @NotNull
    private static String adapterVersion = "24.7.0.0";

    @NotNull
    private static String sdkVersion;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    static {
        String string = MobileAds.getVersion().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sdkVersion = string;
    }

    @NotNull
    public static final String getAdapterVersion() {
        return adapterVersion;
    }

    @NotNull
    public static final String getSdkVersion() {
        return sdkVersion;
    }

    public static final void setAdapterVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        adapterVersion = str;
    }

    public static final void setSdkVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        sdkVersion = str;
    }

    @NotNull
    public static final AdSize toAdmobAdSize(@NotNull BannerFormat bannerFormat) {
        Intrinsics.checkNotNullParameter(bannerFormat, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[bannerFormat.ordinal()];
        if (i10 == 1) {
            AdSize BANNER = AdSize.BANNER;
            Intrinsics.checkNotNullExpressionValue(BANNER, "BANNER");
            return BANNER;
        }
        if (i10 == 2) {
            AdSize LEADERBOARD = AdSize.LEADERBOARD;
            Intrinsics.checkNotNullExpressionValue(LEADERBOARD, "LEADERBOARD");
            return LEADERBOARD;
        }
        if (i10 == 3) {
            AdSize MEDIUM_RECTANGLE = AdSize.MEDIUM_RECTANGLE;
            Intrinsics.checkNotNullExpressionValue(MEDIUM_RECTANGLE, "MEDIUM_RECTANGLE");
            return MEDIUM_RECTANGLE;
        }
        if (i10 != 4) {
            throw new m();
        }
        if (DeviceInfo.INSTANCE.isTablet()) {
            AdSize adSize = AdSize.LEADERBOARD;
            Intrinsics.checkNotNull(adSize);
            return adSize;
        }
        AdSize adSize2 = AdSize.BANNER;
        Intrinsics.checkNotNull(adSize2);
        return adSize2;
    }
}
