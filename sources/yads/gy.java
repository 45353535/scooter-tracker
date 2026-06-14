package yads;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class gy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p51 f111395a;

    public /* synthetic */ gy() {
        this(new p51());
    }

    public final qt0 a(String str, JSONObject jSONObject) throws JSONException, mz1 {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        p51 p51Var = this.f111395a;
        p51Var.getClass();
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("installedPackages");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i10);
                p51Var.f114560a.getClass();
                if (!p22.a(jSONObject3, "name")) {
                    throw new mz1("Native Ad json has not required attributes");
                }
                String strOptString = jSONObject3.optString("name");
                if (strOptString == null || strOptString.length() == 0 || Intrinsics.areEqual(strOptString, "null")) {
                    throw new mz1("Native Ad json has not required attributes");
                }
                int i11 = rb.f115393b;
                int iOptInt = jSONObject3.optInt("minVersion", 0);
                if (iOptInt < 0) {
                    iOptInt = 0;
                }
                int i12 = Integer.MAX_VALUE;
                int iOptInt2 = jSONObject3.optInt("maxVersion", Integer.MAX_VALUE);
                if (iOptInt2 >= 0) {
                    i12 = iOptInt2;
                }
                arrayList.add(new n51(iOptInt, i12, strOptString));
            }
        }
        return new qt0(arrayList);
    }

    public gy(p51 p51Var) {
        this.f111395a = p51Var;
    }
}
