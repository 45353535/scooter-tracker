package com.my.target;

import android.content.Context;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.my.target.e6;
import com.my.target.h6;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class b8 extends q implements e6.a {
    public static q a() {
        return new b8();
    }

    @Override // com.my.target.e6.a
    public t a(JSONObject jSONObject, u uVar, j jVar, n nVar, Context context) {
        o7 o7VarF = o7.f();
        g1 g1VarA = g1.a(uVar, jVar, context);
        String[] strArrA = g1VarA.a(jSONObject, p.a(jVar.a()).a("<mediationBanner>"));
        String str = strArrA[0];
        if (str == null) {
            str = "<no-banner-id>";
        }
        b7 b7VarA = b7.a(jVar.a().a(str, strArrA[1]));
        g1VarA.a(jSONObject, b7VarA);
        o7VarF.a(b7VarA);
        return o7VarF;
    }

    @Override // com.my.target.q
    public o7 a(String str, u uVar, o7 o7Var, j jVar, h6.a aVar, h6 h6Var, List list, n nVar, Context context) {
        p pVarA = p.a(jVar.a());
        o7 o7VarA = a(str, uVar, o7Var, jVar, aVar, h6Var, list, nVar, pVarA, context);
        if (o7VarA != null) {
            a(o7VarA, pVarA);
        }
        return o7VarA;
    }

    private o7 a(String str, u uVar, o7 o7Var, j jVar, h6.a aVar, h6 h6Var, List list, n nVar, p pVar, Context context) {
        o7 o7Var2;
        char c10;
        JSONObject jSONObjectOptJSONObject;
        pVar.b(3000);
        JSONObject jSONObjectA = q.a(str, aVar, h6Var, list, nVar, pVar);
        o7 o7Var3 = null;
        if (jSONObjectA == null) {
            nVar.a(m.f60105j);
            return null;
        }
        o7 o7VarF = o7Var == null ? o7.f() : o7Var;
        JSONObject jSONObjectOptJSONObject2 = jSONObjectA.optJSONObject(jVar.h());
        if (jSONObjectOptJSONObject2 == null) {
            if (jVar.k() && (jSONObjectOptJSONObject = jSONObjectA.optJSONObject("mediation")) != null) {
                x5 x5VarB = e6.a(this, uVar, jVar, context).b(jSONObjectOptJSONObject, nVar);
                if (x5VarB != null) {
                    o7VarF.a(x5VarB);
                    return o7VarF;
                }
            }
            nVar.a(m.f60108m);
            pVar.a(jVar.h()).a(AuthApiStatusCodes.AUTH_APP_CERT_ERROR, "Section-format is not found");
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("banners");
        p pVarA = pVar.a("banners");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            g1 g1VarA = g1.a(uVar, jVar, context);
            int iC = jVar.c();
            if (iC > 0) {
                int length = jSONArrayOptJSONArray.length();
                if (iC > length) {
                    iC = length;
                }
            } else {
                iC = 1;
            }
            int i10 = 0;
            while (i10 < iC) {
                p pVarC = pVarA.c(i10);
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject3 != null) {
                    String[] strArrA = g1VarA.a(jSONObjectOptJSONObject3, pVarC);
                    String string = strArrA[0];
                    o7Var2 = o7Var3;
                    if (string != null) {
                        c10 = 1;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        c10 = 1;
                        sb2.append("<no-banner-id");
                        sb2.append(i10);
                        sb2.append(">");
                        string = sb2.toString();
                    }
                    h0 h0VarA = jVar.a().a(string, strArrA[c10]);
                    b7 b7VarA = b7.a(h0VarA);
                    g1VarA.a(jSONObjectOptJSONObject3, b7VarA, pVarC.a(h0VarA));
                    o7VarF.a(b7VarA);
                } else {
                    o7Var2 = o7Var3;
                    pVarC.d(3007);
                }
                i10++;
                o7Var3 = o7Var2;
            }
            o7 o7Var4 = o7Var3;
            if (o7VarF.a() > 0) {
                return o7VarF;
            }
            nVar.a(m.f60104i);
            pVar.a(3008, "getBannersCount()==" + o7VarF.a());
            return o7Var4;
        }
        nVar.a(m.f60113r);
        pVarA.a(AuthApiStatusCodes.AUTH_APP_CERT_ERROR, "Property is not found");
        return null;
    }

    private boolean a(o7 o7Var, p pVar) {
        int i10 = 0;
        boolean zA = true;
        for (b7 b7Var : o7Var.c()) {
            int i11 = i10 + 1;
            zA &= b7Var.x().a(pVar.a("<banner>").c(i10).a(b7Var.d()).a("<stats>"));
            i10 = i11;
        }
        return zA;
    }
}
