package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.no;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes12.dex */
public class ECommerceAmount {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BigDecimal f75316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f75317b;

    public ECommerceAmount(long j10, @NonNull String str) {
        this(no.a(j10), str);
    }

    @NonNull
    public BigDecimal getAmount() {
        return this.f75316a;
    }

    @NonNull
    public String getUnit() {
        return this.f75317b;
    }

    @NonNull
    public String toString() {
        return "ECommerceAmount{amount=" + this.f75316a + ", unit='" + this.f75317b + "'}";
    }

    public ECommerceAmount(double d10, @NonNull String str) {
        this(new BigDecimal(no.a(d10)), str);
    }

    public ECommerceAmount(@NonNull BigDecimal bigDecimal, @NonNull String str) {
        this.f75316a = bigDecimal;
        this.f75317b = str;
    }
}
