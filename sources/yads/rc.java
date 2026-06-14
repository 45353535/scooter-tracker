package yads;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class rc implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f83 f115398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z53 f115399b;

    public rc(f83 f83Var, z53 z53Var) {
        this.f115398a = f83Var;
        this.f115399b = z53Var;
    }

    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) throws JSONException, mz1 {
        String strOptString = jSONObject.optString("type");
        if (strOptString == null || strOptString.length() == 0 || Intrinsics.areEqual(strOptString, "null")) {
            throw new mz1("Native Ad json has not required attributes");
        }
        this.f115398a.getClass();
        String strA = f83.a("url", jSONObject);
        String strA2 = sc1.a("optOutUrl", jSONObject);
        if (strA2 == null) {
            strA2 = "";
        }
        this.f115399b.getClass();
        JSONArray jSONArray = jSONObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        return new pc(strOptString, strA, strA2, arrayList);
    }
}
