package com.google.common.graph;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
abstract class ForwardingValueGraph<N, V> extends AbstractValueGraph<N, V> {
    ForwardingValueGraph() {
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public Set<N> adjacentNodes(N n10) {
        return i().adjacentNodes(n10);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return i().allowsSelfLoops();
    }

    @Override // com.google.common.graph.AbstractBaseGraph
    protected long c() {
        return i().edges().size();
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int degree(N n10) {
        return i().degree(n10);
    }

    @Override // com.google.common.graph.ValueGraph
    public V edgeValueOrDefault(N n10, N n11, V v10) {
        return (V) i().edgeValueOrDefault(n10, n11, v10);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n10, N n11) {
        return i().hasEdgeConnecting(n10, n11);
    }

    abstract ValueGraph i();

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int inDegree(N n10) {
        return i().inDegree(n10);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return i().incidentEdgeOrder();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean isDirected() {
        return i().isDirected();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public ElementOrder<N> nodeOrder() {
        return i().nodeOrder();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public Set<N> nodes() {
        return i().nodes();
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int outDegree(N n10) {
        return i().outDegree(n10);
    }

    @Override // com.google.common.graph.ValueGraph
    public V edgeValueOrDefault(EndpointPair<N> endpointPair, V v10) {
        return (V) i().edgeValueOrDefault(endpointPair, v10);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        return i().hasEdgeConnecting(endpointPair);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    public Set<N> predecessors(N n10) {
        return i().predecessors((Object) n10);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    public Set<N> successors(N n10) {
        return i().successors((Object) n10);
    }
}
