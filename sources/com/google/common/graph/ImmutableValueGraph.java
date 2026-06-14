package com.google.common.graph;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import j$.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@Immutable(containerOf = {"N", ExifInterface.GPS_MEASUREMENT_INTERRUPTED})
@Beta
@ElementTypesAreNonnullByDefault
public final class ImmutableValueGraph<N, V> extends StandardValueGraph<N, V> {

    public static class Builder<N, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MutableValueGraph f30621a;

        Builder(ValueGraphBuilder valueGraphBuilder) {
            this.f30621a = valueGraphBuilder.b().incidentEdgeOrder(ElementOrder.stable()).build();
        }

        @CanIgnoreReturnValue
        public Builder<N, V> addNode(N n10) {
            this.f30621a.addNode(n10);
            return this;
        }

        public ImmutableValueGraph<N, V> build() {
            return ImmutableValueGraph.copyOf(this.f30621a);
        }

        @CanIgnoreReturnValue
        public Builder<N, V> putEdgeValue(N n10, N n11, V v10) {
            this.f30621a.putEdgeValue(n10, n11, v10);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<N, V> putEdgeValue(EndpointPair<N> endpointPair, V v10) {
            this.f30621a.putEdgeValue(endpointPair, v10);
            return this;
        }
    }

    private ImmutableValueGraph(ValueGraph valueGraph) {
        super(ValueGraphBuilder.from(valueGraph), o(valueGraph), valueGraph.edges().size());
    }

    public static <N, V> ImmutableValueGraph<N, V> copyOf(ValueGraph<N, V> valueGraph) {
        return valueGraph instanceof ImmutableValueGraph ? (ImmutableValueGraph) valueGraph : new ImmutableValueGraph<>(valueGraph);
    }

    public static /* synthetic */ Object m(ValueGraph valueGraph, Object obj, Object obj2) {
        Object objEdgeValueOrDefault = valueGraph.edgeValueOrDefault(obj, obj2, null);
        Objects.requireNonNull(objEdgeValueOrDefault);
        return objEdgeValueOrDefault;
    }

    private static GraphConnections n(final ValueGraph valueGraph, final Object obj) {
        Function function = new Function() { // from class: com.google.common.graph.x
            @Override // com.google.common.base.Function
            public final Object apply(Object obj2) {
                return ImmutableValueGraph.m(valueGraph, obj, obj2);
            }
        };
        return valueGraph.isDirected() ? DirectedGraphConnections.m(obj, valueGraph.incidentEdges(obj), function) : UndirectedGraphConnections.c(Maps.asMap(valueGraph.adjacentNodes(obj), function));
    }

    private static ImmutableMap o(ValueGraph valueGraph) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (N n10 : valueGraph.nodes()) {
            builder.put(n10, n(valueGraph, n10));
        }
        return builder.buildOrThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set adjacentNodes(Object obj) {
        return super.adjacentNodes(obj);
    }

    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
        return super.allowsSelfLoops();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.ValueGraph
    public /* bridge */ /* synthetic */ Object edgeValueOrDefault(EndpointPair endpointPair, Object obj) {
        return super.edgeValueOrDefault(endpointPair, obj);
    }

    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(EndpointPair endpointPair) {
        return super.hasEdgeConnecting(endpointPair);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return ElementOrder.stable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ Set incidentEdges(Object obj) {
        return super.incidentEdges(obj);
    }

    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean isDirected() {
        return super.isDirected();
    }

    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ ElementOrder nodeOrder() {
        return super.nodeOrder();
    }

    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set nodes() {
        return super.nodes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ Set predecessors(Object obj) {
        return super.predecessors(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ Set successors(Object obj) {
        return super.successors(obj);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.ValueGraph
    public ImmutableGraph<N> asGraph() {
        return new ImmutableGraph<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.ValueGraph
    public /* bridge */ /* synthetic */ Object edgeValueOrDefault(Object obj, Object obj2, Object obj3) {
        return super.edgeValueOrDefault(obj, obj2, obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(Object obj, Object obj2) {
        return super.hasEdgeConnecting(obj, obj2);
    }

    @Deprecated
    public static <N, V> ImmutableValueGraph<N, V> copyOf(ImmutableValueGraph<N, V> immutableValueGraph) {
        return (ImmutableValueGraph) Preconditions.checkNotNull(immutableValueGraph);
    }
}
