package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003J\u0018\u0010\b\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003J\u0011\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\bJ\u0018\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0001J\u0018\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fJ\u0011\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\bJ\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0003J\u0011\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0086\nJ\u0011\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\u0002J\u0011\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\nJ\u0011\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0086\nJ\u0011\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\nJ\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0001J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0016\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u0003J\u001a\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\u0018\u001a\u00020\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u0003J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0001J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001b\u0010\u001b\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0086\u0002J\u0006\u0010\u001c\u001a\u00020\u000bJ\u0006\u0010\u001d\u001a\u00020\u000bJ\u0010\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u0003R\u0012\u0010\u0005\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006 "}, d2 = {"Landroidx/collection/MutableIntList;", "Landroidx/collection/IntList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", "add", "", "element", "", FirebaseAnalytics.Param.INDEX, "addAll", "elements", "", "clear", "ensureCapacity", "minusAssign", "plusAssign", "remove", "removeAll", "removeAt", "removeRange", "start", "end", "retainAll", "set", "sort", "sortDescending", "trim", "minCapacity", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableIntList extends IntList {
    public MutableIntList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableIntList mutableIntList, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = mutableIntList._size;
        }
        mutableIntList.trim(i10);
    }

    public final boolean add(int element) {
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i10 = this._size;
        iArr[i10] = element;
        this._size = i10 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int index, @NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        int[] iArr = this.content;
        int i10 = this._size;
        if (index != i10) {
            ArraysKt.copyInto(iArr, iArr, elements.length + index, index, i10);
        }
        ArraysKt.copyInto$default(elements, iArr, index, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int capacity) {
        int[] iArr = this.content;
        if (iArr.length < capacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(capacity, (iArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.content = iArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(int element) {
        remove(element);
    }

    public final void plusAssign(@NotNull IntList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(int element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        for (int i11 : elements) {
            remove(i11);
        }
        return i10 != this._size;
    }

    public final int removeAt(@IntRange(from = 0) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i10 = iArr[index];
        int i11 = this._size;
        if (index != i11 - 1) {
            ArraysKt.copyInto(iArr, iArr, index, index + 1, i11);
        }
        this._size--;
        return i10;
    }

    public final void removeRange(@IntRange(from = 0) int start, @IntRange(from = 0) int end) {
        int i10;
        if (start < 0 || start > (i10 = this._size) || end < 0 || end > i10) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        if (end < start) {
            RuntimeHelpersKt.throwIllegalArgumentException("The end index must be < start index");
        }
        if (end != start) {
            int i11 = this._size;
            if (end < i11) {
                int[] iArr = this.content;
                ArraysKt.copyInto(iArr, iArr, start, end, i11);
            }
            this._size -= end - start;
        }
    }

    public final boolean retainAll(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        int[] iArr = this.content;
        int i11 = i10 - 1;
        while (true) {
            int i12 = 0;
            int i13 = -1;
            if (-1 >= i11) {
                break;
            }
            int i14 = iArr[i11];
            int length = elements.length;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (elements[i12] == i14) {
                    i13 = i12;
                    break;
                }
                i12++;
            }
            if (i13 < 0) {
                removeAt(i11);
            }
            i11--;
        }
        return i10 != this._size;
    }

    public final int set(@IntRange(from = 0) int index, int element) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i10 = iArr[index];
        iArr[index] = element;
        return i10;
    }

    public final void sort() {
        int i10 = this._size;
        if (i10 == 0) {
            return;
        }
        ArraysKt.sort(this.content, 0, i10);
    }

    public final void sortDescending() {
        int i10 = this._size;
        if (i10 == 0) {
            return;
        }
        ArraysKt.sortDescending(this.content, 0, i10);
    }

    public final void trim(int minCapacity) {
        int iMax = Math.max(minCapacity, this._size);
        int[] iArr = this.content;
        if (iArr.length > iMax) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.content = iArrCopyOf;
        }
    }

    public MutableIntList(int i10) {
        super(i10, null);
    }

    public final void minusAssign(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (int i10 : elements) {
            remove(i10);
        }
    }

    public final void plusAssign(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public /* synthetic */ MutableIntList(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final void plusAssign(int element) {
        add(element);
    }

    public final void add(@IntRange(from = 0) int index, int element) {
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i10 = this._size;
        if (index != i10) {
            ArraysKt.copyInto(iArr, iArr, index + 1, index, i10);
        }
        iArr[index] = element;
        this._size++;
    }

    public final void minusAssign(@NotNull IntList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int[] iArr = elements.content;
        int i10 = elements._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(iArr[i11]);
        }
    }

    public final boolean removeAll(@NotNull IntList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        int i11 = elements._size - 1;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                remove(elements.get(i12));
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        return i10 != this._size;
    }

    public final boolean retainAll(@NotNull IntList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        int[] iArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.contains(iArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int index, @NotNull IntList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i10 = elements._size;
        if (i10 == 0) {
            return false;
        }
        ensureCapacity(this._size + i10);
        int[] iArr = this.content;
        int i11 = this._size;
        if (index != i11) {
            ArraysKt.copyInto(iArr, iArr, elements._size + index, index, i11);
        }
        ArraysKt.copyInto(elements.content, iArr, index, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(@NotNull IntList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }
}
