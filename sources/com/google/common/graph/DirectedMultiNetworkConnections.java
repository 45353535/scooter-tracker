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
final class DirectedMultiNetworkConnections<N, E> extends AbstractDirectedNetworkConnections<N, E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Reference f30594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient Reference f30595e;

    private DirectedMultiNetworkConnections(Map map, Map map2, int i10) {
        super(map, map2, i10);
    }

    private static Object c(Reference reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    static DirectedMultiNetworkConnections d() {
        return new DirectedMultiNetworkConnections(new HashMap(2, 1.0f), new HashMap(2, 1.0f), 0);
    }

    static DirectedMultiNetworkConnections e(Map map, Map map2, int i10) {
        return new DirectedMultiNetworkConnections(ImmutableMap.copyOf(map), ImmutableMap.copyOf(map2), i10);
    }

    private Multiset f() {
        Multiset multiset = (Multiset) c(this.f30594d);
        if (multiset != null) {
            return multiset;
        }
        HashMultiset hashMultisetCreate = HashMultiset.create(this.f30553a.values());
        this.f30594d = new SoftReference(hashMultisetCreate);
        return hashMultisetCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Multiset g() {
        Multiset multiset = (Multiset) c(this.f30595e);
        if (multiset != null) {
            return multiset;
        }
        HashMultiset hashMultisetCreate = HashMultiset.create(this.f30554b.values());
        this.f30595e = new SoftReference(hashMultisetCreate);
        return hashMultisetCreate;
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addInEdge(E e10, N n10, boolean z10) {
        super.addInEdge(e10, n10, z10);
        Multiset multiset = (Multiset) c(this.f30594d);
        if (multiset != null) {
            Preconditions.checkState(multiset.add(n10));
        }
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addOutEdge(E e10, N n10) {
        super.addOutEdge(e10, n10);
        Multiset multiset = (Multiset) c(this.f30595e);
        if (multiset != null) {
            Preconditions.checkState(multiset.add(n10));
        }
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> edgesConnecting(final N n10) {
        return new MultiEdgesConnecting<E>(this, this.f30554b, n10) { // from class: com.google.common.graph.DirectedMultiNetworkConnections.1

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ DirectedMultiNetworkConnections f30597e;

            {
                this.f30597e = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f30597e.g().count(n10);
            }
        };
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> predecessors() {
        return DesugarCollections.unmodifiableSet(f().elementSet());
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeInEdge(E e10, boolean z10) {
        N n10 = (N) super.removeInEdge(e10, z10);
        Multiset multiset = (Multiset) c(this.f30594d);
        if (multiset != null) {
            Preconditions.checkState(multiset.remove(n10));
        }
        return n10;
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e10) {
        N n10 = (N) super.removeOutEdge(e10);
        Multiset multiset = (Multiset) c(this.f30595e);
        if (multiset != null) {
            Preconditions.checkState(multiset.remove(n10));
        }
        return n10;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> successors() {
        return DesugarCollections.unmodifiableSet(g().elementSet());
    }
}
