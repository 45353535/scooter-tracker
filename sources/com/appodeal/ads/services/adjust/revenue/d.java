package com.appodeal.ads.services.adjust.revenue;

import com.appodeal.ads.revenue.RevenuePlatform;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    public static final String a(RevenuePlatform revenuePlatform) {
        int i10 = c.f14562a[revenuePlatform.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "publisher_sdk" : "ironsource_sdk" : "applovin_max_sdk" : "publisher_sdk";
    }
}
