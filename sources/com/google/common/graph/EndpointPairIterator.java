package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
abstract class EndpointPairIterator<N> extends AbstractIterator<EndpointPair<N>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BaseGraph f30605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Iterator f30606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f30607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Iterator f30608g;

    private static final class Directed<N> extends EndpointPairIterator<N> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public EndpointPair computeNext() {
            while (!this.f30608g.hasNext()) {
                if (!c()) {
                    return (EndpointPair) a();
                }
            }
            Object obj = this.f30607f;
            Objects.requireNonNull(obj);
            return EndpointPair.ordered(obj, this.f30608g.next());
        }

        private Directed(BaseGraph baseGraph) {
            super(baseGraph);
        }
    }

    private static final class Undirected<N> extends EndpointPairIterator<N> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Set f30609h;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public EndpointPair computeNext() {
            do {
                Objects.requireNonNull(this.f30609h);
                while (this.f30608g.hasNext()) {
                    Object next = this.f30608g.next();
                    if (!this.f30609h.contains(next)) {
                        Object obj = this.f30607f;
                        Objects.requireNonNull(obj);
                        return EndpointPair.unordered(obj, next);
                    }
                }
                this.f30609h.add(this.f30607f);
            } while (c());
            this.f30609h = null;
            return (EndpointPair) a();
        }

        private Undirected(BaseGraph baseGraph) {
            super(baseGraph);
            this.f30609h = Sets.newHashSetWithExpectedSize(baseGraph.nodes().size() + 1);
        }
    }

    static EndpointPairIterator d(BaseGraph baseGraph) {
        return baseGraph.isDirected() ? new Directed(baseGraph) : new Undirected(baseGraph);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean c() {
        Preconditions.checkState(!this.f30608g.hasNext());
        if (!this.f30606e.hasNext()) {
            return false;
        }
        Object next = this.f30606e.next();
        this.f30607f = next;
        this.f30608g = this.f30605d.successors(next).iterator();
        return true;
    }

    private EndpointPairIterator(BaseGraph baseGraph) {
        this.f30607f = null;
        this.f30608g = ImmutableSet.of().iterator();
        this.f30605d = baseGraph;
        this.f30606e = baseGraph.nodes().iterator();
    }
}
