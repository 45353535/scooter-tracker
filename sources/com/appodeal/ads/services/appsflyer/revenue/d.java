package com.appodeal.ads.services.appsflyer.revenue;

import com.appodeal.ads.revenue.RevenuePlatform;
import com.appsflyer.MediationNetwork;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    public static final MediationNetwork a(RevenuePlatform revenuePlatform) {
        int i10 = c.f14626a[revenuePlatform.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? MediationNetwork.APPODEAL : MediationNetwork.IRONSOURCE : MediationNetwork.APPLOVIN_MAX : MediationNetwork.APPODEAL;
    }
}
