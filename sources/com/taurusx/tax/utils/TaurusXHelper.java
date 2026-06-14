package com.taurusx.tax.utils;

import android.content.Context;
import com.taurusx.tax.g.w;
import com.taurusx.tax.w.s.s;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class TaurusXHelper {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static z f66920w = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f66921z = "TaurusXHelper";

    public interface z {
        void z(Context context, String str, String str2, Map<String, Object> map);

        boolean z();
    }

    public static boolean isDebugMode() {
        z zVar = f66920w;
        if (zVar != null) {
            return zVar.z();
        }
        return false;
    }

    public static void reportCustomEvent(Context context, String str, String str2) {
        if (z(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appversion", w.s(context));
            jSONObject.put("pid", str2);
            jSONObject.put(s.I, str);
            jSONObject.put(s.J, System.currentTimeMillis());
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (JSONException unused) {
        }
    }

    public static void setOnTaurusXHelperListener(z zVar) {
        f66920w = zVar;
    }

    public static boolean z(String str) {
        JSONArray jSONArrayD = com.taurusx.tax.w.o.w.D();
        for (int i10 = 0; i10 < jSONArrayD.length(); i10++) {
            if (str.equalsIgnoreCase(jSONArrayD.getString(i10))) {
                return true;
            }
        }
        return false;
    }
}
