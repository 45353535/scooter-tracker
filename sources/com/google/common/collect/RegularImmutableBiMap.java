package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.RegularImmutableMap;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
final class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final RegularImmutableBiMap f30134l = new RegularImmutableBiMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient Object f30135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final transient Object[] f30136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient int f30137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient int f30138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient RegularImmutableBiMap f30139k;

    private RegularImmutableBiMap() {
        this.f30135g = null;
        this.f30136h = new Object[0];
        this.f30137i = 0;
        this.f30138j = 0;
        this.f30139k = this;
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableSet d() {
        return new RegularImmutableMap.EntrySet(this, this.f30136h, this.f30137i, this.f30138j);
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableSet g() {
        return new RegularImmutableMap.KeySet(this, new RegularImmutableMap.KeysOrValuesAsList(this.f30136h, this.f30137i, this.f30138j));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
        V v10 = (V) RegularImmutableMap.r(this.f30135g, this.f30136h, this.f30138j, this.f30137i, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // com.google.common.collect.ImmutableMap
    boolean k() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f30138j;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.ImmutableMap
    @J2ktIncompatible
    @GwtIncompatible
    Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.BiMap
    public ImmutableBiMap<V, K> inverse() {
        return this.f30139k;
    }

    RegularImmutableBiMap(Object[] objArr, int i10) {
        this.f30136h = objArr;
        this.f30138j = i10;
        this.f30137i = 0;
        int iM = i10 >= 2 ? ImmutableSet.m(i10) : 0;
        this.f30135g = RegularImmutableMap.q(objArr, i10, iM, 0);
        this.f30139k = new RegularImmutableBiMap(RegularImmutableMap.q(objArr, i10, iM, 1), objArr, i10, this);
    }

    private RegularImmutableBiMap(Object obj, Object[] objArr, int i10, RegularImmutableBiMap regularImmutableBiMap) {
        this.f30135g = obj;
        this.f30136h = objArr;
        this.f30137i = 1;
        this.f30138j = i10;
        this.f30139k = regularImmutableBiMap;
    }
}
