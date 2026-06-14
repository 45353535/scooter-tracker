package yads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class g31 implements ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w21 f111049a;

    public /* synthetic */ g31() {
        this(new w21());
    }

    @Override // yads.ti
    public final Object a(JSONObject jSONObject) throws JSONException, mz1 {
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            boolean z10 = lb1.f113032a;
            throw new mz1("Native Ad json has not required attributes");
        }
        return this.f111049a.a(jSONObject.getJSONObject("value"));
    }

    public g31(w21 w21Var) {
        this.f111049a = w21Var;
    }
}
