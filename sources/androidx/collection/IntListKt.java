package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\b\u001a%\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\n\u001a\u0019\u0010\u0003\u001a\u00020\u00002\n\u0010\f\u001a\u00020\u000b\"\u00020\u0004¢\u0006\u0004\b\u0003\u0010\r\u001a\u0010\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0011\u001a\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0012\u001a%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0013\u001a\u001c\u0010\u000f\u001a\u00020\u000e2\n\u0010\f\u001a\u00020\u000b\"\u00020\u0004H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0014\u001a4\u0010\u0018\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a<\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0018\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"Landroidx/collection/IntList;", "emptyIntList", "()Landroidx/collection/IntList;", "intListOf", "", "element1", "(I)Landroidx/collection/IntList;", "element2", "(II)Landroidx/collection/IntList;", "element3", "(III)Landroidx/collection/IntList;", "", "elements", "([I)Landroidx/collection/IntList;", "Landroidx/collection/MutableIntList;", "mutableIntListOf", "()Landroidx/collection/MutableIntList;", "(I)Landroidx/collection/MutableIntList;", "(II)Landroidx/collection/MutableIntList;", "(III)Landroidx/collection/MutableIntList;", "([I)Landroidx/collection/MutableIntList;", "Lkotlin/Function1;", "", "builderAction", "buildIntList", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/IntList;", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/IntList;", "EmptyIntList", "Landroidx/collection/IntList;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IntListKt {

    @NotNull
    private static final IntList EmptyIntList = new MutableIntList(0);

    @NotNull
    public static final IntList buildIntList(@NotNull Function1<? super MutableIntList, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableIntList mutableIntList = new MutableIntList(0, 1, null);
        builderAction.invoke(mutableIntList);
        return mutableIntList;
    }

    @NotNull
    public static final IntList emptyIntList() {
        return EmptyIntList;
    }

    @NotNull
    public static final IntList intListOf() {
        return EmptyIntList;
    }

    @NotNull
    public static final MutableIntList mutableIntListOf() {
        return new MutableIntList(0, 1, null);
    }

    @NotNull
    public static final IntList buildIntList(int i10, @NotNull Function1<? super MutableIntList, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableIntList mutableIntList = new MutableIntList(i10);
        builderAction.invoke(mutableIntList);
        return mutableIntList;
    }

    @NotNull
    public static final IntList intListOf(int i10) {
        return mutableIntListOf(i10);
    }

    @NotNull
    public static final MutableIntList mutableIntListOf(int i10) {
        MutableIntList mutableIntList = new MutableIntList(1);
        mutableIntList.add(i10);
        return mutableIntList;
    }

    @NotNull
    public static final IntList intListOf(int i10, int i11) {
        return mutableIntListOf(i10, i11);
    }

    @NotNull
    public static final IntList intListOf(int i10, int i11, int i12) {
        return mutableIntListOf(i10, i11, i12);
    }

    @NotNull
    public static final MutableIntList mutableIntListOf(int i10, int i11) {
        MutableIntList mutableIntList = new MutableIntList(2);
        mutableIntList.add(i10);
        mutableIntList.add(i11);
        return mutableIntList;
    }

    @NotNull
    public static final IntList intListOf(@NotNull int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableIntList mutableIntList = new MutableIntList(elements.length);
        mutableIntList.addAll(mutableIntList._size, elements);
        return mutableIntList;
    }

    @NotNull
    public static final MutableIntList mutableIntListOf(int i10, int i11, int i12) {
        MutableIntList mutableIntList = new MutableIntList(3);
        mutableIntList.add(i10);
        mutableIntList.add(i11);
        mutableIntList.add(i12);
        return mutableIntList;
    }

    @NotNull
    public static final MutableIntList mutableIntListOf(@NotNull int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableIntList mutableIntList = new MutableIntList(elements.length);
        mutableIntList.addAll(mutableIntList._size, elements);
        return mutableIntList;
    }
}
