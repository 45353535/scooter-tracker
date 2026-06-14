package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f29352k = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Object f29353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient int[] f29354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient Object[] f29355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    transient Object[] f29356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f29357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient int f29358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Set f29359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient Set f29360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient Collection f29361j;

    class EntrySetView extends AbstractSet<Map.Entry<K, V>> {
        EntrySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map mapB = CompactHashMap.this.B();
            if (mapB != null) {
                return mapB.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int I = CompactHashMap.this.I(entry.getKey());
                if (I != -1 && Objects.equal(CompactHashMap.this.c0(I), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return CompactHashMap.this.D();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iG;
            int iF;
            Map mapB = CompactHashMap.this.B();
            if (mapB != null) {
                return mapB.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (CompactHashMap.this.O() || (iF = CompactHashing.f(entry.getKey(), entry.getValue(), (iG = CompactHashMap.this.G()), CompactHashMap.this.T(), CompactHashMap.this.Q(), CompactHashMap.this.S(), CompactHashMap.this.U())) == -1) {
                return false;
            }
            CompactHashMap.this.N(iF, iG);
            CompactHashMap.g(CompactHashMap.this);
            CompactHashMap.this.H();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    private abstract class Itr<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f29368d;

        private Itr() {
            this.f29366b = CompactHashMap.this.f29357f;
            this.f29367c = CompactHashMap.this.E();
            this.f29368d = -1;
        }

        private void a() {
            if (CompactHashMap.this.f29357f != this.f29366b) {
                throw new ConcurrentModificationException();
            }
        }

        abstract Object b(int i10);

        void c() {
            this.f29366b += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29367c >= 0;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f29367c;
            this.f29368d = i10;
            T t10 = (T) b(i10);
            this.f29367c = CompactHashMap.this.F(this.f29367c);
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            CollectPreconditions.e(this.f29368d >= 0);
            c();
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(compactHashMap.L(this.f29368d));
            this.f29367c = CompactHashMap.this.r(this.f29367c, this.f29368d);
            this.f29368d = -1;
        }
    }

    class KeySetView extends AbstractSet<K> {
        KeySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return CompactHashMap.this.M();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapB = CompactHashMap.this.B();
            return mapB != null ? mapB.keySet().remove(obj) : CompactHashMap.this.P(obj) != CompactHashMap.f29352k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    final class MapEntry extends AbstractMapEntry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f29371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f29372c;

        MapEntry(int i10) {
            this.f29371b = CompactHashMap.this.L(i10);
            this.f29372c = i10;
        }

        private void d() {
            int i10 = this.f29372c;
            if (i10 == -1 || i10 >= CompactHashMap.this.size() || !Objects.equal(this.f29371b, CompactHashMap.this.L(this.f29372c))) {
                this.f29372c = CompactHashMap.this.I(this.f29371b);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return (K) this.f29371b;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            Map mapB = CompactHashMap.this.B();
            if (mapB != null) {
                return (V) NullnessCasts.a(mapB.get(this.f29371b));
            }
            d();
            int i10 = this.f29372c;
            return i10 == -1 ? (V) NullnessCasts.b() : (V) CompactHashMap.this.c0(i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v10) {
            Map mapB = CompactHashMap.this.B();
            if (mapB != 0) {
                return (V) NullnessCasts.a(mapB.put(this.f29371b, v10));
            }
            d();
            int i10 = this.f29372c;
            if (i10 == -1) {
                CompactHashMap.this.put(this.f29371b, v10);
                return (V) NullnessCasts.b();
            }
            V v11 = (V) CompactHashMap.this.c0(i10);
            CompactHashMap.this.b0(this.f29372c, v10);
            return v11;
        }
    }

    class ValuesView extends AbstractCollection<V> {
        ValuesView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return CompactHashMap.this.d0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    CompactHashMap() {
        J(3);
    }

    private int C(int i10) {
        return Q()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int G() {
        return (1 << (this.f29357f & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int I(Object obj) {
        if (O()) {
            return -1;
        }
        int iD = Hashing.d(obj);
        int iG = G();
        int iH = CompactHashing.h(T(), iD & iG);
        if (iH == 0) {
            return -1;
        }
        int iB = CompactHashing.b(iD, iG);
        do {
            int i10 = iH - 1;
            int iC = C(i10);
            if (CompactHashing.b(iC, iG) == iB && Objects.equal(obj, L(i10))) {
                return i10;
            }
            iH = CompactHashing.c(iC, iG);
        } while (iH != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object L(int i10) {
        return S()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object P(Object obj) {
        if (O()) {
            return f29352k;
        }
        int iG = G();
        int iF = CompactHashing.f(obj, null, iG, T(), Q(), S(), null);
        if (iF == -1) {
            return f29352k;
        }
        Object objC0 = c0(iF);
        N(iF, iG);
        this.f29358g--;
        H();
        return objC0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] Q() {
        int[] iArr = this.f29354c;
        j$.util.Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] S() {
        Object[] objArr = this.f29355d;
        j$.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object T() {
        Object obj = this.f29353b;
        j$.util.Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] U() {
        Object[] objArr = this.f29356e;
        j$.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    private void W(int i10) {
        int iMin;
        int length = Q().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        V(iMin);
    }

    private int X(int i10, int i11, int i12, int i13) {
        Object objA = CompactHashing.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            CompactHashing.i(objA, i12 & i14, i13 + 1);
        }
        Object objT = T();
        int[] iArrQ = Q();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = CompactHashing.h(objT, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrQ[i16];
                int iB = CompactHashing.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = CompactHashing.h(objA, i18);
                CompactHashing.i(objA, i18, iH);
                iArrQ[i16] = CompactHashing.d(iB, iH2, i14);
                iH = CompactHashing.c(i17, i10);
            }
        }
        this.f29353b = objA;
        Z(i14);
        return i14;
    }

    private void Y(int i10, int i11) {
        Q()[i10] = i11;
    }

    private void Z(int i10) {
        this.f29357f = CompactHashing.d(this.f29357f, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    private void a0(int i10, Object obj) {
        S()[i10] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(int i10, Object obj) {
        U()[i10] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object c0(int i10) {
        return U()[i10];
    }

    public static <K, V> CompactHashMap<K, V> create() {
        return new CompactHashMap<>();
    }

    public static <K, V> CompactHashMap<K, V> createWithExpectedSize(int i10) {
        return new CompactHashMap<>(i10);
    }

    static /* synthetic */ int g(CompactHashMap compactHashMap) {
        int i10 = compactHashMap.f29358g;
        compactHashMap.f29358g = i10 - 1;
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Invalid size: " + i10);
        }
        J(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    @J2ktIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator itD = D();
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    Collection A() {
        return new ValuesView();
    }

    Map B() {
        Object obj = this.f29353b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    Iterator D() {
        Map mapB = B();
        return mapB != null ? mapB.entrySet().iterator() : new CompactHashMap<K, V>.Itr<Map.Entry<K, V>>() { // from class: com.google.common.collect.CompactHashMap.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.CompactHashMap.Itr
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry b(int i10) {
                return new MapEntry(i10);
            }
        };
    }

    int E() {
        return isEmpty() ? -1 : 0;
    }

    int F(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f29358g) {
            return i11;
        }
        return -1;
    }

    void H() {
        this.f29357f += 32;
    }

    void J(int i10) {
        Preconditions.checkArgument(i10 >= 0, "Expected size must be >= 0");
        this.f29357f = Ints.constrainToRange(i10, 1, 1073741823);
    }

    void K(int i10, Object obj, Object obj2, int i11, int i12) {
        Y(i10, CompactHashing.d(i11, 0, i12));
        a0(i10, obj);
        b0(i10, obj2);
    }

    Iterator M() {
        Map mapB = B();
        return mapB != null ? mapB.keySet().iterator() : new CompactHashMap<K, V>.Itr<K>() { // from class: com.google.common.collect.CompactHashMap.1
            @Override // com.google.common.collect.CompactHashMap.Itr
            Object b(int i10) {
                return CompactHashMap.this.L(i10);
            }
        };
    }

    void N(int i10, int i11) {
        Object objT = T();
        int[] iArrQ = Q();
        Object[] objArrS = S();
        Object[] objArrU = U();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrS[i10] = null;
            objArrU[i10] = null;
            iArrQ[i10] = 0;
            return;
        }
        Object obj = objArrS[i12];
        objArrS[i10] = obj;
        objArrU[i10] = objArrU[i12];
        objArrS[i12] = null;
        objArrU[i12] = null;
        iArrQ[i10] = iArrQ[i12];
        iArrQ[i12] = 0;
        int iD = Hashing.d(obj) & i11;
        int iH = CompactHashing.h(objT, iD);
        if (iH == size) {
            CompactHashing.i(objT, iD, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iH - 1;
            int i14 = iArrQ[i13];
            int iC = CompactHashing.c(i14, i11);
            if (iC == size) {
                iArrQ[i13] = CompactHashing.d(i14, i10 + 1, i11);
                return;
            }
            iH = iC;
        }
    }

    boolean O() {
        return this.f29353b == null;
    }

    void V(int i10) {
        this.f29354c = Arrays.copyOf(Q(), i10);
        this.f29355d = Arrays.copyOf(S(), i10);
        this.f29356e = Arrays.copyOf(U(), i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (O()) {
            return;
        }
        H();
        Map mapB = B();
        if (mapB != null) {
            this.f29357f = Ints.constrainToRange(size(), 3, 1073741823);
            mapB.clear();
            this.f29353b = null;
            this.f29358g = 0;
            return;
        }
        Arrays.fill(S(), 0, this.f29358g, (Object) null);
        Arrays.fill(U(), 0, this.f29358g, (Object) null);
        CompactHashing.g(T());
        Arrays.fill(Q(), 0, this.f29358g, 0);
        this.f29358g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map mapB = B();
        return mapB != null ? mapB.containsKey(obj) : I(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map mapB = B();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f29358g; i10++) {
            if (Objects.equal(obj, c0(i10))) {
                return true;
            }
        }
        return false;
    }

    Iterator d0() {
        Map mapB = B();
        return mapB != null ? mapB.values().iterator() : new CompactHashMap<K, V>.Itr<V>() { // from class: com.google.common.collect.CompactHashMap.3
            @Override // com.google.common.collect.CompactHashMap.Itr
            Object b(int i10) {
                return CompactHashMap.this.c0(i10);
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f29360i;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setU = u();
        this.f29360i = setU;
        return setU;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map mapB = B();
        if (mapB != null) {
            return (V) mapB.get(obj);
        }
        int I = I(obj);
        if (I == -1) {
            return null;
        }
        q(I);
        return (V) c0(I);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f29359h;
        if (set != null) {
            return set;
        }
        Set<K> setX = x();
        this.f29359h = setX;
        return setX;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k10, @ParametricNullness V v10) {
        if (O()) {
            s();
        }
        Map mapB = B();
        if (mapB != null) {
            return (V) mapB.put(k10, v10);
        }
        int[] iArrQ = Q();
        Object[] objArrS = S();
        Object[] objArrU = U();
        int i10 = this.f29358g;
        int i11 = i10 + 1;
        int iD = Hashing.d(k10);
        int iG = G();
        int i12 = iD & iG;
        int iH = CompactHashing.h(T(), i12);
        if (iH != 0) {
            int iB = CompactHashing.b(iD, iG);
            int i13 = 0;
            while (true) {
                int i14 = iH - 1;
                int i15 = iArrQ[i14];
                if (CompactHashing.b(i15, iG) == iB && Objects.equal(k10, objArrS[i14])) {
                    V v11 = (V) objArrU[i14];
                    objArrU[i14] = v10;
                    q(i14);
                    return v11;
                }
                int iC = CompactHashing.c(i15, iG);
                i13++;
                if (iC != 0) {
                    k10 = k10;
                    v10 = v10;
                    iH = iC;
                } else {
                    if (i13 >= 9) {
                        return (V) t().put(k10, v10);
                    }
                    if (i11 > iG) {
                        iG = X(iG, CompactHashing.e(iG), iD, i10);
                    } else {
                        iArrQ[i14] = CompactHashing.d(i15, i11, iG);
                    }
                }
            }
        } else if (i11 > iG) {
            iG = X(iG, CompactHashing.e(iG), iD, i10);
        } else {
            CompactHashing.i(T(), i12, i11);
        }
        int i16 = iG;
        W(i11);
        K(i10, k10, v10, iD, i16);
        this.f29358g = i11;
        H();
        return null;
    }

    void q(int i10) {
    }

    int r(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(Object obj) {
        Map mapB = B();
        if (mapB != null) {
            return (V) mapB.remove(obj);
        }
        V v10 = (V) P(obj);
        if (v10 == f29352k) {
            return null;
        }
        return v10;
    }

    int s() {
        Preconditions.checkState(O(), "Arrays already allocated");
        int i10 = this.f29357f;
        int iJ = CompactHashing.j(i10);
        this.f29353b = CompactHashing.a(iJ);
        Z(iJ - 1);
        this.f29354c = new int[i10];
        this.f29355d = new Object[i10];
        this.f29356e = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map mapB = B();
        return mapB != null ? mapB.size() : this.f29358g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    Map t() {
        Map mapV = v(G() + 1);
        int iE = E();
        while (iE >= 0) {
            mapV.put(L(iE), c0(iE));
            iE = F(iE);
        }
        this.f29353b = mapV;
        this.f29354c = null;
        this.f29355d = null;
        this.f29356e = null;
        H();
        return mapV;
    }

    public void trimToSize() {
        if (O()) {
            return;
        }
        Map<? extends K, ? extends V> mapB = B();
        if (mapB != null) {
            Map mapV = v(size());
            mapV.putAll(mapB);
            this.f29353b = mapV;
            return;
        }
        int i10 = this.f29358g;
        if (i10 < Q().length) {
            V(i10);
        }
        int iJ = CompactHashing.j(i10);
        int iG = G();
        if (iJ < iG) {
            X(iG, iJ, 0, 0);
        }
    }

    Set u() {
        return new EntrySetView();
    }

    Map v(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f29361j;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionA = A();
        this.f29361j = collectionA;
        return collectionA;
    }

    Set x() {
        return new KeySetView();
    }

    CompactHashMap(int i10) {
        J(i10);
    }
}
