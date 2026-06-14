package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.ArrayList;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mo {
    public static final mo qdl = new mo(null);

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static String f17471ud = "";
    public String lnr;
    public boolean mml;
    public boolean mo;
    public boolean mzz;

    public mo(String str) {
        this.lnr = "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js";
        this.mml = true;
        this.mzz = true;
        this.mo = true;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String strOptString = jSONObjectOptJSONObject.optString("url", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(strOptString)) {
                this.lnr = strOptString;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i10));
            }
            this.mml = arrayList.contains("load_finish");
            this.mo = arrayList.contains(Reporting.EventType.LOAD_FAIL);
            this.mzz = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
