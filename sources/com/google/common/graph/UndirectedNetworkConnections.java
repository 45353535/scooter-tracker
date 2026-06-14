package com.google.common.graph;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class UndirectedNetworkConnections<N, E> extends AbstractUndirectedNetworkConnections<N, E> {
    UndirectedNetworkConnections(Map map) {
        super(map);
    }

    static UndirectedNetworkConnections a() {
        return new UndirectedNetworkConnections(HashBiMap.create(2));
    }

    static UndirectedNetworkConnections b(Map map) {
        return new UndirectedNetworkConnections(ImmutableBiMap.copyOf(map));
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> adjacentNodes() {
        return DesugarCollections.unmodifiableSet(((BiMap) this.f30567a).values());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> edgesConnecting(N n10) {
        return new EdgesConnecting(((BiMap) this.f30567a).inverse(), n10);
    }
}
