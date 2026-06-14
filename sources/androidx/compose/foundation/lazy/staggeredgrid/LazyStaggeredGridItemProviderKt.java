package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$itemProviderState$1;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", "content", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "rememberStaggeredGridItemProvider", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyStaggeredGridItemProviderKt {
    @Composable
    @ExperimentalFoundationApi
    @NotNull
    public static final LazyStaggeredGridItemProvider rememberStaggeredGridItemProvider(@NotNull final LazyStaggeredGridState state, @NotNull Function1<? super LazyStaggeredGridScope, Unit> content, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(2039920307);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2039920307, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider (LazyStaggeredGridItemProvider.kt:35)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composer, (i10 >> 3) & 14);
        final State<IntRange> stateRememberLazyNearestItemsRangeState = LazyNearestItemsRangeKt.rememberLazyNearestItemsRangeState(new Function0<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$nearestItemsRangeState$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(state.getFirstVisibleItemIndex());
            }
        }, new Function0<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$nearestItemsRangeState$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return 90;
            }
        }, new Function0<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$nearestItemsRangeState$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return 200;
            }
        }, composer, 432);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(state);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$1(SnapshotStateKt.derivedStateOf(new Function0<LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$itemProviderState$1.AnonymousClass1>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$itemProviderState$1

                /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$itemProviderState$1$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public static final class AnonymousClass1 implements LazyLayoutItemProvider, LazyStaggeredGridItemProvider {
                    private final /* synthetic */ LazyLayoutItemProvider $$delegate_0;

                    @NotNull
                    private final LazyStaggeredGridSpanProvider spanProvider;

                    AnonymousClass1(LazyStaggeredGridScopeImpl lazyStaggeredGridScopeImpl, State<IntRange> state, final LazyStaggeredGridState lazyStaggeredGridState) {
                        this.$$delegate_0 = LazyLayoutItemProviderKt.LazyLayoutItemProvider(lazyStaggeredGridScopeImpl.getIntervals(), state.getValue(), ComposableLambdaKt.composableLambdaInstance(-364721306, true, new Function4<IntervalList.Interval<? extends LazyStaggeredGridIntervalContent>, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.1.itemProviderState.1.1.1
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(IntervalList.Interval<? extends LazyStaggeredGridIntervalContent> interval, Integer num, Composer composer, Integer num2) {
                                invoke((IntervalList.Interval<LazyStaggeredGridIntervalContent>) interval, num.intValue(), composer, num2.intValue());
                                return Unit.f93236a;
                            }

                            @Composable
                            public final void invoke(@NotNull final IntervalList.Interval<LazyStaggeredGridIntervalContent> interval, int i10, @Nullable Composer composer, int i11) {
                                int i12;
                                Intrinsics.checkNotNullParameter(interval, "interval");
                                if ((i11 & 14) == 0) {
                                    i12 = (composer.changed(interval) ? 4 : 2) | i11;
                                } else {
                                    i12 = i11;
                                }
                                if ((i11 & 112) == 0) {
                                    i12 |= composer.changed(i10) ? 32 : 16;
                                }
                                if ((i12 & 731) == 146 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-364721306, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.$$delegate_0.<anonymous> (LazyStaggeredGridItemProvider.kt:51)");
                                }
                                final int startIndex = i10 - interval.getStartIndex();
                                Function1<Integer, Object> key = interval.getValue().getKey();
                                LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(key != null ? key.invoke(Integer.valueOf(startIndex)) : null, i10, lazyStaggeredGridState.getPinnedItems(), ComposableLambdaKt.composableLambda(composer, 1181040114, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.1.itemProviderState.1.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.f93236a;
                                    }

                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i13) {
                                        if ((i13 & 11) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1181040114, i13, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.$$delegate_0.<anonymous>.<anonymous> (LazyStaggeredGridItemProvider.kt:57)");
                                        }
                                        interval.getValue().getItem().invoke(LazyStaggeredGridItemScopeImpl.INSTANCE, Integer.valueOf(startIndex), composer2, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer, (i12 & 112) | 3592);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        this.spanProvider = new LazyStaggeredGridSpanProvider(lazyStaggeredGridScopeImpl.getIntervals());
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    @Composable
                    public void Item(int i10, @Nullable Composer composer, int i11) {
                        composer.startReplaceableGroup(1163616889);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1163616889, i11, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.Item (LazyStaggeredGridItemProvider.kt:-1)");
                        }
                        this.$$delegate_0.Item(i10, composer, i11 & 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceableGroup();
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    @Nullable
                    public Object getContentType(int i10) {
                        return this.$$delegate_0.getContentType(i10);
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    public int getItemCount() {
                        return this.$$delegate_0.getItemCount();
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    @NotNull
                    public Object getKey(int i10) {
                        return this.$$delegate_0.getKey(i10);
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    @NotNull
                    public Map<Object, Integer> getKeyToIndexMap() {
                        return this.$$delegate_0.getKeyToIndexMap();
                    }

                    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider
                    @NotNull
                    public LazyStaggeredGridSpanProvider getSpanProvider() {
                        return this.spanProvider;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final AnonymousClass1 invoke() {
                    LazyStaggeredGridScopeImpl lazyStaggeredGridScopeImpl = new LazyStaggeredGridScopeImpl();
                    stateRememberUpdatedState.getValue().invoke(lazyStaggeredGridScopeImpl);
                    return new AnonymousClass1(lazyStaggeredGridScopeImpl, stateRememberLazyNearestItemsRangeState, state);
                }
            }));
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$1 lazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$1 = (LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$1;
    }
}
