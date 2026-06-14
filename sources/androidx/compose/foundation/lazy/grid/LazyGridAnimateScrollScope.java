package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001e\u001a\u00020\u00132\"\u0010\u001d\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010+\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0014\u0010-\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010&R\u0014\u0010/\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)V", "", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "visibleItems", "", "isVertical", "", "calculateLineAverageMainAxisSize", "(Ljava/util/List;Z)I", FirebaseAnalytics.Param.INDEX, "getTargetItemOffset", "(I)Ljava/lang/Integer;", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollOffset", "", "snapToItem", "(Landroidx/compose/foundation/gestures/ScrollScope;II)V", "targetScrollOffset", "", "expectedDistanceTo", "(II)F", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "scroll", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount", "getNumOfItemsForTeleport", "numOfItemsForTeleport", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyGridAnimateScrollScope implements LazyAnimateScrollScope {

    @NotNull
    private final LazyGridState state;

    public LazyGridAnimateScrollScope(@NotNull LazyGridState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
    }

    private final int calculateLineAverageMainAxisSize(final List<? extends LazyGridItemInfo> visibleItems, final boolean isVertical) {
        Function1<Integer, Integer> function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            @NotNull
            public final Integer invoke(int i10) {
                return Integer.valueOf(isVertical ? visibleItems.get(i10).getRow() : visibleItems.get(i10).getColumn());
            }
        };
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < visibleItems.size()) {
            int iIntValue = function1.invoke(Integer.valueOf(i10)).intValue();
            if (iIntValue == -1) {
                i10++;
            } else {
                int iMax = 0;
                while (i10 < visibleItems.size() && function1.invoke(Integer.valueOf(i10)).intValue() == iIntValue) {
                    iMax = Math.max(iMax, isVertical ? IntSize.m4110getHeightimpl(visibleItems.get(i10).getSize()) : IntSize.m4111getWidthimpl(visibleItems.get(i10).getSize()));
                    i10++;
                }
                i11 += iMax;
                i12++;
            }
        }
        return i11 / i12;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public float expectedDistanceTo(int index, int targetScrollOffset) {
        List<LazyGridItemInfo> visibleItemsInfo = this.state.getLayoutInfo().getVisibleItemsInfo();
        int slotsPerLine$foundation_release = this.state.getSlotsPerLine$foundation_release();
        int iCalculateLineAverageMainAxisSize = calculateLineAverageMainAxisSize(visibleItemsInfo, this.state.isVertical$foundation_release());
        int firstVisibleItemIndex = ((index - getFirstVisibleItemIndex()) + ((slotsPerLine$foundation_release - 1) * (index < getFirstVisibleItemIndex() ? -1 : 1))) / slotsPerLine$foundation_release;
        int iMin = Math.min(Math.abs(targetScrollOffset), iCalculateLineAverageMainAxisSize);
        if (targetScrollOffset < 0) {
            iMin *= -1;
        }
        return ((iCalculateLineAverageMainAxisSize * firstVisibleItemIndex) + iMin) - getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @NotNull
    public Density getDensity() {
        return this.state.getDensity$foundation_release();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getFirstVisibleItemIndex() {
        return this.state.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getFirstVisibleItemScrollOffset() {
        return this.state.getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getItemCount() {
        return this.state.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getLastVisibleItemIndex() {
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.lastOrNull((List) this.state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyGridItemInfo != null) {
            return lazyGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getNumOfItemsForTeleport() {
        return this.state.getSlotsPerLine$foundation_release() * 100;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @Nullable
    public Integer getTargetItemOffset(int index) {
        LazyGridItemInfo lazyGridItemInfo;
        List<LazyGridItemInfo> visibleItemsInfo = this.state.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                lazyGridItemInfo = null;
                break;
            }
            lazyGridItemInfo = visibleItemsInfo.get(i10);
            if (lazyGridItemInfo.getIndex() == index) {
                break;
            }
            i10++;
        }
        LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
        if (lazyGridItemInfo2 != null) {
            return Integer.valueOf(this.state.isVertical$foundation_release() ? IntOffset.m4070getYimpl(lazyGridItemInfo2.getOffset()) : IntOffset.m4069getXimpl(lazyGridItemInfo2.getOffset()));
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @Nullable
    public Object scroll(@NotNull Function2<? super ScrollScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        Object objE = c.e(this.state, null, function2, continuation, 1, null);
        return objE == b.g() ? objE : Unit.f93236a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public void snapToItem(@NotNull ScrollScope scrollScope, int i10, int i11) {
        Intrinsics.checkNotNullParameter(scrollScope, "<this>");
        this.state.snapToItemIndexInternal$foundation_release(i10, i11);
    }
}
