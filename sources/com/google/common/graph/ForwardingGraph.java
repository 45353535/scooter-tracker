package com.google.common.graph;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
abstract class ForwardingGraph<N> extends AbstractGraph<N> {
    ForwardingGraph() {
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public Set<N> adjacentNodes(N n10) {
        return g().adjacentNodes(n10);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return g().allowsSelfLoops();
    }

    @Override // com.google.common.graph.AbstractBaseGraph
    protected long c() {
        return g().edges().size();
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int degree(N n10) {
        return g().degree(n10);
    }

    abstract BaseGraph g();

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n10, N n11) {
        return g().hasEdgeConnecting(n10, n11);
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int inDegree(N n10) {
        return g().inDegree(n10);
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return g().incidentEdgeOrder();
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> incidentEdges(N n10) {
        return g().incidentEdges(n10);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean isDirected() {
        return g().isDirected();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public ElementOrder<N> nodeOrder() {
        return g().nodeOrder();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public Set<N> nodes() {
        return g().nodes();
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int outDegree(N n10) {
        return g().outDegree(n10);
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        return g().hasEdgeConnecting(endpointPair);
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    public Set<N> predecessors(N n10) {
        return g().predecessors((Object) n10);
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    public Set<N> successors(N n10) {
        return g().successors((Object) n10);
    }
}
