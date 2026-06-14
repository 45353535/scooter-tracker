package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.DoNotMock;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@Beta
@ElementTypesAreNonnullByDefault
@DoNotMock("Call forGraph or forTree, passing a lambda or a Graph with the desired edges (built with GraphBuilder)")
public abstract class Traverser<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SuccessorsFunction f30659a;

    private enum InsertionOrder {
        FRONT { // from class: com.google.common.graph.Traverser.InsertionOrder.1
            @Override // com.google.common.graph.Traverser.InsertionOrder
            void g(Deque deque, Object obj) {
                deque.addFirst(obj);
            }
        },
        BACK { // from class: com.google.common.graph.Traverser.InsertionOrder.2
            @Override // com.google.common.graph.Traverser.InsertionOrder
            void g(Deque deque, Object obj) {
                deque.addLast(obj);
            }
        };

        abstract void g(Deque deque, Object obj);
    }

    private static abstract class Traversal<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final SuccessorsFunction f30669a;

        Traversal(SuccessorsFunction successorsFunction) {
            this.f30669a = successorsFunction;
        }

        static Traversal b(SuccessorsFunction successorsFunction) {
            final HashSet hashSet = new HashSet();
            return new Traversal<Object>(successorsFunction) { // from class: com.google.common.graph.Traverser.Traversal.1
                @Override // com.google.common.graph.Traverser.Traversal
                Object g(Deque deque) {
                    Iterator it = (Iterator) deque.getFirst();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Objects.requireNonNull(next);
                        if (hashSet.add(next)) {
                            return next;
                        }
                    }
                    deque.removeFirst();
                    return null;
                }
            };
        }

        static Traversal c(SuccessorsFunction successorsFunction) {
            return new Traversal<Object>(successorsFunction) { // from class: com.google.common.graph.Traverser.Traversal.2
                @Override // com.google.common.graph.Traverser.Traversal
                Object g(Deque deque) {
                    Iterator it = (Iterator) deque.getFirst();
                    if (it.hasNext()) {
                        return Preconditions.checkNotNull(it.next());
                    }
                    deque.removeFirst();
                    return null;
                }
            };
        }

        private Iterator f(Iterator it, final InsertionOrder insertionOrder) {
            final ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(it);
            return new AbstractIterator<N>(this) { // from class: com.google.common.graph.Traverser.Traversal.3

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ Traversal f30673f;

                {
                    this.f30673f = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.AbstractIterator
                protected Object computeNext() {
                    do {
                        Object objG = this.f30673f.g(arrayDeque);
                        if (objG != null) {
                            Iterator it2 = this.f30673f.f30669a.successors(objG).iterator();
                            if (it2.hasNext()) {
                                insertionOrder.g(arrayDeque, it2);
                            }
                            return objG;
                        }
                    } while (!arrayDeque.isEmpty());
                    return a();
                }
            };
        }

        final Iterator a(Iterator it) {
            return f(it, InsertionOrder.BACK);
        }

        final Iterator d(Iterator it) {
            final ArrayDeque arrayDeque = new ArrayDeque();
            final ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(it);
            return new AbstractIterator<N>(this) { // from class: com.google.common.graph.Traverser.Traversal.4

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ Traversal f30676f;

                {
                    this.f30676f = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.AbstractIterator
                protected Object computeNext() {
                    while (true) {
                        Object objG = this.f30676f.g(arrayDeque2);
                        if (objG == null) {
                            return !arrayDeque.isEmpty() ? arrayDeque.pop() : a();
                        }
                        Iterator it2 = this.f30676f.f30669a.successors(objG).iterator();
                        if (!it2.hasNext()) {
                            return objG;
                        }
                        arrayDeque2.addFirst(it2);
                        arrayDeque.push(objG);
                    }
                }
            };
        }

        final Iterator e(Iterator it) {
            return f(it, InsertionOrder.FRONT);
        }

        abstract Object g(Deque deque);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private ImmutableSet b(Iterable iterable) {
        ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf(iterable);
        UnmodifiableIterator it = immutableSetCopyOf.iterator();
        while (it.hasNext()) {
            this.f30659a.successors(it.next());
        }
        return immutableSetCopyOf;
    }

    public static <N> Traverser<N> forGraph(final SuccessorsFunction<N> successorsFunction) {
        return new Traverser<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.1
            @Override // com.google.common.graph.Traverser
            Traversal a() {
                return Traversal.b(successorsFunction);
            }
        };
    }

    public static <N> Traverser<N> forTree(final SuccessorsFunction<N> successorsFunction) {
        if (successorsFunction instanceof BaseGraph) {
            Preconditions.checkArgument(((BaseGraph) successorsFunction).isDirected(), "Undirected graphs can never be trees.");
        }
        if (successorsFunction instanceof Network) {
            Preconditions.checkArgument(((Network) successorsFunction).isDirected(), "Undirected networks can never be trees.");
        }
        return new Traverser<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.2
            @Override // com.google.common.graph.Traverser
            Traversal a() {
                return Traversal.c(successorsFunction);
            }
        };
    }

    abstract Traversal a();

    public final Iterable<N> breadthFirst(N n10) {
        return breadthFirst((Iterable) ImmutableSet.of(n10));
    }

    public final Iterable<N> depthFirstPostOrder(N n10) {
        return depthFirstPostOrder((Iterable) ImmutableSet.of(n10));
    }

    public final Iterable<N> depthFirstPreOrder(N n10) {
        return depthFirstPreOrder((Iterable) ImmutableSet.of(n10));
    }

    private Traverser(SuccessorsFunction successorsFunction) {
        this.f30659a = (SuccessorsFunction) Preconditions.checkNotNull(successorsFunction);
    }

    public final Iterable<N> breadthFirst(Iterable<? extends N> iterable) {
        final ImmutableSet immutableSetB = b(iterable);
        return new Iterable<N>(this) { // from class: com.google.common.graph.Traverser.3

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Traverser f30663c;

            {
                this.f30663c = this;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return this.f30663c.a().a(immutableSetB.iterator());
            }
        };
    }

    public final Iterable<N> depthFirstPostOrder(Iterable<? extends N> iterable) {
        final ImmutableSet immutableSetB = b(iterable);
        return new Iterable<N>(this) { // from class: com.google.common.graph.Traverser.5

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Traverser f30667c;

            {
                this.f30667c = this;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return this.f30667c.a().d(immutableSetB.iterator());
            }
        };
    }

    public final Iterable<N> depthFirstPreOrder(Iterable<? extends N> iterable) {
        final ImmutableSet immutableSetB = b(iterable);
        return new Iterable<N>(this) { // from class: com.google.common.graph.Traverser.4

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Traverser f30665c;

            {
                this.f30665c = this;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return this.f30665c.a().e(immutableSetB.iterator());
            }
        };
    }
}
