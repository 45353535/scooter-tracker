package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Objects;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class StandardMutableNetwork<N, E> extends StandardNetwork<N, E> implements MutableNetwork<N, E> {
    StandardMutableNetwork(NetworkBuilder networkBuilder) {
        super(networkBuilder);
    }

    private NetworkConnections r(Object obj) {
        NetworkConnections networkConnectionsS = s();
        Preconditions.checkState(this.f30650f.h(obj, networkConnectionsS) == null);
        return networkConnectionsS;
    }

    private NetworkConnections s() {
        return isDirected() ? allowsParallelEdges() ? DirectedMultiNetworkConnections.d() : DirectedNetworkConnections.b() : allowsParallelEdges() ? UndirectedMultiNetworkConnections.d() : UndirectedNetworkConnections.a();
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addEdge(N n10, N n11, E e10) {
        Preconditions.checkNotNull(n10, "nodeU");
        Preconditions.checkNotNull(n11, "nodeV");
        Preconditions.checkNotNull(e10, "edge");
        if (p(e10)) {
            EndpointPair<N> endpointPairIncidentNodes = incidentNodes(e10);
            EndpointPair endpointPairB = EndpointPair.b(this, n10, n11);
            Preconditions.checkArgument(endpointPairIncidentNodes.equals(endpointPairB), "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.", e10, endpointPairIncidentNodes, endpointPairB);
            return false;
        }
        NetworkConnections networkConnectionsR = (NetworkConnections) this.f30650f.e(n10);
        if (!allowsParallelEdges()) {
            Preconditions.checkArgument(networkConnectionsR == null || !networkConnectionsR.successors().contains(n11), "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.", n10, n11);
        }
        boolean zEquals = n10.equals(n11);
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!zEquals, "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n10);
        }
        if (networkConnectionsR == null) {
            networkConnectionsR = r(n10);
        }
        networkConnectionsR.addOutEdge(e10, n11);
        NetworkConnections networkConnectionsR2 = (NetworkConnections) this.f30650f.e(n11);
        if (networkConnectionsR2 == null) {
            networkConnectionsR2 = r(n11);
        }
        networkConnectionsR2.addInEdge(e10, n10, zEquals);
        this.f30651g.h(e10, n10);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addNode(N n10) {
        Preconditions.checkNotNull(n10, "node");
        if (q(n10)) {
            return false;
        }
        r(n10);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean removeEdge(E e10) {
        Preconditions.checkNotNull(e10, "edge");
        Object objE = this.f30651g.e(e10);
        boolean z10 = false;
        if (objE == null) {
            return false;
        }
        NetworkConnections networkConnections = (NetworkConnections) this.f30650f.e(objE);
        Objects.requireNonNull(networkConnections);
        NetworkConnections networkConnections2 = networkConnections;
        Object objAdjacentNode = networkConnections2.adjacentNode(e10);
        NetworkConnections networkConnections3 = (NetworkConnections) this.f30650f.e(objAdjacentNode);
        Objects.requireNonNull(networkConnections3);
        NetworkConnections networkConnections4 = networkConnections3;
        networkConnections2.removeOutEdge(e10);
        if (allowsSelfLoops() && objE.equals(objAdjacentNode)) {
            z10 = true;
        }
        networkConnections4.removeInEdge(e10, z10);
        this.f30651g.i(e10);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean removeNode(N n10) {
        Preconditions.checkNotNull(n10, "node");
        NetworkConnections networkConnections = (NetworkConnections) this.f30650f.e(n10);
        if (networkConnections == null) {
            return false;
        }
        UnmodifiableIterator<E> it = ImmutableList.copyOf((Collection) networkConnections.incidentEdges()).iterator();
        while (it.hasNext()) {
            removeEdge(it.next());
        }
        this.f30650f.i(n10);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addEdge(EndpointPair<N> endpointPair, E e10) {
        m(endpointPair);
        return addEdge(endpointPair.nodeU(), endpointPair.nodeV(), e10);
    }
}
