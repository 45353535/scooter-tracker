package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aR&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR+\u0010\n\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "", "", "initialIndices", "initialOffsets", "Lkotlin/Function2;", "", "fillIndices", "<init>", "([I[ILkotlin/jvm/functions/Function2;)V", "indices", "offsets", "", "update", "([I[I)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureResult", "updateFromMeasureResult", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;)V", FirebaseAnalytics.Param.INDEX, "scrollOffset", "requestPosition", "(II)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;)V", "Lkotlin/jvm/functions/Function2;", "<set-?>", "indices$delegate", "Landroidx/compose/runtime/MutableState;", "getIndices", "()[I", "setIndices", "([I)V", "offsets$delegate", "getOffsets", "setOffsets", "", "hadFirstNotEmptyLayout", "Z", "lastKnownFirstItemKey", "Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyStaggeredGridScrollPosition {

    @NotNull
    private final Function2<Integer, Integer, int[]> fillIndices;
    private boolean hadFirstNotEmptyLayout;

    /* JADX INFO: renamed from: indices$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState indices;

    @Nullable
    private Object lastKnownFirstItemKey;

    /* JADX INFO: renamed from: offsets$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState offsets;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridScrollPosition(@NotNull int[] initialIndices, @NotNull int[] initialOffsets, @NotNull Function2<? super Integer, ? super Integer, int[]> fillIndices) {
        Intrinsics.checkNotNullParameter(initialIndices, "initialIndices");
        Intrinsics.checkNotNullParameter(initialOffsets, "initialOffsets");
        Intrinsics.checkNotNullParameter(fillIndices, "fillIndices");
        this.fillIndices = fillIndices;
        this.indices = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initialIndices, null, 2, null);
        this.offsets = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initialOffsets, null, 2, null);
    }

    private final void update(int[] indices, int[] offsets) {
        if (!Arrays.equals(indices, getIndices())) {
            setIndices(indices);
        }
        if (Arrays.equals(offsets, getOffsets())) {
            return;
        }
        setOffsets(offsets);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final int[] getIndices() {
        return (int[]) this.indices.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final int[] getOffsets() {
        return (int[]) this.offsets.getValue();
    }

    public final void requestPosition(int index, int scrollOffset) {
        int[] iArrInvoke = this.fillIndices.invoke(Integer.valueOf(index), Integer.valueOf(getIndices().length));
        int length = iArrInvoke.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = scrollOffset;
        }
        update(iArrInvoke, iArr);
        this.lastKnownFirstItemKey = null;
    }

    public final void setIndices(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.indices.setValue(iArr);
    }

    public final void setOffsets(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.offsets.setValue(iArr);
    }

    public final void updateFromMeasureResult(@NotNull LazyStaggeredGridMeasureResult measureResult) {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo;
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        int[] firstVisibleItemIndices = measureResult.getFirstVisibleItemIndices();
        if (firstVisibleItemIndices.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = 0;
        int i11 = firstVisibleItemIndices[0];
        int lastIndex = ArraysKt.getLastIndex(firstVisibleItemIndices);
        if (lastIndex != 0) {
            int i12 = i11 == -1 ? Integer.MAX_VALUE : i11;
            IntIterator it = new IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                int i13 = firstVisibleItemIndices[it.nextInt()];
                int i14 = i13 == -1 ? Integer.MAX_VALUE : i13;
                if (i12 > i14) {
                    i11 = i13;
                    i12 = i14;
                }
            }
        }
        if (i11 == Integer.MAX_VALUE) {
            i11 = 0;
        }
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = measureResult.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        while (true) {
            if (i10 >= size) {
                lazyStaggeredGridItemInfo = null;
                break;
            }
            lazyStaggeredGridItemInfo = visibleItemsInfo.get(i10);
            if (lazyStaggeredGridItemInfo.getIndex() == i11) {
                break;
            } else {
                i10++;
            }
        }
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo2 = lazyStaggeredGridItemInfo;
        this.lastKnownFirstItemKey = lazyStaggeredGridItemInfo2 != null ? lazyStaggeredGridItemInfo2.getKey() : null;
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    update(measureResult.getFirstVisibleItemIndices(), measureResult.getFirstVisibleItemScrollOffsets());
                    Unit unit = Unit.f93236a;
                } finally {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            } finally {
                snapshotCreateNonObservableSnapshot.dispose();
            }
        }
    }

    @ExperimentalFoundationApi
    public final void updateScrollPositionIfTheFirstItemWasMoved(@NotNull LazyLayoutItemProvider itemProvider) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                Object obj = this.lastKnownFirstItemKey;
                Integer orNull = ArraysKt.getOrNull(getIndices(), 0);
                int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(itemProvider, obj, orNull != null ? orNull.intValue() : 0);
                if (!ArraysKt.contains(getIndices(), iFindIndexByKey)) {
                    update(this.fillIndices.invoke(Integer.valueOf(iFindIndexByKey), Integer.valueOf(getIndices().length)), getOffsets());
                }
                Unit unit = Unit.f93236a;
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
            } catch (Throwable th2) {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                throw th2;
            }
        } finally {
            snapshotCreateNonObservableSnapshot.dispose();
        }
    }
}
