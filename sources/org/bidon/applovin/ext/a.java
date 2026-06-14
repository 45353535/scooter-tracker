package org.bidon.applovin.ext;

import org.bidon.sdk.logs.analytic.AdValue;
import org.bidon.sdk.logs.analytic.Precision;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static final AdValue a(Double d10) {
        return new AdValue((d10 != null ? d10.doubleValue() : 0.0d) / 1000.0d, "USD", Precision.Estimated);
    }
}
