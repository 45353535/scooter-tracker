package com.my.target;

import android.content.Context;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.my.target.e6;
import com.my.target.h6;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class m7 extends q implements e6.a {
    public static q a() {
        return new m7();
    }

    @Override // com.my.target.e6.a
    public t a(JSONObject jSONObject, u uVar, j jVar, n nVar, Context context) {
        o7 o7VarF = o7.f();
        c7 c7VarA = c7.a(uVar, jVar, context);
        p pVarA = p.a(jVar.a()).a("<mediationBanner>");
        String[] strArrA = c7VarA.a(jSONObject, pVarA);
        String str = strArrA[0];
        if (str == null) {
            str = "<no-banner-id>";
        }
        h0 h0VarA = jVar.a().a(str, strArrA[1]);
        b7 b7VarA = b7.a(h0VarA);
        c7VarA.a(jSONObject, b7VarA, nVar, pVarA.a(h0VarA));
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

    public final o7 a(String str, u uVar, o7 o7Var, j jVar, h6.a aVar, h6 h6Var, List list, n nVar, p pVar, Context context) {
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
        o7VarF.a(jSONObjectA.optLong("timestamp", 0L));
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
            c7 c7VarA = c7.a(uVar, jVar, context);
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
                    String[] strArrA = c7VarA.a(jSONObjectOptJSONObject3, pVarC);
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
                    c7VarA.a(jSONObjectOptJSONObject3, b7VarA, nVar, pVarC.a(h0VarA));
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

    public final boolean a(o7 o7Var, p pVar) {
        boolean zA = true;
        int i10 = 0;
        for (b7 b7Var : o7Var.c()) {
            int i11 = i10 + 1;
            i0 i0VarA = pVar.a("<banner>").c(i10).a(b7Var.d());
            zA &= b7Var.x().a(i0VarA.a("<stats>"));
            Iterator it = b7Var.O().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                zA &= ((d7) it.next()).x().a(i0VarA.a("<card>").b(i12).a("<stats>"));
                i12++;
            }
            s5 s5VarP = b7Var.P();
            if (s5VarP != null) {
                zA &= s5VarP.x().a(i0VarA.a("<videoBanner>").a("<stats>"));
            }
            i10 = i11;
        }
        return zA;
    }
}
