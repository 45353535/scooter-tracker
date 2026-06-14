package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.we, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5522we {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f78507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f78508d;

    public C5522we(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C5411s3((ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "OrderWrapper{uuid='" + this.f78505a + "', identifier='" + this.f78506b + "', cartItems=" + this.f78507c + ", payload=" + this.f78508d + '}';
    }

    public C5522we(String str, String str2, ArrayList arrayList, Map map) {
        this.f78505a = str;
        this.f78506b = str2;
        this.f78507c = arrayList;
        this.f78508d = map;
    }
}
