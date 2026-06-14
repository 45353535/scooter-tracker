package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u001c\u0010\u0016\u001a\u00020\u0013*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u001c\u0010\u001b\u001a\u00020\u0013*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J)\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010\u0018\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u001c\u0010%\u001a\u00020\u0013*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u001c\u0010&\u001a\u00020\u0013*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0013H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "scrollerState", "Landroidx/compose/foundation/ScrollState;", "isReversed", "", "isVertical", "(Landroidx/compose/foundation/ScrollState;ZZ)V", "()Z", "getScrollerState", "()Landroidx/compose/foundation/ScrollState;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "other", "", "hashCode", "", "toString", "", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class ScrollingLayoutModifier implements LayoutModifier {
    private final boolean isReversed;
    private final boolean isVertical;

    @NotNull
    private final ScrollState scrollerState;

    public ScrollingLayoutModifier(@NotNull ScrollState scrollerState, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(scrollerState, "scrollerState");
        this.scrollerState = scrollerState;
        this.isReversed = z10;
        this.isVertical = z11;
    }

    public static /* synthetic */ ScrollingLayoutModifier copy$default(ScrollingLayoutModifier scrollingLayoutModifier, ScrollState scrollState, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            scrollState = scrollingLayoutModifier.scrollerState;
        }
        if ((i10 & 2) != 0) {
            z10 = scrollingLayoutModifier.isReversed;
        }
        if ((i10 & 4) != 0) {
            z11 = scrollingLayoutModifier.isVertical;
        }
        return scrollingLayoutModifier.copy(scrollState, z10, z11);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ScrollState getScrollerState() {
        return this.scrollerState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsReversed() {
        return this.isReversed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @NotNull
    public final ScrollingLayoutModifier copy(@NotNull ScrollState scrollerState, boolean isReversed, boolean isVertical) {
        Intrinsics.checkNotNullParameter(scrollerState, "scrollerState");
        return new ScrollingLayoutModifier(scrollerState, isReversed, isVertical);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollingLayoutModifier)) {
            return false;
        }
        ScrollingLayoutModifier scrollingLayoutModifier = (ScrollingLayoutModifier) other;
        return Intrinsics.areEqual(this.scrollerState, scrollingLayoutModifier.scrollerState) && this.isReversed == scrollingLayoutModifier.isReversed && this.isVertical == scrollingLayoutModifier.isVertical;
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
    public final ScrollState getScrollerState() {
        return this.scrollerState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.scrollerState.hashCode() * 31;
        boolean z10 = this.isReversed;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        int i10 = (iHashCode + r12) * 31;
        boolean z11 = this.isVertical;
        return i10 + (z11 ? 1 : z11);
    }

    public final boolean isReversed() {
        return this.isReversed;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.isVertical ? measurable.maxIntrinsicHeight(i10) : measurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.isVertical ? measurable.maxIntrinsicWidth(Integer.MAX_VALUE) : measurable.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo43measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        CheckScrollableContainerConstraintsKt.m190checkScrollableContainerConstraintsK40F9xA(j10, this.isVertical ? Orientation.Vertical : Orientation.Horizontal);
        final Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(Constraints.m3910copyZbe2FdA$default(j10, 0, this.isVertical ? Constraints.m3919getMaxWidthimpl(j10) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : Constraints.m3918getMaxHeightimpl(j10), 5, null));
        int iJ = g.j(placeableMo3011measureBRTryo0.getWidth(), Constraints.m3919getMaxWidthimpl(j10));
        int iJ2 = g.j(placeableMo3011measureBRTryo0.getHeight(), Constraints.m3918getMaxHeightimpl(j10));
        final int height = placeableMo3011measureBRTryo0.getHeight() - iJ2;
        int width = placeableMo3011measureBRTryo0.getWidth() - iJ;
        if (!this.isVertical) {
            height = width;
        }
        this.scrollerState.setMaxValue$foundation_release(height);
        this.scrollerState.setViewportSize$foundation_release(this.isVertical ? iJ2 : iJ);
        return MeasureScope.CC.p(measure, iJ, iJ2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.ScrollingLayoutModifier$measure$1
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
                int iN = g.n(this.this$0.getScrollerState().getValue(), 0, height);
                int i10 = this.this$0.isReversed() ? iN - height : -iN;
                Placeable.PlacementScope.placeRelativeWithLayer$default(layout, placeableMo3011measureBRTryo0, this.this$0.isVertical() ? 0 : i10, this.this$0.isVertical() ? i10 : 0, 0.0f, null, 12, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.isVertical ? measurable.minIntrinsicHeight(i10) : measurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.isVertical ? measurable.minIntrinsicWidth(Integer.MAX_VALUE) : measurable.minIntrinsicWidth(i10);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    @NotNull
    public String toString() {
        return "ScrollingLayoutModifier(scrollerState=" + this.scrollerState + ", isReversed=" + this.isReversed + ", isVertical=" + this.isVertical + ')';
    }
}
