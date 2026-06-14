package yads;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class w72 implements ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final go2 f117337a;

    public w72(go2 go2Var) {
        this.f117337a = go2Var;
    }

    @Override // yads.ti
    public final Object a(JSONObject jSONObject) throws mz1 {
        String strOptString = jSONObject.optString("name");
        if (strOptString == null || strOptString.length() == 0 || Intrinsics.areEqual(strOptString, "null")) {
            throw new mz1("Native Ad json has not required attributes");
        }
        String strOptString2 = jSONObject.optString("value");
        if (strOptString2 == null || strOptString2.length() == 0 || Intrinsics.areEqual(strOptString2, "null")) {
            throw new mz1("Native Ad json has not required attributes");
        }
        return Intrinsics.areEqual("review_count", strOptString) ? this.f117337a.a(strOptString2) : strOptString2;
    }
}
