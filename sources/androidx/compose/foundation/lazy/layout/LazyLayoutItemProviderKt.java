package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\u001aT\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u000b\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0016\u001a\u00020\b*\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "T", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "intervals", "Lkotlin/ranges/IntRange;", "nearestItemsRange", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "", "", "Landroidx/compose/runtime/Composable;", "itemContent", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "LazyLayoutItemProvider", "(Landroidx/compose/foundation/lazy/layout/IntervalList;Lkotlin/ranges/IntRange;Lkotlin/jvm/functions/Function4;)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "Landroidx/compose/runtime/State;", "delegate", "DelegatingLazyLayoutItemProvider", "(Landroidx/compose/runtime/State;)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "", C4240b4.i.W, "lastKnownIndex", "findIndexByKey", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Ljava/lang/Object;I)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyLayoutItemProviderKt {
    @ExperimentalFoundationApi
    @NotNull
    public static final LazyLayoutItemProvider DelegatingLazyLayoutItemProvider(@NotNull State<? extends LazyLayoutItemProvider> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new DefaultDelegatingLazyLayoutItemProvider(delegate);
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final <T extends LazyLayoutIntervalContent> LazyLayoutItemProvider LazyLayoutItemProvider(@NotNull IntervalList<? extends T> intervals, @NotNull IntRange nearestItemsRange, @NotNull Function4<? super IntervalList.Interval<? extends T>, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        Intrinsics.checkNotNullParameter(nearestItemsRange, "nearestItemsRange");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        return new DefaultLazyLayoutItemsProvider(itemContent, intervals, nearestItemsRange);
    }

    @ExperimentalFoundationApi
    public static final int findIndexByKey(@NotNull LazyLayoutItemProvider lazyLayoutItemProvider, @Nullable Object obj, int i10) {
        Integer num;
        Intrinsics.checkNotNullParameter(lazyLayoutItemProvider, "<this>");
        return (obj != null && (i10 >= lazyLayoutItemProvider.getItemCount() || !Intrinsics.areEqual(obj, lazyLayoutItemProvider.getKey(i10))) && (num = lazyLayoutItemProvider.getKeyToIndexMap().get(obj)) != null) ? num.intValue() : i10;
    }
}
