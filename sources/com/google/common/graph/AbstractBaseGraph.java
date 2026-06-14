package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractBaseGraph<N> implements BaseGraph<N> {

    /* JADX INFO: renamed from: com.google.common.graph.AbstractBaseGraph$2, reason: invalid class name */
    class AnonymousClass2 extends IncidentEdgeSet<N> {
        AnonymousClass2(BaseGraph baseGraph, Object obj) {
            super(baseGraph, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<EndpointPair<N>> iterator() {
            return this.f30623c.isDirected() ? Iterators.unmodifiableIterator(Iterators.concat(Iterators.transform(this.f30623c.predecessors(this.f30622b).iterator(), new Function() { // from class: com.google.common.graph.c
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return EndpointPair.ordered(obj, this.f30685b.f30622b);
                }
            }), Iterators.transform(Sets.difference(this.f30623c.successors(this.f30622b), ImmutableSet.of(this.f30622b)).iterator(), new Function() { // from class: com.google.common.graph.d
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return EndpointPair.ordered(this.f30686b.f30622b, obj);
                }
            }))) : Iterators.unmodifiableIterator(Iterators.transform(this.f30623c.adjacentNodes(this.f30622b).iterator(), new Function() { // from class: com.google.common.graph.e
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return EndpointPair.unordered(this.f30687b.f30622b, obj);
                }
            }));
        }
    }

    AbstractBaseGraph() {
    }

    protected long c() {
        Iterator<N> it = nodes().iterator();
        long jDegree = 0;
        while (it.hasNext()) {
            jDegree += (long) degree(it.next());
        }
        Preconditions.checkState((1 & jDegree) == 0);
        return jDegree >>> 1;
    }

    protected final boolean d(EndpointPair endpointPair) {
        return endpointPair.isOrdered() == isDirected();
    }

    @Override // com.google.common.graph.BaseGraph
    public int degree(N n10) {
        if (isDirected()) {
            return IntMath.saturatedAdd(predecessors((Object) n10).size(), successors((Object) n10).size());
        }
        Set<N> setAdjacentNodes = adjacentNodes(n10);
        return IntMath.saturatedAdd(setAdjacentNodes.size(), (allowsSelfLoops() && setAdjacentNodes.contains(n10)) ? 1 : 0);
    }

    protected final Set e(Set set, final Object obj) {
        return InvalidatableSet.of(set, (Supplier<Boolean>) new Supplier() { // from class: com.google.common.graph.a
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Boolean.valueOf(this.f30682b.nodes().contains(obj));
            }
        }, (Supplier<String>) new Supplier() { // from class: com.google.common.graph.b
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return String.format("Node %s that was used to generate this set is no longer in the graph.", obj);
            }
        });
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> edges() {
        return new AbstractSet<EndpointPair<N>>() { // from class: com.google.common.graph.AbstractBaseGraph.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair endpointPair = (EndpointPair) obj;
                return AbstractBaseGraph.this.d(endpointPair) && AbstractBaseGraph.this.nodes().contains(endpointPair.nodeU()) && AbstractBaseGraph.this.successors(endpointPair.nodeU()).contains(endpointPair.nodeV());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return Ints.saturatedCast(AbstractBaseGraph.this.c());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<EndpointPair<N>> iterator() {
                return EndpointPairIterator.d(AbstractBaseGraph.this);
            }
        };
    }

    protected final void f(EndpointPair endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(d(endpointPair), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n10, N n11) {
        Preconditions.checkNotNull(n10);
        Preconditions.checkNotNull(n11);
        return nodes().contains(n10) && successors((Object) n10).contains(n11);
    }

    @Override // com.google.common.graph.BaseGraph
    public int inDegree(N n10) {
        return isDirected() ? predecessors((Object) n10).size() : degree(n10);
    }

    @Override // com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return ElementOrder.unordered();
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> incidentEdges(N n10) {
        Preconditions.checkNotNull(n10);
        Preconditions.checkArgument(nodes().contains(n10), "Node %s is not an element of this graph.", n10);
        return e(new AnonymousClass2(this, n10), n10);
    }

    @Override // com.google.common.graph.BaseGraph
    public int outDegree(N n10) {
        return isDirected() ? successors((Object) n10).size() : degree(n10);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
        return predecessors(obj);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
        return successors(obj);
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        if (!d(endpointPair)) {
            return false;
        }
        N nNodeU = endpointPair.nodeU();
        return nodes().contains(nNodeU) && successors((Object) nNodeU).contains(endpointPair.nodeV());
    }
}
