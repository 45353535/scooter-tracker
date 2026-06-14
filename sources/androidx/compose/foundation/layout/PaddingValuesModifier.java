package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0013\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/layout/PaddingValues;", "getPaddingValues", "()Landroidx/compose/foundation/layout/PaddingValues;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PaddingValuesModifier extends InspectorValueInfo implements LayoutModifier {

    @NotNull
    private final PaddingValues paddingValues;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingValuesModifier(@NotNull PaddingValues paddingValues, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    public boolean equals(@Nullable Object other) {
        PaddingValuesModifier paddingValuesModifier = other instanceof PaddingValuesModifier ? (PaddingValuesModifier) other : null;
        if (paddingValuesModifier == null) {
            return false;
        }
        return Intrinsics.areEqual(this.paddingValues, paddingValuesModifier.paddingValues);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return androidx.compose.ui.b.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return androidx.compose.ui.b.d(this, obj, function2);
    }

    @NotNull
    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.layout.c.a(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.layout.c.b(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo43measure3p2s80s(@NotNull final MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        float f10 = 0;
        if (Dp.m3950compareTo0680j_4(this.paddingValues.mo399calculateLeftPaddingu2uoSUM(measure.getLayoutDirection()), Dp.m3951constructorimpl(f10)) < 0 || Dp.m3950compareTo0680j_4(this.paddingValues.getTop(), Dp.m3951constructorimpl(f10)) < 0 || Dp.m3950compareTo0680j_4(this.paddingValues.mo400calculateRightPaddingu2uoSUM(measure.getLayoutDirection()), Dp.m3951constructorimpl(f10)) < 0 || Dp.m3950compareTo0680j_4(this.paddingValues.getBottom(), Dp.m3951constructorimpl(f10)) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int iMo302roundToPx0680j_4 = measure.mo302roundToPx0680j_4(this.paddingValues.mo399calculateLeftPaddingu2uoSUM(measure.getLayoutDirection())) + measure.mo302roundToPx0680j_4(this.paddingValues.mo400calculateRightPaddingu2uoSUM(measure.getLayoutDirection()));
        int iMo302roundToPx0680j_42 = measure.mo302roundToPx0680j_4(this.paddingValues.getTop()) + measure.mo302roundToPx0680j_4(this.paddingValues.getBottom());
        final Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(ConstraintsKt.m3935offsetNN6EwU(j10, -iMo302roundToPx0680j_4, -iMo302roundToPx0680j_42));
        return MeasureScope.CC.p(measure, ConstraintsKt.m3933constrainWidthK40F9xA(j10, placeableMo3011measureBRTryo0.getWidth() + iMo302roundToPx0680j_4), ConstraintsKt.m3932constrainHeightK40F9xA(j10, placeableMo3011measureBRTryo0.getHeight() + iMo302roundToPx0680j_42), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                Placeable.PlacementScope.place$default(layout, placeableMo3011measureBRTryo0, measure.mo302roundToPx0680j_4(this.getPaddingValues().mo399calculateLeftPaddingu2uoSUM(measure.getLayoutDirection())), measure.mo302roundToPx0680j_4(this.getPaddingValues().getTop()), 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.layout.c.c(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.layout.c.d(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
