package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0017\u001a\u00020\u0014*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b%\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "", "fraction", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "Landroidx/compose/runtime/State;", "", "widthState", "heightState", "<init>", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "getFraction", "()F", "Landroidx/compose/runtime/State;", "getWidthState", "()Landroidx/compose/runtime/State;", "getHeightState", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ParentSizeModifier extends InspectorValueInfo implements LayoutModifier {
    private final float fraction;

    @Nullable
    private final State<Integer> heightState;

    @Nullable
    private final State<Integer> widthState;

    public /* synthetic */ ParentSizeModifier(float f10, Function1 function1, State state, State state2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, function1, (i10 & 4) != 0 ? null : state, (i10 & 8) != 0 ? null : state2);
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
        if (!(other instanceof ParentSizeModifier)) {
            return false;
        }
        ParentSizeModifier parentSizeModifier = (ParentSizeModifier) other;
        return Intrinsics.areEqual(this.widthState, parentSizeModifier.widthState) && Intrinsics.areEqual(this.heightState, parentSizeModifier.heightState) && this.fraction == parentSizeModifier.fraction;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return androidx.compose.ui.b.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return androidx.compose.ui.b.d(this, obj, function2);
    }

    public final float getFraction() {
        return this.fraction;
    }

    @Nullable
    public final State<Integer> getHeightState() {
        return this.heightState;
    }

    @Nullable
    public final State<Integer> getWidthState() {
        return this.widthState;
    }

    public int hashCode() {
        State<Integer> state = this.widthState;
        int iHashCode = (state != null ? state.hashCode() : 0) * 31;
        State<Integer> state2 = this.heightState;
        return ((iHashCode + (state2 != null ? state2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.fraction);
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
        State<Integer> state = this.widthState;
        int iD = (state == null || state.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : zf.a.d(this.widthState.getValue().floatValue() * this.fraction);
        State<Integer> state2 = this.heightState;
        int iD2 = (state2 == null || state2.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : zf.a.d(this.heightState.getValue().floatValue() * this.fraction);
        int iM3921getMinWidthimpl = iD != Integer.MAX_VALUE ? iD : Constraints.m3921getMinWidthimpl(j10);
        int iM3920getMinHeightimpl = iD2 != Integer.MAX_VALUE ? iD2 : Constraints.m3920getMinHeightimpl(j10);
        if (iD == Integer.MAX_VALUE) {
            iD = Constraints.m3919getMaxWidthimpl(j10);
        }
        if (iD2 == Integer.MAX_VALUE) {
            iD2 = Constraints.m3918getMaxHeightimpl(j10);
        }
        final Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(ConstraintsKt.Constraints(iM3921getMinWidthimpl, iD, iM3920getMinHeightimpl, iD2));
        return MeasureScope.CC.p(measure, placeableMo3011measureBRTryo0.getWidth(), placeableMo3011measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.ParentSizeModifier$measure$1
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
                Placeable.PlacementScope.place$default(layout, placeableMo3011measureBRTryo0, 0, 0, 0.0f, 4, null);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParentSizeModifier(float f10, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @Nullable State<Integer> state, @Nullable State<Integer> state2) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.fraction = f10;
        this.widthState = state;
        this.heightState = state2;
    }
}
