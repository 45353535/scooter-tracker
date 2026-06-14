package com.appodeal.ads.utils.campaign_frequency;

import android.util.Pair;
import com.appodeal.ads.db;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.storage.a0;
import com.appodeal.ads.storage.e;
import com.appodeal.ads.storage.e0;
import com.appodeal.ads.storage.m;
import com.appodeal.ads.utils.Log;
import eg.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap f14972l = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f14973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f14982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f14983k;

    public b(String str, String str2, String str3, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11) {
        this.f14974b = str;
        this.f14975c = str2;
        this.f14976d = str3;
        this.f14977e = i10;
        this.f14978f = i11;
        this.f14979g = i12;
        this.f14980h = i13;
        this.f14981i = i14;
        this.f14982j = z10;
        this.f14983k = z11;
        this.f14973a = new a(str2);
    }

    public static JSONObject a(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                JSONObject jSONObject2 = new JSONObject(jSONObject.getString(next));
                Iterator<String> itKeys2 = jSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    JSONArray jSONArray = jSONObject2.getJSONArray(next2);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        arrayList.add(Integer.valueOf(jSONArray.getInt(i10)));
                    }
                    Collections.sort(arrayList);
                    List listSubList = arrayList.subList(Math.max(arrayList.size() - 20, 0), arrayList.size());
                    long jCurrentTimeMillis = ((System.currentTimeMillis() / 1000) / 60) - 43200;
                    Iterator it = listSubList.iterator();
                    while (it.hasNext()) {
                        if (((Integer) it.next()).intValue() < jCurrentTimeMillis) {
                            it.remove();
                        }
                    }
                    if (listSubList.size() > 0) {
                        jSONObject2.put(next2, new JSONArray((Collection) listSubList));
                    } else {
                        itKeys2.remove();
                    }
                }
                if (jSONObject2.length() > 0) {
                    jSONObject.put(next, jSONObject2);
                } else {
                    itKeys.remove();
                }
            } catch (Exception e10) {
                Log.log(e10);
            }
        }
        return jSONObject;
    }

    public static void b() {
        try {
            JSONObject campaigns = a(a.a());
            e0 e0Var = a.f14969b;
            e0Var.getClass();
            Intrinsics.checkNotNullParameter(campaigns, "campaigns");
            a0 a0Var = e0Var.f14800a;
            a0Var.getClass();
            Intrinsics.checkNotNullParameter(campaigns, "campaigns");
            i.d((CoroutineScope) a0Var.f14784b.getValue(), null, null, new m(a0Var, campaigns, null), 3, null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            a0 a0Var2 = e0Var.f14800a;
            i.d((CoroutineScope) a0Var2.f14784b.getValue(), null, null, new e(a0Var2, jCurrentTimeMillis, null), 3, null);
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    public static void c(ArrayList arrayList) {
        try {
            if (db.f13245g) {
                HashMap map = new HashMap();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    JSONObject jSONObject = (JSONObject) arrayList.get(i10);
                    if (jSONObject.has(Constants.CAMPAIGN_FREQUENCY)) {
                        double d10 = jSONObject.getDouble("ecpm");
                        List arrayList2 = map.containsKey(Double.valueOf(d10)) ? (List) map.get(Double.valueOf(d10)) : new ArrayList();
                        arrayList2.add(new Pair(Integer.valueOf(i10), Double.valueOf(jSONObject.getJSONObject(Constants.CAMPAIGN_FREQUENCY).optDouble("weight", 1.0d))));
                        map.put(Double.valueOf(d10), arrayList2);
                    }
                }
                for (List<Pair> list : map.values()) {
                    if (list.size() != 1) {
                        Iterator it = list.iterator();
                        double dDoubleValue = 0.0d;
                        while (it.hasNext()) {
                            dDoubleValue += ((Double) ((Pair) it.next()).second).doubleValue();
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Pair pair : list) {
                            arrayList3.addAll(Collections.nCopies((int) Math.round((((Double) pair.second).doubleValue() / dDoubleValue) * 100.0d), (Integer) pair.first));
                        }
                        Collections.shuffle(arrayList3);
                        ArrayList arrayList4 = new ArrayList(new LinkedHashSet(arrayList3));
                        HashMap map2 = new HashMap();
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            map2.put((Integer) arrayList4.get(i11), (JSONObject) arrayList.get(((Integer) ((Pair) list.get(i11)).first).intValue()));
                        }
                        for (Map.Entry entry : map2.entrySet()) {
                            arrayList.set(((Integer) entry.getKey()).intValue(), (JSONObject) entry.getValue());
                        }
                    }
                }
            }
        } catch (Exception e10) {
            Log.log(e10);
        }
    }
}
