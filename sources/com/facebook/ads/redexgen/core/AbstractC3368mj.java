package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@DoNotMock("Use ImmutableMap.of or another implementation")
@ElementTypesAreNonnullByDefault
public abstract class AbstractC3368mj<K, V> implements Map<K, V>, Serializable {
    public static byte[] A03 = null;
    public static String[] A04 = {"vKCQqMCBbbLRNayk93g", "pkt0IymnSuuTvT2UABZ", "PNc8ARlkPwYFJqJCIOuFP53ZqzL63Ot9", "eX2I8z36J32Go", "gIGV4Wf8BZM4VYT7BzYv5KONe75pspBB", "tYe4jTWn6nAHNSv3aqiqFSpTtkmDAUnf", "8sr0nS9u8yYglBLPy9xKZ", "QmruhXeOtXDmPURP7V7IzoRRfHSq4IXC"};
    public static final Map.Entry<?, ?>[] A05;
    public static final long serialVersionUID = 912559;

    @CheckForNull
    @LazyInit
    public transient AbstractC3359ma<V> A00;

    @CheckForNull
    @LazyInit
    public transient AbstractC1963Al<Map.Entry<K, V>> A01;

    @CheckForNull
    @LazyInit
    public transient AbstractC1963Al<K> A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <K, V> AbstractC3368mj<K, V> A05(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        C3366mh c3366mh = new C3366mh(entries instanceof Collection ? ((Collection) entries).size() : 4);
        c3366mh.A04(entries);
        return c3366mh.A07();
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A03 = new byte[]{103, -123, 119, 50, 101, 119, -124, 123, 115, 126, 123, -116, 119, 118, 88, -127, -124, Ascii.DEL};
    }

    public abstract AbstractC3359ma<V> A0A();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.Map
    /* JADX INFO: renamed from: A0B, reason: merged with bridge method [inline-methods] */
    public AbstractC1963Al<Map.Entry<K, V>> entrySet() {
        AbstractC1963Al<Map.Entry<K, V>> abstractC1963Al = this.A01;
        if (abstractC1963Al != null) {
            return abstractC1963Al;
        }
        AbstractC1963Al<Map.Entry<K, V>> abstractC1963AlA0D = A0D();
        this.A01 = abstractC1963AlA0D;
        return abstractC1963AlA0D;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.Map
    /* JADX INFO: renamed from: A0C, reason: merged with bridge method [inline-methods] */
    public AbstractC1963Al<K> keySet() {
        AbstractC1963Al<K> abstractC1963Al = this.A02;
        if (abstractC1963Al != null) {
            return abstractC1963Al;
        }
        AbstractC1963Al<K> abstractC1963AlA0E = A0E();
        this.A02 = abstractC1963AlA0E;
        return abstractC1963AlA0E;
    }

    public abstract AbstractC1963Al<Map.Entry<K, V>> A0D();

    public abstract AbstractC1963Al<K> A0E();

    public abstract boolean A0F();

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object key);

    static {
        A08();
        A05 = new Map.Entry[0];
    }

    public static <K, V> C3366mh<K, V> A03() {
        return new C3366mh<>();
    }

    public static <K, V> AbstractC3368mj<K, V> A04() {
        AbstractC3368mj<K, V> abstractC3368mj = (AbstractC3368mj<K, V>) AL.A04;
        if (A04[4].charAt(3) != 'V') {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[0] = "QWSx7KQEMPZzsm7sYqB";
        strArr[1] = "rV1plHJifYQu2yuYFjd";
        return abstractC3368mj;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mj != com.google.common.collect.ImmutableMap<K, V> */
    public static <K, V> AbstractC3368mj<K, V> A06(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC3368mj) && !(map instanceof SortedMap)) {
            AbstractC3368mj<K, V> abstractC3368mj = (AbstractC3368mj) map;
            if (!abstractC3368mj.A0F()) {
                return abstractC3368mj;
            }
        }
        return A05(map.entrySet());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ma != com.google.common.collect.ImmutableCollection<V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mj != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    /* JADX INFO: renamed from: A09, reason: merged with bridge method [inline-methods] */
    public AbstractC3359ma<V> values() {
        AbstractC3359ma<V> abstractC3359maA0A = this.A00;
        if (abstractC3359maA0A == null) {
            abstractC3359maA0A = A0A();
            if (A04[3].length() == 23) {
                throw new RuntimeException();
            }
            A04[6] = "23ujWmcydF5ICCpn56C";
            this.A00 = abstractC3359maA0A;
        }
        return abstractC3359maA0A;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mj != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mj != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object key) {
        return get(key) != null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mj != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object value) {
        return values().contains(value);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mj != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public boolean equals(@CheckForNull Object object) {
        return AbstractC3445nz.A0B(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mj != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object key, @CheckForNull V defaultValue) {
        V result = get(key);
        if (result != null) {
            return result;
        }
        return defaultValue;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mj != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public int hashCode() {
        return AbstractC3500ou.A00(entrySet());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mj != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mj != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mj != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mj != com.google.common.collect.ImmutableMap<K, V> */
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException(A07(0, 18, 8));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mj != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object o10) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mj != com.google.common.collect.ImmutableMap<K, V> */
    public final String toString() {
        return AbstractC3445nz.A08(this);
    }
}
