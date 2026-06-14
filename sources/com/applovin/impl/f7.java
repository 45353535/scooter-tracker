package com.applovin.impl;

import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f8860c;

    public f7(com.applovin.impl.sdk.k kVar) {
        this.f8858a = kVar;
        z4 z4Var = z4.I;
        this.f8859b = ((Boolean) kVar.a(z4Var, Boolean.FALSE)).booleanValue() || y.a(com.applovin.impl.sdk.k.o()).a("applovin.sdk.is_test_environment") || AppLovinSdkUtils.isEmulator() || kVar.A().U();
        kVar.c(z4Var);
    }

    private void e() {
        com.applovin.impl.sdk.j jVarT = this.f8858a.t();
        if (this.f8859b) {
            jVarT.b(this.f8860c);
        } else {
            jVarT.a(this.f8860c);
        }
    }

    public void a(String str) {
        if (StringUtils.isValidString(str)) {
            a(Collections.singletonList(str));
        } else {
            a((List) null);
        }
    }

    public List b() {
        return this.f8860c;
    }

    public boolean c() {
        return this.f8859b;
    }

    public boolean d() {
        List list = this.f8860c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void a(List list) {
        if (list == null && this.f8860c == null) {
            return;
        }
        if (list == null || !list.equals(this.f8860c)) {
            this.f8860c = list;
            e();
        }
    }

    public void a() {
        this.f8858a.b(z4.I, Boolean.TRUE);
    }

    public void a(JSONObject jSONObject) {
        if (this.f8859b) {
            return;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray());
        com.applovin.impl.sdk.l lVarA = this.f8858a.A();
        boolean zU = lVarA.U();
        String strA = lVarA.f().a();
        l.b bVarH = lVarA.H();
        this.f8859b = zU || JsonUtils.containsCaseInsensitiveString(strA, jSONArray) || JsonUtils.containsCaseInsensitiveString(bVarH != null ? bVarH.f10753a : null, jSONArray);
    }
}
