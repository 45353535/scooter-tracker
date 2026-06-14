package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0007R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "list", "", "", "(Ljava/util/List;)V", "add", "", "value", "isEmpty", "", "isNotEmpty", "peek", "takeMax", "validateHeap", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PrioritySet {

    @NotNull
    private final List<Integer> list;

    public PrioritySet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void add(int value) {
        if (!this.list.isEmpty()) {
            if (this.list.get(0).intValue() == value) {
                return;
            }
            if (this.list.get(r0.size() - 1).intValue() == value) {
                return;
            }
        }
        int size = this.list.size();
        this.list.add(Integer.valueOf(value));
        while (size > 0) {
            int i10 = ((size + 1) >>> 1) - 1;
            int iIntValue = this.list.get(i10).intValue();
            if (value <= iIntValue) {
                break;
            }
            this.list.set(size, Integer.valueOf(iIntValue));
            size = i10;
        }
        this.list.set(size, Integer.valueOf(value));
    }

    public final boolean isEmpty() {
        return this.list.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.list.isEmpty();
    }

    public final int peek() {
        return ((Number) CollectionsKt.first((List) this.list)).intValue();
    }

    public final int takeMax() {
        int iIntValue;
        if (!(this.list.size() > 0)) {
            ComposerKt.composeRuntimeError("Set is empty");
            throw new g();
        }
        int iIntValue2 = this.list.get(0).intValue();
        while (!this.list.isEmpty() && this.list.get(0).intValue() == iIntValue2) {
            List<Integer> list = this.list;
            list.set(0, (Integer) CollectionsKt.last((List) list));
            List<Integer> list2 = this.list;
            list2.remove(list2.size() - 1);
            int size = this.list.size();
            int size2 = this.list.size() >>> 1;
            int i10 = 0;
            while (i10 < size2) {
                int iIntValue3 = this.list.get(i10).intValue();
                int i11 = (i10 + 1) * 2;
                int i12 = i11 - 1;
                int iIntValue4 = this.list.get(i12).intValue();
                if (i11 >= size || (iIntValue = this.list.get(i11).intValue()) <= iIntValue4) {
                    if (iIntValue4 > iIntValue3) {
                        this.list.set(i10, Integer.valueOf(iIntValue4));
                        this.list.set(i12, Integer.valueOf(iIntValue3));
                        i10 = i12;
                    }
                } else if (iIntValue > iIntValue3) {
                    this.list.set(i10, Integer.valueOf(iIntValue));
                    this.list.set(i11, Integer.valueOf(iIntValue3));
                    i10 = i11;
                }
            }
        }
        return iIntValue2;
    }

    public final void validateHeap() {
        int size = this.list.size();
        int i10 = size / 2;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 + 1;
            int i13 = i12 * 2;
            if (this.list.get(i11).intValue() < this.list.get(i13 - 1).intValue()) {
                throw new IllegalStateException("Check failed.");
            }
            if (i13 < size && this.list.get(i11).intValue() < this.list.get(i13).intValue()) {
                throw new IllegalStateException("Check failed.");
            }
            i11 = i12;
        }
    }

    public PrioritySet(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
    }

    public /* synthetic */ PrioritySet(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }
}
