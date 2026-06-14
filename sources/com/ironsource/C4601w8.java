package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4601w8 implements G7 {
    @Override // com.ironsource.G7
    public String a(Map<String, Object> map) {
        try {
            return String.format("%s=%s", "data", Base64.encodeToString(new JSONObject().put(D5.Q, D5.R).put("data", new JSONObject(map)).toString().getBytes(), 2));
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }
}
