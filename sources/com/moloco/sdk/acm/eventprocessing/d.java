package com.moloco.sdk.acm.eventprocessing;

import android.util.Log;
import androidx.work.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d {
    public static final Data a(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        try {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
            }
            Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
            Data.Builder builder = new Data.Builder();
            for (Pair pair : pairArr2) {
                builder.put((String) pair.getFirst(), pair.getSecond());
            }
            Data dataBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(dataBuild, "dataBuilder.build()");
            return dataBuild;
        } catch (Exception e10) {
            Log.e("DBPeriodicRequest", e10.getMessage() + ". Data: " + map);
            return null;
        }
    }
}
