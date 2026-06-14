package com.google.common.graph;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@Immutable(containerOf = {"N", ExifInterface.LONGITUDE_EAST})
@Beta
@ElementTypesAreNonnullByDefault
public final class ImmutableNetwork<N, E> extends StandardNetwork<N, E> {

    public static class Builder<N, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MutableNetwork f30620a;

        Builder(NetworkBuilder networkBuilder) {
            this.f30620a = networkBuilder.build();
        }

        @CanIgnoreReturnValue
        public Builder<N, E> addEdge(N n10, N n11, E e10) {
            this.f30620a.addEdge(n10, n11, e10);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<N, E> addNode(N n10) {
            this.f30620a.addNode(n10);
            return this;
        }

        public ImmutableNetwork<N, E> build() {
            return ImmutableNetwork.copyOf(this.f30620a);
        }

        @CanIgnoreReturnValue
        public Builder<N, E> addEdge(EndpointPair<N> endpointPair, E e10) {
            this.f30620a.addEdge(endpointPair, e10);
            return this;
        }
    }

    private ImmutableNetwork(Network network) {
        super(NetworkBuilder.from(network), x(network), w(network));
    }

    public static <N, E> ImmutableNetwork<N, E> copyOf(Network<N, E> network) {
        return network instanceof ImmutableNetwork ? (ImmutableNetwork) network : new ImmutableNetwork<>(network);
    }

    private static Function u(final Network network, final Object obj) {
        return new Function() { // from class: com.google.common.graph.v
            @Override // com.google.common.base.Function
            public final Object apply(Object obj2) {
                return network.incidentNodes(obj2).adjacentNode(obj);
            }
        };
    }

    private static NetworkConnections v(Network network, Object obj) {
        if (!network.isDirected()) {
            Map mapAsMap = Maps.asMap(network.incidentEdges(obj), u(network, obj));
            return network.allowsParallelEdges() ? UndirectedMultiNetworkConnections.e(mapAsMap) : UndirectedNetworkConnections.b(mapAsMap);
        }
        Map mapAsMap2 = Maps.asMap(network.inEdges(obj), y(network));
        Map mapAsMap3 = Maps.asMap(network.outEdges(obj), z(network));
        int size = network.edgesConnecting(obj, obj).size();
        return network.allowsParallelEdges() ? DirectedMultiNetworkConnections.e(mapAsMap2, mapAsMap3, size) : DirectedNetworkConnections.c(mapAsMap2, mapAsMap3, size);
    }

    private static Map w(Network network) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (E e10 : network.edges()) {
            builder.put(e10, network.incidentNodes(e10).nodeU());
        }
        return builder.buildOrThrow();
    }

    private static Map x(Network network) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (N n10 : network.nodes()) {
            builder.put(n10, v(network, n10));
        }
        return builder.buildOrThrow();
    }

    private static Function y(final Network network) {
        return new Function() { // from class: com.google.common.graph.u
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return network.incidentNodes(obj).source();
            }
        };
    }

    private static Function z(final Network network) {
        return new Function() { // from class: com.google.common.graph.w
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return network.incidentNodes(obj).target();
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set adjacentNodes(Object obj) {
        return super.adjacentNodes(obj);
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean allowsParallelEdges() {
        return super.allowsParallelEdges();
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
        return super.allowsSelfLoops();
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ ElementOrder edgeOrder() {
        return super.edgeOrder();
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set edges() {
        return super.edges();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set edgesConnecting(Object obj, Object obj2) {
        return super.edgesConnecting(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set inEdges(Object obj) {
        return super.inEdges(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set incidentEdges(Object obj) {
        return super.incidentEdges(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ EndpointPair incidentNodes(Object obj) {
        return super.incidentNodes(obj);
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean isDirected() {
        return super.isDirected();
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ ElementOrder nodeOrder() {
        return super.nodeOrder();
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set nodes() {
        return super.nodes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set outEdges(Object obj) {
        return super.outEdges(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ Set predecessors(Object obj) {
        return super.predecessors(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ Set successors(Object obj) {
        return super.successors(obj);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public ImmutableGraph<N> asGraph() {
        return new ImmutableGraph<>(super.asGraph());
    }

    @Deprecated
    public static <N, E> ImmutableNetwork<N, E> copyOf(ImmutableNetwork<N, E> immutableNetwork) {
        return (ImmutableNetwork) Preconditions.checkNotNull(immutableNetwork);
    }
}
