package yads;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class f83 {
    public static String a(String str, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || strOptString.length() == 0 || Intrinsics.areEqual(strOptString, "null")) {
            throw new mz1("Native Ad json has not required attributes");
        }
        if (strOptString.length() != 0) {
            return strOptString;
        }
        throw new mz1("Native Ad json has not required attributes");
    }
}
