package androidx.compose.foundation;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0004\u001aH\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aV\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00028\u00012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aV\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\tH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aT\u0010\u0013\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"T", "", "Lkotlin/Function1;", "", "predicate", "fastFilter", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "R", "initial", "Lkotlin/Function2;", "operation", "fastFold", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "", "transform", "fastMapIndexedNotNull", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "", "selector", "fastMaxOfOrNull", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TempListUtilsKt {
    @NotNull
    public static final <T> List<T> fastFilter(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(@NotNull List<? extends T> list, R r10, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            r10 = operation.invoke(r10, list.get(i10));
        }
        return r10;
    }

    @NotNull
    public static final <T, R> List<R> fastMapIndexedNotNull(@NotNull List<? extends T> list, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            R rInvoke = transform.invoke(Integer.valueOf(i10), list.get(i10));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @Nullable
    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (list.isEmpty()) {
            return null;
        }
        R rInvoke = selector.invoke(list.get(0));
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(list.get(i10));
                if (rInvoke2.compareTo(rInvoke) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }
}
