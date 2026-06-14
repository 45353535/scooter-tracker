package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\f\u001aI\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u000f\u001aY\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u0012\u001ai\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u0015\u001a\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0019\u001a9\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u001a\u001aI\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u001b\u001aY\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u001c\u001ai\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u001d\u001aF\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0018\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u00020\u001f0\u001eH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b!\u0010\"\u001aN\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010$\u001a\u00020#2\u0018\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u00020\u001f0\u001eH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b!\u0010%\"\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"K", "Landroidx/collection/ObjectFloatMap;", "emptyObjectFloatMap", "()Landroidx/collection/ObjectFloatMap;", "objectFloatMap", "key1", "", "value1", "objectFloatMapOf", "(Ljava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "key2", "value2", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "key3", "value3", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "key4", "value4", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "key5", "value5", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "Landroidx/collection/MutableObjectFloatMap;", "mutableObjectFloatMapOf", "()Landroidx/collection/MutableObjectFloatMap;", "(Ljava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "Lkotlin/Function1;", "", "builderAction", "buildObjectFloatMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/ObjectFloatMap;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/ObjectFloatMap;", "", "EmptyObjectFloatMap", "Landroidx/collection/MutableObjectFloatMap;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ObjectFloatMapKt {

    @NotNull
    private static final MutableObjectFloatMap<Object> EmptyObjectFloatMap = new MutableObjectFloatMap<>(0);

    @NotNull
    public static final <K> ObjectFloatMap<K> buildObjectFloatMap(@NotNull Function1<? super MutableObjectFloatMap<K>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        builderAction.invoke(mutableObjectFloatMap);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> ObjectFloatMap<K> emptyObjectFloatMap() {
        MutableObjectFloatMap<Object> mutableObjectFloatMap = EmptyObjectFloatMap;
        Intrinsics.checkNotNull(mutableObjectFloatMap, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.emptyObjectFloatMap>");
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf() {
        return new MutableObjectFloatMap<>(0, 1, null);
    }

    @NotNull
    public static final <K> ObjectFloatMap<K> objectFloatMap() {
        MutableObjectFloatMap<Object> mutableObjectFloatMap = EmptyObjectFloatMap;
        Intrinsics.checkNotNull(mutableObjectFloatMap, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.objectFloatMap>");
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k10, float f10) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> ObjectFloatMap<K> buildObjectFloatMap(int i10, @NotNull Function1<? super MutableObjectFloatMap<K>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(i10);
        builderAction.invoke(mutableObjectFloatMap);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k10, float f10) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k10, float f10, K k11, float f11) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        mutableObjectFloatMap.set(k11, f11);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k10, float f10, K k11, float f11) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        mutableObjectFloatMap.set(k11, f11);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k10, float f10, K k11, float f11, K k12, float f12) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k10, float f10, K k11, float f11, K k12, float f12) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k10, float f10, K k11, float f11, K k12, float f12, K k13, float f13) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        mutableObjectFloatMap.set(k13, f13);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k10, float f10, K k11, float f11, K k12, float f12, K k13, float f13) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        mutableObjectFloatMap.set(k13, f13);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k10, float f10, K k11, float f11, K k12, float f12, K k13, float f13, K k14, float f14) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        mutableObjectFloatMap.set(k13, f13);
        mutableObjectFloatMap.set(k14, f14);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k10, float f10, K k11, float f11, K k12, float f12, K k13, float f13, K k14, float f14) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        mutableObjectFloatMap.set(k13, f13);
        mutableObjectFloatMap.set(k14, f14);
        return mutableObjectFloatMap;
    }
}
