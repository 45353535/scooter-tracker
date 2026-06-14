package com.appodeal.ads.segments;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l0 {
    public static String a(AdType adType) {
        int i10 = k0.f14488a[adType.ordinal()];
        if (i10 == 1) {
            return "interstitial";
        }
        if (i10 == 2) {
            return Constants.REWARDED_VIDEO;
        }
        if (i10 == 3) {
            return "banner";
        }
        if (i10 == 4) {
            return "mrec";
        }
        if (i10 != 5) {
            return null;
        }
        return "native";
    }
}
