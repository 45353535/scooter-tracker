package net.pubnative.lite.sdk.utils;

import net.pubnative.lite.sdk.models.AdExperience;

/* JADX INFO: loaded from: classes3.dex */
public class AdExperienceManager {
    public static boolean isBrandAd(Integer num, String str) {
        return isBrandCompatible(num) && str.equalsIgnoreCase(AdExperience.BRAND);
    }

    private static boolean isBrandCompatible(Integer num) {
        return num.intValue() == 15;
    }

    public static boolean isPerformanceAd(Integer num, String str) {
        return isPerformanceCompatible(num) && str.equalsIgnoreCase(AdExperience.PERFORMANCE);
    }

    private static boolean isPerformanceCompatible(Integer num) {
        return num.intValue() == 15 || num.intValue() == 21 || num.intValue() == 29 || num.intValue() == 23 || num.intValue() == 22 || num.intValue() == 27;
    }
}
