package org.bidon.sdk.ads.banner.ext;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"width", "", "Lorg/bidon/sdk/ads/banner/BannerFormat;", "getWidth", "(Lorg/bidon/sdk/ads/banner/BannerFormat;)I", "height", "getHeight", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BannerFormatExtKt {

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

    public static final int getHeight(@NotNull BannerFormat bannerFormat) {
        Intrinsics.checkNotNullParameter(bannerFormat, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[bannerFormat.ordinal()];
        if (i10 == 1) {
            return 50;
        }
        if (i10 == 2) {
            return 90;
        }
        if (i10 == 3) {
            return 250;
        }
        if (i10 == 4) {
            return DeviceInfo.INSTANCE.isTablet() ? 90 : 50;
        }
        throw new m();
    }

    public static final int getWidth(@NotNull BannerFormat bannerFormat) {
        Intrinsics.checkNotNullParameter(bannerFormat, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[bannerFormat.ordinal()];
        if (i10 == 1) {
            return 320;
        }
        if (i10 == 2) {
            return 728;
        }
        if (i10 == 3) {
            return 300;
        }
        if (i10 == 4) {
            return DeviceInfo.INSTANCE.getScreenWidthDp();
        }
        throw new m();
    }
}
