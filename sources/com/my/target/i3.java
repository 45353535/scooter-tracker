package com.my.target;

import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class i3 {
    public static i3 a() {
        return new i3();
    }

    public void a(JSONObject jSONObject, h3 h3Var) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            ArrayList arrayListC = h3Var.c();
            int size = arrayListC.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayListC.get(i10);
                i10++;
                w3 w3Var = (w3) obj;
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(w3Var.h());
                if (jSONObjectOptJSONObject2 != null) {
                    a(jSONObjectOptJSONObject2, w3Var);
                }
            }
        }
    }

    public final void a(JSONObject jSONObject, w3 w3Var) {
        w3Var.a(jSONObject.optInt("connectionTimeout", w3Var.e()));
        int iOptInt = jSONObject.optInt("maxBannersShow", w3Var.f());
        if (iOptInt == 0) {
            iOptInt = -1;
        }
        w3Var.b(iOptInt);
    }
}
