package com.my.target;

import android.content.Context;
import android.util.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class z7 {
    public z7(u uVar, j jVar, Context context) {
    }

    public static z7 a(u uVar, j jVar, Context context) {
        return new z7(uVar, jVar, context);
    }

    public final void b(JSONObject jSONObject, y7 y7Var) {
        y7Var.h(jSONObject.optString("title", y7Var.l()));
        y7Var.e(jSONObject.optString("icon_hd", y7Var.f()));
        y7Var.c(jSONObject.optString("bubble_icon_hd", y7Var.d()));
        y7Var.g(jSONObject.optString("label_icon_hd", y7Var.h()));
        y7Var.d(jSONObject.optString("goto_app_icon_hd", y7Var.e()));
        y7Var.f(jSONObject.optString("item_highlight_icon", y7Var.g()));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("icon_status");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    y7Var.k().add(new Pair(jSONObjectOptJSONObject.optString("value"), jSONObjectOptJSONObject.optString("icon_hd")));
                }
            }
        }
    }

    public void a(JSONObject jSONObject, y7 y7Var) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            b(jSONObjectOptJSONObject, y7Var);
        }
    }
}
