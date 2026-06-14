package yads;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ij2 {
    public static Uri a(Uri uri, ma3 ma3Var) {
        Map mapEmptyMap;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null) {
            mapEmptyMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(queryParameterNames, 10)), 16));
            for (String str : queryParameterNames) {
                Pair pair = TuplesKt.to(str, uri.getQueryParameter(str));
                mapEmptyMap.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            mapEmptyMap = null;
        }
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        jj2 jj2Var = (jj2) ma3Var.invoke(new jj2(mapEmptyMap));
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (Map.Entry entry : jj2Var.f112365a.entrySet()) {
            builderClearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderClearQuery.build();
    }
}
