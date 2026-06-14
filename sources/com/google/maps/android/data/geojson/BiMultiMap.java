package com.google.maps.android.data.geojson;

import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class BiMultiMap<K> extends HashMap<K, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f33965b = new HashMap();

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        this.f33965b.clear();
    }

    public K getKey(Object obj) {
        return (K) this.f33965b.get(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(K k10, Object obj) {
        if (obj instanceof Collection) {
            return put((Object) k10, (Collection) obj);
        }
        this.f33965b.put(obj, k10);
        return super.put(k10, obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ?> map) {
        for (Map.Entry<? extends K, ?> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Object objRemove = super.remove(obj);
        if (!(objRemove instanceof Collection)) {
            this.f33965b.remove(objRemove);
            return objRemove;
        }
        Iterator it = ((Collection) objRemove).iterator();
        while (it.hasNext()) {
            this.f33965b.remove(it.next());
        }
        return objRemove;
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    @NonNull
    public BiMultiMap<K> clone() {
        BiMultiMap<K> biMultiMap = new BiMultiMap<>();
        biMultiMap.putAll((Map) super.clone());
        return biMultiMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object put(K k10, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f33965b.put(it.next(), k10);
        }
        return super.put((Object) k10, collection);
    }
}
