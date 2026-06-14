package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class to {
    private String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private List<String> f17399ud;

    public to(String str) {
        this.qdl = "";
        this.f17399ud = new ArrayList();
        HashMap<String, Object> map = TextUtils.isEmpty(str) ? new HashMap<>() : qdl(str);
        try {
            this.qdl = (String) map.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) map.get("auto_test_hosts"));
            this.f17399ud = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f17399ud.add(jSONArray.optString(i10));
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.aaj.lnr("AutoTestModel", e10.getMessage());
        }
    }

    public String qdl() {
        return this.qdl;
    }

    public List<String> ud() {
        return this.f17399ud;
    }

    private static final HashMap<String, Object> qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> map = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                map.put(jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optString("value"));
            }
            return map;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
