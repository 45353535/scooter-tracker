package com.google.common.graph;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
abstract class IncidentEdgeSet<N> extends AbstractSet<EndpointPair<N>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f30622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final BaseGraph f30623c;

    IncidentEdgeSet(BaseGraph baseGraph, Object obj) {
        this.f30623c = baseGraph;
        this.f30622b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof EndpointPair)) {
            return false;
        }
        EndpointPair endpointPair = (EndpointPair) obj;
        if (this.f30623c.isDirected()) {
            if (!endpointPair.isOrdered()) {
                return false;
            }
            Object objSource = endpointPair.source();
            Object objTarget = endpointPair.target();
            return (this.f30622b.equals(objSource) && this.f30623c.successors(this.f30622b).contains(objTarget)) || (this.f30622b.equals(objTarget) && this.f30623c.predecessors(this.f30622b).contains(objSource));
        }
        if (endpointPair.isOrdered()) {
            return false;
        }
        Set setAdjacentNodes = this.f30623c.adjacentNodes(this.f30622b);
        Object objNodeU = endpointPair.nodeU();
        Object objNodeV = endpointPair.nodeV();
        return (this.f30622b.equals(objNodeV) && setAdjacentNodes.contains(objNodeU)) || (this.f30622b.equals(objNodeU) && setAdjacentNodes.contains(objNodeV));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f30623c.isDirected() ? (this.f30623c.inDegree(this.f30622b) + this.f30623c.outDegree(this.f30622b)) - (this.f30623c.successors(this.f30622b).contains(this.f30622b) ? 1 : 0) : this.f30623c.adjacentNodes(this.f30622b).size();
    }
}
