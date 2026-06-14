package com.appodeal.ads.segments;

import com.appodeal.ads.jc;
import com.ironsource.C4418ld;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f14484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r[] f14486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONArray f14487e;

    public j0(JSONObject jSONObject) {
        this.f14483a = jSONObject.optInt("id", -1);
        this.f14484b = new i0(jSONObject);
        this.f14486d = g0.d(jSONObject);
        String strOptString = jSONObject.optString("match_rule", "");
        int[] iArrB = jc.b(2);
        int length = iArrB.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            int i12 = iArrB[i11];
            if (a.a(i12).equalsIgnoreCase(strOptString)) {
                i10 = i12;
                break;
            }
            i11++;
        }
        this.f14485c = i10;
        this.f14487e = jSONObject.optJSONArray(C4418ld.f43559c);
    }

    public final void a() {
        TreeMap treeMap = q.f14502a;
        if (this.f14487e == null) {
            treeMap.clear();
            return;
        }
        TreeMap treeMap2 = new TreeMap();
        for (int i10 = 0; i10 < this.f14487e.length(); i10++) {
            o oVarA = o.a(this.f14487e.getJSONObject(i10));
            if (oVarA != null) {
                o oVar = (o) q.f14502a.get(oVarA.f14495b);
                oVarA.f14499f = oVar != null ? oVar.f14499f : 0L;
                treeMap2.put(oVarA.f14495b, oVarA);
            }
        }
        treeMap.clear();
        treeMap.putAll(treeMap2);
    }

    public final long b() {
        return this.f14483a;
    }

    public final i0 c() {
        return this.f14484b;
    }
}
