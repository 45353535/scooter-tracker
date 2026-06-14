package yads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ts0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f83 f116353a;

    public ts0(f83 f83Var) {
        this.f116353a = f83Var;
    }

    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) throws JSONException, mz1 {
        String strOptString = jSONObject.optString("type");
        if (strOptString == null || strOptString.length() == 0 || Intrinsics.areEqual(strOptString, "null")) {
            throw new mz1("Native Ad json has not required attributes");
        }
        JSONArray jSONArray = jSONObject.getJSONArray(FirebaseAnalytics.Param.ITEMS);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            String strOptString2 = jSONObject2.optString("title");
            if (strOptString2 == null || strOptString2.length() == 0 || Intrinsics.areEqual(strOptString2, "null")) {
                throw new mz1("Native Ad json has not required attributes");
            }
            this.f116353a.getClass();
            arrayList.add(new qs0(strOptString2, f83.a("url", jSONObject2)));
        }
        if (arrayList.isEmpty()) {
            throw new mz1("Native Ad json has not required attributes");
        }
        return new rs0(strOptString, arrayList);
    }
}
