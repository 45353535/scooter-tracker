package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5411s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mf f78204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f78205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ef f78206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cg f78207d;

    public C5411s3(ECommerceCartItem eCommerceCartItem) {
        this(new Mf(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Ef(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new Cg(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f78204a + ", quantity=" + this.f78205b + ", revenue=" + this.f78206c + ", referrer=" + this.f78207d + '}';
    }

    public C5411s3(Mf mf2, BigDecimal bigDecimal, Ef ef2, Cg cg2) {
        this.f78204a = mf2;
        this.f78205b = bigDecimal;
        this.f78206c = ef2;
        this.f78207d = cg2;
    }
}
