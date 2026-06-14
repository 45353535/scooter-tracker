package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public final class LinkedHashMultiset<E> extends AbstractMapBasedMultiset<E> {
    LinkedHashMultiset(int i10) {
        super(i10);
    }

    public static <E> LinkedHashMultiset<E> create() {
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
        return new ObjectCountLinkedHashMap(i10);
    }

    public static <E> LinkedHashMultiset<E> create(int i10) {
        return new LinkedHashMultiset<>(i10);
    }

    public static <E> LinkedHashMultiset<E> create(Iterable<? extends E> iterable) {
        LinkedHashMultiset<E> linkedHashMultisetCreate = create(Multisets.g(iterable));
        Iterables.addAll(linkedHashMultisetCreate, iterable);
        return linkedHashMultisetCreate;
    }
}
