package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMap<K, V> extends ForwardingObject implements Map<K, V> {

    protected abstract class StandardEntrySet extends Maps.EntrySet<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ForwardingMap f29491b;

        @Override // com.google.common.collect.Maps.EntrySet
        Map e() {
            return this.f29491b;
        }
    }

    protected class StandardKeySet extends Maps.KeySet<K, V> {
        public StandardKeySet() {
            super(ForwardingMap.this);
        }
    }

    protected class StandardValues extends Maps.Values<K, V> {
        public StandardValues() {
            super(ForwardingMap.this);
        }
    }

    protected ForwardingMap() {
    }

    public void clear() {
        n().clear();
    }

    public boolean containsKey(Object obj) {
        return n().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return n().containsValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: delegate */
    public abstract Map n();

    public Set<Map.Entry<K, V>> entrySet() {
        return n().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || n().equals(obj);
    }

    public V get(Object obj) {
        return (V) n().get(obj);
    }

    public int hashCode() {
        return n().hashCode();
    }

    public boolean isEmpty() {
        return n().isEmpty();
    }

    public Set<K> keySet() {
        return n().keySet();
    }

    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k10, @ParametricNullness V v10) {
        return (V) n().put(k10, v10);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        n().putAll(map);
    }

    @CanIgnoreReturnValue
    public V remove(Object obj) {
        return (V) n().remove(obj);
    }

    public int size() {
        return n().size();
    }

    protected void standardClear() {
        Iterators.b(entrySet().iterator());
    }

    protected boolean standardContainsKey(Object obj) {
        return Maps.m(this, obj);
    }

    protected boolean standardContainsValue(Object obj) {
        return Maps.n(this, obj);
    }

    protected boolean standardEquals(Object obj) {
        return Maps.p(this, obj);
    }

    protected int standardHashCode() {
        return Sets.b(entrySet());
    }

    protected boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    protected void standardPutAll(Map<? extends K, ? extends V> map) {
        Maps.A(this, map);
    }

    protected V standardRemove(Object obj) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (Objects.equal(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    protected String standardToString() {
        return Maps.I(this);
    }

    public Collection<V> values() {
        return n().values();
    }
}
