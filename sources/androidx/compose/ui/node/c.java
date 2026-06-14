package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static void a(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).forceRemeasure();
    }

    public static int b(LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(layoutModifierNode, intrinsicMeasureScope, measurable, i10);
    }

    public static int c(LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(layoutModifierNode, intrinsicMeasureScope, measurable, i10);
    }

    public static int d(LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(layoutModifierNode, intrinsicMeasureScope, measurable, i10);
    }

    public static int e(LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(layoutModifierNode, intrinsicMeasureScope, measurable, i10);
    }
}
