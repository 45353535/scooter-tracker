package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aH\u0010\b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\u0010\u0012\u0006\b\u0000\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0087\n¢\u0006\u0004\b\b\u0010\t\u001aJ\u0010\b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\u0012\u0012\u0006\b\u0000\u0012\u00020\u0003\u0012\u0006\b\u0001\u0012\u00028\u00000\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0087\n¢\u0006\u0004\b\u000b\u0010\t\u001aH\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0006\b\u0000\u0012\u00020\u0003\u0012\u0006\b\u0000\u0012\u00028\u00000\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\f\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "V1", "", "", "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "", "getVar", "value", "", "setValue", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MapAccessorsKt {
    private static final <V, V1 extends V> V1 getValue(Map<? super String, ? extends V> map, Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return (V1) MapsKt__MapWithDefaultKt.getOrImplicitDefaultNullable(map, property.getName());
    }

    private static final <V, V1 extends V> V1 getVar(Map<? super String, ? extends V> map, Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return (V1) MapsKt__MapWithDefaultKt.getOrImplicitDefaultNullable(map, property.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <V> void setValue(Map<? super String, ? super V> map, Object obj, KProperty<?> property, V v10) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        map.put(property.getName(), v10);
    }
}
