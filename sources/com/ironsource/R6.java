package com.ironsource;

import android.content.Context;
import com.ironsource.N6;
import com.ironsource.environment.ContextProvider;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class R6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f41663a = "adunit_data";

    public void a(String str, Object obj) {
        O6.b().b(str, obj);
    }

    public void a(Map<String, Object> map) {
        O6.b().a(map);
    }

    public void a(String str, JSONArray jSONArray) {
        O6.b().a(str, jSONArray);
    }

    public void a(String str, JSONObject jSONObject) {
        O6.b().a(str, jSONObject);
    }

    public void a(Context context) {
        O6.b().c(context);
    }

    public void a(@NotNull String str, @NotNull Object obj, @NotNull N6.a aVar) {
        try {
            String strName = aVar.name();
            O6 o6B = O6.b();
            JSONObject jSONObjectOptJSONObject = o6B.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f41663a);
            if (jSONObjectOptJSONObject == null) {
                o6B.b(f41663a, new JSONObject().put(strName, new JSONObject().put(str, obj)));
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strName);
            if (jSONObjectOptJSONObject2 == null) {
                o6B.b(f41663a, jSONObjectOptJSONObject.put(strName, new JSONObject().put(str, obj)));
            } else {
                o6B.b(f41663a, jSONObjectOptJSONObject.put(strName, jSONObjectOptJSONObject2.put(str, obj)));
            }
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
        }
    }

    public void a(@NotNull String str, @NotNull N6.a aVar) {
        JSONObject jSONObjectOptJSONObject;
        try {
            String strName = aVar.name();
            O6 o6B = O6.b();
            JSONObject jSONObjectOptJSONObject2 = o6B.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f41663a);
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(strName)) == null || jSONObjectOptJSONObject.remove(str) == null) {
                return;
            }
            o6B.b(f41663a, jSONObjectOptJSONObject2.put(strName, jSONObjectOptJSONObject));
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
        }
    }
}
