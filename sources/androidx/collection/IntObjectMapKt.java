package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\b\u001a9\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u000b\u001aI\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u000e\u001aY\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0011\u001ai\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0014\u001a\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0018\u001a9\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0019\u001aI\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u001a\u001aY\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u001b\u001ai\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u001c\u001aF\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0004\u0012\u00020\u001e0\u001dH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b \u0010!\u001aN\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\"\u001a\u00020\u00052\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0004\u0012\u00020\u001e0\u001dH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b \u0010#\"\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/collection/IntObjectMap;", "emptyIntObjectMap", "()Landroidx/collection/IntObjectMap;", "intObjectMapOf", "", "key1", "value1", "(ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key2", "value2", "(ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key3", "value3", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key4", "value4", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key5", "value5", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "Landroidx/collection/MutableIntObjectMap;", "mutableIntObjectMapOf", "()Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "Lkotlin/Function1;", "", "builderAction", "buildIntObjectMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/IntObjectMap;", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/IntObjectMap;", "", "EmptyIntObjectMap", "Landroidx/collection/MutableIntObjectMap;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IntObjectMapKt {

    @NotNull
    private static final MutableIntObjectMap EmptyIntObjectMap = new MutableIntObjectMap(0);

    @NotNull
    public static final <V> IntObjectMap<V> buildIntObjectMap(@NotNull Function1<? super MutableIntObjectMap<V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        builderAction.invoke(mutableIntObjectMap);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> IntObjectMap<V> emptyIntObjectMap() {
        MutableIntObjectMap mutableIntObjectMap = EmptyIntObjectMap;
        Intrinsics.checkNotNull(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> IntObjectMap<V> intObjectMapOf() {
        MutableIntObjectMap mutableIntObjectMap = EmptyIntObjectMap;
        Intrinsics.checkNotNull(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf() {
        return new MutableIntObjectMap<>(0, 1, null);
    }

    @NotNull
    public static final <V> IntObjectMap<V> buildIntObjectMap(int i10, @NotNull Function1<? super MutableIntObjectMap<V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(i10);
        builderAction.invoke(mutableIntObjectMap);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> IntObjectMap<V> intObjectMapOf(int i10, V v10) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i10, V v10) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> IntObjectMap<V> intObjectMapOf(int i10, V v10, int i11, V v11) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i10, V v10, int i11, V v11) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> IntObjectMap<V> intObjectMapOf(int i10, V v10, int i11, V v11, int i12, V v12) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i10, V v10, int i11, V v11, int i12, V v12) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> IntObjectMap<V> intObjectMapOf(int i10, V v10, int i11, V v11, int i12, V v12, int i13, V v13) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        mutableIntObjectMap.set(i13, v13);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i10, V v10, int i11, V v11, int i12, V v12, int i13, V v13) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        mutableIntObjectMap.set(i13, v13);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> IntObjectMap<V> intObjectMapOf(int i10, V v10, int i11, V v11, int i12, V v12, int i13, V v13, int i14, V v14) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        mutableIntObjectMap.set(i13, v13);
        mutableIntObjectMap.set(i14, v14);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i10, V v10, int i11, V v11, int i12, V v12, int i13, V v13, int i14, V v14) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        mutableIntObjectMap.set(i13, v13);
        mutableIntObjectMap.set(i14, v14);
        return mutableIntObjectMap;
    }
}
