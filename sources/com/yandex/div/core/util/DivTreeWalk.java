package com.yandex.div.core.util;

import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractIterator;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u000e\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001b\u001c\u001d\u001eBO\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\t\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\u0015J!\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/util/DivTreeWalk;", "Lkotlin/sequences/Sequence;", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "Lk8/y0;", "root", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lkotlin/Function1;", "", "onEnter", "", "onLeave", "", "maxDepth", "<init>", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "", "iterator", "()Ljava/util/Iterator;", "predicate", "(Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/core/util/DivTreeWalk;", "function", "Lk8/y0;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Lkotlin/jvm/functions/Function1;", "I", "BranchNode", "DivTreeWalkIterator", "LeafNode", "Node", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivTreeWalk implements Sequence<DivItemBuilderResult> {
    private final int maxDepth;

    @Nullable
    private final Function1<y0, Boolean> onEnter;

    @Nullable
    private final Function1<y0, Unit> onLeave;

    @NotNull
    private final ExpressionResolver resolver;

    @NotNull
    private final y0 root;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/util/DivTreeWalk$BranchNode;", "Lcom/yandex/div/core/util/DivTreeWalk$Node;", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "item", "Lkotlin/Function1;", "Lk8/y0;", "", "onEnter", "", "onLeave", "<init>", "(Lcom/yandex/div/internal/core/DivItemBuilderResult;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "step", "()Lcom/yandex/div/internal/core/DivItemBuilderResult;", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "getItem", "Lkotlin/jvm/functions/Function1;", "rootVisited", "Z", "", "children", "Ljava/util/List;", "", "childIndex", "I", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class BranchNode implements Node {
        private int childIndex;

        @Nullable
        private List<DivItemBuilderResult> children;

        @NotNull
        private final DivItemBuilderResult item;

        @Nullable
        private final Function1<y0, Boolean> onEnter;

        @Nullable
        private final Function1<y0, Unit> onLeave;
        private boolean rootVisited;

        /* JADX WARN: Multi-variable type inference failed */
        public BranchNode(@NotNull DivItemBuilderResult divItemBuilderResult, @Nullable Function1<? super y0, Boolean> function1, @Nullable Function1<? super y0, Unit> function12) {
            this.item = divItemBuilderResult;
            this.onEnter = function1;
            this.onLeave = function12;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @NotNull
        public DivItemBuilderResult getItem() {
            return this.item;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @Nullable
        public DivItemBuilderResult step() {
            if (!this.rootVisited) {
                Function1<y0, Boolean> function1 = this.onEnter;
                if (function1 != null && !function1.invoke(getItem().getDiv()).booleanValue()) {
                    return null;
                }
                this.rootVisited = true;
                return getItem();
            }
            List<DivItemBuilderResult> items = this.children;
            if (items == null) {
                items = DivTreeWalkKt.getItems(getItem().getDiv(), getItem().getExpressionResolver());
                this.children = items;
            }
            if (this.childIndex < items.size()) {
                int i10 = this.childIndex;
                this.childIndex = i10 + 1;
                return items.get(i10);
            }
            Function1<y0, Unit> function12 = this.onLeave;
            if (function12 != null) {
                function12.invoke(getItem().getDiv());
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/util/DivTreeWalk$DivTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "Lk8/y0;", "root", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "<init>", "(Lcom/yandex/div/core/util/DivTreeWalk;Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "nextItem", "()Lcom/yandex/div/internal/core/DivItemBuilderResult;", "item", "Lcom/yandex/div/core/util/DivTreeWalk$Node;", "node", "(Lcom/yandex/div/internal/core/DivItemBuilderResult;)Lcom/yandex/div/core/util/DivTreeWalk$Node;", "", "computeNext", "()V", "Lk8/y0;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Lkotlin/collections/ArrayDeque;", "stack", "Lkotlin/collections/ArrayDeque;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class DivTreeWalkIterator extends AbstractIterator<DivItemBuilderResult> {

        @NotNull
        private final ExpressionResolver resolver;

        @NotNull
        private final y0 root;

        @NotNull
        private final ArrayDeque<Node> stack;

        public DivTreeWalkIterator(@NotNull y0 y0Var, @NotNull ExpressionResolver expressionResolver) {
            this.root = y0Var;
            this.resolver = expressionResolver;
            ArrayDeque<Node> arrayDeque = new ArrayDeque<>();
            arrayDeque.addLast(node(DivCollectionExtensionsKt.toItemBuilderResult(y0Var, expressionResolver)));
            this.stack = arrayDeque;
        }

        private final DivItemBuilderResult nextItem() {
            Node nodeLastOrNull = this.stack.lastOrNull();
            if (nodeLastOrNull == null) {
                return null;
            }
            DivItemBuilderResult divItemBuilderResultStep = nodeLastOrNull.step();
            if (divItemBuilderResultStep == null) {
                this.stack.removeLast();
                return nextItem();
            }
            if (divItemBuilderResultStep == nodeLastOrNull.getItem() || DivUtilKt.isLeaf(divItemBuilderResultStep.getDiv()) || this.stack.size() >= DivTreeWalk.this.maxDepth) {
                return divItemBuilderResultStep;
            }
            this.stack.addLast(node(divItemBuilderResultStep));
            return nextItem();
        }

        private final Node node(DivItemBuilderResult item) {
            return DivUtilKt.isBranch(item.getDiv()) ? new BranchNode(item, DivTreeWalk.this.onEnter, DivTreeWalk.this.onLeave) : new LeafNode(item);
        }

        @Override // kotlin.collections.AbstractIterator
        protected void computeNext() {
            DivItemBuilderResult divItemBuilderResultNextItem = nextItem();
            if (divItemBuilderResultNextItem != null) {
                setNext(divItemBuilderResultNextItem);
            } else {
                done();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/util/DivTreeWalk$LeafNode;", "Lcom/yandex/div/core/util/DivTreeWalk$Node;", "item", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "(Lcom/yandex/div/internal/core/DivItemBuilderResult;)V", "getItem", "()Lcom/yandex/div/internal/core/DivItemBuilderResult;", "visited", "", "step", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class LeafNode implements Node {

        @NotNull
        private final DivItemBuilderResult item;
        private boolean visited;

        public LeafNode(@NotNull DivItemBuilderResult divItemBuilderResult) {
            this.item = divItemBuilderResult;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @NotNull
        public DivItemBuilderResult getItem() {
            return this.item;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @Nullable
        public DivItemBuilderResult step() {
            if (this.visited) {
                return null;
            }
            this.visited = true;
            return getItem();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/util/DivTreeWalk$Node;", "", "item", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "getItem", "()Lcom/yandex/div/internal/core/DivItemBuilderResult;", "step", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private interface Node {
        @NotNull
        DivItemBuilderResult getItem();

        @Nullable
        DivItemBuilderResult step();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DivTreeWalk(y0 y0Var, ExpressionResolver expressionResolver, Function1<? super y0, Boolean> function1, Function1<? super y0, Unit> function12, int i10) {
        this.root = y0Var;
        this.resolver = expressionResolver;
        this.onEnter = function1;
        this.onLeave = function12;
        this.maxDepth = i10;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<DivItemBuilderResult> iterator() {
        return new DivTreeWalkIterator(this.root, this.resolver);
    }

    @NotNull
    public final DivTreeWalk onEnter(@NotNull Function1<? super y0, Boolean> predicate) {
        return new DivTreeWalk(this.root, this.resolver, predicate, this.onLeave, this.maxDepth);
    }

    @NotNull
    public final DivTreeWalk onLeave(@NotNull Function1<? super y0, Unit> function) {
        return new DivTreeWalk(this.root, this.resolver, this.onEnter, function, this.maxDepth);
    }

    /* synthetic */ DivTreeWalk(y0 y0Var, ExpressionResolver expressionResolver, Function1 function1, Function1 function12, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(y0Var, expressionResolver, function1, function12, (i11 & 16) != 0 ? Integer.MAX_VALUE : i10);
    }

    public DivTreeWalk(@NotNull y0 y0Var, @NotNull ExpressionResolver expressionResolver) {
        this(y0Var, expressionResolver, null, null, 0, 16, null);
    }
}
