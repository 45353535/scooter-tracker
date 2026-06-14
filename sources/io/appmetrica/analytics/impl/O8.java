package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class O8 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NotNull Map<String, byte[]> map) {
        Q8 q82 = new Q8();
        P8[] p8Arr = new P8[map.size()];
        int i10 = 0;
        for (Object obj : map.entrySet()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) obj;
            P8 p82 = new P8();
            p82.f76250a = (String) entry.getKey();
            p82.f76251b = (byte[]) entry.getValue();
            p8Arr[i10] = p82;
            i10 = i11;
        }
        q82.f76302a = p8Arr;
        return MessageNano.toByteArray(q82);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(@NotNull byte[] bArr) {
        P8[] p8Arr = ((Q8) MessageNano.mergeFrom(new Q8(), bArr)).f76302a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(p8Arr.length), 16));
        for (P8 p82 : p8Arr) {
            Pair pair = TuplesKt.to(p82.f76250a, p82.f76251b);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
