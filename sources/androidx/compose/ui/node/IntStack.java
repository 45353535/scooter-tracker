package androidx.compose.ui.node;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0006\u0010\f\u001a\u00020\tJ \u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0006\u0010\u0011\u001a\u00020\u0003J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003J&\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003J \u0010\u001c\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0006\u0010\u001d\u001a\u00020\u0013J\u0018\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/compose/ui/node/IntStack;", "", "initialCapacity", "", "(I)V", "lastIndex", "stack", "", "compareDiagonal", "", "a", "b", "isNotEmpty", "partition", "start", "end", "elSize", "pop", "pushDiagonal", "", "x", "y", "size", "pushRange", "oldStart", "oldEnd", "newStart", "newEnd", "quickSort", "sortDiagonals", "swapDiagonal", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "j", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class IntStack {
    private int lastIndex;

    @NotNull
    private int[] stack;

    public IntStack(int i10) {
        this.stack = new int[i10];
    }

    private final boolean compareDiagonal(int a10, int b10) {
        int[] iArr = this.stack;
        int i10 = iArr[a10];
        int i11 = iArr[b10];
        return i10 < i11 || (i10 == i11 && iArr[a10 + 1] <= iArr[b10 + 1]);
    }

    private final int partition(int start, int end, int elSize) {
        int i10 = start - elSize;
        while (start < end) {
            if (compareDiagonal(start, end)) {
                i10 += elSize;
                swapDiagonal(i10, start);
            }
            start += elSize;
        }
        int i11 = i10 + elSize;
        swapDiagonal(i11, end);
        return i11;
    }

    private final void quickSort(int start, int end, int elSize) {
        if (start < end) {
            int iPartition = partition(start, end, elSize);
            quickSort(start, iPartition - elSize, elSize);
            quickSort(iPartition + elSize, end, elSize);
        }
    }

    private final void swapDiagonal(int i10, int j10) {
        int[] iArr = this.stack;
        MyersDiffKt.swap(iArr, i10, j10);
        MyersDiffKt.swap(iArr, i10 + 1, j10 + 1);
        MyersDiffKt.swap(iArr, i10 + 2, j10 + 2);
    }

    public final boolean isNotEmpty() {
        return this.lastIndex != 0;
    }

    public final int pop() {
        int[] iArr = this.stack;
        int i10 = this.lastIndex - 1;
        this.lastIndex = i10;
        return iArr[i10];
    }

    public final void pushDiagonal(int x10, int y10, int size) {
        int i10 = this.lastIndex;
        int i11 = i10 + 3;
        int[] iArr = this.stack;
        if (i11 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i10] = x10 + size;
        iArr2[i10 + 1] = y10 + size;
        iArr2[i10 + 2] = size;
        this.lastIndex = i11;
    }

    public final void pushRange(int oldStart, int oldEnd, int newStart, int newEnd) {
        int i10 = this.lastIndex;
        int i11 = i10 + 4;
        int[] iArr = this.stack;
        if (i11 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i10] = oldStart;
        iArr2[i10 + 1] = oldEnd;
        iArr2[i10 + 2] = newStart;
        iArr2[i10 + 3] = newEnd;
        this.lastIndex = i11;
    }

    public final void sortDiagonals() {
        int i10 = this.lastIndex;
        if (i10 % 3 != 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i10 > 3) {
            quickSort(0, i10 - 3, 3);
        }
    }
}
