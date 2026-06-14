package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
@Beta
@GwtCompatible
@Deprecated
@ElementTypesAreNonnullByDefault
public abstract class TreeTraverser<T> {

    private final class BreadthFirstIterator extends UnmodifiableIterator<T> implements PeekingIterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Queue f30418b;

        BreadthFirstIterator(Object obj) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f30418b = arrayDeque;
            arrayDeque.add(obj);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f30418b.isEmpty();
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
        @Override // java.util.Iterator, com.google.common.collect.PeekingIterator
        public T next() {
            T t10 = (T) this.f30418b.remove();
            Iterables.addAll(this.f30418b, TreeTraverser.this.children(t10));
            return t10;
        }

        @Override // com.google.common.collect.PeekingIterator
        public T peek() {
            return (T) this.f30418b.element();
        }
    }

    private final class PostOrderIterator extends AbstractIterator<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ArrayDeque f30420d;

        PostOrderIterator(Object obj) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f30420d = arrayDeque;
            arrayDeque.addLast(c(obj));
        }

        private PostOrderNode c(Object obj) {
            return new PostOrderNode(obj, TreeTraverser.this.children(obj).iterator());
        }

        @Override // com.google.common.collect.AbstractIterator
        protected Object computeNext() {
            while (!this.f30420d.isEmpty()) {
                PostOrderNode postOrderNode = (PostOrderNode) this.f30420d.getLast();
                if (!postOrderNode.f30423b.hasNext()) {
                    this.f30420d.removeLast();
                    return postOrderNode.f30422a;
                }
                this.f30420d.addLast(c(postOrderNode.f30423b.next()));
            }
            return a();
        }
    }

    private static final class PostOrderNode<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f30422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Iterator f30423b;

        PostOrderNode(Object obj, Iterator it) {
            this.f30422a = Preconditions.checkNotNull(obj);
            this.f30423b = (Iterator) Preconditions.checkNotNull(it);
        }
    }

    private final class PreOrderIterator extends UnmodifiableIterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Deque f30424b;

        PreOrderIterator(Object obj) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f30424b = arrayDeque;
            arrayDeque.addLast(Iterators.singletonIterator(Preconditions.checkNotNull(obj)));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f30424b.isEmpty();
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
        @Override // java.util.Iterator
        public T next() {
            Iterator it = (Iterator) this.f30424b.getLast();
            T t10 = (T) Preconditions.checkNotNull(it.next());
            if (!it.hasNext()) {
                this.f30424b.removeLast();
            }
            Iterator<T> it2 = TreeTraverser.this.children(t10).iterator();
            if (it2.hasNext()) {
                this.f30424b.addLast(it2);
            }
            return t10;
        }
    }

    @Deprecated
    public static <T> TreeTraverser<T> using(final Function<T, ? extends Iterable<T>> function) {
        Preconditions.checkNotNull(function);
        return new TreeTraverser<T>() { // from class: com.google.common.collect.TreeTraverser.1
            @Override // com.google.common.collect.TreeTraverser
            public Iterable<T> children(T t10) {
                return (Iterable) function.apply(t10);
            }
        };
    }

    UnmodifiableIterator a(Object obj) {
        return new PostOrderIterator(obj);
    }

    UnmodifiableIterator b(Object obj) {
        return new PreOrderIterator(obj);
    }

    @Deprecated
    public final FluentIterable<T> breadthFirstTraversal(final T t10) {
        Preconditions.checkNotNull(t10);
        return new FluentIterable<T>(this) { // from class: com.google.common.collect.TreeTraverser.4

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ TreeTraverser f30417d;

            {
                this.f30417d = this;
            }

            @Override // java.lang.Iterable
            public UnmodifiableIterator<T> iterator() {
                return new BreadthFirstIterator(t10);
            }
        };
    }

    public abstract Iterable<T> children(T t10);

    @Deprecated
    public final FluentIterable<T> postOrderTraversal(final T t10) {
        Preconditions.checkNotNull(t10);
        return new FluentIterable<T>(this) { // from class: com.google.common.collect.TreeTraverser.3

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ TreeTraverser f30415d;

            {
                this.f30415d = this;
            }

            @Override // java.lang.Iterable
            public UnmodifiableIterator<T> iterator() {
                return this.f30415d.a(t10);
            }
        };
    }

    @Deprecated
    public final FluentIterable<T> preOrderTraversal(final T t10) {
        Preconditions.checkNotNull(t10);
        return new FluentIterable<T>(this) { // from class: com.google.common.collect.TreeTraverser.2

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ TreeTraverser f30413d;

            {
                this.f30413d = this;
            }

            @Override // java.lang.Iterable
            public UnmodifiableIterator<T> iterator() {
                return this.f30413d.b(t10);
            }
        };
    }
}
