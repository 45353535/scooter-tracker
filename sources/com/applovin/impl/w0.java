package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class w0 extends v0 {
    public w0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, kVar);
    }

    public List f() {
        x0 x0VarA;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f11109b, "transitions", null);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject != null && (x0VarA = x0.a(jSONObject, this.f11108a)) != null) {
                arrayList.add(x0VarA);
            }
        }
        return arrayList;
    }

    public String g() {
        return b(PglCryptUtils.KEY_MESSAGE);
    }

    public String h() {
        return b("title");
    }

    @Override // com.applovin.impl.v0
    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + ", title=" + h() + ", message=" + g() + ", actions=" + f() + "}";
    }
}
