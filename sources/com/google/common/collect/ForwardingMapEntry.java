package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMapEntry<K, V> extends ForwardingObject implements Map.Entry<K, V> {
    protected ForwardingMapEntry() {
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        return n().equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract Map.Entry n();

    @Override // java.util.Map.Entry
    @ParametricNullness
    public K getKey() {
        return (K) n().getKey();
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public V getValue() {
        return (V) n().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return n().hashCode();
    }

    @ParametricNullness
    @CanIgnoreReturnValue
    public V setValue(@ParametricNullness V v10) {
        return (V) n().setValue(v10);
    }

    protected boolean standardEquals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equal(getKey(), entry.getKey()) && Objects.equal(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }
}
