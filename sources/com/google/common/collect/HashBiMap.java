package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient Object[] f29512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient Object[] f29513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient int f29514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    transient int f29515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int[] f29516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient int[] f29517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient int[] f29518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient int[] f29519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient int f29520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private transient int f29521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private transient int[] f29522l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private transient int[] f29523m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient Set f29524n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private transient Set f29525o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private transient Set f29526p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private transient BiMap f29527q;

    final class EntryForKey extends AbstractMapEntry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f29528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29529c;

        EntryForKey(int i10) {
            this.f29528b = NullnessCasts.a(HashBiMap.this.f29512b[i10]);
            this.f29529c = i10;
        }

        void d() {
            int i10 = this.f29529c;
            if (i10 != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i10 <= hashBiMap.f29514d && Objects.equal(hashBiMap.f29512b[i10], this.f29528b)) {
                    return;
                }
            }
            this.f29529c = HashBiMap.this.o(this.f29528b);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return (K) this.f29528b;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            d();
            int i10 = this.f29529c;
            return i10 == -1 ? (V) NullnessCasts.b() : (V) NullnessCasts.a(HashBiMap.this.f29513c[i10]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v10) {
            d();
            int i10 = this.f29529c;
            if (i10 == -1) {
                HashBiMap.this.put(this.f29528b, v10);
                return (V) NullnessCasts.b();
            }
            V v11 = (V) NullnessCasts.a(HashBiMap.this.f29513c[i10]);
            if (Objects.equal(v11, v10)) {
                return v10;
            }
            HashBiMap.this.J(this.f29529c, v10, false);
            return v11;
        }
    }

    static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final HashBiMap f29531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object f29532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f29533d;

        EntryForValue(HashBiMap hashBiMap, int i10) {
            this.f29531b = hashBiMap;
            this.f29532c = NullnessCasts.a(hashBiMap.f29513c[i10]);
            this.f29533d = i10;
        }

        private void d() {
            int i10 = this.f29533d;
            if (i10 != -1) {
                HashBiMap hashBiMap = this.f29531b;
                if (i10 <= hashBiMap.f29514d && Objects.equal(this.f29532c, hashBiMap.f29513c[i10])) {
                    return;
                }
            }
            this.f29533d = this.f29531b.r(this.f29532c);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getKey() {
            return (V) this.f29532c;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getValue() {
            d();
            int i10 = this.f29533d;
            return i10 == -1 ? (K) NullnessCasts.b() : (K) NullnessCasts.a(this.f29531b.f29512b[i10]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K setValue(@ParametricNullness K k10) {
            d();
            int i10 = this.f29533d;
            if (i10 == -1) {
                this.f29531b.C(this.f29532c, k10, false);
                return (K) NullnessCasts.b();
            }
            K k11 = (K) NullnessCasts.a(this.f29531b.f29512b[i10]);
            if (Objects.equal(k11, k10)) {
                return k10;
            }
            this.f29531b.I(this.f29533d, k10, false);
            return k11;
        }
    }

    final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        EntrySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iO = HashBiMap.this.o(key);
                if (iO != -1 && Objects.equal(value, HashBiMap.this.f29513c[iO])) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry e(int i10) {
            return new EntryForKey(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iD = Hashing.d(key);
            int iQ = HashBiMap.this.q(key, iD);
            if (iQ == -1 || !Objects.equal(value, HashBiMap.this.f29513c[iQ])) {
                return false;
            }
            HashBiMap.this.F(iQ, iD);
            return true;
        }
    }

    static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashBiMap f29535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private transient Set f29536c;

        Inverse(HashBiMap hashBiMap) {
            this.f29535b = hashBiMap;
        }

        @GwtIncompatible("serialization")
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f29535b.f29527q = this;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f29535b.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f29535b.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return this.f29535b.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f29536c;
            if (set != null) {
                return set;
            }
            InverseEntrySet inverseEntrySet = new InverseEntrySet(this.f29535b);
            this.f29536c = inverseEntrySet;
            return inverseEntrySet;
        }

        @Override // com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        public K forcePut(@ParametricNullness V v10, @ParametricNullness K k10) {
            return (K) this.f29535b.C(v10, k10, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K get(Object obj) {
            return (K) this.f29535b.t(obj);
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<K, V> inverse() {
            return this.f29535b;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.f29535b.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        public K put(@ParametricNullness V v10, @ParametricNullness K k10) {
            return (K) this.f29535b.C(v10, k10, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CanIgnoreReturnValue
        public K remove(Object obj) {
            return (K) this.f29535b.H(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f29535b.f29514d;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Set<K> values() {
            return this.f29535b.keySet();
        }
    }

    static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        InverseEntrySet(HashBiMap hashBiMap) {
            super(hashBiMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iR = this.f29539b.r(key);
                if (iR != -1 && Objects.equal(this.f29539b.f29512b[iR], value)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry e(int i10) {
            return new EntryForValue(this.f29539b, i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iD = Hashing.d(key);
            int iS = this.f29539b.s(key, iD);
            if (iS == -1 || !Objects.equal(this.f29539b.f29512b[iS], value)) {
                return false;
            }
            this.f29539b.G(iS, iD);
            return true;
        }
    }

    final class KeySet extends View<K, V, K> {
        KeySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.HashBiMap.View
        Object e(int i10) {
            return NullnessCasts.a(HashBiMap.this.f29512b[i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iD = Hashing.d(obj);
            int iQ = HashBiMap.this.q(obj, iD);
            if (iQ == -1) {
                return false;
            }
            HashBiMap.this.F(iQ, iD);
            return true;
        }
    }

    final class ValueSet extends View<K, V, V> {
        ValueSet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // com.google.common.collect.HashBiMap.View
        Object e(int i10) {
            return NullnessCasts.a(HashBiMap.this.f29513c[i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iD = Hashing.d(obj);
            int iS = HashBiMap.this.s(obj, iD);
            if (iS == -1) {
                return false;
            }
            HashBiMap.this.G(iS, iD);
            return true;
        }
    }

    static abstract class View<K, V, T> extends AbstractSet<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final HashBiMap f29539b;

        View(HashBiMap hashBiMap) {
            this.f29539b = hashBiMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f29539b.clear();
        }

        abstract Object e(int i10);

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new Iterator<T>() { // from class: com.google.common.collect.HashBiMap.View.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f29540b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f29541c = -1;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private int f29542d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private int f29543e;

                {
                    this.f29540b = View.this.f29539b.f29520j;
                    HashBiMap hashBiMap = View.this.f29539b;
                    this.f29542d = hashBiMap.f29515e;
                    this.f29543e = hashBiMap.f29514d;
                }

                private void a() {
                    if (View.this.f29539b.f29515e != this.f29542d) {
                        throw new ConcurrentModificationException();
                    }
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    a();
                    return this.f29540b != -2 && this.f29543e > 0;
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public T next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    T t10 = (T) View.this.e(this.f29540b);
                    this.f29541c = this.f29540b;
                    this.f29540b = View.this.f29539b.f29523m[this.f29540b];
                    this.f29543e--;
                    return t10;
                }

                @Override // java.util.Iterator
                public void remove() {
                    a();
                    CollectPreconditions.e(this.f29541c != -1);
                    View.this.f29539b.D(this.f29541c);
                    int i10 = this.f29540b;
                    HashBiMap hashBiMap = View.this.f29539b;
                    if (i10 == hashBiMap.f29514d) {
                        this.f29540b = this.f29541c;
                    }
                    this.f29541c = -1;
                    this.f29542d = hashBiMap.f29515e;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f29539b.f29514d;
        }
    }

    private HashBiMap(int i10) {
        u(i10);
    }

    private void A(int i10, int i11) {
        int i12;
        int i13;
        if (i10 == i11) {
            return;
        }
        int i14 = this.f29522l[i10];
        int i15 = this.f29523m[i10];
        K(i14, i11);
        K(i11, i15);
        Object[] objArr = this.f29512b;
        Object obj = objArr[i10];
        Object[] objArr2 = this.f29513c;
        Object obj2 = objArr2[i10];
        objArr[i11] = obj;
        objArr2[i11] = obj2;
        int iH = h(Hashing.d(obj));
        int[] iArr = this.f29516f;
        int i16 = iArr[iH];
        if (i16 == i10) {
            iArr[iH] = i11;
        } else {
            int i17 = this.f29518h[i16];
            while (true) {
                i12 = i16;
                i16 = i17;
                if (i16 == i10) {
                    break;
                } else {
                    i17 = this.f29518h[i16];
                }
            }
            this.f29518h[i12] = i11;
        }
        int[] iArr2 = this.f29518h;
        iArr2[i11] = iArr2[i10];
        iArr2[i10] = -1;
        int iH2 = h(Hashing.d(obj2));
        int[] iArr3 = this.f29517g;
        int i18 = iArr3[iH2];
        if (i18 == i10) {
            iArr3[iH2] = i11;
        } else {
            int i19 = this.f29519i[i18];
            while (true) {
                i13 = i18;
                i18 = i19;
                if (i18 == i10) {
                    break;
                } else {
                    i19 = this.f29519i[i18];
                }
            }
            this.f29519i[i13] = i11;
        }
        int[] iArr4 = this.f29519i;
        iArr4[i11] = iArr4[i10];
        iArr4[i10] = -1;
    }

    private void E(int i10, int i11, int i12) {
        Preconditions.checkArgument(i10 != -1);
        j(i10, i11);
        k(i10, i12);
        K(this.f29522l[i10], this.f29523m[i10]);
        A(this.f29514d - 1, i10);
        Object[] objArr = this.f29512b;
        int i13 = this.f29514d;
        objArr[i13 - 1] = null;
        this.f29513c[i13 - 1] = null;
        this.f29514d = i13 - 1;
        this.f29515e++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(int i10, Object obj, boolean z10) {
        int i11;
        Preconditions.checkArgument(i10 != -1);
        int iD = Hashing.d(obj);
        int iQ = q(obj, iD);
        int i12 = this.f29521k;
        if (iQ == -1) {
            i11 = -2;
        } else {
            if (!z10) {
                throw new IllegalArgumentException("Key already present in map: " + obj);
            }
            i12 = this.f29522l[iQ];
            i11 = this.f29523m[iQ];
            F(iQ, iD);
            if (i10 == this.f29514d) {
                i10 = iQ;
            }
        }
        if (i12 == i10) {
            i12 = this.f29522l[i10];
        } else if (i12 == this.f29514d) {
            i12 = iQ;
        }
        if (i11 == i10) {
            iQ = this.f29523m[i10];
        } else if (i11 != this.f29514d) {
            iQ = i11;
        }
        K(this.f29522l[i10], this.f29523m[i10]);
        j(i10, Hashing.d(this.f29512b[i10]));
        this.f29512b[i10] = obj;
        v(i10, Hashing.d(obj));
        K(i12, i10);
        K(i10, iQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(int i10, Object obj, boolean z10) {
        Preconditions.checkArgument(i10 != -1);
        int iD = Hashing.d(obj);
        int iS = s(obj, iD);
        if (iS != -1) {
            if (!z10) {
                throw new IllegalArgumentException("Value already present in map: " + obj);
            }
            G(iS, iD);
            if (i10 == this.f29514d) {
                i10 = iS;
            }
        }
        k(i10, Hashing.d(this.f29513c[i10]));
        this.f29513c[i10] = obj;
        x(i10, iD);
    }

    private void K(int i10, int i11) {
        if (i10 == -2) {
            this.f29520j = i11;
        } else {
            this.f29523m[i10] = i11;
        }
        if (i11 == -2) {
            this.f29521k = i10;
        } else {
            this.f29522l[i11] = i10;
        }
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    private int h(int i10) {
        return i10 & (this.f29516f.length - 1);
    }

    private static int[] i(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void j(int i10, int i11) {
        Preconditions.checkArgument(i10 != -1);
        int iH = h(i11);
        int[] iArr = this.f29516f;
        int i12 = iArr[iH];
        if (i12 == i10) {
            int[] iArr2 = this.f29518h;
            iArr[iH] = iArr2[i10];
            iArr2[i10] = -1;
            return;
        }
        int i13 = this.f29518h[i12];
        while (true) {
            int i14 = i12;
            i12 = i13;
            if (i12 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.f29512b[i10]);
            }
            if (i12 == i10) {
                int[] iArr3 = this.f29518h;
                iArr3[i14] = iArr3[i10];
                iArr3[i10] = -1;
                return;
            }
            i13 = this.f29518h[i12];
        }
    }

    private void k(int i10, int i11) {
        Preconditions.checkArgument(i10 != -1);
        int iH = h(i11);
        int[] iArr = this.f29517g;
        int i12 = iArr[iH];
        if (i12 == i10) {
            int[] iArr2 = this.f29519i;
            iArr[iH] = iArr2[i10];
            iArr2[i10] = -1;
            return;
        }
        int i13 = this.f29519i[i12];
        while (true) {
            int i14 = i12;
            i12 = i13;
            if (i12 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.f29513c[i10]);
            }
            if (i12 == i10) {
                int[] iArr3 = this.f29519i;
                iArr3[i14] = iArr3[i10];
                iArr3[i10] = -1;
                return;
            }
            i13 = this.f29519i[i12];
        }
    }

    private void l(int i10) {
        int[] iArr = this.f29518h;
        if (iArr.length < i10) {
            int iA = ImmutableCollection.Builder.a(iArr.length, i10);
            this.f29512b = Arrays.copyOf(this.f29512b, iA);
            this.f29513c = Arrays.copyOf(this.f29513c, iA);
            this.f29518h = m(this.f29518h, iA);
            this.f29519i = m(this.f29519i, iA);
            this.f29522l = m(this.f29522l, iA);
            this.f29523m = m(this.f29523m, iA);
        }
        if (this.f29516f.length < i10) {
            int iA2 = Hashing.a(i10, 1.0d);
            this.f29516f = i(iA2);
            this.f29517g = i(iA2);
            for (int i11 = 0; i11 < this.f29514d; i11++) {
                int iH = h(Hashing.d(this.f29512b[i11]));
                int[] iArr2 = this.f29518h;
                int[] iArr3 = this.f29516f;
                iArr2[i11] = iArr3[iH];
                iArr3[iH] = i11;
                int iH2 = h(Hashing.d(this.f29513c[i11]));
                int[] iArr4 = this.f29519i;
                int[] iArr5 = this.f29517g;
                iArr4[i11] = iArr5[iH2];
                iArr5[iH2] = i11;
            }
        }
    }

    private static int[] m(int[] iArr, int i10) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
        Arrays.fill(iArrCopyOf, length, i10, -1);
        return iArrCopyOf;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iH = Serialization.h(objectInputStream);
        u(16);
        Serialization.c(this, objectInputStream, iH);
    }

    private void v(int i10, int i11) {
        Preconditions.checkArgument(i10 != -1);
        int iH = h(i11);
        int[] iArr = this.f29518h;
        int[] iArr2 = this.f29516f;
        iArr[i10] = iArr2[iH];
        iArr2[iH] = i10;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.i(this, objectOutputStream);
    }

    private void x(int i10, int i11) {
        Preconditions.checkArgument(i10 != -1);
        int iH = h(i11);
        int[] iArr = this.f29519i;
        int[] iArr2 = this.f29517g;
        iArr[i10] = iArr2[iH];
        iArr2[iH] = i10;
    }

    Object B(Object obj, Object obj2, boolean z10) {
        int iD = Hashing.d(obj);
        int iQ = q(obj, iD);
        if (iQ != -1) {
            Object obj3 = this.f29513c[iQ];
            if (Objects.equal(obj3, obj2)) {
                return obj2;
            }
            J(iQ, obj2, z10);
            return obj3;
        }
        int iD2 = Hashing.d(obj2);
        int iS = s(obj2, iD2);
        if (!z10) {
            Preconditions.checkArgument(iS == -1, "Value already present: %s", obj2);
        } else if (iS != -1) {
            G(iS, iD2);
        }
        l(this.f29514d + 1);
        Object[] objArr = this.f29512b;
        int i10 = this.f29514d;
        objArr[i10] = obj;
        this.f29513c[i10] = obj2;
        v(i10, iD);
        x(this.f29514d, iD2);
        K(this.f29521k, this.f29514d);
        K(this.f29514d, -2);
        this.f29514d++;
        this.f29515e++;
        return null;
    }

    Object C(Object obj, Object obj2, boolean z10) {
        int iD = Hashing.d(obj);
        int iS = s(obj, iD);
        if (iS != -1) {
            Object obj3 = this.f29512b[iS];
            if (Objects.equal(obj3, obj2)) {
                return obj2;
            }
            I(iS, obj2, z10);
            return obj3;
        }
        int i10 = this.f29521k;
        int iD2 = Hashing.d(obj2);
        int iQ = q(obj2, iD2);
        if (!z10) {
            Preconditions.checkArgument(iQ == -1, "Key already present: %s", obj2);
        } else if (iQ != -1) {
            i10 = this.f29522l[iQ];
            F(iQ, iD2);
        }
        l(this.f29514d + 1);
        Object[] objArr = this.f29512b;
        int i11 = this.f29514d;
        objArr[i11] = obj2;
        this.f29513c[i11] = obj;
        v(i11, iD2);
        x(this.f29514d, iD);
        int i12 = i10 == -2 ? this.f29520j : this.f29523m[i10];
        K(i10, this.f29514d);
        K(this.f29514d, i12);
        this.f29514d++;
        this.f29515e++;
        return null;
    }

    void D(int i10) {
        F(i10, Hashing.d(this.f29512b[i10]));
    }

    void F(int i10, int i11) {
        E(i10, i11, Hashing.d(this.f29513c[i10]));
    }

    void G(int i10, int i11) {
        E(i10, Hashing.d(this.f29512b[i10]), i11);
    }

    Object H(Object obj) {
        int iD = Hashing.d(obj);
        int iS = s(obj, iD);
        if (iS == -1) {
            return null;
        }
        Object obj2 = this.f29512b[iS];
        G(iS, iD);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f29512b, 0, this.f29514d, (Object) null);
        Arrays.fill(this.f29513c, 0, this.f29514d, (Object) null);
        Arrays.fill(this.f29516f, -1);
        Arrays.fill(this.f29517g, -1);
        Arrays.fill(this.f29518h, 0, this.f29514d, -1);
        Arrays.fill(this.f29519i, 0, this.f29514d, -1);
        Arrays.fill(this.f29522l, 0, this.f29514d, -1);
        Arrays.fill(this.f29523m, 0, this.f29514d, -1);
        this.f29514d = 0;
        this.f29520j = -2;
        this.f29521k = -2;
        this.f29515e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return o(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        return r(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f29526p;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.f29526p = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V forcePut(@ParametricNullness K k10, @ParametricNullness V v10) {
        return (V) B(k10, v10, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int iO = o(obj);
        if (iO == -1) {
            return null;
        }
        return (V) this.f29513c[iO];
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
        BiMap<V, K> biMap = this.f29527q;
        if (biMap != null) {
            return biMap;
        }
        Inverse inverse = new Inverse(this);
        this.f29527q = inverse;
        return inverse;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f29524n;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.f29524n = keySet;
        return keySet;
    }

    int n(Object obj, int i10, int[] iArr, int[] iArr2, Object[] objArr) {
        int i11 = iArr[h(i10)];
        while (i11 != -1) {
            if (Objects.equal(objArr[i11], obj)) {
                return i11;
            }
            i11 = iArr2[i11];
        }
        return -1;
    }

    int o(Object obj) {
        return q(obj, Hashing.d(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k10, @ParametricNullness V v10) {
        return (V) B(k10, v10, false);
    }

    int q(Object obj, int i10) {
        return n(obj, i10, this.f29516f, this.f29518h, this.f29512b);
    }

    int r(Object obj) {
        return s(obj, Hashing.d(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(Object obj) {
        int iD = Hashing.d(obj);
        int iQ = q(obj, iD);
        if (iQ == -1) {
            return null;
        }
        V v10 = (V) this.f29513c[iQ];
        F(iQ, iD);
        return v10;
    }

    int s(Object obj, int i10) {
        return n(obj, i10, this.f29517g, this.f29519i, this.f29513c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f29514d;
    }

    Object t(Object obj) {
        int iR = r(obj);
        if (iR == -1) {
            return null;
        }
        return this.f29512b[iR];
    }

    void u(int i10) {
        CollectPreconditions.b(i10, "expectedSize");
        int iA = Hashing.a(i10, 1.0d);
        this.f29514d = 0;
        this.f29512b = new Object[i10];
        this.f29513c = new Object[i10];
        this.f29516f = i(iA);
        this.f29517g = i(iA);
        this.f29518h = i(i10);
        this.f29519i = i(i10);
        this.f29520j = -2;
        this.f29521k = -2;
        this.f29522l = i(i10);
        this.f29523m = i(i10);
    }

    public static <K, V> HashBiMap<K, V> create(int i10) {
        return new HashBiMap<>(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public Set<V> values() {
        Set<V> set = this.f29525o;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.f29525o = valueSet;
        return valueSet;
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> hashBiMapCreate = create(map.size());
        hashBiMapCreate.putAll(map);
        return hashBiMapCreate;
    }
}
