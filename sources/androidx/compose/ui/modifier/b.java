package androidx.compose.ui.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static Object a(ModifierLocalNode modifierLocalNode, ModifierLocal modifierLocal) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(modifierLocal, "<this>");
        if (!modifierLocalNode.getNode().getIsAttached()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(32);
        if (!modifierLocalNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        Modifier.Node parent = modifierLocalNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(modifierLocalNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM3199constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM3199constructorimpl) != 0 && (parent instanceof ModifierLocalNode)) {
                        ModifierLocalNode modifierLocalNode2 = (ModifierLocalNode) parent;
                        if (modifierLocalNode2.getProvidedValues().contains$ui_release(modifierLocal)) {
                            return modifierLocalNode2.getProvidedValues().get$ui_release(modifierLocal);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return modifierLocal.getDefaultFactory$ui_release().invoke();
    }

    public static ModifierLocalMap b(ModifierLocalNode modifierLocalNode) {
        return EmptyMap.INSTANCE;
    }

    public static void c(ModifierLocalNode modifierLocalNode, ModifierLocal key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (modifierLocalNode.getProvidedValues() == EmptyMap.INSTANCE) {
            throw new IllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (modifierLocalNode.getProvidedValues().contains$ui_release(key)) {
            modifierLocalNode.getProvidedValues().mo3082set$ui_release(key, obj);
            return;
        }
        throw new IllegalArgumentException(("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + key + " was not found.").toString());
    }
}
