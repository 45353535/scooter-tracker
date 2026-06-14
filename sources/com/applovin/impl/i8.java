package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.ironsource.C4418ld;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u2 f9094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a4 f9095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f9096c;

    public i8(JSONObject jSONObject, MaxAdFormat maxAdFormat, e3 e3Var, com.applovin.impl.sdk.k kVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f9095b = new a4(jSONObject2, kVar);
        } else {
            this.f9095b = null;
        }
        this.f9094a = new u2(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, e3Var);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, C4418ld.f43559c, new JSONArray());
        this.f9096c = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f9096c.add(new a4(jSONObject3, kVar));
            }
        }
    }

    public a4 a() {
        return this.f9095b;
    }

    public u2 b() {
        return this.f9094a;
    }

    public List c() {
        return this.f9096c;
    }

    public boolean d() {
        return this.f9095b != null;
    }
}
