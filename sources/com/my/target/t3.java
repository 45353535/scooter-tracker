package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.h6;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class t3 extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60832a;

    public t3(int i10) {
        this.f60832a = i10;
    }

    public static q a(int i10) {
        return new t3(i10);
    }

    @Override // com.my.target.q
    public u3 a(String str, u uVar, u3 u3Var, j jVar, h6.a aVar, h6 h6Var, List list, n nVar, Context context) {
        JSONObject jSONObjectA = q.a(str, aVar, h6Var, list, nVar);
        if (jSONObjectA == null) {
            nVar.a(m.f60105j);
            return null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(jVar.h());
        if (jSONObjectOptJSONObject == null) {
            nVar.a(m.f60108m);
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("banners");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(0);
            if (jSONObjectOptJSONObject2 == null) {
                nVar.a(m.f60113r);
                return null;
            }
            r3 r3VarL = r3.L();
            String strOptString = jSONObjectOptJSONObject2.optString("id");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObjectOptJSONObject2.optString("bannerID", r3VarL.r());
            }
            r3VarL.k(strOptString);
            String strOptString2 = jSONObjectOptJSONObject2.optString("type");
            if (!TextUtils.isEmpty(strOptString2)) {
                r3VarL.r(strOptString2);
            }
            if (jSONObjectOptJSONObject2.optJSONArray("statistics") != null) {
                w9.b(uVar, jVar, context).a(r3VarL.x(), jSONObjectOptJSONObject2, strOptString, this.f60832a);
            }
            if (!r3VarL.x().c()) {
                nVar.a(m.f60104i);
                return null;
            }
            u3 u3VarD = u3.d();
            u3VarD.a(r3VarL);
            return u3VarD;
        }
        nVar.a(m.f60113r);
        return null;
    }
}
