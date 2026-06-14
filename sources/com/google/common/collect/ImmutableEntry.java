package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
class ImmutableEntry<K, V> extends AbstractMapEntry<K, V> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f29554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Object f29555c;

    ImmutableEntry(Object obj, Object obj2) {
        this.f29554b = obj;
        this.f29555c = obj2;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @ParametricNullness
    public final K getKey() {
        return (K) this.f29554b;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @ParametricNullness
    public final V getValue() {
        return (V) this.f29555c;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @ParametricNullness
    public final V setValue(@ParametricNullness V v10) {
        throw new UnsupportedOperationException();
    }
}
