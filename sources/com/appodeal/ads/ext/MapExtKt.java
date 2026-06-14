package com.appodeal.ads.ext;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001\u001a\u001a\u0010\b\u001a\u0004\u0018\u00010\t*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001¨\u0006\n"}, d2 = {"filterNotNullValues", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "toBundle", "Landroid/os/Bundle;", "", "", "toJsonOrNull", "Lorg/json/JSONObject;", "ext_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MapExtKt {
    public static final Unit a(Map map, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                jsonObject.hasObject(str, (JSONObject) value);
            } else if (value instanceof JSONArray) {
                jsonObject.hasArray(str, (JSONArray) value);
            } else {
                jsonObject.hasValue(str, value);
            }
        }
        return Unit.f93236a;
    }

    public static final <K, V> Map<K, V> filterNotNullValues(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            Pair pair = value != null ? TuplesKt.to(key, value) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    public static final Bundle toBundle(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                bundle.putInt(key, ((Number) value).intValue());
            } else if (value instanceof int[]) {
                bundle.putIntArray(key, (int[]) value);
            } else if (value instanceof Long) {
                bundle.putLong(key, ((Number) value).longValue());
            } else if (value instanceof long[]) {
                bundle.putLongArray(key, (long[]) value);
            } else if (value instanceof Double) {
                bundle.putDouble(key, ((Number) value).doubleValue());
            } else if (value instanceof double[]) {
                bundle.putDoubleArray(key, (double[]) value);
            } else if (value instanceof String) {
                bundle.putString(key, (String) value);
            } else if (value instanceof Object[]) {
                Object[] objArr = (Object[]) value;
                ArrayList arrayList2 = new ArrayList(objArr.length);
                for (Object obj : objArr) {
                    arrayList2.add(String.valueOf(obj));
                }
                bundle.putStringArray(key, (String[]) arrayList2.toArray(new String[0]));
            } else if (value instanceof Boolean) {
                bundle.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof boolean[]) {
                bundle.putBooleanArray(key, (boolean[]) value);
            }
            arrayList.add(Unit.f93236a);
        }
        return bundle;
    }

    public static final JSONObject toJsonOrNull(final Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            return null;
        }
        return JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.ext.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MapExtKt.a(map, (JsonObjectBuilder) obj);
            }
        });
    }
}
