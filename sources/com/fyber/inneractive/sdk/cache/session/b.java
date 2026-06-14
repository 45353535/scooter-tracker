package com.fyber.inneractive.sdk.cache.session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f20231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f20232b;

    public b(c cVar, JSONObject jSONObject) {
        this.f20232b = cVar;
        this.f20231a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        e eVar = this.f20232b.f20233a;
        JSONObject jSONObject = this.f20231a;
        eVar.getClass();
        for (com.fyber.inneractive.sdk.cache.session.enums.c cVar : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
            if (cVar != com.fyber.inneractive.sdk.cache.session.enums.c.NONE) {
                String strName = cVar.name();
                JSONArray jSONArray = new JSONArray();
                try {
                    jSONArray = jSONObject.getJSONArray(strName);
                } catch (JSONException unused) {
                }
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    g gVarA = g.a(jSONArray.optJSONObject(i10));
                    if (gVarA != null && gVarA.f20243a != 0) {
                        eVar.a(cVar, gVarA);
                    }
                }
            }
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("currentSession");
        if (jSONObjectOptJSONObject != null) {
            h hVar = new h();
            JSONArray jSONArray2 = new JSONArray();
            try {
                jSONArray2 = jSONObjectOptJSONObject.getJSONArray("content");
            } catch (JSONException unused2) {
            }
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2 = jSONArray2.getJSONObject(i11);
                } catch (JSONException unused3) {
                }
                com.fyber.inneractive.sdk.cache.session.enums.c cVarA = com.fyber.inneractive.sdk.cache.session.enums.c.a(jSONObject2.optString("type"), jSONObject2.optString("subType"));
                g gVarA2 = g.a(jSONObject2.optJSONObject("session_data"));
                if (gVarA2 != null) {
                    hVar.put(cVarA, gVarA2);
                }
            }
            for (com.fyber.inneractive.sdk.cache.session.enums.c cVar2 : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
                if (cVar2 != com.fyber.inneractive.sdk.cache.session.enums.c.NONE && (gVar = (g) hVar.get(cVar2)) != null && gVar.f20243a != 0) {
                    eVar.a(cVar2, gVar);
                }
            }
        }
        this.f20232b.f20233a.getClass();
    }
}
