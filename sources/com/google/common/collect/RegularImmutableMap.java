package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final ImmutableMap f30143j = new RegularImmutableMap(null, new Object[0], 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient Object f30144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final transient Object[] f30145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient int f30146i;

    static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient ImmutableMap f30147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient Object[] f30148e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final transient int f30149f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final transient int f30150g;

        EntrySet(ImmutableMap immutableMap, Object[] objArr, int i10, int i11) {
            this.f30147d = immutableMap;
            this.f30148e = objArr;
            this.f30149f = i10;
            this.f30150g = i11;
        }

        @Override // com.google.common.collect.ImmutableCollection
        int a(Object[] objArr, int i10) {
            return asList().a(objArr, i10);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f30147d.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet
        ImmutableList o() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // com.google.common.collect.ImmutableCollection
                public boolean isPartialView() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return EntrySet.this.f30150g;
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                @J2ktIncompatible
                Object writeReplace() {
                    return super.writeReplace();
                }

                @Override // java.util.List
                public Map.Entry<K, V> get(int i10) {
                    Preconditions.checkElementIndex(i10, EntrySet.this.f30150g);
                    int i11 = i10 * 2;
                    Object obj = EntrySet.this.f30148e[EntrySet.this.f30149f + i11];
                    Objects.requireNonNull(obj);
                    Object obj2 = EntrySet.this.f30148e[i11 + (EntrySet.this.f30149f ^ 1)];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f30150g;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    static final class KeySet<K> extends ImmutableSet<K> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient ImmutableMap f30152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient ImmutableList f30153e;

        KeySet(ImmutableMap immutableMap, ImmutableList immutableList) {
            this.f30152d = immutableMap;
            this.f30153e = immutableList;
        }

        @Override // com.google.common.collect.ImmutableCollection
        int a(Object[] objArr, int i10) {
            return asList().a(objArr, i10);
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public ImmutableList<K> asList() {
            return this.f30153e;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f30152d.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f30152d.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<K> iterator() {
            return asList().iterator();
        }
    }

    static final class KeysOrValuesAsList extends ImmutableList<Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient Object[] f30154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f30155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final transient int f30156f;

        KeysOrValuesAsList(Object[] objArr, int i10, int i11) {
            this.f30154d = objArr;
            this.f30155e = i10;
            this.f30156f = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            Preconditions.checkElementIndex(i10, this.f30156f);
            Object obj = this.f30154d[(i10 * 2) + this.f30155e];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f30156f;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private RegularImmutableMap(Object obj, Object[] objArr, int i10) {
        this.f30144g = obj;
        this.f30145h = objArr;
        this.f30146i = i10;
    }

    static RegularImmutableMap m(int i10, Object[] objArr) {
        return n(i10, objArr, null);
    }

    static RegularImmutableMap n(int i10, Object[] objArr, ImmutableMap.Builder builder) {
        if (i10 == 0) {
            return (RegularImmutableMap) f30143j;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            CollectPreconditions.a(obj, obj2);
            return new RegularImmutableMap(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i10, objArr.length >> 1);
        Object objO = o(objArr, i10, ImmutableSet.m(i10), 0);
        if (objO instanceof Object[]) {
            Object[] objArr2 = (Object[]) objO;
            ImmutableMap.Builder.DuplicateKey duplicateKey = (ImmutableMap.Builder.DuplicateKey) objArr2[2];
            if (builder == null) {
                throw duplicateKey.a();
            }
            builder.f29580e = duplicateKey;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objO = obj3;
            i10 = iIntValue;
        }
        return new RegularImmutableMap(objO, objArr, i10);
    }

    private static Object o(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        ImmutableMap.Builder.DuplicateKey duplicateKey = null;
        int i14 = 1;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            CollectPreconditions.a(obj, obj2);
            return null;
        }
        int i15 = i11 - 1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                int i18 = (i17 * 2) + i12;
                int i19 = (i16 * 2) + i12;
                Object obj3 = objArr[i18];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i18 ^ 1];
                Objects.requireNonNull(obj4);
                CollectPreconditions.a(obj3, obj4);
                int iC = Hashing.c(obj3.hashCode());
                while (true) {
                    int i20 = iC & i15;
                    int i21 = bArr[i20] & 255;
                    if (i21 == 255) {
                        bArr[i20] = (byte) i19;
                        if (i16 < i17) {
                            objArr[i19] = obj3;
                            objArr[i19 ^ 1] = obj4;
                        }
                        i16++;
                    } else {
                        if (obj3.equals(objArr[i21])) {
                            int i22 = i21 ^ 1;
                            Object obj5 = objArr[i22];
                            Objects.requireNonNull(obj5);
                            duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj3, obj4, obj5);
                            objArr[i22] = obj4;
                            break;
                        }
                        iC = i20 + 1;
                    }
                }
            }
            return i16 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i16), duplicateKey};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i23 = 0;
            for (int i24 = 0; i24 < i10; i24++) {
                int i25 = (i24 * 2) + i12;
                int i26 = (i23 * 2) + i12;
                Object obj6 = objArr[i25];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i25 ^ 1];
                Objects.requireNonNull(obj7);
                CollectPreconditions.a(obj6, obj7);
                int iC2 = Hashing.c(obj6.hashCode());
                while (true) {
                    int i27 = iC2 & i15;
                    int i28 = sArr[i27] & 65535;
                    if (i28 == 65535) {
                        sArr[i27] = (short) i26;
                        if (i23 < i24) {
                            objArr[i26] = obj6;
                            objArr[i26 ^ 1] = obj7;
                        }
                        i23++;
                    } else {
                        if (obj6.equals(objArr[i28])) {
                            int i29 = i28 ^ 1;
                            Object obj8 = objArr[i29];
                            Objects.requireNonNull(obj8);
                            duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj6, obj7, obj8);
                            objArr[i29] = obj7;
                            break;
                        }
                        iC2 = i27 + 1;
                    }
                }
            }
            return i23 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i23), duplicateKey};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i30 = 0;
        int i31 = 0;
        while (i30 < i10) {
            int i32 = (i30 * 2) + i12;
            int i33 = (i31 * 2) + i12;
            Object obj9 = objArr[i32];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i32 ^ i14];
            Objects.requireNonNull(obj10);
            CollectPreconditions.a(obj9, obj10);
            int iC3 = Hashing.c(obj9.hashCode());
            while (true) {
                int i34 = iC3 & i15;
                int i35 = iArr[i34];
                if (i35 == -1) {
                    iArr[i34] = i33;
                    if (i31 < i30) {
                        objArr[i33] = obj9;
                        objArr[i33 ^ 1] = obj10;
                    }
                    i31++;
                    i13 = i14;
                } else {
                    i13 = i14;
                    if (obj9.equals(objArr[i35])) {
                        int i36 = i35 ^ 1;
                        Object obj11 = objArr[i36];
                        Objects.requireNonNull(obj11);
                        duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj9, obj10, obj11);
                        objArr[i36] = obj10;
                        break;
                    }
                    iC3 = i34 + 1;
                    i14 = i13;
                }
            }
            i30++;
            i14 = i13;
        }
        int i37 = i14;
        if (i31 == i10) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i37] = Integer.valueOf(i31);
        objArr2[2] = duplicateKey;
        return objArr2;
    }

    static Object q(Object[] objArr, int i10, int i11, int i12) {
        Object objO = o(objArr, i10, i11, i12);
        if (objO instanceof Object[]) {
            throw ((ImmutableMap.Builder.DuplicateKey) ((Object[]) objO)[2]).a();
        }
        return objO;
    }

    static Object r(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iC = Hashing.c(obj2.hashCode());
            while (true) {
                int i12 = iC & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iC = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iC2 = Hashing.c(obj2.hashCode());
            while (true) {
                int i14 = iC2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iC2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iC3 = Hashing.c(obj2.hashCode());
            while (true) {
                int i16 = iC3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iC3 = i16 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableSet d() {
        return new EntrySet(this, this.f30145h, 0, this.f30146i);
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableSet g() {
        return new KeySet(this, new KeysOrValuesAsList(this.f30145h, 0, this.f30146i));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
        V v10 = (V) r(this.f30144g, this.f30145h, this.f30146i, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableCollection h() {
        return new KeysOrValuesAsList(this.f30145h, 1, this.f30146i);
    }

    @Override // com.google.common.collect.ImmutableMap
    boolean k() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f30146i;
    }

    @Override // com.google.common.collect.ImmutableMap
    @J2ktIncompatible
    @GwtIncompatible
    Object writeReplace() {
        return super.writeReplace();
    }
}
