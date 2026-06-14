package com.facebook.ads.redexgen.core;

import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ny, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC3444ny<K, V> extends AbstractMap<K, V> {

    @CheckForNull
    @LazyInit
    public transient Collection<V> A00;

    @CheckForNull
    @LazyInit
    public transient Set<Map.Entry<K, V>> A01;

    public abstract Set<Map.Entry<K, V>> A09();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.A01;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setA09 = A09();
        this.A01 = setA09;
        return setA09;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.A00;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionA00 = A00();
        this.A00 = collectionA00;
        return collectionA00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ny != com.google.common.collect.Maps$ViewCachingAbstractMap<K, V> */
    public Collection<V> A00() {
        return new C3443nx(this);
    }
}
