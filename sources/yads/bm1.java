package yads;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class bm1 implements ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk1 f109052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mf3 f109053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w21 f109054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j31 f109055d;

    public bm1(zk1 zk1Var, mf3 mf3Var, w21 w21Var, j31 j31Var) {
        this.f109052a = zk1Var;
        this.f109053b = mf3Var;
        this.f109054c = w21Var;
        this.f109055d = j31Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    @Override // yads.ti
    public final Object a(JSONObject jSONObject) throws JSONException, mz1 {
        ?? MutableListOf;
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            boolean z10 = lb1.f113032a;
            throw new mz1("Native Ad json has not required attributes");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        ai1 ai1Var = (ai1) ((!jSONObject2.has("media") || jSONObject2.isNull("media")) ? null : this.f109052a.a(jSONObject2.getJSONObject("media")));
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            j31 j31Var = this.f109055d;
            j31Var.getClass();
            MutableListOf = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                MutableListOf.add(j31Var.f112229a.a(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
        } else {
            MutableListOf = 0;
        }
        d31 d31VarA = (!jSONObject2.has("image") || jSONObject2.isNull("image")) ? null : this.f109054c.a(jSONObject2.getJSONObject("image"));
        if ((MutableListOf == 0 || MutableListOf.isEmpty()) && d31VarA != null) {
            MutableListOf = CollectionsKt.mutableListOf(d31VarA);
        }
        gb3 gb3Var = (gb3) ((!jSONObject2.has("video") || jSONObject2.isNull("video")) ? null : this.f109053b.a(jSONObject2.getJSONObject("video")));
        if (ai1Var != null || ((MutableListOf != 0 && !MutableListOf.isEmpty()) || gb3Var != null)) {
            return new am1(ai1Var, gb3Var, MutableListOf != 0 ? CollectionsKt.toMutableList((Collection) MutableListOf) : null);
        }
        boolean z11 = lb1.f113032a;
        throw new mz1("Native Ad json has not required attributes");
    }
}
