package com.bytedance.adsdk.qdl;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ BigDecimal a(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
