package kotlin.collections.jdk8;

import androidx.exifinterface.media.ExifInterface;
import com.ironsource.C4240b4;
import j$.util.Map;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a>\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a@\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u00072\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H\u0087\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", C4240b4.i.W, "defaultValue", "getOrDefault", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "value", "", "remove", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "kotlin-stdlib-jdk8"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CollectionsJDK8Kt {
    private static final <K, V> V getOrDefault(Map<? extends K, ? extends V> map, K k10, V v10) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return (V) Map.EL.getOrDefault(map, k10, v10);
    }

    private static final <K, V> boolean remove(java.util.Map<? extends K, ? extends V> map, K k10, V v10) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return Map.EL.remove(b1.d(map), k10, v10);
    }
}
