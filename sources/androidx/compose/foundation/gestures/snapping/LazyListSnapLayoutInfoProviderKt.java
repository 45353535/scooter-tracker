package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import bg.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a9\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aC\u0010\u0010\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Lkotlin/Function3;", "Landroidx/compose/ui/unit/Density;", "", "positionInLayout", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "SnapLayoutInfoProvider", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "rememberSnapFlingBehavior", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "layoutInfo", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "item", "calculateDistanceToDesiredSnapPosition", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/LazyListLayoutInfo;Landroidx/compose/foundation/lazy/LazyListItemInfo;Lkotlin/jvm/functions/Function3;)F", "", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I", "singleAxisViewportSize", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyListSnapLayoutInfoProviderKt {
    @ExperimentalFoundationApi
    @NotNull
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(@NotNull final LazyListState lazyListState, @NotNull final Function3<? super Density, ? super Float, ? super Float, Float> positionInLayout) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(positionInLayout, "positionInLayout");
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.2
            private final LazyListLayoutInfo getLayoutInfo() {
                return lazyListState.getLayoutInfo();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(@NotNull Density density, float f10) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                float fD = g.d(Math.abs(DecayAnimationSpecKt.calculateTargetValue(SplineBasedDecayKt.splineBasedDecay(density), 0.0f, f10)) - calculateSnapStepSize(density), 0.0f);
                return fD == 0.0f ? fD : fD * Math.signum(f10);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapStepSize(@NotNull Density density) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                LazyListLayoutInfo layoutInfo = getLayoutInfo();
                if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                    return 0.0f;
                }
                List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
                int size = visibleItemsInfo.size();
                int size2 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    size2 += visibleItemsInfo.get(i10).getSize();
                }
                return size2 / layoutInfo.getVisibleItemsInfo().size();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            @NotNull
            public b calculateSnappingOffsetBounds(@NotNull Density density) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                List<LazyListItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                Function3<Density, Float, Float, Float> function3 = positionInLayout;
                int size = visibleItemsInfo.size();
                float f10 = Float.NEGATIVE_INFINITY;
                float f11 = Float.POSITIVE_INFINITY;
                for (int i10 = 0; i10 < size; i10++) {
                    float fCalculateDistanceToDesiredSnapPosition = LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(density, getLayoutInfo(), visibleItemsInfo.get(i10), function3);
                    if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f10) {
                        f10 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f11) {
                        f11 = fCalculateDistanceToDesiredSnapPosition;
                    }
                }
                return g.b(f10, f11);
            }
        };
    }

    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyListState lazyListState, Function3 function3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function3 = new Function3<Density, Float, Float, Float>() { // from class: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1
                @NotNull
                public final Float invoke(@NotNull Density density, float f10, float f11) {
                    Intrinsics.checkNotNullParameter(density, "$this$null");
                    return Float.valueOf((f10 / 2.0f) - (f11 / 2.0f));
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Float invoke(Density density, Float f10, Float f11) {
                    return invoke(density, f10.floatValue(), f11.floatValue());
                }
            };
        }
        return SnapLayoutInfoProvider(lazyListState, function3);
    }

    public static final float calculateDistanceToDesiredSnapPosition(@NotNull Density density, @NotNull LazyListLayoutInfo layoutInfo, @NotNull LazyListItemInfo item, @NotNull Function3<? super Density, ? super Float, ? super Float, Float> positionInLayout) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(positionInLayout, "positionInLayout");
        return item.getOffset() - positionInLayout.invoke(density, Float.valueOf((getSingleAxisViewportSize(layoutInfo) - layoutInfo.getBeforeContentPadding()) - layoutInfo.getAfterContentPadding()), Float.valueOf(item.getSize())).floatValue();
    }

    private static final int getSingleAxisViewportSize(LazyListLayoutInfo lazyListLayoutInfo) {
        return lazyListLayoutInfo.getOrientation() == Orientation.Vertical ? IntSize.m4110getHeightimpl(lazyListLayoutInfo.mo517getViewportSizeYbymL2g()) : IntSize.m4111getWidthimpl(lazyListLayoutInfo.mo517getViewportSizeYbymL2g());
    }

    @Composable
    @ExperimentalFoundationApi
    @NotNull
    public static final FlingBehavior rememberSnapFlingBehavior(@NotNull LazyListState lazyListState, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        composer.startReplaceableGroup(1148456277);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1148456277, i10, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:108)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(lazyListState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapLayoutInfoProvider$default(lazyListState, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        SnapFlingBehavior snapFlingBehaviorRememberSnapFlingBehavior = SnapFlingBehaviorKt.rememberSnapFlingBehavior((SnapLayoutInfoProvider) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehaviorRememberSnapFlingBehavior;
    }
}
