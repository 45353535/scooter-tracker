package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class w9 extends db {
    public w9(u uVar, j jVar, Context context) {
        super(uVar, jVar, context);
    }

    public static w9 b(u uVar, j jVar, Context context) {
        return new w9(uVar, jVar, context);
    }

    @Override // com.my.target.db
    public ya a(JSONObject jSONObject, float f10) {
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            a("Required field", "failed to parse stat: no type or url");
            return null;
        }
        strOptString.getClass();
        switch (strOptString) {
            case "playheadTimerValue":
                return a(jSONObject, strOptString2);
            case "playheadViewabilityValue":
                return b(jSONObject, strOptString2);
            case "playheadReachedValue":
                w8 w8VarA = super.a(jSONObject, strOptString2, f10, i0.f59838d);
                if (w8VarA == null || w8VarA.e() < 0.0f) {
                    return null;
                }
                return w8VarA;
            default:
                return super.a(jSONObject, f10);
        }
    }

    public final ya b(JSONObject jSONObject, String str) {
        int iOptInt = jSONObject.optInt("viewablePercent", -1);
        if (iOptInt < 0 || iOptInt > 100) {
            a("Bad value", "failed to parse viewabilityStat: invalid viewable percent value");
            return null;
        }
        int iOptInt2 = jSONObject.optInt("duration", -1);
        if (iOptInt2 < 0) {
            return null;
        }
        int iOptInt3 = jSONObject.optInt("startTimer", 0);
        int iOptInt4 = jSONObject.optInt("endTimer", 0);
        if (iOptInt3 < 0) {
            a("Bad value", "failed to parse viewabilityStat: wrong start timer " + iOptInt3);
            return null;
        }
        if (iOptInt4 < 0) {
            a("Bad value", "failed to parse viewabilityStat: wrong end timer " + iOptInt3);
            return null;
        }
        if (iOptInt4 == 0 || iOptInt3 < iOptInt4) {
            y9 y9VarA = y9.a(str, iOptInt2, iOptInt, jSONObject.optBoolean("mrc", true));
            y9VarA.b(iOptInt3);
            y9VarA.a(iOptInt4);
            return y9VarA;
        }
        a("Bad value", "failed to parse viewabilityStat: start timer (" + iOptInt3 + ") cannot be less than end timer (" + iOptInt4 + ")");
        return null;
    }

    public final ya a(JSONObject jSONObject, String str) {
        if (!str.contains(com.taurusx.tax.n.z.f66399y)) {
            a("Required field", "failed to parse researchTimerStat: no [CONTENTPLAYHEAD] macros");
            return null;
        }
        int iOptInt = jSONObject.optInt("startTimer", 0);
        int iOptInt2 = jSONObject.optInt("endTimer", 0);
        if (iOptInt < 0) {
            a("Bad value", "failed to parse researchTimerStat: wrong start timer " + iOptInt);
            return null;
        }
        if (iOptInt2 < 0) {
            a("Bad value", "failed to parse researchTimerStat: wrong end timer " + iOptInt);
            return null;
        }
        if (iOptInt2 != 0 && iOptInt >= iOptInt2) {
            a("Bad value", "failed to parse researchTimerStat: start timer (" + iOptInt + ") cannot be less than end timer (" + iOptInt + ")");
            return null;
        }
        x9 x9VarA = x9.a(str);
        x9VarA.b(jSONObject.optInt("rate", 1));
        x9VarA.c(iOptInt);
        x9VarA.a(iOptInt2);
        return x9VarA;
    }
}
