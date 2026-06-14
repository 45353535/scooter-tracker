package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
abstract class AbstractBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Map f29210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient AbstractBiMap f29211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Set f29212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient Set f29213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient Set f29214f;

    class BiMapEntry extends ForwardingMapEntry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map.Entry f29218b;

        BiMapEntry(Map.Entry entry) {
            this.f29218b = entry;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: g */
        public Map.Entry n() {
            return this.f29218b;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public V setValue(V v10) {
            AbstractBiMap.this.l(v10);
            Preconditions.checkState(AbstractBiMap.this.entrySet().contains(this), "entry no longer in map");
            if (Objects.equal(v10, getValue())) {
                return v10;
            }
            Preconditions.checkArgument(!AbstractBiMap.this.containsValue(v10), "value already present: %s", v10);
            V v11 = (V) this.f29218b.setValue(v10);
            Preconditions.checkState(Objects.equal(v10, AbstractBiMap.this.get(getKey())), "entry no longer in map");
            AbstractBiMap.this.u(getKey(), true, v11, v10);
            return v11;
        }
    }

    private class EntrySet extends ForwardingSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Set f29220b;

        private EntrySet() {
            this.f29220b = AbstractBiMap.this.f29210b.entrySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return Maps.l(n(), obj);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return j(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractBiMap.this.m();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public Set n() {
            return this.f29220b;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!this.f29220b.contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            AbstractBiMap.this.f29211c.f29210b.remove(entry.getValue());
            this.f29220b.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return o(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return k(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return l();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) m(tArr);
        }
    }

    static class Inverse<K, V> extends AbstractBiMap<K, V> {
        Inverse(Map map, AbstractBiMap abstractBiMap) {
            super(map, abstractBiMap);
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            j$.util.Objects.requireNonNull(object);
            t((AbstractBiMap) object);
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(inverse());
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: delegate */
        protected /* bridge */ /* synthetic */ Object n() {
            return super.n();
        }

        @Override // com.google.common.collect.AbstractBiMap
        Object k(Object obj) {
            return this.f29211c.l(obj);
        }

        @Override // com.google.common.collect.AbstractBiMap
        Object l(Object obj) {
            return this.f29211c.k(obj);
        }

        @J2ktIncompatible
        @GwtIncompatible
        Object readResolve() {
            return inverse().inverse();
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    private class KeySet extends ForwardingSet<K> {
        private KeySet() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return Maps.w(AbstractBiMap.this.entrySet().iterator());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public Set n() {
            return AbstractBiMap.this.f29210b.keySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            AbstractBiMap.this.q(obj);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return o(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return k(collection);
        }
    }

    private class ValueSet extends ForwardingSet<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Set f29223b;

        private ValueSet() {
            this.f29223b = AbstractBiMap.this.f29211c.keySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return Maps.R(AbstractBiMap.this.entrySet().iterator());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public Set n() {
            return this.f29223b;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return l();
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) m(tArr);
        }
    }

    private Object o(Object obj, Object obj2, boolean z10) {
        k(obj);
        l(obj2);
        boolean zContainsKey = containsKey(obj);
        if (zContainsKey && Objects.equal(obj2, get(obj))) {
            return obj2;
        }
        if (z10) {
            inverse().remove(obj2);
        } else {
            Preconditions.checkArgument(!containsValue(obj2), "value already present: %s", obj2);
        }
        Object objPut = this.f29210b.put(obj, obj2);
        u(obj, zContainsKey, objPut, obj2);
        return objPut;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object q(Object obj) {
        Object objA = NullnessCasts.a(this.f29210b.remove(obj));
        r(objA);
        return objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(Object obj) {
        this.f29211c.f29210b.remove(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(Object obj, boolean z10, Object obj2, Object obj3) {
        if (z10) {
            r(NullnessCasts.a(obj2));
        }
        this.f29211c.f29210b.put(obj3, obj);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void clear() {
        this.f29210b.clear();
        this.f29211c.f29210b.clear();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsValue(Object obj) {
        return this.f29211c.containsKey(obj);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f29214f;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.f29214f = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V forcePut(@ParametricNullness K k10, @ParametricNullness V v10) {
        return (V) o(k10, v10, true);
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
        return this.f29211c;
    }

    Object k(Object obj) {
        return obj;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f29212d;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.f29212d = keySet;
        return keySet;
    }

    Object l(Object obj) {
        return obj;
    }

    Iterator m() {
        final Iterator<Map.Entry<K, V>> it = this.f29210b.entrySet().iterator();
        return new Iterator<Map.Entry<K, V>>(this) { // from class: com.google.common.collect.AbstractBiMap.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Map.Entry f29215b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AbstractBiMap f29217d;

            {
                this.f29217d = this;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                Map.Entry entry = this.f29215b;
                if (entry == null) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Object value = entry.getValue();
                it.remove();
                this.f29217d.r(value);
                this.f29215b = null;
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                Map.Entry entry = (Map.Entry) it.next();
                this.f29215b = entry;
                return new BiMapEntry(entry);
            }
        };
    }

    AbstractBiMap n(Map map) {
        return new Inverse(map, this);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k10, @ParametricNullness V v10) {
        return (V) o(k10, v10, false);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(Object obj) {
        if (containsKey(obj)) {
            return (V) q(obj);
        }
        return null;
    }

    void s(Map map, Map map2) {
        Preconditions.checkState(this.f29210b == null);
        Preconditions.checkState(this.f29211c == null);
        Preconditions.checkArgument(map.isEmpty());
        Preconditions.checkArgument(map2.isEmpty());
        Preconditions.checkArgument(map != map2);
        this.f29210b = map;
        this.f29211c = n(map2);
    }

    void t(AbstractBiMap abstractBiMap) {
        this.f29211c = abstractBiMap;
    }

    AbstractBiMap(Map map, Map map2) {
        s(map, map2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: delegate */
    public Map n() {
        return this.f29210b;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public Set<V> values() {
        Set<V> set = this.f29213e;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.f29213e = valueSet;
        return valueSet;
    }

    private AbstractBiMap(Map map, AbstractBiMap abstractBiMap) {
        this.f29210b = map;
        this.f29211c = abstractBiMap;
    }
}
