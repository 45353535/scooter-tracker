package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.graph.ElementOrder;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class UndirectedGraphConnections<N, V> implements GraphConnections<N, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f30677a;

    /* JADX INFO: renamed from: com.google.common.graph.UndirectedGraphConnections$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30678a;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            f30678a = iArr;
            try {
                iArr[ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30678a[ElementOrder.Type.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private UndirectedGraphConnections(Map map) {
        this.f30677a = (Map) Preconditions.checkNotNull(map);
    }

    static UndirectedGraphConnections b(ElementOrder elementOrder) {
        int i10 = AnonymousClass1.f30678a[elementOrder.type().ordinal()];
        if (i10 == 1) {
            return new UndirectedGraphConnections(new HashMap(2, 1.0f));
        }
        if (i10 == 2) {
            return new UndirectedGraphConnections(new LinkedHashMap(2, 1.0f));
        }
        throw new AssertionError(elementOrder.type());
    }

    static UndirectedGraphConnections c(Map map) {
        return new UndirectedGraphConnections(ImmutableMap.copyOf(map));
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N n10, V v10) {
        addSuccessor(n10, v10);
    }

    @Override // com.google.common.graph.GraphConnections
    public V addSuccessor(N n10, V v10) {
        return (V) this.f30677a.put(n10, v10);
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> adjacentNodes() {
        return DesugarCollections.unmodifiableSet(this.f30677a.keySet());
    }

    @Override // com.google.common.graph.GraphConnections
    public Iterator<EndpointPair<N>> incidentEdgeIterator(final N n10) {
        return Iterators.transform(this.f30677a.keySet().iterator(), new Function() { // from class: com.google.common.graph.z
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return EndpointPair.unordered(n10, obj);
            }
        });
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> predecessors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N n10) {
        removeSuccessor(n10);
    }

    @Override // com.google.common.graph.GraphConnections
    public V removeSuccessor(N n10) {
        return (V) this.f30677a.remove(n10);
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> successors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.GraphConnections
    public V value(N n10) {
        return (V) this.f30677a.get(n10);
    }
}
