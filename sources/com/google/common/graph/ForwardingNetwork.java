package com.google.common.graph;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
abstract class ForwardingNetwork<N, E> extends AbstractNetwork<N, E> {
    ForwardingNetwork() {
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> adjacentEdges(E e10) {
        return n().adjacentEdges(e10);
    }

    @Override // com.google.common.graph.Network
    public Set<N> adjacentNodes(N n10) {
        return n().adjacentNodes(n10);
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
        return n().allowsParallelEdges();
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
        return n().allowsSelfLoops();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int degree(N n10) {
        return n().degree(n10);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public E edgeConnectingOrNull(N n10, N n11) {
        return (E) n().edgeConnectingOrNull(n10, n11);
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<E> edgeOrder() {
        return n().edgeOrder();
    }

    @Override // com.google.common.graph.Network
    public Set<E> edges() {
        return n().edges();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> edgesConnecting(N n10, N n11) {
        return n().edgesConnecting(n10, n11);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public boolean hasEdgeConnecting(N n10, N n11) {
        return n().hasEdgeConnecting(n10, n11);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int inDegree(N n10) {
        return n().inDegree(n10);
    }

    @Override // com.google.common.graph.Network
    public Set<E> inEdges(N n10) {
        return n().inEdges(n10);
    }

    @Override // com.google.common.graph.Network
    public Set<E> incidentEdges(N n10) {
        return n().incidentEdges(n10);
    }

    @Override // com.google.common.graph.Network
    public EndpointPair<N> incidentNodes(E e10) {
        return n().incidentNodes(e10);
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
        return n().isDirected();
    }

    abstract Network n();

    @Override // com.google.common.graph.Network
    public ElementOrder<N> nodeOrder() {
        return n().nodeOrder();
    }

    @Override // com.google.common.graph.Network
    public Set<N> nodes() {
        return n().nodes();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int outDegree(N n10) {
        return n().outDegree(n10);
    }

    @Override // com.google.common.graph.Network
    public Set<E> outEdges(N n10) {
        return n().outEdges(n10);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public E edgeConnectingOrNull(EndpointPair<N> endpointPair) {
        return (E) n().edgeConnectingOrNull(endpointPair);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> edgesConnecting(EndpointPair<N> endpointPair) {
        return n().edgesConnecting(endpointPair);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        return n().hasEdgeConnecting(endpointPair);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public Set<N> predecessors(N n10) {
        return n().predecessors((Object) n10);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public Set<N> successors(N n10) {
        return n().successors((Object) n10);
    }
}
