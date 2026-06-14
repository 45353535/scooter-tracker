package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\b\u001a-\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u000b\u001a=\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u000e\u001aM\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0011\u001a]\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0018\u001a-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0019\u001a=\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001a\u001aM\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001b\u001a]\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001c\u001a4\u0010 \u001a\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001e0\u001dH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b \u0010!\u001a<\u0010 \u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001e0\u001dH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b \u0010$\"\u0014\u0010%\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"Landroidx/collection/FloatLongMap;", "emptyFloatLongMap", "()Landroidx/collection/FloatLongMap;", "floatLongMapOf", "", "key1", "", "value1", "(FJ)Landroidx/collection/FloatLongMap;", "key2", "value2", "(FJFJ)Landroidx/collection/FloatLongMap;", "key3", "value3", "(FJFJFJ)Landroidx/collection/FloatLongMap;", "key4", "value4", "(FJFJFJFJ)Landroidx/collection/FloatLongMap;", "key5", "value5", "(FJFJFJFJFJ)Landroidx/collection/FloatLongMap;", "Landroidx/collection/MutableFloatLongMap;", "mutableFloatLongMapOf", "()Landroidx/collection/MutableFloatLongMap;", "(FJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJFJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJFJFJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJFJFJFJ)Landroidx/collection/MutableFloatLongMap;", "Lkotlin/Function1;", "", "builderAction", "buildFloatLongMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/FloatLongMap;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/FloatLongMap;", "EmptyFloatLongMap", "Landroidx/collection/MutableFloatLongMap;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FloatLongMapKt {

    @NotNull
    private static final MutableFloatLongMap EmptyFloatLongMap = new MutableFloatLongMap(0);

    @NotNull
    public static final FloatLongMap buildFloatLongMap(@NotNull Function1<? super MutableFloatLongMap, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        builderAction.invoke(mutableFloatLongMap);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap emptyFloatLongMap() {
        return EmptyFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf() {
        return EmptyFloatLongMap;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf() {
        return new MutableFloatLongMap(0, 1, null);
    }

    @NotNull
    public static final FloatLongMap buildFloatLongMap(int i10, @NotNull Function1<? super MutableFloatLongMap, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(i10);
        builderAction.invoke(mutableFloatLongMap);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f10, long j10) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f10, long j10) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f10, long j10, float f11, long j11) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        mutableFloatLongMap.set(f11, j11);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f10, long j10, float f11, long j11) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        mutableFloatLongMap.set(f11, j11);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f10, long j10, float f11, long j11, float f12, long j12) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f10, long j10, float f11, long j11, float f12, long j12) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f10, long j10, float f11, long j11, float f12, long j12, float f13, long j13) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        mutableFloatLongMap.set(f13, j13);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f10, long j10, float f11, long j11, float f12, long j12, float f13, long j13) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        mutableFloatLongMap.set(f13, j13);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f10, long j10, float f11, long j11, float f12, long j12, float f13, long j13, float f14, long j14) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        mutableFloatLongMap.set(f13, j13);
        mutableFloatLongMap.set(f14, j14);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f10, long j10, float f11, long j11, float f12, long j12, float f13, long j13, float f14, long j14) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        mutableFloatLongMap.set(f13, j13);
        mutableFloatLongMap.set(f14, j14);
        return mutableFloatLongMap;
    }
}
