package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003BB\u0012#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\b\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0013\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u00172\u0006\u0010\u0015\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u001eR4\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyLayoutItemsProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "IntervalContent", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "", "", "Landroidx/compose/runtime/Composable;", "itemContentProvider", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "intervals", "Lkotlin/ranges/IntRange;", "nearestItemsRange", "<init>", "(Lkotlin/jvm/functions/Function4;Landroidx/compose/foundation/lazy/layout/IntervalList;Lkotlin/ranges/IntRange;)V", "T", FirebaseAnalytics.Param.INDEX, "block", "withLocalIntervalIndex", "(ILkotlin/jvm/functions/Function2;)Ljava/lang/Object;", SessionDescription.ATTR_RANGE, "list", "", "", "generateKeyToIndexMap", "(Lkotlin/ranges/IntRange;Landroidx/compose/foundation/lazy/layout/IntervalList;)Ljava/util/Map;", "Item", "(ILandroidx/compose/runtime/Composer;I)V", "getKey", "(I)Ljava/lang/Object;", "getContentType", "Lkotlin/jvm/functions/Function4;", "getItemContentProvider", "()Lkotlin/jvm/functions/Function4;", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;", "keyToIndexMap", "Ljava/util/Map;", "getKeyToIndexMap", "()Ljava/util/Map;", "getItemCount", "()I", "itemCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DefaultLazyLayoutItemsProvider<IntervalContent extends LazyLayoutIntervalContent> implements LazyLayoutItemProvider {

    @NotNull
    private final IntervalList<IntervalContent> intervals;

    @NotNull
    private final Function4<IntervalList.Interval<? extends IntervalContent>, Integer, Composer, Integer, Unit> itemContentProvider;

    @NotNull
    private final Map<Object, Integer> keyToIndexMap;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultLazyLayoutItemsProvider(@NotNull Function4<? super IntervalList.Interval<? extends IntervalContent>, ? super Integer, ? super Composer, ? super Integer, Unit> itemContentProvider, @NotNull IntervalList<? extends IntervalContent> intervals, @NotNull IntRange nearestItemsRange) {
        Intrinsics.checkNotNullParameter(itemContentProvider, "itemContentProvider");
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        Intrinsics.checkNotNullParameter(nearestItemsRange, "nearestItemsRange");
        this.itemContentProvider = itemContentProvider;
        this.intervals = intervals;
        this.keyToIndexMap = generateKeyToIndexMap(nearestItemsRange, intervals);
    }

    @ExperimentalFoundationApi
    private final Map<Object, Integer> generateKeyToIndexMap(IntRange range, IntervalList<? extends LazyLayoutIntervalContent> list) {
        final int iE = range.e();
        if (iE < 0) {
            throw new IllegalStateException("Check failed.");
        }
        final int iMin = Math.min(range.f(), list.getSize() - 1);
        if (iMin < iE) {
            return MapsKt.emptyMap();
        }
        final HashMap map = new HashMap();
        list.forEach(iE, iMin, new Function1<IntervalList.Interval<? extends LazyLayoutIntervalContent>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider$generateKeyToIndexMap$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IntervalList.Interval<? extends LazyLayoutIntervalContent> interval) {
                invoke2(interval);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IntervalList.Interval<? extends LazyLayoutIntervalContent> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getValue().getKey() == null) {
                    return;
                }
                Function1<Integer, Object> key = it.getValue().getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int iMax = Math.max(iE, it.getStartIndex());
                int iMin2 = Math.min(iMin, (it.getStartIndex() + it.getSize()) - 1);
                if (iMax > iMin2) {
                    return;
                }
                while (true) {
                    map.put(key.invoke(Integer.valueOf(iMax - it.getStartIndex())), Integer.valueOf(iMax));
                    if (iMax == iMin2) {
                        return;
                    } else {
                        iMax++;
                    }
                }
            }
        });
        return map;
    }

    private final <T> T withLocalIntervalIndex(int index, Function2<? super Integer, ? super IntervalContent, ? extends T> block) {
        IntervalList.Interval<IntervalContent> interval = this.intervals.get(index);
        return block.invoke(Integer.valueOf(index - interval.getStartIndex()), interval.getValue());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(final int i10, @Nullable Composer composer, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1877726744);
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
                ComposerKt.traceEventStart(-1877726744, i12, -1, "androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider.Item (LazyLayoutItemProvider.kt:116)");
            }
            this.itemContentProvider.invoke(this.intervals.get(i10), Integer.valueOf(i10), composerStartRestartGroup, Integer.valueOf((i12 << 3) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>(this) { // from class: androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider.Item.1
            final /* synthetic */ DefaultLazyLayoutItemsProvider<IntervalContent> $tmp0_rcvr;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.$tmp0_rcvr = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i13) {
                this.$tmp0_rcvr.Item(i10, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
            }
        });
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Nullable
    public Object getContentType(int index) {
        IntervalList.Interval<IntervalContent> interval = this.intervals.get(index);
        return interval.getValue().getType().invoke(Integer.valueOf(index - interval.getStartIndex()));
    }

    @NotNull
    public final IntervalList<IntervalContent> getIntervals() {
        return this.intervals;
    }

    @NotNull
    public final Function4<IntervalList.Interval<? extends IntervalContent>, Integer, Composer, Integer, Unit> getItemContentProvider() {
        return this.itemContentProvider;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervals.getSize();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @NotNull
    public Object getKey(int index) {
        Object objInvoke;
        IntervalList.Interval<IntervalContent> interval = this.intervals.get(index);
        int startIndex = index - interval.getStartIndex();
        Function1<Integer, Object> key = interval.getValue().getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(startIndex))) == null) ? Lazy_androidKt.getDefaultLazyLayoutKey(index) : objInvoke;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @NotNull
    public Map<Object, Integer> getKeyToIndexMap() {
        return this.keyToIndexMap;
    }
}
