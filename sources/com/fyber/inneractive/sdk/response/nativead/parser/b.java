package com.fyber.inneractive.sdk.response.nativead.parser;

import java.util.ArrayList;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public static ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strOptString = jSONArray.optString(i10);
                if (strOptString != null && !strOptString.isEmpty() && !strOptString.equals("null")) {
                    arrayList.add(strOptString);
                }
            }
        }
        return arrayList;
    }
}
