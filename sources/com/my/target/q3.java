package com.my.target;

import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class q3 {
    public static q3 a() {
        return new q3();
    }

    public void a(JSONObject jSONObject, p3 p3Var) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            ArrayList arrayListC = p3Var.c();
            int size = arrayListC.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayListC.get(i10);
                i10++;
                v5 v5Var = (v5) obj;
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(v5Var.h());
                if (jSONObjectOptJSONObject2 != null) {
                    a(jSONObjectOptJSONObject2, v5Var);
                }
            }
        }
    }

    public final void a(JSONObject jSONObject, v5 v5Var) {
        v5Var.a(jSONObject.optInt("connectionTimeout", v5Var.e()));
        int iOptInt = jSONObject.optInt("maxBannersShow", v5Var.f());
        if (iOptInt == 0) {
            iOptInt = -1;
        }
        v5Var.b(iOptInt);
    }
}
