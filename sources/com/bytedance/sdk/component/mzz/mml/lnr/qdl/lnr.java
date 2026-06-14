package com.bytedance.sdk.component.mzz.mml.lnr.qdl;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class lnr<K, V> {
    private final LinkedHashMap<K, SoftReference<V>> qdl = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16621ud;

    public lnr(int i10) {
        this.f16621ud = i10;
    }

    public synchronized V qdl(K k10) {
        V v10 = null;
        if (k10 == null) {
            return null;
        }
        if (this.f16621ud <= 0) {
            return null;
        }
        SoftReference<V> softReference = this.qdl.get(k10);
        if (softReference != null) {
            v10 = softReference.get();
            if (v10 != null) {
                return v10;
            }
            this.qdl.remove(k10);
        }
        return v10;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxCount=%d,size=%d]", Integer.valueOf(this.f16621ud), Integer.valueOf(this.qdl.size()));
    }

    public synchronized void qdl(K k10, V v10) {
        if (this.f16621ud <= 0) {
            return;
        }
        if (k10 == null || v10 == null) {
            return;
        }
        this.qdl.put(k10, new SoftReference<>(v10));
        int size = this.qdl.size();
        int i10 = this.f16621ud;
        if (size > i10) {
            qdl((int) (((double) i10) * 0.7d));
        }
    }

    public synchronized void qdl(int i10) {
        int size = this.qdl.size() - i10;
        if (size > 0) {
            Iterator<Map.Entry<K, SoftReference<V>>> it = this.qdl.entrySet().iterator();
            for (int i11 = 0; i11 < size; i11++) {
                it.next();
                it.remove();
            }
        }
        if (i10 == 0) {
            return;
        }
        Iterator<Map.Entry<K, SoftReference<V>>> it2 = this.qdl.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
    }
}
