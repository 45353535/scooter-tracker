package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multiset;
import j$.util.DesugarCollections;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class UndirectedMultiNetworkConnections<N, E> extends AbstractUndirectedNetworkConnections<N, E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Reference f30679b;

    private UndirectedMultiNetworkConnections(Map map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Multiset b() {
        Multiset multiset = (Multiset) c(this.f30679b);
        if (multiset != null) {
            return multiset;
        }
        HashMultiset hashMultisetCreate = HashMultiset.create(this.f30567a.values());
        this.f30679b = new SoftReference(hashMultisetCreate);
        return hashMultisetCreate;
    }

    private static Object c(Reference reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    static UndirectedMultiNetworkConnections d() {
        return new UndirectedMultiNetworkConnections(new HashMap(2, 1.0f));
    }

    static UndirectedMultiNetworkConnections e(Map map) {
        return new UndirectedMultiNetworkConnections(ImmutableMap.copyOf(map));
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addInEdge(E e10, N n10, boolean z10) {
        if (z10) {
            return;
        }
        addOutEdge(e10, n10);
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addOutEdge(E e10, N n10) {
        super.addOutEdge(e10, n10);
        Multiset multiset = (Multiset) c(this.f30679b);
        if (multiset != null) {
            Preconditions.checkState(multiset.add(n10));
        }
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> adjacentNodes() {
        return DesugarCollections.unmodifiableSet(b().elementSet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> edgesConnecting(final N n10) {
        return new MultiEdgesConnecting<E>(this, this.f30567a, n10) { // from class: com.google.common.graph.UndirectedMultiNetworkConnections.1

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ UndirectedMultiNetworkConnections f30681e;

            {
                this.f30681e = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f30681e.b().count(n10);
            }
        };
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeInEdge(E e10, boolean z10) {
        if (z10) {
            return null;
        }
        return removeOutEdge(e10);
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e10) {
        N n10 = (N) super.removeOutEdge(e10);
        Multiset multiset = (Multiset) c(this.f30679b);
        if (multiset != null) {
            Preconditions.checkState(multiset.remove(n10));
        }
        return n10;
    }
}
