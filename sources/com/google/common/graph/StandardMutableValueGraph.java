package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Objects;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class StandardMutableValueGraph<N, V> extends StandardValueGraph<N, V> implements MutableValueGraph<N, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ElementOrder f30644f;

    StandardMutableValueGraph(AbstractGraphBuilder abstractGraphBuilder) {
        super(abstractGraphBuilder);
        this.f30644f = abstractGraphBuilder.f30560d.a();
    }

    private GraphConnections m(Object obj) {
        GraphConnections graphConnectionsN = n();
        Preconditions.checkState(this.f30655d.h(obj, graphConnectionsN) == null);
        return graphConnectionsN;
    }

    private GraphConnections n() {
        return isDirected() ? DirectedGraphConnections.l(this.f30644f) : UndirectedGraphConnections.b(this.f30644f);
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public boolean addNode(N n10) {
        Preconditions.checkNotNull(n10, "node");
        if (j(n10)) {
            return false;
        }
        m(n10);
        return true;
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return this.f30644f;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public V putEdgeValue(N n10, N n11, V v10) {
        Preconditions.checkNotNull(n10, "nodeU");
        Preconditions.checkNotNull(n11, "nodeV");
        Preconditions.checkNotNull(v10, "value");
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!n10.equals(n11), "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n10);
        }
        GraphConnections graphConnectionsM = (GraphConnections) this.f30655d.e(n10);
        if (graphConnectionsM == null) {
            graphConnectionsM = m(n10);
        }
        V v11 = (V) graphConnectionsM.addSuccessor(n11, v10);
        GraphConnections graphConnectionsM2 = (GraphConnections) this.f30655d.e(n11);
        if (graphConnectionsM2 == null) {
            graphConnectionsM2 = m(n11);
        }
        graphConnectionsM2.addPredecessor(n10, v10);
        if (v11 == null) {
            long j10 = this.f30656e + 1;
            this.f30656e = j10;
            Graphs.e(j10);
        }
        return v11;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public V removeEdge(N n10, N n11) {
        Preconditions.checkNotNull(n10, "nodeU");
        Preconditions.checkNotNull(n11, "nodeV");
        GraphConnections graphConnections = (GraphConnections) this.f30655d.e(n10);
        GraphConnections graphConnections2 = (GraphConnections) this.f30655d.e(n11);
        if (graphConnections == null || graphConnections2 == null) {
            return null;
        }
        V v10 = (V) graphConnections.removeSuccessor(n11);
        if (v10 != null) {
            graphConnections2.removePredecessor(n10);
            long j10 = this.f30656e - 1;
            this.f30656e = j10;
            Graphs.c(j10);
        }
        return v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public boolean removeNode(N n10) {
        Preconditions.checkNotNull(n10, "node");
        GraphConnections graphConnections = (GraphConnections) this.f30655d.e(n10);
        if (graphConnections == 0) {
            return false;
        }
        if (allowsSelfLoops() && graphConnections.removeSuccessor(n10) != null) {
            graphConnections.removePredecessor(n10);
            this.f30656e--;
        }
        UnmodifiableIterator it = ImmutableList.copyOf((Collection) graphConnections.successors()).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            GraphConnections graphConnections2 = (GraphConnections) this.f30655d.g(next);
            Objects.requireNonNull(graphConnections2);
            graphConnections2.removePredecessor(n10);
            Objects.requireNonNull(graphConnections.removeSuccessor(next));
            this.f30656e--;
        }
        if (isDirected()) {
            UnmodifiableIterator it2 = ImmutableList.copyOf((Collection) graphConnections.predecessors()).iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                GraphConnections graphConnections3 = (GraphConnections) this.f30655d.g(next2);
                Objects.requireNonNull(graphConnections3);
                Preconditions.checkState(graphConnections3.removeSuccessor(n10) != null);
                graphConnections.removePredecessor(next2);
                this.f30656e--;
            }
        }
        this.f30655d.i(n10);
        Graphs.c(this.f30656e);
        return true;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public V removeEdge(EndpointPair<N> endpointPair) {
        f(endpointPair);
        return removeEdge(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public V putEdgeValue(EndpointPair<N> endpointPair, V v10) {
        f(endpointPair);
        return putEdgeValue(endpointPair.nodeU(), endpointPair.nodeV(), v10);
    }
}
