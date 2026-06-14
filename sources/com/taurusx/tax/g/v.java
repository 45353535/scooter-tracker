package com.taurusx.tax.g;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class v {
    public static String c(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getString(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject w(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static long y(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getLong(str);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static ArrayList<String> z(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(jSONArray.get(i10).toString());
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return arrayList;
    }

    public static int z(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }
}
