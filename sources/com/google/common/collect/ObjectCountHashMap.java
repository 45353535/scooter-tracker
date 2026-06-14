package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
class ObjectCountHashMap<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    transient Object[] f30101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int[] f30102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient int f30103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient int f30104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int[] f30105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    transient long[] f30106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient float f30107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient int f30108h;

    class MapEntry extends Multisets.AbstractEntry<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f30109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f30110c;

        MapEntry(int i10) {
            this.f30109b = ObjectCountHashMap.this.f30101a[i10];
            this.f30110c = i10;
        }

        void d() {
            int i10 = this.f30110c;
            if (i10 == -1 || i10 >= ObjectCountHashMap.this.y() || !Objects.equal(this.f30109b, ObjectCountHashMap.this.f30101a[this.f30110c])) {
                this.f30110c = ObjectCountHashMap.this.k(this.f30109b);
            }
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
            d();
            int i10 = this.f30110c;
            if (i10 == -1) {
                return 0;
            }
            return ObjectCountHashMap.this.f30102b[i10];
        }

        @Override // com.google.common.collect.Multiset.Entry
        @ParametricNullness
        public K getElement() {
            return (K) this.f30109b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @CanIgnoreReturnValue
        public int setCount(int i10) {
            d();
            int i11 = this.f30110c;
            if (i11 == -1) {
                ObjectCountHashMap.this.put(this.f30109b, i10);
                return 0;
            }
            int[] iArr = ObjectCountHashMap.this.f30102b;
            int i12 = iArr[i11];
            iArr[i11] = i10;
            return i12;
        }
    }

    ObjectCountHashMap() {
        l(3, 1.0f);
    }

    static ObjectCountHashMap a() {
        return new ObjectCountHashMap();
    }

    static ObjectCountHashMap b(int i10) {
        return new ObjectCountHashMap(i10);
    }

    private static int f(long j10) {
        return (int) (j10 >>> 32);
    }

    private static int h(long j10) {
        return (int) j10;
    }

    private int j() {
        return this.f30105e.length - 1;
    }

    private static long[] o(int i10) {
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] p(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private int s(Object obj, int i10) {
        int iJ = j() & i10;
        int i11 = this.f30105e[iJ];
        if (i11 == -1) {
            return 0;
        }
        int i12 = -1;
        while (true) {
            if (f(this.f30106f[i11]) == i10 && Objects.equal(obj, this.f30101a[i11])) {
                int i13 = this.f30102b[i11];
                if (i12 == -1) {
                    this.f30105e[iJ] = h(this.f30106f[i11]);
                } else {
                    long[] jArr = this.f30106f;
                    jArr[i12] = z(jArr[i12], h(jArr[i11]));
                }
                n(i11);
                this.f30103c--;
                this.f30104d++;
                return i13;
            }
            int iH = h(this.f30106f[i11]);
            if (iH == -1) {
                return 0;
            }
            i12 = i11;
            i11 = iH;
        }
    }

    private void v(int i10) {
        int length = this.f30106f.length;
        if (i10 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                u(iMax);
            }
        }
    }

    private void w(int i10) {
        if (this.f30105e.length >= 1073741824) {
            this.f30108h = Integer.MAX_VALUE;
            return;
        }
        int i11 = ((int) (i10 * this.f30107g)) + 1;
        int[] iArrP = p(i10);
        long[] jArr = this.f30106f;
        int length = iArrP.length - 1;
        for (int i12 = 0; i12 < this.f30103c; i12++) {
            int iF = f(jArr[i12]);
            int i13 = iF & length;
            int i14 = iArrP[i13];
            iArrP[i13] = i12;
            jArr[i12] = (((long) iF) << 32) | (4294967295L & ((long) i14));
        }
        this.f30108h = i11;
        this.f30105e = iArrP;
    }

    private static long z(long j10, int i10) {
        return (j10 & (-4294967296L)) | (4294967295L & ((long) i10));
    }

    void c(int i10) {
        if (i10 > this.f30106f.length) {
            u(i10);
        }
        if (i10 >= this.f30108h) {
            w(Math.max(2, Integer.highestOneBit(i10 - 1) << 1));
        }
    }

    public void clear() {
        this.f30104d++;
        Arrays.fill(this.f30101a, 0, this.f30103c, (Object) null);
        Arrays.fill(this.f30102b, 0, this.f30103c, 0);
        Arrays.fill(this.f30105e, -1);
        Arrays.fill(this.f30106f, -1L);
        this.f30103c = 0;
    }

    public boolean containsKey(Object obj) {
        return k(obj) != -1;
    }

    int d() {
        return this.f30103c == 0 ? -1 : 0;
    }

    Multiset.Entry e(int i10) {
        Preconditions.checkElementIndex(i10, this.f30103c);
        return new MapEntry(i10);
    }

    Object g(int i10) {
        Preconditions.checkElementIndex(i10, this.f30103c);
        return this.f30101a[i10];
    }

    public int get(Object obj) {
        int iK = k(obj);
        if (iK == -1) {
            return 0;
        }
        return this.f30102b[iK];
    }

    int i(int i10) {
        Preconditions.checkElementIndex(i10, this.f30103c);
        return this.f30102b[i10];
    }

    int k(Object obj) {
        int iD = Hashing.d(obj);
        int iH = this.f30105e[j() & iD];
        while (iH != -1) {
            long j10 = this.f30106f[iH];
            if (f(j10) == iD && Objects.equal(obj, this.f30101a[iH])) {
                return iH;
            }
            iH = h(j10);
        }
        return -1;
    }

    void l(int i10, float f10) {
        Preconditions.checkArgument(i10 >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f10 > 0.0f, "Illegal load factor");
        int iA = Hashing.a(i10, f10);
        this.f30105e = p(iA);
        this.f30107g = f10;
        this.f30101a = new Object[i10];
        this.f30102b = new int[i10];
        this.f30106f = o(i10);
        this.f30108h = Math.max(1, (int) (iA * f10));
    }

    void m(int i10, Object obj, int i11, int i12) {
        this.f30106f[i10] = (((long) i12) << 32) | 4294967295L;
        this.f30101a[i10] = obj;
        this.f30102b[i10] = i11;
    }

    void n(int i10) {
        int iY = y() - 1;
        if (i10 >= iY) {
            this.f30101a[i10] = null;
            this.f30102b[i10] = 0;
            this.f30106f[i10] = -1;
            return;
        }
        Object[] objArr = this.f30101a;
        objArr[i10] = objArr[iY];
        int[] iArr = this.f30102b;
        iArr[i10] = iArr[iY];
        objArr[iY] = null;
        iArr[iY] = 0;
        long[] jArr = this.f30106f;
        long j10 = jArr[iY];
        jArr[i10] = j10;
        jArr[iY] = -1;
        int iF = f(j10) & j();
        int[] iArr2 = this.f30105e;
        int i11 = iArr2[iF];
        if (i11 == iY) {
            iArr2[iF] = i10;
            return;
        }
        while (true) {
            long j11 = this.f30106f[i11];
            int iH = h(j11);
            if (iH == iY) {
                this.f30106f[i11] = z(j11, i10);
                return;
            }
            i11 = iH;
        }
    }

    @CanIgnoreReturnValue
    public int put(@ParametricNullness K k10, int i10) {
        CollectPreconditions.d(i10, "count");
        long[] jArr = this.f30106f;
        Object[] objArr = this.f30101a;
        int[] iArr = this.f30102b;
        int iD = Hashing.d(k10);
        int iJ = j() & iD;
        int i11 = this.f30103c;
        int[] iArr2 = this.f30105e;
        int i12 = iArr2[iJ];
        if (i12 == -1) {
            iArr2[iJ] = i11;
        } else {
            while (true) {
                long j10 = jArr[i12];
                if (f(j10) == iD && Objects.equal(k10, objArr[i12])) {
                    int i13 = iArr[i12];
                    iArr[i12] = i10;
                    return i13;
                }
                int iH = h(j10);
                if (iH == -1) {
                    jArr[i12] = z(j10, i11);
                    break;
                }
                i12 = iH;
            }
        }
        if (i11 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i14 = i11 + 1;
        v(i14);
        m(i11, k10, i10, iD);
        this.f30103c = i14;
        if (i11 >= this.f30108h) {
            w(this.f30105e.length * 2);
        }
        this.f30104d++;
        return 0;
    }

    int q(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f30103c) {
            return i11;
        }
        return -1;
    }

    int r(int i10, int i11) {
        return i10 - 1;
    }

    @CanIgnoreReturnValue
    public int remove(Object obj) {
        return s(obj, Hashing.d(obj));
    }

    int t(int i10) {
        return s(this.f30101a[i10], f(this.f30106f[i10]));
    }

    void u(int i10) {
        this.f30101a = Arrays.copyOf(this.f30101a, i10);
        this.f30102b = Arrays.copyOf(this.f30102b, i10);
        long[] jArr = this.f30106f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(jArrCopyOf, length, i10, -1L);
        }
        this.f30106f = jArrCopyOf;
    }

    void x(int i10, int i11) {
        Preconditions.checkElementIndex(i10, this.f30103c);
        this.f30102b[i10] = i11;
    }

    int y() {
        return this.f30103c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    ObjectCountHashMap(ObjectCountHashMap objectCountHashMap) {
        l(objectCountHashMap.y(), 1.0f);
        int iD = objectCountHashMap.d();
        while (iD != -1) {
            put(objectCountHashMap.g(iD), objectCountHashMap.i(iD));
            iD = objectCountHashMap.q(iD);
        }
    }

    ObjectCountHashMap(int i10) {
        this(i10, 1.0f);
    }

    ObjectCountHashMap(int i10, float f10) {
        l(i10, f10);
    }
}
