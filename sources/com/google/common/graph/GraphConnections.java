package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
interface GraphConnections<N, V> {
    void addPredecessor(N n10, V v10);

    @CanIgnoreReturnValue
    V addSuccessor(N n10, V v10);

    Set<N> adjacentNodes();

    Iterator<EndpointPair<N>> incidentEdgeIterator(N n10);

    Set<N> predecessors();

    void removePredecessor(N n10);

    @CanIgnoreReturnValue
    V removeSuccessor(N n10);

    Set<N> successors();

    V value(N n10);
}
