package kotlin.reflect.jvm.internal.impl.protobuf;

import com.ironsource.C4240b4;
import j$.util.DesugarCollections;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet;

/* JADX INFO: loaded from: classes3.dex */
class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private List<SmallSortedMap<K, V>.Entry> entryList;
    private boolean isImmutable;
    private volatile SmallSortedMap<K, V>.EntrySet lazyEntrySet;
    private final int maxArraySize;
    private Map<K, V> overflowEntries;

    private static class EmptySet {
        private static final Iterator<Object> ITERATOR = new Iterator<Object>() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        private static final Iterable<Object> ITERABLE = new Iterable<Object>() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.2
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return EmptySet.ITERATOR;
            }
        };

        static <T> Iterable<T> iterable() {
            return (Iterable<T>) ITERABLE;
        }
    }

    private class Entry implements Comparable<SmallSortedMap<K, V>.Entry>, Map.Entry<K, V> {
        private final K key;
        private V value;

        Entry(SmallSortedMap smallSortedMap, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return equals(this.key, entry.getKey()) && equals(this.value, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.key;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.value;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            SmallSortedMap.this.checkMutable();
            V v11 = this.value;
            this.value = v10;
            return v11;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.key);
            String strValueOf2 = String.valueOf(this.value);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append(C4240b4.j.f42668b);
            sb2.append(strValueOf2);
            return sb2.toString();
        }

        Entry(K k10, V v10) {
            this.key = k10;
            this.value = v10;
        }

        @Override // java.lang.Comparable
        public int compareTo(SmallSortedMap<K, V>.Entry entry) {
            return getKey().compareTo(entry.getKey());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        private boolean equals(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }
    }

    private class EntryIterator implements Iterator<Map.Entry<K, V>> {
        private Iterator<Map.Entry<K, V>> lazyOverflowIterator;
        private boolean nextCalledBeforeRemove;
        private int pos;

        private EntryIterator() {
            this.pos = -1;
        }

        private Iterator<Map.Entry<K, V>> getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = SmallSortedMap.this.overflowEntries.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.pos + 1 < SmallSortedMap.this.entryList.size() || getOverflowIterator().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.nextCalledBeforeRemove) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.nextCalledBeforeRemove = false;
            SmallSortedMap.this.checkMutable();
            if (this.pos >= SmallSortedMap.this.entryList.size()) {
                getOverflowIterator().remove();
                return;
            }
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            int i10 = this.pos;
            this.pos = i10 - 1;
            smallSortedMap.removeArrayEntryAt(i10);
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            this.nextCalledBeforeRemove = true;
            int i10 = this.pos + 1;
            this.pos = i10;
            return i10 < SmallSortedMap.this.entryList.size() ? (Map.Entry) SmallSortedMap.this.entryList.get(this.pos) : getOverflowIterator().next();
        }
    }

    private class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        private EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            SmallSortedMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = SmallSortedMap.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return SmallSortedMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            SmallSortedMap.this.put((Comparable) entry.getKey(), (Object) entry.getValue());
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int binarySearchInArray(K r5) {
        /*
            r4 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>$Entry> r0 = r4.entryList
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>$Entry> r2 = r4.entryList
            java.lang.Object r2 = r2.get(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$Entry r2 = (kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.Entry) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>$Entry> r3 = r4.entryList
            java.lang.Object r3 = r3.get(r2)
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$Entry r3 = (kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.Entry) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.binarySearchInArray(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkMutable() {
        if (this.isImmutable) {
            throw new UnsupportedOperationException();
        }
    }

    private void ensureEntryArrayMutable() {
        checkMutable();
        if (!this.entryList.isEmpty() || (this.entryList instanceof ArrayList)) {
            return;
        }
        this.entryList = new ArrayList(this.maxArraySize);
    }

    private SortedMap<K, V> getOverflowEntriesMutable() {
        checkMutable();
        if (this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof TreeMap)) {
            this.overflowEntries = new TreeMap();
        }
        return (SortedMap) this.overflowEntries;
    }

    static <FieldDescriptorType extends FieldSet.FieldDescriptorLite<FieldDescriptorType>> SmallSortedMap<FieldDescriptorType, Object> newFieldMap(int i10) {
        return (SmallSortedMap<FieldDescriptorType, Object>) new SmallSortedMap<FieldDescriptorType, Object>(i10) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap
            public void makeImmutable() {
                if (!isImmutable()) {
                    for (int i11 = 0; i11 < getNumArrayEntries(); i11++) {
                        Map.Entry<FieldDescriptorType, Object> arrayEntryAt = getArrayEntryAt(i11);
                        if (((FieldSet.FieldDescriptorLite) arrayEntryAt.getKey()).isRepeated()) {
                            arrayEntryAt.setValue(DesugarCollections.unmodifiableList((List) arrayEntryAt.getValue()));
                        }
                    }
                    for (Map.Entry<FieldDescriptorType, Object> entry : getOverflowEntries()) {
                        if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                            entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.makeImmutable();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
            public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
                return super.put((FieldSet.FieldDescriptorLite) obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V removeArrayEntryAt(int i10) {
        checkMutable();
        V value = this.entryList.remove(i10).getValue();
        if (!this.overflowEntries.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = getOverflowEntriesMutable().entrySet().iterator();
            this.entryList.add(new Entry(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        checkMutable();
        if (!this.entryList.isEmpty()) {
            this.entryList.clear();
        }
        if (this.overflowEntries.isEmpty()) {
            return;
        }
        this.overflowEntries.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return binarySearchInArray(comparable) >= 0 || this.overflowEntries.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new EntrySet();
        }
        return this.lazyEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iBinarySearchInArray = binarySearchInArray(comparable);
        return iBinarySearchInArray >= 0 ? this.entryList.get(iBinarySearchInArray).getValue() : this.overflowEntries.get(comparable);
    }

    public Map.Entry<K, V> getArrayEntryAt(int i10) {
        return this.entryList.get(i10);
    }

    public int getNumArrayEntries() {
        return this.entryList.size();
    }

    public Iterable<Map.Entry<K, V>> getOverflowEntries() {
        return this.overflowEntries.isEmpty() ? EmptySet.iterable() : this.overflowEntries.entrySet();
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        this.overflowEntries = this.overflowEntries.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.overflowEntries);
        this.isImmutable = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        checkMutable();
        Comparable comparable = (Comparable) obj;
        int iBinarySearchInArray = binarySearchInArray(comparable);
        if (iBinarySearchInArray >= 0) {
            return removeArrayEntryAt(iBinarySearchInArray);
        }
        if (this.overflowEntries.isEmpty()) {
            return null;
        }
        return this.overflowEntries.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.entryList.size() + this.overflowEntries.size();
    }

    private SmallSortedMap(int i10) {
        this.maxArraySize = i10;
        this.entryList = Collections.EMPTY_LIST;
        this.overflowEntries = Collections.EMPTY_MAP;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        checkMutable();
        int iBinarySearchInArray = binarySearchInArray(k10);
        if (iBinarySearchInArray >= 0) {
            return this.entryList.get(iBinarySearchInArray).setValue(v10);
        }
        ensureEntryArrayMutable();
        int i10 = -(iBinarySearchInArray + 1);
        if (i10 >= this.maxArraySize) {
            return getOverflowEntriesMutable().put(k10, v10);
        }
        int size = this.entryList.size();
        int i11 = this.maxArraySize;
        if (size == i11) {
            SmallSortedMap<K, V>.Entry entryRemove = this.entryList.remove(i11 - 1);
            getOverflowEntriesMutable().put(entryRemove.getKey(), entryRemove.getValue());
        }
        this.entryList.add(i10, new Entry(k10, v10));
        return null;
    }
}
