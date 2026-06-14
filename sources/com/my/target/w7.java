package com.my.target;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.my.target.h6;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class w7 extends q {
    public static q a() {
        return new w7();
    }

    @Override // com.my.target.q
    public y7 a(String str, u uVar, y7 y7Var, j jVar, h6.a aVar, h6 h6Var, List list, n nVar, Context context) {
        u uVar2;
        Context context2;
        JSONObject jSONObjectA = q.a(str, aVar, h6Var, list, nVar);
        if (jSONObjectA == null) {
            nVar.a(m.f60105j);
            return null;
        }
        JSONArray jSONArrayNames = jSONObjectA.names();
        if (jSONArrayNames == null) {
            nVar.a(m.f60104i);
            return null;
        }
        z7 z7VarA = z7.a(uVar, jVar, context);
        boolean z10 = false;
        y7 y7Var2 = null;
        int i10 = 0;
        while (true) {
            if (i10 >= jSONArrayNames.length()) {
                uVar2 = uVar;
                break;
            }
            uVar2 = uVar;
            String strOptString = jSONArrayNames.optString(i10);
            if ("appwall".equals(strOptString) || "showcaseApps".equals(strOptString) || "showcaseGames".equals(strOptString) || "showcase".equals(strOptString)) {
                context2 = context;
                y7 y7VarA = a(strOptString, jSONObjectA, z7VarA, uVar2, jVar, context2);
                if (y7VarA != null && !y7VarA.c().isEmpty()) {
                    z10 = true;
                    y7Var2 = y7VarA;
                    break;
                }
                y7Var2 = y7VarA;
            } else {
                context2 = context;
            }
            i10++;
            uVar = uVar2;
            context = context2;
        }
        if (z10) {
            y7Var2.a(uVar2.E());
            y7Var2.a(jSONObjectA);
            return y7Var2;
        }
        nVar.a(m.f60108m);
        return null;
    }

    public final y7 a(String str, JSONObject jSONObject, z7 z7Var, u uVar, j jVar, Context context) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("banners")) == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        y7 y7VarB = y7.b(str);
        z7Var.a(jSONObjectOptJSONObject, y7VarB);
        t7 t7VarA = t7.a(y7VarB, uVar, jVar, context);
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject2 != null) {
                s7 s7VarH0 = s7.h0();
                t7VarA.a(jSONObjectOptJSONObject2, s7VarH0);
                String strE = s7VarH0.e();
                if (!TextUtils.isEmpty(strE)) {
                    s7VarH0.e(a(context, strE));
                }
                y7VarB.a(s7VarH0);
            }
        }
        return y7VarB;
    }

    public final boolean a(Context context, String str) {
        List<ResolveInfo> listQueryIntentActivities;
        PackageManager packageManager = context.getPackageManager();
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return false;
        }
        try {
            listQueryIntentActivities = packageManager.queryIntentActivities(launchIntentForPackage, 65536);
        } catch (Throwable unused) {
            listQueryIntentActivities = null;
        }
        return (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }
}
