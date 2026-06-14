package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0099\u0001\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "", "slotSizesSums", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "crossAxisSpacing", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", "content", "LazyStaggeredGrid-LJWHXA8", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZFFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "LazyStaggeredGrid", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "ScrollPositionUpdater", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyStaggeredGridKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalFoundationApi
    /* JADX INFO: renamed from: LazyStaggeredGrid-LJWHXA8, reason: not valid java name */
    public static final void m630LazyStaggeredGridLJWHXA8(@NotNull final LazyStaggeredGridState state, @NotNull final Orientation orientation, @NotNull final Function2<? super Density, ? super Constraints, int[]> slotSizesSums, @Nullable Modifier modifier, @Nullable PaddingValues paddingValues, boolean z10, @Nullable FlingBehavior flingBehavior, boolean z11, float f10, float f11, @NotNull final Function1<? super LazyStaggeredGridScope, Unit> content, @Nullable Composer composer, final int i10, final int i11, final int i12) {
        FlingBehavior flingBehavior2;
        int i13;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(slotSizesSums, "slotSizesSums");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1320541636);
        Modifier modifier2 = (i12 & 8) != 0 ? Modifier.INSTANCE : modifier;
        PaddingValues paddingValuesM411PaddingValues0680j_4 = (i12 & 16) != 0 ? PaddingKt.m411PaddingValues0680j_4(Dp.m3951constructorimpl(0)) : paddingValues;
        boolean z12 = (i12 & 32) != 0 ? false : z10;
        if ((i12 & 64) != 0) {
            i13 = i10 & (-3670017);
            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
        } else {
            flingBehavior2 = flingBehavior;
            i13 = i10;
        }
        boolean z13 = (i12 & 128) != 0 ? true : z11;
        float fM3951constructorimpl = (i12 & 256) != 0 ? Dp.m3951constructorimpl(0) : f10;
        float fM3951constructorimpl2 = (i12 & 512) != 0 ? Dp.m3951constructorimpl(0) : f11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1320541636, i13, i11, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:39)");
        }
        ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
        OverscrollEffect overscrollEffect = scrollableDefaults.overscrollEffect(composerStartRestartGroup, 6);
        LazyStaggeredGridItemProvider lazyStaggeredGridItemProviderRememberStaggeredGridItemProvider = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider(state, content, composerStartRestartGroup, ((i11 << 3) & 112) | 8);
        int i14 = i13 >> 6;
        int i15 = i13 >> 9;
        final PaddingValues paddingValues2 = paddingValuesM411PaddingValues0680j_4;
        final boolean z14 = z12;
        final float f12 = fM3951constructorimpl2;
        final float f13 = fM3951constructorimpl;
        final FlingBehavior flingBehavior3 = flingBehavior2;
        Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2M639rememberStaggeredGridMeasurePolicynbWgWpA = LazyStaggeredGridMeasurePolicyKt.m639rememberStaggeredGridMeasurePolicynbWgWpA(state, lazyStaggeredGridItemProviderRememberStaggeredGridItemProvider, paddingValues2, z14, orientation, f13, f12, slotSizesSums, composerStartRestartGroup, (i14 & 7168) | (i14 & 896) | 8 | ((i13 << 9) & 57344) | (i15 & 458752) | (i15 & 3670016) | ((i13 << 15) & 29360128));
        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyStaggeredGridSemanticState = LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(state, z14, composerStartRestartGroup, ((i13 >> 12) & 112) | 8);
        ScrollPositionUpdater(lazyStaggeredGridItemProviderRememberStaggeredGridItemProvider, state, composerStartRestartGroup, 64);
        final boolean z15 = z13;
        LazyLayoutKt.LazyLayout(lazyStaggeredGridItemProviderRememberStaggeredGridItemProvider, LazyLayoutSemanticsKt.lazyLayoutSemantics(ScrollableKt.scrollable(OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(modifier2.then(state.getRemeasurementModifier()), orientation), overscrollEffect), state, orientation, overscrollEffect, z15, scrollableDefaults.reverseDirection((LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z14), flingBehavior3, state.getMutableInteractionSource()), lazyStaggeredGridItemProviderRememberStaggeredGridItemProvider, lazyLayoutSemanticStateRememberLazyStaggeredGridSemanticState, orientation, z15, z14, composerStartRestartGroup, ((i13 << 6) & 7168) | (i15 & 57344) | (i13 & 458752)), state.getPrefetchState(), function2M639rememberStaggeredGridMeasurePolicynbWgWpA, composerStartRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i16) {
                LazyStaggeredGridKt.m630LazyStaggeredGridLJWHXA8(state, orientation, slotSizesSums, modifier3, paddingValues2, z14, flingBehavior3, z15, f13, f12, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11), i12);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void ScrollPositionUpdater(final LazyLayoutItemProvider lazyLayoutItemProvider, final LazyStaggeredGridState lazyStaggeredGridState, Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(231106410);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(231106410, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.ScrollPositionUpdater (LazyStaggeredGrid.kt:114)");
        }
        if (lazyLayoutItemProvider.getItemCount() > 0) {
            lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyLayoutItemProvider);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt.ScrollPositionUpdater.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i11) {
                LazyStaggeredGridKt.ScrollPositionUpdater(lazyLayoutItemProvider, lazyStaggeredGridState, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }
}
