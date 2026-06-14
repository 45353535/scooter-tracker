package com.appodeal.ads.ext;

import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0004\u0018\u00010\u0003\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00020\u0006H\u0086\bø\u0001\u0000\u001a\u001e\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00020\t\"\u0004\b\u0000\u0010\u0002*\u0004\u0018\u00010\u0007\u001a\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\n\u001a$\u0010\u000b\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"asList", "", "T", "Lorg/json/JSONArray;", "map", "transform", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "toMap", "", "", "getStringOrNull", "name", POBCoreNativeConstants.NATIVE_FALLBACK_URL, "ext_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class JsonExtKt {
    public static final <T> List<T> asList(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object objOpt = jSONArray.opt(i10);
            if (objOpt == null) {
                objOpt = null;
            }
            if (objOpt != null) {
                arrayList.add(objOpt);
            }
        }
        return arrayList;
    }

    public static final String getStringOrNull(JSONObject jSONObject, String str) {
        return getStringOrNull(jSONObject, str, null);
    }

    public static /* synthetic */ String getStringOrNull$default(JSONObject jSONObject, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return getStringOrNull(jSONObject, str, str2);
    }

    public static final <T> List<T> map(JSONArray jSONArray, Function1<? super JSONObject, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (jSONArray == null || jSONArray.length() == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(transform.invoke(jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }

    public static final <T> Map<String, T> toMap(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, jSONObject.opt(next));
        }
        return linkedHashMap;
    }

    public static final String getStringOrNull(JSONObject jSONObject, String str, String str2) {
        return (jSONObject == null || str == null || str.length() == 0 || !jSONObject.has(str) || jSONObject.isNull(str)) ? str2 : jSONObject.optString(str, str2);
    }
}
