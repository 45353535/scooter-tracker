package androidx.datastore.preferences.core;

import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import eg.o0;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a4\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005H\u0000\u001a\b\u0010\t\u001a\u00020\nH\u0000¨\u0006\u000b"}, d2 = {"immutableCopyOfSet", "", "T", "set", "immutableMap", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "map", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "datastore-preferences-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Actual_jvmAndroidKt {
    @NotNull
    public static final <T> Set<T> immutableCopyOfSet(@NotNull Set<? extends T> set) {
        Intrinsics.checkNotNullParameter(set, "set");
        Set<T> setUnmodifiableSet = DesugarCollections.unmodifiableSet(CollectionsKt.toSet(set));
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    @NotNull
    public static final <K, V> Map<K, V> immutableMap(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        Map<K, V> mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    @NotNull
    public static final CoroutineDispatcher ioDispatcher() {
        return o0.b();
    }
}
