package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0017\u001a\u00020\f2\"\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0014\u0010&\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0014\u0010(\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)V", "", FirebaseAnalytics.Param.INDEX, "getTargetItemOffset", "(I)Ljava/lang/Integer;", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollOffset", "", "snapToItem", "(Landroidx/compose/foundation/gestures/ScrollScope;II)V", "targetScrollOffset", "", "expectedDistanceTo", "(II)F", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "scroll", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount", "getNumOfItemsForTeleport", "numOfItemsForTeleport", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyStaggeredGridAnimateScrollScope implements LazyAnimateScrollScope {

    @NotNull
    private final LazyStaggeredGridState state;

    public LazyStaggeredGridAnimateScrollScope(@NotNull LazyStaggeredGridState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public float expectedDistanceTo(int index, int targetScrollOffset) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = this.state.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int iM4110getHeightimpl = 0;
        for (int i10 = 0; i10 < size; i10++) {
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = visibleItemsInfo.get(i10);
            iM4110getHeightimpl += this.state.getIsVertical() ? IntSize.m4110getHeightimpl(lazyStaggeredGridItemInfo.getSize()) : IntSize.m4111getWidthimpl(lazyStaggeredGridItemInfo.getSize());
        }
        int size2 = iM4110getHeightimpl / (visibleItemsInfo.size() * this.state.getLaneCount$foundation_release());
        int firstVisibleItemIndex = index - getFirstVisibleItemIndex();
        int iMin = Math.min(Math.abs(targetScrollOffset), size2);
        if (targetScrollOffset < 0) {
            iMin *= -1;
        }
        return ((size2 * firstVisibleItemIndex) + iMin) - getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @NotNull
    public Density getDensity() {
        return this.state.getDensity();
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
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) CollectionsKt.lastOrNull((List) this.state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyStaggeredGridItemInfo != null) {
            return lazyStaggeredGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getNumOfItemsForTeleport() {
        return this.state.getLaneCount$foundation_release() * 100;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @Nullable
    public Integer getTargetItemOffset(int index) {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfoFindVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(this.state.getLayoutInfo(), index);
        if (lazyStaggeredGridItemInfoFindVisibleItem == null) {
            return null;
        }
        long offset = lazyStaggeredGridItemInfoFindVisibleItem.getOffset();
        return Integer.valueOf(this.state.getIsVertical() ? IntOffset.m4070getYimpl(offset) : IntOffset.m4069getXimpl(offset));
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
        this.state.snapToItemInternal$foundation_release(scrollScope, i10, i11);
    }
}
