package com.applovin.impl;

import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.impl.v;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class s6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p2 f10414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Exception f10415h;

    public s6(com.applovin.impl.sdk.k kVar, p2 p2Var, Exception exc) {
        super("TaskValidateLicense", kVar);
        this.f10414g = p2Var;
        this.f10415h = exc;
    }

    private String e() {
        return r0.a((String) this.f9071a.a(x4.f11440v0), (String) this.f9071a.a(x4.f11448w0), this.f9071a);
    }

    private JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        v.a aVarF = this.f9071a.A().f();
        JsonUtils.putBoolean(jSONObject, "dnt", aVarF.c());
        JsonUtils.putString(jSONObject, "dnt_code", aVarF.b().b());
        if (((Boolean) this.f9071a.a(x4.f11467y3)).booleanValue() && StringUtils.isValidString(aVarF.a())) {
            JsonUtils.putString(jSONObject, "idfa", aVarF.a());
        }
        l.b bVarH = this.f9071a.A().H();
        if (((Boolean) this.f9071a.a(x4.f11475z3)).booleanValue() && bVarH != null) {
            JsonUtils.putString(jSONObject, "idfv", bVarH.f10753a);
            JsonUtils.putInt(jSONObject, "idfv_scope", bVarH.f10754b);
        }
        String strE = this.f9071a.w0().e();
        if (((Boolean) this.f9071a.a(x4.A3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f9071a.a(x4.D3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f9071a.u());
        }
        if (((Boolean) this.f9071a.a(x4.F3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f9071a.h0());
        }
        JsonUtils.putAll(jSONObject, (Map<String, ?>) this.f9071a.A().e());
        JSONObject jSONObject2 = new JSONObject();
        p2 p2Var = this.f10414g;
        if (p2Var != null) {
            JsonUtils.putString(jSONObject2, "lsig", p2Var.d());
            JsonUtils.putString(jSONObject2, "lsigd", this.f10414g.e());
            JsonUtils.putInt(jSONObject2, "r_code", this.f10414g.c());
            JsonUtils.putInt(jSONObject2, "n", this.f10414g.b());
        }
        Exception exc = this.f10415h;
        if (exc != null) {
            JsonUtils.putStringIfValid(jSONObject2, "lvfr", exc.toString());
        }
        JsonUtils.putObject(jSONObject, "lvd", jSONObject2);
        return jSONObject;
    }

    private String g() {
        return r0.a((String) this.f9071a.a(x4.f11432u0), (String) this.f9071a.a(x4.f11448w0), this.f9071a);
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f9071a).b(g()).a(e()).a(f()).c("POST").b(((Boolean) this.f9071a.a(x4.Q5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f9071a.a(x4.f11427t3)).intValue()).a(u4.a.a(((Integer) this.f9071a.a(x4.f11469y5)).intValue())).a(), this.f9071a);
        aVar.c(x4.f11432u0);
        aVar.b(x4.f11440v0);
        this.f9071a.q0().a(aVar);
    }

    class a extends l6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "License Validation successful");
            }
            a5.b(z4.f11624i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
            Map map = CollectionUtils.map("code", String.valueOf(i10));
            CollectionUtils.putStringIfValid("url", str, map);
            this.f9071a.v0().d(d2.f8581l, map);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Failed to validate license: ");
            }
            if (!this.f9071a.c(x4.A).contains(String.valueOf(i10))) {
                a5.b(z4.f11624i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
            }
            Map map = CollectionUtils.map("error_code", String.valueOf(i10));
            CollectionUtils.putStringIfValid("error_message", str2, map);
            CollectionUtils.putStringIfValid("url", str, map);
            this.f9071a.v0().d(d2.f8583m, map);
        }
    }
}
