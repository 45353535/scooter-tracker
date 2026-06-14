package androidx.compose.material;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J)\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material/MinimumInteractiveComponentSizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "size", "Landroidx/compose/ui/unit/DpSize;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSize-MYxV2XQ", "()J", "J", "equals", "", "other", "", "hashCode", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class MinimumInteractiveComponentSizeModifier implements LayoutModifier {
    private final long size;

    public /* synthetic */ MinimumInteractiveComponentSizeModifier(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return b.b(this, function1);
    }

    public boolean equals(@Nullable Object other) {
        MinimumInteractiveComponentSizeModifier minimumInteractiveComponentSizeModifier = other instanceof MinimumInteractiveComponentSizeModifier ? (MinimumInteractiveComponentSizeModifier) other : null;
        if (minimumInteractiveComponentSizeModifier == null) {
            return false;
        }
        return DpSize.m4046equalsimpl0(this.size, minimumInteractiveComponentSizeModifier.size);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return b.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return b.d(this, obj, function2);
    }

    /* JADX INFO: renamed from: getSize-MYxV2XQ, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        return DpSize.m4051hashCodeimpl(this.size);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return c.a(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return c.b(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo43measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(j10);
        final int iMax = Math.max(placeableMo3011measureBRTryo0.getWidth(), measure.mo302roundToPx0680j_4(DpSize.m4049getWidthD9Ej5fM(this.size)));
        final int iMax2 = Math.max(placeableMo3011measureBRTryo0.getHeight(), measure.mo302roundToPx0680j_4(DpSize.m4047getHeightD9Ej5fM(this.size)));
        return MeasureScope.CC.p(measure, iMax, iMax2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.MinimumInteractiveComponentSizeModifier$measure$1
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
                Placeable.PlacementScope.place$default(layout, placeableMo3011measureBRTryo0, zf.a.d((iMax - placeableMo3011measureBRTryo0.getWidth()) / 2.0f), zf.a.d((iMax2 - placeableMo3011measureBRTryo0.getHeight()) / 2.0f), 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return c.c(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return c.d(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    private MinimumInteractiveComponentSizeModifier(long j10) {
        this.size = j10;
    }
}
