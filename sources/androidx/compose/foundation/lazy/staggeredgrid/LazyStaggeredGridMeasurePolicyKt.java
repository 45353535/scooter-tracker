package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ay\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\rH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a&\u0010\u0019\u001a\u00020\n*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a.\u0010\u001b\u001a\u00020\n*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a.\u0010\u001d\u001a\u00020\n*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "crossAxisSpacing", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "", "slotSizesSums", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "rememberStaggeredGridMeasurePolicy-nbWgWpA", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "rememberStaggeredGridMeasurePolicy", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "startPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F", "beforePadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/LayoutDirection;)F", "afterPadding", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyStaggeredGridMeasurePolicyKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float afterPadding(PaddingValues paddingValues, Orientation orientation, boolean z10, LayoutDirection layoutDirection) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i10 == 1) {
            return z10 ? paddingValues.getTop() : paddingValues.getBottom();
        }
        if (i10 == 2) {
            return z10 ? PaddingKt.calculateStartPadding(paddingValues, layoutDirection) : PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
        }
        throw new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float beforePadding(PaddingValues paddingValues, Orientation orientation, boolean z10, LayoutDirection layoutDirection) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i10 == 1) {
            return z10 ? paddingValues.getBottom() : paddingValues.getTop();
        }
        if (i10 == 2) {
            return z10 ? PaddingKt.calculateEndPadding(paddingValues, layoutDirection) : PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        throw new m();
    }

    @Composable
    @ExperimentalFoundationApi
    @NotNull
    /* JADX INFO: renamed from: rememberStaggeredGridMeasurePolicy-nbWgWpA, reason: not valid java name */
    public static final Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m639rememberStaggeredGridMeasurePolicynbWgWpA(@NotNull final LazyStaggeredGridState state, @NotNull final LazyStaggeredGridItemProvider itemProvider, @NotNull final PaddingValues contentPadding, final boolean z10, @NotNull final Orientation orientation, final float f10, final float f11, @NotNull final Function2<? super Density, ? super Constraints, int[]> slotSizesSums, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(slotSizesSums, "slotSizesSums");
        composer.startReplaceableGroup(1305398815);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1305398815, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:37)");
        }
        Object[] objArr = {state, itemProvider, contentPadding, Boolean.valueOf(z10), orientation, Dp.m3949boximpl(f10), Dp.m3949boximpl(f11), slotSizesSums};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i11 = 0; i11 < 8; i11++) {
            zChanged |= composer.changed(objArr[i11]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m640invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridMeasureResult m640invoke0kLqBqw(@NotNull LazyLayoutMeasureScope lazyLayoutMeasureScope, long j10) {
                    Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope, "$this$null");
                    CheckScrollableContainerConstraintsKt.m190checkScrollableContainerConstraintsK40F9xA(j10, orientation);
                    int[] iArrInvoke = slotSizesSums.invoke(lazyLayoutMeasureScope, Constraints.m3907boximpl(j10));
                    boolean z11 = orientation == Orientation.Vertical;
                    state.setLaneWidthsPrefixSum$foundation_release(iArrInvoke);
                    state.setVertical$foundation_release(z11);
                    state.setSpanProvider$foundation_release(itemProvider.getSpanProvider());
                    int iMo302roundToPx0680j_4 = lazyLayoutMeasureScope.mo302roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.beforePadding(contentPadding, orientation, z10, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo302roundToPx0680j_42 = lazyLayoutMeasureScope.mo302roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.afterPadding(contentPadding, orientation, z10, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo302roundToPx0680j_43 = lazyLayoutMeasureScope.mo302roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.startPadding(contentPadding, orientation, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iM3918getMaxHeightimpl = ((z11 ? Constraints.m3918getMaxHeightimpl(j10) : Constraints.m3919getMaxWidthimpl(j10)) - iMo302roundToPx0680j_4) - iMo302roundToPx0680j_42;
                    long jIntOffset = z11 ? IntOffsetKt.IntOffset(iMo302roundToPx0680j_43, iMo302roundToPx0680j_4) : IntOffsetKt.IntOffset(iMo302roundToPx0680j_4, iMo302roundToPx0680j_43);
                    PaddingValues paddingValues = contentPadding;
                    int iMo302roundToPx0680j_44 = lazyLayoutMeasureScope.mo302roundToPx0680j_4(Dp.m3951constructorimpl(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection())));
                    PaddingValues paddingValues2 = contentPadding;
                    LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultM638measureStaggeredGridBTfHGGE = LazyStaggeredGridMeasureKt.m638measureStaggeredGridBTfHGGE(lazyLayoutMeasureScope, state, itemProvider, iArrInvoke, Constraints.m3910copyZbe2FdA$default(j10, ConstraintsKt.m3933constrainWidthK40F9xA(j10, iMo302roundToPx0680j_44), 0, ConstraintsKt.m3932constrainHeightK40F9xA(j10, lazyLayoutMeasureScope.mo302roundToPx0680j_4(Dp.m3951constructorimpl(paddingValues2.getTop() + paddingValues2.getBottom()))), 0, 10, null), z11, z10, jIntOffset, iM3918getMaxHeightimpl, lazyLayoutMeasureScope.mo302roundToPx0680j_4(f10), lazyLayoutMeasureScope.mo302roundToPx0680j_4(f11), iMo302roundToPx0680j_4, iMo302roundToPx0680j_42);
                    state.applyMeasureResult$foundation_release(lazyStaggeredGridMeasureResultM638measureStaggeredGridBTfHGGE);
                    return lazyStaggeredGridMeasureResultM638measureStaggeredGridBTfHGGE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float startPadding(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i10 == 1) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        if (i10 == 2) {
            return paddingValues.getTop();
        }
        throw new m();
    }
}
