package com.google.gson.internal;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C4240b4;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Comparator f33561j = new Comparator<Comparable>() { // from class: com.google.gson.internal.LinkedTreeMap.1
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Comparator f33562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Node f33564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f33565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f33566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Node f33567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private EntrySet f33568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private KeySet f33569i;

    class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedTreeMap.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>>() { // from class: com.google.gson.internal.LinkedTreeMap.EntrySet.1
                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }

                @Override // java.util.Iterator
                public Map.Entry<K, V> next() {
                    return a();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Node nodeC;
            if (!(obj instanceof Map.Entry) || (nodeC = LinkedTreeMap.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.h(nodeC, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.f33565e;
        }
    }

    final class KeySet extends AbstractSet<K> {
        KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<K>() { // from class: com.google.gson.internal.LinkedTreeMap.KeySet.1
                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return (K) a().f33583g;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LinkedTreeMap.this.i(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.f33565e;
        }
    }

    private abstract class LinkedTreeMapIterator<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Node f33574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Node f33575c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f33576d;

        LinkedTreeMapIterator() {
            this.f33574b = LinkedTreeMap.this.f33567g.f33581e;
            this.f33576d = LinkedTreeMap.this.f33566f;
        }

        final Node a() {
            Node node = this.f33574b;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (node == linkedTreeMap.f33567g) {
                throw new NoSuchElementException();
            }
            if (linkedTreeMap.f33566f != this.f33576d) {
                throw new ConcurrentModificationException();
            }
            this.f33574b = node.f33581e;
            this.f33575c = node;
            return node;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f33574b != LinkedTreeMap.this.f33567g;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node node = this.f33575c;
            if (node == null) {
                throw new IllegalStateException();
            }
            LinkedTreeMap.this.h(node, true);
            this.f33575c = null;
            this.f33576d = LinkedTreeMap.this.f33566f;
        }
    }

    public LinkedTreeMap() {
        this(f33561j, true);
    }

    private static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void g(Node node, boolean z10) {
        while (node != null) {
            Node node2 = node.f33579c;
            Node node3 = node.f33580d;
            int i10 = node2 != null ? node2.f33586j : 0;
            int i11 = node3 != null ? node3.f33586j : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                Node node4 = node3.f33579c;
                Node node5 = node3.f33580d;
                int i13 = (node4 != null ? node4.f33586j : 0) - (node5 != null ? node5.f33586j : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    k(node);
                } else {
                    l(node3);
                    k(node);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                Node node6 = node2.f33579c;
                Node node7 = node2.f33580d;
                int i14 = (node6 != null ? node6.f33586j : 0) - (node7 != null ? node7.f33586j : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    l(node);
                } else {
                    k(node2);
                    l(node);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                node.f33586j = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                node.f33586j = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            node = node.f33578b;
        }
    }

    private void j(Node node, Node node2) {
        Node node3 = node.f33578b;
        node.f33578b = null;
        if (node2 != null) {
            node2.f33578b = node3;
        }
        if (node3 == null) {
            this.f33564d = node2;
        } else if (node3.f33579c == node) {
            node3.f33579c = node2;
        } else {
            node3.f33580d = node2;
        }
    }

    private void k(Node node) {
        Node node2 = node.f33579c;
        Node node3 = node.f33580d;
        Node node4 = node3.f33579c;
        Node node5 = node3.f33580d;
        node.f33580d = node4;
        if (node4 != null) {
            node4.f33578b = node;
        }
        j(node, node3);
        node3.f33579c = node;
        node.f33578b = node3;
        int iMax = Math.max(node2 != null ? node2.f33586j : 0, node4 != null ? node4.f33586j : 0) + 1;
        node.f33586j = iMax;
        node3.f33586j = Math.max(iMax, node5 != null ? node5.f33586j : 0) + 1;
    }

    private void l(Node node) {
        Node node2 = node.f33579c;
        Node node3 = node.f33580d;
        Node node4 = node2.f33579c;
        Node node5 = node2.f33580d;
        node.f33579c = node5;
        if (node5 != null) {
            node5.f33578b = node;
        }
        j(node, node2);
        node2.f33580d = node;
        node.f33578b = node2;
        int iMax = Math.max(node3 != null ? node3.f33586j : 0, node5 != null ? node5.f33586j : 0) + 1;
        node.f33586j = iMax;
        node2.f33586j = Math.max(iMax, node4 != null ? node4.f33586j : 0) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    Node b(Object obj, boolean z10) {
        int iCompareTo;
        Node node;
        Comparator comparator = this.f33562b;
        Node node2 = this.f33564d;
        if (node2 != null) {
            Comparable comparable = comparator == f33561j ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(node2.f33583g) : comparator.compare(obj, node2.f33583g);
                if (iCompareTo == 0) {
                    return node2;
                }
                Node node3 = iCompareTo < 0 ? node2.f33579c : node2.f33580d;
                if (node3 == null) {
                    break;
                }
                node2 = node3;
            }
        } else {
            iCompareTo = 0;
        }
        Node node4 = node2;
        if (!z10) {
            return null;
        }
        Node node5 = this.f33567g;
        if (node4 != null) {
            node = new Node(this.f33563c, node4, obj, node5, node5.f33582f);
            if (iCompareTo < 0) {
                node4.f33579c = node;
            } else {
                node4.f33580d = node;
            }
            g(node4, true);
        } else {
            if (comparator == f33561j && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            node = new Node(this.f33563c, node4, obj, node5, node5.f33582f);
            this.f33564d = node;
        }
        this.f33565e++;
        this.f33566f++;
        return node;
    }

    Node c(Map.Entry entry) {
        Node nodeD = d(entry.getKey());
        if (nodeD == null || !a(nodeD.f33585i, entry.getValue())) {
            return null;
        }
        return nodeD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f33564d = null;
        this.f33565e = 0;
        this.f33566f++;
        Node node = this.f33567g;
        node.f33582f = node;
        node.f33581e = node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    Node d(Object obj) {
        if (obj != null) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        EntrySet entrySet = this.f33568h;
        if (entrySet != null) {
            return entrySet;
        }
        EntrySet entrySet2 = new EntrySet();
        this.f33568h = entrySet2;
        return entrySet2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Node nodeD = d(obj);
        if (nodeD != null) {
            return (V) nodeD.f33585i;
        }
        return null;
    }

    void h(Node node, boolean z10) {
        int i10;
        if (z10) {
            Node node2 = node.f33582f;
            node2.f33581e = node.f33581e;
            node.f33581e.f33582f = node2;
        }
        Node node3 = node.f33579c;
        Node node4 = node.f33580d;
        Node node5 = node.f33578b;
        int i11 = 0;
        if (node3 == null || node4 == null) {
            if (node3 != null) {
                j(node, node3);
                node.f33579c = null;
            } else if (node4 != null) {
                j(node, node4);
                node.f33580d = null;
            } else {
                j(node, null);
            }
            g(node5, false);
            this.f33565e--;
            this.f33566f++;
            return;
        }
        Node<K, V> nodeLast = node3.f33586j > node4.f33586j ? node3.last() : node4.first();
        h(nodeLast, false);
        Node node6 = node.f33579c;
        if (node6 != null) {
            i10 = node6.f33586j;
            nodeLast.f33579c = node6;
            node6.f33578b = nodeLast;
            node.f33579c = null;
        } else {
            i10 = 0;
        }
        Node node7 = node.f33580d;
        if (node7 != null) {
            i11 = node7.f33586j;
            nodeLast.f33580d = node7;
            node7.f33578b = nodeLast;
            node.f33580d = null;
        }
        nodeLast.f33586j = Math.max(i10, i11) + 1;
        j(node, nodeLast);
    }

    Node i(Object obj) {
        Node nodeD = d(obj);
        if (nodeD != null) {
            h(nodeD, true);
        }
        return nodeD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        KeySet keySet = this.f33569i;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet();
        this.f33569i = keySet2;
        return keySet2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        if (v10 == null && !this.f33563c) {
            throw new NullPointerException("value == null");
        }
        Node nodeB = b(k10, true);
        V v11 = (V) nodeB.f33585i;
        nodeB.f33585i = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Node nodeI = i(obj);
        if (nodeI != null) {
            return (V) nodeI.f33585i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f33565e;
    }

    public LinkedTreeMap(boolean z10) {
        this(f33561j, z10);
    }

    public LinkedTreeMap(Comparator<? super K> comparator, boolean z10) {
        this.f33565e = 0;
        this.f33566f = 0;
        this.f33562b = comparator == null ? f33561j : comparator;
        this.f33563c = z10;
        this.f33567g = new Node(z10);
    }

    static final class Node<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Node f33578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Node f33579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Node f33580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Node f33581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Node f33582f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Object f33583g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final boolean f33584h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f33585i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f33586j;

        Node(boolean z10) {
            this.f33583g = null;
            this.f33584h = z10;
            this.f33582f = this;
            this.f33581e = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.f33583g;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.f33585i;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (obj3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        public Node<K, V> first() {
            Node<K, V> node = this;
            for (Node<K, V> node2 = this.f33579c; node2 != null; node2 = node2.f33579c) {
                node = node2;
            }
            return node;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) this.f33583g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return (V) this.f33585i;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f33583g;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f33585i;
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        public Node<K, V> last() {
            Node<K, V> node = this;
            for (Node<K, V> node2 = this.f33580d; node2 != null; node2 = node2.f33580d) {
                node = node2;
            }
            return node;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (v10 == null && !this.f33584h) {
                throw new NullPointerException("value == null");
            }
            V v11 = (V) this.f33585i;
            this.f33585i = v10;
            return v11;
        }

        public String toString() {
            return this.f33583g + C4240b4.j.f42668b + this.f33585i;
        }

        Node(boolean z10, Node node, Object obj, Node node2, Node node3) {
            this.f33578b = node;
            this.f33583g = obj;
            this.f33584h = z10;
            this.f33586j = 1;
            this.f33581e = node2;
            this.f33582f = node3;
            node3.f33581e = this;
            node2.f33582f = this;
        }
    }
}
