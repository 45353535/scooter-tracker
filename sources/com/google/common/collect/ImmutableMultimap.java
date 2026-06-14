package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Multiset;
import com.google.common.collect.Serialization;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMultimap<K, V> extends BaseImmutableMultimap<K, V> implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final transient ImmutableMap f29603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final transient int f29604h;

    private static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ImmutableMultimap f29616c;

        EntryCollection(ImmutableMultimap immutableMultimap) {
            this.f29616c = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f29616c.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return this.f29616c.r();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f29616c.size();
        }

        @Override // com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return this.f29616c.k();
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    static class FieldSettersHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Serialization.FieldSetter f29617a = Serialization.a(ImmutableMultimap.class, "map");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Serialization.FieldSetter f29618b = Serialization.a(ImmutableMultimap.class, "size");
    }

    class Keys extends ImmutableMultiset<K> {
        Keys() {
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use KeysSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return ImmutableMultimap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            Collection collection = (Collection) ImmutableMultimap.this.f29603g.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableMultiset
        Multiset.Entry o(int i10) {
            Map.Entry<K, V> entry = ImmutableMultimap.this.f29603g.entrySet().asList().get(i10);
            return Multisets.immutableEntry(entry.getKey(), ((Collection) entry.getValue()).size());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return ImmutableMultimap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return new KeysSerializedForm(ImmutableMultimap.this);
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
        public ImmutableSet<K> elementSet() {
            return ImmutableMultimap.this.keySet();
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static final class KeysSerializedForm implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableMultimap f29620b;

        KeysSerializedForm(ImmutableMultimap immutableMultimap) {
            this.f29620b = immutableMultimap;
        }

        Object readResolve() {
            return this.f29620b.keys();
        }
    }

    private static final class Values<K, V> extends ImmutableCollection<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient ImmutableMultimap f29621c;

        Values(ImmutableMultimap immutableMultimap) {
            this.f29621c = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection
        int a(Object[] objArr, int i10) {
            UnmodifiableIterator<V> it = this.f29621c.f29603g.values().iterator();
            while (it.hasNext()) {
                i10 = ((ImmutableCollection) it.next()).a(objArr, i10);
            }
            return i10;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f29621c.containsValue(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f29621c.size();
        }

        @Override // com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<V> iterator() {
            return this.f29621c.l();
        }
    }

    ImmutableMultimap(ImmutableMap immutableMap, int i10) {
        this.f29603g = immutableMap;
        this.f29604h = i10;
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> Builder<K, V> builderWithExpectedKeys(int i10) {
        CollectPreconditions.b(i10, "expectedKeys");
        return new Builder<>(i10);
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> multimap) {
        if (multimap instanceof ImmutableMultimap) {
            ImmutableMultimap<K, V> immutableMultimap = (ImmutableMultimap) multimap;
            if (!immutableMultimap.r()) {
                return immutableMultimap;
            }
        }
        return ImmutableListMultimap.copyOf((Multimap) multimap);
    }

    public static <K, V> ImmutableMultimap<K, V> of() {
        return ImmutableListMultimap.of();
    }

    @Override // com.google.common.collect.Multimap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        return this.f29603g.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    Map d() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public abstract ImmutableCollection<V> get(K k10);

    @Override // com.google.common.collect.AbstractMultimap
    Set h() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public abstract ImmutableMultimap<V, K> inverse();

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection g() {
        return new EntryCollection(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ImmutableMultiset i() {
        return new Keys();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection j() {
        return new Values(this);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean putAll(K k10, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public UnmodifiableIterator k() {
        return new UnmodifiableIterator<Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableMultimap.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final Iterator f29605b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f29606c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Iterator f29607d = Iterators.e();

            {
                this.f29605b = ImmutableMultimap.this.f29603g.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f29607d.hasNext() || this.f29605b.hasNext();
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                if (!this.f29607d.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f29605b.next();
                    this.f29606c = entry.getKey();
                    this.f29607d = ((ImmutableCollection) entry.getValue()).iterator();
                }
                Object obj = this.f29606c;
                Objects.requireNonNull(obj);
                return Maps.immutableEntry(obj, this.f29607d.next());
            }
        };
    }

    boolean r() {
        return this.f29603g.k();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public UnmodifiableIterator l() {
        return new UnmodifiableIterator<V>() { // from class: com.google.common.collect.ImmutableMultimap.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Iterator f29609b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Iterator f29610c = Iterators.e();

            {
                this.f29609b = ImmutableMultimap.this.f29603g.values().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f29610c.hasNext() || this.f29609b.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                if (!this.f29610c.hasNext()) {
                    this.f29610c = ((ImmutableCollection) this.f29609b.next()).iterator();
                }
                return (V) this.f29610c.next();
            }
        };
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.f29604h;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @DoNotMock
    public static class Builder<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Map f29612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Comparator f29613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Comparator f29614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f29615d = 4;

        public Builder() {
        }

        Builder a(Builder builder) {
            Map map = builder.f29612a;
            if (map != null) {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    putAll(entry.getKey(), ((ImmutableCollection.Builder) entry.getValue()).build());
                }
            }
            return this;
        }

        Map b() {
            Map map = this.f29612a;
            if (map != null) {
                return map;
            }
            Map mapH = Platform.h();
            this.f29612a = mapH;
            return mapH;
        }

        public ImmutableMultimap<K, V> build() {
            Map map = this.f29612a;
            if (map == null) {
                return ImmutableListMultimap.of();
            }
            Collection collectionEntrySet = map.entrySet();
            Comparator comparator = this.f29613b;
            if (comparator != null) {
                collectionEntrySet = Ordering.from(comparator).d().immutableSortedCopy(collectionEntrySet);
            }
            return ImmutableListMultimap.t(collectionEntrySet, this.f29614c);
        }

        int c(int i10, Iterable iterable) {
            return iterable instanceof Collection ? Math.max(i10, ((Collection) iterable).size()) : i10;
        }

        ImmutableCollection.Builder d(int i10) {
            return ImmutableList.builderWithExpectedSize(i10);
        }

        @CanIgnoreReturnValue
        public Builder<K, V> expectedValuesPerKey(int i10) {
            CollectPreconditions.b(i10, "expectedValuesPerKey");
            this.f29615d = Math.max(i10, 1);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> orderKeysBy(Comparator<? super K> comparator) {
            this.f29613b = (Comparator) Preconditions.checkNotNull(comparator);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> orderValuesBy(Comparator<? super V> comparator) {
            this.f29614c = (Comparator) Preconditions.checkNotNull(comparator);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(K k10, V v10) {
            CollectPreconditions.a(k10, v10);
            ImmutableCollection.Builder builderD = (ImmutableCollection.Builder) b().get(k10);
            if (builderD == null) {
                builderD = d(this.f29615d);
                b().put(k10, builderD);
            }
            builderD.add(v10);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        Builder(int i10) {
            if (i10 > 0) {
                this.f29612a = Platform.i(i10);
            }
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(K k10, Iterable<? extends V> iterable) {
            if (k10 != null) {
                Iterator<? extends V> it = iterable.iterator();
                if (it.hasNext()) {
                    ImmutableCollection.Builder builderD = (ImmutableCollection.Builder) b().get(k10);
                    if (builderD == null) {
                        builderD = d(c(this.f29615d, iterable));
                        b().put(k10, builderD);
                    }
                    while (it.hasNext()) {
                        V next = it.next();
                        CollectPreconditions.a(k10, next);
                        builderD.add(next);
                    }
                }
                return this;
            }
            throw new NullPointerException("null key in entry: null=" + Iterables.toString(iterable));
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(K k10, V... vArr) {
            return putAll(k10, Arrays.asList(vArr));
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Multimap<? extends K, ? extends V> multimap) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : multimap.asMap().entrySet()) {
                putAll(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k10, V v10) {
        return ImmutableListMultimap.of((Object) k10, (Object) v10);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public ImmutableMap<K, Collection<V>> asMap() {
        return this.f29603g;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableCollection<Map.Entry<K, V>> entries() {
        return (ImmutableCollection) super.entries();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableSet<K> keySet() {
        return this.f29603g.keySet();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableMultiset<K> keys() {
        return (ImmutableMultiset) super.keys();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean putAll(Multimap<? extends K, ? extends V> multimap) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public ImmutableCollection<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public ImmutableCollection<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k10, V v10, K k11, V v11) {
        return ImmutableListMultimap.of((Object) k10, (Object) v10, (Object) k11, (Object) v11);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12) {
        return ImmutableListMultimap.of((Object) k10, (Object) v10, (Object) k11, (Object) v11, (Object) k12, (Object) v12);
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return ImmutableListMultimap.copyOf((Iterable) iterable);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        return ImmutableListMultimap.of((Object) k10, (Object) v10, (Object) k11, (Object) v11, (Object) k12, (Object) v12, (Object) k13, (Object) v13);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        return ImmutableListMultimap.of((Object) k10, (Object) v10, (Object) k11, (Object) v11, (Object) k12, (Object) v12, (Object) k13, (Object) v13, (Object) k14, (Object) v14);
    }
}
