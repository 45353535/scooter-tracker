package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J)\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J)\u0010\u0015\u001a\u00020\u0016*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u001a\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "enforceIncoming", "", "getEnforceIncoming", "()Z", "calculateContentConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "calculateContentConstraints-l58MMJ0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
interface IntrinsicSizeModifier extends LayoutModifier {

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.IntrinsicSizeModifier$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static boolean a(IntrinsicSizeModifier intrinsicSizeModifier) {
            return true;
        }

        public static int b(IntrinsicSizeModifier intrinsicSizeModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i10) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return measurable.maxIntrinsicHeight(i10);
        }

        public static int c(IntrinsicSizeModifier intrinsicSizeModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i10) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return measurable.maxIntrinsicWidth(i10);
        }

        public static MeasureResult d(IntrinsicSizeModifier intrinsicSizeModifier, MeasureScope measure, Measurable measurable, long j10) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            long jMo402calculateContentConstraintsl58MMJ0 = intrinsicSizeModifier.mo402calculateContentConstraintsl58MMJ0(measure, measurable, j10);
            if (intrinsicSizeModifier.getEnforceIncoming()) {
                jMo402calculateContentConstraintsl58MMJ0 = ConstraintsKt.m3931constrainN9IONVI(j10, jMo402calculateContentConstraintsl58MMJ0);
            }
            final Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(jMo402calculateContentConstraintsl58MMJ0);
            return MeasureScope.CC.p(measure, placeableMo3011measureBRTryo0.getWidth(), placeableMo3011measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.IntrinsicSizeModifier$measure$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    Placeable.PlacementScope.m3047placeRelative70tqf50$default(layout, placeableMo3011measureBRTryo0, IntOffset.INSTANCE.m4079getZeronOccac(), 0.0f, 2, null);
                }
            }, 4, null);
        }

        public static int e(IntrinsicSizeModifier intrinsicSizeModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i10) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return measurable.minIntrinsicHeight(i10);
        }

        public static int f(IntrinsicSizeModifier intrinsicSizeModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i10) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return measurable.minIntrinsicWidth(i10);
        }
    }

    /* JADX INFO: renamed from: calculateContentConstraints-l58MMJ0, reason: not valid java name */
    long mo402calculateContentConstraintsl58MMJ0(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j10);

    boolean getEnforceIncoming();

    @Override // androidx.compose.ui.layout.LayoutModifier
    int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10);

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    MeasureResult mo43measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j10);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10);
}
