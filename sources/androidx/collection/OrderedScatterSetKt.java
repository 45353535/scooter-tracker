package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u0005¢\u0006\u0002\u0010\b\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\n\u001a/\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u0002H\u0005¢\u0006\u0002\u0010\f\u001a+\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u000e\"\u0002H\u0005¢\u0006\u0002\u0010\u000f\u001a\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0011\u001a'\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0012\u001a/\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0013\u001a+\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u000e\"\u0002H\u0005¢\u0006\u0002\u0010\u0014\"\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"EmptyOrderedScatterSet", "Landroidx/collection/MutableOrderedScatterSet;", "", "emptyOrderedScatterSet", "Landroidx/collection/OrderedScatterSet;", ExifInterface.LONGITUDE_EAST, "mutableOrderedScatterSetOf", "element1", "(Ljava/lang/Object;)Landroidx/collection/MutableOrderedScatterSet;", "element2", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableOrderedScatterSet;", "element3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableOrderedScatterSet;", "elements", "", "([Ljava/lang/Object;)Landroidx/collection/MutableOrderedScatterSet;", "orderedScatterSetOf", "(Ljava/lang/Object;)Landroidx/collection/OrderedScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/OrderedScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/OrderedScatterSet;", "([Ljava/lang/Object;)Landroidx/collection/OrderedScatterSet;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class OrderedScatterSetKt {

    @NotNull
    private static final MutableOrderedScatterSet<Object> EmptyOrderedScatterSet = new MutableOrderedScatterSet<>(0);

    @NotNull
    public static final <E> OrderedScatterSet<E> emptyOrderedScatterSet() {
        MutableOrderedScatterSet<Object> mutableOrderedScatterSet = EmptyOrderedScatterSet;
        Intrinsics.checkNotNull(mutableOrderedScatterSet, "null cannot be cast to non-null type androidx.collection.OrderedScatterSet<E of androidx.collection.OrderedScatterSetKt.emptyOrderedScatterSet>");
        return mutableOrderedScatterSet;
    }

    @NotNull
    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf() {
        return new MutableOrderedScatterSet<>(0, 1, null);
    }

    @NotNull
    public static final <E> OrderedScatterSet<E> orderedScatterSetOf() {
        MutableOrderedScatterSet<Object> mutableOrderedScatterSet = EmptyOrderedScatterSet;
        Intrinsics.checkNotNull(mutableOrderedScatterSet, "null cannot be cast to non-null type androidx.collection.OrderedScatterSet<E of androidx.collection.OrderedScatterSetKt.orderedScatterSetOf>");
        return mutableOrderedScatterSet;
    }

    @NotNull
    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e10) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(1);
        mutableOrderedScatterSet.plusAssign(e10);
        return mutableOrderedScatterSet;
    }

    @NotNull
    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e10) {
        return mutableOrderedScatterSetOf(e10);
    }

    @NotNull
    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e10, E e11) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(2);
        mutableOrderedScatterSet.plusAssign(e10);
        mutableOrderedScatterSet.plusAssign(e11);
        return mutableOrderedScatterSet;
    }

    @NotNull
    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e10, E e11) {
        return mutableOrderedScatterSetOf(e10, e11);
    }

    @NotNull
    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e10, E e11, E e12) {
        return mutableOrderedScatterSetOf(e10, e11, e12);
    }

    @NotNull
    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(@NotNull E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableOrderedScatterSet mutableOrderedScatterSet = new MutableOrderedScatterSet(elements.length);
        mutableOrderedScatterSet.plusAssign((Object[]) elements);
        return mutableOrderedScatterSet;
    }

    @NotNull
    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e10, E e11, E e12) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(3);
        mutableOrderedScatterSet.plusAssign(e10);
        mutableOrderedScatterSet.plusAssign(e11);
        mutableOrderedScatterSet.plusAssign(e12);
        return mutableOrderedScatterSet;
    }

    @NotNull
    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(@NotNull E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(elements.length);
        mutableOrderedScatterSet.plusAssign((Object[]) elements);
        return mutableOrderedScatterSet;
    }
}
