package com.appodeal.ads.adapters.bidmachine;

import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.revenue.RevenuePrecision;
import com.appodeal.ads.utils.Log;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k {
    public static final ImpressionLevelData a(zb.c cVar) {
        if (cVar == null) {
            return null;
        }
        try {
            String str = (String) cVar.a().get("appodeal_id");
            double price = cVar.getPrice();
            double price2 = cVar.getPrice() / 1000.0d;
            return new ImpressionLevelData(str, Double.valueOf(price), Double.valueOf(price2), null, RevenuePrecision.Exact, cVar.getDemandSource(), null, false, 200, null);
        } catch (Exception e10) {
            Log.log(e10);
            return null;
        }
    }
}
