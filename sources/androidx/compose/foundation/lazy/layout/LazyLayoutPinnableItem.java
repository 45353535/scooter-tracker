package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.PinnableContainer;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020)H\u0016R/\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00118V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R/\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010!\u001a\u0004\u0018\u00010\u00012\b\u0010 \u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010$\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0010\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016¨\u0006,"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem;", "Landroidx/compose/ui/layout/PinnableContainer;", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;", C4240b4.i.W, "", "pinnedItemList", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "(Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;)V", "<set-?>", "_parentPinnableContainer", "get_parentPinnableContainer", "()Landroidx/compose/ui/layout/PinnableContainer;", "set_parentPinnableContainer", "(Landroidx/compose/ui/layout/PinnableContainer;)V", "_parentPinnableContainer$delegate", "Landroidx/compose/runtime/MutableState;", "", FirebaseAnalytics.Param.INDEX, "getIndex", "()I", "setIndex", "(I)V", "index$delegate", "getKey", "()Ljava/lang/Object;", "parentHandle", "getParentHandle", "()Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "setParentHandle", "(Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;)V", "parentHandle$delegate", "value", "parentPinnableContainer", "getParentPinnableContainer", "setParentPinnableContainer", "pinsCount", "getPinsCount", "setPinsCount", "pinsCount$delegate", "onDisposed", "", "pin", "release", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LazyLayoutPinnableItem implements PinnableContainer, PinnableContainer.PinnedHandle, LazyLayoutPinnedItemList.PinnedItem {

    /* JADX INFO: renamed from: _parentPinnableContainer$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState _parentPinnableContainer;

    /* JADX INFO: renamed from: index$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState index;

    @Nullable
    private final Object key;

    /* JADX INFO: renamed from: parentHandle$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState parentHandle;

    @NotNull
    private final LazyLayoutPinnedItemList pinnedItemList;

    /* JADX INFO: renamed from: pinsCount$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState pinsCount;

    public LazyLayoutPinnableItem(@Nullable Object obj, @NotNull LazyLayoutPinnedItemList pinnedItemList) {
        Intrinsics.checkNotNullParameter(pinnedItemList, "pinnedItemList");
        this.key = obj;
        this.pinnedItemList = pinnedItemList;
        this.index = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);
        this.pinsCount = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.parentHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._parentPinnableContainer = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    private final PinnableContainer.PinnedHandle getParentHandle() {
        return (PinnableContainer.PinnedHandle) this.parentHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int getPinsCount() {
        return ((Number) this.pinsCount.getValue()).intValue();
    }

    private final PinnableContainer get_parentPinnableContainer() {
        return (PinnableContainer) this._parentPinnableContainer.getValue();
    }

    private final void setParentHandle(PinnableContainer.PinnedHandle pinnedHandle) {
        this.parentHandle.setValue(pinnedHandle);
    }

    private final void setPinsCount(int i10) {
        this.pinsCount.setValue(Integer.valueOf(i10));
    }

    private final void set_parentPinnableContainer(PinnableContainer pinnableContainer) {
        this._parentPinnableContainer.setValue(pinnableContainer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public int getIndex() {
        return ((Number) this.index.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    @Nullable
    public Object getKey() {
        return this.key;
    }

    @Nullable
    public final PinnableContainer getParentPinnableContainer() {
        return get_parentPinnableContainer();
    }

    public final void onDisposed() {
        int pinsCount = getPinsCount();
        for (int i10 = 0; i10 < pinsCount; i10++) {
            release();
        }
    }

    @Override // androidx.compose.ui.layout.PinnableContainer
    @NotNull
    public PinnableContainer.PinnedHandle pin() {
        if (getPinsCount() == 0) {
            this.pinnedItemList.pin$foundation_release(this);
            PinnableContainer parentPinnableContainer = getParentPinnableContainer();
            setParentHandle(parentPinnableContainer != null ? parentPinnableContainer.pin() : null);
        }
        setPinsCount(getPinsCount() + 1);
        return this;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer.PinnedHandle
    public void release() {
        if (getPinsCount() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        setPinsCount(getPinsCount() - 1);
        if (getPinsCount() == 0) {
            this.pinnedItemList.release$foundation_release(this);
            PinnableContainer.PinnedHandle parentHandle = getParentHandle();
            if (parentHandle != null) {
                parentHandle.release();
            }
            setParentHandle(null);
        }
    }

    public void setIndex(int i10) {
        this.index.setValue(Integer.valueOf(i10));
    }

    public final void setParentPinnableContainer(@Nullable PinnableContainer pinnableContainer) {
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                if (pinnableContainer != get_parentPinnableContainer()) {
                    set_parentPinnableContainer(pinnableContainer);
                    if (getPinsCount() > 0) {
                        PinnableContainer.PinnedHandle parentHandle = getParentHandle();
                        if (parentHandle != null) {
                            parentHandle.release();
                        }
                        setParentHandle(pinnableContainer != null ? pinnableContainer.pin() : null);
                    }
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
