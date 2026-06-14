package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.flow.x0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends c {
    public r(x0 x0Var, com.fyber.inneractive.sdk.model.vast.c cVar, int i10) {
        super(x0Var, cVar, i10);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(JSONArray jSONArray) {
        this.f20647b = jSONArray;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final n c() {
        return new u(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean k() {
        JSONArray jSONArray = this.f20647b;
        return jSONArray != null && jSONArray.length() > 0;
    }
}
