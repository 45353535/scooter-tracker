package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"androidx/room/util/RelationUtil__RelationUtilKt", "androidx/room/util/RelationUtil__RelationUtil_androidKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class RelationUtil {
    public static final int MAX_BIND_PARAMETER_CNT = 999;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchArrayMap(@NotNull ArrayMap<K, V> arrayMap, boolean z10, @NotNull Function1<? super ArrayMap<K, V>, Unit> function1) {
        RelationUtil__RelationUtil_androidKt.recursiveFetchArrayMap(arrayMap, z10, function1);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchHashMap(@NotNull HashMap<K, V> map, boolean z10, @NotNull Function1<? super HashMap<K, V>, Unit> function1) {
        RelationUtil__RelationUtil_androidKt.recursiveFetchHashMap(map, z10, function1);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <V> void recursiveFetchLongSparseArray(@NotNull LongSparseArray<V> longSparseArray, boolean z10, @NotNull Function1<? super LongSparseArray<V>, Unit> function1) {
        RelationUtil__RelationUtilKt.recursiveFetchLongSparseArray(longSparseArray, z10, function1);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchMap(@NotNull Map<K, V> map, boolean z10, @NotNull Function1<? super Map<K, V>, Unit> function1) {
        RelationUtil__RelationUtilKt.recursiveFetchMap(map, z10, function1);
    }
}
