package com.bytedance.sdk.component.qdl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class yt<K, V> {
    private final Map<K, V> qdl = new HashMap();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Map<V, Set<K>> f16670ud = new HashMap();

    public void qdl(Set<K> set, V v10) {
        for (K k10 : set) {
            if (this.qdl.containsKey(k10)) {
                ud(k10);
            }
        }
        Set<K> hashSet = this.f16670ud.get(v10);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f16670ud.put(v10, hashSet);
        }
        hashSet.addAll(set);
        Iterator<K> it = set.iterator();
        while (it.hasNext()) {
            this.qdl.put(it.next(), v10);
        }
    }

    public void ud(K k10) {
        Set<K> set;
        V vRemove = this.qdl.remove(k10);
        if (vRemove == null || (set = this.f16670ud.get(vRemove)) == null) {
            return;
        }
        set.remove(k10);
        if (set.isEmpty()) {
            this.f16670ud.remove(vRemove);
        }
    }

    public V qdl(K k10) {
        return this.qdl.get(k10);
    }

    public void qdl() {
        this.qdl.clear();
        this.f16670ud.clear();
    }
}
