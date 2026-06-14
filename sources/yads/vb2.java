package yads;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class vb2 implements i93 {
    @Override // yads.i93
    public final String a(String str, JSONObject jSONObject) throws mz1 {
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || strOptString.length() == 0 || Intrinsics.areEqual(strOptString, "null")) {
            throw new mz1("Native Ad json has not required attributes");
        }
        return strOptString;
    }
}
