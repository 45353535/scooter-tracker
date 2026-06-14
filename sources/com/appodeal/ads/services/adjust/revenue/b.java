package com.appodeal.ads.services.adjust.revenue;

import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAdRevenue;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.service.RevenueTracker;
import com.appodeal.ads.revenue.RevenueInfo;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements RevenueTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function0 f14561b = new Function0() { // from class: com.appodeal.ads.services.adjust.revenue.a
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
        this.f14560a = z10;
        this.f14561b = getPartnerParams;
    }

    @Override // com.appodeal.ads.modules.common.internal.service.RevenueTracker
    public final void trackRevenue(RevenueInfo revenueInfo) {
        Intrinsics.checkNotNullParameter(revenueInfo, "revenueInfo");
        if (this.f14560a) {
            AdjustAdRevenue adjustAdRevenue = new AdjustAdRevenue(d.a(revenueInfo.getRevenuePlatform()));
            adjustAdRevenue.setRevenue(Double.valueOf(revenueInfo.getRevenue()), revenueInfo.getCurrency());
            adjustAdRevenue.setAdRevenueNetwork(revenueInfo.getNetworkName());
            adjustAdRevenue.setAdRevenueUnit(revenueInfo.getAdUnitName());
            adjustAdRevenue.setAdRevenuePlacement(revenueInfo.getPlacement());
            for (Map.Entry entry : MapsKt.plus((Map) this.f14561b.invoke(), revenueInfo.getPayload()).entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                adjustAdRevenue.addPartnerParameter(str, str2);
                adjustAdRevenue.addCallbackParameter(str, str2);
            }
            Adjust.trackAdRevenue(adjustAdRevenue);
            LogExtKt.logInternal$default("AdjustService", "Appodeal invoked trackRevenue with " + revenueInfo, null, 4, null);
        }
    }
}
