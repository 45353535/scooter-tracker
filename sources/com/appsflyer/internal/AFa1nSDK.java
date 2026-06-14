package com.appsflyer.internal;

import androidx.annotation.Nullable;
import j$.util.Map;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes6.dex */
public class AFa1nSDK extends HashMap<Integer, String> implements Map {
    private static AFa1nSDK getRevenue;
    private final Object AFAdRevenueData = new Object();

    private AFa1nSDK() {
    }

    public static synchronized AFa1nSDK afErrorLog() {
        try {
            if (getRevenue == null) {
                getRevenue = new AFa1nSDK();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return getRevenue;
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public String put(Integer num, String str) {
        String str2;
        synchronized (this.AFAdRevenueData) {
            str2 = (String) super.put(num, str);
        }
        return str2;
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public boolean remove(@Nullable Object obj, @Nullable Object obj2) {
        boolean z$default$remove;
        synchronized (this.AFAdRevenueData) {
            z$default$remove = Map.CC.$default$remove(this, obj, obj2);
        }
        return z$default$remove;
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String remove(@Nullable Object obj) {
        String str;
        synchronized (this.AFAdRevenueData) {
            str = (String) super.remove(obj);
        }
        return str;
    }
}
