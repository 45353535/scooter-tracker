package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\b\u001a-\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u000b\u001a=\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u000e\u001aM\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0011\u001a]\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0018\u001a-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0019\u001a=\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001a\u001aM\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001b\u001a]\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001c\u001a4\u0010 \u001a\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001e0\u001dH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b \u0010!\u001a<\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001e0\u001dH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b \u0010#\"\u0014\u0010$\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&"}, d2 = {"Landroidx/collection/IntLongMap;", "emptyIntLongMap", "()Landroidx/collection/IntLongMap;", "intLongMapOf", "", "key1", "", "value1", "(IJ)Landroidx/collection/IntLongMap;", "key2", "value2", "(IJIJ)Landroidx/collection/IntLongMap;", "key3", "value3", "(IJIJIJ)Landroidx/collection/IntLongMap;", "key4", "value4", "(IJIJIJIJ)Landroidx/collection/IntLongMap;", "key5", "value5", "(IJIJIJIJIJ)Landroidx/collection/IntLongMap;", "Landroidx/collection/MutableIntLongMap;", "mutableIntLongMapOf", "()Landroidx/collection/MutableIntLongMap;", "(IJ)Landroidx/collection/MutableIntLongMap;", "(IJIJ)Landroidx/collection/MutableIntLongMap;", "(IJIJIJ)Landroidx/collection/MutableIntLongMap;", "(IJIJIJIJ)Landroidx/collection/MutableIntLongMap;", "(IJIJIJIJIJ)Landroidx/collection/MutableIntLongMap;", "Lkotlin/Function1;", "", "builderAction", "buildIntLongMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/IntLongMap;", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/IntLongMap;", "EmptyIntLongMap", "Landroidx/collection/MutableIntLongMap;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IntLongMapKt {

    @NotNull
    private static final MutableIntLongMap EmptyIntLongMap = new MutableIntLongMap(0);

    @NotNull
    public static final IntLongMap buildIntLongMap(@NotNull Function1<? super MutableIntLongMap, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        builderAction.invoke(mutableIntLongMap);
        return mutableIntLongMap;
    }

    @NotNull
    public static final IntLongMap emptyIntLongMap() {
        return EmptyIntLongMap;
    }

    @NotNull
    public static final IntLongMap intLongMapOf() {
        return EmptyIntLongMap;
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf() {
        return new MutableIntLongMap(0, 1, null);
    }

    @NotNull
    public static final IntLongMap buildIntLongMap(int i10, @NotNull Function1<? super MutableIntLongMap, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(i10);
        builderAction.invoke(mutableIntLongMap);
        return mutableIntLongMap;
    }

    @NotNull
    public static final IntLongMap intLongMapOf(int i10, long j10) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        return mutableIntLongMap;
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf(int i10, long j10) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        return mutableIntLongMap;
    }

    @NotNull
    public static final IntLongMap intLongMapOf(int i10, long j10, int i11, long j11) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        return mutableIntLongMap;
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf(int i10, long j10, int i11, long j11) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        return mutableIntLongMap;
    }

    @NotNull
    public static final IntLongMap intLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        return mutableIntLongMap;
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        return mutableIntLongMap;
    }

    @NotNull
    public static final IntLongMap intLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12, int i13, long j13) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        return mutableIntLongMap;
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12, int i13, long j13) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        return mutableIntLongMap;
    }

    @NotNull
    public static final IntLongMap intLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12, int i13, long j13, int i14, long j14) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        mutableIntLongMap.set(i14, j14);
        return mutableIntLongMap;
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12, int i13, long j13, int i14, long j14) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        mutableIntLongMap.set(i14, j14);
        return mutableIntLongMap;
    }
}
