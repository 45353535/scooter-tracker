package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.DirectedGraphConnections;
import com.google.common.graph.ElementOrder;
import j$.util.DesugarCollections;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class DirectedGraphConnections<N, V> implements GraphConnections<N, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f30569e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f30570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f30571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30573d;

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30591a;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            f30591a = iArr;
            try {
                iArr[ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30591a[ElementOrder.Type.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class NodeConnection<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f30592a;

        static final class Pred<N> extends NodeConnection<N> {
            Pred(Object obj) {
                super(obj);
            }

            public boolean equals(Object obj) {
                if (obj instanceof Pred) {
                    return this.f30592a.equals(((Pred) obj).f30592a);
                }
                return false;
            }

            public int hashCode() {
                return Pred.class.hashCode() + this.f30592a.hashCode();
            }
        }

        static final class Succ<N> extends NodeConnection<N> {
            Succ(Object obj) {
                super(obj);
            }

            public boolean equals(Object obj) {
                if (obj instanceof Succ) {
                    return this.f30592a.equals(((Succ) obj).f30592a);
                }
                return false;
            }

            public int hashCode() {
                return Succ.class.hashCode() + this.f30592a.hashCode();
            }
        }

        NodeConnection(Object obj) {
            this.f30592a = Preconditions.checkNotNull(obj);
        }
    }

    private static final class PredAndSucc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f30593a;

        PredAndSucc(Object obj) {
            this.f30593a = obj;
        }
    }

    private DirectedGraphConnections(Map map, List list, int i10, int i11) {
        this.f30570a = (Map) Preconditions.checkNotNull(map);
        this.f30571b = list;
        this.f30572c = Graphs.b(i10);
        this.f30573d = Graphs.b(i11);
        Preconditions.checkState(i10 <= map.size() && i11 <= map.size());
    }

    public static /* synthetic */ EndpointPair b(Object obj, NodeConnection nodeConnection) {
        return nodeConnection instanceof NodeConnection.Succ ? EndpointPair.ordered(obj, nodeConnection.f30592a) : EndpointPair.ordered(nodeConnection.f30592a, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(Object obj) {
        return obj == f30569e || (obj instanceof PredAndSucc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k(Object obj) {
        return (obj == f30569e || obj == null) ? false : true;
    }

    static DirectedGraphConnections l(ElementOrder elementOrder) {
        ArrayList arrayList;
        int i10 = AnonymousClass5.f30591a[elementOrder.type().ordinal()];
        if (i10 == 1) {
            arrayList = null;
        } else {
            if (i10 != 2) {
                throw new AssertionError(elementOrder.type());
            }
            arrayList = new ArrayList();
        }
        return new DirectedGraphConnections(new HashMap(4, 1.0f), arrayList, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static DirectedGraphConnections m(Object obj, Iterable iterable, Function function) {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(function);
        HashMap map = new HashMap();
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = iterable.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            EndpointPair endpointPair = (EndpointPair) it.next();
            if (endpointPair.nodeU().equals(obj) && endpointPair.nodeV().equals(obj)) {
                map.put(obj, new PredAndSucc(function.apply(obj)));
                builder.add(new NodeConnection.Pred(obj));
                builder.add(new NodeConnection.Succ(obj));
                i10++;
            } else if (endpointPair.nodeV().equals(obj)) {
                Object objNodeU = endpointPair.nodeU();
                Object objPut = map.put(objNodeU, f30569e);
                if (objPut != null) {
                    map.put(objNodeU, new PredAndSucc(objPut));
                }
                builder.add(new NodeConnection.Pred(objNodeU));
                i10++;
            } else {
                Preconditions.checkArgument(endpointPair.nodeU().equals(obj));
                Object objNodeV = endpointPair.nodeV();
                Object objApply = function.apply(objNodeV);
                Object objPut2 = map.put(objNodeV, objApply);
                if (objPut2 != null) {
                    Preconditions.checkArgument(objPut2 == f30569e);
                    map.put(objNodeV, new PredAndSucc(objApply));
                }
                builder.add(new NodeConnection.Succ(objNodeV));
            }
            i11++;
        }
        return new DirectedGraphConnections(map, builder.build(), i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N n10, V v10) {
        Map map = this.f30570a;
        Object obj = f30569e;
        Object objPut = map.put(n10, obj);
        if (objPut != null) {
            if (objPut instanceof PredAndSucc) {
                this.f30570a.put(n10, objPut);
                return;
            } else if (objPut == obj) {
                return;
            } else {
                this.f30570a.put(n10, new PredAndSucc(objPut));
            }
        }
        int i10 = this.f30572c + 1;
        this.f30572c = i10;
        Graphs.d(i10);
        List list = this.f30571b;
        if (list != null) {
            list.add(new NodeConnection.Pred(n10));
        }
    }

    @Override // com.google.common.graph.GraphConnections
    public V addSuccessor(N n10, V v10) {
        Object obj = (V) this.f30570a.put(n10, v10);
        if (obj == null) {
            obj = (V) null;
        } else if (obj instanceof PredAndSucc) {
            this.f30570a.put(n10, new PredAndSucc(v10));
            obj = (V) ((PredAndSucc) obj).f30593a;
        } else if (obj == f30569e) {
            this.f30570a.put(n10, new PredAndSucc(v10));
            obj = (V) null;
        }
        if (obj == null) {
            int i10 = this.f30573d + 1;
            this.f30573d = i10;
            Graphs.d(i10);
            List list = this.f30571b;
            if (list != null) {
                list.add(new NodeConnection.Succ(n10));
            }
        }
        if (obj == null) {
            return null;
        }
        return (V) obj;
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> adjacentNodes() {
        return this.f30571b == null ? DesugarCollections.unmodifiableSet(this.f30570a.keySet()) : new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return DirectedGraphConnections.this.f30570a.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.f30570a.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<N> iterator() {
                final Iterator it = DirectedGraphConnections.this.f30571b.iterator();
                final HashSet hashSet = new HashSet();
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.1.1

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f30577f;

                    {
                        this.f30577f = this;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected Object computeNext() {
                        while (it.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) it.next();
                            if (hashSet.add(nodeConnection.f30592a)) {
                                return nodeConnection.f30592a;
                            }
                        }
                        return a();
                    }
                };
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public Iterator<EndpointPair<N>> incidentEdgeIterator(final N n10) {
        Preconditions.checkNotNull(n10);
        List list = this.f30571b;
        final Iterator itConcat = list == null ? Iterators.concat(Iterators.transform(predecessors().iterator(), new Function() { // from class: com.google.common.graph.p
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return EndpointPair.ordered(obj, n10);
            }
        }), Iterators.transform(successors().iterator(), new Function() { // from class: com.google.common.graph.q
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return EndpointPair.ordered(n10, obj);
            }
        })) : Iterators.transform(list.iterator(), new Function() { // from class: com.google.common.graph.r
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return DirectedGraphConnections.b(n10, (DirectedGraphConnections.NodeConnection) obj);
            }
        });
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        return new AbstractIterator<EndpointPair<N>>(this) { // from class: com.google.common.graph.DirectedGraphConnections.4

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ DirectedGraphConnections f30590f;

            {
                this.f30590f = this;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public EndpointPair computeNext() {
                while (itConcat.hasNext()) {
                    EndpointPair endpointPair = (EndpointPair) itConcat.next();
                    if (!endpointPair.nodeU().equals(endpointPair.nodeV()) || !atomicBoolean.getAndSet(true)) {
                        return endpointPair;
                    }
                }
                return (EndpointPair) a();
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> predecessors() {
        return new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return DirectedGraphConnections.j(DirectedGraphConnections.this.f30570a.get(obj));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.f30572c;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<N> iterator() {
                if (DirectedGraphConnections.this.f30571b == null) {
                    final Iterator it = DirectedGraphConnections.this.f30570a.entrySet().iterator();
                    return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.1

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        final /* synthetic */ AnonymousClass2 f30580e;

                        {
                            this.f30580e = this;
                        }

                        @Override // com.google.common.collect.AbstractIterator
                        protected Object computeNext() {
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                if (DirectedGraphConnections.j(entry.getValue())) {
                                    return entry.getKey();
                                }
                            }
                            return a();
                        }
                    };
                }
                final Iterator it2 = DirectedGraphConnections.this.f30571b.iterator();
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.2

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ AnonymousClass2 f30582e;

                    {
                        this.f30582e = this;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected Object computeNext() {
                        while (it2.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) it2.next();
                            if (nodeConnection instanceof NodeConnection.Pred) {
                                return nodeConnection.f30592a;
                            }
                        }
                        return a();
                    }
                };
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N n10) {
        Preconditions.checkNotNull(n10);
        Object obj = this.f30570a.get(n10);
        if (obj == f30569e) {
            this.f30570a.remove(n10);
        } else if (!(obj instanceof PredAndSucc)) {
            return;
        } else {
            this.f30570a.put(n10, ((PredAndSucc) obj).f30593a);
        }
        int i10 = this.f30572c - 1;
        this.f30572c = i10;
        Graphs.b(i10);
        List list = this.f30571b;
        if (list != null) {
            list.remove(new NodeConnection.Pred(n10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.GraphConnections
    public V removeSuccessor(Object obj) {
        Object obj2;
        Preconditions.checkNotNull(obj);
        Object obj3 = (V) this.f30570a.get(obj);
        if (obj3 == null || obj3 == (obj2 = f30569e)) {
            obj3 = (V) null;
        } else if (obj3 instanceof PredAndSucc) {
            this.f30570a.put(obj, obj2);
            obj3 = (V) ((PredAndSucc) obj3).f30593a;
        } else {
            this.f30570a.remove(obj);
        }
        if (obj3 != null) {
            int i10 = this.f30573d - 1;
            this.f30573d = i10;
            Graphs.b(i10);
            List list = this.f30571b;
            if (list != null) {
                list.remove(new NodeConnection.Succ(obj));
            }
        }
        if (obj3 == null) {
            return null;
        }
        return (V) obj3;
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> successors() {
        return new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.3
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return DirectedGraphConnections.k(DirectedGraphConnections.this.f30570a.get(obj));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.f30573d;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<N> iterator() {
                if (DirectedGraphConnections.this.f30571b == null) {
                    final Iterator it = DirectedGraphConnections.this.f30570a.entrySet().iterator();
                    return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.1

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        final /* synthetic */ AnonymousClass3 f30585e;

                        {
                            this.f30585e = this;
                        }

                        @Override // com.google.common.collect.AbstractIterator
                        protected Object computeNext() {
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                if (DirectedGraphConnections.k(entry.getValue())) {
                                    return entry.getKey();
                                }
                            }
                            return a();
                        }
                    };
                }
                final Iterator it2 = DirectedGraphConnections.this.f30571b.iterator();
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.2

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ AnonymousClass3 f30587e;

                    {
                        this.f30587e = this;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected Object computeNext() {
                        while (it2.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) it2.next();
                            if (nodeConnection instanceof NodeConnection.Succ) {
                                return nodeConnection.f30592a;
                            }
                        }
                        return a();
                    }
                };
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.GraphConnections
    public V value(N n10) {
        Preconditions.checkNotNull(n10);
        V v10 = (V) this.f30570a.get(n10);
        if (v10 == f30569e) {
            return null;
        }
        return v10 instanceof PredAndSucc ? (V) ((PredAndSucc) v10).f30593a : v10;
    }
}
