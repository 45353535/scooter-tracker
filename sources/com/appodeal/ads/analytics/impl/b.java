package com.appodeal.ads.analytics.impl;

import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.mobilefuse.sdk.MobileFuseNativeAdKt;
import kotlin.jvm.internal.Intrinsics;
import lf.m;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static final String a(AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "<this>");
        int i10 = a.f12681a[adType.ordinal()];
        if (i10 == 1) {
            return "BANNER";
        }
        if (i10 == 2) {
            return "MREC";
        }
        if (i10 == 3) {
            return "INTERSTITIAL";
        }
        if (i10 == 4) {
            return "REWARDED_VIDEO";
        }
        if (i10 == 5) {
            return MobileFuseNativeAdKt.AD_TYPE;
        }
        throw new m();
    }
}
