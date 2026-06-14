package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0001¨\u0006\u0006"}, d2 = {"getFocusState", "Landroidx/compose/ui/focus/FocusState;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "refreshFocusEventNodes", "", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FocusEventModifierNodeKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0034, code lost:
    
        continue;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusState getFocusState(@org.jetbrains.annotations.NotNull androidx.compose.ui.focus.FocusEventModifierNode r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.NodeKind.m3199constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r5.getNode()
            boolean r1 = r1.getIsAttached()
            if (r1 == 0) goto L7e
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r2 = new androidx.compose.ui.Modifier.Node[r2]
            r3 = 0
            r1.<init>(r2, r3)
            androidx.compose.ui.Modifier$Node r2 = r5.getNode()
            androidx.compose.ui.Modifier$Node r2 = r2.getChild()
            if (r2 != 0) goto L31
            androidx.compose.ui.Modifier$Node r5 = r5.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r5)
            goto L34
        L31:
            r1.add(r2)
        L34:
            boolean r5 = r1.isNotEmpty()
            if (r5 == 0) goto L7b
            int r5 = r1.getSize()
            r2 = 1
            int r5 = r5 - r2
            java.lang.Object r5 = r1.removeAt(r5)
            androidx.compose.ui.Modifier$Node r5 = (androidx.compose.ui.Modifier.Node) r5
            int r3 = r5.getAggregateChildKindSet()
            r3 = r3 & r0
            if (r3 != 0) goto L51
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r5)
            goto L34
        L51:
            if (r5 == 0) goto L34
            int r3 = r5.getKindSet()
            r3 = r3 & r0
            if (r3 == 0) goto L76
            boolean r3 = r5 instanceof androidx.compose.ui.focus.FocusTargetModifierNode
            if (r3 == 0) goto L34
            androidx.compose.ui.focus.FocusTargetModifierNode r5 = (androidx.compose.ui.focus.FocusTargetModifierNode) r5
            androidx.compose.ui.focus.FocusStateImpl r5 = r5.getFocusStateImpl()
            int[] r3 = androidx.compose.ui.focus.FocusEventModifierNodeKt.WhenMappings.$EnumSwitchMapping$0
            int r4 = r5.ordinal()
            r3 = r3[r4]
            if (r3 == r2) goto L75
            r2 = 2
            if (r3 == r2) goto L75
            r2 = 3
            if (r3 == r2) goto L75
            goto L34
        L75:
            return r5
        L76:
            androidx.compose.ui.Modifier$Node r5 = r5.getChild()
            goto L51
        L7b:
            androidx.compose.ui.focus.FocusStateImpl r5 = androidx.compose.ui.focus.FocusStateImpl.Inactive
            return r5
        L7e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusEventModifierNodeKt.getFocusState(androidx.compose.ui.focus.FocusEventModifierNode):androidx.compose.ui.focus.FocusState");
    }

    @ExperimentalComposeUiApi
    public static final void refreshFocusEventNodes(@NotNull FocusTargetModifierNode focusTargetModifierNode) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(4096) | NodeKind.m3199constructorimpl(1024);
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        Modifier.Node parent = focusTargetModifierNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetModifierNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM3199constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM3199constructorimpl) != 0) {
                        if ((NodeKind.m3199constructorimpl(1024) & parent.getKindSet()) != 0) {
                            return;
                        }
                        if (!(parent instanceof FocusEventModifierNode)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) parent;
                        focusEventModifierNode.onFocusEvent(getFocusState(focusEventModifierNode));
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }
}
