package com.ironsource;

import android.app.Activity;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public interface Zd {
    void a(Activity activity);

    void a(String str, String str2, int i10);

    void a(String str, String str2, String str3, Map<String, String> map, Hc hc2);

    void a(String str, String str2, String str3, Map<String, String> map, Mc mc2);

    void a(JSONObject jSONObject);

    boolean a(String str);

    void b(JSONObject jSONObject);

    void c(JSONObject jSONObject);

    void onPause(Activity activity);

    void onResume(Activity activity);
}
