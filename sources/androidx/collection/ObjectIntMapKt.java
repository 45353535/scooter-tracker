package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\f\u001aI\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u000f\u001aY\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u0012\u001ai\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u0015\u001a\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0019\u001a9\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u001a\u001aI\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u001b\u001aY\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u001c\u001ai\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u001d\u001aF\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0018\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u00020\u001f0\u001eH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b!\u0010\"\u001aN\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010#\u001a\u00020\u00062\u0018\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u00020\u001f0\u001eH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b!\u0010$\"\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"K", "Landroidx/collection/ObjectIntMap;", "emptyObjectIntMap", "()Landroidx/collection/ObjectIntMap;", "objectIntMap", "key1", "", "value1", "objectIntMapOf", "(Ljava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "key2", "value2", "(Ljava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "key3", "value3", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "key4", "value4", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "key5", "value5", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "Landroidx/collection/MutableObjectIntMap;", "mutableObjectIntMapOf", "()Landroidx/collection/MutableObjectIntMap;", "(Ljava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "Lkotlin/Function1;", "", "builderAction", "buildObjectIntMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/ObjectIntMap;", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/ObjectIntMap;", "", "EmptyObjectIntMap", "Landroidx/collection/MutableObjectIntMap;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ObjectIntMapKt {

    @NotNull
    private static final MutableObjectIntMap<Object> EmptyObjectIntMap = new MutableObjectIntMap<>(0);

    @NotNull
    public static final <K> ObjectIntMap<K> buildObjectIntMap(@NotNull Function1<? super MutableObjectIntMap<K>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        builderAction.invoke(mutableObjectIntMap);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> ObjectIntMap<K> emptyObjectIntMap() {
        MutableObjectIntMap<Object> mutableObjectIntMap = EmptyObjectIntMap;
        Intrinsics.checkNotNull(mutableObjectIntMap, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf() {
        return new MutableObjectIntMap<>(0, 1, null);
    }

    @NotNull
    public static final <K> ObjectIntMap<K> objectIntMap() {
        MutableObjectIntMap<Object> mutableObjectIntMap = EmptyObjectIntMap;
        Intrinsics.checkNotNull(mutableObjectIntMap, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.objectIntMap>");
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> ObjectIntMap<K> objectIntMapOf(K k10, int i10) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> ObjectIntMap<K> buildObjectIntMap(int i10, @NotNull Function1<? super MutableObjectIntMap<K>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(i10);
        builderAction.invoke(mutableObjectIntMap);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k10, int i10) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> ObjectIntMap<K> objectIntMapOf(K k10, int i10, K k11, int i11) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k10, int i10, K k11, int i11) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> ObjectIntMap<K> objectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> ObjectIntMap<K> objectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12, K k13, int i13) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        mutableObjectIntMap.set(k13, i13);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12, K k13, int i13) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        mutableObjectIntMap.set(k13, i13);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> ObjectIntMap<K> objectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12, K k13, int i13, K k14, int i14) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        mutableObjectIntMap.set(k13, i13);
        mutableObjectIntMap.set(k14, i14);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12, K k13, int i13, K k14, int i14) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        mutableObjectIntMap.set(k13, i13);
        mutableObjectIntMap.set(k14, i14);
        return mutableObjectIntMap;
    }
}
