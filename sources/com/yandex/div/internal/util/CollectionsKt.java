package com.yandex.div.internal.util;

import androidx.collection.ArrayMap;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.b1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\f\u001a\u00020\u000b2\u001e\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\t\"\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "arrayMap", "()Ljava/util/Map;", "T", "", "immutableCopy", "(Ljava/util/List;)Ljava/util/List;", "", FirebaseAnalytics.Param.ITEMS, "", "allIsNullOrEmpty", "([Ljava/util/List;)Z", "utils_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class CollectionsKt {
    public static final boolean allIsNullOrEmpty(@NotNull List<?>... listArr) {
        for (List<?> list : listArr) {
            if (list != null && !list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K, V> Map<K, V> arrayMap() {
        return new ArrayMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> immutableCopy(@NotNull List<? extends T> list) {
        return b1.p(list) ? DesugarCollections.unmodifiableList(new ArrayList(list)) : list;
    }
}
