package net.pubnative.lite.sdk.utils;

import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.request.Imp;

/* JADX INFO: loaded from: classes3.dex */
public final class OpenRTBAssetsGroup {
    public static Integer get(Imp imp, Integer num, Integer num2, Ad.AdType adType, boolean z10) {
        return adType == Ad.AdType.VIDEO ? getVastGroupId(z10) : Integer.valueOf(getBannerGroupId(z10, imp, num, num2));
    }

    private static int getBannerGroupId(boolean z10, Imp imp, Integer num, Integer num2) {
        int i10 = 10;
        if (imp != null) {
            num = imp.getBanner().getW();
            num2 = imp.getBanner().getH();
        } else if (num == null || num2 == null) {
            return 10;
        }
        if (z10) {
            return 21;
        }
        if (num.intValue() == 300 && num2.intValue() == 50) {
            i10 = 12;
        }
        if (num.intValue() == 300 && num2.intValue() == 250) {
            i10 = 8;
        }
        int i11 = (num.intValue() == 320 && num2.intValue() == 480) ? 21 : i10;
        if (num.intValue() == 1024 && num2.intValue() == 768) {
            i11 = 22;
        }
        if (num.intValue() == 768 && num2.intValue() == 1024) {
            i11 = 23;
        }
        if (num.intValue() == 728 && num2.intValue() == 98) {
            i11 = 24;
        }
        if (num.intValue() == 160 && num2.intValue() == 600) {
            i11 = 25;
        }
        if (num.intValue() == 250 && num2.intValue() == 250) {
            i11 = 26;
        }
        if (num.intValue() == 300 && num2.intValue() == 600) {
            i11 = 27;
        }
        if (num.intValue() == 320 && num2.intValue() == 100) {
            i11 = 28;
        }
        if (num.intValue() == 480 && num2.intValue() == 320) {
            return 29;
        }
        return i11;
    }

    private static Integer getVastGroupId(boolean z10) {
        return z10 ? 15 : 4;
    }
}
