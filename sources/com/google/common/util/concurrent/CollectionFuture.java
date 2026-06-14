package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.AggregateFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
abstract class CollectionFuture<V, C> extends AggregateFuture<V, C> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f31415q;

    static final class ListFuture<V> extends CollectionFuture<V, List<V>> {
        ListFuture(ImmutableCollection immutableCollection, boolean z10) {
            super(immutableCollection, z10);
            S();
        }

        @Override // com.google.common.util.concurrent.CollectionFuture
        public List<V> combine(List<Present<V>> list) {
            ArrayList arrayListNewArrayListWithCapacity = Lists.newArrayListWithCapacity(list.size());
            Iterator<Present<V>> it = list.iterator();
            while (it.hasNext()) {
                Present<V> next = it.next();
                arrayListNewArrayListWithCapacity.add(next != null ? next.f31416a : null);
            }
            return DesugarCollections.unmodifiableList(arrayListNewArrayListWithCapacity);
        }
    }

    private static final class Present<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f31416a;

        Present(Object obj) {
            this.f31416a = obj;
        }
    }

    CollectionFuture(ImmutableCollection immutableCollection, boolean z10) {
        super(immutableCollection, z10, true);
        List listNewArrayListWithCapacity = immutableCollection.isEmpty() ? Collections.EMPTY_LIST : Lists.newArrayListWithCapacity(immutableCollection.size());
        for (int i10 = 0; i10 < immutableCollection.size(); i10++) {
            listNewArrayListWithCapacity.add(null);
        }
        this.f31415q = listNewArrayListWithCapacity;
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    final void N(int i10, Object obj) {
        List list = this.f31415q;
        if (list != null) {
            list.set(i10, new Present(obj));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    final void Q() {
        List list = this.f31415q;
        if (list != null) {
            set(combine(list));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void W(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.W(releaseResourcesReason);
        this.f31415q = null;
    }

    abstract Object combine(List list);
}
