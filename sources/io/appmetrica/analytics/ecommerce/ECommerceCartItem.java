package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.no;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes12.dex */
public class ECommerceCartItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ECommerceProduct f75318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BigDecimal f75319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ECommercePrice f75320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ECommerceReferrer f75321d;

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, long j10) {
        this(eCommerceProduct, eCommercePrice, no.a(j10));
    }

    @NonNull
    public ECommerceProduct getProduct() {
        return this.f75318a;
    }

    @NonNull
    public BigDecimal getQuantity() {
        return this.f75319b;
    }

    @Nullable
    public ECommerceReferrer getReferrer() {
        return this.f75321d;
    }

    @NonNull
    public ECommercePrice getRevenue() {
        return this.f75320c;
    }

    @NonNull
    public ECommerceCartItem setReferrer(@Nullable ECommerceReferrer eCommerceReferrer) {
        this.f75321d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f75318a + ", quantity=" + this.f75319b + ", revenue=" + this.f75320c + ", referrer=" + this.f75321d + '}';
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, double d10) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(no.a(d10)));
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, @NonNull BigDecimal bigDecimal) {
        this.f75318a = eCommerceProduct;
        this.f75319b = bigDecimal;
        this.f75320c = eCommercePrice;
    }
}
