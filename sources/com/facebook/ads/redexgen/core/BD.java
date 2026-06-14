package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class BD<K, V> implements InterfaceC3460oE<K, V> {

    @CheckForNull
    @LazyInit
    public transient Collection<V> A00;

    @CheckForNull
    @LazyInit
    public transient Map<K, Collection<V>> A01;

    @CheckForNull
    @LazyInit
    public transient Set<K> A02;

    public abstract Map<K, Collection<V>> A00();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public Set<K> A01() {
        Set<K> set = this.A02;
        if (set != null) {
            return set;
        }
        Set<K> setA02 = A02();
        this.A02 = setA02;
        return setA02;
    }

    public abstract Set<K> A02();

    public abstract Collection<V> A0B();

    public abstract Iterator<V> A0C();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC3460oE
    public Map<K, Collection<V>> A49() {
        Map<K, Collection<V>> map = this.A01;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapA00 = A00();
        this.A01 = mapA00;
        return mapA00;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC3460oE
    public Collection<V> values() {
        Collection<V> collection = this.A00;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionA0B = A0B();
        this.A00 = collectionA0B;
        return collectionA0B;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BD != com.google.common.collect.AbstractMultimap<K, V> */
    public boolean A03(@CheckForNull Object value) {
        Iterator<Collection<V>> it = A49().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(value)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BD != com.google.common.collect.AbstractMultimap<K, V> */
    public boolean equals(@CheckForNull Object object) {
        return AbstractC3465oJ.A01(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BD != com.google.common.collect.AbstractMultimap<K, V> */
    public int hashCode() {
        return A49().hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BD != com.google.common.collect.AbstractMultimap<K, V> */
    public String toString() {
        return A49().toString();
    }
}
