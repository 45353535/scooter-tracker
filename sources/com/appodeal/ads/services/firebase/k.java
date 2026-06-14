package com.appodeal.ads.services.firebase;

import com.appodeal.ads.revenue.RevenuePlatform;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k {
    public static final String a(RevenuePlatform revenuePlatform) {
        int i10 = j.f14683a[revenuePlatform.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Appodeal" : "level_play" : "applovin_max_sdk" : "Appodeal";
    }
}
