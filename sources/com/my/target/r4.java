package com.my.target;

import android.content.Context;
import com.my.target.e6;
import com.my.target.h6;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class r4 extends q implements e6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f60715a;

    public static void b(JSONObject jSONObject, u uVar, j jVar, n nVar, Context context) {
        u uVarA = a0.a(uVar, jVar, context).a(jSONObject, nVar);
        if (uVarA != null) {
            uVar.a(uVarA);
        }
    }

    public static q a() {
        return new r4();
    }

    @Override // com.my.target.e6.a
    public t a(JSONObject jSONObject, u uVar, j jVar, n nVar, Context context) {
        e4 e4VarA = f4.a(uVar, jVar, context).a(jSONObject, this.f60715a, nVar);
        if (e4VarA == null) {
            nVar.a(m.f60113r);
            return null;
        }
        t4 t4VarD = t4.d();
        t4VarD.a(e4VarA);
        return t4VarD;
    }

    @Override // com.my.target.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t4 a(String str, u uVar, t4 t4Var, j jVar, h6.a aVar, h6 h6Var, List list, n nVar, Context context) {
        if (q.b(str)) {
            return a(str, uVar, jVar, t4Var, nVar);
        }
        return a(str, uVar, t4Var, jVar, aVar, h6Var, list, nVar, context);
    }

    public final t4 a(String str, u uVar, t4 t4Var, j jVar, h6.a aVar, h6 h6Var, List list, n nVar, Context context) {
        JSONObject jSONObjectOptJSONObject;
        x5 x5VarB;
        JSONObject jSONObjectA = q.a(str, aVar, h6Var, list, nVar);
        if (jSONObjectA == null) {
            nVar.a(m.f60105j);
            return t4Var;
        }
        if (t4Var == null) {
            t4Var = t4.d();
        }
        this.f60715a = jSONObjectA.optString("mraid.js");
        JSONObject jSONObjectA2 = a(jSONObjectA, jVar.h());
        if (jSONObjectA2 == null) {
            if (jVar.k() && (jSONObjectOptJSONObject = jSONObjectA.optJSONObject("mediation")) != null && (x5VarB = e6.a(this, uVar, jVar, context).b(jSONObjectOptJSONObject, nVar)) != null) {
                t4Var.a(x5VarB);
            }
            nVar.a(m.f60108m);
            return t4Var;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectA2.optJSONArray("banners");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(0);
            if (jSONObjectOptJSONObject2 != null) {
                if ("additionalData".equals(jSONObjectOptJSONObject2.optString("type", ""))) {
                    b(jSONObjectOptJSONObject2, uVar, jVar, nVar, context);
                    return t4Var;
                }
                e4 e4VarA = f4.a(uVar, jVar, context).a(jSONObjectOptJSONObject2, this.f60715a, nVar);
                if (e4VarA != null) {
                    t4Var.a(e4VarA);
                }
            }
            return t4Var;
        }
        nVar.a(m.f60113r);
        return t4Var;
    }

    public final t4 a(String str, u uVar, j jVar, t4 t4Var, n nVar) {
        nb nbVarA = nb.a(jVar, uVar);
        nbVarA.c(str);
        if (!nbVarA.c().isEmpty()) {
            return a(t4Var, nbVarA, uVar);
        }
        nVar.a(m.f60107l);
        return t4Var;
    }

    public final t4 a(t4 t4Var, nb nbVar, u uVar) {
        e4 e4VarA;
        if (t4Var == null) {
            t4Var = t4.d();
        }
        int i10 = 0;
        s5 s5Var = (s5) nbVar.c().get(0);
        o4 o4VarY = o4.Y();
        o4VarY.f(s5Var.i());
        o4VarY.a(s5Var);
        o4VarY.e(1);
        o4VarY.q(s5Var.B());
        o4VarY.e(s5Var.h());
        o4VarY.a(uVar.a());
        Boolean boolD = uVar.d();
        if (boolD != null) {
            s5Var.e(boolD.booleanValue());
        }
        Boolean boolF = uVar.f();
        if (boolF != null) {
            s5Var.f(boolF.booleanValue());
        }
        Boolean boolG = uVar.g();
        if (boolG != null) {
            s5Var.g(boolG.booleanValue());
        }
        Boolean boolQ = uVar.q();
        if (boolQ != null) {
            o4VarY.b(boolQ.booleanValue());
        }
        Boolean boolX = uVar.x();
        if (boolX != null) {
            o4VarY.d(boolX.booleanValue());
        }
        float fE = uVar.e();
        if (fE >= 0.0f) {
            s5Var.c(fE);
        }
        o4VarY.x().a(s5Var.x().b("click").f59176a);
        o4VarY.x().a(s5Var.x().b("ctaClick").f59176a);
        t4Var.a(o4VarY);
        if (o4VarY.u() == null) {
            o4VarY.a(s5Var.u());
        }
        ArrayList arrayListP = s5Var.P();
        int size = arrayListP.size();
        while (true) {
            if (i10 >= size) {
                break;
            }
            Object obj = arrayListP.get(i10);
            i10++;
            k1 k1Var = (k1) obj;
            if (k1Var.R() != null) {
                e4VarA = j4.a(k1Var);
            } else {
                e4VarA = k1Var.U() != null ? l4.a(k1Var) : null;
            }
            if (e4VarA != null) {
                o4VarY.a(e4VarA);
                break;
            }
        }
        return t4Var;
    }

    public final JSONObject a(JSONObject jSONObject, String str) {
        if (!"fullscreen".equals(str) && !"rewarded".equals(str)) {
            return jSONObject.optJSONObject(str);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("fullscreen");
        return jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject : jSONObject.optJSONObject("rewarded");
    }
}
