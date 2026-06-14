package com.my.target;

import android.content.Context;
import com.my.target.h6;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class f3 extends q {
    @Override // com.my.target.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h3 a(String str, u uVar, h3 h3Var, j jVar, h6.a aVar, h6 h6Var, List list, n nVar, Context context) {
        return q.b(str) ? a(str, uVar, h3Var, jVar, nVar) : a(str, uVar, h3Var, jVar, aVar, h6Var, list, nVar, context);
    }

    public static q a() {
        return new f3();
    }

    public static h3 a(String str, u uVar, h3 h3Var, j jVar, n nVar) {
        nb nbVarA = nb.a(jVar, uVar);
        nbVarA.c(str);
        String strU = uVar.u();
        if (strU == null) {
            strU = "preroll";
        }
        if (h3Var == null) {
            h3Var = h3.e();
        }
        w3 w3VarA = h3Var.a(strU);
        if (w3VarA != null) {
            if (!nbVarA.c().isEmpty()) {
                a(nbVarA, w3VarA, uVar);
                return h3Var;
            }
            nVar.a(m.f60107l);
            u uVarD = nbVarA.d();
            if (uVarD != null) {
                uVarD.e(w3VarA.h());
                int iA = uVar.A();
                if (iA >= 0) {
                    uVarD.d(iA);
                } else {
                    uVarD.d(w3VarA.a());
                }
                w3VarA.a(uVarD);
            }
        }
        return h3Var;
    }

    public static void a(nb nbVar, w3 w3Var, u uVar) {
        int iA = uVar.A();
        ArrayList arrayListC = nbVar.c();
        int size = arrayListC.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListC.get(i10);
            i10++;
            s5 s5Var = (s5) obj;
            Boolean boolD = uVar.d();
            if (boolD != null) {
                s5Var.e(boolD.booleanValue());
            }
            Boolean boolF = uVar.f();
            if (boolF != null) {
                s5Var.f(boolF.booleanValue());
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
            float fE = uVar.e();
            if (fE >= 0.0f) {
                s5Var.c(fE);
            }
            s5Var.u("Close");
            s5Var.d(uVar.y());
            s5Var.e(uVar.z());
            if (iA >= 0) {
                w3Var.a(s5Var, iA);
                iA++;
            } else {
                w3Var.a(s5Var);
            }
        }
    }

    public static h3 a(String str, u uVar, h3 h3Var, j jVar, h6.a aVar, h6 h6Var, List list, n nVar, Context context) {
        JSONObject jSONObjectA = q.a(str, aVar, h6Var, list, nVar);
        if (jSONObjectA == null) {
            nVar.a(m.f60105j);
            return h3Var;
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(jVar.h());
        if (jSONObjectOptJSONObject == null) {
            nVar.a(m.f60108m);
            return h3Var;
        }
        if (h3Var == null) {
            h3Var = h3.e();
        }
        i3.a().a(jSONObjectOptJSONObject, h3Var);
        a0 a0VarA = a0.a(uVar, jVar, context);
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("sections");
        if (jSONObjectOptJSONObject2 == null) {
            nVar.a(m.f60104i);
            return h3Var;
        }
        String strU = uVar.u();
        if (strU != null) {
            w3 w3VarA = h3Var.a(strU);
            if (w3VarA != null) {
                a(jSONObjectOptJSONObject2, a0VarA, w3VarA, j1.a(uVar, jVar, context), i1.a(uVar, jVar, context), uVar, nVar);
                return h3Var;
            }
        } else {
            ArrayList arrayListC = h3Var.c();
            int size = arrayListC.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayListC.get(i10);
                i10++;
                a(jSONObjectOptJSONObject2, a0VarA, (w3) obj, j1.a(uVar, jVar, context), i1.a(uVar, jVar, context), uVar, nVar);
            }
        }
        return h3Var;
    }

    public static void a(JSONObject jSONObject, a0 a0Var, w3 w3Var, j1 j1Var, i1 i1Var, u uVar, n nVar) {
        int i10;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(w3Var.h());
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        int iA = uVar.A();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("type");
                if ("additionalData".equals(strOptString)) {
                    a(uVar, a0Var, jSONObjectOptJSONObject, w3Var, arrayList2, arrayList, nVar);
                } else if ("video-motion".equals(strOptString)) {
                    tb tbVarL0 = tb.l0();
                    if (i1Var.a(jSONObjectOptJSONObject, tbVarL0)) {
                        float fY = uVar.y();
                        if (fY >= 0.0f) {
                            tbVarL0.d(fY);
                        }
                        float fZ = uVar.z();
                        if (fZ >= 0.0f) {
                            tbVarL0.e(fZ);
                        }
                        if (iA >= 0) {
                            i10 = iA + 1;
                            w3Var.a(tbVarL0, iA);
                            iA = i10;
                        } else {
                            w3Var.a(tbVarL0);
                        }
                    }
                } else {
                    s5 s5VarN0 = s5.n0();
                    if (j1Var.a(jSONObjectOptJSONObject, s5VarN0, i0.f59838d)) {
                        float fY2 = uVar.y();
                        if (fY2 >= 0.0f) {
                            s5VarN0.d(fY2);
                        }
                        float fZ2 = uVar.z();
                        if (fZ2 >= 0.0f) {
                            s5VarN0.e(fZ2);
                        }
                        if (iA >= 0) {
                            i10 = iA + 1;
                            w3Var.a(s5VarN0, iA);
                            iA = i10;
                        } else {
                            w3Var.a(s5VarN0);
                        }
                    }
                }
            }
        }
        a(arrayList2, arrayList);
    }

    public static void a(u uVar, a0 a0Var, JSONObject jSONObject, w3 w3Var, ArrayList arrayList, ArrayList arrayList2, n nVar) {
        u uVarA = a0Var.a(jSONObject, nVar);
        if (uVarA == null) {
            return;
        }
        uVarA.e(w3Var.h());
        uVarA.a(uVar.a());
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
                uVarA.d(w3Var.a());
            }
        }
        w3Var.a(uVarA);
    }

    public static void a(ArrayList arrayList, ArrayList arrayList2) {
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
