package androidx.compose.ui.node;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0001¨\u0006\u0006"}, d2 = {"invalidateLayer", "", "Landroidx/compose/ui/node/LayoutModifierNode;", "invalidateLayout", "invalidateMeasurements", "requestRemeasure", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LayoutModifierNodeKt {
    @ExperimentalComposeUiApi
    public static final void invalidateLayer(@NotNull LayoutModifierNode layoutModifierNode) {
        Intrinsics.checkNotNullParameter(layoutModifierNode, "<this>");
        DelegatableNodeKt.m3103requireCoordinator64DMado(layoutModifierNode, NodeKind.m3199constructorimpl(2)).invalidateLayer();
    }

    @ExperimentalComposeUiApi
    public static final void invalidateLayout(@NotNull LayoutModifierNode layoutModifierNode) {
        Intrinsics.checkNotNullParameter(layoutModifierNode, "<this>");
        LayoutNode.requestRelayout$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, 1, null);
    }

    @ExperimentalComposeUiApi
    public static final void invalidateMeasurements(@NotNull LayoutModifierNode layoutModifierNode) {
        Intrinsics.checkNotNullParameter(layoutModifierNode, "<this>");
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).invalidateMeasurements$ui_release();
    }

    @ExperimentalComposeUiApi
    public static final void requestRemeasure(@NotNull LayoutModifierNode layoutModifierNode) {
        Intrinsics.checkNotNullParameter(layoutModifierNode, "<this>");
        LayoutNode.requestRemeasure$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, 1, null);
    }
}
