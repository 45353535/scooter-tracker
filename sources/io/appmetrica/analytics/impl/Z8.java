package io.appmetrica.analytics.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class Z8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo f76740a;

    public Z8(zo zoVar) {
        this.f76740a = zoVar;
    }

    public final void a(int i10, long j10) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        zo zoVar = this.f76740a;
        synchronized (zoVar) {
            jSONObjectOptJSONObject = zoVar.f78664a.a().optJSONObject("numbers_of_type");
        }
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        jSONObjectOptJSONObject.put(String.valueOf(i10), j10);
        this.f76740a.a(jSONObjectOptJSONObject);
    }
}
