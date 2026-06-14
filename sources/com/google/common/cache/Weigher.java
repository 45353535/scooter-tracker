package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public interface Weigher<K, V> {
    int weigh(K k10, V v10);
}
