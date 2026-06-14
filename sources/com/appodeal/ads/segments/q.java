package com.appodeal.ads.segments;

import com.appodeal.ads.jf;
import com.appodeal.ads.utils.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TreeMap f14502a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TreeMap f14503b = new TreeMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.appodeal.ads.storage.e0 f14504c = com.appodeal.ads.storage.e0.f14799b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CopyOnWriteArrayList f14505d = new CopyOnWriteArrayList();

    public static final o a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        TreeMap treeMap = f14502a;
        if (treeMap.containsKey(name)) {
            Object obj = treeMap.get(name);
            if (obj != null) {
                return (o) obj;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        TreeMap treeMap2 = f14503b;
        if (treeMap2.containsKey(name)) {
            Object obj2 = treeMap2.get(name);
            if (obj2 != null) {
                return (o) obj2;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (!Intrinsics.areEqual(name, "default")) {
            a1 a1Var = a1.f93282a;
            String str = String.format("'%s' not found, using default placement", Arrays.copyOf(new Object[]{name}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            Log.log("Placement", "Get", str);
        }
        if (treeMap.containsKey("default")) {
            Object obj3 = treeMap.get("default");
            if (obj3 != null) {
                return (o) obj3;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (!treeMap2.containsKey("default")) {
            o DEFAULT = o.f14492i;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        Object obj4 = treeMap2.get("default");
        if (obj4 != null) {
            return (o) obj4;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static void b() {
        com.appodeal.ads.storage.a0 a0Var = f14504c.f14800a;
        a0Var.getClass();
        Map<String, ?> all = a0Var.c(com.appodeal.ads.storage.d.f14789d).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            Object value = next.getValue();
            Pair pair = value != null ? TuplesKt.to(key, value.toString()) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map map = MapsKt.toMap(arrayList);
        long jCurrentTimeMillis = ((System.currentTimeMillis() / ((long) 1000)) / ((long) 60)) - ((long) 43200);
        for (Map.Entry entry : map.entrySet()) {
            String key2 = (String) entry.getKey();
            try {
                JSONArray jSONArray = new JSONArray((String) entry.getValue());
                JSONArray jSONArray2 = new JSONArray();
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    long j10 = jSONArray.getLong(i10);
                    if (j10 > jCurrentTimeMillis) {
                        jSONArray2.put(j10);
                    }
                }
                com.appodeal.ads.storage.e0 e0Var = f14504c;
                String string = jSONArray2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                e0Var.getClass();
                Intrinsics.checkNotNullParameter(key2, "key");
                Intrinsics.checkNotNullParameter(string, "string");
                com.appodeal.ads.storage.a0 a0Var2 = e0Var.f14800a;
                a0Var2.getClass();
                Intrinsics.checkNotNullParameter(key2, "key");
                Intrinsics.checkNotNullParameter(string, "string");
                eg.i.d((CoroutineScope) a0Var2.f14784b.getValue(), null, null, new com.appodeal.ads.storage.s(a0Var2, key2, string, null), 3, null);
            } catch (Exception e10) {
                Log.log(e10);
            }
        }
    }

    public static final void c() {
        o oVar;
        Iterator it = f14505d.iterator();
        while (it.hasNext()) {
            jf jfVar = (jf) ((p) it.next());
            com.appodeal.ads.l0 l0Var = jfVar.f13525a;
            String str = l0Var.f13574n;
            if (str != null && ((oVar = l0Var.f13573m) == null || Intrinsics.areEqual(oVar, o.f14492i))) {
                o oVarA = a(str);
                com.appodeal.ads.l0 l0Var2 = jfVar.f13525a;
                l0Var2.f13573m = oVarA;
                l0Var2.f13574n = null;
            }
        }
    }
}
