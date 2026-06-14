package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\b\u001a9\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u000b\u001aI\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u000e\u001aY\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0011\u001ai\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0014\u001a\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0018\u001a9\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0019\u001aI\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u001a\u001aY\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u001b\u001ai\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u001c\u001aF\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0004\u0012\u00020\u001e0\u001dH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b \u0010!\u001aN\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010#\u001a\u00020\"2\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0004\u0012\u00020\u001e0\u001dH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b \u0010$\"\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/collection/FloatObjectMap;", "emptyFloatObjectMap", "()Landroidx/collection/FloatObjectMap;", "floatObjectMapOf", "", "key1", "value1", "(FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key2", "value2", "(FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key3", "value3", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key4", "value4", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key5", "value5", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "Landroidx/collection/MutableFloatObjectMap;", "mutableFloatObjectMapOf", "()Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "Lkotlin/Function1;", "", "builderAction", "buildFloatObjectMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/FloatObjectMap;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/FloatObjectMap;", "", "EmptyFloatObjectMap", "Landroidx/collection/MutableFloatObjectMap;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FloatObjectMapKt {

    @NotNull
    private static final MutableFloatObjectMap EmptyFloatObjectMap = new MutableFloatObjectMap(0);

    @NotNull
    public static final <V> FloatObjectMap<V> buildFloatObjectMap(@NotNull Function1<? super MutableFloatObjectMap<V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        builderAction.invoke(mutableFloatObjectMap);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> FloatObjectMap<V> emptyFloatObjectMap() {
        MutableFloatObjectMap mutableFloatObjectMap = EmptyFloatObjectMap;
        Intrinsics.checkNotNull(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.emptyFloatObjectMap>");
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> FloatObjectMap<V> floatObjectMapOf() {
        MutableFloatObjectMap mutableFloatObjectMap = EmptyFloatObjectMap;
        Intrinsics.checkNotNull(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.floatObjectMapOf>");
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf() {
        return new MutableFloatObjectMap<>(0, 1, null);
    }

    @NotNull
    public static final <V> FloatObjectMap<V> buildFloatObjectMap(int i10, @NotNull Function1<? super MutableFloatObjectMap<V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(i10);
        builderAction.invoke(mutableFloatObjectMap);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f10, V v10) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f10, V v10) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f10, V v10, float f11, V v11) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f10, V v10, float f11, V v11) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f10, V v10, float f11, V v11, float f12, V v12) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f10, V v10, float f11, V v11, float f12, V v12) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f10, V v10, float f11, V v11, float f12, V v12, float f13, V v13) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        mutableFloatObjectMap.set(f13, v13);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f10, V v10, float f11, V v11, float f12, V v12, float f13, V v13) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        mutableFloatObjectMap.set(f13, v13);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f10, V v10, float f11, V v11, float f12, V v12, float f13, V v13, float f14, V v14) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        mutableFloatObjectMap.set(f13, v13);
        mutableFloatObjectMap.set(f14, v14);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f10, V v10, float f11, V v11, float f12, V v12, float f13, V v13, float f14, V v14) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        mutableFloatObjectMap.set(f13, v13);
        mutableFloatObjectMap.set(f14, v14);
        return mutableFloatObjectMap;
    }
}
