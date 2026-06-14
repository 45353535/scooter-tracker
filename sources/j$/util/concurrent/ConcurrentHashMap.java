package j$.util.concurrent;

import androidx.collection.SieveCacheKt;
import com.ironsource.D5;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V>, Serializable, ConcurrentMap<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f84828g = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j$.sun.misc.a f84829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f84830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f84831j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f84832k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f84833l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f84834m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f84835n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f84836o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile transient k[] f84837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile transient k[] f84838b;
    private volatile transient long baseCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile transient c[] f84839c;
    private volatile transient int cellsBusy;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient KeySetView f84840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient r f84841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient e f84842f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    public static final int i(int i10) {
        return (i10 ^ (i10 >>> 16)) & Integer.MAX_VALUE;
    }

    static {
        ObjectStreamField objectStreamField = new ObjectStreamField("segments", m[].class);
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{objectStreamField, new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a aVar = j$.sun.misc.a.f84516b;
        f84829h = aVar;
        f84830i = aVar.h(ConcurrentHashMap.class, "sizeCtl");
        f84831j = aVar.h(ConcurrentHashMap.class, "transferIndex");
        f84832k = aVar.h(ConcurrentHashMap.class, "baseCount");
        f84833l = aVar.h(ConcurrentHashMap.class, "cellsBusy");
        f84834m = aVar.h(c.class, "value");
        f84835n = aVar.a();
        int iB = aVar.b();
        if (((iB - 1) & iB) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        f84836o = 31 - Integer.numberOfLeadingZeros(iB);
    }

    public static final int l(int i10) {
        int iNumberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i10 - 1);
        if (iNumberOfLeadingZeros < 0) {
            return 1;
        }
        if (iNumberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return iNumberOfLeadingZeros + 1;
    }

    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls != String.class) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces == null) {
                return null;
            }
            for (Type type : genericInterfaces) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    if (parameterizedType.getRawType() != Comparable.class || (actualTypeArguments = parameterizedType.getActualTypeArguments()) == null || actualTypeArguments.length != 1 || actualTypeArguments[0] != cls) {
                    }
                }
            }
            return null;
        }
        return cls;
    }

    public static final k k(k[] kVarArr, int i10) {
        return (k) f84829h.f(kVarArr, (((long) i10) << f84836o) + ((long) f84835n));
    }

    public static final boolean b(k[] kVarArr, int i10, k kVar) {
        return j$.com.android.tools.r8.a.w(f84829h.f84517a, kVarArr, (((long) i10) << f84836o) + ((long) f84835n), kVar);
    }

    public static final void h(k[] kVarArr, int i10, k kVar) {
        f84829h.j(kVarArr, (((long) i10) << f84836o) + ((long) f84835n), kVar);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i10) {
        this(i10, 0.75f, 1);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    public ConcurrentHashMap(int i10, float f10, int i11) {
        if (f10 <= 0.0f || i10 < 0 || i11 <= 0) {
            throw new IllegalArgumentException();
        }
        long j10 = (long) (((double) ((i10 < i11 ? i11 : i10) / f10)) + 1.0d);
        this.sizeCtl = j10 >= 1073741824 ? 1073741824 : l((int) j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j10 = j();
        if (j10 < 0) {
            return 0;
        }
        if (j10 > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return j() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int length;
        k kVarK;
        Object obj2;
        int i10 = i(obj.hashCode());
        k[] kVarArr = this.f84837a;
        if (kVarArr == null || (length = kVarArr.length) <= 0 || (kVarK = k(kVarArr, (length - 1) & i10)) == null) {
            return null;
        }
        int i11 = kVarK.f84863a;
        if (i11 == i10) {
            Object obj3 = kVarK.f84864b;
            if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                return (V) kVarK.f84865c;
            }
        } else if (i11 < 0) {
            k kVarA = kVarK.a(i10, obj);
            if (kVarA != null) {
                return (V) kVarA.f84865c;
            }
            return null;
        }
        while (true) {
            kVarK = kVarK.f84866d;
            if (kVarK == null) {
                return null;
            }
            if (kVarK.f84863a == i10 && ((obj2 = kVarK.f84864b) == obj || (obj2 != null && obj.equals(obj2)))) {
                break;
            }
        }
        return (V) kVarK.f84865c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        obj.getClass();
        k[] kVarArr = this.f84837a;
        if (kVarArr != null) {
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                Object obj2 = kVarA.f84865c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        return (V) f(k10, v10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        r7 = r6.f84865c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        if (r11 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        r6.f84865c = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a5, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto Lc2
            if (r10 == 0) goto Lc2
            int r1 = r9.hashCode()
            int r1 = i(r1)
            j$.util.concurrent.k[] r2 = r8.f84837a
            r3 = 0
        L10:
            if (r2 == 0) goto Lbc
            int r4 = r2.length
            if (r4 != 0) goto L17
            goto Lbc
        L17:
            int r4 = r4 + (-1)
            r4 = r4 & r1
            j$.util.concurrent.k r5 = k(r2, r4)
            if (r5 != 0) goto L2d
            j$.util.concurrent.k r5 = new j$.util.concurrent.k
            r5.<init>(r1, r9, r10)
            boolean r4 = b(r2, r4, r5)
            if (r4 == 0) goto L10
            goto Lb4
        L2d:
            int r6 = r5.f84863a
            r7 = -1
            if (r6 != r7) goto L37
            j$.util.concurrent.k[] r2 = r8.d(r2, r5)
            goto L10
        L37:
            if (r11 == 0) goto L4c
            if (r6 != r1) goto L4c
            java.lang.Object r7 = r5.f84864b
            if (r7 == r9) goto L47
            if (r7 == 0) goto L4c
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4c
        L47:
            java.lang.Object r7 = r5.f84865c
            if (r7 == 0) goto L4c
            return r7
        L4c:
            monitor-enter(r5)
            j$.util.concurrent.k r7 = k(r2, r4)     // Catch: java.lang.Throwable -> L68
            if (r7 != r5) goto La6
            if (r6 < 0) goto L81
            r3 = 1
            r6 = r5
        L57:
            int r7 = r6.f84863a     // Catch: java.lang.Throwable -> L68
            if (r7 != r1) goto L71
            java.lang.Object r7 = r6.f84864b     // Catch: java.lang.Throwable -> L68
            if (r7 == r9) goto L6a
            if (r7 == 0) goto L71
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L71
            goto L6a
        L68:
            r9 = move-exception
            goto Lba
        L6a:
            java.lang.Object r7 = r6.f84865c     // Catch: java.lang.Throwable -> L68
            if (r11 != 0) goto La7
            r6.f84865c = r10     // Catch: java.lang.Throwable -> L68
            goto La7
        L71:
            j$.util.concurrent.k r7 = r6.f84866d     // Catch: java.lang.Throwable -> L68
            if (r7 != 0) goto L7d
            j$.util.concurrent.k r7 = new j$.util.concurrent.k     // Catch: java.lang.Throwable -> L68
            r7.<init>(r1, r9, r10)     // Catch: java.lang.Throwable -> L68
            r6.f84866d = r7     // Catch: java.lang.Throwable -> L68
            goto La6
        L7d:
            int r3 = r3 + 1
            r6 = r7
            goto L57
        L81:
            boolean r6 = r5 instanceof j$.util.concurrent.p     // Catch: java.lang.Throwable -> L68
            if (r6 == 0) goto L99
            r3 = r5
            j$.util.concurrent.p r3 = (j$.util.concurrent.p) r3     // Catch: java.lang.Throwable -> L68
            j$.util.concurrent.q r3 = r3.e(r1, r9, r10)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L96
            java.lang.Object r6 = r3.f84865c     // Catch: java.lang.Throwable -> L68
            if (r11 != 0) goto L94
            r3.f84865c = r10     // Catch: java.lang.Throwable -> L68
        L94:
            r7 = r6
            goto L97
        L96:
            r7 = r0
        L97:
            r3 = 2
            goto La7
        L99:
            boolean r6 = r5 instanceof j$.util.concurrent.l     // Catch: java.lang.Throwable -> L68
            if (r6 != 0) goto L9e
            goto La6
        L9e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L68
            java.lang.String r10 = "Recursive update"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L68
            throw r9     // Catch: java.lang.Throwable -> L68
        La6:
            r7 = r0
        La7:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L10
            r9 = 8
            if (r3 < r9) goto Lb1
            r8.n(r2, r4)
        Lb1:
            if (r7 == 0) goto Lb4
            return r7
        Lb4:
            r9 = 1
            r8.a(r9, r3)
            return r0
        Lba:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L68
            throw r9
        Lbc:
            j$.util.concurrent.k[] r2 = r8.e()
            goto L10
        Lc2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.f(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        o(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    public final Object g(Object obj, Object obj2, Object obj3) {
        int length;
        int i10;
        k kVarK;
        boolean z10;
        Object obj4;
        q qVarB;
        Object obj5;
        int i11 = i(obj.hashCode());
        k[] kVarArrD = this.f84837a;
        while (true) {
            if (kVarArrD == null || (length = kVarArrD.length) == 0 || (kVarK = k(kVarArrD, (i10 = (length - 1) & i11))) == null) {
                break;
            }
            int i12 = kVarK.f84863a;
            if (i12 == -1) {
                kVarArrD = d(kVarArrD, kVarK);
            } else {
                synchronized (kVarK) {
                    try {
                        if (k(kVarArrD, i10) == kVarK) {
                            z10 = true;
                            if (i12 >= 0) {
                                k kVar = null;
                                k kVar2 = kVarK;
                                while (true) {
                                    if (kVar2.f84863a != i11 || ((obj5 = kVar2.f84864b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                        k kVar3 = kVar2.f84866d;
                                        if (kVar3 == null) {
                                            break;
                                        }
                                        kVar = kVar2;
                                        kVar2 = kVar3;
                                    }
                                }
                                obj4 = kVar2.f84865c;
                                if (obj3 != null && obj3 != obj4 && (obj4 == null || !obj3.equals(obj4))) {
                                    obj4 = null;
                                } else if (obj2 != null) {
                                    kVar2.f84865c = obj2;
                                } else if (kVar != null) {
                                    kVar.f84866d = kVar2.f84866d;
                                } else {
                                    h(kVarArrD, i10, kVar2.f84866d);
                                }
                            } else if (kVarK instanceof p) {
                                p pVar = (p) kVarK;
                                q qVar = pVar.f84881e;
                                if (qVar != null && (qVarB = qVar.b(i11, obj, null)) != null) {
                                    obj4 = qVarB.f84865c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            qVarB.f84865c = obj2;
                                        } else if (pVar.f(qVarB)) {
                                            h(kVarArrD, i10, p(pVar.f84882f));
                                        }
                                    }
                                }
                                obj4 = null;
                            } else if (kVarK instanceof l) {
                                throw new IllegalStateException("Recursive update");
                            }
                        }
                        z10 = false;
                        obj4 = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            a(-1L, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        k kVarK;
        k kVar;
        k[] kVarArrD = this.f84837a;
        long j10 = 0;
        loop0: while (true) {
            int i10 = 0;
            while (kVarArrD != null && i10 < kVarArrD.length) {
                kVarK = k(kVarArrD, i10);
                if (kVarK == null) {
                    i10++;
                } else {
                    int i11 = kVarK.f84863a;
                    if (i11 == -1) {
                        break;
                    }
                    synchronized (kVarK) {
                        try {
                            if (k(kVarArrD, i10) == kVarK) {
                                if (i11 >= 0) {
                                    kVar = kVarK;
                                } else {
                                    kVar = kVarK instanceof p ? ((p) kVarK).f84882f : null;
                                }
                                while (kVar != null) {
                                    j10--;
                                    kVar = kVar.f84866d;
                                }
                                h(kVarArrD, i10, null);
                                i10++;
                            }
                        } finally {
                        }
                    }
                }
            }
            kVarArrD = d(kVarArrD, kVarK);
        }
        if (j10 != 0) {
            a(j10, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        KeySetView keySetView = this.f84840d;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView keySetView2 = new KeySetView(this, null);
        this.f84840d = keySetView2;
        return keySetView2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        r rVar = this.f84841e;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(this);
        this.f84841e = rVar2;
        return rVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        e eVar = this.f84842f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f84842f = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        k[] kVarArr = this.f84837a;
        int iHashCode = 0;
        if (kVarArr != null) {
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                iHashCode += kVarA.f84865c.hashCode() ^ kVarA.f84864b.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        k[] kVarArr = this.f84837a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        o oVar = new o(kVarArr, length, 0, length);
        StringBuilder sb2 = new StringBuilder("{");
        k kVarA = oVar.a();
        if (kVarA != null) {
            while (true) {
                Object obj = kVarA.f84864b;
                Object obj2 = kVarA.f84865c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb2.append(obj);
                sb2.append(D5.T);
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb2.append(obj2);
                kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                sb2.append(", ");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        V value;
        V v10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        k[] kVarArr = this.f84837a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        o oVar = new o(kVarArr, length, 0, length);
        while (true) {
            k kVarA = oVar.a();
            if (kVarA != null) {
                Object obj2 = kVarA.f84865c;
                Object obj3 = map.get(kVarA.f84864b);
                if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                    break;
                }
            } else {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v10 = get(key)) == null || (value != v10 && !value.equals(v10))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = 0;
        int i11 = 1;
        while (i11 < 16) {
            i10++;
            i11 <<= 1;
        }
        int i12 = 32 - i10;
        int i13 = i11 - 1;
        m[] mVarArr = new m[16];
        for (int i14 = 0; i14 < 16; i14++) {
            mVarArr[i14] = new m();
        }
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", mVarArr);
        putFieldPutFields.put("segmentShift", i12);
        putFieldPutFields.put("segmentMask", i13);
        objectOutputStream.writeFields();
        k[] kVarArr = this.f84837a;
        if (kVarArr != null) {
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                objectOutputStream.writeObject(kVarA.f84864b);
                objectOutputStream.writeObject(kVarA.f84865c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        long j10;
        long j11;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j12 = 0;
        long j13 = 0;
        k kVar = null;
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            j10 = 1;
            if (object == null || object2 == null) {
                break;
            }
            j13++;
            kVar = new k(i(object.hashCode()), object, object2, kVar);
        }
        if (j13 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j14 = (long) (((double) (j13 / 0.75f)) + 1.0d);
        int iL = j14 >= 1073741824 ? 1073741824 : l((int) j14);
        k[] kVarArr = new k[iL];
        int i10 = iL - 1;
        while (kVar != null) {
            k kVar2 = kVar.f84866d;
            int i11 = kVar.f84863a;
            int i12 = i11 & i10;
            k kVarK = k(kVarArr, i12);
            boolean z10 = true;
            if (kVarK == null) {
                j11 = j10;
            } else {
                Object obj2 = kVar.f84864b;
                if (kVarK.f84863a < 0) {
                    if (((p) kVarK).e(i11, obj2, kVar.f84865c) == null) {
                        j12 += j10;
                    }
                    j11 = j10;
                } else {
                    j11 = j10;
                    int i13 = 0;
                    for (k kVar3 = kVarK; kVar3 != null; kVar3 = kVar3.f84866d) {
                        if (kVar3.f84863a == i11 && ((obj = kVar3.f84864b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z10 = false;
                            break;
                        }
                        i13++;
                    }
                    if (z10 && i13 >= 8) {
                        j12 += j11;
                        kVar.f84866d = kVarK;
                        k kVar4 = kVar;
                        q qVar = null;
                        q qVar2 = null;
                        while (kVar4 != null) {
                            q qVar3 = new q(kVar4.f84863a, kVar4.f84864b, kVar4.f84865c, null, null);
                            qVar3.f84887h = qVar2;
                            if (qVar2 == null) {
                                qVar = qVar3;
                            } else {
                                qVar2.f84866d = qVar3;
                            }
                            kVar4 = kVar4.f84866d;
                            qVar2 = qVar3;
                        }
                        h(kVarArr, i12, new p(qVar));
                    }
                }
                z10 = false;
            }
            if (z10) {
                j12 += j11;
                kVar.f84866d = kVarK;
                h(kVarArr, i12, kVar);
            }
            kVar = kVar2;
            j10 = j11;
        }
        this.f84837a = kVarArr;
        this.sizeCtl = iL - (iL >>> 2);
        this.baseCount = j12;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k10, V v10) {
        return (V) f(k10, v10, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean replace(K k10, V v10, V v11) {
        if (k10 == null || v10 == null || v11 == null) {
            throw null;
        }
        return g(k10, v11, v10) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v10 = get(obj);
        return v10 == null ? obj2 : v10;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        k[] kVarArr = this.f84837a;
        if (kVarArr == null) {
            return;
        }
        o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
        while (true) {
            k kVarA = oVar.a();
            if (kVarA == null) {
                return;
            } else {
                biConsumer.accept(kVarA.f84864b, kVarA.f84865c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        k[] kVarArr = this.f84837a;
        if (kVarArr == null) {
            return;
        }
        o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
        while (true) {
            k kVarA = oVar.a();
            if (kVarA == null) {
                return;
            }
            Object obj = kVarA.f84865c;
            Object obj2 = kVarA.f84864b;
            do {
                Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (g(obj2, objApply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x008c, code lost:
    
        r5 = r5.f84865c;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00aa, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lbd
            if (r15 == 0) goto Lbd
            int r1 = r14.hashCode()
            int r1 = i(r1)
            j$.util.concurrent.k[] r2 = r13.f84837a
            r3 = 0
            r5 = r0
            r4 = r3
        L12:
            if (r2 == 0) goto Lb7
            int r6 = r2.length
            if (r6 != 0) goto L19
            goto Lb7
        L19:
            int r6 = r6 + (-1)
            r6 = r6 & r1
            j$.util.concurrent.k r7 = k(r2, r6)
            if (r7 != 0) goto L24
            goto Lae
        L24:
            int r8 = r7.f84863a
            r9 = -1
            if (r8 != r9) goto L2e
            j$.util.concurrent.k[] r2 = r13.d(r2, r7)
            goto L12
        L2e:
            monitor-enter(r7)
            j$.util.concurrent.k r10 = k(r2, r6)     // Catch: java.lang.Throwable -> L4b
            if (r10 != r7) goto Lab
            if (r8 < 0) goto L70
            r4 = 1
            r10 = r0
            r8 = r7
        L3a:
            int r11 = r8.f84863a     // Catch: java.lang.Throwable -> L4b
            if (r11 != r1) goto L65
            java.lang.Object r11 = r8.f84864b     // Catch: java.lang.Throwable -> L4b
            if (r11 == r14) goto L4e
            if (r11 == 0) goto L65
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L65
            goto L4e
        L4b:
            r14 = move-exception
            goto Lb5
        L4e:
            java.lang.Object r5 = r8.f84865c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L59
            r8.f84865c = r5     // Catch: java.lang.Throwable -> L4b
            goto Lab
        L59:
            j$.util.concurrent.k r3 = r8.f84866d     // Catch: java.lang.Throwable -> L4b
            if (r10 == 0) goto L60
            r10.f84866d = r3     // Catch: java.lang.Throwable -> L4b
            goto L63
        L60:
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L63:
            r3 = r9
            goto Lab
        L65:
            j$.util.concurrent.k r10 = r8.f84866d     // Catch: java.lang.Throwable -> L4b
            if (r10 != 0) goto L6a
            goto Lab
        L6a:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L3a
        L70:
            boolean r8 = r7 instanceof j$.util.concurrent.p     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9e
            r4 = r7
            j$.util.concurrent.p r4 = (j$.util.concurrent.p) r4     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.q r8 = r4.f84881e     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            j$.util.concurrent.q r8 = r8.b(r1, r14, r0)     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            java.lang.Object r5 = r8.f84865c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L8c
            r8.f84865c = r5     // Catch: java.lang.Throwable -> L4b
            goto L9c
        L8c:
            boolean r3 = r4.f(r8)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9b
            j$.util.concurrent.q r3 = r4.f84882f     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.k r3 = p(r3)     // Catch: java.lang.Throwable -> L4b
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L9b:
            r3 = r9
        L9c:
            r4 = 2
            goto Lab
        L9e:
            boolean r6 = r7 instanceof j$.util.concurrent.l     // Catch: java.lang.Throwable -> L4b
            if (r6 != 0) goto La3
            goto Lab
        La3:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r15 = "Recursive update"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L4b
            throw r14     // Catch: java.lang.Throwable -> L4b
        Lab:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L12
        Lae:
            if (r3 == 0) goto Lb4
            long r14 = (long) r3
            r13.a(r14, r4)
        Lb4:
            return r5
        Lb5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            throw r14
        Lb7:
            j$.util.concurrent.k[] r2 = r13.e()
            goto L12
        Lbd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        k kVar;
        Object objApply;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i10 = i(obj.hashCode());
        k[] kVarArrE = this.f84837a;
        int i11 = 0;
        Object objApply2 = null;
        int i12 = 0;
        while (true) {
            if (kVarArrE != null) {
                int length = kVarArrE.length;
                if (length != 0) {
                    int i13 = (length - 1) & i10;
                    k kVarK = k(kVarArrE, i13);
                    if (kVarK == null) {
                        l lVar = new l();
                        synchronized (lVar) {
                            try {
                                if (b(kVarArrE, i13, lVar)) {
                                    try {
                                        objApply2 = biFunction.apply(obj, null);
                                        if (objApply2 != null) {
                                            kVar = new k(i10, obj, objApply2);
                                            i12 = 1;
                                        } else {
                                            kVar = null;
                                        }
                                        h(kVarArrE, i13, kVar);
                                        i11 = 1;
                                    } catch (Throwable th2) {
                                        h(kVarArrE, i13, null);
                                        throw th2;
                                    }
                                }
                            } finally {
                            }
                        }
                        if (i11 != 0) {
                        }
                    } else {
                        int i14 = kVarK.f84863a;
                        if (i14 == -1) {
                            kVarArrE = d(kVarArrE, kVarK);
                        } else {
                            synchronized (kVarK) {
                                try {
                                    if (k(kVarArrE, i13) == kVarK) {
                                        if (i14 >= 0) {
                                            k kVar2 = null;
                                            k kVar3 = kVarK;
                                            i11 = 1;
                                            while (true) {
                                                if (kVar3.f84863a == i10 && ((obj2 = kVar3.f84864b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                    break;
                                                }
                                                k kVar4 = kVar3.f84866d;
                                                if (kVar4 == null) {
                                                    objApply = biFunction.apply(obj, null);
                                                    if (objApply != null) {
                                                        if (kVar3.f84866d != null) {
                                                            throw new IllegalStateException("Recursive update");
                                                        }
                                                        kVar3.f84866d = new k(i10, obj, objApply);
                                                        i12 = 1;
                                                    }
                                                } else {
                                                    i11++;
                                                    kVar2 = kVar3;
                                                    kVar3 = kVar4;
                                                }
                                            }
                                            Object objApply3 = biFunction.apply(obj, kVar3.f84865c);
                                            if (objApply3 != null) {
                                                kVar3.f84865c = objApply3;
                                                objApply2 = objApply3;
                                            } else {
                                                k kVar5 = kVar3.f84866d;
                                                if (kVar2 != null) {
                                                    kVar2.f84866d = kVar5;
                                                } else {
                                                    h(kVarArrE, i13, kVar5);
                                                }
                                                objApply2 = objApply3;
                                                i12 = -1;
                                            }
                                        } else if (kVarK instanceof p) {
                                            p pVar = (p) kVarK;
                                            q qVar = pVar.f84881e;
                                            q qVarB = qVar != null ? qVar.b(i10, obj, null) : null;
                                            objApply = biFunction.apply(obj, qVarB == null ? null : qVarB.f84865c);
                                            if (objApply != null) {
                                                if (qVarB != null) {
                                                    qVarB.f84865c = objApply;
                                                } else {
                                                    pVar.e(i10, obj, objApply);
                                                    i12 = 1;
                                                }
                                            } else if (qVarB != null) {
                                                if (pVar.f(qVarB)) {
                                                    h(kVarArrE, i13, p(pVar.f84882f));
                                                }
                                                i12 = -1;
                                            }
                                            i11 = 1;
                                            objApply2 = objApply;
                                        } else if (kVarK instanceof l) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i11 != 0) {
                                if (i11 >= 8) {
                                    n(kVarArrE, i13);
                                }
                            }
                        }
                    }
                }
            }
            kVarArrE = e();
        }
        if (i12 != 0) {
            a(i12, i11);
        }
        return objApply2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00dd, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object merge(java.lang.Object r18, java.lang.Object r19, java.util.function.BiFunction r20) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.merge(java.lang.Object, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    public Enumeration<K> keys() {
        k[] kVarArr = this.f84837a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        return new h(kVarArr, length, length, this, 0);
    }

    public static <K> KeySetView<K, Boolean> newKeySet() {
        return new KeySetView<>(new ConcurrentHashMap(), Boolean.TRUE);
    }

    public final k[] e() {
        while (true) {
            k[] kVarArr = this.f84837a;
            if (kVarArr != null && kVarArr.length != 0) {
                return kVarArr;
            }
            int i10 = this.sizeCtl;
            if (i10 < 0) {
                Thread.yield();
            } else if (f84829h.c(this, f84830i, i10, -1)) {
                try {
                    k[] kVarArr2 = this.f84837a;
                    if (kVarArr2 == null || kVarArr2.length == 0) {
                        int i11 = i10 > 0 ? i10 : 16;
                        k[] kVarArr3 = new k[i11];
                        this.f84837a = kVarArr3;
                        i10 = i11 - (i11 >>> 2);
                        kVarArr2 = kVarArr3;
                    }
                    this.sizeCtl = i10;
                    return kVarArr2;
                } catch (Throwable th2) {
                    this.sizeCtl = i10;
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0140, code lost:
    
        if (r1.f84839c != r6) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0142, code lost:
    
        r1.f84839c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r6, r7 << 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r25, int r27) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    public final k[] d(k[] kVarArr, k kVar) {
        int i10;
        if (kVar instanceof g) {
            k[] kVarArr2 = ((g) kVar).f84856e;
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(kVarArr.length) | 32768;
            while (kVarArr2 == this.f84838b && this.f84837a == kVarArr && (i10 = this.sizeCtl) < 0 && (i10 >>> 16) == iNumberOfLeadingZeros && i10 != iNumberOfLeadingZeros + 1 && i10 != 65535 + iNumberOfLeadingZeros && this.transferIndex > 0) {
                if (f84829h.c(this, f84830i, i10, i10 + 1)) {
                    m(kVarArr, kVarArr2);
                    break;
                }
            }
            return kVarArr2;
        }
        return this.f84837a;
    }

    public final void o(int i10) {
        int length;
        int iL = i10 >= 536870912 ? 1073741824 : l(i10 + (i10 >>> 1) + 1);
        while (true) {
            int i11 = this.sizeCtl;
            if (i11 < 0) {
                break;
            }
            k[] kVarArr = this.f84837a;
            if (kVarArr == null || (length = kVarArr.length) == 0) {
                int i12 = i11 > iL ? i11 : iL;
                if (f84829h.c(this, f84830i, i11, -1)) {
                    try {
                        if (this.f84837a == kVarArr) {
                            this.f84837a = new k[i12];
                            i11 = i12 - (i12 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i11;
                    }
                } else {
                    continue;
                }
            } else if (iL <= i11 || length >= 1073741824) {
                break;
            } else if (kVarArr == this.f84837a) {
                if (f84829h.c(this, f84830i, i11, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                    m(kVarArr, null);
                }
            }
        }
    }

    public final void m(k[] kVarArr, k[] kVarArr2) {
        k[] kVarArr3;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        char c10;
        int i14;
        int i15;
        k pVar;
        k pVar2;
        k kVar;
        int i16;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        int length = kVarArr.length;
        int i17 = f84828g;
        boolean z11 = true;
        int i18 = i17 > 1 ? (length >>> 3) / i17 : length;
        char c11 = 16;
        int i19 = i18 < 16 ? 16 : i18;
        if (kVarArr2 == null) {
            try {
                k[] kVarArr4 = new k[length << 1];
                concurrentHashMap.f84838b = kVarArr4;
                concurrentHashMap.transferIndex = length;
                kVarArr3 = kVarArr4;
            } catch (Throwable unused) {
                concurrentHashMap.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            kVarArr3 = kVarArr2;
        }
        int length2 = kVarArr3.length;
        g gVar = new g(kVarArr3);
        boolean zB = true;
        int i20 = 0;
        int i21 = 0;
        boolean z12 = false;
        while (true) {
            if (zB) {
                int i22 = i20 - 1;
                if (i22 >= i21 || z12) {
                    i21 = i21;
                    i20 = i22;
                    zB = false;
                } else {
                    int i23 = concurrentHashMap.transferIndex;
                    if (i23 <= 0) {
                        i20 = -1;
                    } else {
                        j$.sun.misc.a aVar = f84829h;
                        int i24 = i21;
                        long j10 = f84831j;
                        if (i23 > i19) {
                            i11 = i24;
                            i12 = i23 - i19;
                            i10 = i22;
                        } else {
                            i10 = i22;
                            i11 = i24;
                            i12 = 0;
                        }
                        boolean zC = aVar.c(concurrentHashMap, j10, i23, i12);
                        i21 = i12;
                        if (zC) {
                            i20 = i23 - 1;
                        } else {
                            i21 = i11;
                            i20 = i10;
                        }
                    }
                    zB = false;
                }
            } else {
                int i25 = i21;
                q qVar = null;
                k kVar2 = null;
                if (i20 < 0 || i20 >= length || (i15 = i20 + length) >= length2) {
                    i13 = length;
                    z10 = z11;
                    c10 = c11;
                    i14 = i19;
                    if (z12) {
                        concurrentHashMap.f84838b = null;
                        concurrentHashMap.f84837a = kVarArr3;
                        concurrentHashMap.sizeCtl = (i13 << 1) - (i13 >>> 1);
                        return;
                    }
                    int i26 = i20;
                    j$.sun.misc.a aVar2 = f84829h;
                    long j11 = f84830i;
                    int i27 = concurrentHashMap.sizeCtl;
                    if (!aVar2.c(concurrentHashMap, j11, i27, i27 - 1)) {
                        i20 = i26;
                    } else {
                        if (i27 - 2 != ((Integer.numberOfLeadingZeros(i13) | 32768) << 16)) {
                            return;
                        }
                        zB = z10;
                        z12 = zB;
                        i20 = i13;
                    }
                } else {
                    k kVarK = k(kVarArr, i20);
                    if (kVarK == null) {
                        zB = b(kVarArr, i20, gVar);
                        i13 = length;
                        z10 = z11;
                        c10 = c11;
                        i14 = i19;
                    } else {
                        z10 = z11;
                        int i28 = kVarK.f84863a;
                        if (i28 == -1) {
                            i13 = length;
                            c10 = c11;
                            i14 = i19;
                            zB = z10;
                        } else {
                            synchronized (kVarK) {
                                try {
                                    if (k(kVarArr, i20) == kVarK) {
                                        if (i28 >= 0) {
                                            int i29 = i28 & length;
                                            k kVar3 = kVarK.f84866d;
                                            k kVar4 = kVarK;
                                            while (kVar3 != null) {
                                                char c12 = c11;
                                                int i30 = kVar3.f84863a & length;
                                                if (i30 != i29) {
                                                    kVar4 = kVar3;
                                                    i29 = i30;
                                                }
                                                kVar3 = kVar3.f84866d;
                                                c11 = c12;
                                            }
                                            c10 = c11;
                                            if (i29 == 0) {
                                                kVar = null;
                                                kVar2 = kVar4;
                                            } else {
                                                kVar = kVar4;
                                            }
                                            k kVar5 = kVarK;
                                            while (kVar5 != kVar4) {
                                                int i31 = kVar5.f84863a;
                                                Object obj = kVar5.f84864b;
                                                int i32 = length;
                                                Object obj2 = kVar5.f84865c;
                                                if ((i31 & i32) == 0) {
                                                    i16 = i19;
                                                    kVar2 = new k(i31, obj, obj2, kVar2);
                                                } else {
                                                    i16 = i19;
                                                    kVar = new k(i31, obj, obj2, kVar);
                                                }
                                                kVar5 = kVar5.f84866d;
                                                length = i32;
                                                i19 = i16;
                                            }
                                            i13 = length;
                                            i14 = i19;
                                            h(kVarArr3, i20, kVar2);
                                            h(kVarArr3, i15, kVar);
                                            h(kVarArr, i20, gVar);
                                        } else {
                                            i13 = length;
                                            c10 = c11;
                                            i14 = i19;
                                            if (kVarK instanceof p) {
                                                p pVar3 = (p) kVarK;
                                                q qVar2 = null;
                                                q qVar3 = null;
                                                k kVar6 = pVar3.f84882f;
                                                int i33 = 0;
                                                int i34 = 0;
                                                q qVar4 = null;
                                                while (kVar6 != null) {
                                                    p pVar4 = pVar3;
                                                    int i35 = kVar6.f84863a;
                                                    q qVar5 = new q(i35, kVar6.f84864b, kVar6.f84865c, null, null);
                                                    if ((i35 & i13) == 0) {
                                                        qVar5.f84887h = qVar3;
                                                        if (qVar3 == null) {
                                                            qVar = qVar5;
                                                        } else {
                                                            qVar3.f84866d = qVar5;
                                                        }
                                                        i33++;
                                                        qVar3 = qVar5;
                                                    } else {
                                                        qVar5.f84887h = qVar2;
                                                        if (qVar2 == null) {
                                                            qVar4 = qVar5;
                                                        } else {
                                                            qVar2.f84866d = qVar5;
                                                        }
                                                        i34++;
                                                        qVar2 = qVar5;
                                                    }
                                                    kVar6 = kVar6.f84866d;
                                                    pVar3 = pVar4;
                                                }
                                                p pVar5 = pVar3;
                                                if (i33 <= 6) {
                                                    pVar = p(qVar);
                                                } else {
                                                    pVar = i34 != 0 ? new p(qVar) : pVar5;
                                                }
                                                if (i34 <= 6) {
                                                    pVar2 = p(qVar4);
                                                } else {
                                                    pVar2 = i33 != 0 ? new p(qVar4) : pVar5;
                                                }
                                                h(kVarArr3, i20, pVar);
                                                h(kVarArr3, i15, pVar2);
                                                h(kVarArr, i20, gVar);
                                            }
                                        }
                                        zB = z10;
                                    } else {
                                        i13 = length;
                                        c10 = c11;
                                        i14 = i19;
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                }
                concurrentHashMap = this;
                i21 = i25;
                z11 = z10;
                c11 = c10;
                length = i13;
                i19 = i14;
            }
        }
    }

    public final long j() {
        c[] cVarArr = this.f84839c;
        long j10 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j10 += cVar.value;
                }
            }
        }
        return j10;
    }

    public final void n(k[] kVarArr, int i10) {
        int length = kVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        k kVarK = k(kVarArr, i10);
        if (kVarK == null || kVarK.f84863a < 0) {
            return;
        }
        synchronized (kVarK) {
            try {
                if (k(kVarArr, i10) == kVarK) {
                    q qVar = null;
                    q qVar2 = null;
                    k kVar = kVarK;
                    while (kVar != null) {
                        q qVar3 = new q(kVar.f84863a, kVar.f84864b, kVar.f84865c, null, null);
                        qVar3.f84887h = qVar2;
                        if (qVar2 == null) {
                            qVar = qVar3;
                        } else {
                            qVar2.f84866d = qVar3;
                        }
                        kVar = kVar.f84866d;
                        qVar2 = qVar3;
                    }
                    h(kVarArr, i10, new p(qVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static k p(q qVar) {
        k kVar = null;
        k kVar2 = null;
        for (k kVar3 = qVar; kVar3 != null; kVar3 = kVar3.f84866d) {
            k kVar4 = new k(kVar3.f84863a, kVar3.f84864b, kVar3.f84865c);
            if (kVar2 == null) {
                kVar = kVar4;
            } else {
                kVar2.f84866d = kVar4;
            }
            kVar2 = kVar4;
        }
        return kVar;
    }

    public static class KeySetView<K, V> extends b implements Set<K>, Serializable, j$.util.Set<K> {
        private static final long serialVersionUID = 7249069246763182397L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Boolean f84843b;

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream parallelStream() {
            return Collection.CC.$default$parallelStream(this);
        }

        @Override // java.util.Collection
        public final /* synthetic */ java.util.stream.Stream parallelStream() {
            return Stream.Wrapper.convert(Collection.CC.$default$parallelStream(this));
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* synthetic */ Spliterator spliterator() {
            return Spliterator.Wrapper.convert(spliterator());
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection
        public final /* synthetic */ java.util.stream.Stream stream() {
            return Stream.Wrapper.convert(Collection.CC.$default$stream(this));
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return toArray((Object[]) intFunction.apply(0));
        }

        public KeySetView(ConcurrentHashMap concurrentHashMap, Boolean bool) {
            super(concurrentHashMap);
            this.f84843b = bool;
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f84853a.containsKey(obj);
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return this.f84853a.remove(obj) != null;
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.f84853a;
            k[] kVarArr = concurrentHashMap.f84837a;
            int length = kVarArr == null ? 0 : kVarArr.length;
            return new h(kVarArr, length, length, concurrentHashMap, 0);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(K k10) {
            Boolean bool = this.f84843b;
            if (bool != null) {
                return this.f84853a.f(k10, bool, true) == null;
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean addAll(java.util.Collection collection) {
            Boolean bool = this.f84843b;
            if (bool == null) {
                throw new UnsupportedOperationException();
            }
            Iterator it = collection.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (this.f84853a.f(it.next(), bool, true) == null) {
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            Object it = iterator();
            int iHashCode = 0;
            while (((a) it).hasNext()) {
                iHashCode += ((h) it).next().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            if (set != this) {
                return containsAll(set) && set.containsAll(this);
            }
            return true;
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Set, j$.util.Collection
        public final j$.util.Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.f84853a;
            long j10 = concurrentHashMap.j();
            k[] kVarArr = concurrentHashMap.f84837a;
            int length = kVarArr == null ? 0 : kVarArr.length;
            return new i(kVarArr, length, 0, length, j10 < 0 ? 0L : j10, 0);
        }

        @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
        public final void forEach(Consumer consumer) {
            consumer.getClass();
            k[] kVarArr = this.f84853a.f84837a;
            if (kVarArr == null) {
                return;
            }
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k kVarA = oVar.a();
                if (kVarA == null) {
                    return;
                } else {
                    consumer.accept(kVarA.f84864b);
                }
            }
        }
    }
}
