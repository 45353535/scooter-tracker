package yads;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class an implements i93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm f108726a;

    public an(zm zmVar) {
        this.f108726a = zmVar;
    }

    @Override // yads.i93
    public final String a(String str, JSONObject jSONObject) throws mz1 {
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || strOptString.length() == 0 || Intrinsics.areEqual(strOptString, "null")) {
            throw new mz1("Native Ad json has not required attributes");
        }
        this.f108726a.getClass();
        String strB = zm.b(strOptString);
        if (strB == null || strB.length() == 0) {
            throw new mz1("Native Ad json has attribute with broken base64 encoding");
        }
        return strB;
    }
}
