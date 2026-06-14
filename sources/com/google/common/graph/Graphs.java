package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.Graphs;
import com.google.common.graph.ImmutableGraph;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@Beta
@ElementTypesAreNonnullByDefault
public final class Graphs extends GraphsBridgeMethods {

    private static final class NodeAndRemainingSuccessors<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f30611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Queue f30612b;

        NodeAndRemainingSuccessors(Object obj) {
            this.f30611a = obj;
        }
    }

    private enum NodeVisitState {
        PENDING,
        COMPLETE
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class TransposedGraph<N> extends ForwardingGraph<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Graph f30614a;

        /* JADX INFO: renamed from: com.google.common.graph.Graphs$TransposedGraph$1, reason: invalid class name */
        class AnonymousClass1 extends IncidentEdgeSet<N> {
            AnonymousClass1(BaseGraph baseGraph, Object obj) {
                super(baseGraph, obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<EndpointPair<N>> iterator() {
                return Iterators.transform(TransposedGraph.this.g().incidentEdges(this.f30622b).iterator(), new Function() { // from class: com.google.common.graph.t
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        EndpointPair endpointPair = (EndpointPair) obj;
                        return EndpointPair.a(Graphs.TransposedGraph.this.g(), endpointPair.nodeV(), endpointPair.nodeU());
                    }
                });
            }
        }

        TransposedGraph(Graph graph) {
            this.f30614a = graph;
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(N n10, N n11) {
            return g().hasEdgeConnecting(n11, n10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.graph.ForwardingGraph
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Graph g() {
            return this.f30614a;
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int inDegree(N n10) {
            return g().outDegree(n10);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public Set<EndpointPair<N>> incidentEdges(N n10) {
            return new AnonymousClass1(this, n10);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int outDegree(N n10) {
            return g().inDegree(n10);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
            return g().hasEdgeConnecting(Graphs.g(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
        public Set<N> predecessors(N n10) {
            return g().successors((Object) n10);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
        public Set<N> successors(N n10) {
            return g().predecessors((Object) n10);
        }
    }

    private static class TransposedNetwork<N, E> extends ForwardingNetwork<N, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Network f30616a;

        TransposedNetwork(Network network) {
            this.f30616a = network;
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public E edgeConnectingOrNull(N n10, N n11) {
            return (E) n().edgeConnectingOrNull(n11, n10);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public Set<E> edgesConnecting(N n10, N n11) {
            return n().edgesConnecting(n11, n10);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public boolean hasEdgeConnecting(N n10, N n11) {
            return n().hasEdgeConnecting(n11, n10);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public int inDegree(N n10) {
            return n().outDegree(n10);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public Set<E> inEdges(N n10) {
            return n().outEdges(n10);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public EndpointPair<N> incidentNodes(E e10) {
            EndpointPair<N> endpointPairIncidentNodes = n().incidentNodes(e10);
            return EndpointPair.b(this.f30616a, endpointPairIncidentNodes.nodeV(), endpointPairIncidentNodes.nodeU());
        }

        @Override // com.google.common.graph.ForwardingNetwork
        Network n() {
            return this.f30616a;
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public int outDegree(N n10) {
            return n().inDegree(n10);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public Set<E> outEdges(N n10) {
            return n().inEdges(n10);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public E edgeConnectingOrNull(EndpointPair<N> endpointPair) {
            return (E) n().edgeConnectingOrNull(Graphs.g(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public Set<E> edgesConnecting(EndpointPair<N> endpointPair) {
            return n().edgesConnecting(Graphs.g(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
            return n().hasEdgeConnecting(Graphs.g(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
        public Set<N> predecessors(N n10) {
            return n().successors((Object) n10);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
        public Set<N> successors(N n10) {
            return n().predecessors((Object) n10);
        }
    }

    private static class TransposedValueGraph<N, V> extends ForwardingValueGraph<N, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ValueGraph f30617a;

        TransposedValueGraph(ValueGraph valueGraph) {
            this.f30617a = valueGraph;
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.ValueGraph
        public V edgeValueOrDefault(N n10, N n11, V v10) {
            return (V) i().edgeValueOrDefault(n11, n10, v10);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(N n10, N n11) {
            return i().hasEdgeConnecting(n11, n10);
        }

        @Override // com.google.common.graph.ForwardingValueGraph
        ValueGraph i() {
            return this.f30617a;
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int inDegree(N n10) {
            return i().outDegree(n10);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int outDegree(N n10) {
            return i().inDegree(n10);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.ValueGraph
        public V edgeValueOrDefault(EndpointPair<N> endpointPair, V v10) {
            return (V) i().edgeValueOrDefault(Graphs.g(endpointPair), v10);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
            return i().hasEdgeConnecting(Graphs.g(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
        public Set<N> predecessors(N n10) {
            return i().successors((Object) n10);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
        public Set<N> successors(N n10) {
            return i().predecessors((Object) n10);
        }
    }

    private static boolean a(Graph graph, Object obj, Object obj2) {
        return graph.isDirected() || !Objects.equal(obj2, obj);
    }

    static int b(int i10) {
        Preconditions.checkArgument(i10 >= 0, "Not true that %s is non-negative.", i10);
        return i10;
    }

    static long c(long j10) {
        Preconditions.checkArgument(j10 >= 0, "Not true that %s is non-negative.", j10);
        return j10;
    }

    public static <N> MutableGraph<N> copyOf(Graph<N> graph) {
        MutableGraph<N> mutableGraph = (MutableGraph<N>) GraphBuilder.from(graph).expectedNodeCount(graph.nodes().size()).build();
        Iterator<N> it = graph.nodes().iterator();
        while (it.hasNext()) {
            mutableGraph.addNode(it.next());
        }
        for (EndpointPair<N> endpointPair : graph.edges()) {
            mutableGraph.putEdge(endpointPair.nodeU(), endpointPair.nodeV());
        }
        return mutableGraph;
    }

    static int d(int i10) {
        Preconditions.checkArgument(i10 > 0, "Not true that %s is positive.", i10);
        return i10;
    }

    static long e(long j10) {
        Preconditions.checkArgument(j10 > 0, "Not true that %s is positive.", j10);
        return j10;
    }

    private static boolean f(Graph graph, Map map, Object obj) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(new NodeAndRemainingSuccessors(obj));
        while (!arrayDeque.isEmpty()) {
            NodeAndRemainingSuccessors nodeAndRemainingSuccessors = (NodeAndRemainingSuccessors) arrayDeque.removeLast();
            NodeAndRemainingSuccessors nodeAndRemainingSuccessors2 = (NodeAndRemainingSuccessors) arrayDeque.peekLast();
            arrayDeque.addLast(nodeAndRemainingSuccessors);
            Object obj2 = nodeAndRemainingSuccessors.f30611a;
            Object obj3 = nodeAndRemainingSuccessors2 == null ? null : nodeAndRemainingSuccessors2.f30611a;
            if (nodeAndRemainingSuccessors.f30612b == null) {
                NodeVisitState nodeVisitState = (NodeVisitState) map.get(obj2);
                if (nodeVisitState == NodeVisitState.COMPLETE) {
                    arrayDeque.removeLast();
                } else {
                    NodeVisitState nodeVisitState2 = NodeVisitState.PENDING;
                    if (nodeVisitState == nodeVisitState2) {
                        return true;
                    }
                    map.put(obj2, nodeVisitState2);
                    nodeAndRemainingSuccessors.f30612b = new ArrayDeque(graph.successors(obj2));
                }
            }
            if (!nodeAndRemainingSuccessors.f30612b.isEmpty()) {
                Object objRemove = nodeAndRemainingSuccessors.f30612b.remove();
                if (a(graph, objRemove, obj3)) {
                    arrayDeque.addLast(new NodeAndRemainingSuccessors(objRemove));
                }
            }
            arrayDeque.removeLast();
            map.put(obj2, NodeVisitState.COMPLETE);
        }
        return false;
    }

    static EndpointPair g(EndpointPair endpointPair) {
        return endpointPair.isOrdered() ? EndpointPair.ordered(endpointPair.target(), endpointPair.source()) : endpointPair;
    }

    public static <N> boolean hasCycle(Graph<N> graph) {
        int size = graph.edges().size();
        if (size == 0) {
            return false;
        }
        if (!graph.isDirected() && size >= graph.nodes().size()) {
            return true;
        }
        HashMap mapNewHashMapWithExpectedSize = Maps.newHashMapWithExpectedSize(graph.nodes().size());
        Iterator<N> it = graph.nodes().iterator();
        while (it.hasNext()) {
            if (f(graph, mapNewHashMapWithExpectedSize, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <N> MutableGraph<N> inducedSubgraph(Graph<N> graph, Iterable<? extends N> iterable) {
        StandardMutableGraph standardMutableGraph = iterable instanceof Collection ? (MutableGraph<N>) GraphBuilder.from(graph).expectedNodeCount(((Collection) iterable).size()).build() : (MutableGraph<N>) GraphBuilder.from(graph).build();
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            standardMutableGraph.addNode(it.next());
        }
        for (N n10 : standardMutableGraph.nodes()) {
            for (N n11 : graph.successors((Object) n10)) {
                if (standardMutableGraph.nodes().contains(n11)) {
                    standardMutableGraph.putEdge(n10, n11);
                }
            }
        }
        return standardMutableGraph;
    }

    public static <N> ImmutableSet<N> reachableNodes(Graph<N> graph, N n10) {
        Preconditions.checkArgument(graph.nodes().contains(n10), "Node %s is not an element of this graph.", n10);
        return ImmutableSet.copyOf(Traverser.forGraph(graph).breadthFirst(n10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N> ImmutableGraph<N> transitiveClosure(Graph<N> graph) {
        ImmutableGraph.Builder<N1> builderImmutable = GraphBuilder.from(graph).allowsSelfLoops(true).immutable();
        if (graph.isDirected()) {
            for (N n10 : graph.nodes()) {
                UnmodifiableIterator it = reachableNodes((Graph) graph, (Object) n10).iterator();
                while (it.hasNext()) {
                    builderImmutable.putEdge(n10, it.next());
                }
            }
        } else {
            HashSet hashSet = new HashSet();
            for (N n11 : graph.nodes()) {
                if (!hashSet.contains(n11)) {
                    ImmutableSet immutableSetReachableNodes = reachableNodes((Graph) graph, (Object) n11);
                    hashSet.addAll(immutableSetReachableNodes);
                    int i10 = 1;
                    for (Object obj : immutableSetReachableNodes) {
                        int i11 = i10 + 1;
                        Iterator it2 = Iterables.limit(immutableSetReachableNodes, i10).iterator();
                        while (it2.hasNext()) {
                            builderImmutable.putEdge(obj, it2.next());
                        }
                        i10 = i11;
                    }
                }
            }
        }
        return builderImmutable.build();
    }

    public static <N> Graph<N> transpose(Graph<N> graph) {
        return !graph.isDirected() ? graph : graph instanceof TransposedGraph ? ((TransposedGraph) graph).f30614a : new TransposedGraph(graph);
    }

    public static <N, V> ValueGraph<N, V> transpose(ValueGraph<N, V> valueGraph) {
        if (!valueGraph.isDirected()) {
            return valueGraph;
        }
        if (valueGraph instanceof TransposedValueGraph) {
            return ((TransposedValueGraph) valueGraph).f30617a;
        }
        return new TransposedValueGraph(valueGraph);
    }

    public static <N, V> MutableValueGraph<N, V> copyOf(ValueGraph<N, V> valueGraph) {
        MutableValueGraph<N, V> mutableValueGraph = (MutableValueGraph<N, V>) ValueGraphBuilder.from(valueGraph).expectedNodeCount(valueGraph.nodes().size()).build();
        Iterator<N> it = valueGraph.nodes().iterator();
        while (it.hasNext()) {
            mutableValueGraph.addNode(it.next());
        }
        for (EndpointPair<N> endpointPair : valueGraph.edges()) {
            N nNodeU = endpointPair.nodeU();
            N nNodeV = endpointPair.nodeV();
            V vEdgeValueOrDefault = valueGraph.edgeValueOrDefault(endpointPair.nodeU(), endpointPair.nodeV(), null);
            j$.util.Objects.requireNonNull(vEdgeValueOrDefault);
            mutableValueGraph.putEdgeValue(nNodeU, nNodeV, vEdgeValueOrDefault);
        }
        return mutableValueGraph;
    }

    public static boolean hasCycle(Network<?, ?> network) {
        if (network.isDirected() || !network.allowsParallelEdges() || network.edges().size() <= network.asGraph().edges().size()) {
            return hasCycle(network.asGraph());
        }
        return true;
    }

    public static <N, E> Network<N, E> transpose(Network<N, E> network) {
        if (!network.isDirected()) {
            return network;
        }
        if (network instanceof TransposedNetwork) {
            return ((TransposedNetwork) network).f30616a;
        }
        return new TransposedNetwork(network);
    }

    public static <N, V> MutableValueGraph<N, V> inducedSubgraph(ValueGraph<N, V> valueGraph, Iterable<? extends N> iterable) {
        StandardMutableValueGraph standardMutableValueGraph;
        if (iterable instanceof Collection) {
            standardMutableValueGraph = (MutableValueGraph<N, V>) ValueGraphBuilder.from(valueGraph).expectedNodeCount(((Collection) iterable).size()).build();
        } else {
            standardMutableValueGraph = (MutableValueGraph<N, V>) ValueGraphBuilder.from(valueGraph).build();
        }
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            standardMutableValueGraph.addNode(it.next());
        }
        for (N n10 : standardMutableValueGraph.nodes()) {
            for (N n11 : valueGraph.successors((Object) n10)) {
                if (standardMutableValueGraph.nodes().contains(n11)) {
                    V vEdgeValueOrDefault = valueGraph.edgeValueOrDefault(n10, n11, null);
                    j$.util.Objects.requireNonNull(vEdgeValueOrDefault);
                    standardMutableValueGraph.putEdgeValue(n10, n11, vEdgeValueOrDefault);
                }
            }
        }
        return standardMutableValueGraph;
    }

    public static <N, E> MutableNetwork<N, E> copyOf(Network<N, E> network) {
        MutableNetwork<N, E> mutableNetwork = (MutableNetwork<N, E>) NetworkBuilder.from(network).expectedNodeCount(network.nodes().size()).expectedEdgeCount(network.edges().size()).build();
        Iterator<N> it = network.nodes().iterator();
        while (it.hasNext()) {
            mutableNetwork.addNode(it.next());
        }
        for (E e10 : network.edges()) {
            EndpointPair<N> endpointPairIncidentNodes = network.incidentNodes(e10);
            mutableNetwork.addEdge(endpointPairIncidentNodes.nodeU(), endpointPairIncidentNodes.nodeV(), e10);
        }
        return mutableNetwork;
    }

    public static <N, E> MutableNetwork<N, E> inducedSubgraph(Network<N, E> network, Iterable<? extends N> iterable) {
        StandardMutableNetwork standardMutableNetwork;
        if (iterable instanceof Collection) {
            standardMutableNetwork = (MutableNetwork<N, E>) NetworkBuilder.from(network).expectedNodeCount(((Collection) iterable).size()).build();
        } else {
            standardMutableNetwork = (MutableNetwork<N, E>) NetworkBuilder.from(network).build();
        }
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            standardMutableNetwork.addNode(it.next());
        }
        for (E e10 : standardMutableNetwork.nodes()) {
            for (E e11 : network.outEdges(e10)) {
                N nAdjacentNode = network.incidentNodes(e11).adjacentNode(e10);
                if (standardMutableNetwork.nodes().contains(nAdjacentNode)) {
                    standardMutableNetwork.addEdge(e10, nAdjacentNode, e11);
                }
            }
        }
        return standardMutableNetwork;
    }
}
