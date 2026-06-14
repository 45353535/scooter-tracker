package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\b\u001a%\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\n\u001a\u0019\u0010\u0003\u001a\u00020\u00002\n\u0010\f\u001a\u00020\u000b\"\u00020\u0004¢\u0006\u0004\b\u0003\u0010\r\u001a\u0010\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0011\u001a\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0012\u001a%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0013\u001a\u001c\u0010\u000f\u001a\u00020\u000e2\n\u0010\f\u001a\u00020\u000b\"\u00020\u0004H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0014\u001a4\u0010\u0018\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a<\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0018\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"Landroidx/collection/FloatList;", "emptyFloatList", "()Landroidx/collection/FloatList;", "floatListOf", "", "element1", "(F)Landroidx/collection/FloatList;", "element2", "(FF)Landroidx/collection/FloatList;", "element3", "(FFF)Landroidx/collection/FloatList;", "", "elements", "([F)Landroidx/collection/FloatList;", "Landroidx/collection/MutableFloatList;", "mutableFloatListOf", "()Landroidx/collection/MutableFloatList;", "(F)Landroidx/collection/MutableFloatList;", "(FF)Landroidx/collection/MutableFloatList;", "(FFF)Landroidx/collection/MutableFloatList;", "([F)Landroidx/collection/MutableFloatList;", "Lkotlin/Function1;", "", "builderAction", "buildFloatList", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/FloatList;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/FloatList;", "EmptyFloatList", "Landroidx/collection/FloatList;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FloatListKt {

    @NotNull
    private static final FloatList EmptyFloatList = new MutableFloatList(0);

    @NotNull
    public static final FloatList buildFloatList(@NotNull Function1<? super MutableFloatList, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableFloatList mutableFloatList = new MutableFloatList(0, 1, null);
        builderAction.invoke(mutableFloatList);
        return mutableFloatList;
    }

    @NotNull
    public static final FloatList emptyFloatList() {
        return EmptyFloatList;
    }

    @NotNull
    public static final FloatList floatListOf() {
        return EmptyFloatList;
    }

    @NotNull
    public static final MutableFloatList mutableFloatListOf() {
        return new MutableFloatList(0, 1, null);
    }

    @NotNull
    public static final FloatList buildFloatList(int i10, @NotNull Function1<? super MutableFloatList, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableFloatList mutableFloatList = new MutableFloatList(i10);
        builderAction.invoke(mutableFloatList);
        return mutableFloatList;
    }

    @NotNull
    public static final FloatList floatListOf(float f10) {
        return mutableFloatListOf(f10);
    }

    @NotNull
    public static final MutableFloatList mutableFloatListOf(float f10) {
        MutableFloatList mutableFloatList = new MutableFloatList(1);
        mutableFloatList.add(f10);
        return mutableFloatList;
    }

    @NotNull
    public static final FloatList floatListOf(float f10, float f11) {
        return mutableFloatListOf(f10, f11);
    }

    @NotNull
    public static final FloatList floatListOf(float f10, float f11, float f12) {
        return mutableFloatListOf(f10, f11, f12);
    }

    @NotNull
    public static final MutableFloatList mutableFloatListOf(float f10, float f11) {
        MutableFloatList mutableFloatList = new MutableFloatList(2);
        mutableFloatList.add(f10);
        mutableFloatList.add(f11);
        return mutableFloatList;
    }

    @NotNull
    public static final FloatList floatListOf(@NotNull float... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableFloatList mutableFloatList = new MutableFloatList(elements.length);
        mutableFloatList.addAll(mutableFloatList._size, elements);
        return mutableFloatList;
    }

    @NotNull
    public static final MutableFloatList mutableFloatListOf(float f10, float f11, float f12) {
        MutableFloatList mutableFloatList = new MutableFloatList(3);
        mutableFloatList.add(f10);
        mutableFloatList.add(f11);
        mutableFloatList.add(f12);
        return mutableFloatList;
    }

    @NotNull
    public static final MutableFloatList mutableFloatListOf(@NotNull float... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableFloatList mutableFloatList = new MutableFloatList(elements.length);
        mutableFloatList.addAll(mutableFloatList._size, elements);
        return mutableFloatList;
    }
}
