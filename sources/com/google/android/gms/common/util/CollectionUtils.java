package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(@Nullable Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.EMPTY_LIST;
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k10, @NonNull V v10, @NonNull K k11, @NonNull V v11, @NonNull K k12, @NonNull V v12) {
        Map mapZzb = zzb(3, false);
        mapZzb.put(k10, v10);
        mapZzb.put(k11, v11);
        mapZzb.put(k12, v12);
        return DesugarCollections.unmodifiableMap(mapZzb);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(@NonNull K[] kArr, @NonNull V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 44 + String.valueOf(length2).length());
            sb2.append("Key and values array lengths not equal: ");
            sb2.append(length);
            sb2.append(" != ");
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (length == 0) {
            return Collections.EMPTY_MAP;
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapZzb = zzb(length, false);
        for (int i10 = 0; i10 < kArr.length; i10++) {
            mapZzb.put(kArr[i10], vArr[i10]);
        }
        return DesugarCollections.unmodifiableMap(mapZzb);
    }

    @NonNull
    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i10) {
        return i10 == 0 ? new ArraySet() : zza(i10, true);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T t10, @NonNull T t11, @NonNull T t12) {
        Set setZza = zza(3, false);
        setZza.add(t10);
        setZza.add(t11);
        setZza.add(t12);
        return DesugarCollections.unmodifiableSet(setZza);
    }

    private static Set zza(int i10, boolean z10) {
        if (i10 <= (true != z10 ? 256 : 128)) {
            return new ArraySet(i10);
        }
        return new HashSet(i10, true != z10 ? 1.0f : 0.75f);
    }

    private static Map zzb(int i10, boolean z10) {
        return i10 <= 256 ? new ArrayMap(i10) : new HashMap(i10, 1.0f);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T t10) {
        return Collections.singletonList(t10);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (length != 1) {
            return DesugarCollections.unmodifiableList(Arrays.asList(tArr));
        }
        return Collections.singletonList(tArr[0]);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k10, @NonNull V v10, @NonNull K k11, @NonNull V v11, @NonNull K k12, @NonNull V v12, @NonNull K k13, @NonNull V v13, @NonNull K k14, @NonNull V v14, @NonNull K k15, @NonNull V v15) {
        Map mapZzb = zzb(6, false);
        mapZzb.put(k10, v10);
        mapZzb.put(k11, v11);
        mapZzb.put(k12, v12);
        mapZzb.put(k13, v13);
        mapZzb.put(k14, v14);
        mapZzb.put(k15, v15);
        return DesugarCollections.unmodifiableMap(mapZzb);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_SET;
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t10 = tArr[0];
            T t11 = tArr[1];
            Set setZza = zza(2, false);
            setZza.add(t10);
            setZza.add(t11);
            return DesugarCollections.unmodifiableSet(setZza);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setZza2 = zza(length, false);
            Collections.addAll(setZza2, tArr);
            return DesugarCollections.unmodifiableSet(setZza2);
        }
        T t12 = tArr[0];
        T t13 = tArr[1];
        T t14 = tArr[2];
        T t15 = tArr[3];
        Set setZza3 = zza(4, false);
        setZza3.add(t12);
        setZza3.add(t13);
        setZza3.add(t14);
        setZza3.add(t15);
        return DesugarCollections.unmodifiableSet(setZza3);
    }
}
