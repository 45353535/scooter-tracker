package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0096\u0001\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u008c\u0001\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020#0\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010!\u001a\u00020 H\u0003ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "", "", "slotSizesSums", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "content", "LazyGrid", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "ScrollPositionUpdater", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureResult;", "rememberLazyGridMeasurePolicy", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyGridKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0311 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0130  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyGrid(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r24, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.lazy.grid.LazyGridState r25, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super androidx.compose.ui.unit.Constraints, ? extends java.util.List<java.lang.Integer>> r26, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r27, boolean r28, boolean r29, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.FlingBehavior r30, final boolean r31, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.Arrangement.Vertical r32, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.Arrangement.Horizontal r33, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit> r34, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r35, final int r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, kotlin.jvm.functions.Function2, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void ScrollPositionUpdater(final LazyGridItemProvider lazyGridItemProvider, final LazyGridState lazyGridState, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(950944068);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(lazyGridItemProvider) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(lazyGridState) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(950944068, i10, -1, "androidx.compose.foundation.lazy.grid.ScrollPositionUpdater (LazyGrid.kt:139)");
            }
            if (lazyGridItemProvider.getItemCount() > 0) {
                lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProvider);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.ScrollPositionUpdater.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                LazyGridKt.ScrollPositionUpdater(lazyGridItemProvider, lazyGridState, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    @Composable
    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy(final LazyGridItemProvider lazyGridItemProvider, final LazyGridState lazyGridState, final Function2<? super Density, ? super Constraints, ? extends List<Integer>> function2, final PaddingValues paddingValues, final boolean z10, final boolean z11, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, final LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(237903564);
        final Arrangement.Horizontal horizontal2 = (i11 & 64) != 0 ? null : horizontal;
        final Arrangement.Vertical vertical2 = (i11 & 128) != 0 ? null : vertical;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(237903564, i10, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:150)");
        }
        Object[] objArr = {lazyGridState, function2, paddingValues, Boolean.valueOf(z10), Boolean.valueOf(z11), horizontal2, vertical2, lazyGridItemPlacementAnimator};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i12 = 0; i12 < 8; i12++) {
            zChanged |= composer.changed(objArr[i12]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult> function22 = new Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m577invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridMeasureResult m577invoke0kLqBqw(@NotNull final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j10) {
                    float spacing;
                    float spacing2;
                    long jIntOffset;
                    int iM591getLineIndexOfItem_Ze7BM;
                    LazyMeasuredLineProvider lazyMeasuredLineProvider;
                    int firstVisibleItemScrollOffset;
                    Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope, "$this$null");
                    CheckScrollableContainerConstraintsKt.m190checkScrollableContainerConstraintsK40F9xA(j10, z11 ? Orientation.Vertical : Orientation.Horizontal);
                    int iMo302roundToPx0680j_4 = z11 ? lazyLayoutMeasureScope.mo302roundToPx0680j_4(paddingValues.mo399calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo302roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo302roundToPx0680j_42 = z11 ? lazyLayoutMeasureScope.mo302roundToPx0680j_4(paddingValues.mo400calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo302roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo302roundToPx0680j_43 = lazyLayoutMeasureScope.mo302roundToPx0680j_4(paddingValues.getTop());
                    int iMo302roundToPx0680j_44 = lazyLayoutMeasureScope.mo302roundToPx0680j_4(paddingValues.getBottom());
                    final int i13 = iMo302roundToPx0680j_43 + iMo302roundToPx0680j_44;
                    final int i14 = iMo302roundToPx0680j_4 + iMo302roundToPx0680j_42;
                    boolean z12 = z11;
                    int i15 = z12 ? i13 : i14;
                    final int i16 = (!z12 || z10) ? (z12 && z10) ? iMo302roundToPx0680j_44 : (z12 || z10) ? iMo302roundToPx0680j_42 : iMo302roundToPx0680j_4 : iMo302roundToPx0680j_43;
                    final int i17 = i15 - i16;
                    long jM3935offsetNN6EwU = ConstraintsKt.m3935offsetNN6EwU(j10, -i14, -i13);
                    lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProvider);
                    final LazyGridSpanLayoutProvider spanLayoutProvider = lazyGridItemProvider.getSpanLayoutProvider();
                    final List<Integer> listInvoke = function2.invoke(lazyLayoutMeasureScope, Constraints.m3907boximpl(j10));
                    spanLayoutProvider.setSlotsPerLine(listInvoke.size());
                    lazyGridState.setDensity$foundation_release(lazyLayoutMeasureScope);
                    lazyGridState.setSlotsPerLine$foundation_release(listInvoke.size());
                    if (z11) {
                        Arrangement.Vertical vertical3 = vertical2;
                        if (vertical3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        spacing = vertical3.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal3 = horizontal2;
                        if (horizontal3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        spacing = horizontal3.getSpacing();
                    }
                    int iMo302roundToPx0680j_45 = lazyLayoutMeasureScope.mo302roundToPx0680j_4(spacing);
                    if (z11) {
                        Arrangement.Horizontal horizontal4 = horizontal2;
                        spacing2 = horizontal4 != null ? horizontal4.getSpacing() : Dp.m3951constructorimpl(0);
                    } else {
                        Arrangement.Vertical vertical4 = vertical2;
                        spacing2 = vertical4 != null ? vertical4.getSpacing() : Dp.m3951constructorimpl(0);
                    }
                    final int iMo302roundToPx0680j_46 = lazyLayoutMeasureScope.mo302roundToPx0680j_4(spacing2);
                    int itemCount = lazyGridItemProvider.getItemCount();
                    int iM3918getMaxHeightimpl = z11 ? Constraints.m3918getMaxHeightimpl(j10) - i13 : Constraints.m3919getMaxWidthimpl(j10) - i14;
                    if (!z10 || iM3918getMaxHeightimpl > 0) {
                        jIntOffset = IntOffsetKt.IntOffset(iMo302roundToPx0680j_4, iMo302roundToPx0680j_43);
                    } else {
                        boolean z13 = z11;
                        if (!z13) {
                            iMo302roundToPx0680j_4 += iM3918getMaxHeightimpl;
                        }
                        if (z13) {
                            iMo302roundToPx0680j_43 += iM3918getMaxHeightimpl;
                        }
                        jIntOffset = IntOffsetKt.IntOffset(iMo302roundToPx0680j_4, iMo302roundToPx0680j_43);
                    }
                    final long j11 = jIntOffset;
                    LazyGridItemProvider lazyGridItemProvider2 = lazyGridItemProvider;
                    final boolean z14 = z11;
                    final boolean z15 = z10;
                    final LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator2 = lazyGridItemPlacementAnimator;
                    MeasuredItemFactory measuredItemFactory = new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                        @Override // androidx.compose.foundation.lazy.grid.MeasuredItemFactory
                        @NotNull
                        /* JADX INFO: renamed from: createItem-PU_OBEw, reason: not valid java name */
                        public final LazyGridMeasuredItem mo579createItemPU_OBEw(int i18, @NotNull Object key, int i19, int i20, @NotNull List<? extends Placeable> placeables) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(placeables, "placeables");
                            return new LazyGridMeasuredItem(i18, key, z14, i19, i20, z15, lazyLayoutMeasureScope.getLayoutDirection(), i16, i17, placeables, lazyGridItemPlacementAnimator2, j11, null);
                        }
                    };
                    int i18 = i16;
                    LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(lazyGridItemProvider2, lazyLayoutMeasureScope, iMo302roundToPx0680j_45, measuredItemFactory);
                    final boolean z16 = z11;
                    final LazyMeasuredLineProvider lazyMeasuredLineProvider2 = new LazyMeasuredLineProvider(z16, listInvoke, iMo302roundToPx0680j_46, itemCount, iMo302roundToPx0680j_45, lazyMeasuredItemProvider, spanLayoutProvider, new MeasuredLineFactory() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                        @Override // androidx.compose.foundation.lazy.grid.MeasuredLineFactory
                        @NotNull
                        /* JADX INFO: renamed from: createLine-H9FfpSk, reason: not valid java name */
                        public final LazyGridMeasuredLine mo580createLineH9FfpSk(int i19, @NotNull LazyGridMeasuredItem[] items, @NotNull List<GridItemSpan> spans, int i20) {
                            Intrinsics.checkNotNullParameter(items, "items");
                            Intrinsics.checkNotNullParameter(spans, "spans");
                            return new LazyGridMeasuredLine(i19, items, spans, z16, listInvoke.size(), lazyLayoutMeasureScope.getLayoutDirection(), i20, iMo302roundToPx0680j_46, null);
                        }
                    });
                    lazyGridState.setPrefetchInfoRetriever$foundation_release(new Function1<LineIndex, ArrayList<Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ ArrayList<Pair<? extends Integer, ? extends Constraints>> invoke(LineIndex lineIndex) {
                            return m578invokebKFJvoY(lineIndex.m610unboximpl());
                        }

                        @NotNull
                        /* JADX INFO: renamed from: invoke-bKFJvoY, reason: not valid java name */
                        public final ArrayList<Pair<Integer, Constraints>> m578invokebKFJvoY(int i19) {
                            LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = spanLayoutProvider.getLineConfiguration(i19);
                            int iM552constructorimpl = ItemIndex.m552constructorimpl(lineConfiguration.getFirstItemIndex());
                            ArrayList<Pair<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                            List<GridItemSpan> spans = lineConfiguration.getSpans();
                            LazyMeasuredLineProvider lazyMeasuredLineProvider3 = lazyMeasuredLineProvider2;
                            int size = spans.size();
                            int i20 = 0;
                            for (int i21 = 0; i21 < size; i21++) {
                                int iM546getCurrentLineSpanimpl = GridItemSpan.m546getCurrentLineSpanimpl(spans.get(i21).getPackedValue());
                                arrayList.add(TuplesKt.to(Integer.valueOf(iM552constructorimpl), Constraints.m3907boximpl(lazyMeasuredLineProvider3.m595childConstraintsJhjzzOo$foundation_release(i20, iM546getCurrentLineSpanimpl))));
                                iM552constructorimpl = ItemIndex.m552constructorimpl(iM552constructorimpl + 1);
                                i20 += iM546getCurrentLineSpanimpl;
                            }
                            return arrayList;
                        }
                    });
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyGridState lazyGridState2 = lazyGridState;
                    Snapshot snapshotCreateNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                        try {
                            if (lazyGridState2.getFirstVisibleItemIndex() < itemCount || itemCount <= 0) {
                                iM591getLineIndexOfItem_Ze7BM = spanLayoutProvider.m591getLineIndexOfItem_Ze7BM(lazyGridState2.getFirstVisibleItemIndex());
                                lazyMeasuredLineProvider = lazyMeasuredLineProvider2;
                                firstVisibleItemScrollOffset = lazyGridState2.getFirstVisibleItemScrollOffset();
                            } else {
                                iM591getLineIndexOfItem_Ze7BM = spanLayoutProvider.m591getLineIndexOfItem_Ze7BM(itemCount - 1);
                                lazyMeasuredLineProvider = lazyMeasuredLineProvider2;
                                firstVisibleItemScrollOffset = 0;
                            }
                            Unit unit = Unit.f93236a;
                            snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                            snapshotCreateNonObservableSnapshot.dispose();
                            LazyGridMeasureResult lazyGridMeasureResultM581measureLazyGridt5wl_D8 = LazyGridMeasureKt.m581measureLazyGridt5wl_D8(itemCount, lazyGridItemProvider, lazyMeasuredLineProvider, lazyMeasuredItemProvider, iM3918getMaxHeightimpl, i18, i17, iMo302roundToPx0680j_45, iM591getLineIndexOfItem_Ze7BM, firstVisibleItemScrollOffset, lazyGridState.getScrollToBeConsumed(), jM3935offsetNN6EwU, z11, vertical2, horizontal2, z10, lazyLayoutMeasureScope, lazyGridItemPlacementAnimator, spanLayoutProvider, lazyGridState.getPinnedItems(), new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                }

                                @NotNull
                                public final MeasureResult invoke(int i19, int i20, @NotNull Function1<? super Placeable.PlacementScope, Unit> placement) {
                                    Intrinsics.checkNotNullParameter(placement, "placement");
                                    return lazyLayoutMeasureScope.layout(ConstraintsKt.m3933constrainWidthK40F9xA(j10, i19 + i14), ConstraintsKt.m3932constrainHeightK40F9xA(j10, i20 + i13), MapsKt.emptyMap(), placement);
                                }
                            });
                            lazyGridState.applyMeasureResult$foundation_release(lazyGridMeasureResultM581measureLazyGridt5wl_D8);
                            return lazyGridMeasureResultM581measureLazyGridt5wl_D8;
                        } catch (Throwable th2) {
                            snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        snapshotCreateNonObservableSnapshot.dispose();
                        throw th3;
                    }
                }
            };
            composer.updateRememberedValue(function22);
            objRememberedValue = function22;
        }
        composer.endReplaceableGroup();
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function23 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function23;
    }
}
