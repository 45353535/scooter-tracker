package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
class StandardValueGraph<N, V> extends AbstractValueGraph<N, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f30652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f30653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ElementOrder f30654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final MapIteratorCache f30655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f30656e;

    StandardValueGraph(AbstractGraphBuilder abstractGraphBuilder) {
        this(abstractGraphBuilder, abstractGraphBuilder.f30559c.b(((Integer) abstractGraphBuilder.f30561e.or(10)).intValue()), 0L);
    }

    private final GraphConnections i(Object obj) {
        GraphConnections graphConnections = (GraphConnections) this.f30655d.e(obj);
        if (graphConnections != null) {
            return graphConnections;
        }
        Preconditions.checkNotNull(obj);
        throw new IllegalArgumentException("Node " + obj + " is not an element of this graph.");
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        GraphConnections graphConnections = (GraphConnections) this.f30655d.e(obj);
        Object objValue = graphConnections == null ? null : graphConnections.value(obj2);
        return objValue == null ? obj3 : objValue;
    }

    private final boolean l(Object obj, Object obj2) {
        GraphConnections graphConnections = (GraphConnections) this.f30655d.e(obj);
        return graphConnections != null && graphConnections.successors().contains(obj2);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public Set<N> adjacentNodes(N n10) {
        return e(i(n10).adjacentNodes(), n10);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return this.f30653b;
    }

    @Override // com.google.common.graph.AbstractBaseGraph
    protected long c() {
        return this.f30656e;
    }

    public V edgeValueOrDefault(N n10, N n11, V v10) {
        return (V) k(Preconditions.checkNotNull(n10), Preconditions.checkNotNull(n11), v10);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n10, N n11) {
        return l(Preconditions.checkNotNull(n10), Preconditions.checkNotNull(n11));
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> incidentEdges(N n10) {
        final GraphConnections graphConnectionsI = i(n10);
        return e(new IncidentEdgeSet<N>(this, this, n10) { // from class: com.google.common.graph.StandardValueGraph.1

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ StandardValueGraph f30658e;

            {
                this.f30658e = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<EndpointPair<N>> iterator() {
                return graphConnectionsI.incidentEdgeIterator(this.f30622b);
            }
        }, n10);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean isDirected() {
        return this.f30652a;
    }

    final boolean j(Object obj) {
        return this.f30655d.d(obj);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public ElementOrder<N> nodeOrder() {
        return this.f30654c;
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public Set<N> nodes() {
        return this.f30655d.j();
    }

    public V edgeValueOrDefault(EndpointPair<N> endpointPair, V v10) {
        f(endpointPair);
        return (V) k(endpointPair.nodeU(), endpointPair.nodeV(), v10);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        return d(endpointPair) && l(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    public Set<N> predecessors(N n10) {
        return e(i(n10).predecessors(), n10);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    public Set<N> successors(N n10) {
        return e(i(n10).successors(), n10);
    }

    StandardValueGraph(AbstractGraphBuilder abstractGraphBuilder, Map map, long j10) {
        MapIteratorCache mapIteratorCache;
        this.f30652a = abstractGraphBuilder.f30557a;
        this.f30653b = abstractGraphBuilder.f30558b;
        this.f30654c = abstractGraphBuilder.f30559c.a();
        if (map instanceof TreeMap) {
            mapIteratorCache = new MapRetrievalCache(map);
        } else {
            mapIteratorCache = new MapIteratorCache(map);
        }
        this.f30655d = mapIteratorCache;
        this.f30656e = Graphs.c(j10);
    }
}
