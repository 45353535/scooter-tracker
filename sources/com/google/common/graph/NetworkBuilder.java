package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.graph.ImmutableNetwork;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes9.dex */
@Beta
@ElementTypesAreNonnullByDefault
public final class NetworkBuilder<N, E> extends AbstractGraphBuilder<N> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f30640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ElementOrder f30641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Optional f30642h;

    private NetworkBuilder(boolean z10) {
        super(z10);
        this.f30640f = false;
        this.f30641g = ElementOrder.insertion();
        this.f30642h = Optional.absent();
    }

    private NetworkBuilder a() {
        return this;
    }

    public static NetworkBuilder<Object, Object> directed() {
        return new NetworkBuilder<>(true);
    }

    public static <N, E> NetworkBuilder<N, E> from(Network<N, E> network) {
        return new NetworkBuilder(network.isDirected()).allowsParallelEdges(network.allowsParallelEdges()).allowsSelfLoops(network.allowsSelfLoops()).nodeOrder(network.nodeOrder()).edgeOrder(network.edgeOrder());
    }

    public static NetworkBuilder<Object, Object> undirected() {
        return new NetworkBuilder<>(false);
    }

    @CanIgnoreReturnValue
    public NetworkBuilder<N, E> allowsParallelEdges(boolean z10) {
        this.f30640f = z10;
        return this;
    }

    @CanIgnoreReturnValue
    public NetworkBuilder<N, E> allowsSelfLoops(boolean z10) {
        this.f30558b = z10;
        return this;
    }

    public <N1 extends N, E1 extends E> MutableNetwork<N1, E1> build() {
        return new StandardMutableNetwork(this);
    }

    public <E1 extends E> NetworkBuilder<N, E1> edgeOrder(ElementOrder<E1> elementOrder) {
        NetworkBuilder<N, E1> networkBuilderA = a();
        networkBuilderA.f30641g = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return networkBuilderA;
    }

    @CanIgnoreReturnValue
    public NetworkBuilder<N, E> expectedEdgeCount(int i10) {
        this.f30642h = Optional.of(Integer.valueOf(Graphs.b(i10)));
        return this;
    }

    @CanIgnoreReturnValue
    public NetworkBuilder<N, E> expectedNodeCount(int i10) {
        this.f30561e = Optional.of(Integer.valueOf(Graphs.b(i10)));
        return this;
    }

    public <N1 extends N, E1 extends E> ImmutableNetwork.Builder<N1, E1> immutable() {
        return new ImmutableNetwork.Builder<>(a());
    }

    public <N1 extends N> NetworkBuilder<N1, E> nodeOrder(ElementOrder<N1> elementOrder) {
        NetworkBuilder<N1, E> networkBuilderA = a();
        networkBuilderA.f30559c = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return networkBuilderA;
    }
}
