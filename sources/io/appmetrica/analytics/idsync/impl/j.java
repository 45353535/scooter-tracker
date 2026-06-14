package io.appmetrica.analytics.idsync.impl;

import android.util.Base64;
import java.util.Collection;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class j {
    public static String a(y yVar) throws JSONException {
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", yVar.f75445a);
        jSONObject.put("url", yVar.f75447c);
        jSONObject.put("responseCode", yVar.f75449e);
        byte[] bArr = yVar.f75450f;
        try {
            strEncodeToString = new String(bArr, Charsets.UTF_8);
        } catch (Throwable unused) {
            strEncodeToString = Base64.encodeToString(bArr, 0);
        }
        jSONObject.put("responseBody", strEncodeToString);
        Map map = yVar.f75451g;
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject2.putOpt((String) entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        jSONObject.put("responseHeaders", jSONObject2);
        return jSONObject.toString();
    }
}
