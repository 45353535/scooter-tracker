package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.ImmutableGraph;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;

/* JADX INFO: loaded from: classes9.dex */
@DoNotMock
@Beta
@ElementTypesAreNonnullByDefault
public final class GraphBuilder<N> extends AbstractGraphBuilder<N> {
    private GraphBuilder(boolean z10) {
        super(z10);
    }

    private GraphBuilder a() {
        return this;
    }

    public static GraphBuilder<Object> directed() {
        return new GraphBuilder<>(true);
    }

    public static <N> GraphBuilder<N> from(Graph<N> graph) {
        return new GraphBuilder(graph.isDirected()).allowsSelfLoops(graph.allowsSelfLoops()).nodeOrder(graph.nodeOrder()).incidentEdgeOrder(graph.incidentEdgeOrder());
    }

    public static GraphBuilder<Object> undirected() {
        return new GraphBuilder<>(false);
    }

    @CanIgnoreReturnValue
    public GraphBuilder<N> allowsSelfLoops(boolean z10) {
        this.f30558b = z10;
        return this;
    }

    GraphBuilder b() {
        GraphBuilder graphBuilder = new GraphBuilder(this.f30557a);
        graphBuilder.f30558b = this.f30558b;
        graphBuilder.f30559c = this.f30559c;
        graphBuilder.f30561e = this.f30561e;
        graphBuilder.f30560d = this.f30560d;
        return graphBuilder;
    }

    public <N1 extends N> MutableGraph<N1> build() {
        return new StandardMutableGraph(this);
    }

    @CanIgnoreReturnValue
    public GraphBuilder<N> expectedNodeCount(int i10) {
        this.f30561e = Optional.of(Integer.valueOf(Graphs.b(i10)));
        return this;
    }

    public <N1 extends N> ImmutableGraph.Builder<N1> immutable() {
        return new ImmutableGraph.Builder<>(a());
    }

    public <N1 extends N> GraphBuilder<N1> incidentEdgeOrder(ElementOrder<N1> elementOrder) {
        Preconditions.checkArgument(elementOrder.type() == ElementOrder.Type.UNORDERED || elementOrder.type() == ElementOrder.Type.STABLE, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", elementOrder);
        GraphBuilder<N1> graphBuilderA = a();
        graphBuilderA.f30560d = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return graphBuilderA;
    }

    public <N1 extends N> GraphBuilder<N1> nodeOrder(ElementOrder<N1> elementOrder) {
        GraphBuilder<N1> graphBuilderA = a();
        graphBuilderA.f30559c = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return graphBuilderA;
    }
}
