package androidx.compose.ui.input.pointer;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bJ(\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u000e\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0010J \u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0014\u0010(\u001a\u00020\u001f*\u00020\u00152\u0006\u0010!\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "", "()V", "canHover", "Landroid/util/SparseBooleanArray;", "motionEventToComposePointerIdMap", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "getMotionEventToComposePointerIdMap$ui_release", "()Landroid/util/SparseLongArray;", "nextId", "", "pointers", "", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "previousSource", "", "previousToolType", "addFreshIds", "", "motionEvent", "Landroid/view/MotionEvent;", "clearOnDeviceChange", "convertToPointerInputEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "convertToPointerInputEvent$ui_release", "createPointerInputEventData", FirebaseAnalytics.Param.INDEX, "pressed", "", "endStream", "pointerId", "getComposePointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "motionEventPointerId", "getComposePointerId-_I2yYro", "(I)J", "removeStaleIds", "hasPointerId", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MotionEventAdapter {
    private long nextId;

    @NotNull
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();

    @NotNull
    private final SparseBooleanArray canHover = new SparseBooleanArray();

    @NotNull
    private final List<PointerInputEventData> pointers = new ArrayList();
    private int previousToolType = -1;
    private int previousSource = -1;

    private final void addFreshIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                long j10 = this.nextId;
                this.nextId = 1 + j10;
                sparseLongArray.put(pointerId, j10);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j11 = this.nextId;
            this.nextId = 1 + j11;
            sparseLongArray2.put(pointerId2, j11);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.canHover.put(pointerId2, true);
            }
        }
    }

    private final void clearOnDeviceChange(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.previousToolType && source == this.previousSource) {
            return;
        }
        this.previousToolType = toolType;
        this.previousSource = source;
        this.canHover.clear();
        this.motionEventToComposePointerIdMap.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final androidx.compose.ui.input.pointer.PointerInputEventData createPointerInputEventData(androidx.compose.ui.input.pointer.PositionCalculator r25, android.view.MotionEvent r26, int r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.MotionEventAdapter.createPointerInputEventData(androidx.compose.ui.input.pointer.PositionCalculator, android.view.MotionEvent, int, boolean):androidx.compose.ui.input.pointer.PointerInputEventData");
    }

    /* JADX INFO: renamed from: getComposePointerId-_I2yYro, reason: not valid java name */
    private final long m2839getComposePointerId_I2yYro(int motionEventPointerId) {
        long jValueAt;
        int iIndexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(motionEventPointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = this.motionEventToComposePointerIdMap.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.nextId;
            this.nextId = 1 + jValueAt;
            this.motionEventToComposePointerIdMap.put(motionEventPointerId, jValueAt);
        }
        return PointerId.m2889constructorimpl(jValueAt);
    }

    @VisibleForTesting
    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui_release$annotations() {
    }

    private final boolean hasPointerId(MotionEvent motionEvent, int i10) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (motionEvent.getPointerId(i11) == i10) {
                return true;
            }
        }
        return false;
    }

    private final void removeStaleIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.canHover.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.canHover.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int iKeyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!hasPointerId(motionEvent, iKeyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.canHover.delete(iKeyAt);
                }
            }
        }
    }

    @Nullable
    public final PointerInputEvent convertToPointerInputEvent$ui_release(@NotNull MotionEvent motionEvent, @NotNull PositionCalculator positionCalculator) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.motionEventToComposePointerIdMap.clear();
            this.canHover.clear();
            return null;
        }
        clearOnDeviceChange(motionEvent);
        addFreshIds(motionEvent);
        boolean z10 = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z11 = actionMasked == 8;
        if (z10) {
            this.canHover.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.pointers.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        while (i10 < pointerCount) {
            this.pointers.add(createPointerInputEventData(positionCalculator, motionEvent, i10, (z10 || i10 == actionIndex || (z11 && motionEvent.getButtonState() == 0)) ? false : true));
            i10++;
        }
        removeStaleIds(motionEvent);
        return new PointerInputEvent(motionEvent.getEventTime(), this.pointers, motionEvent);
    }

    public final void endStream(int pointerId) {
        this.canHover.delete(pointerId);
        this.motionEventToComposePointerIdMap.delete(pointerId);
    }

    @NotNull
    /* JADX INFO: renamed from: getMotionEventToComposePointerIdMap$ui_release, reason: from getter */
    public final SparseLongArray getMotionEventToComposePointerIdMap() {
        return this.motionEventToComposePointerIdMap;
    }
}
