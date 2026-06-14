package com.appodeal.ads.adapters.dtexchange.unified;

import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.utils.Log;
import com.fyber.inneractive.sdk.external.ImpressionData;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static final ImpressionLevelData a(ImpressionData impressionData) {
        if (impressionData == null) {
            return null;
        }
        try {
            ImpressionData.Pricing pricing = impressionData.getPricing();
            Double dValueOf = pricing != null ? Double.valueOf(pricing.getValue()) : null;
            double dDoubleValue = (dValueOf != null ? dValueOf.doubleValue() : 0.0d) * ((double) 1000.0f);
            ImpressionData.Pricing pricing2 = impressionData.getPricing();
            return new ImpressionLevelData(null, Double.valueOf(dDoubleValue), dValueOf, pricing2 != null ? pricing2.getCurrency() : null, null, impressionData.getDemandSource(), null, false, 209, null);
        } catch (Exception e10) {
            Log.log(e10);
            return null;
        }
    }
}
