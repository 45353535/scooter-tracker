package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\b\u001a-\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u000b\u001a=\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u000e\u001aM\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0011\u001a]\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0018\u001a-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0019\u001a=\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001a\u001aM\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001b\u001a]\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001c\u001a4\u0010 \u001a\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001e0\u001dH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b \u0010!\u001a<\u0010 \u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001e0\u001dH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b \u0010$\"\u0014\u0010%\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"Landroidx/collection/LongFloatMap;", "emptyLongFloatMap", "()Landroidx/collection/LongFloatMap;", "longFloatMapOf", "", "key1", "", "value1", "(JF)Landroidx/collection/LongFloatMap;", "key2", "value2", "(JFJF)Landroidx/collection/LongFloatMap;", "key3", "value3", "(JFJFJF)Landroidx/collection/LongFloatMap;", "key4", "value4", "(JFJFJFJF)Landroidx/collection/LongFloatMap;", "key5", "value5", "(JFJFJFJFJF)Landroidx/collection/LongFloatMap;", "Landroidx/collection/MutableLongFloatMap;", "mutableLongFloatMapOf", "()Landroidx/collection/MutableLongFloatMap;", "(JF)Landroidx/collection/MutableLongFloatMap;", "(JFJF)Landroidx/collection/MutableLongFloatMap;", "(JFJFJF)Landroidx/collection/MutableLongFloatMap;", "(JFJFJFJF)Landroidx/collection/MutableLongFloatMap;", "(JFJFJFJFJF)Landroidx/collection/MutableLongFloatMap;", "Lkotlin/Function1;", "", "builderAction", "buildLongFloatMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/LongFloatMap;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/LongFloatMap;", "EmptyLongFloatMap", "Landroidx/collection/MutableLongFloatMap;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LongFloatMapKt {

    @NotNull
    private static final MutableLongFloatMap EmptyLongFloatMap = new MutableLongFloatMap(0);

    @NotNull
    public static final LongFloatMap buildLongFloatMap(@NotNull Function1<? super MutableLongFloatMap, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        builderAction.invoke(mutableLongFloatMap);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final LongFloatMap emptyLongFloatMap() {
        return EmptyLongFloatMap;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf() {
        return EmptyLongFloatMap;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf() {
        return new MutableLongFloatMap(0, 1, null);
    }

    @NotNull
    public static final LongFloatMap buildLongFloatMap(int i10, @NotNull Function1<? super MutableLongFloatMap, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(i10);
        builderAction.invoke(mutableLongFloatMap);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long j10, float f10) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j10, float f10) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long j10, float f10, long j11, float f11) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        mutableLongFloatMap.set(j11, f11);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j10, float f10, long j11, float f11) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        mutableLongFloatMap.set(j11, f11);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long j10, float f10, long j11, float f11, long j12, float f12) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j10, float f10, long j11, float f11, long j12, float f12) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long j10, float f10, long j11, float f11, long j12, float f12, long j13, float f13) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j10, float f10, long j11, float f11, long j12, float f12, long j13, float f13) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long j10, float f10, long j11, float f11, long j12, float f12, long j13, float f13, long j14, float f14) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        mutableLongFloatMap.set(j14, f14);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j10, float f10, long j11, float f11, long j12, float f12, long j13, float f13, long j14, float f14) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        mutableLongFloatMap.set(j14, f14);
        return mutableLongFloatMap;
    }
}
