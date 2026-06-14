package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class EdgesConnecting<E> extends AbstractSet<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f30598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f30599c;

    EdgesConnecting(Map map, Object obj) {
        this.f30598b = (Map) Preconditions.checkNotNull(map);
        this.f30599c = Preconditions.checkNotNull(obj);
    }

    private Object e() {
        return this.f30598b.get(this.f30599c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object objE = e();
        return objE != null && objE.equals(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return e() == null ? 0 : 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public UnmodifiableIterator<E> iterator() {
        Object objE = e();
        return objE == null ? ImmutableSet.of().iterator() : Iterators.singletonIterator(objE);
    }
}
