package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import j$.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
class StandardNetwork<N, E> extends AbstractNetwork<N, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f30645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f30646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ElementOrder f30648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ElementOrder f30649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final MapIteratorCache f30650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final MapIteratorCache f30651g;

    StandardNetwork(NetworkBuilder networkBuilder) {
        this(networkBuilder, networkBuilder.f30559c.b(((Integer) networkBuilder.f30561e.or(10)).intValue()), networkBuilder.f30641g.b(((Integer) networkBuilder.f30642h.or(20)).intValue()));
    }

    @Override // com.google.common.graph.Network
    public Set<N> adjacentNodes(N n10) {
        return k(n(n10).adjacentNodes(), n10);
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
        return this.f30646b;
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
        return this.f30647c;
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<E> edgeOrder() {
        return this.f30649e;
    }

    @Override // com.google.common.graph.Network
    public Set<E> edges() {
        return this.f30651g.j();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> edgesConnecting(N n10, N n11) {
        NetworkConnections networkConnectionsN = n(n10);
        if (!this.f30647c && n10 == n11) {
            return ImmutableSet.of();
        }
        Preconditions.checkArgument(q(n11), "Node %s is not an element of this graph.", n11);
        return l(networkConnectionsN.edgesConnecting(n11), n10, n11);
    }

    @Override // com.google.common.graph.Network
    public Set<E> inEdges(N n10) {
        return k(n(n10).inEdges(), n10);
    }

    @Override // com.google.common.graph.Network
    public Set<E> incidentEdges(N n10) {
        return k(n(n10).incidentEdges(), n10);
    }

    @Override // com.google.common.graph.Network
    public EndpointPair<N> incidentNodes(E e10) {
        Object objO = o(e10);
        NetworkConnections networkConnections = (NetworkConnections) this.f30650f.e(objO);
        Objects.requireNonNull(networkConnections);
        return EndpointPair.b(this, objO, networkConnections.adjacentNode(e10));
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
        return this.f30645a;
    }

    final NetworkConnections n(Object obj) {
        NetworkConnections networkConnections = (NetworkConnections) this.f30650f.e(obj);
        if (networkConnections != null) {
            return networkConnections;
        }
        Preconditions.checkNotNull(obj);
        throw new IllegalArgumentException(String.format("Node %s is not an element of this graph.", obj));
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<N> nodeOrder() {
        return this.f30648d;
    }

    @Override // com.google.common.graph.Network
    public Set<N> nodes() {
        return this.f30650f.j();
    }

    final Object o(Object obj) {
        Object objE = this.f30651g.e(obj);
        if (objE != null) {
            return objE;
        }
        Preconditions.checkNotNull(obj);
        throw new IllegalArgumentException(String.format("Edge %s is not an element of this graph.", obj));
    }

    @Override // com.google.common.graph.Network
    public Set<E> outEdges(N n10) {
        return k(n(n10).outEdges(), n10);
    }

    final boolean p(Object obj) {
        return this.f30651g.d(obj);
    }

    final boolean q(Object obj) {
        return this.f30650f.d(obj);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public Set<N> predecessors(N n10) {
        return k(n(n10).predecessors(), n10);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public Set<N> successors(N n10) {
        return k(n(n10).successors(), n10);
    }

    StandardNetwork(NetworkBuilder networkBuilder, Map map, Map map2) {
        MapIteratorCache mapIteratorCache;
        this.f30645a = networkBuilder.f30557a;
        this.f30646b = networkBuilder.f30640f;
        this.f30647c = networkBuilder.f30558b;
        this.f30648d = networkBuilder.f30559c.a();
        this.f30649e = networkBuilder.f30641g.a();
        if (map instanceof TreeMap) {
            mapIteratorCache = new MapRetrievalCache(map);
        } else {
            mapIteratorCache = new MapIteratorCache(map);
        }
        this.f30650f = mapIteratorCache;
        this.f30651g = new MapIteratorCache(map2);
    }
}
