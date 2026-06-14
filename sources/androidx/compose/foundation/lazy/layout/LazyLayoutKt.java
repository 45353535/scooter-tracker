package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001aJ\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measurePolicy", "", "LazyLayout", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "MaxItemsToRetainForReuse", "I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyLayoutKt {
    private static final int MaxItemsToRetainForReuse = 7;

    @Composable
    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void LazyLayout(@NotNull final LazyLayoutItemProvider itemProvider, @Nullable Modifier modifier, @Nullable LazyLayoutPrefetchState lazyLayoutPrefetchState, @NotNull final Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> measurePolicy, @Nullable Composer composer, final int i10, final int i11) {
        int i12;
        final LazyLayoutPrefetchState lazyLayoutPrefetchState2;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer composerStartRestartGroup = composer.startRestartGroup(852831187);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(itemProvider) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(lazyLayoutPrefetchState) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(measurePolicy) ? 2048 : 1024;
        }
        final int i15 = i12;
        if ((i15 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            final Modifier modifier3 = modifier;
            if (i14 != 0) {
                lazyLayoutPrefetchState = null;
            }
            final LazyLayoutPrefetchState lazyLayoutPrefetchState3 = lazyLayoutPrefetchState;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(852831187, i15, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:41)");
            }
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(itemProvider, composerStartRestartGroup, i15 & 14);
            LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1342877611, true, new Function3<SaveableStateHolder, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(SaveableStateHolder saveableStateHolder, Composer composer2, Integer num) {
                    invoke(saveableStateHolder, composer2, num.intValue());
                    return Unit.f93236a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@NotNull SaveableStateHolder saveableStateHolder, @Nullable Composer composer2, int i16) {
                    Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1342877611, i16, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:49)");
                    }
                    final State<LazyLayoutItemProvider> state = stateRememberUpdatedState;
                    composer2.startReplaceableGroup(-492369756);
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new Function0<LazyLayoutItemProvider>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LazyLayoutItemProvider invoke() {
                                return state.getValue();
                            }
                        });
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objRememberedValue;
                    composer2.startReplaceableGroup(-492369756);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objRememberedValue2;
                    LazyLayoutPrefetchState lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
                    composer2.startReplaceableGroup(-1523808544);
                    if (lazyLayoutPrefetchState4 != null) {
                        LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(lazyLayoutPrefetchState3, lazyLayoutItemContentFactory, subcomposeLayoutState, composer2, ((i15 >> 6) & 14) | 64 | (SubcomposeLayoutState.$stable << 6));
                        Unit unit = Unit.f93236a;
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifier4 = modifier3;
                    final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = measurePolicy;
                    composer2.startReplaceableGroup(511388516);
                    boolean zChanged = composer2.changed(lazyLayoutItemContentFactory) | composer2.changed(function2);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m618invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m618invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j10) {
                                Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "$this$null");
                                return function2.invoke(new LazyLayoutMeasureScopeImpl(lazyLayoutItemContentFactory, subcomposeMeasureScope), Constraints.m3907boximpl(j10));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier4, (Function2) objRememberedValue3, composer2, SubcomposeLayoutState.$stable | (i15 & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            lazyLayoutPrefetchState2 = lazyLayoutPrefetchState3;
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.2
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
                LazyLayoutKt.LazyLayout(itemProvider, modifier2, lazyLayoutPrefetchState2, measurePolicy, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
            }
        });
    }
}
