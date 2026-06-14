package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0007\u001a-\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\n\u001a=\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\r\u001aM\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0010\u001a]\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0013\u001a\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0017\u001a-\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0018\u001a=\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0019\u001aM\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u001a\u001a]\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u001b\u001a4\u0010\u001f\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001d0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u001f\u0010 \u001a<\u0010\u001f\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001d0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u001f\u0010#\"\u0014\u0010$\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&"}, d2 = {"Landroidx/collection/FloatFloatMap;", "emptyFloatFloatMap", "()Landroidx/collection/FloatFloatMap;", "floatFloatMapOf", "", "key1", "value1", "(FF)Landroidx/collection/FloatFloatMap;", "key2", "value2", "(FFFF)Landroidx/collection/FloatFloatMap;", "key3", "value3", "(FFFFFF)Landroidx/collection/FloatFloatMap;", "key4", "value4", "(FFFFFFFF)Landroidx/collection/FloatFloatMap;", "key5", "value5", "(FFFFFFFFFF)Landroidx/collection/FloatFloatMap;", "Landroidx/collection/MutableFloatFloatMap;", "mutableFloatFloatMapOf", "()Landroidx/collection/MutableFloatFloatMap;", "(FF)Landroidx/collection/MutableFloatFloatMap;", "(FFFF)Landroidx/collection/MutableFloatFloatMap;", "(FFFFFF)Landroidx/collection/MutableFloatFloatMap;", "(FFFFFFFF)Landroidx/collection/MutableFloatFloatMap;", "(FFFFFFFFFF)Landroidx/collection/MutableFloatFloatMap;", "Lkotlin/Function1;", "", "builderAction", "buildFloatFloatMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/FloatFloatMap;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/FloatFloatMap;", "EmptyFloatFloatMap", "Landroidx/collection/MutableFloatFloatMap;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FloatFloatMapKt {

    @NotNull
    private static final MutableFloatFloatMap EmptyFloatFloatMap = new MutableFloatFloatMap(0);

    @NotNull
    public static final FloatFloatMap buildFloatFloatMap(@NotNull Function1<? super MutableFloatFloatMap, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        builderAction.invoke(mutableFloatFloatMap);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final FloatFloatMap emptyFloatFloatMap() {
        return EmptyFloatFloatMap;
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf() {
        return EmptyFloatFloatMap;
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf() {
        return new MutableFloatFloatMap(0, 1, null);
    }

    @NotNull
    public static final FloatFloatMap buildFloatFloatMap(int i10, @NotNull Function1<? super MutableFloatFloatMap, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(i10);
        builderAction.invoke(mutableFloatFloatMap);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf(float f10, float f11) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f10, float f11) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf(float f10, float f11, float f12, float f13) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        mutableFloatFloatMap.set(f12, f13);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f10, float f11, float f12, float f13) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        mutableFloatFloatMap.set(f12, f13);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf(float f10, float f11, float f12, float f13, float f14, float f15) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        mutableFloatFloatMap.set(f12, f13);
        mutableFloatFloatMap.set(f14, f15);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f10, float f11, float f12, float f13, float f14, float f15) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        mutableFloatFloatMap.set(f12, f13);
        mutableFloatFloatMap.set(f14, f15);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        mutableFloatFloatMap.set(f12, f13);
        mutableFloatFloatMap.set(f14, f15);
        mutableFloatFloatMap.set(f16, f17);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        mutableFloatFloatMap.set(f12, f13);
        mutableFloatFloatMap.set(f14, f15);
        mutableFloatFloatMap.set(f16, f17);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        mutableFloatFloatMap.set(f12, f13);
        mutableFloatFloatMap.set(f14, f15);
        mutableFloatFloatMap.set(f16, f17);
        mutableFloatFloatMap.set(f18, f19);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        mutableFloatFloatMap.set(f12, f13);
        mutableFloatFloatMap.set(f14, f15);
        mutableFloatFloatMap.set(f16, f17);
        mutableFloatFloatMap.set(f18, f19);
        return mutableFloatFloatMap;
    }
}
