package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f9162c;

    k1(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f9160a = JsonUtils.getString(jSONObject, "name", "");
        this.f9161b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f9162c = n7.a(list);
        } else {
            this.f9162c = n7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    public String a() {
        return this.f9161b;
    }

    public String b() {
        return this.f9160a;
    }

    public boolean c() {
        return this.f9162c;
    }

    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str2 == null || n7.a(str2, str) != 1) {
            return str3 == null || n7.a(str3, str) != -1;
        }
        return false;
    }
}
