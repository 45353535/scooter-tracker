package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AdRevenueScheme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class AFf1sSDK extends AFf1uSDK {

    @NotNull
    private final AFh1nSDK toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1sSDK(@NotNull AFh1nSDK aFh1nSDK, @NotNull AFc1bSDK aFc1bSDK) {
        super(aFh1nSDK, aFc1bSDK);
        Intrinsics.checkNotNullParameter(aFh1nSDK, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        this.toString = aFh1nSDK;
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    protected final void getMediationNetwork(@NotNull AFh1jSDK aFh1jSDK) {
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        super.getMediationNetwork(aFh1jSDK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AFAdRevenueData aFAdRevenueData = this.toString.hashCode;
        Intrinsics.checkNotNullExpressionValue(aFAdRevenueData, "");
        linkedHashMap.put("monetization_network", aFAdRevenueData.getMonetizationNetwork());
        linkedHashMap.put("event_revenue_currency", aFAdRevenueData.getCurrencyIso4217Code());
        linkedHashMap.put("mediation_network", aFAdRevenueData.getMediationNetwork().getValue());
        linkedHashMap.put("event_revenue", Double.valueOf(aFAdRevenueData.getRevenue()));
        Map<String, Object> map = this.toString.copydefault;
        if (map != null && !map.isEmpty()) {
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"ad_type", AdRevenueScheme.AD_UNIT, "country", "placement"});
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (listListOf.contains(key)) {
                    linkedHashMap.put(key, value);
                } else {
                    linkedHashMap2.put(key, value);
                }
            }
            linkedHashMap.put("custom_parameters", linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("name", "adrevenue_sdk");
        linkedHashMap3.put("payload", linkedHashMap);
        Map<String, Object> map2 = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        map2.put("ad_network", linkedHashMap3);
    }
}
