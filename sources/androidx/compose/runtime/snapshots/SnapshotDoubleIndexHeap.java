package androidx.compose.runtime.snapshots;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0002J\u0006\u0010\u001d\u001a\u00020\u0011J\u0016\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "()V", "firstFreeHandle", "", "handles", "", FirebaseAnalytics.Param.INDEX, "<set-?>", "size", "getSize", "()I", "values", "add", "value", "allocateHandle", "ensure", "", "atLeast", "freeHandle", "handle", "lowestOrDefault", "default", "remove", "shiftDown", "shiftUp", "swap", "a", "b", "validate", "validateHandle", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SnapshotDoubleIndexHeap {
    private int firstFreeHandle;

    @NotNull
    private int[] handles;
    private int size;

    @NotNull
    private int[] values = new int[16];

    @NotNull
    private int[] index = new int[16];

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.handles = iArr;
    }

    private final int allocateHandle() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i10 = length * 2;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                iArr[i11] = i12;
                i11 = i12;
            }
            ArraysKt.copyInto$default(this.handles, iArr, 0, 0, 0, 14, (Object) null);
            this.handles = iArr;
        }
        int i13 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i13];
        return i13;
    }

    private final void ensure(int atLeast) {
        int[] iArr = this.values;
        int length = iArr.length;
        if (atLeast <= length) {
            return;
        }
        int i10 = length * 2;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        ArraysKt.copyInto$default(iArr, iArr2, 0, 0, 0, 14, (Object) null);
        ArraysKt.copyInto$default(this.index, iArr3, 0, 0, 0, 14, (Object) null);
        this.values = iArr2;
        this.index = iArr3;
    }

    private final void freeHandle(int handle) {
        this.handles[handle] = this.firstFreeHandle;
        this.firstFreeHandle = handle;
    }

    public static /* synthetic */ int lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return snapshotDoubleIndexHeap.lowestOrDefault(i10);
    }

    private final void shiftDown(int index) {
        int i10;
        int[] iArr = this.values;
        int i11 = this.size >> 1;
        while (index < i11) {
            int i12 = (index + 1) << 1;
            int i13 = i12 - 1;
            if (i12 >= this.size || (i10 = iArr[i12]) >= iArr[i13]) {
                if (iArr[i13] >= iArr[index]) {
                    return;
                }
                swap(i13, index);
                index = i13;
            } else {
                if (i10 >= iArr[index]) {
                    return;
                }
                swap(i12, index);
                index = i12;
            }
        }
    }

    private final void shiftUp(int index) {
        int[] iArr = this.values;
        int i10 = iArr[index];
        while (index > 0) {
            int i11 = ((index + 1) >> 1) - 1;
            if (iArr[i11] <= i10) {
                return;
            }
            swap(i11, index);
            index = i11;
        }
    }

    private final void swap(int a10, int b10) {
        int[] iArr = this.values;
        int[] iArr2 = this.index;
        int[] iArr3 = this.handles;
        int i10 = iArr[a10];
        iArr[a10] = iArr[b10];
        iArr[b10] = i10;
        int i11 = iArr2[a10];
        iArr2[a10] = iArr2[b10];
        iArr2[b10] = i11;
        iArr3[iArr2[a10]] = a10;
        iArr3[iArr2[b10]] = b10;
    }

    public final int add(int value) {
        ensure(this.size + 1);
        int i10 = this.size;
        this.size = i10 + 1;
        int iAllocateHandle = allocateHandle();
        this.values[i10] = value;
        this.index[i10] = iAllocateHandle;
        this.handles[iAllocateHandle] = i10;
        shiftUp(i10);
        return iAllocateHandle;
    }

    public final int getSize() {
        return this.size;
    }

    public final int lowestOrDefault(int i10) {
        return this.size > 0 ? this.values[0] : i10;
    }

    public final void remove(int handle) {
        int i10 = this.handles[handle];
        swap(i10, this.size - 1);
        this.size--;
        shiftUp(i10);
        shiftDown(i10);
        freeHandle(handle);
    }

    public final void validate() {
        int i10 = this.size;
        int i11 = 1;
        while (i11 < i10) {
            int i12 = i11 + 1;
            int[] iArr = this.values;
            if (iArr[(i12 >> 1) - 1] > iArr[i11]) {
                throw new IllegalStateException(("Index " + i11 + " is out of place").toString());
            }
            i11 = i12;
        }
    }

    public final void validateHandle(int handle, int value) {
        int i10 = this.handles[handle];
        if (this.index[i10] != handle) {
            throw new IllegalStateException(("Index for handle " + handle + " is corrupted").toString());
        }
        if (this.values[i10] == value) {
            return;
        }
        throw new IllegalStateException(("Value for handle " + handle + " was " + this.values[i10] + " but was supposed to be " + value).toString());
    }
}
