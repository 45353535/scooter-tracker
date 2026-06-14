package yads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class lf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j31 f113082a;

    public /* synthetic */ lf0() {
        this(new j31());
    }

    public final gf0 a(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString(TypedValues.AttributesType.S_TARGET);
        String strOptString3 = jSONObject.optString("layout");
        ArrayList arrayList = null;
        if (strOptString == null || strOptString.length() == 0 || strOptString2 == null || strOptString2.length() == 0 || strOptString3 == null || strOptString3.length() == 0) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            j31 j31Var = this.f113082a;
            j31Var.getClass();
            ArrayList arrayList2 = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                arrayList2.add(j31Var.f112229a.a(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            arrayList = arrayList2;
        }
        return new gf0(strOptString, strOptString2, strOptString3, arrayList);
    }

    public lf0(j31 j31Var) {
        this.f113082a = j31Var;
    }
}
