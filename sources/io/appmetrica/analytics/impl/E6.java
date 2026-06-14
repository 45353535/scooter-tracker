package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class E6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xl f75724a = new Xl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f75725b = MapsKt.emptyMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f75726c = MapsKt.emptyMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IdentifiersResult f75727d;

    public final synchronized void a(IdentifiersResult identifiersResult) {
        HashMap map;
        Map mapEmptyMap;
        List listA;
        String str;
        try {
            IdentifiersResult identifiersResult2 = this.f75727d;
            String str2 = identifiersResult2 != null ? identifiersResult2.f78675id : null;
            if (str2 == null || str2.length() == 0 || ((str = identifiersResult.f78675id) != null && str.length() != 0)) {
                this.f75727d = identifiersResult;
                String str3 = identifiersResult.f78675id;
                if (str3 == null) {
                    map = null;
                } else {
                    map = new HashMap();
                    try {
                        JSONObject jSONObject = new JSONObject(str3);
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            try {
                                ArrayList arrayListA = AbstractC5295nb.a(new JSONArray(jSONObject.optString(next)));
                                if (arrayListA != null) {
                                    map.put(next, arrayListA);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (map != null) {
                    mapEmptyMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        List list = (List) entry.getValue();
                        mapEmptyMap.put(key, new IdentifiersResult(String.valueOf(no.a((Collection) list) ? null : new JSONArray((Collection) list)), identifiersResult.status, identifiersResult.errorExplanation));
                    }
                } else {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                this.f75726c = mapEmptyMap;
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapEmptyMap.size()));
                for (Map.Entry entry2 : mapEmptyMap.entrySet()) {
                    Object key2 = entry2.getKey();
                    String str4 = ((IdentifiersResult) entry2.getValue()).f78675id;
                    if (str4 == null) {
                        listA = null;
                    } else {
                        try {
                            listA = AbstractC5295nb.a(new JSONArray(str4));
                        } catch (Throwable unused3) {
                            listA = null;
                        }
                    }
                    if (listA == null) {
                        listA = CollectionsKt.emptyList();
                    }
                    linkedHashMap.put(key2, listA);
                }
                this.f75725b = linkedHashMap;
            }
        } finally {
        }
    }

    public final synchronized void a(List list, HashMap map) {
        IdentifierStatus identifierStatus;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                List list2 = (List) this.f75725b.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put(str, list2);
                }
            }
            Xl xl = this.f75724a;
            String strA = AbstractC5295nb.a((Map) linkedHashMap);
            IdentifiersResult identifiersResult = this.f75727d;
            if (identifiersResult == null || (identifierStatus = identifiersResult.status) == null) {
                identifierStatus = IdentifierStatus.UNKNOWN;
            }
            map.put("appmetrica_custom_sdk_hosts", xl.a(new IdentifiersResult(strA, identifierStatus, identifiersResult != null ? identifiersResult.errorExplanation : null)));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
