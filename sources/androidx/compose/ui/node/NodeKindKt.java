package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.layout.IntermediateLayoutModifier;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.LookaheadOnPlacedModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a&\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0080\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\f*\u00020\u001bH\u0003\u001a\f\u0010\u001c\u001a\u00020\u0005*\u00020\u001bH\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"%\u0010\u0004\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u00068@X\u0080\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Inserted", "", "Removed", "Updated", "includeSelfInTraversal", "", "Landroidx/compose/ui/node/NodeKind;", "getIncludeSelfInTraversal-H91voCI$annotations", "(I)V", "getIncludeSelfInTraversal-H91voCI", "(I)Z", "autoInvalidateInsertedNode", "", "node", "Landroidx/compose/ui/Modifier$Node;", "autoInvalidateNode", TypedValues.CycleType.S_WAVE_PHASE, "autoInvalidateRemovedNode", "autoInvalidateUpdatedNode", "calculateNodeKindSetFrom", "element", "Landroidx/compose/ui/Modifier$Element;", "or", "other", "or-64DMado", "(II)I", "scheduleInvalidationOfAssociatedFocusTargets", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "specifiesCanFocusProperty", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class NodeKindKt {
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private static final int Updated = 0;

    public static final void autoInvalidateInsertedNode(@NotNull Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        autoInvalidateNode(node, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void autoInvalidateNode(Modifier.Node node, int i10) {
        if (!node.getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        if ((NodeKind.m3199constructorimpl(2) & node.getKindSet()) != 0 && (node instanceof LayoutModifierNode)) {
            LayoutModifierNodeKt.invalidateMeasurements((LayoutModifierNode) node);
            if (i10 == 2) {
                DelegatableNodeKt.m3103requireCoordinator64DMado(node, NodeKind.m3199constructorimpl(2)).onRelease();
            }
        }
        if ((NodeKind.m3199constructorimpl(256) & node.getKindSet()) != 0 && (node instanceof GlobalPositionAwareModifierNode)) {
            DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui_release();
        }
        if ((NodeKind.m3199constructorimpl(4) & node.getKindSet()) != 0 && (node instanceof DrawModifierNode)) {
            DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
        }
        if ((NodeKind.m3199constructorimpl(8) & node.getKindSet()) != 0 && (node instanceof SemanticsModifierNode)) {
            SemanticsModifierNodeKt.invalidateSemantics((SemanticsModifierNode) node);
        }
        if ((NodeKind.m3199constructorimpl(64) & node.getKindSet()) != 0 && (node instanceof ParentDataModifierNode)) {
            ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
        }
        if ((NodeKind.m3199constructorimpl(1024) & node.getKindSet()) != 0 && (node instanceof FocusTargetModifierNode)) {
            if (i10 == 2) {
                node.onReset();
            } else {
                DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation((FocusTargetModifierNode) node);
            }
        }
        if ((NodeKind.m3199constructorimpl(2048) & node.getKindSet()) != 0 && (node instanceof FocusPropertiesModifierNode)) {
            FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
            if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                if (i10 == 2) {
                    scheduleInvalidationOfAssociatedFocusTargets(focusPropertiesModifierNode);
                } else {
                    DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation(focusPropertiesModifierNode);
                }
            }
        }
        if ((NodeKind.m3199constructorimpl(4096) & node.getKindSet()) == 0 || !(node instanceof FocusEventModifierNode) || i10 == 2) {
            return;
        }
        DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation((FocusEventModifierNode) node);
    }

    public static final void autoInvalidateRemovedNode(@NotNull Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        autoInvalidateNode(node, 2);
    }

    public static final void autoInvalidateUpdatedNode(@NotNull Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        autoInvalidateNode(node, 0);
    }

    public static final int calculateNodeKindSetFrom(@NotNull Modifier.Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(1);
        if (element instanceof LayoutModifier) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(2);
        }
        if (element instanceof IntermediateLayoutModifier) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(512);
        }
        if (element instanceof DrawModifier) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(4096);
        }
        if (element instanceof FocusOrderModifier) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(256);
        }
        if (element instanceof ParentDataModifier) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(64);
        }
        return ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier) || (element instanceof LookaheadOnPlacedModifier)) ? NodeKind.m3199constructorimpl(128) | iM3199constructorimpl : iM3199constructorimpl;
    }

    /* JADX INFO: renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m3207getIncludeSelfInTraversalH91voCI(int i10) {
        return (i10 & NodeKind.m3199constructorimpl(128)) != 0;
    }

    /* JADX INFO: renamed from: getIncludeSelfInTraversal-H91voCI$annotations, reason: not valid java name */
    public static /* synthetic */ void m3208getIncludeSelfInTraversalH91voCI$annotations(int i10) {
    }

    /* JADX INFO: renamed from: or-64DMado, reason: not valid java name */
    public static final int m3209or64DMado(int i10, int i11) {
        return i10 | i11;
    }

    @ExperimentalComposeUiApi
    private static final void scheduleInvalidationOfAssociatedFocusTargets(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(1024);
        if (!focusPropertiesModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusPropertiesModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusPropertiesModifierNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & iM3199constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, child2);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & iM3199constructorimpl) == 0) {
                        child2 = child2.getChild();
                    } else if (child2 instanceof FocusTargetModifierNode) {
                        DelegatableNodeKt.requireOwner(focusPropertiesModifierNode).getFocusOwner().scheduleInvalidation((FocusTargetModifierNode) child2);
                    }
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker canFocusChecker = CanFocusChecker.INSTANCE;
        canFocusChecker.reset();
        focusPropertiesModifierNode.modifyFocusProperties(canFocusChecker);
        return canFocusChecker.isCanFocusSet();
    }

    public static final int calculateNodeKindSetFrom(@NotNull Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(2);
        }
        if (node instanceof DrawModifierNode) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(8);
        }
        if (node instanceof PointerInputModifierNode) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(16);
        }
        if (node instanceof ModifierLocalNode) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(32);
        }
        if (node instanceof ParentDataModifierNode) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(128);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(256);
        }
        if (node instanceof IntermediateLayoutModifierNode) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(512);
        }
        if (node instanceof FocusTargetModifierNode) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(1024);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(2048);
        }
        if (node instanceof FocusEventModifierNode) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            iM3199constructorimpl |= NodeKind.m3199constructorimpl(8192);
        }
        return node instanceof RotaryInputModifierNode ? NodeKind.m3199constructorimpl(16384) | iM3199constructorimpl : iM3199constructorimpl;
    }
}
