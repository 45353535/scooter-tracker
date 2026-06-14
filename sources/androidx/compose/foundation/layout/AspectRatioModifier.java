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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u000e*\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u000e*\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u000e*\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u0019\u001a\u00020\u000e*\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0014J#\u0010\u001b\u001a\u00020\u000e*\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0014J)\u0010#\u001a\u00020 *\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\rH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J#\u0010(\u001a\u00020&*\u00020$2\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00020&*\u00020$2\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010)J#\u0010,\u001a\u00020&*\u00020$2\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010+\u001a\u00020&H\u0016¢\u0006\u0004\b,\u0010)J#\u0010-\u001a\u00020&*\u00020$2\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010+\u001a\u00020&H\u0016¢\u0006\u0004\b-\u0010)J\u001a\u00100\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010.H\u0096\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020&H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006="}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "", "aspectRatio", "", "matchHeightConstraintsFirst", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(FZLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/IntSize;", "findSize-ToXhtMw", "(J)J", "findSize", "enforceConstraints", "tryMaxWidth-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxHeight-JN-0ABg", "tryMaxHeight", "tryMinWidth-JN-0ABg", "tryMinWidth", "tryMinHeight-JN-0ABg", "tryMinHeight", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "getAspectRatio", "()F", "Z", "getMatchHeightConstraintsFirst", "()Z", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AspectRatioModifier extends InspectorValueInfo implements LayoutModifier {
    private final float aspectRatio;
    private final boolean matchHeightConstraintsFirst;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioModifier(float f10, boolean z10, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.aspectRatio = f10;
        this.matchHeightConstraintsFirst = z10;
        if (f10 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f10 + " must be > 0").toString());
    }

    /* JADX INFO: renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m379findSizeToXhtMw(long j10) {
        if (this.matchHeightConstraintsFirst) {
            long jM381tryMaxHeightJN0ABg$default = m381tryMaxHeightJN0ABg$default(this, j10, false, 1, null);
            IntSize.Companion companion = IntSize.INSTANCE;
            if (!IntSize.m4109equalsimpl0(jM381tryMaxHeightJN0ABg$default, companion.m4116getZeroYbymL2g())) {
                return jM381tryMaxHeightJN0ABg$default;
            }
            long jM383tryMaxWidthJN0ABg$default = m383tryMaxWidthJN0ABg$default(this, j10, false, 1, null);
            if (!IntSize.m4109equalsimpl0(jM383tryMaxWidthJN0ABg$default, companion.m4116getZeroYbymL2g())) {
                return jM383tryMaxWidthJN0ABg$default;
            }
            long jM385tryMinHeightJN0ABg$default = m385tryMinHeightJN0ABg$default(this, j10, false, 1, null);
            if (!IntSize.m4109equalsimpl0(jM385tryMinHeightJN0ABg$default, companion.m4116getZeroYbymL2g())) {
                return jM385tryMinHeightJN0ABg$default;
            }
            long jM387tryMinWidthJN0ABg$default = m387tryMinWidthJN0ABg$default(this, j10, false, 1, null);
            if (!IntSize.m4109equalsimpl0(jM387tryMinWidthJN0ABg$default, companion.m4116getZeroYbymL2g())) {
                return jM387tryMinWidthJN0ABg$default;
            }
            long jM380tryMaxHeightJN0ABg = m380tryMaxHeightJN0ABg(j10, false);
            if (!IntSize.m4109equalsimpl0(jM380tryMaxHeightJN0ABg, companion.m4116getZeroYbymL2g())) {
                return jM380tryMaxHeightJN0ABg;
            }
            long jM382tryMaxWidthJN0ABg = m382tryMaxWidthJN0ABg(j10, false);
            if (!IntSize.m4109equalsimpl0(jM382tryMaxWidthJN0ABg, companion.m4116getZeroYbymL2g())) {
                return jM382tryMaxWidthJN0ABg;
            }
            long jM384tryMinHeightJN0ABg = m384tryMinHeightJN0ABg(j10, false);
            if (!IntSize.m4109equalsimpl0(jM384tryMinHeightJN0ABg, companion.m4116getZeroYbymL2g())) {
                return jM384tryMinHeightJN0ABg;
            }
            long jM386tryMinWidthJN0ABg = m386tryMinWidthJN0ABg(j10, false);
            if (!IntSize.m4109equalsimpl0(jM386tryMinWidthJN0ABg, companion.m4116getZeroYbymL2g())) {
                return jM386tryMinWidthJN0ABg;
            }
        } else {
            long jM383tryMaxWidthJN0ABg$default2 = m383tryMaxWidthJN0ABg$default(this, j10, false, 1, null);
            IntSize.Companion companion2 = IntSize.INSTANCE;
            if (!IntSize.m4109equalsimpl0(jM383tryMaxWidthJN0ABg$default2, companion2.m4116getZeroYbymL2g())) {
                return jM383tryMaxWidthJN0ABg$default2;
            }
            long jM381tryMaxHeightJN0ABg$default2 = m381tryMaxHeightJN0ABg$default(this, j10, false, 1, null);
            if (!IntSize.m4109equalsimpl0(jM381tryMaxHeightJN0ABg$default2, companion2.m4116getZeroYbymL2g())) {
                return jM381tryMaxHeightJN0ABg$default2;
            }
            long jM387tryMinWidthJN0ABg$default2 = m387tryMinWidthJN0ABg$default(this, j10, false, 1, null);
            if (!IntSize.m4109equalsimpl0(jM387tryMinWidthJN0ABg$default2, companion2.m4116getZeroYbymL2g())) {
                return jM387tryMinWidthJN0ABg$default2;
            }
            long jM385tryMinHeightJN0ABg$default2 = m385tryMinHeightJN0ABg$default(this, j10, false, 1, null);
            if (!IntSize.m4109equalsimpl0(jM385tryMinHeightJN0ABg$default2, companion2.m4116getZeroYbymL2g())) {
                return jM385tryMinHeightJN0ABg$default2;
            }
            long jM382tryMaxWidthJN0ABg2 = m382tryMaxWidthJN0ABg(j10, false);
            if (!IntSize.m4109equalsimpl0(jM382tryMaxWidthJN0ABg2, companion2.m4116getZeroYbymL2g())) {
                return jM382tryMaxWidthJN0ABg2;
            }
            long jM380tryMaxHeightJN0ABg2 = m380tryMaxHeightJN0ABg(j10, false);
            if (!IntSize.m4109equalsimpl0(jM380tryMaxHeightJN0ABg2, companion2.m4116getZeroYbymL2g())) {
                return jM380tryMaxHeightJN0ABg2;
            }
            long jM386tryMinWidthJN0ABg2 = m386tryMinWidthJN0ABg(j10, false);
            if (!IntSize.m4109equalsimpl0(jM386tryMinWidthJN0ABg2, companion2.m4116getZeroYbymL2g())) {
                return jM386tryMinWidthJN0ABg2;
            }
            long jM384tryMinHeightJN0ABg2 = m384tryMinHeightJN0ABg(j10, false);
            if (!IntSize.m4109equalsimpl0(jM384tryMinHeightJN0ABg2, companion2.m4116getZeroYbymL2g())) {
                return jM384tryMinHeightJN0ABg2;
            }
        }
        return IntSize.INSTANCE.m4116getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m380tryMaxHeightJN0ABg(long j10, boolean z10) {
        int iD;
        int iM3918getMaxHeightimpl = Constraints.m3918getMaxHeightimpl(j10);
        if (iM3918getMaxHeightimpl != Integer.MAX_VALUE && (iD = zf.a.d(iM3918getMaxHeightimpl * this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iD, iM3918getMaxHeightimpl);
            if (!z10 || ConstraintsKt.m3934isSatisfiedBy4WqzIAM(j10, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m4116getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m381tryMaxHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aspectRatioModifier.m380tryMaxHeightJN0ABg(j10, z10);
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m382tryMaxWidthJN0ABg(long j10, boolean z10) {
        int iD;
        int iM3919getMaxWidthimpl = Constraints.m3919getMaxWidthimpl(j10);
        if (iM3919getMaxWidthimpl != Integer.MAX_VALUE && (iD = zf.a.d(iM3919getMaxWidthimpl / this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iM3919getMaxWidthimpl, iD);
            if (!z10 || ConstraintsKt.m3934isSatisfiedBy4WqzIAM(j10, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m4116getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m383tryMaxWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aspectRatioModifier.m382tryMaxWidthJN0ABg(j10, z10);
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m384tryMinHeightJN0ABg(long j10, boolean z10) {
        int iM3920getMinHeightimpl = Constraints.m3920getMinHeightimpl(j10);
        int iD = zf.a.d(iM3920getMinHeightimpl * this.aspectRatio);
        if (iD > 0) {
            long jIntSize = IntSizeKt.IntSize(iD, iM3920getMinHeightimpl);
            if (!z10 || ConstraintsKt.m3934isSatisfiedBy4WqzIAM(j10, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m4116getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m385tryMinHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aspectRatioModifier.m384tryMinHeightJN0ABg(j10, z10);
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m386tryMinWidthJN0ABg(long j10, boolean z10) {
        int iM3921getMinWidthimpl = Constraints.m3921getMinWidthimpl(j10);
        int iD = zf.a.d(iM3921getMinWidthimpl / this.aspectRatio);
        if (iD > 0) {
            long jIntSize = IntSizeKt.IntSize(iM3921getMinWidthimpl, iD);
            if (!z10 || ConstraintsKt.m3934isSatisfiedBy4WqzIAM(j10, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m4116getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m387tryMinWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aspectRatioModifier.m386tryMinWidthJN0ABg(j10, z10);
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
        if (this == other) {
            return true;
        }
        AspectRatioModifier aspectRatioModifier = other instanceof AspectRatioModifier ? (AspectRatioModifier) other : null;
        return aspectRatioModifier != null && this.aspectRatio == aspectRatioModifier.aspectRatio && this.matchHeightConstraintsFirst == ((AspectRatioModifier) other).matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return androidx.compose.ui.b.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return androidx.compose.ui.b.d(this, obj, function2);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.aspectRatio) * 31) + androidx.compose.foundation.c.a(this.matchHeightConstraintsFirst);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return i10 != Integer.MAX_VALUE ? zf.a.d(i10 / this.aspectRatio) : measurable.maxIntrinsicHeight(i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return i10 != Integer.MAX_VALUE ? zf.a.d(i10 * this.aspectRatio) : measurable.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo43measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jM379findSizeToXhtMw = m379findSizeToXhtMw(j10);
        if (!IntSize.m4109equalsimpl0(jM379findSizeToXhtMw, IntSize.INSTANCE.m4116getZeroYbymL2g())) {
            j10 = Constraints.INSTANCE.m3927fixedJhjzzOo(IntSize.m4111getWidthimpl(jM379findSizeToXhtMw), IntSize.m4110getHeightimpl(jM379findSizeToXhtMw));
        }
        final Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(j10);
        return MeasureScope.CC.p(measure, placeableMo3011measureBRTryo0.getWidth(), placeableMo3011measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioModifier$measure$1
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
        return i10 != Integer.MAX_VALUE ? zf.a.d(i10 / this.aspectRatio) : measurable.minIntrinsicHeight(i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return i10 != Integer.MAX_VALUE ? zf.a.d(i10 * this.aspectRatio) : measurable.minIntrinsicWidth(i10);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    @NotNull
    public String toString() {
        return "AspectRatioModifier(aspectRatio=" + this.aspectRatio + ')';
    }
}
