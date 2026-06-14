package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Nk implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Pk fromModel(@NotNull Map<String, byte[]> map) {
        Pk pk = new Pk();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            Qk qk = new Qk();
            qk.f76326a = entry.getKey().getBytes(Charsets.UTF_8);
            qk.f76327b = entry.getValue();
            arrayList.add(qk);
        }
        Object[] array = arrayList.toArray(new Qk[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        pk.f76268a = (Qk[]) array;
        return pk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(@NotNull Pk pk) {
        Qk[] qkArr = pk.f76268a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(qkArr.length), 16));
        for (Qk qk : qkArr) {
            Pair pair = TuplesKt.to(new String(qk.f76326a, Charsets.UTF_8), qk.f76327b);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
