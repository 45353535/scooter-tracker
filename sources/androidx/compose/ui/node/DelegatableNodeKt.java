package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a8\u0010\u0005\u001a\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u0006\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0081\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006*\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a6\u0010\u000f\u001a\u0004\u0018\u0001H\u0007\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0010*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0081\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0003*\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a%\u0010\u0013\u001a\u00020\u0014*\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\u0001*\u00020\bH\u0007\u001a2\u0010\u0018\u001a\u0004\u0018\u0001H\u0007\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0081\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0012\u001a\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0003*\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a2\u0010\u001a\u001a\u0004\u0018\u0001H\u0007\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0081\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0012\u001a\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0003*\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a6\u0010\u001c\u001a\u0004\u0018\u0001H\u0007\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0010*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0081\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0012\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0003*\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a%\u0010\u001e\u001a\u00020\u001f*\u00020\b2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\nH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a\f\u0010#\u001a\u00020$*\u00020\bH\u0001\u001a\f\u0010%\u001a\u00020&*\u00020\bH\u0001\u001aG\u0010'\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001a,\u0010'\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002\u001aG\u0010,\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010+\u001a,\u0010,\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002\u001aG\u0010.\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010+\u001a,\u0010.\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002\u001aG\u00100\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010+\u001a,\u00100\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002\u001aG\u00102\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u0010+\u001a,\u00102\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002\u001aG\u00104\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00140)H\u0081\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u0010+\u001a,\u00104\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140)H\u0081\bø\u0001\u0002\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u00066"}, d2 = {"addLayoutNodeChildren", "", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Node;", "node", "ancestors", "", "T", "Landroidx/compose/ui/node/DelegatableNode;", "type", "Landroidx/compose/ui/node/NodeKind;", "ancestors-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/util/List;", "mask", "", "firstChild", "", "firstChild-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "has", "", "has-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Z", "invalidateSubtree", "localChild", "localChild-64DMado", "localParent", "localParent-64DMado", "nearestAncestor", "nearestAncestor-64DMado", "requireCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "kind", "requireCoordinator-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;", "requireLayoutNode", "Landroidx/compose/ui/node/LayoutNode;", "requireOwner", "Landroidx/compose/ui/node/Owner;", "visitAncestors", "block", "Lkotlin/Function1;", "visitAncestors-6rFNWt0", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;)V", "visitChildren", "visitChildren-6rFNWt0", "visitLocalChildren", "visitLocalChildren-6rFNWt0", "visitLocalParents", "visitLocalParents-6rFNWt0", "visitSubtree", "visitSubtree-6rFNWt0", "visitSubtreeIf", "visitSubtreeIf-6rFNWt0", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DelegatableNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node) {
        MutableVector<LayoutNode> mutableVector2 = requireLayoutNode(node).get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            int i10 = size - 1;
            LayoutNode[] content = mutableVector2.getContent();
            do {
                mutableVector.add(content[i10].getNodes().getHead());
                i10--;
            } while (i10 >= 0);
        }
    }

    @ExperimentalComposeUiApi
    @Nullable
    public static final List<Modifier.Node> ancestors(@NotNull DelegatableNode delegatableNode, int i10) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i10) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i10) != 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(parent);
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return arrayList;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: ancestors-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> List<T> m3097ancestors64DMado(DelegatableNode ancestors, int i10) {
        Intrinsics.checkNotNullParameter(ancestors, "$this$ancestors");
        List<T> list = (List<T>) ancestors(ancestors, i10);
        if (list instanceof List) {
            return list;
        }
        return null;
    }

    @ExperimentalComposeUiApi
    @Nullable
    public static final Modifier.Node firstChild(@NotNull DelegatableNode delegatableNode, int i10) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & i10) == 0) {
                addLayoutNodeChildren(mutableVector, child2);
            } else {
                while (child2 != null) {
                    if ((child2.getKindSet() & i10) != 0) {
                        return child2;
                    }
                    child2 = child2.getChild();
                }
            }
        }
        return null;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: firstChild-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m3098firstChild64DMado(DelegatableNode firstChild, int i10) {
        Intrinsics.checkNotNullParameter(firstChild, "$this$firstChild");
        T t10 = (T) firstChild(firstChild, i10);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t10;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m3099has64DMado(@NotNull DelegatableNode has, int i10) {
        Intrinsics.checkNotNullParameter(has, "$this$has");
        return (has.getNode().getAggregateChildKindSet() & i10) != 0;
    }

    @ExperimentalComposeUiApi
    public static final void invalidateSubtree(@NotNull DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        if (delegatableNode.getNode().getIsAttached()) {
            LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    @ExperimentalComposeUiApi
    @Nullable
    public static final Modifier.Node localChild(@NotNull DelegatableNode delegatableNode, int i10) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & i10) == 0) {
            return null;
        }
        while (child != null) {
            if ((child.getKindSet() & i10) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: localChild-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m3100localChild64DMado(DelegatableNode localChild, int i10) {
        Intrinsics.checkNotNullParameter(localChild, "$this$localChild");
        T t10 = (T) localChild(localChild, i10);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t10;
    }

    @ExperimentalComposeUiApi
    @Nullable
    public static final Modifier.Node localParent(@NotNull DelegatableNode delegatableNode, int i10) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        for (Modifier.Node parent = delegatableNode.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i10) != 0) {
                return parent;
            }
        }
        return null;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: localParent-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m3101localParent64DMado(DelegatableNode localParent, int i10) {
        Intrinsics.checkNotNullParameter(localParent, "$this$localParent");
        T t10 = (T) localParent(localParent, i10);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t10;
    }

    @ExperimentalComposeUiApi
    @Nullable
    public static final Modifier.Node nearestAncestor(@NotNull DelegatableNode delegatableNode, int i10) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i10) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i10) != 0) {
                        return parent;
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: nearestAncestor-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m3102nearestAncestor64DMado(DelegatableNode nearestAncestor, int i10) {
        Intrinsics.checkNotNullParameter(nearestAncestor, "$this$nearestAncestor");
        T t10 = (T) nearestAncestor(nearestAncestor, i10);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t10;
    }

    @ExperimentalComposeUiApi
    @NotNull
    /* JADX INFO: renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final NodeCoordinator m3103requireCoordinator64DMado(@NotNull DelegatableNode requireCoordinator, int i10) {
        Intrinsics.checkNotNullParameter(requireCoordinator, "$this$requireCoordinator");
        NodeCoordinator coordinator = requireCoordinator.getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        if (coordinator.getTail() != requireCoordinator || !NodeKindKt.m3207getIncludeSelfInTraversalH91voCI(i10)) {
            return coordinator;
        }
        NodeCoordinator wrapped = coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped);
        return wrapped;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final LayoutNode requireLayoutNode(@NotNull DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        NodeCoordinator coordinator = delegatableNode.getNode().getCoordinator();
        if (coordinator != null) {
            return coordinator.getLayoutNode();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final Owner requireOwner(@NotNull DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Owner owner = requireLayoutNode(delegatableNode).getOwner();
        if (owner != null) {
            return owner;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @ExperimentalComposeUiApi
    public static final void visitAncestors(@NotNull DelegatableNode delegatableNode, int i10, @NotNull Function1<? super Modifier.Node, Unit> block) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i10) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i10) != 0) {
                        block.invoke(parent);
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: visitAncestors-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3104visitAncestors6rFNWt0(DelegatableNode visitAncestors, int i10, Function1<? super T, Unit> block) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(visitAncestors, "$this$visitAncestors");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitAncestors.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        Modifier.Node parent = visitAncestors.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(visitAncestors);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i10) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i10) != 0) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        block.invoke(parent);
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    @ExperimentalComposeUiApi
    public static final void visitChildren(@NotNull DelegatableNode delegatableNode, int i10, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & i10) == 0) {
                addLayoutNodeChildren(mutableVector, child2);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & i10) != 0) {
                        block.invoke(child2);
                        break;
                    }
                    child2 = child2.getChild();
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: visitChildren-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3105visitChildren6rFNWt0(DelegatableNode visitChildren, int i10, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitChildren, "$this$visitChildren");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitChildren.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = visitChildren.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, visitChildren.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & i10) == 0) {
                addLayoutNodeChildren(mutableVector, child2);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & i10) != 0) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        block.invoke(child2);
                        break;
                    }
                    child2 = child2.getChild();
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final void visitLocalChildren(@NotNull DelegatableNode delegatableNode, int i10, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i10) == 0) {
            return;
        }
        for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
            if ((child.getKindSet() & i10) != 0) {
                block.invoke(child);
            }
        }
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: visitLocalChildren-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3106visitLocalChildren6rFNWt0(DelegatableNode visitLocalChildren, int i10, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitLocalChildren, "$this$visitLocalChildren");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitLocalChildren.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        Modifier.Node node = visitLocalChildren.getNode();
        if ((node.getAggregateChildKindSet() & i10) != 0) {
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & i10) != 0) {
                    Intrinsics.reifiedOperationMarker(3, "T");
                    block.invoke(child);
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final void visitLocalParents(@NotNull DelegatableNode delegatableNode, int i10, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        for (Modifier.Node parent = delegatableNode.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i10) != 0) {
                block.invoke(parent);
            }
        }
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: visitLocalParents-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3107visitLocalParents6rFNWt0(DelegatableNode visitLocalParents, int i10, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitLocalParents, "$this$visitLocalParents");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitLocalParents.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        for (Modifier.Node parent = visitLocalParents.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i10) != 0) {
                Intrinsics.reifiedOperationMarker(3, "T");
                block.invoke(parent);
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final void visitSubtree(@NotNull DelegatableNode delegatableNode, int i10, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        Modifier.Node child = delegatableNode.getNode().getChild();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        NestedVectorStack nestedVectorStack = new NestedVectorStack();
        while (layoutNodeRequireLayoutNode != null) {
            if (child == null) {
                child = layoutNodeRequireLayoutNode.getNodes().getHead();
            }
            if ((child.getAggregateChildKindSet() & i10) != 0) {
                while (child != null) {
                    if ((child.getKindSet() & i10) != 0) {
                        block.invoke(child);
                    }
                    child = child.getChild();
                }
                child = null;
            }
            nestedVectorStack.push(layoutNodeRequireLayoutNode.get_children$ui_release());
            layoutNodeRequireLayoutNode = nestedVectorStack.isNotEmpty() ? (LayoutNode) nestedVectorStack.pop() : null;
        }
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: visitSubtree-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3108visitSubtree6rFNWt0(DelegatableNode visitSubtree, int i10, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitSubtree, "$this$visitSubtree");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitSubtree.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        Modifier.Node child = visitSubtree.getNode().getChild();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(visitSubtree);
        NestedVectorStack nestedVectorStack = new NestedVectorStack();
        while (layoutNodeRequireLayoutNode != null) {
            if (child == null) {
                child = layoutNodeRequireLayoutNode.getNodes().getHead();
            }
            if ((child.getAggregateChildKindSet() & i10) != 0) {
                while (child != null) {
                    if ((child.getKindSet() & i10) != 0) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        block.invoke(child);
                    }
                    child = child.getChild();
                }
                child = null;
            }
            nestedVectorStack.push(layoutNodeRequireLayoutNode.get_children$ui_release());
            layoutNodeRequireLayoutNode = nestedVectorStack.isNotEmpty() ? (LayoutNode) nestedVectorStack.pop() : null;
        }
    }

    @ExperimentalComposeUiApi
    public static final void visitSubtreeIf(@NotNull DelegatableNode delegatableNode, int i10, @NotNull Function1<? super Modifier.Node, Boolean> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i10) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & i10) == 0 || block.invoke(child2).booleanValue()) {
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node);
        }
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: visitSubtreeIf-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3109visitSubtreeIf6rFNWt0(DelegatableNode visitSubtreeIf, int i10, Function1<? super T, Boolean> block) {
        Intrinsics.checkNotNullParameter(visitSubtreeIf, "$this$visitSubtreeIf");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitSubtreeIf.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = visitSubtreeIf.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, visitSubtreeIf.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i10) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & i10) != 0) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        if (block.invoke(child2).booleanValue()) {
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node);
        }
    }
}
