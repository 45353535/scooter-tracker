package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    transient int f29768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient ValueEntry f29769j;

    @VisibleForTesting
    static final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements ValueSetLink<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f29773d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ValueEntry f29774e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ValueSetLink f29775f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ValueSetLink f29776g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ValueEntry f29777h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ValueEntry f29778i;

        ValueEntry(Object obj, Object obj2, int i10, ValueEntry valueEntry) {
            super(obj, obj2);
            this.f29773d = i10;
            this.f29774e = valueEntry;
        }

        static ValueEntry d() {
            return new ValueEntry(null, null, 0, null);
        }

        boolean a(Object obj, int i10) {
            return this.f29773d == i10 && Objects.equal(getValue(), obj);
        }

        public ValueEntry<K, V> getPredecessorInMultimap() {
            ValueEntry<K, V> valueEntry = this.f29777h;
            j$.util.Objects.requireNonNull(valueEntry);
            return valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public ValueSetLink<K, V> getPredecessorInValueSet() {
            ValueSetLink<K, V> valueSetLink = this.f29775f;
            j$.util.Objects.requireNonNull(valueSetLink);
            return valueSetLink;
        }

        public ValueEntry<K, V> getSuccessorInMultimap() {
            ValueEntry<K, V> valueEntry = this.f29778i;
            j$.util.Objects.requireNonNull(valueEntry);
            return valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public ValueSetLink<K, V> getSuccessorInValueSet() {
            ValueSetLink<K, V> valueSetLink = this.f29776g;
            j$.util.Objects.requireNonNull(valueSetLink);
            return valueSetLink;
        }

        public void setPredecessorInMultimap(ValueEntry<K, V> valueEntry) {
            this.f29777h = valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setPredecessorInValueSet(ValueSetLink<K, V> valueSetLink) {
            this.f29775f = valueSetLink;
        }

        public void setSuccessorInMultimap(ValueEntry<K, V> valueEntry) {
            this.f29778i = valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setSuccessorInValueSet(ValueSetLink<K, V> valueSetLink) {
            this.f29776g = valueSetLink;
        }
    }

    @VisibleForTesting
    final class ValueSet extends Sets.ImprovedAbstractSet<V> implements ValueSetLink<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f29779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ValueEntry[] f29780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f29781d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f29782e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ValueSetLink f29783f = this;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ValueSetLink f29784g = this;

        ValueSet(Object obj, int i10) {
            this.f29779b = obj;
            this.f29780c = new ValueEntry[Hashing.a(i10, 1.0d)];
        }

        private int e() {
            return this.f29780c.length - 1;
        }

        private void f() {
            if (Hashing.b(this.f29781d, this.f29780c.length, 1.0d)) {
                int length = this.f29780c.length * 2;
                ValueEntry[] valueEntryArr = new ValueEntry[length];
                this.f29780c = valueEntryArr;
                int i10 = length - 1;
                for (ValueSetLink successorInValueSet = this.f29783f; successorInValueSet != this; successorInValueSet = successorInValueSet.getSuccessorInValueSet()) {
                    ValueEntry valueEntry = (ValueEntry) successorInValueSet;
                    int i11 = valueEntry.f29773d & i10;
                    valueEntry.f29774e = valueEntryArr[i11];
                    valueEntryArr[i11] = valueEntry;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(@ParametricNullness V v10) {
            int iD = Hashing.d(v10);
            int iE = e() & iD;
            ValueEntry valueEntry = this.f29780c[iE];
            for (ValueEntry valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.f29774e) {
                if (valueEntry2.a(v10, iD)) {
                    return false;
                }
            }
            ValueEntry valueEntry3 = new ValueEntry(this.f29779b, v10, iD, valueEntry);
            LinkedHashMultimap.V(this.f29784g, valueEntry3);
            LinkedHashMultimap.V(valueEntry3, this);
            LinkedHashMultimap.U(LinkedHashMultimap.this.f29769j.getPredecessorInMultimap(), valueEntry3);
            LinkedHashMultimap.U(valueEntry3, LinkedHashMultimap.this.f29769j);
            this.f29780c[iE] = valueEntry3;
            this.f29781d++;
            this.f29782e++;
            f();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.f29780c, (Object) null);
            this.f29781d = 0;
            for (ValueSetLink successorInValueSet = this.f29783f; successorInValueSet != this; successorInValueSet = successorInValueSet.getSuccessorInValueSet()) {
                LinkedHashMultimap.S((ValueEntry) successorInValueSet);
            }
            LinkedHashMultimap.V(this, this);
            this.f29782e++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            int iD = Hashing.d(obj);
            for (ValueEntry valueEntry = this.f29780c[e() & iD]; valueEntry != null; valueEntry = valueEntry.f29774e) {
                if (valueEntry.a(obj, iD)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public ValueSetLink<K, V> getPredecessorInValueSet() {
            return this.f29784g;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public ValueSetLink<K, V> getSuccessorInValueSet() {
            return this.f29783f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new Iterator<V>() { // from class: com.google.common.collect.LinkedHashMultimap.ValueSet.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                ValueSetLink f29786b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                ValueEntry f29787c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                int f29788d;

                {
                    this.f29786b = ValueSet.this.f29783f;
                    this.f29788d = ValueSet.this.f29782e;
                }

                private void a() {
                    if (ValueSet.this.f29782e != this.f29788d) {
                        throw new ConcurrentModificationException();
                    }
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    a();
                    return this.f29786b != ValueSet.this;
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public V next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    ValueEntry valueEntry = (ValueEntry) this.f29786b;
                    V value = valueEntry.getValue();
                    this.f29787c = valueEntry;
                    this.f29786b = valueEntry.getSuccessorInValueSet();
                    return value;
                }

                @Override // java.util.Iterator
                public void remove() {
                    a();
                    Preconditions.checkState(this.f29787c != null, "no calls to next() since the last call to remove()");
                    ValueSet.this.remove(this.f29787c.getValue());
                    this.f29788d = ValueSet.this.f29782e;
                    this.f29787c = null;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(Object obj) {
            int iD = Hashing.d(obj);
            int iE = e() & iD;
            ValueEntry valueEntry = null;
            for (ValueEntry valueEntry2 = this.f29780c[iE]; valueEntry2 != null; valueEntry2 = valueEntry2.f29774e) {
                if (valueEntry2.a(obj, iD)) {
                    if (valueEntry == null) {
                        this.f29780c[iE] = valueEntry2.f29774e;
                    } else {
                        valueEntry.f29774e = valueEntry2.f29774e;
                    }
                    LinkedHashMultimap.T(valueEntry2);
                    LinkedHashMultimap.S(valueEntry2);
                    this.f29781d--;
                    this.f29782e++;
                    return true;
                }
                valueEntry = valueEntry2;
            }
            return false;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setPredecessorInValueSet(ValueSetLink<K, V> valueSetLink) {
            this.f29784g = valueSetLink;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setSuccessorInValueSet(ValueSetLink<K, V> valueSetLink) {
            this.f29783f = valueSetLink;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f29781d;
        }
    }

    private interface ValueSetLink<K, V> {
        ValueSetLink<K, V> getPredecessorInValueSet();

        ValueSetLink<K, V> getSuccessorInValueSet();

        void setPredecessorInValueSet(ValueSetLink<K, V> valueSetLink);

        void setSuccessorInValueSet(ValueSetLink<K, V> valueSetLink);
    }

    private LinkedHashMultimap(int i10, int i11) {
        super(Platform.f(i10));
        this.f29768i = 2;
        CollectPreconditions.b(i11, "expectedValuesPerKey");
        this.f29768i = i11;
        ValueEntry valueEntryD = ValueEntry.d();
        this.f29769j = valueEntryD;
        U(valueEntryD, valueEntryD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void S(ValueEntry valueEntry) {
        U(valueEntry.getPredecessorInMultimap(), valueEntry.getSuccessorInMultimap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void T(ValueSetLink valueSetLink) {
        V(valueSetLink.getPredecessorInValueSet(), valueSetLink.getSuccessorInValueSet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void U(ValueEntry valueEntry, ValueEntry valueEntry2) {
        valueEntry.setSuccessorInMultimap(valueEntry2);
        valueEntry2.setPredecessorInMultimap(valueEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void V(ValueSetLink valueSetLink, ValueSetLink valueSetLink2) {
        valueSetLink.setSuccessorInValueSet(valueSetLink2);
        valueSetLink2.setPredecessorInValueSet(valueSetLink);
    }

    public static <K, V> LinkedHashMultimap<K, V> create() {
        return new LinkedHashMultimap<>(16, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        ValueEntry valueEntryD = ValueEntry.d();
        this.f29769j = valueEntryD;
        U(valueEntryD, valueEntryD);
        this.f29768i = 2;
        int i10 = objectInputStream.readInt();
        Map mapF = Platform.f(12);
        for (int i11 = 0; i11 < i10; i11++) {
            Object object = objectInputStream.readObject();
            mapF.put(object, x(object));
        }
        int i12 = objectInputStream.readInt();
        for (int i13 = 0; i13 < i12; i13++) {
            Object object2 = objectInputStream.readObject();
            Object object3 = objectInputStream.readObject();
            Collection collection = (Collection) mapF.get(object2);
            j$.util.Objects.requireNonNull(collection);
            collection.add(object3);
        }
        G(mapF);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(keySet().size());
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: K */
    public Set v() {
        return Platform.g(this.f29768i);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public void clear() {
        super.clear();
        ValueEntry valueEntry = this.f29769j;
        U(valueEntry, valueEntry);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Set get(@ParametricNullness Object obj) {
        return super.get(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    Iterator k() {
        return new Iterator<Map.Entry<K, V>>() { // from class: com.google.common.collect.LinkedHashMultimap.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            ValueEntry f29770b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            ValueEntry f29771c;

            {
                this.f29770b = LinkedHashMultimap.this.f29769j.getSuccessorInMultimap();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f29770b != LinkedHashMultimap.this.f29769j;
            }

            @Override // java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.f29771c != null, "no calls to next() since the last call to remove()");
                LinkedHashMultimap.this.remove(this.f29771c.getKey(), this.f29771c.getValue());
                this.f29771c = null;
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                ValueEntry valueEntry = this.f29770b;
                this.f29771c = valueEntry;
                this.f29770b = valueEntry.getSuccessorInMultimap();
                return valueEntry;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Set<K> keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Multiset keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    Iterator l() {
        return Maps.R(k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean put(@ParametricNullness Object obj, @ParametricNullness Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(Multimap multimap) {
        return super.putAll(multimap);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Set removeAll(Object obj) {
        return super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    Collection x(Object obj) {
        return new ValueSet(obj, this.f29768i);
    }

    public static <K, V> LinkedHashMultimap<K, V> create(int i10, int i11) {
        return new LinkedHashMultimap<>(Maps.k(i10), Maps.k(i11));
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Set<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(@ParametricNullness Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public Set<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable) {
        return super.replaceValues((Object) k10, (Iterable) iterable);
    }

    public static <K, V> LinkedHashMultimap<K, V> create(Multimap<? extends K, ? extends V> multimap) {
        LinkedHashMultimap<K, V> linkedHashMultimapCreate = create(multimap.keySet().size(), 2);
        linkedHashMultimapCreate.putAll(multimap);
        return linkedHashMultimapCreate;
    }
}
