package com.applovin.impl;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o6 extends q6 {
    protected o6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private JSONObject a(o4 o4Var) {
        JSONObject jSONObjectE = e();
        JsonUtils.putString(jSONObjectE, "result", o4Var.b());
        Map mapA = o4Var.a();
        if (mapA != null) {
            JsonUtils.putJSONObject(jSONObjectE, "params", new JSONObject(mapA));
        }
        return jSONObjectE;
    }

    protected abstract void b(JSONObject jSONObject);

    @Override // com.applovin.impl.q6
    protected int g() {
        return ((Integer) this.f9071a.a(x4.f11306f1)).intValue();
    }

    protected abstract o4 h();

    protected abstract void i();

    @Override // java.lang.Runnable
    public void run() {
        o4 o4VarH = h();
        if (o4VarH == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Pending reward not found");
            }
            i();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Reporting pending reward: " + o4VarH + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        a(a(o4VarH), new a());
    }

    class a implements q0.e {
        a() {
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            o6.this.b(jSONObject);
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            o6.this.a(i10);
        }
    }
}
