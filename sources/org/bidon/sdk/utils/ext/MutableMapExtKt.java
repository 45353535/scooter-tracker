package org.bidon.sdk.utils.ext;

import androidx.exifinterface.media.ExifInterface;
import com.ironsource.C4240b4;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\u001a;\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\b\u0010\u0006\u001a\u0004\u0018\u0001H\u0003H\u0000¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"addOrRemoveIfNull", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", C4240b4.i.W, "value", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MutableMapExtKt {
    public static final <K, V> void addOrRemoveIfNull(@NotNull Map<K, V> map, K k10, @Nullable V v10) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (v10 != null) {
            map.put(k10, v10);
        } else {
            map.remove(k10);
        }
    }
}
