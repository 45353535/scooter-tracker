package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C4240b4;
import com.ironsource.C4257c4;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5510w2 {
    public static void a(C5153hm c5153hm, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C4257c4.f42799c);
        if (jSONObjectOptJSONObject != null) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("deeplink_conditions");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                    String strOptString = jSONObjectOptJSONObject2.optString(C4240b4.i.W, null);
                    if (!TextUtils.isEmpty(strOptString)) {
                        String strOptString2 = jSONObjectOptJSONObject2.optString("value", null);
                        arrayList.add(new Pair(strOptString, strOptString2 != null ? new C5435t2(strOptString2) : null));
                    }
                }
            }
            c5153hm.f77345s = new C5460u2(arrayList);
        }
    }
}
