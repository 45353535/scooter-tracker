package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
class C4348ha extends AbstractC4286e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f43255i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f43256j = "super.dwh.mediation_events";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f43257k = D5.Q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f43258l = "data";

    C4348ha(int i10) {
        this.f42947g = i10;
    }

    @Override // com.ironsource.AbstractC4286e
    public String a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }

    @Override // com.ironsource.AbstractC4286e
    public String c() {
        return "ironbeast";
    }

    @Override // com.ironsource.AbstractC4286e
    public String a(ArrayList<C4649z5> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            this.f42946f = new JSONObject();
        } else {
            this.f42946f = jSONObject;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<C4649z5> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObjectA = a(it.next());
                    if (jSONObjectA != null) {
                        jSONArray.put(jSONObjectA);
                    }
                }
            }
            jSONObject2.put(D5.Q, "super.dwh.mediation_events");
            jSONObject2.put("data", a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }
}
