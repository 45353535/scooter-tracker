package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class Mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f76130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f76131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ef f76132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ef f76133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f76134g;

    public Mf(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new Ef(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() != null ? new Ef(eCommerceProduct.getOriginalPrice()) : null, CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        return "ProductWrapper{sku='" + this.f76128a + "', name='" + this.f76129b + "', categoriesPath=" + this.f76130c + ", payload=" + this.f76131d + ", actualPrice=" + this.f76132e + ", originalPrice=" + this.f76133f + ", promocodes=" + this.f76134g + '}';
    }

    public Mf(String str, String str2, List list, Map map, Ef ef2, Ef ef3, List list2) {
        this.f76128a = str;
        this.f76129b = str2;
        this.f76130c = list;
        this.f76131d = map;
        this.f76132e = ef2;
        this.f76133f = ef3;
        this.f76134g = list2;
    }
}
