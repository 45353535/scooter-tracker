package com.applovin.impl;

import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class v6 extends q6 {
    protected v6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private o4 b(JSONObject jSONObject) {
        Map<String, String> stringMap;
        String string;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        r0.c(jSONObject2, this.f9071a);
        r0.b(jSONObject, this.f9071a);
        r0.a(jSONObject, this.f9071a);
        try {
            stringMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get("params"));
        } catch (Throwable unused) {
            stringMap = Collections.EMPTY_MAP;
        }
        try {
            string = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            string = "network_timeout";
        }
        return o4.a(string, stringMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        o4 o4VarB = b(jSONObject);
        a(o4VarB);
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Pending reward handled: " + o4VarB);
        }
    }

    protected abstract void a(o4 o4Var);

    @Override // com.applovin.impl.q6
    protected int g() {
        return ((Integer) this.f9071a.a(x4.f11297e1)).intValue();
    }

    protected abstract boolean h();

    @Override // java.lang.Runnable
    public void run() {
        a(e(), new a());
    }

    class a implements q0.e {
        a() {
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (v6.this.h()) {
                com.applovin.impl.sdk.o oVar = v6.this.f9073c;
                if (com.applovin.impl.sdk.o.a()) {
                    v6 v6Var = v6.this;
                    v6Var.f9073c.b(v6Var.f9072b, "Reward validation succeeded with code " + i10 + " but task was cancelled already");
                }
                com.applovin.impl.sdk.o oVar2 = v6.this.f9073c;
                if (com.applovin.impl.sdk.o.a()) {
                    v6 v6Var2 = v6.this;
                    v6Var2.f9073c.b(v6Var2.f9072b, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o oVar3 = v6.this.f9073c;
            if (com.applovin.impl.sdk.o.a()) {
                v6 v6Var3 = v6.this;
                v6Var3.f9073c.a(v6Var3.f9072b, "Reward validation succeeded with code " + i10 + " and response: " + jSONObject);
            }
            v6.this.c(jSONObject);
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (v6.this.h()) {
                com.applovin.impl.sdk.o oVar = v6.this.f9073c;
                if (com.applovin.impl.sdk.o.a()) {
                    v6 v6Var = v6.this;
                    v6Var.f9073c.b(v6Var.f9072b, "Reward validation failed with error code " + i10 + " but task was cancelled already");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o oVar2 = v6.this.f9073c;
            if (com.applovin.impl.sdk.o.a()) {
                v6 v6Var2 = v6.this;
                v6Var2.f9073c.b(v6Var2.f9072b, "Reward validation failed with code " + i10 + " and error: " + str2);
            }
            v6.this.a(i10);
        }
    }
}
