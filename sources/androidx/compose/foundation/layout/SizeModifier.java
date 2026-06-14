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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BN\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0018\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001d\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010\u001eJ#\u0010!\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\u001eJ#\u0010\"\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010\u001eJ\u001a\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u001d\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u001d\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u001d\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R!\u0010.\u001a\u00020\u0013*\u00020+8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/foundation/layout/SizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/unit/Dp;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "Z", "Landroidx/compose/ui/unit/Density;", "getTargetConstraints-OenEA2s", "(Landroidx/compose/ui/unit/Density;)J", "targetConstraints", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SizeModifier extends InspectorValueInfo implements LayoutModifier {
    private final boolean enforceIncoming;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ SizeModifier(float f10, float f11, float f12, float f13, boolean z10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10, function1);
    }

    /* JADX INFO: renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    private final long m472getTargetConstraintsOenEA2s(Density density) {
        int iE;
        int iE2;
        float f10 = this.maxWidth;
        Dp.Companion companion = Dp.INSTANCE;
        int i10 = 0;
        int iMo302roundToPx0680j_4 = !Dp.m3956equalsimpl0(f10, companion.m3971getUnspecifiedD9Ej5fM()) ? density.mo302roundToPx0680j_4(((Dp) kotlin.ranges.g.g(Dp.m3949boximpl(this.maxWidth), Dp.m3949boximpl(Dp.m3951constructorimpl(0)))).m3965unboximpl()) : Integer.MAX_VALUE;
        int iMo302roundToPx0680j_42 = !Dp.m3956equalsimpl0(this.maxHeight, companion.m3971getUnspecifiedD9Ej5fM()) ? density.mo302roundToPx0680j_4(((Dp) kotlin.ranges.g.g(Dp.m3949boximpl(this.maxHeight), Dp.m3949boximpl(Dp.m3951constructorimpl(0)))).m3965unboximpl()) : Integer.MAX_VALUE;
        if (Dp.m3956equalsimpl0(this.minWidth, companion.m3971getUnspecifiedD9Ej5fM()) || (iE = kotlin.ranges.g.e(kotlin.ranges.g.j(density.mo302roundToPx0680j_4(this.minWidth), iMo302roundToPx0680j_4), 0)) == Integer.MAX_VALUE) {
            iE = 0;
        }
        if (!Dp.m3956equalsimpl0(this.minHeight, companion.m3971getUnspecifiedD9Ej5fM()) && (iE2 = kotlin.ranges.g.e(kotlin.ranges.g.j(density.mo302roundToPx0680j_4(this.minHeight), iMo302roundToPx0680j_42), 0)) != Integer.MAX_VALUE) {
            i10 = iE2;
        }
        return ConstraintsKt.Constraints(iE, iMo302roundToPx0680j_4, i10, iMo302roundToPx0680j_42);
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
        if (!(other instanceof SizeModifier)) {
            return false;
        }
        SizeModifier sizeModifier = (SizeModifier) other;
        return Dp.m3956equalsimpl0(this.minWidth, sizeModifier.minWidth) && Dp.m3956equalsimpl0(this.minHeight, sizeModifier.minHeight) && Dp.m3956equalsimpl0(this.maxWidth, sizeModifier.maxWidth) && Dp.m3956equalsimpl0(this.maxHeight, sizeModifier.maxHeight) && this.enforceIncoming == sizeModifier.enforceIncoming;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return androidx.compose.ui.b.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return androidx.compose.ui.b.d(this, obj, function2);
    }

    public int hashCode() {
        return ((((((Dp.m3957hashCodeimpl(this.minWidth) * 31) + Dp.m3957hashCodeimpl(this.minHeight)) * 31) + Dp.m3957hashCodeimpl(this.maxWidth)) * 31) + Dp.m3957hashCodeimpl(this.maxHeight)) * 31;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jM472getTargetConstraintsOenEA2s = m472getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m3916getHasFixedHeightimpl(jM472getTargetConstraintsOenEA2s) ? Constraints.m3918getMaxHeightimpl(jM472getTargetConstraintsOenEA2s) : ConstraintsKt.m3932constrainHeightK40F9xA(jM472getTargetConstraintsOenEA2s, measurable.maxIntrinsicHeight(i10));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jM472getTargetConstraintsOenEA2s = m472getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m3917getHasFixedWidthimpl(jM472getTargetConstraintsOenEA2s) ? Constraints.m3919getMaxWidthimpl(jM472getTargetConstraintsOenEA2s) : ConstraintsKt.m3933constrainWidthK40F9xA(jM472getTargetConstraintsOenEA2s, measurable.maxIntrinsicWidth(i10));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo43measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        long jConstraints;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jM472getTargetConstraintsOenEA2s = m472getTargetConstraintsOenEA2s(measure);
        if (this.enforceIncoming) {
            jConstraints = ConstraintsKt.m3931constrainN9IONVI(j10, jM472getTargetConstraintsOenEA2s);
        } else {
            float f10 = this.minWidth;
            Dp.Companion companion = Dp.INSTANCE;
            jConstraints = ConstraintsKt.Constraints(!Dp.m3956equalsimpl0(f10, companion.m3971getUnspecifiedD9Ej5fM()) ? Constraints.m3921getMinWidthimpl(jM472getTargetConstraintsOenEA2s) : kotlin.ranges.g.j(Constraints.m3921getMinWidthimpl(j10), Constraints.m3919getMaxWidthimpl(jM472getTargetConstraintsOenEA2s)), !Dp.m3956equalsimpl0(this.maxWidth, companion.m3971getUnspecifiedD9Ej5fM()) ? Constraints.m3919getMaxWidthimpl(jM472getTargetConstraintsOenEA2s) : kotlin.ranges.g.e(Constraints.m3919getMaxWidthimpl(j10), Constraints.m3921getMinWidthimpl(jM472getTargetConstraintsOenEA2s)), !Dp.m3956equalsimpl0(this.minHeight, companion.m3971getUnspecifiedD9Ej5fM()) ? Constraints.m3920getMinHeightimpl(jM472getTargetConstraintsOenEA2s) : kotlin.ranges.g.j(Constraints.m3920getMinHeightimpl(j10), Constraints.m3918getMaxHeightimpl(jM472getTargetConstraintsOenEA2s)), !Dp.m3956equalsimpl0(this.maxHeight, companion.m3971getUnspecifiedD9Ej5fM()) ? Constraints.m3918getMaxHeightimpl(jM472getTargetConstraintsOenEA2s) : kotlin.ranges.g.e(Constraints.m3918getMaxHeightimpl(j10), Constraints.m3920getMinHeightimpl(jM472getTargetConstraintsOenEA2s)));
        }
        final Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(jConstraints);
        return MeasureScope.CC.p(measure, placeableMo3011measureBRTryo0.getWidth(), placeableMo3011measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.SizeModifier$measure$1
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
                Placeable.PlacementScope.placeRelative$default(layout, placeableMo3011measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jM472getTargetConstraintsOenEA2s = m472getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m3916getHasFixedHeightimpl(jM472getTargetConstraintsOenEA2s) ? Constraints.m3918getMaxHeightimpl(jM472getTargetConstraintsOenEA2s) : ConstraintsKt.m3932constrainHeightK40F9xA(jM472getTargetConstraintsOenEA2s, measurable.minIntrinsicHeight(i10));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jM472getTargetConstraintsOenEA2s = m472getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m3917getHasFixedWidthimpl(jM472getTargetConstraintsOenEA2s) ? Constraints.m3919getMaxWidthimpl(jM472getTargetConstraintsOenEA2s) : ConstraintsKt.m3933constrainWidthK40F9xA(jM472getTargetConstraintsOenEA2s, measurable.minIntrinsicWidth(i10));
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    public /* synthetic */ SizeModifier(float f10, float f11, float f12, float f13, boolean z10, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM() : f10, (i10 & 2) != 0 ? Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM() : f11, (i10 & 4) != 0 ? Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM() : f12, (i10 & 8) != 0 ? Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM() : f13, z10, function1, null);
    }

    private SizeModifier(float f10, float f11, float f12, float f13, boolean z10, Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.minWidth = f10;
        this.minHeight = f11;
        this.maxWidth = f12;
        this.maxHeight = f13;
        this.enforceIncoming = z10;
    }
}
