package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
class Rc extends AbstractC4286e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f41666i = C4266cd.f42821a;

    Rc(int i10) {
        this.f42947g = i10;
    }

    @Override // com.ironsource.AbstractC4286e
    public String a() {
        return C4266cd.f42821a;
    }

    @Override // com.ironsource.AbstractC4286e
    public String c() {
        return "outcome";
    }

    @Override // com.ironsource.AbstractC4286e
    public String a(ArrayList<C4649z5> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f42946f = new JSONObject();
        } else {
            this.f42946f = jSONObject;
        }
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
        return a(jSONArray);
    }
}
