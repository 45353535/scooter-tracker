package com.google.common.graph;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class DirectedNetworkConnections<N, E> extends AbstractDirectedNetworkConnections<N, E> {
    DirectedNetworkConnections(Map map, Map map2, int i10) {
        super(map, map2, i10);
    }

    static DirectedNetworkConnections b() {
        return new DirectedNetworkConnections(HashBiMap.create(2), HashBiMap.create(2), 0);
    }

    static DirectedNetworkConnections c(Map map, Map map2, int i10) {
        return new DirectedNetworkConnections(ImmutableBiMap.copyOf(map), ImmutableBiMap.copyOf(map2), i10);
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> edgesConnecting(N n10) {
        return new EdgesConnecting(((BiMap) this.f30554b).inverse(), n10);
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> predecessors() {
        return DesugarCollections.unmodifiableSet(((BiMap) this.f30553a).values());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> successors() {
        return DesugarCollections.unmodifiableSet(((BiMap) this.f30554b).values());
    }
}
