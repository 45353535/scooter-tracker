package com.yandex.div.internal.util;

import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4240b4;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.properties.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aA\u0010\u0006\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a1\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n\"\u0004\b\u0000\u0010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", C4240b4.i.W, "", PglCryptUtils.KEY_MESSAGE, "getOrThrow", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "T", "obj", "Lkotlin/properties/e;", "", "weak", "(Ljava/lang/Object;)Lkotlin/properties/e;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class UtilsKt {
    public static final <K, V> V getOrThrow(@NotNull Map<? extends K, ? extends V> map, K k10, @Nullable String str) {
        V v10 = map.get(k10);
        if (v10 != null) {
            return v10;
        }
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ Object getOrThrow$default(Map map, Object obj, String str, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return getOrThrow(map, obj, str);
    }

    @NotNull
    public static final <T> e weak(@Nullable T t10) {
        return new WeakRef(t10);
    }
}
