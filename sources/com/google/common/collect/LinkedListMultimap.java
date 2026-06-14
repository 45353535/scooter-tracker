package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public class LinkedListMultimap<K, V> extends AbstractMultimap<K, V> implements ListMultimap<K, V>, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Node f29790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Node f29791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient Map f29792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient int f29793j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private transient int f29794k;

    private class DistinctKeyIterator implements Iterator<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Set f29802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Node f29803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Node f29804d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f29805e;

        private DistinctKeyIterator() {
            this.f29802b = Sets.newHashSetWithExpectedSize(LinkedListMultimap.this.keySet().size());
            this.f29803c = LinkedListMultimap.this.f29790g;
            this.f29805e = LinkedListMultimap.this.f29794k;
        }

        private void a() {
            if (LinkedListMultimap.this.f29794k != this.f29805e) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f29803c != null;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public K next() {
            Node node;
            a();
            Node node2 = this.f29803c;
            if (node2 == null) {
                throw new NoSuchElementException();
            }
            this.f29804d = node2;
            this.f29802b.add(node2.f29810b);
            do {
                node = this.f29803c.f29812d;
                this.f29803c = node;
                if (node == null) {
                    break;
                }
            } while (!this.f29802b.add(node.f29810b));
            return (K) this.f29804d.f29810b;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            Preconditions.checkState(this.f29804d != null, "no calls to next() since the last call to remove()");
            LinkedListMultimap.this.C(this.f29804d.f29810b);
            this.f29804d = null;
            this.f29805e = LinkedListMultimap.this.f29794k;
        }
    }

    private static class KeyList<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Node f29807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Node f29808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29809c;

        KeyList(Node node) {
            this.f29807a = node;
            this.f29808b = node;
            node.f29815g = null;
            node.f29814f = null;
            this.f29809c = 1;
        }
    }

    static final class Node<K, V> extends AbstractMapEntry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f29810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f29811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Node f29812d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Node f29813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Node f29814f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Node f29815g;

        Node(Object obj, Object obj2) {
            this.f29810b = obj;
            this.f29811c = obj2;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return (K) this.f29810b;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            return (V) this.f29811c;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v10) {
            V v11 = (V) this.f29811c;
            this.f29811c = v10;
            return v11;
        }
    }

    private class NodeIterator implements ListIterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Node f29817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Node f29818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Node f29819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f29820f;

        NodeIterator(int i10) {
            this.f29820f = LinkedListMultimap.this.f29794k;
            int size = LinkedListMultimap.this.size();
            Preconditions.checkPositionIndex(i10, size);
            if (i10 < size / 2) {
                this.f29817c = LinkedListMultimap.this.f29790g;
                while (true) {
                    int i11 = i10 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    next();
                    i10 = i11;
                }
            } else {
                this.f29819e = LinkedListMultimap.this.f29791h;
                this.f29816b = size;
                while (true) {
                    int i12 = i10 + 1;
                    if (i10 >= size) {
                        break;
                    }
                    previous();
                    i10 = i12;
                }
            }
            this.f29818d = null;
        }

        private void a() {
            if (LinkedListMultimap.this.f29794k != this.f29820f) {
                throw new ConcurrentModificationException();
            }
        }

        void b(Object obj) {
            Preconditions.checkState(this.f29818d != null);
            this.f29818d.f29811c = obj;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f29817c != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            a();
            return this.f29819e != null;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f29816b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f29816b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            Preconditions.checkState(this.f29818d != null, "no calls to next() since the last call to remove()");
            Node node = this.f29818d;
            if (node != this.f29817c) {
                this.f29819e = node.f29813e;
                this.f29816b--;
            } else {
                this.f29817c = node.f29812d;
            }
            LinkedListMultimap.this.D(node);
            this.f29818d = null;
            this.f29820f = LinkedListMultimap.this.f29794k;
        }

        @Override // java.util.ListIterator
        public void add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @CanIgnoreReturnValue
        public Node<K, V> next() {
            a();
            Node<K, V> node = this.f29817c;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.f29818d = node;
            this.f29819e = node;
            this.f29817c = node.f29812d;
            this.f29816b++;
            return node;
        }

        @Override // java.util.ListIterator
        @CanIgnoreReturnValue
        public Node<K, V> previous() {
            a();
            Node<K, V> node = this.f29819e;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.f29818d = node;
            this.f29817c = node;
            this.f29819e = node.f29813e;
            this.f29816b--;
            return node;
        }

        @Override // java.util.ListIterator
        public void set(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }
    }

    LinkedListMultimap() {
        this(12);
    }

    private List B(Object obj) {
        return DesugarCollections.unmodifiableList(Lists.newArrayList(new ValueForKeyIterator(obj)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(Object obj) {
        Iterators.b(new ValueForKeyIterator(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(Node node) {
        Node node2 = node.f29813e;
        if (node2 != null) {
            node2.f29812d = node.f29812d;
        } else {
            this.f29790g = node.f29812d;
        }
        Node node3 = node.f29812d;
        if (node3 != null) {
            node3.f29813e = node2;
        } else {
            this.f29791h = node2;
        }
        if (node.f29815g == null && node.f29814f == null) {
            KeyList keyList = (KeyList) this.f29792i.remove(node.f29810b);
            Objects.requireNonNull(keyList);
            keyList.f29809c = 0;
            this.f29794k++;
        } else {
            KeyList keyList2 = (KeyList) this.f29792i.get(node.f29810b);
            Objects.requireNonNull(keyList2);
            keyList2.f29809c--;
            Node node4 = node.f29815g;
            if (node4 == null) {
                Node node5 = node.f29814f;
                Objects.requireNonNull(node5);
                keyList2.f29807a = node5;
            } else {
                node4.f29814f = node.f29814f;
            }
            Node node6 = node.f29814f;
            if (node6 == null) {
                Node node7 = node.f29815g;
                Objects.requireNonNull(node7);
                keyList2.f29808b = node7;
            } else {
                node6.f29815g = node.f29815g;
            }
        }
        this.f29793j--;
    }

    public static <K, V> LinkedListMultimap<K, V> create() {
        return new LinkedListMultimap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f29792i = CompactLinkedHashMap.create();
        int i10 = objectInputStream.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Node v(Object obj, Object obj2, Node node) {
        Node node2 = new Node(obj, obj2);
        if (this.f29790g == null) {
            this.f29791h = node2;
            this.f29790g = node2;
            this.f29792i.put(obj, new KeyList(node2));
            this.f29794k++;
        } else if (node == null) {
            Node node3 = this.f29791h;
            Objects.requireNonNull(node3);
            node3.f29812d = node2;
            node2.f29813e = this.f29791h;
            this.f29791h = node2;
            KeyList keyList = (KeyList) this.f29792i.get(obj);
            if (keyList == null) {
                this.f29792i.put(obj, new KeyList(node2));
                this.f29794k++;
            } else {
                keyList.f29809c++;
                Node node4 = keyList.f29808b;
                node4.f29814f = node2;
                node2.f29815g = node4;
                keyList.f29808b = node2;
            }
        } else {
            KeyList keyList2 = (KeyList) this.f29792i.get(obj);
            Objects.requireNonNull(keyList2);
            keyList2.f29809c++;
            node2.f29813e = node.f29813e;
            node2.f29815g = node.f29815g;
            node2.f29812d = node;
            node2.f29814f = node;
            Node node5 = node.f29815g;
            if (node5 == null) {
                keyList2.f29807a = node2;
            } else {
                node5.f29814f = node2;
            }
            Node node6 = node.f29813e;
            if (node6 == null) {
                this.f29790g = node2;
            } else {
                node6.f29812d = node2;
            }
            node.f29813e = node2;
            node.f29815g = node2;
        }
        this.f29793j++;
        return node2;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public List j() {
        return new AbstractSequentialList<V>() { // from class: com.google.common.collect.LinkedListMultimap.1ValuesImpl
            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public ListIterator<V> listIterator(int i10) {
                final NodeIterator nodeIterator = new NodeIterator(i10);
                return new TransformedListIterator<Map.Entry<K, V>, V>(this, nodeIterator) { // from class: com.google.common.collect.LinkedListMultimap.1ValuesImpl.1

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ C1ValuesImpl f29801d;

                    {
                        this.f29801d = this;
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @Override // com.google.common.collect.TransformedIterator
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public Object a(Map.Entry entry) {
                        return entry.getValue();
                    }

                    @Override // com.google.common.collect.TransformedListIterator, java.util.ListIterator
                    public void set(@ParametricNullness V v10) {
                        nodeIterator.b(v10);
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return LinkedListMultimap.this.f29793j;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        this.f29790g = null;
        this.f29791h = null;
        this.f29792i.clear();
        this.f29793j = 0;
        this.f29794k++;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        return this.f29792i.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    Map d() {
        return new Multimaps.AsMap(this);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    Set h() {
        return new Sets.ImprovedAbstractSet<K>() { // from class: com.google.common.collect.LinkedListMultimap.1KeySetImpl
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return LinkedListMultimap.this.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<K> iterator() {
                return new DistinctKeyIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                return !LinkedListMultimap.this.removeAll(obj).isEmpty();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return LinkedListMultimap.this.f29792i.size();
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractMultimap
    Multiset i() {
        return new Multimaps.Keys(this);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean isEmpty() {
        return this.f29790g == null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    Iterator k() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Multiset keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K k10, @ParametricNullness V v10) {
        v(k10, v10, null);
        return true;
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

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.f29793j;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public List g() {
        return new AbstractSequentialList<Map.Entry<K, V>>() { // from class: com.google.common.collect.LinkedListMultimap.1EntriesImpl
            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public ListIterator<Map.Entry<K, V>> listIterator(int i10) {
                return new NodeIterator(i10);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return LinkedListMultimap.this.f29793j;
            }
        };
    }

    private LinkedListMultimap(int i10) {
        this.f29792i = Platform.d(i10);
    }

    public static <K, V> LinkedListMultimap<K, V> create(int i10) {
        return new LinkedListMultimap<>(i10);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public List<Map.Entry<K, V>> entries() {
        return (List) super.entries();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public List<V> get(@ParametricNullness final K k10) {
        return new AbstractSequentialList<V>(this) { // from class: com.google.common.collect.LinkedListMultimap.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ LinkedListMultimap f29796c;

            {
                this.f29796c = this;
            }

            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public ListIterator<V> listIterator(int i10) {
                return new ValueForKeyIterator(k10, i10);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                KeyList keyList = (KeyList) this.f29796c.f29792i.get(k10);
                if (keyList == null) {
                    return 0;
                }
                return keyList.f29809c;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(@ParametricNullness Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public List<V> removeAll(Object obj) {
        List<V> listB = B(obj);
        C(obj);
        return listB;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public List<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable) {
        List<V> listB = B(k10);
        ValueForKeyIterator valueForKeyIterator = new ValueForKeyIterator(k10);
        Iterator<? extends V> it = iterable.iterator();
        while (valueForKeyIterator.hasNext() && it.hasNext()) {
            valueForKeyIterator.next();
            valueForKeyIterator.set(it.next());
        }
        while (valueForKeyIterator.hasNext()) {
            valueForKeyIterator.next();
            valueForKeyIterator.remove();
        }
        while (it.hasNext()) {
            valueForKeyIterator.add(it.next());
        }
        return listB;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public List<V> values() {
        return (List) super.values();
    }

    public static <K, V> LinkedListMultimap<K, V> create(Multimap<? extends K, ? extends V> multimap) {
        return new LinkedListMultimap<>(multimap);
    }

    private class ValueForKeyIterator implements ListIterator<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f29822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Node f29824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Node f29825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Node f29826f;

        ValueForKeyIterator(Object obj) {
            this.f29822b = obj;
            KeyList keyList = (KeyList) LinkedListMultimap.this.f29792i.get(obj);
            this.f29824d = keyList == null ? null : keyList.f29807a;
        }

        @Override // java.util.ListIterator
        public void add(@ParametricNullness V v10) {
            this.f29826f = LinkedListMultimap.this.v(this.f29822b, v10, this.f29824d);
            this.f29823c++;
            this.f29825e = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f29824d != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f29826f != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @ParametricNullness
        @CanIgnoreReturnValue
        public V next() {
            Node node = this.f29824d;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.f29825e = node;
            this.f29826f = node;
            this.f29824d = node.f29814f;
            this.f29823c++;
            return (V) node.f29811c;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f29823c;
        }

        @Override // java.util.ListIterator
        @ParametricNullness
        @CanIgnoreReturnValue
        public V previous() {
            Node node = this.f29826f;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.f29825e = node;
            this.f29824d = node;
            this.f29826f = node.f29815g;
            this.f29823c--;
            return (V) node.f29811c;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f29823c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            Preconditions.checkState(this.f29825e != null, "no calls to next() since the last call to remove()");
            Node node = this.f29825e;
            if (node != this.f29824d) {
                this.f29826f = node.f29815g;
                this.f29823c--;
            } else {
                this.f29824d = node.f29814f;
            }
            LinkedListMultimap.this.D(node);
            this.f29825e = null;
        }

        @Override // java.util.ListIterator
        public void set(@ParametricNullness V v10) {
            Preconditions.checkState(this.f29825e != null);
            this.f29825e.f29811c = v10;
        }

        public ValueForKeyIterator(@ParametricNullness K k10, int i10) {
            KeyList keyList = (KeyList) LinkedListMultimap.this.f29792i.get(k10);
            int i11 = keyList == null ? 0 : keyList.f29809c;
            Preconditions.checkPositionIndex(i10, i11);
            if (i10 >= i11 / 2) {
                this.f29826f = keyList == null ? null : keyList.f29808b;
                this.f29823c = i11;
                while (true) {
                    int i12 = i10 + 1;
                    if (i10 >= i11) {
                        break;
                    }
                    previous();
                    i10 = i12;
                }
            } else {
                this.f29824d = keyList == null ? null : keyList.f29807a;
                while (true) {
                    int i13 = i10 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    next();
                    i10 = i13;
                }
            }
            this.f29822b = k10;
            this.f29825e = null;
        }
    }

    private LinkedListMultimap(Multimap multimap) {
        this(multimap.keySet().size());
        putAll(multimap);
    }
}
