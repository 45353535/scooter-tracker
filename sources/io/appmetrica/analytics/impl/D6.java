package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class D6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5455tm[] fromModel(@NotNull Map<String, ? extends List<String>> map) {
        C5455tm[] c5455tmArr = new C5455tm[map.size()];
        int i10 = 0;
        for (Object obj : map.entrySet()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) obj;
            C5455tm c5455tm = new C5455tm();
            c5455tm.f78307a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c5455tm.f78308b = (String[]) array;
            c5455tmArr[i10] = c5455tm;
            i10 = i11;
        }
        return c5455tmArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(@NotNull C5455tm[] c5455tmArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(c5455tmArr.length), 16));
        for (C5455tm c5455tm : c5455tmArr) {
            Pair pair = TuplesKt.to(c5455tm.f78307a, ArraysKt.toList(c5455tm.f78308b));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
