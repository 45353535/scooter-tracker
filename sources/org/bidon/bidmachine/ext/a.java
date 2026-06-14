package org.bidon.bidmachine.ext;

import org.bidon.sdk.logs.analytic.AdValue;
import org.bidon.sdk.logs.analytic.Precision;
import zb.c;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static final AdValue a(c cVar) {
        return new AdValue((cVar != null ? cVar.getPrice() : 0.0d) / 1000.0d, "USD", Precision.Precise);
    }
}
