package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.ironsource.C4240b4;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {
    AbstractMapEntry() {
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equal(getKey(), entry.getKey()) && Objects.equal(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public abstract K getKey();

    @Override // java.util.Map.Entry
    @ParametricNullness
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public V setValue(@ParametricNullness V v10) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return getKey() + C4240b4.j.f42668b + getValue();
    }
}
