package androidx.compose.ui.layout;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static int a(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.maxHeight$ui_release(layoutModifier, intrinsicMeasureScope, measurable, i10);
    }

    public static int b(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.maxWidth$ui_release(layoutModifier, intrinsicMeasureScope, measurable, i10);
    }

    public static int c(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.minHeight$ui_release(layoutModifier, intrinsicMeasureScope, measurable, i10);
    }

    public static int d(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.minWidth$ui_release(layoutModifier, intrinsicMeasureScope, measurable, i10);
    }
}
