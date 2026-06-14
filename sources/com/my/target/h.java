package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.my.target.c;
import com.my.target.common.menu.MenuActionType;
import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class h {
    public static h a() {
        return new h();
    }

    public final List b(JSONObject jSONObject, String str, String str2, int i10, boolean z10, i0 i0Var, Context context) {
        int length;
        String str3;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
        if (jSONArrayOptJSONArray == null || (length = jSONArrayOptJSONArray.length()) == 0) {
            return null;
        }
        String strOptString = jSONObject.optString("closeUrl");
        if (strOptString.isEmpty()) {
            str3 = null;
        } else if (lb.e(strOptString)) {
            str3 = strOptString;
        } else {
            a("Bad value", "Invalid closeUrl in adChoices", str, str2, i10, z10, context);
            i0Var.a("closeUrl").a(3007);
            str3 = null;
        }
        i0 i0VarA = i0Var.a("options");
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < length; i11++) {
            c.a aVarA = a(jSONArrayOptJSONArray.optJSONObject(i11), str3, str, str2, i10, z10, i0VarA.b(i11), context);
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final String c(JSONObject jSONObject) {
        return jSONObject.optString("name");
    }

    public final boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean("shouldCloseAd", true);
    }

    public c a(JSONObject jSONObject, String str, String str2, int i10, boolean z10, i0 i0Var, Context context) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("iconLink");
        if (TextUtils.isEmpty(strOptString) || !lb.e(strOptString)) {
            a("Required field", "Invalid iconLink in adChoices", str, str2, i10, z10, context);
            i0 i0VarA = i0Var.a("iconLink");
            if (TextUtils.isEmpty(strOptString)) {
                i0VarA.a(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
            } else {
                i0VarA.a(3007);
            }
            return null;
        }
        String strOptString2 = jSONObject.optString("clickLink");
        if (TextUtils.isEmpty(strOptString2)) {
            i0Var.a("clickLink").a(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
        } else if (!lb.e(strOptString2)) {
            i0Var.a("clickLink").a(3007, strOptString2);
        }
        List listB = b(jSONObject, str, str2, i10, z10, i0Var, context);
        if (listB != null || (!TextUtils.isEmpty(strOptString2) && lb.e(strOptString2))) {
            c cVarA = c.a(ImageData.newImageData(strOptString), strOptString2);
            cVarA.a(listB);
            return cVarA;
        }
        a("Required field", "Invalid clickLink in adChoices", str, str2, i10, z10, context);
        if (!jSONObject.has("options")) {
            i0Var.a("options").a(3007);
        }
        return null;
    }

    public final c.a b(JSONObject jSONObject, String str, String str2, String str3, int i10, boolean z10, i0 i0Var, Context context) {
        String strC = c(jSONObject);
        if (TextUtils.isEmpty(strC)) {
            a("Required field", "Invalid name in adChoices option", str2, str3, i10, z10, context);
            i0Var.a("name").a(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
            return null;
        }
        boolean zD = d(jSONObject);
        String strA = a(jSONObject, str, zD, str2, str3, i10, z10, i0Var, context);
        String strB = b(jSONObject);
        if (TextUtils.isEmpty(strB)) {
            a("Bad value", "AdChoices option hasn't copy text ", str2, str3, i10, z10, context);
            i0Var.a("copyText").a(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
            return null;
        }
        return c.a.a(strC, MenuActionType.COPY, strA, null, strB, a(jSONObject), zD);
    }

    public final c.a a(JSONObject jSONObject, String str, String str2, String str3, int i10, boolean z10, i0 i0Var, Context context) {
        if (jSONObject == null) {
            a("Bad value", "null adChoices option", str2, str3, i10, z10, context);
            i0Var.c(3007);
            return null;
        }
        i0 i0VarA = i0Var.a("type");
        if (!jSONObject.has("type")) {
            a("Bad value", "AdChoices option hasn't type", str2, str3, i10, z10, context);
            i0VarA.a(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
            return null;
        }
        String strOptString = jSONObject.optString("type");
        if (!strOptString.equals("default") && !strOptString.equals(MenuActionType.HIDE) && !strOptString.equals(MenuActionType.COMPLAIN)) {
            if (strOptString.equals(MenuActionType.COPY)) {
                return b(jSONObject, str, str2, str3, i10, z10, i0Var, context);
            }
            a("Required field", "Invalid adChoices option type", str2, str3, i10, z10, context);
            i0VarA.a(3007, strOptString);
            return null;
        }
        return a(jSONObject, strOptString, str, str2, str3, i10, z10, i0Var, context);
    }

    public final String b(JSONObject jSONObject) {
        if (jSONObject.has("copyText")) {
            return jSONObject.optString("copyText");
        }
        return null;
    }

    public final c.a a(JSONObject jSONObject, String str, String str2, String str3, String str4, int i10, boolean z10, i0 i0Var, Context context) {
        String strC = c(jSONObject);
        if (TextUtils.isEmpty(strC)) {
            a("Required field", "Invalid name in adChoices option", str3, str4, i10, z10, context);
            i0Var.a("name").a(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
            return null;
        }
        boolean zD = d(jSONObject);
        String strOptString = jSONObject.optString("clickLink");
        String strA = a(jSONObject, str2, zD, str3, str4, i10, z10, i0Var, context);
        if (!strOptString.isEmpty() && !lb.e(strOptString)) {
            a("Bad value", "Invalid clickLink in adChoices option", str3, str4, i10, z10, context);
            i0Var.a("clickLink").a(3007);
            if (strA == null) {
                return null;
            }
        }
        return c.a.a(strC, str, strA, strOptString, null, a(jSONObject), zD);
    }

    public final String a(JSONObject jSONObject) {
        if (jSONObject.has("alias")) {
            return jSONObject.optString("alias");
        }
        return null;
    }

    public final String a(JSONObject jSONObject, String str, boolean z10, String str2, String str3, int i10, boolean z11, i0 i0Var, Context context) {
        String strOptString = jSONObject.optString("url");
        if (lb.e(strOptString)) {
            return strOptString;
        }
        if (!strOptString.isEmpty()) {
            a("Bad value", "Invalid url in adChoices option", str2, str3, i10, z11, context);
            i0Var.a("url").a(3007);
        }
        if (str == null || !z10) {
            return null;
        }
        String str4 = str + "&reason=";
        boolean zIsNull = jSONObject.isNull("id");
        int iOptInt = jSONObject.optInt("id");
        if (!zIsNull) {
            if (iOptInt >= 1) {
                return str4 + iOptInt;
            }
            a("Bad value", "Invalid id in adChoices option", str2, str3, i10, z11, context);
            i0Var.a("id").a(3007);
        }
        return str4;
    }

    public final void a(String str, String str2, String str3, String str4, int i10, boolean z10, Context context) {
        if (z10) {
            q5.a(str).f(str2).a(i10).c(str4).d(str3).b(context);
        }
    }
}
