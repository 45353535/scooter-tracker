package androidx.collection;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\b\u001a%\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\n\u001a\u0019\u0010\u0003\u001a\u00020\u00002\n\u0010\f\u001a\u00020\u000b\"\u00020\u0004¢\u0006\u0004\b\u0003\u0010\r\u001a\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0011\u001a\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0012\u001a%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0013\u001a\u0019\u0010\u000f\u001a\u00020\u000e2\n\u0010\f\u001a\u00020\u000b\"\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0014\u001a4\u0010\u0018\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a<\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0018\u0010\u001b\u001a\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u001a\u0010!\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%"}, d2 = {"Landroidx/collection/IntSet;", "emptyIntSet", "()Landroidx/collection/IntSet;", "intSetOf", "", "element1", "(I)Landroidx/collection/IntSet;", "element2", "(II)Landroidx/collection/IntSet;", "element3", "(III)Landroidx/collection/IntSet;", "", "elements", "([I)Landroidx/collection/IntSet;", "Landroidx/collection/MutableIntSet;", "mutableIntSetOf", "()Landroidx/collection/MutableIntSet;", "(I)Landroidx/collection/MutableIntSet;", "(II)Landroidx/collection/MutableIntSet;", "(III)Landroidx/collection/MutableIntSet;", "([I)Landroidx/collection/MutableIntSet;", "Lkotlin/Function1;", "", "builderAction", "buildIntSet", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/IntSet;", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/IntSet;", CampaignEx.JSON_KEY_AD_K, "hash", "(I)I", "EmptyIntSet", "Landroidx/collection/MutableIntSet;", "EmptyIntArray", "[I", "getEmptyIntArray", "()[I", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IntSetKt {

    @NotNull
    private static final MutableIntSet EmptyIntSet = new MutableIntSet(0);

    @NotNull
    private static final int[] EmptyIntArray = new int[0];

    @NotNull
    public static final IntSet buildIntSet(@NotNull Function1<? super MutableIntSet, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableIntSet mutableIntSet = new MutableIntSet(0, 1, null);
        builderAction.invoke(mutableIntSet);
        return mutableIntSet;
    }

    @NotNull
    public static final IntSet emptyIntSet() {
        return EmptyIntSet;
    }

    @NotNull
    public static final int[] getEmptyIntArray() {
        return EmptyIntArray;
    }

    public static final int hash(int i10) {
        int i11 = i10 * ScatterMapKt.MurmurHashC1;
        return i11 ^ (i11 << 16);
    }

    @NotNull
    public static final IntSet intSetOf() {
        return EmptyIntSet;
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf() {
        return new MutableIntSet(0, 1, null);
    }

    @NotNull
    public static final IntSet buildIntSet(int i10, @NotNull Function1<? super MutableIntSet, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableIntSet mutableIntSet = new MutableIntSet(i10);
        builderAction.invoke(mutableIntSet);
        return mutableIntSet;
    }

    @NotNull
    public static final IntSet intSetOf(int i10) {
        return mutableIntSetOf(i10);
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(int i10) {
        MutableIntSet mutableIntSet = new MutableIntSet(1);
        mutableIntSet.plusAssign(i10);
        return mutableIntSet;
    }

    @NotNull
    public static final IntSet intSetOf(int i10, int i11) {
        return mutableIntSetOf(i10, i11);
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(int i10, int i11) {
        MutableIntSet mutableIntSet = new MutableIntSet(2);
        mutableIntSet.plusAssign(i10);
        mutableIntSet.plusAssign(i11);
        return mutableIntSet;
    }

    @NotNull
    public static final IntSet intSetOf(int i10, int i11, int i12) {
        return mutableIntSetOf(i10, i11, i12);
    }

    @NotNull
    public static final IntSet intSetOf(@NotNull int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableIntSet mutableIntSet = new MutableIntSet(elements.length);
        mutableIntSet.plusAssign(elements);
        return mutableIntSet;
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(int i10, int i11, int i12) {
        MutableIntSet mutableIntSet = new MutableIntSet(3);
        mutableIntSet.plusAssign(i10);
        mutableIntSet.plusAssign(i11);
        mutableIntSet.plusAssign(i12);
        return mutableIntSet;
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(@NotNull int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableIntSet mutableIntSet = new MutableIntSet(elements.length);
        mutableIntSet.plusAssign(elements);
        return mutableIntSet;
    }
}
