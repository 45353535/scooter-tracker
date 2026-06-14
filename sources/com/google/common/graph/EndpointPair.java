package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.Immutable;
import com.ironsource.C4240b4;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@Immutable(containerOf = {"N"})
@Beta
@ElementTypesAreNonnullByDefault
public abstract class EndpointPair<N> implements Iterable<N> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f30603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f30604c;

    private static final class Ordered<N> extends EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            return isOrdered() == endpointPair.isOrdered() && source().equals(endpointPair.source()) && target().equals(endpointPair.target());
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
            return Objects.hashCode(source(), target());
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
            return true;
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
            return nodeU();
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
            return nodeV();
        }

        public String toString() {
            return "<" + source() + " -> " + target() + ">";
        }

        private Ordered(Object obj, Object obj2) {
            super(obj, obj2);
        }
    }

    private static final class Unordered<N> extends EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            if (isOrdered() != endpointPair.isOrdered()) {
                return false;
            }
            return nodeU().equals(endpointPair.nodeU()) ? nodeV().equals(endpointPair.nodeV()) : nodeU().equals(endpointPair.nodeV()) && nodeV().equals(endpointPair.nodeU());
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
            return nodeU().hashCode() + nodeV().hashCode();
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
            return false;
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public String toString() {
            return C4240b4.j.f42672d + nodeU() + ", " + nodeV() + C4240b4.j.f42674e;
        }

        private Unordered(Object obj, Object obj2) {
            super(obj, obj2);
        }
    }

    static EndpointPair a(Graph graph, Object obj, Object obj2) {
        return graph.isDirected() ? ordered(obj, obj2) : unordered(obj, obj2);
    }

    static EndpointPair b(Network network, Object obj, Object obj2) {
        return network.isDirected() ? ordered(obj, obj2) : unordered(obj, obj2);
    }

    public static <N> EndpointPair<N> ordered(N n10, N n11) {
        return new Ordered(n10, n11);
    }

    public static <N> EndpointPair<N> unordered(N n10, N n11) {
        return new Unordered(n11, n10);
    }

    public final N adjacentNode(N n10) {
        if (n10.equals(this.f30603b)) {
            return (N) this.f30604c;
        }
        if (n10.equals(this.f30604c)) {
            return (N) this.f30603b;
        }
        throw new IllegalArgumentException("EndpointPair " + this + " does not contain node " + n10);
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract boolean isOrdered();

    public final N nodeU() {
        return (N) this.f30603b;
    }

    public final N nodeV() {
        return (N) this.f30604c;
    }

    public abstract N source();

    public abstract N target();

    private EndpointPair(Object obj, Object obj2) {
        this.f30603b = Preconditions.checkNotNull(obj);
        this.f30604c = Preconditions.checkNotNull(obj2);
    }

    @Override // java.lang.Iterable
    public final UnmodifiableIterator<N> iterator() {
        return Iterators.forArray(this.f30603b, this.f30604c);
    }
}
