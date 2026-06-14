package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Object f29375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int[] f29376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient Object[] f29377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f29378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f29379f;

    CompactHashSet() {
        t(3);
    }

    private Object[] A() {
        Object[] objArr = this.f29377d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private int[] B() {
        int[] iArr = this.f29376c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private Object C() {
        Object obj = this.f29375b;
        Objects.requireNonNull(obj);
        return obj;
    }

    private void E(int i10) {
        int iMin;
        int length = B().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        D(iMin);
    }

    private int F(int i10, int i11, int i12, int i13) {
        Object objA = CompactHashing.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            CompactHashing.i(objA, i12 & i14, i13 + 1);
        }
        Object objC = C();
        int[] iArrB = B();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = CompactHashing.h(objC, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrB[i16];
                int iB = CompactHashing.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = CompactHashing.h(objA, i18);
                CompactHashing.i(objA, i18, iH);
                iArrB[i16] = CompactHashing.d(iB, iH2, i14);
                iH = CompactHashing.c(i17, i10);
            }
        }
        this.f29375b = objA;
        I(i14);
        return i14;
    }

    private void G(int i10, Object obj) {
        A()[i10] = obj;
    }

    private void H(int i10, int i11) {
        B()[i10] = i11;
    }

    private void I(int i10) {
        this.f29378e = CompactHashing.d(this.f29378e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    public static <E> CompactHashSet<E> create() {
        return new CompactHashSet<>();
    }

    public static <E> CompactHashSet<E> createWithExpectedSize(int i10) {
        return new CompactHashSet<>(i10);
    }

    private Set k(int i10) {
        return new LinkedHashSet(i10, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object m(int i10) {
        return A()[i10];
    }

    private int n(int i10) {
        return B()[i10];
    }

    private int r() {
        return (1 << (this.f29378e & 31)) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Invalid size: " + i10);
        }
        t(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            add(objectInputStream.readObject());
        }
    }

    @J2ktIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    void D(int i10) {
        this.f29376c = Arrays.copyOf(B(), i10);
        this.f29377d = Arrays.copyOf(A(), i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean add(@ParametricNullness E e10) {
        if (x()) {
            i();
        }
        Set setL = l();
        if (setL != null) {
            return setL.add(e10);
        }
        int[] iArrB = B();
        Object[] objArrA = A();
        int i10 = this.f29379f;
        int i11 = i10 + 1;
        int iD = Hashing.d(e10);
        int iR = r();
        int i12 = iD & iR;
        int iH = CompactHashing.h(C(), i12);
        if (iH != 0) {
            int iB = CompactHashing.b(iD, iR);
            int i13 = 0;
            while (true) {
                int i14 = iH - 1;
                int i15 = iArrB[i14];
                if (CompactHashing.b(i15, iR) == iB && com.google.common.base.Objects.equal(e10, objArrA[i14])) {
                    return false;
                }
                int iC = CompactHashing.c(i15, iR);
                i13++;
                if (iC != 0) {
                    iH = iC;
                } else {
                    if (i13 >= 9) {
                        return j().add(e10);
                    }
                    if (i11 > iR) {
                        iR = F(iR, CompactHashing.e(iR), iD, i10);
                    } else {
                        iArrB[i14] = CompactHashing.d(i15, i11, iR);
                    }
                }
            }
        } else if (i11 > iR) {
            iR = F(iR, CompactHashing.e(iR), iD, i10);
        } else {
            CompactHashing.i(C(), i12, i11);
        }
        E(i11);
        u(i10, e10, iD, iR);
        this.f29379f = i11;
        s();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (x()) {
            return;
        }
        s();
        Set setL = l();
        if (setL != null) {
            this.f29378e = Ints.constrainToRange(size(), 3, 1073741823);
            setL.clear();
            this.f29375b = null;
            this.f29379f = 0;
            return;
        }
        Arrays.fill(A(), 0, this.f29379f, (Object) null);
        CompactHashing.g(C());
        Arrays.fill(B(), 0, this.f29379f, 0);
        this.f29379f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (x()) {
            return false;
        }
        Set setL = l();
        if (setL != null) {
            return setL.contains(obj);
        }
        int iD = Hashing.d(obj);
        int iR = r();
        int iH = CompactHashing.h(C(), iD & iR);
        if (iH == 0) {
            return false;
        }
        int iB = CompactHashing.b(iD, iR);
        do {
            int i10 = iH - 1;
            int iN = n(i10);
            if (CompactHashing.b(iN, iR) == iB && com.google.common.base.Objects.equal(obj, m(i10))) {
                return true;
            }
            iH = CompactHashing.c(iN, iR);
        } while (iH != 0);
        return false;
    }

    int g(int i10, int i11) {
        return i10 - 1;
    }

    int i() {
        Preconditions.checkState(x(), "Arrays already allocated");
        int i10 = this.f29378e;
        int iJ = CompactHashing.j(i10);
        this.f29375b = CompactHashing.a(iJ);
        I(iJ - 1);
        this.f29376c = new int[i10];
        this.f29377d = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set setL = l();
        return setL != null ? setL.iterator() : new Iterator<E>() { // from class: com.google.common.collect.CompactHashSet.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f29380b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f29381c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f29382d = -1;

            {
                this.f29380b = CompactHashSet.this.f29378e;
                this.f29381c = CompactHashSet.this.o();
            }

            private void a() {
                if (CompactHashSet.this.f29378e != this.f29380b) {
                    throw new ConcurrentModificationException();
                }
            }

            void b() {
                this.f29380b += 32;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f29381c >= 0;
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public E next() {
                a();
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f29381c;
                this.f29382d = i10;
                E e10 = (E) CompactHashSet.this.m(i10);
                this.f29381c = CompactHashSet.this.q(this.f29381c);
                return e10;
            }

            @Override // java.util.Iterator
            public void remove() {
                a();
                CollectPreconditions.e(this.f29382d >= 0);
                b();
                CompactHashSet compactHashSet = CompactHashSet.this;
                compactHashSet.remove(compactHashSet.m(this.f29382d));
                this.f29381c = CompactHashSet.this.g(this.f29381c, this.f29382d);
                this.f29382d = -1;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    Set j() {
        Set setK = k(r() + 1);
        int iO = o();
        while (iO >= 0) {
            setK.add(m(iO));
            iO = q(iO);
        }
        this.f29375b = setK;
        this.f29376c = null;
        this.f29377d = null;
        s();
        return setK;
    }

    Set l() {
        Object obj = this.f29375b;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    int o() {
        return isEmpty() ? -1 : 0;
    }

    int q(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f29379f) {
            return i11;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
        if (x()) {
            return false;
        }
        Set setL = l();
        if (setL != null) {
            return setL.remove(obj);
        }
        int iR = r();
        int iF = CompactHashing.f(obj, null, iR, C(), B(), A(), null);
        if (iF == -1) {
            return false;
        }
        v(iF, iR);
        this.f29379f--;
        s();
        return true;
    }

    void s() {
        this.f29378e += 32;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set setL = l();
        return setL != null ? setL.size() : this.f29379f;
    }

    void t(int i10) {
        Preconditions.checkArgument(i10 >= 0, "Expected size must be >= 0");
        this.f29378e = Ints.constrainToRange(i10, 1, 1073741823);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (x()) {
            return new Object[0];
        }
        Set setL = l();
        return setL != null ? setL.toArray() : Arrays.copyOf(A(), this.f29379f);
    }

    public void trimToSize() {
        if (x()) {
            return;
        }
        Set setL = l();
        if (setL != null) {
            Set setK = k(size());
            setK.addAll(setL);
            this.f29375b = setK;
            return;
        }
        int i10 = this.f29379f;
        if (i10 < B().length) {
            D(i10);
        }
        int iJ = CompactHashing.j(i10);
        int iR = r();
        if (iJ < iR) {
            F(iR, iJ, 0, 0);
        }
    }

    void u(int i10, Object obj, int i11, int i12) {
        H(i10, CompactHashing.d(i11, 0, i12));
        G(i10, obj);
    }

    void v(int i10, int i11) {
        Object objC = C();
        int[] iArrB = B();
        Object[] objArrA = A();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrA[i10] = null;
            iArrB[i10] = 0;
            return;
        }
        Object obj = objArrA[i12];
        objArrA[i10] = obj;
        objArrA[i12] = null;
        iArrB[i10] = iArrB[i12];
        iArrB[i12] = 0;
        int iD = Hashing.d(obj) & i11;
        int iH = CompactHashing.h(objC, iD);
        if (iH == size) {
            CompactHashing.i(objC, iD, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iH - 1;
            int i14 = iArrB[i13];
            int iC = CompactHashing.c(i14, i11);
            if (iC == size) {
                iArrB[i13] = CompactHashing.d(i14, i10 + 1, i11);
                return;
            }
            iH = iC;
        }
    }

    boolean x() {
        return this.f29375b == null;
    }

    public static <E> CompactHashSet<E> create(Collection<? extends E> collection) {
        CompactHashSet<E> compactHashSetCreateWithExpectedSize = createWithExpectedSize(collection.size());
        compactHashSetCreateWithExpectedSize.addAll(collection);
        return compactHashSetCreateWithExpectedSize;
    }

    CompactHashSet(int i10) {
        t(i10);
    }

    @SafeVarargs
    public static <E> CompactHashSet<E> create(E... eArr) {
        CompactHashSet<E> compactHashSetCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(compactHashSetCreateWithExpectedSize, eArr);
        return compactHashSetCreateWithExpectedSize;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        if (x()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set setL = l();
        if (setL != null) {
            return (T[]) setL.toArray(tArr);
        }
        return (T[]) ObjectArrays.g(A(), 0, this.f29379f, tArr);
    }
}
