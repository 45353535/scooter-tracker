package org.bidon.bidmachine.ext;

import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.BannerAdSize;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
import org.bidon.sdk.auction.AdTypeParam;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f97137a = "3.5.0.0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f97138b = "3.5.0";

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

    public static final String a() {
        return f97137a;
    }

    public static final String b() {
        return f97138b;
    }

    public static final AdPlacementConfig c(AdTypeParam adTypeParam, String str) {
        AdPlacementConfig.Builder builderRewardedBuilder;
        Intrinsics.checkNotNullParameter(adTypeParam, "<this>");
        if (adTypeParam instanceof AdTypeParam.Banner) {
            builderRewardedBuilder = AdPlacementConfig.INSTANCE.bannerBuilder(d(((AdTypeParam.Banner) adTypeParam).getBannerFormat()));
        } else if (adTypeParam instanceof AdTypeParam.Interstitial) {
            builderRewardedBuilder = AdPlacementConfig.INSTANCE.interstitialBuilder(AdContentType.All);
        } else {
            if (!(adTypeParam instanceof AdTypeParam.Rewarded)) {
                throw new m();
            }
            builderRewardedBuilder = AdPlacementConfig.INSTANCE.rewardedBuilder(AdContentType.All);
        }
        if (str != null) {
            builderRewardedBuilder.withPlacementId(str);
        }
        return builderRewardedBuilder.build();
    }

    public static final BannerAdSize d(BannerFormat bannerFormat) {
        Intrinsics.checkNotNullParameter(bannerFormat, "<this>");
        int i10 = a.$EnumSwitchMapping$0[bannerFormat.ordinal()];
        if (i10 == 1) {
            return BannerAdSize.Banner;
        }
        if (i10 == 2) {
            return BannerAdSize.Leaderboard;
        }
        if (i10 == 3) {
            return BannerAdSize.MediumRectangle;
        }
        if (i10 == 4) {
            return DeviceInfo.INSTANCE.isTablet() ? BannerAdSize.Leaderboard : BannerAdSize.Banner;
        }
        throw new m();
    }
}
