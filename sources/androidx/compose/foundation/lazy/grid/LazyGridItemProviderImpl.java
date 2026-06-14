package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001e\u001a\u00020\u0010H\u0096\u0001J\u0011\u0010!\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0010H\u0096\u0001J$\u0010\"\u001a\u00020#*\u00020$2\u0006\u0010\u001e\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u0010X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u00148VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemProviderImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "intervals", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "hasCustomSpans", "", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "nearestItemsRange", "Lkotlin/ranges/IntRange;", "(Landroidx/compose/foundation/lazy/layout/IntervalList;ZLandroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/ranges/IntRange;)V", "getHasCustomSpans", "()Z", "itemCount", "", "getItemCount", "()I", "keyToIndexMap", "", "", "getKeyToIndexMap", "()Ljava/util/Map;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "getSpanLayoutProvider", "()Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "Item", "", FirebaseAnalytics.Param.INDEX, "(ILandroidx/compose/runtime/Composer;I)V", "getContentType", "getKey", "getSpan", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "getSpan-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LazyGridItemProviderImpl implements LazyGridItemProvider, LazyLayoutItemProvider {
    private final /* synthetic */ LazyLayoutItemProvider $$delegate_0;
    private final boolean hasCustomSpans;

    @NotNull
    private final IntervalList<LazyGridIntervalContent> intervals;

    @NotNull
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public LazyGridItemProviderImpl(@NotNull IntervalList<LazyGridIntervalContent> intervals, boolean z10, @NotNull final LazyGridState state, @NotNull IntRange nearestItemsRange) {
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(nearestItemsRange, "nearestItemsRange");
        this.intervals = intervals;
        this.hasCustomSpans = z10;
        this.$$delegate_0 = LazyLayoutItemProviderKt.LazyLayoutItemProvider(intervals, nearestItemsRange, ComposableLambdaKt.composableLambdaInstance(-1961468361, true, new Function4<IntervalList.Interval<? extends LazyGridIntervalContent>, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.1
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(IntervalList.Interval<? extends LazyGridIntervalContent> interval, Integer num, Composer composer, Integer num2) {
                invoke((IntervalList.Interval<LazyGridIntervalContent>) interval, num.intValue(), composer, num2.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(@NotNull final IntervalList.Interval<LazyGridIntervalContent> interval, int i10, @Nullable Composer composer, int i11) {
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
                    ComposerKt.traceEventStart(-1961468361, i12, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.$$delegate_0.<anonymous> (LazyGridItemProvider.kt:89)");
                }
                final int startIndex = i10 - interval.getStartIndex();
                Function1<Integer, Object> key = interval.getValue().getKey();
                LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(key != null ? key.invoke(Integer.valueOf(startIndex)) : null, i10, state.getPinnedItems(), ComposableLambdaKt.composableLambda(composer, -269692885, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.1.1
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
                            ComposerKt.traceEventStart(-269692885, i13, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.$$delegate_0.<anonymous>.<anonymous> (LazyGridItemProvider.kt:95)");
                        }
                        interval.getValue().getItem().invoke(LazyGridItemScopeImpl.INSTANCE, Integer.valueOf(startIndex), composer2, 6);
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
        this.spanLayoutProvider = new LazyGridSpanLayoutProvider(this);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(final int i10, @Nullable Composer composer, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1355196996);
        if ((i11 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1355196996, i12, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:-1)");
            }
            this.$$delegate_0.Item(i10, composerStartRestartGroup, i12 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i13) {
                LazyGridItemProviderImpl.this.Item(i10, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
            }
        });
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Nullable
    public Object getContentType(int index) {
        return this.$$delegate_0.getContentType(index);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.$$delegate_0.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @NotNull
    public Object getKey(int index) {
        return this.$$delegate_0.getKey(index);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @NotNull
    public Map<Object, Integer> getKeyToIndexMap() {
        return this.$$delegate_0.getKeyToIndexMap();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    /* JADX INFO: renamed from: getSpan-_-orMbw */
    public long mo576getSpan_orMbw(@NotNull LazyGridItemSpanScope getSpan, int i10) {
        Intrinsics.checkNotNullParameter(getSpan, "$this$getSpan");
        IntervalList.Interval<LazyGridIntervalContent> interval = this.intervals.get(i10);
        return interval.getValue().getSpan().invoke(getSpan, Integer.valueOf(i10 - interval.getStartIndex())).getPackedValue();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    @NotNull
    public LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.spanLayoutProvider;
    }
}
