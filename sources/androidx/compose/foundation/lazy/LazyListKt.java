package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0095\u0001\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0094\u0001\u0010(\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0$2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010#\u001a\u00020\"H\u0003ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "", "beyondBoundsItemCount", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "content", "LazyList", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "ScrollPositionUpdater", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "rememberLazyListMeasurePolicy", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;Landroidx/compose/runtime/Composer;III)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyList(@org.jetbrains.annotations.NotNull final androidx.compose.ui.Modifier r31, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.lazy.LazyListState r32, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.PaddingValues r33, final boolean r34, final boolean r35, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.gestures.FlingBehavior r36, final boolean r37, int r38, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Horizontal r39, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r40, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Vertical r41, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r42, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit> r43, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.LazyList(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, int, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ExperimentalFoundationApi
    public static final void ScrollPositionUpdater(final LazyListItemProvider lazyListItemProvider, final LazyListState lazyListState, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(3173830);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(lazyListItemProvider) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(3173830, i10, -1, "androidx.compose.foundation.lazy.ScrollPositionUpdater (LazyList.kt:141)");
            }
            if (lazyListItemProvider.getItemCount() > 0) {
                lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProvider);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.ScrollPositionUpdater.1
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
                LazyListKt.ScrollPositionUpdater(lazyListItemProvider, lazyListState, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    @Composable
    @ExperimentalFoundationApi
    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy(final LazyListItemProvider lazyListItemProvider, final LazyListState lazyListState, final LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, final PaddingValues paddingValues, final boolean z10, final boolean z11, final int i10, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, final LazyListItemPlacementAnimator lazyListItemPlacementAnimator, Composer composer, int i11, int i12, int i13) {
        composer.startReplaceableGroup(-966179815);
        final Alignment.Horizontal horizontal3 = (i13 & 128) != 0 ? null : horizontal;
        final Alignment.Vertical vertical3 = (i13 & 256) != 0 ? null : vertical;
        final Arrangement.Horizontal horizontal4 = (i13 & 512) != 0 ? null : horizontal2;
        final Arrangement.Vertical vertical4 = (i13 & 1024) != 0 ? null : vertical2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-966179815, i11, i12, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:152)");
        }
        Object[] objArr = {lazyListState, lazyListBeyondBoundsInfo, paddingValues, Boolean.valueOf(z10), Boolean.valueOf(z11), horizontal3, vertical3, horizontal4, vertical4, lazyListItemPlacementAnimator};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i14 = 0; i14 < 10; i14++) {
            zChanged |= composer.changed(objArr[i14]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult> function2 = new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m523invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyListMeasureResult m523invoke0kLqBqw(@NotNull final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j10) {
                    float spacing;
                    long jIntOffset;
                    Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope, "$this$null");
                    CheckScrollableContainerConstraintsKt.m190checkScrollableContainerConstraintsK40F9xA(j10, z11 ? Orientation.Vertical : Orientation.Horizontal);
                    int iMo302roundToPx0680j_4 = z11 ? lazyLayoutMeasureScope.mo302roundToPx0680j_4(paddingValues.mo399calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo302roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo302roundToPx0680j_42 = z11 ? lazyLayoutMeasureScope.mo302roundToPx0680j_4(paddingValues.mo400calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo302roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo302roundToPx0680j_43 = lazyLayoutMeasureScope.mo302roundToPx0680j_4(paddingValues.getTop());
                    int iMo302roundToPx0680j_44 = lazyLayoutMeasureScope.mo302roundToPx0680j_4(paddingValues.getBottom());
                    final int i15 = iMo302roundToPx0680j_43 + iMo302roundToPx0680j_44;
                    final int i16 = iMo302roundToPx0680j_4 + iMo302roundToPx0680j_42;
                    boolean z12 = z11;
                    int i17 = z12 ? i15 : i16;
                    if (z12 && !z10) {
                        iMo302roundToPx0680j_42 = iMo302roundToPx0680j_43;
                    } else if (z12 && z10) {
                        iMo302roundToPx0680j_42 = iMo302roundToPx0680j_44;
                    } else if (!z12 && !z10) {
                        iMo302roundToPx0680j_42 = iMo302roundToPx0680j_4;
                    }
                    final int i18 = i17 - iMo302roundToPx0680j_42;
                    long jM3935offsetNN6EwU = ConstraintsKt.m3935offsetNN6EwU(j10, -i16, -i15);
                    lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProvider);
                    lazyListState.setDensity$foundation_release(lazyLayoutMeasureScope);
                    lazyListItemProvider.getItemScope().setMaxSize(Constraints.m3919getMaxWidthimpl(jM3935offsetNN6EwU), Constraints.m3918getMaxHeightimpl(jM3935offsetNN6EwU));
                    if (z11) {
                        Arrangement.Vertical vertical5 = vertical4;
                        if (vertical5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        spacing = vertical5.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal5 = horizontal4;
                        if (horizontal5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        spacing = horizontal5.getSpacing();
                    }
                    final int iMo302roundToPx0680j_45 = lazyLayoutMeasureScope.mo302roundToPx0680j_4(spacing);
                    final int itemCount = lazyListItemProvider.getItemCount();
                    int iM3918getMaxHeightimpl = z11 ? Constraints.m3918getMaxHeightimpl(j10) - i15 : Constraints.m3919getMaxWidthimpl(j10) - i16;
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
                    final boolean z14 = z11;
                    LazyListItemProvider lazyListItemProvider2 = lazyListItemProvider;
                    final int i19 = iMo302roundToPx0680j_42;
                    final Alignment.Horizontal horizontal6 = horizontal3;
                    final Alignment.Vertical vertical6 = vertical3;
                    final boolean z15 = z10;
                    final LazyListItemPlacementAnimator lazyListItemPlacementAnimator2 = lazyListItemPlacementAnimator;
                    LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(jM3935offsetNN6EwU, z14, lazyListItemProvider2, lazyLayoutMeasureScope, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                        @Override // androidx.compose.foundation.lazy.MeasuredItemFactory
                        @NotNull
                        /* JADX INFO: renamed from: createItem-HK0c1C0, reason: not valid java name */
                        public final LazyMeasuredItem mo524createItemHK0c1C0(int i20, @NotNull Object key, @NotNull List<? extends Placeable> placeables) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(placeables, "placeables");
                            return new LazyMeasuredItem(i20, placeables, z14, horizontal6, vertical6, lazyLayoutMeasureScope.getLayoutDirection(), z15, i19, i18, lazyListItemPlacementAnimator2, i20 == itemCount + (-1) ? 0 : iMo302roundToPx0680j_45, j11, key, null);
                        }
                    }, null);
                    lazyListState.m536setPremeasureConstraintsBRTryo0$foundation_release(lazyMeasuredItemProvider.getChildConstraints());
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyListState lazyListState2 = lazyListState;
                    Snapshot snapshotCreateNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                        try {
                            int iM506constructorimpl = DataIndex.m506constructorimpl(lazyListState2.getFirstVisibleItemIndex());
                            int firstVisibleItemScrollOffset = lazyListState2.getFirstVisibleItemScrollOffset();
                            Unit unit = Unit.f93236a;
                            snapshotCreateNonObservableSnapshot.dispose();
                            LazyListMeasureResult lazyListMeasureResultM527measureLazyListHh3qtAg = LazyListMeasureKt.m527measureLazyListHh3qtAg(itemCount, lazyListItemProvider, lazyMeasuredItemProvider, iM3918getMaxHeightimpl, i19, i18, iMo302roundToPx0680j_45, iM506constructorimpl, firstVisibleItemScrollOffset, lazyListState.getScrollToBeConsumed(), jM3935offsetNN6EwU, z11, lazyListItemProvider.getHeaderIndexes(), vertical4, horizontal4, z10, lazyLayoutMeasureScope, lazyListItemPlacementAnimator, lazyListBeyondBoundsInfo, i10, lazyListState.getPinnedItems(), new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                }

                                @NotNull
                                public final MeasureResult invoke(int i20, int i21, @NotNull Function1<? super Placeable.PlacementScope, Unit> placement) {
                                    Intrinsics.checkNotNullParameter(placement, "placement");
                                    return lazyLayoutMeasureScope.layout(ConstraintsKt.m3933constrainWidthK40F9xA(j10, i20 + i16), ConstraintsKt.m3932constrainHeightK40F9xA(j10, i21 + i15), MapsKt.emptyMap(), placement);
                                }
                            });
                            lazyListState.applyMeasureResult$foundation_release(lazyListMeasureResultM527measureLazyListHh3qtAg);
                            return lazyListMeasureResultM527measureLazyListHh3qtAg;
                        } finally {
                            snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                        }
                    } catch (Throwable th2) {
                        snapshotCreateNonObservableSnapshot.dispose();
                        throw th2;
                    }
                }
            };
            composer.updateRememberedValue(function2);
            objRememberedValue = function2;
        }
        composer.endReplaceableGroup();
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function22;
    }
}
