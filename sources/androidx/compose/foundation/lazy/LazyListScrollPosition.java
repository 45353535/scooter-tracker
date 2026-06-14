package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J#\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0005J%\u0010\u0019\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0003H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "", "initialIndex", "", "initialScrollOffset", "(II)V", "hadFirstNotEmptyLayout", "", "<set-?>", "Landroidx/compose/foundation/lazy/DataIndex;", FirebaseAnalytics.Param.INDEX, "getIndex-jQJCoq8", "()I", "setIndex-ZjPyQlc", "(I)V", "index$delegate", "Landroidx/compose/runtime/MutableState;", "lastKnownFirstItemKey", "scrollOffset", "getScrollOffset", "setScrollOffset", "scrollOffset$delegate", "requestPosition", "", "requestPosition-AhXoVpI", "update", "update-AhXoVpI", "updateFromMeasureResult", "measureResult", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "updateScrollPositionIfTheFirstItemWasMoved", "itemProvider", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyListScrollPosition {
    private boolean hadFirstNotEmptyLayout;

    /* JADX INFO: renamed from: index$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState index;

    @Nullable
    private Object lastKnownFirstItemKey;

    /* JADX INFO: renamed from: scrollOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState scrollOffset;

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyListScrollPosition() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    private final void setScrollOffset(int i10) {
        this.scrollOffset.setValue(Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: update-AhXoVpI, reason: not valid java name */
    private final void m531updateAhXoVpI(int index, int scrollOffset) {
        if (index < 0.0f) {
            throw new IllegalArgumentException(("Index should be non-negative (" + index + ')').toString());
        }
        if (!DataIndex.m509equalsimpl0(index, m532getIndexjQJCoq8())) {
            m534setIndexZjPyQlc(index);
        }
        if (scrollOffset != getScrollOffset()) {
            setScrollOffset(scrollOffset);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getIndex-jQJCoq8, reason: not valid java name */
    public final int m532getIndexjQJCoq8() {
        return ((DataIndex) this.index.getValue()).m516unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getScrollOffset() {
        return ((Number) this.scrollOffset.getValue()).intValue();
    }

    /* JADX INFO: renamed from: requestPosition-AhXoVpI, reason: not valid java name */
    public final void m533requestPositionAhXoVpI(int index, int scrollOffset) {
        m531updateAhXoVpI(index, scrollOffset);
        this.lastKnownFirstItemKey = null;
    }

    /* JADX INFO: renamed from: setIndex-ZjPyQlc, reason: not valid java name */
    public final void m534setIndexZjPyQlc(int i10) {
        this.index.setValue(DataIndex.m504boximpl(i10));
    }

    public final void updateFromMeasureResult(@NotNull LazyListMeasureResult measureResult) {
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        LazyMeasuredItem firstVisibleItem = measureResult.getFirstVisibleItem();
        this.lastKnownFirstItemKey = firstVisibleItem != null ? firstVisibleItem.getKey() : null;
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleItemScrollOffset = measureResult.getFirstVisibleItemScrollOffset();
            if (firstVisibleItemScrollOffset < 0.0f) {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisibleItemScrollOffset + ')').toString());
            }
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    LazyMeasuredItem firstVisibleItem2 = measureResult.getFirstVisibleItem();
                    m531updateAhXoVpI(DataIndex.m506constructorimpl(firstVisibleItem2 != null ? firstVisibleItem2.getIndex() : 0), firstVisibleItemScrollOffset);
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

    @ExperimentalFoundationApi
    public final void updateScrollPositionIfTheFirstItemWasMoved(@NotNull LazyListItemProvider itemProvider) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                m531updateAhXoVpI(DataIndex.m506constructorimpl(LazyLayoutItemProviderKt.findIndexByKey(itemProvider, this.lastKnownFirstItemKey, m532getIndexjQJCoq8())), getScrollOffset());
                Unit unit = Unit.f93236a;
            } finally {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
            }
        } finally {
            snapshotCreateNonObservableSnapshot.dispose();
        }
    }

    public LazyListScrollPosition(int i10, int i11) {
        this.index = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DataIndex.m504boximpl(DataIndex.m506constructorimpl(i10)), null, 2, null);
        this.scrollOffset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i11), null, 2, null);
    }

    public /* synthetic */ LazyListScrollPosition(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
