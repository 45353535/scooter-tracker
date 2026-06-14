package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes12.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f76725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76726b;

    public Z(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        return "AmountWrapper{amount=" + this.f76725a + ", unit='" + this.f76726b + "'}";
    }

    public Z(BigDecimal bigDecimal, String str) {
        this.f76725a = bigDecimal;
        this.f76726b = str;
    }
}
