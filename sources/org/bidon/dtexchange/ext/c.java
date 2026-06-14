package org.bidon.dtexchange.ext;

import com.fyber.inneractive.sdk.external.ImpressionData;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.logs.analytic.AdValue;
import org.bidon.sdk.logs.analytic.Precision;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {
    public static final AdValue a(ImpressionData impressionData) {
        String currency;
        Intrinsics.checkNotNullParameter(impressionData, "<this>");
        ImpressionData.Pricing pricing = impressionData.getPricing();
        double value = pricing != null ? pricing.getValue() : 0.0d;
        Precision precision = Precision.Precise;
        ImpressionData.Pricing pricing2 = impressionData.getPricing();
        if (pricing2 == null || (currency = pricing2.getCurrency()) == null) {
            currency = "USD";
        }
        return new AdValue(value, currency, precision);
    }
}
