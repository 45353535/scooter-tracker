package com.appodeal.ads.services.appsflyer.revenue;

import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.service.RevenueTracker;
import com.appodeal.ads.revenue.RevenueInfo;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements RevenueTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function0 f14625b = new Function0() { // from class: com.appodeal.ads.services.appsflyer.revenue.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.a();
        }
    };

    public static final Map a() {
        return MapsKt.emptyMap();
    }

    public final void b(boolean z10, Function0 getPartnerParams) {
        Intrinsics.checkNotNullParameter(getPartnerParams, "getPartnerParams");
        this.f14624a = z10;
        this.f14625b = getPartnerParams;
    }

    @Override // com.appodeal.ads.modules.common.internal.service.RevenueTracker
    public final void trackRevenue(RevenueInfo revenueInfo) {
        Intrinsics.checkNotNullParameter(revenueInfo, "revenueInfo");
        if (this.f14624a) {
            AppsFlyerLib.getInstance().logAdRevenue(new AFAdRevenueData(revenueInfo.getNetworkName(), d.a(revenueInfo.getRevenuePlatform()), revenueInfo.getRevenueCurrency().getStringValue(), revenueInfo.getRevenue()), MapsKt.plus(MapsKt.plus(MapsKt.mapOf(TuplesKt.to(AdRevenueScheme.AD_UNIT, revenueInfo.getAdUnitName()), TuplesKt.to("ad_type", revenueInfo.getAdTypeString()), TuplesKt.to("placement", revenueInfo.getPlacement())), (Map) this.f14625b.invoke()), revenueInfo.getPayload()));
            LogExtKt.logInternal$default("AppsflyerService", "Appodeal invoked trackRevenue with " + revenueInfo, null, 4, null);
        }
    }
}
