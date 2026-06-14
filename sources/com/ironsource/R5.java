package com.ironsource;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class R5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final R5 f41661a = new R5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f41662b = "ext_";

    private R5() {
    }

    @NotNull
    public final Map<String, String> a(@Nullable Bundle bundle) {
        Set<String> setKeySet = bundle != null ? bundle.keySet() : null;
        if (setKeySet == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setKeySet, 10)), 16));
        for (String str : setKeySet) {
            String str2 = f41662b + str;
            Object obj = bundle.get(str);
            Pair pair = TuplesKt.to(str2, obj instanceof Iterable ? CollectionsKt.joinToString$default((Iterable) obj, ", ", null, null, 0, null, null, 62, null) : obj == null ? null : obj.toString());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
