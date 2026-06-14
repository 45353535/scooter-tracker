package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.N6;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f59586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f59587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f59588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f59589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final db f59590e;

    public interface a {
        t a(JSONObject jSONObject, u uVar, j jVar, n nVar, Context context);
    }

    public e6(a aVar, u uVar, j jVar, Context context) {
        this.f59586a = aVar;
        this.f59587b = uVar;
        this.f59588c = jVar;
        this.f59589d = context;
        this.f59590e = db.a(uVar, jVar, context);
    }

    public static e6 a(a aVar, u uVar, j jVar, Context context) {
        return new e6(aVar, uVar, jVar, context);
    }

    public x5 b(JSONObject jSONObject, n nVar) {
        y5 y5VarA;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(N6.E1);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            nVar.a(m.f60116u);
            return null;
        }
        x5 x5VarC = x5.c();
        int iOptInt = jSONObject.optInt("refreshTimeout", x5VarC.a());
        if (iOptInt >= 0) {
            x5VarC.a(iOptInt);
        } else {
            a("Bad value", "refreshTimeout < 0");
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null && (y5VarA = a(jSONObjectOptJSONObject, nVar)) != null) {
                x5VarC.a(y5VarA);
            }
        }
        if (x5VarC.b()) {
            return x5VarC;
        }
        nVar.a(m.f60116u);
        return null;
    }

    public final y5 a(JSONObject jSONObject, n nVar) {
        JSONObject jSONObjectOptJSONObject;
        String strOptString = jSONObject.optString("name");
        if (TextUtils.isEmpty(strOptString)) {
            a("Required field", "no name in mediationAdNetwork");
            return null;
        }
        String strOptString2 = jSONObject.optString("placementId");
        if (TextUtils.isEmpty(strOptString2)) {
            a("Required field", "no placementId for " + strOptString + " mediationAdNetwork");
            return null;
        }
        String strOptString3 = jSONObject.optString(N6.G1);
        if (TextUtils.isEmpty(strOptString3)) {
            a("Required field", "no adapter for " + strOptString + " mediationAdNetwork");
            return null;
        }
        y5 y5VarA = y5.a(strOptString, strOptString2, strOptString3);
        if (y5VarA.j() && (jSONObjectOptJSONObject = jSONObject.optJSONObject("banner")) != null) {
            y5VarA.a(this.f59586a.a(jSONObjectOptJSONObject, this.f59587b, this.f59588c, nVar, this.f59589d));
        }
        String strOptString4 = jSONObject.optString("payload");
        if (!TextUtils.isEmpty(strOptString4)) {
            y5VarA.a(strOptString4);
        }
        int iOptInt = jSONObject.optInt("timeout", y5VarA.i());
        if (iOptInt > 0) {
            y5VarA.a(iOptInt);
        } else {
            a("Bad value", "timeout <= 0 for " + strOptString + " mediationAdNetwork");
        }
        y5VarA.a((float) jSONObject.optDouble(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, y5VarA.f()));
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("params");
        if (jSONObjectOptJSONObject2 != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next)) {
                    y5VarA.a(next, jSONObjectOptJSONObject2.optString(next));
                }
            }
        }
        this.f59590e.a(y5VarA.h(), jSONObject, strOptString, -1.0f);
        return y5VarA;
    }

    public final void a(String str, String str2) {
        String str3 = this.f59587b.f60845a;
        q5 q5VarA = q5.a(str).f(str2).a(this.f59588c.i());
        if (str3 == null) {
            str3 = this.f59587b.f60846b;
        }
        q5VarA.c(str3).b(this.f59589d);
    }
}
