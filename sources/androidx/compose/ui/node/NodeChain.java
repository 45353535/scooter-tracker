package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ModifierInfo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002cdB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010%\u001a\u00020&J\u0018\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0010H\u0002J\r\u0010*\u001a\u00020&H\u0000¢\u0006\u0002\b+J\u0010\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0010H\u0002JE\u0010.\u001a\u0004\u0018\u0001H/\"\u0006\b\u0000\u0010/\u0018\u00012\f\u00100\u001a\b\u0012\u0004\u0012\u0002H/012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u00020\u001903H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b4\u00105J0\u00106\u001a\u00060\rR\u00020\u00002\u0006\u0010#\u001a\u00020\u00102\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:J!\u0010<\u001a\u00020\u00192\n\u00100\u001a\u0006\u0012\u0002\b\u000301H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b=\u0010>J\u0015\u0010<\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u0006H\u0000¢\u0006\u0002\b@J.\u0010\u0011\u001a\u0004\u0018\u0001H/\"\u0006\b\u0000\u0010/\u0018\u00012\f\u00100\u001a\b\u0012\u0004\u0012\u0002H/01H\u0080\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bA\u0010BJ%\u0010C\u001a\u00020&2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&03H\u0080\bø\u0001\u0000¢\u0006\u0002\bDJC\u0010C\u001a\u00020&\"\u0006\b\u0000\u0010/\u0018\u00012\f\u00100\u001a\b\u0012\u0004\u0012\u0002H/012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u00020&03H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bE\u0010FJ-\u0010C\u001a\u00020&2\u0006\u0010?\u001a\u00020\u00062\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&03H\u0080\bø\u0001\u0000¢\u0006\u0002\bDJ%\u0010G\u001a\u00020&2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&03H\u0080\bø\u0001\u0000¢\u0006\u0002\bHJ\u0018\u0010I\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0010H\u0002J\b\u0010J\u001a\u00020&H\u0002J\u0010\u0010K\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0010H\u0002J\u0018\u0010L\u001a\u00020\u00102\u0006\u0010M\u001a\u00020\u00102\u0006\u0010N\u001a\u00020\u0010H\u0002J\r\u0010O\u001a\u00020&H\u0000¢\u0006\u0002\bPJ<\u0010Q\u001a\u00020&2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010R\u001a\u00020\u00062\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010S\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0010H\u0002J\b\u0010T\u001a\u00020&H\u0002J.\u0010#\u001a\u0004\u0018\u0001H/\"\u0006\b\u0000\u0010/\u0018\u00012\f\u00100\u001a\b\u0012\u0004\u0012\u0002H/01H\u0080\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bU\u0010BJ%\u0010V\u001a\u00020&2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&03H\u0080\bø\u0001\u0000¢\u0006\u0002\bWJC\u0010V\u001a\u00020&\"\u0006\b\u0000\u0010/\u0018\u00012\f\u00100\u001a\b\u0012\u0004\u0012\u0002H/012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u00020&03H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bX\u0010FJ-\u0010V\u001a\u00020&2\u0006\u0010?\u001a\u00020\u00062\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&03H\u0080\bø\u0001\u0000¢\u0006\u0002\bWJ\b\u0010Y\u001a\u00020ZH\u0016J\b\u0010[\u001a\u00020&H\u0002J\u0015\u0010\\\u001a\u00020&2\u0006\u0010]\u001a\u00020^H\u0000¢\u0006\u0002\b_J \u0010`\u001a\u00020\u00102\u0006\u0010M\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u0010H\u0002J\u0017\u0010a\u001a\u00020&2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0002\bbR\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0018\u00010\rR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u001f@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006e"}, d2 = {"Landroidx/compose/ui/node/NodeChain;", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "aggregateChildKindSet", "", "getAggregateChildKindSet", "()I", "buffer", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "cachedDiffer", "Landroidx/compose/ui/node/NodeChain$Differ;", "current", "<set-?>", "Landroidx/compose/ui/Modifier$Node;", "head", "getHead$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "innerCoordinator", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/InnerNodeCoordinator;", "isUpdating", "", "()Z", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "logger", "Landroidx/compose/ui/node/NodeChain$Logger;", "Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "getOuterCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "tail", "getTail$ui_release", "attach", "", "createAndInsertNodeAsParent", "element", "child", "detach", "detach$ui_release", "detachAndRemoveNode", "node", "firstFromHead", "T", "type", "Landroidx/compose/ui/node/NodeKind;", "block", "Lkotlin/Function1;", "firstFromHead-aLcG6gQ$ui_release", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getDiffer", "before", "after", "getModifierInfo", "", "Landroidx/compose/ui/layout/ModifierInfo;", "has", "has-H91voCI$ui_release", "(I)Z", "mask", "has$ui_release", "head-H91voCI$ui_release", "(I)Ljava/lang/Object;", "headToTail", "headToTail$ui_release", "headToTail-aLcG6gQ$ui_release", "(ILkotlin/jvm/functions/Function1;)V", "headToTailExclusive", "headToTailExclusive$ui_release", "insertParent", "padChain", "removeNode", "replaceNode", "prev", "next", "resetState", "resetState$ui_release", "structuralUpdate", "beforeSize", "afterSize", "syncCoordinators", "tail-H91voCI$ui_release", "tailToHead", "tailToHead$ui_release", "tailToHead-aLcG6gQ$ui_release", "toString", "", "trimChain", "updateFrom", "m", "Landroidx/compose/ui/Modifier;", "updateFrom$ui_release", "updateNodeAndReplaceIfNeeded", "useLogger", "useLogger$ui_release", "Differ", "Logger", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NodeChain {

    @Nullable
    private MutableVector<Modifier.Element> buffer;

    @Nullable
    private Differ cachedDiffer;

    @Nullable
    private MutableVector<Modifier.Element> current;

    @NotNull
    private Modifier.Node head;

    @NotNull
    private final InnerNodeCoordinator innerCoordinator;

    @NotNull
    private final LayoutNode layoutNode;

    @Nullable
    private Logger logger;

    @NotNull
    private NodeCoordinator outerCoordinator;

    @NotNull
    private final Modifier.Node tail;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nJ\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Landroidx/compose/ui/node/NodeChain$Differ;", "Landroidx/compose/ui/node/DiffCallback;", "node", "Landroidx/compose/ui/Modifier$Node;", "aggregateChildKindSet", "", "before", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "after", "(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;)V", "getAfter", "()Landroidx/compose/runtime/collection/MutableVector;", "setAfter", "(Landroidx/compose/runtime/collection/MutableVector;)V", "getAggregateChildKindSet", "()I", "setAggregateChildKindSet", "(I)V", "getBefore", "setBefore", "getNode", "()Landroidx/compose/ui/Modifier$Node;", "setNode", "(Landroidx/compose/ui/Modifier$Node;)V", "areItemsTheSame", "", "oldIndex", "newIndex", "insert", "", "atIndex", "remove", "same", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class Differ implements DiffCallback {

        @NotNull
        private MutableVector<Modifier.Element> after;
        private int aggregateChildKindSet;

        @NotNull
        private MutableVector<Modifier.Element> before;

        @NotNull
        private Modifier.Node node;
        final /* synthetic */ NodeChain this$0;

        public Differ(@NotNull NodeChain nodeChain, Modifier.Node node, @NotNull int i10, @NotNull MutableVector<Modifier.Element> before, MutableVector<Modifier.Element> after) {
            Intrinsics.checkNotNullParameter(node, "node");
            Intrinsics.checkNotNullParameter(before, "before");
            Intrinsics.checkNotNullParameter(after, "after");
            this.this$0 = nodeChain;
            this.node = node;
            this.aggregateChildKindSet = i10;
            this.before = before;
            this.after = after;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public boolean areItemsTheSame(int oldIndex, int newIndex) {
            return NodeChainKt.actionForModifiers(this.before.getContent()[oldIndex], this.after.getContent()[newIndex]) != 0;
        }

        @NotNull
        public final MutableVector<Modifier.Element> getAfter() {
            return this.after;
        }

        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        @NotNull
        public final MutableVector<Modifier.Element> getBefore() {
            return this.before;
        }

        @NotNull
        public final Modifier.Node getNode() {
            return this.node;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void insert(int atIndex, int newIndex) {
            Modifier.Node node = this.node;
            Modifier.Node nodeCreateAndInsertNodeAsParent = this.this$0.createAndInsertNodeAsParent(this.after.getContent()[newIndex], node);
            this.node = nodeCreateAndInsertNodeAsParent;
            if (nodeCreateAndInsertNodeAsParent.getIsAttached()) {
                throw new IllegalStateException("Check failed.");
            }
            this.node.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
            Logger logger = this.this$0.logger;
            if (logger != null) {
                logger.nodeInserted(atIndex, newIndex, this.after.getContent()[newIndex], node, this.node);
            }
            int kindSet = this.aggregateChildKindSet | this.node.getKindSet();
            this.aggregateChildKindSet = kindSet;
            this.node.setAggregateChildKindSet$ui_release(kindSet);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void remove(int oldIndex) {
            Modifier.Node parent = this.node.getParent();
            Intrinsics.checkNotNull(parent);
            this.node = parent;
            Logger logger = this.this$0.logger;
            if (logger != null) {
                logger.nodeRemoved(oldIndex, this.before.getContent()[oldIndex], this.node);
            }
            this.node = this.this$0.detachAndRemoveNode(this.node);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void same(int oldIndex, int newIndex) {
            Modifier.Node parent = this.node.getParent();
            Intrinsics.checkNotNull(parent);
            this.node = parent;
            Modifier.Element element = this.before.getContent()[oldIndex];
            Modifier.Element element2 = this.after.getContent()[newIndex];
            if (Intrinsics.areEqual(element, element2)) {
                Logger logger = this.this$0.logger;
                if (logger != null) {
                    logger.nodeReused(oldIndex, newIndex, element, element2, this.node);
                }
            } else {
                Modifier.Node node = this.node;
                this.node = this.this$0.updateNodeAndReplaceIfNeeded(element, element2, node);
                Logger logger2 = this.this$0.logger;
                if (logger2 != null) {
                    logger2.nodeUpdated(oldIndex, newIndex, element, element2, node, this.node);
                }
            }
            int kindSet = this.aggregateChildKindSet | this.node.getKindSet();
            this.aggregateChildKindSet = kindSet;
            this.node.setAggregateChildKindSet$ui_release(kindSet);
        }

        public final void setAfter(@NotNull MutableVector<Modifier.Element> mutableVector) {
            Intrinsics.checkNotNullParameter(mutableVector, "<set-?>");
            this.after = mutableVector;
        }

        public final void setAggregateChildKindSet(int i10) {
            this.aggregateChildKindSet = i10;
        }

        public final void setBefore(@NotNull MutableVector<Modifier.Element> mutableVector) {
            Intrinsics.checkNotNullParameter(mutableVector, "<set-?>");
            this.before = mutableVector;
        }

        public final void setNode(@NotNull Modifier.Node node) {
            Intrinsics.checkNotNullParameter(node, "<set-?>");
            this.node = node;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b`\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J0\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH&J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J0\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J8\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeChain$Logger;", "", "linearDiffAborted", "", FirebaseAnalytics.Param.INDEX, "", "prev", "Landroidx/compose/ui/Modifier$Element;", "next", "node", "Landroidx/compose/ui/Modifier$Node;", "nodeInserted", "atIndex", "newIndex", "element", "child", "inserted", "nodeRemoved", "oldIndex", "nodeReused", "nodeUpdated", "before", "after", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Logger {
        void linearDiffAborted(int index, @NotNull Modifier.Element prev, @NotNull Modifier.Element next, @NotNull Modifier.Node node);

        void nodeInserted(int atIndex, int newIndex, @NotNull Modifier.Element element, @NotNull Modifier.Node child, @NotNull Modifier.Node inserted);

        void nodeRemoved(int oldIndex, @NotNull Modifier.Element element, @NotNull Modifier.Node node);

        void nodeReused(int oldIndex, int newIndex, @NotNull Modifier.Element prev, @NotNull Modifier.Element next, @NotNull Modifier.Node node);

        void nodeUpdated(int oldIndex, int newIndex, @NotNull Modifier.Element prev, @NotNull Modifier.Element next, @NotNull Modifier.Node before, @NotNull Modifier.Node after);
    }

    public NodeChain(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        Modifier.Node tail = innerNodeCoordinator.getTail();
        this.tail = tail;
        this.head = tail;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node createAndInsertNodeAsParent(Modifier.Element element, Modifier.Node child) {
        Modifier.Node backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (backwardsCompatNode.getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        return insertParent(backwardsCompatNode, child);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node detachAndRemoveNode(Modifier.Node node) {
        if (node.getIsAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.detach$ui_release();
        }
        return removeNode(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAggregateChildKindSet() {
        return this.head.getAggregateChildKindSet();
    }

    private final Differ getDiffer(Modifier.Node tail, MutableVector<Modifier.Element> before, MutableVector<Modifier.Element> after) {
        Differ differ = this.cachedDiffer;
        if (differ == null) {
            Differ differ2 = new Differ(this, tail, tail.getAggregateChildKindSet(), before, after);
            this.cachedDiffer = differ2;
            return differ2;
        }
        differ.setNode(tail);
        differ.setAggregateChildKindSet(tail.getAggregateChildKindSet());
        differ.setBefore(before);
        differ.setAfter(after);
        return differ;
    }

    private final Modifier.Node insertParent(Modifier.Node node, Modifier.Node child) {
        Modifier.Node parent = child.getParent();
        if (parent != null) {
            parent.setChild$ui_release(node);
            node.setParent$ui_release(parent);
        }
        child.setParent$ui_release(node);
        node.setChild$ui_release(child);
        return node;
    }

    private final boolean isUpdating() {
        return this.head == NodeChainKt.SentinelHead;
    }

    private final void padChain() {
        if (this.head == NodeChainKt.SentinelHead) {
            throw new IllegalStateException("Check failed.");
        }
        Modifier.Node node = this.head;
        node.setParent$ui_release(NodeChainKt.SentinelHead);
        NodeChainKt.SentinelHead.setChild$ui_release(node);
        this.head = NodeChainKt.SentinelHead;
    }

    private final Modifier.Node removeNode(Modifier.Node node) {
        Modifier.Node child = node.getChild();
        Modifier.Node parent = node.getParent();
        if (child != null) {
            child.setParent$ui_release(parent);
            node.setChild$ui_release(null);
        }
        if (parent != null) {
            parent.setChild$ui_release(child);
            node.setParent$ui_release(null);
        }
        Intrinsics.checkNotNull(child);
        return child;
    }

    private final Modifier.Node replaceNode(Modifier.Node prev, Modifier.Node next) {
        Modifier.Node parent = prev.getParent();
        if (parent != null) {
            next.setParent$ui_release(parent);
            parent.setChild$ui_release(next);
            prev.setParent$ui_release(null);
        }
        Modifier.Node child = prev.getChild();
        if (child != null) {
            next.setChild$ui_release(child);
            child.setParent$ui_release(next);
            prev.setChild$ui_release(null);
        }
        next.updateCoordinator$ui_release(prev.getCoordinator());
        return next;
    }

    private final void structuralUpdate(MutableVector<Modifier.Element> before, int beforeSize, MutableVector<Modifier.Element> after, int afterSize, Modifier.Node tail) {
        MyersDiffKt.executeDiff(beforeSize, afterSize, getDiffer(tail, before, after));
    }

    private final void syncCoordinators() {
        NodeCoordinator layoutModifierNodeCoordinator;
        NodeCoordinator nodeCoordinator = this.innerCoordinator;
        for (Modifier.Node parent = this.tail.getParent(); parent != null; parent = parent.getParent()) {
            if ((NodeKind.m3199constructorimpl(2) & parent.getKindSet()) == 0 || !(parent instanceof LayoutModifierNode)) {
                parent.updateCoordinator$ui_release(nodeCoordinator);
            } else {
                if (parent.getCoordinator() != null) {
                    NodeCoordinator coordinator = parent.getCoordinator();
                    Intrinsics.checkNotNull(coordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) coordinator;
                    LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
                    layoutModifierNodeCoordinator.setLayoutModifierNode$ui_release((LayoutModifierNode) parent);
                    if (layoutModifierNode != parent) {
                        layoutModifierNodeCoordinator.onLayoutModifierNodeChanged();
                    }
                } else {
                    layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(this.layoutNode, (LayoutModifierNode) parent);
                    parent.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                }
                nodeCoordinator.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.setWrapped$ui_release(nodeCoordinator);
                nodeCoordinator = layoutModifierNodeCoordinator;
            }
        }
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        nodeCoordinator.setWrappedBy$ui_release(parent$ui_release != null ? parent$ui_release.getInnerCoordinator$ui_release() : null);
        this.outerCoordinator = nodeCoordinator;
    }

    private final void trimChain() {
        if (this.head != NodeChainKt.SentinelHead) {
            throw new IllegalStateException("Check failed.");
        }
        Modifier.Node child = NodeChainKt.SentinelHead.getChild();
        if (child == null) {
            child = this.tail;
        }
        this.head = child;
        child.setParent$ui_release(null);
        NodeChainKt.SentinelHead.setChild$ui_release(null);
        if (this.head == NodeChainKt.SentinelHead) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node updateNodeAndReplaceIfNeeded(Modifier.Element prev, Modifier.Element next, Modifier.Node node) {
        if (!(prev instanceof ModifierNodeElement) || !(next instanceof ModifierNodeElement)) {
            if (!(node instanceof BackwardsCompatNode)) {
                throw new IllegalStateException("Unknown Modifier.Node type");
            }
            ((BackwardsCompatNode) node).setElement(next);
            if (node.getIsAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
                return node;
            }
            node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
            return node;
        }
        ModifierNodeElement modifierNodeElement = (ModifierNodeElement) next;
        Modifier.Node nodeUpdateUnsafe = NodeChainKt.updateUnsafe(modifierNodeElement, node);
        if (nodeUpdateUnsafe == node) {
            if (modifierNodeElement.getAutoInvalidate()) {
                if (nodeUpdateUnsafe.getIsAttached()) {
                    NodeKindKt.autoInvalidateUpdatedNode(nodeUpdateUnsafe);
                    return nodeUpdateUnsafe;
                }
                nodeUpdateUnsafe.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
            }
            return nodeUpdateUnsafe;
        }
        if (nodeUpdateUnsafe.getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        nodeUpdateUnsafe.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        if (node.getIsAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.detach$ui_release();
        }
        return replaceNode(node, nodeUpdateUnsafe);
    }

    public final void attach() {
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            if (!head.getIsAttached()) {
                head.attach$ui_release();
                if (head.getInsertedNodeAwaitingAttachForInvalidation()) {
                    NodeKindKt.autoInvalidateInsertedNode(head);
                }
                if (head.getUpdatedNodeAwaitingAttachForInvalidation()) {
                    NodeKindKt.autoInvalidateUpdatedNode(head);
                }
                head.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
                head.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
            }
        }
    }

    public final void detach$ui_release() {
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.detach$ui_release();
            }
        }
    }

    /* JADX INFO: renamed from: firstFromHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m3161firstFromHeadaLcG6gQ$ui_release(int type, Function1<? super T, Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((getAggregateChildKindSet() & type) == 0) {
            return null;
        }
        for (Modifier.Node head = getHead(); head != null; head = ((Modifier.Node) head).getChild()) {
            if ((((Modifier.Node) head).getKindSet() & type) != 0) {
                Intrinsics.reifiedOperationMarker(3, "T");
                if (block.invoke(head).booleanValue()) {
                    return (T) head;
                }
            }
            if ((((Modifier.Node) head).getAggregateChildKindSet() & type) == 0) {
                return null;
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getHead$ui_release, reason: from getter */
    public final Modifier.Node getHead() {
        return this.head;
    }

    @NotNull
    /* JADX INFO: renamed from: getInnerCoordinator$ui_release, reason: from getter */
    public final InnerNodeCoordinator getInnerCoordinator() {
        return this.innerCoordinator;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @NotNull
    public final List<ModifierInfo> getModifierInfo() {
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector == null) {
            return CollectionsKt.emptyList();
        }
        int i10 = 0;
        MutableVector mutableVector2 = new MutableVector(new ModifierInfo[mutableVector.getSize()], 0);
        Modifier.Node head = getHead();
        while (head != null && head != getTail()) {
            NodeCoordinator coordinator = head.getCoordinator();
            if (coordinator == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            mutableVector2.add(new ModifierInfo(mutableVector.getContent()[i10], coordinator, coordinator.getLayer()));
            head = head.getChild();
            i10++;
        }
        return mutableVector2.asMutableList();
    }

    @NotNull
    /* JADX INFO: renamed from: getOuterCoordinator$ui_release, reason: from getter */
    public final NodeCoordinator getOuterCoordinator() {
        return this.outerCoordinator;
    }

    @NotNull
    /* JADX INFO: renamed from: getTail$ui_release, reason: from getter */
    public final Modifier.Node getTail() {
        return this.tail;
    }

    public final boolean has$ui_release(int mask) {
        return (mask & getAggregateChildKindSet()) != 0;
    }

    /* JADX INFO: renamed from: has-H91voCI$ui_release, reason: not valid java name */
    public final boolean m3162hasH91voCI$ui_release(int type) {
        return (type & getAggregateChildKindSet()) != 0;
    }

    /* JADX INFO: renamed from: head-H91voCI$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m3163headH91voCI$ui_release(int type) {
        if ((getAggregateChildKindSet() & type) == 0) {
            return null;
        }
        for (Object obj = (T) getHead(); obj != null; obj = (T) ((Modifier.Node) obj).getChild()) {
            if ((((Modifier.Node) obj).getKindSet() & type) != 0) {
                Intrinsics.reifiedOperationMarker(3, "T");
                return (T) obj;
            }
            if ((((Modifier.Node) obj).getAggregateChildKindSet() & type) == 0) {
                return null;
            }
        }
        return null;
    }

    public final void headToTail$ui_release(int mask, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((getAggregateChildKindSet() & mask) == 0) {
            return;
        }
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            if ((head.getKindSet() & mask) != 0) {
                block.invoke(head);
            }
            if ((head.getAggregateChildKindSet() & mask) == 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: headToTail-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> void m3164headToTailaLcG6gQ$ui_release(int type, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((getAggregateChildKindSet() & type) != 0) {
            for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & type) != 0) {
                    Intrinsics.reifiedOperationMarker(3, "T");
                    block.invoke(head);
                }
                if ((head.getAggregateChildKindSet() & type) == 0) {
                    return;
                }
            }
        }
    }

    public final void headToTailExclusive$ui_release(@NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        for (Modifier.Node head = getHead(); head != null && head != getTail(); head = head.getChild()) {
            block.invoke(head);
        }
    }

    public final void resetState$ui_release() {
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector == null) {
            return;
        }
        int size = mutableVector.getSize();
        Modifier.Node parent = this.tail.getParent();
        for (int i10 = size - 1; parent != null && i10 >= 0; i10--) {
            if (parent.getIsAttached()) {
                parent.reset$ui_release();
                parent.detach$ui_release();
            }
            parent = parent.getParent();
        }
    }

    /* JADX INFO: renamed from: tail-H91voCI$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m3165tailH91voCI$ui_release(int type) {
        if ((getAggregateChildKindSet() & type) == 0) {
            return null;
        }
        for (Object obj = (T) getTail(); obj != null; obj = (T) ((Modifier.Node) obj).getParent()) {
            if ((((Modifier.Node) obj).getKindSet() & type) != 0) {
                Intrinsics.reifiedOperationMarker(3, "T");
                return (T) obj;
            }
        }
        return null;
    }

    public final void tailToHead$ui_release(int mask, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((getAggregateChildKindSet() & mask) == 0) {
            return;
        }
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if ((tail.getKindSet() & mask) != 0) {
                block.invoke(tail);
            }
        }
    }

    /* JADX INFO: renamed from: tailToHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> void m3166tailToHeadaLcG6gQ$ui_release(int type, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((getAggregateChildKindSet() & type) != 0) {
            for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
                if ((tail.getKindSet() & type) != 0) {
                    Intrinsics.reifiedOperationMarker(3, "T");
                    block.invoke(tail);
                }
            }
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C4240b4.j.f42672d);
        if (this.head == this.tail) {
            sb2.append(C4240b4.j.f42674e);
        } else {
            Modifier.Node head = getHead();
            while (true) {
                if (head == null || head == getTail()) {
                    break;
                }
                sb2.append(String.valueOf(head));
                if (head.getChild() == this.tail) {
                    sb2.append(C4240b4.j.f42674e);
                    break;
                }
                sb2.append(StringUtils.COMMA);
                head = head.getChild();
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void updateFrom$ui_release(@NotNull Modifier m10) {
        MutableVector<Modifier.Element> mutableVector;
        MutableVector<Modifier.Element> mutableVector2;
        MutableVector<Modifier.Element> mutableVector3;
        boolean z10;
        Logger logger;
        Intrinsics.checkNotNullParameter(m10, "m");
        padChain();
        MutableVector<Modifier.Element> mutableVector4 = this.current;
        int kindSet = 0;
        if (mutableVector4 == null) {
            mutableVector4 = new MutableVector<>(new Modifier.Element[0], 0);
        }
        MutableVector<Modifier.Element> mutableVector5 = this.buffer;
        if (mutableVector5 == null) {
            mutableVector5 = new MutableVector<>(new Modifier.Element[16], 0);
        }
        MutableVector<Modifier.Element> mutableVectorFillVector = NodeChainKt.fillVector(m10, mutableVector5);
        boolean z11 = true;
        if (mutableVectorFillVector.getSize() == mutableVector4.getSize()) {
            int size = mutableVector4.getSize() - 1;
            Modifier.Node parent = this.tail.getParent();
            int kindSet2 = 0;
            z10 = false;
            while (true) {
                if (parent == null || size < 0) {
                    break;
                }
                Modifier.Element element = mutableVector4.getContent()[size];
                Modifier.Element element2 = mutableVectorFillVector.getContent()[size];
                int iActionForModifiers = NodeChainKt.actionForModifiers(element, element2);
                if (iActionForModifiers != 0) {
                    if (iActionForModifiers == 1) {
                        Modifier.Node nodeUpdateNodeAndReplaceIfNeeded = updateNodeAndReplaceIfNeeded(element, element2, parent);
                        Logger logger2 = this.logger;
                        if (logger2 != null) {
                            logger2.nodeUpdated(size, size, element, element2, parent, nodeUpdateNodeAndReplaceIfNeeded);
                        }
                        parent = nodeUpdateNodeAndReplaceIfNeeded;
                    } else if (iActionForModifiers == 2 && (logger = this.logger) != null) {
                        logger.nodeReused(size, size, element, element2, parent);
                    }
                    if (!parent.getIsAttached()) {
                        z10 = true;
                    }
                    kindSet2 |= parent.getKindSet();
                    parent.setAggregateChildKindSet$ui_release(kindSet2);
                    parent = parent.getParent();
                    size--;
                } else {
                    Logger logger3 = this.logger;
                    if (logger3 != null) {
                        logger3.linearDiffAborted(size, element, element2, parent);
                    }
                    size++;
                    parent = parent.getChild();
                }
            }
            if (size <= 0) {
                MutableVector<Modifier.Element> mutableVector6 = mutableVector4;
                mutableVector = mutableVectorFillVector;
                mutableVector2 = mutableVector6;
                z11 = false;
                mutableVector3 = mutableVector;
            } else {
                if (parent == null) {
                    throw new IllegalStateException("Check failed.");
                }
                mutableVector3 = mutableVectorFillVector;
                mutableVector2 = mutableVector4;
                structuralUpdate(mutableVector2, size, mutableVector3, size, parent);
                z10 = true;
            }
        } else {
            MutableVector<Modifier.Element> mutableVector7 = mutableVector4;
            mutableVector = mutableVectorFillVector;
            mutableVector2 = mutableVector7;
            if (mutableVector2.getSize() == 0) {
                int size2 = mutableVector.getSize() - 1;
                Modifier.Node node = this.tail;
                while (size2 >= 0) {
                    Modifier.Element element3 = mutableVector.getContent()[size2];
                    Modifier.Node nodeCreateAndInsertNodeAsParent = createAndInsertNodeAsParent(element3, node);
                    Logger logger4 = this.logger;
                    if (logger4 != null) {
                        logger4.nodeInserted(0, size2, element3, node, nodeCreateAndInsertNodeAsParent);
                    }
                    kindSet |= nodeCreateAndInsertNodeAsParent.getKindSet();
                    nodeCreateAndInsertNodeAsParent.setAggregateChildKindSet$ui_release(kindSet);
                    size2--;
                    node = nodeCreateAndInsertNodeAsParent;
                }
                mutableVector3 = mutableVector;
            } else if (mutableVector.getSize() == 0) {
                int size3 = mutableVector2.getSize() - 1;
                Modifier.Node parent2 = this.tail.getParent();
                while (parent2 != null && size3 >= 0) {
                    Logger logger5 = this.logger;
                    if (logger5 != null) {
                        logger5.nodeRemoved(size3, mutableVector2.getContent()[size3], parent2);
                    }
                    Modifier.Node parent3 = parent2.getParent();
                    detachAndRemoveNode(parent2);
                    size3--;
                    parent2 = parent3;
                }
                z10 = false;
                mutableVector3 = mutableVector;
            } else {
                mutableVector3 = mutableVector;
                structuralUpdate(mutableVector2, mutableVector2.getSize(), mutableVector3, mutableVector3.getSize(), this.tail);
            }
            z10 = true;
        }
        this.current = mutableVector3;
        mutableVector2.clear();
        this.buffer = mutableVector2;
        trimChain();
        if (z11) {
            syncCoordinators();
        }
        if (z10 && this.layoutNode.isAttached()) {
            attach();
        }
    }

    public final void useLogger$ui_release(@Nullable Logger logger) {
        this.logger = logger;
    }

    public final void tailToHead$ui_release(@NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            block.invoke(tail);
        }
    }

    public final void headToTail$ui_release(@NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            block.invoke(head);
        }
    }
}
