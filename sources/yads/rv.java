package yads;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class rv implements ti {
    @Override // yads.ti
    public final Object a(JSONObject jSONObject) throws mz1 {
        if (jSONObject.has("value") && jSONObject.isNull("value")) {
            return new qv(pv.f114793c, null);
        }
        pv pvVar = pv.f114792b;
        String strOptString = jSONObject.optString("value");
        if (strOptString == null || strOptString.length() == 0 || Intrinsics.areEqual(strOptString, "null")) {
            throw new mz1("Native Ad json has not required attributes");
        }
        return new qv(pvVar, strOptString);
    }
}
