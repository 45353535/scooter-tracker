package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.ImmutableValueGraph;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes9.dex */
@Beta
@ElementTypesAreNonnullByDefault
public final class ValueGraphBuilder<N, V> extends AbstractGraphBuilder<N> {
    private ValueGraphBuilder(boolean z10) {
        super(z10);
    }

    private ValueGraphBuilder a() {
        return this;
    }

    public static ValueGraphBuilder<Object, Object> directed() {
        return new ValueGraphBuilder<>(true);
    }

    public static <N, V> ValueGraphBuilder<N, V> from(ValueGraph<N, V> valueGraph) {
        return new ValueGraphBuilder(valueGraph.isDirected()).allowsSelfLoops(valueGraph.allowsSelfLoops()).nodeOrder(valueGraph.nodeOrder()).incidentEdgeOrder(valueGraph.incidentEdgeOrder());
    }

    public static ValueGraphBuilder<Object, Object> undirected() {
        return new ValueGraphBuilder<>(false);
    }

    @CanIgnoreReturnValue
    public ValueGraphBuilder<N, V> allowsSelfLoops(boolean z10) {
        this.f30558b = z10;
        return this;
    }

    ValueGraphBuilder b() {
        ValueGraphBuilder valueGraphBuilder = new ValueGraphBuilder(this.f30557a);
        valueGraphBuilder.f30558b = this.f30558b;
        valueGraphBuilder.f30559c = this.f30559c;
        valueGraphBuilder.f30561e = this.f30561e;
        valueGraphBuilder.f30560d = this.f30560d;
        return valueGraphBuilder;
    }

    public <N1 extends N, V1 extends V> MutableValueGraph<N1, V1> build() {
        return new StandardMutableValueGraph(this);
    }

    @CanIgnoreReturnValue
    public ValueGraphBuilder<N, V> expectedNodeCount(int i10) {
        this.f30561e = Optional.of(Integer.valueOf(Graphs.b(i10)));
        return this;
    }

    public <N1 extends N, V1 extends V> ImmutableValueGraph.Builder<N1, V1> immutable() {
        return new ImmutableValueGraph.Builder<>(a());
    }

    public <N1 extends N> ValueGraphBuilder<N1, V> incidentEdgeOrder(ElementOrder<N1> elementOrder) {
        Preconditions.checkArgument(elementOrder.type() == ElementOrder.Type.UNORDERED || elementOrder.type() == ElementOrder.Type.STABLE, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", elementOrder);
        ValueGraphBuilder<N1, V> valueGraphBuilderA = a();
        valueGraphBuilderA.f30560d = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return valueGraphBuilderA;
    }

    public <N1 extends N> ValueGraphBuilder<N1, V> nodeOrder(ElementOrder<N1> elementOrder) {
        ValueGraphBuilder<N1, V> valueGraphBuilderA = a();
        valueGraphBuilderA.f30559c = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return valueGraphBuilderA;
    }
}
