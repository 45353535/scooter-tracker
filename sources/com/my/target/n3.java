package com.my.target;

import android.content.Context;
import com.my.target.h6;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class n3 extends q {
    @Override // com.my.target.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p3 a(String str, u uVar, p3 p3Var, j jVar, h6.a aVar, h6 h6Var, List list, n nVar, Context context) {
        return q.b(str) ? a(str, uVar, p3Var, jVar, nVar) : a(str, uVar, p3Var, jVar, aVar, h6Var, list, nVar, context);
    }

    public static q a() {
        return new n3();
    }

    public static p3 a(String str, u uVar, p3 p3Var, j jVar, n nVar) {
        nb nbVarA = nb.a(jVar, uVar);
        nbVarA.c(str);
        String strU = uVar.u();
        if (strU == null) {
            strU = "preroll";
        }
        if (p3Var == null) {
            p3Var = p3.e();
        }
        v5 v5VarA = p3Var.a(strU);
        if (v5VarA != null) {
            if (!nbVarA.c().isEmpty()) {
                a(nbVarA, v5VarA, uVar);
                return p3Var;
            }
            nVar.a(m.f60107l);
            u uVarD = nbVarA.d();
            if (uVarD != null) {
                uVarD.e(v5VarA.h());
                int iA = uVar.A();
                if (iA >= 0) {
                    uVarD.d(iA);
                } else {
                    uVarD.d(v5VarA.a());
                }
                v5VarA.a(uVarD);
            }
        }
        return p3Var;
    }

    public static void a(nb nbVar, v5 v5Var, u uVar) {
        int iA = uVar.A();
        ArrayList arrayListC = nbVar.c();
        int size = arrayListC.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListC.get(i10);
            i10++;
            s5 s5Var = (s5) obj;
            float fE = uVar.e();
            if (fE >= 0.0f) {
                s5Var.c(fE);
            }
            c cVarA = uVar.a();
            if (cVarA != null) {
                s5Var.a(cVarA);
            }
            String strB = uVar.b();
            if (strB != null) {
                s5Var.a(strB);
            }
            Boolean boolD = uVar.d();
            if (boolD != null) {
                s5Var.e(boolD.booleanValue());
            }
            Boolean boolF = uVar.f();
            if (boolF != null) {
                s5Var.f(boolF.booleanValue());
            }
            Boolean boolH = uVar.h();
            if (boolH != null) {
                s5Var.h(boolH.booleanValue());
            }
            Boolean boolI = uVar.i();
            if (boolI != null) {
                s5Var.i(boolI.booleanValue());
            }
            Boolean boolJ = uVar.j();
            if (boolJ != null) {
                s5Var.j(boolJ.booleanValue());
            }
            Boolean boolQ = uVar.q();
            if (boolQ != null) {
                s5Var.b(boolQ.booleanValue());
            }
            Boolean boolX = uVar.x();
            if (boolX != null) {
                s5Var.d(boolX.booleanValue());
            }
            Boolean boolG = uVar.g();
            if (boolG != null) {
                s5Var.g(boolG.booleanValue());
            }
            s5Var.u("Close");
            float fY = uVar.y();
            if (fY >= 0.0f) {
                s5Var.d(fY);
            }
            float fZ = uVar.z();
            if (fZ >= 0.0f) {
                s5Var.e(fZ);
            }
            if (iA >= 0) {
                v5Var.a(s5Var, iA);
                iA++;
            } else {
                v5Var.a(s5Var);
            }
        }
    }

    public static p3 a(String str, u uVar, p3 p3Var, j jVar, h6.a aVar, h6 h6Var, List list, n nVar, Context context) {
        JSONObject jSONObjectA = q.a(str, aVar, h6Var, list, nVar);
        if (jSONObjectA == null) {
            nVar.a(m.f60105j);
            return p3Var;
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(jVar.h());
        if (jSONObjectOptJSONObject == null) {
            nVar.a(m.f60108m);
            return p3Var;
        }
        if (p3Var == null) {
            p3Var = p3.e();
        }
        q3.a().a(jSONObjectOptJSONObject, p3Var);
        a0 a0VarA = a0.a(uVar, jVar, context);
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("sections");
        if (jSONObjectOptJSONObject2 == null) {
            nVar.a(m.f60104i);
            return p3Var;
        }
        String strU = uVar.u();
        if (strU != null) {
            v5 v5VarA = p3Var.a(strU);
            if (v5VarA != null) {
                a(jSONObjectOptJSONObject2, a0VarA, v5VarA, g0.a(uVar, jVar, context), uVar, nVar);
                return p3Var;
            }
        } else {
            ArrayList arrayListC = p3Var.c();
            int size = arrayListC.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayListC.get(i10);
                i10++;
                a(jSONObjectOptJSONObject2, a0VarA, (v5) obj, g0.a(uVar, jVar, context), uVar, nVar);
            }
        }
        return p3Var;
    }

    public static void a(JSONObject jSONObject, a0 a0Var, v5 v5Var, g0 g0Var, u uVar, n nVar) {
        a0 a0Var2;
        v5 v5Var2;
        u uVar2;
        n nVar2;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(v5Var.h());
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        int iA = uVar.A();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (i10 < jSONArrayOptJSONArray.length()) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject == null) {
                a0Var2 = a0Var;
                v5Var2 = v5Var;
                uVar2 = uVar;
                nVar2 = nVar;
            } else if ("additionalData".equals(jSONObjectOptJSONObject.optString("type"))) {
                a0Var2 = a0Var;
                v5Var2 = v5Var;
                uVar2 = uVar;
                nVar2 = nVar;
                a(uVar2, a0Var2, jSONObjectOptJSONObject, v5Var2, arrayList2, arrayList, nVar2);
            } else {
                a0Var2 = a0Var;
                v5Var2 = v5Var;
                uVar2 = uVar;
                nVar2 = nVar;
                s5 s5VarL0 = s5.l0();
                if (g0Var.b(jSONObjectOptJSONObject, s5VarL0)) {
                    if (uVar2.H()) {
                        s5VarL0.d(uVar2.y());
                        s5VarL0.e(uVar2.z());
                    }
                    if (iA >= 0) {
                        v5Var2.a(s5VarL0, iA);
                        iA++;
                    } else {
                        v5Var2.a(s5VarL0);
                    }
                }
            }
            i10++;
            uVar = uVar2;
            a0Var = a0Var2;
            v5Var = v5Var2;
            nVar = nVar2;
        }
        a(arrayList2, arrayList);
    }

    public static void a(u uVar, a0 a0Var, JSONObject jSONObject, v5 v5Var, ArrayList arrayList, ArrayList arrayList2, n nVar) {
        u uVarA = a0Var.a(jSONObject, nVar);
        if (uVarA == null) {
            return;
        }
        uVarA.e(v5Var.h());
        if (uVarA.r() != -1) {
            arrayList2.add(uVarA);
            return;
        }
        arrayList.add(uVarA);
        if (!uVarA.H() && !uVarA.F()) {
            uVar.a(uVarA);
            int iA = uVar.A();
            if (iA >= 0) {
                uVarA.d(iA);
            } else {
                uVarA.d(v5Var.a());
            }
        }
        v5Var.a(uVarA);
    }

    private static void a(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            u uVar = (u) obj;
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 < size2) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    u uVar2 = (u) obj2;
                    if (uVar.r() == uVar2.s()) {
                        uVar2.b(uVar);
                        break;
                    }
                }
            }
        }
    }
}
