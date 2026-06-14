package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.math.IntMath;
import j$.util.DesugarCollections;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@Beta
@ElementTypesAreNonnullByDefault
public abstract class AbstractNetwork<N, E> implements Network<N, E> {

    /* JADX INFO: renamed from: com.google.common.graph.AbstractNetwork$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractGraph<N> {

        /* JADX INFO: renamed from: com.google.common.graph.AbstractNetwork$1$1, reason: invalid class name and collision with other inner class name */
        class C03541 extends AbstractSet<EndpointPair<N>> {
            C03541() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair endpointPair = (EndpointPair) obj;
                return AnonymousClass1.this.d(endpointPair) && AnonymousClass1.this.nodes().contains(endpointPair.nodeU()) && AnonymousClass1.this.successors(endpointPair.nodeU()).contains(endpointPair.nodeV());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<EndpointPair<N>> iterator() {
                return Iterators.transform(AbstractNetwork.this.edges().iterator(), new Function() { // from class: com.google.common.graph.m
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return AbstractNetwork.this.incidentNodes(obj);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return AbstractNetwork.this.edges().size();
            }
        }

        AnonymousClass1() {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public Set<N> adjacentNodes(N n10) {
            return AbstractNetwork.this.adjacentNodes(n10);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean allowsSelfLoops() {
            return AbstractNetwork.this.allowsSelfLoops();
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public Set<EndpointPair<N>> edges() {
            return AbstractNetwork.this.allowsParallelEdges() ? super.edges() : new C03541();
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public ElementOrder<N> incidentEdgeOrder() {
            return ElementOrder.unordered();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean isDirected() {
            return AbstractNetwork.this.isDirected();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public ElementOrder<N> nodeOrder() {
            return AbstractNetwork.this.nodeOrder();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public Set<N> nodes() {
            return AbstractNetwork.this.nodes();
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
        public Set<N> predecessors(N n10) {
            return AbstractNetwork.this.predecessors((Object) n10);
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
        public Set<N> successors(N n10) {
            return AbstractNetwork.this.successors((Object) n10);
        }
    }

    private Predicate g(final Object obj, final Object obj2) {
        return new Predicate<E>(this) { // from class: com.google.common.graph.AbstractNetwork.2

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AbstractNetwork f30566d;

            {
                this.f30566d = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.base.Predicate
            public boolean apply(E e10) {
                return this.f30566d.incidentNodes(e10).adjacentNode(obj).equals(obj2);
            }
        };
    }

    private static Map h(final Network network) {
        return Maps.asMap(network.edges(), new Function() { // from class: com.google.common.graph.l
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return network.incidentNodes(obj);
            }
        });
    }

    @Override // com.google.common.graph.Network
    public Set<E> adjacentEdges(E e10) {
        EndpointPair<N> endpointPairIncidentNodes = incidentNodes(e10);
        return i(Sets.difference(Sets.union(incidentEdges(endpointPairIncidentNodes.nodeU()), incidentEdges(endpointPairIncidentNodes.nodeV())), ImmutableSet.of((Object) e10)), e10);
    }

    @Override // com.google.common.graph.Network
    public Graph<N> asGraph() {
        return new AnonymousClass1();
    }

    @Override // com.google.common.graph.Network
    public int degree(N n10) {
        return isDirected() ? IntMath.saturatedAdd(inEdges(n10).size(), outEdges(n10).size()) : IntMath.saturatedAdd(incidentEdges(n10).size(), edgesConnecting(n10, n10).size());
    }

    @Override // com.google.common.graph.Network
    public E edgeConnectingOrNull(N n10, N n11) {
        Set<E> setEdgesConnecting = edgesConnecting(n10, n11);
        int size = setEdgesConnecting.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return setEdgesConnecting.iterator().next();
        }
        throw new IllegalArgumentException(String.format("Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.", n10, n11));
    }

    @Override // com.google.common.graph.Network
    public Set<E> edgesConnecting(N n10, N n11) {
        Set<E> setOutEdges = outEdges(n10);
        Set<E> setInEdges = inEdges(n11);
        return l(setOutEdges.size() <= setInEdges.size() ? DesugarCollections.unmodifiableSet(Sets.filter(setOutEdges, g(n10, n11))) : DesugarCollections.unmodifiableSet(Sets.filter(setInEdges, g(n11, n10))), n10, n11);
    }

    @Override // com.google.common.graph.Network
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        return isDirected() == network.isDirected() && nodes().equals(network.nodes()) && h(this).equals(h(network));
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(N n10, N n11) {
        Preconditions.checkNotNull(n10);
        Preconditions.checkNotNull(n11);
        return nodes().contains(n10) && successors((Object) n10).contains(n11);
    }

    @Override // com.google.common.graph.Network
    public final int hashCode() {
        return h(this).hashCode();
    }

    protected final Set i(Set set, final Object obj) {
        return InvalidatableSet.of(set, (Supplier<Boolean>) new Supplier() { // from class: com.google.common.graph.j
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Boolean.valueOf(this.f30696b.edges().contains(obj));
            }
        }, (Supplier<String>) new Supplier() { // from class: com.google.common.graph.k
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return String.format("Edge %s that was used to generate this set is no longer in the graph.", obj);
            }
        });
    }

    @Override // com.google.common.graph.Network
    public int inDegree(N n10) {
        return isDirected() ? inEdges(n10).size() : degree(n10);
    }

    protected final boolean j(EndpointPair endpointPair) {
        return endpointPair.isOrdered() == isDirected();
    }

    protected final Set k(Set set, final Object obj) {
        return InvalidatableSet.of(set, (Supplier<Boolean>) new Supplier() { // from class: com.google.common.graph.f
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Boolean.valueOf(this.f30688b.nodes().contains(obj));
            }
        }, (Supplier<String>) new Supplier() { // from class: com.google.common.graph.g
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return String.format("Node %s that was used to generate this set is no longer in the graph.", obj);
            }
        });
    }

    protected final Set l(Set set, final Object obj, final Object obj2) {
        return InvalidatableSet.of(set, (Supplier<Boolean>) new Supplier() { // from class: com.google.common.graph.h
            @Override // com.google.common.base.Supplier
            public final Object get() {
                AbstractNetwork abstractNetwork = this.f30691b;
                return Boolean.valueOf(abstractNetwork.nodes().contains(obj) && abstractNetwork.nodes().contains(obj2));
            }
        }, (Supplier<String>) new Supplier() { // from class: com.google.common.graph.i
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return String.format("Node %s or node %s that were used to generate this set are no longer in the graph.", obj, obj2);
            }
        });
    }

    protected final void m(EndpointPair endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(j(endpointPair), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }

    @Override // com.google.common.graph.Network
    public int outDegree(N n10) {
        return isDirected() ? outEdges(n10).size() : degree(n10);
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
        return predecessors(obj);
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
        return successors(obj);
    }

    public String toString() {
        return "isDirected: " + isDirected() + ", allowsParallelEdges: " + allowsParallelEdges() + ", allowsSelfLoops: " + allowsSelfLoops() + ", nodes: " + nodes() + ", edges: " + h(this);
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        if (j(endpointPair)) {
            return hasEdgeConnecting(endpointPair.nodeU(), endpointPair.nodeV());
        }
        return false;
    }

    @Override // com.google.common.graph.Network
    public E edgeConnectingOrNull(EndpointPair<N> endpointPair) {
        m(endpointPair);
        return edgeConnectingOrNull(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.Network
    public Set<E> edgesConnecting(EndpointPair<N> endpointPair) {
        m(endpointPair);
        return edgesConnecting(endpointPair.nodeU(), endpointPair.nodeV());
    }
}
