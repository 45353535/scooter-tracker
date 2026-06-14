package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public final class HashMultiset<E> extends AbstractMapBasedMultiset<E> {
    HashMultiset(int i10) {
        super(i10);
    }

    public static <E> HashMultiset<E> create() {
        return create(3);
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultiset
    ObjectCountHashMap m(int i10) {
        return new ObjectCountHashMap(i10);
    }

    public static <E> HashMultiset<E> create(int i10) {
        return new HashMultiset<>(i10);
    }

    public static <E> HashMultiset<E> create(Iterable<? extends E> iterable) {
        HashMultiset<E> hashMultisetCreate = create(Multisets.g(iterable));
        Iterables.addAll(hashMultisetCreate, iterable);
        return hashMultisetCreate;
    }
}
