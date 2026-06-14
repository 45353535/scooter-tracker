package yads;

import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class lx extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f113245k = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Object f113246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int[] f113247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f113248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Object[] f113249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f113250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int f113251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient ix f113252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient gx f113253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient kx f113254j;

    public lx(int i10) {
        a(i10);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException(he2.a("Invalid size: ", i10));
        }
        a(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map mapA = a();
        Iterator it = mapA != null ? mapA.entrySet().iterator() : new ex(this);
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final Map a() {
        Object obj = this.f113246b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int b() {
        return isEmpty() ? -1 : 0;
    }

    public final boolean c() {
        return this.f113246b == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (c()) {
            return;
        }
        this.f113250f += 32;
        Map mapA = a();
        if (mapA != null) {
            this.f113250f = Math.min(Math.max(size(), 3), 1073741823);
            mapA.clear();
            this.f113246b = null;
            this.f113251g = 0;
            return;
        }
        Object[] objArr = this.f113248d;
        Objects.requireNonNull(objArr);
        Arrays.fill(objArr, 0, this.f113251g, (Object) null);
        Object[] objArr2 = this.f113249e;
        Objects.requireNonNull(objArr2);
        Arrays.fill(objArr2, 0, this.f113251g, (Object) null);
        Object obj = this.f113246b;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.f113247c;
        Objects.requireNonNull(iArr);
        Arrays.fill(iArr, 0, this.f113251g, 0);
        this.f113251g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapA = a();
        return mapA != null ? mapA.containsKey(obj) : a(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f113251g; i10++) {
            if (y72.a(obj, c(i10))) {
                return true;
            }
        }
        return false;
    }

    public final int[] d() {
        int[] iArr = this.f113247c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] e() {
        Object[] objArr = this.f113248d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        gx gxVar = this.f113253i;
        if (gxVar != null) {
            return gxVar;
        }
        gx gxVar2 = new gx(this);
        this.f113253i = gxVar2;
        return gxVar2;
    }

    public final Object f() {
        Object obj = this.f113246b;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] g() {
        Object[] objArr = this.f113249e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.get(obj);
        }
        int iA = a(obj);
        if (iA == -1) {
            return null;
        }
        return c(iA);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        ix ixVar = this.f113252h;
        if (ixVar != null) {
            return ixVar;
        }
        ix ixVar2 = new ix(this);
        this.f113252h = ixVar2;
        return ixVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        int i11 = 32;
        if (c()) {
            if (!c()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i12 = this.f113250f;
            int iMax = Math.max(i12 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > ((int) (((double) iHighestOneBit) * 1.0d)) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            if (iMax2 < 2 || iMax2 > 1073741824 || Integer.highestOneBit(iMax2) != iMax2) {
                throw new IllegalArgumentException(he2.a("must be power of 2 between 2^1 and 2^30: ", iMax2));
            }
            this.f113246b = iMax2 <= 256 ? new byte[iMax2] : iMax2 <= 65536 ? new short[iMax2] : new int[iMax2];
            this.f113250f = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f113250f & (-32));
            this.f113247c = new int[i12];
            this.f113248d = new Object[i12];
            this.f113249e = new Object[i12];
        }
        Map mapA = a();
        if (mapA != null) {
            return mapA.put(obj, obj2);
        }
        int[] iArr = this.f113247c;
        Objects.requireNonNull(iArr);
        int[] iArr2 = iArr;
        Object[] objArr = this.f113248d;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = objArr;
        Object[] objArr3 = this.f113249e;
        Objects.requireNonNull(objArr3);
        Object[] objArr4 = objArr3;
        int i13 = this.f113251g;
        int i14 = i13 + 1;
        int iA = az0.a(obj == null ? 0 : obj.hashCode());
        int i15 = 1 << (this.f113250f & 31);
        int iA2 = i15 - 1;
        int i16 = iA & iA2;
        Object obj3 = this.f113246b;
        Objects.requireNonNull(obj3);
        int iA3 = mx.a(i16, obj3);
        if (iA3 == 0) {
            if (i14 > iA2) {
                iA2 = a(iA2, i15 * (iA2 < 32 ? 4 : 2), iA, i13);
            } else {
                Object obj4 = this.f113246b;
                Objects.requireNonNull(obj4);
                mx.a(i16, i14, obj4);
            }
            i10 = 1;
        } else {
            int i17 = ~iA2;
            i10 = 1;
            int i18 = iA & i17;
            int i19 = 0;
            while (true) {
                int i20 = iA3 - 1;
                int i21 = iArr2[i20];
                int i22 = i11;
                int i23 = i21 & i17;
                if (i23 == i18 && y72.a(obj, objArr2[i20])) {
                    Object obj5 = objArr4[i20];
                    objArr4[i20] = obj2;
                    return obj5;
                }
                int i24 = i21 & iA2;
                int[] iArr3 = iArr2;
                int i25 = i19 + 1;
                if (i24 != 0) {
                    i19 = i25;
                    iA3 = i24;
                    iArr2 = iArr3;
                    i11 = i22;
                } else {
                    if (i25 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(1 << (this.f113250f & 31), 1.0f);
                        int iB = b();
                        while (iB >= 0) {
                            linkedHashMap.put(b(iB), c(iB));
                            iB++;
                            if (iB >= this.f113251g) {
                                iB = -1;
                            }
                        }
                        this.f113246b = linkedHashMap;
                        this.f113247c = null;
                        this.f113248d = null;
                        this.f113249e = null;
                        this.f113250f += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i14 > iA2) {
                        iA2 = a(iA2, i15 * (iA2 < i22 ? 4 : 2), iA, i13);
                    } else {
                        iArr3[i20] = (i14 & iA2) | i23;
                    }
                }
            }
        }
        int[] iArr4 = this.f113247c;
        Objects.requireNonNull(iArr4);
        int length = iArr4.length;
        if (i14 > length) {
            int i26 = i10;
            int iMin = Math.min(1073741823, (Math.max(i26, length >>> 1) + length) | i26);
            if (iMin != length) {
                int[] iArr5 = this.f113247c;
                Objects.requireNonNull(iArr5);
                this.f113247c = Arrays.copyOf(iArr5, iMin);
                Object[] objArr5 = this.f113248d;
                Objects.requireNonNull(objArr5);
                this.f113248d = Arrays.copyOf(objArr5, iMin);
                Object[] objArr6 = this.f113249e;
                Objects.requireNonNull(objArr6);
                this.f113249e = Arrays.copyOf(objArr6, iMin);
            }
        }
        int i27 = (~iA2) & iA;
        int[] iArr6 = this.f113247c;
        Objects.requireNonNull(iArr6);
        iArr6[i13] = i27;
        Object[] objArr7 = this.f113248d;
        Objects.requireNonNull(objArr7);
        objArr7[i13] = obj;
        a(i13, obj2);
        this.f113251g = i14;
        this.f113250f += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.remove(obj);
        }
        Object objB = b(obj);
        if (objB == f113245k) {
            return null;
        }
        return objB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapA = a();
        return mapA != null ? mapA.size() : this.f113251g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        kx kxVar = this.f113254j;
        if (kxVar != null) {
            return kxVar;
        }
        kx kxVar2 = new kx(this);
        this.f113254j = kxVar2;
        return kxVar2;
    }

    public final Object b(int i10) {
        Object[] objArr = this.f113248d;
        Objects.requireNonNull(objArr);
        return objArr[i10];
    }

    public final Object c(int i10) {
        Object[] objArr = this.f113249e;
        Objects.requireNonNull(objArr);
        return objArr[i10];
    }

    public final int a(Object obj) {
        if (c()) {
            return -1;
        }
        int iA = az0.a(obj == null ? 0 : obj.hashCode());
        int i10 = (1 << (this.f113250f & 31)) - 1;
        Object obj2 = this.f113246b;
        Objects.requireNonNull(obj2);
        int iA2 = mx.a(iA & i10, obj2);
        if (iA2 == 0) {
            return -1;
        }
        int i11 = ~i10;
        int i12 = iA & i11;
        do {
            int i13 = iA2 - 1;
            int[] iArr = this.f113247c;
            Objects.requireNonNull(iArr);
            int i14 = iArr[i13];
            if ((i14 & i11) == i12 && y72.a(obj, b(i13))) {
                return i13;
            }
            iA2 = i14 & i10;
        } while (iA2 != 0);
        return -1;
    }

    public final Object b(Object obj) {
        if (c()) {
            return f113245k;
        }
        int i10 = (1 << (this.f113250f & 31)) - 1;
        Object obj2 = this.f113246b;
        Objects.requireNonNull(obj2);
        int[] iArr = this.f113247c;
        Objects.requireNonNull(iArr);
        int[] iArr2 = iArr;
        Object[] objArr = this.f113248d;
        Objects.requireNonNull(objArr);
        int iA = mx.a(obj, null, i10, obj2, iArr2, objArr, null);
        if (iA == -1) {
            return f113245k;
        }
        Object objC = c(iA);
        a(iA, i10);
        this.f113251g--;
        this.f113250f += 32;
        return objC;
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            this.f113250f = Math.min(Math.max(i10, 1), 1073741823);
            return;
        }
        throw new IllegalArgumentException("Expected size must be >= 0");
    }

    public final void a(int i10, int i11) {
        Object obj = this.f113246b;
        Objects.requireNonNull(obj);
        int[] iArr = this.f113247c;
        Objects.requireNonNull(iArr);
        int[] iArr2 = iArr;
        Object[] objArr = this.f113248d;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = objArr;
        Object[] objArr3 = this.f113249e;
        Objects.requireNonNull(objArr3);
        Object[] objArr4 = objArr3;
        int size = size();
        int i12 = size - 1;
        if (i10 < i12) {
            Object obj2 = objArr2[i12];
            objArr2[i10] = obj2;
            objArr4[i10] = objArr4[i12];
            objArr2[i12] = null;
            objArr4[i12] = null;
            iArr2[i10] = iArr2[i12];
            iArr2[i12] = 0;
            int iA = az0.a(obj2 != null ? obj2.hashCode() : 0) & i11;
            int iA2 = mx.a(iA, obj);
            if (iA2 == size) {
                mx.a(iA, i10 + 1, obj);
                return;
            }
            while (true) {
                int i13 = iA2 - 1;
                int i14 = iArr2[i13];
                int i15 = i14 & i11;
                if (i15 == size) {
                    iArr2[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                    return;
                }
                iA2 = i15;
            }
        } else {
            objArr2[i10] = null;
            objArr4[i10] = null;
            iArr2[i10] = 0;
        }
    }

    public final int a(int i10, int i11, int i12, int i13) {
        Object obj;
        if (i11 >= 2 && i11 <= 1073741824 && Integer.highestOneBit(i11) == i11) {
            if (i11 <= 256) {
                obj = new byte[i11];
            } else if (i11 <= 65536) {
                obj = new short[i11];
            } else {
                obj = new int[i11];
            }
            int i14 = i11 - 1;
            if (i13 != 0) {
                mx.a(i12 & i14, i13 + 1, obj);
            }
            Object obj2 = this.f113246b;
            Objects.requireNonNull(obj2);
            int[] iArr = this.f113247c;
            Objects.requireNonNull(iArr);
            int[] iArr2 = iArr;
            for (int i15 = 0; i15 <= i10; i15++) {
                int iA = mx.a(i15, obj2);
                while (iA != 0) {
                    int i16 = iA - 1;
                    int i17 = iArr2[i16];
                    int i18 = ((~i10) & i17) | i15;
                    int i19 = i18 & i14;
                    int iA2 = mx.a(i19, obj);
                    mx.a(i19, iA, obj);
                    iArr2[i16] = ((~i14) & i18) | (iA2 & i14);
                    iA = i17 & i10;
                }
            }
            this.f113246b = obj;
            this.f113250f = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f113250f & (-32));
            return i14;
        }
        throw new IllegalArgumentException(he2.a("must be power of 2 between 2^1 and 2^30: ", i11));
    }

    public final void a(int i10, Object obj) {
        Object[] objArr = this.f113249e;
        Objects.requireNonNull(objArr);
        objArr[i10] = obj;
    }
}
