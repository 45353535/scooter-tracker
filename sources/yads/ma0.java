package yads;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ma0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f83 f113354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qe2 f113355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y53 f113356c;

    public ma0(f83 f83Var, qe2 qe2Var, y53 y53Var) {
        this.f113354a = f83Var;
        this.f113355b = qe2Var;
        this.f113356c = y53Var;
    }

    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) throws JSONException, mz1 {
        List listBuild;
        String strOptString = jSONObject.optString("type");
        if (strOptString == null || strOptString.length() == 0 || Intrinsics.areEqual(strOptString, "null")) {
            throw new mz1("Native Ad json has not required attributes");
        }
        this.f113354a.getClass();
        String strA = f83.a("fallbackUrl", jSONObject);
        this.f113356c.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("fallbackTrackingUrls");
        JSONArray jSONArray = null;
        List listA = jSONArrayOptJSONArray == null ? null : y53.a(jSONArrayOptJSONArray);
        if (jSONObject.has("preferredPackages")) {
            jSONArray = jSONObject.getJSONArray("preferredPackages");
        } else if (jSONObject.has("preferredLinks")) {
            jSONArray = jSONObject.getJSONArray("preferredLinks");
        }
        qe2 qe2Var = this.f113355b;
        qe2Var.getClass();
        if (jSONArray == null) {
            listBuild = CollectionsKt.emptyList();
        } else {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    listCreateListBuilder.add(qe2Var.f114977a.a(jSONObjectOptJSONObject));
                }
            }
            listBuild = CollectionsKt.build(listCreateListBuilder);
        }
        return new ja0(strOptString, strA, listA, listBuild);
    }
}
