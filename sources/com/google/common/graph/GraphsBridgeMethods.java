package com.google.common.graph;

import com.google.common.annotations.Beta;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@Beta
@ElementTypesAreNonnullByDefault
abstract class GraphsBridgeMethods {
    public static <N> Set<N> reachableNodes(Graph<N> graph, N n10) {
        return Graphs.reachableNodes((Graph) graph, (Object) n10);
    }

    public static <N> Graph<N> transitiveClosure(Graph<N> graph) {
        return Graphs.transitiveClosure((Graph) graph);
    }
}
