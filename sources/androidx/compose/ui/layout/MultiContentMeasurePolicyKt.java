package androidx.compose.ui.layout;

import androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0004"}, d2 = {"createMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MultiContentMeasurePolicyKt {
    @NotNull
    public static final MeasurePolicy createMeasurePolicy(@NotNull final MultiContentMeasurePolicy measurePolicy) {
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        return new MeasurePolicy() { // from class: androidx.compose.ui.layout.MultiContentMeasurePolicyKt$createMeasurePolicy$1$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return measurePolicy.maxIntrinsicHeight(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i10);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return measurePolicy.maxIntrinsicWidth(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i10);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo30measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return measurePolicy.m3037measure3p2s80s(measure, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(measure), j10);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return measurePolicy.minIntrinsicHeight(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i10);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return measurePolicy.minIntrinsicWidth(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i10);
            }
        };
    }
}
