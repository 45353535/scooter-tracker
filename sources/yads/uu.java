package yads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class uu implements ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f83 f116779a;

    public uu(f83 f83Var) {
        this.f116779a = f83Var;
    }

    @Override // yads.ti
    public final Object a(JSONObject jSONObject) throws JSONException, mz1 {
        String str = new String[]{"value"}[0];
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            boolean z10 = lb1.f113032a;
            throw new mz1("Native Ad json has not required attributes");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        String[] strArr = {"url", "size"};
        for (int i10 = 0; i10 < 2; i10++) {
            String str2 = strArr[i10];
            if (!jSONObject2.has(str2) || jSONObject2.isNull(str2)) {
                boolean z11 = lb1.f113032a;
                throw new mz1("Native Ad json has not required attributes");
            }
        }
        this.f116779a.getClass();
        return new tu(jSONObject2.optInt("size"), f83.a("url", jSONObject2));
    }
}
