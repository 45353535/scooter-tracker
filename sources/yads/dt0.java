package yads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class dt0 implements ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g31 f110050a;

    public dt0(g31 g31Var) {
        this.f110050a = g31Var;
    }

    @Override // yads.ti
    public final Object a(JSONObject jSONObject) throws JSONException, mz1 {
        d31 d31VarA;
        if (!jSONObject.has("value")) {
            boolean z10 = lb1.f113032a;
            throw new mz1("Native Ad json has not required attributes");
        }
        if (jSONObject.isNull("value")) {
            d31VarA = null;
        } else {
            g31 g31Var = this.f110050a;
            g31Var.getClass();
            if (!jSONObject.has("value") || jSONObject.isNull("value")) {
                boolean z11 = lb1.f113032a;
                throw new mz1("Native Ad json has not required attributes");
            }
            d31VarA = g31Var.f111049a.a(jSONObject.getJSONObject("value"));
        }
        return new bt0(d31VarA);
    }
}
