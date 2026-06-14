package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5150hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f77314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f77316d;

    public C5150hj(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f77313a + "', categoriesPath=" + this.f77314b + ", searchQuery='" + this.f77315c + "', payload=" + this.f77316d + '}';
    }

    public C5150hj(String str, String str2, List list, Map map) {
        this.f77313a = str;
        this.f77314b = list;
        this.f77315c = str2;
        this.f77316d = map;
    }
}
