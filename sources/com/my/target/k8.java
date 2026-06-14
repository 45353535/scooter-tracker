package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f60002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f60003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f60005d;

    public k8(j jVar, String str, boolean z10, Context context) {
        this.f60003b = jVar;
        this.f60004c = str;
        this.f60002a = z10;
        this.f60005d = context;
    }

    public static k8 a(j jVar, String str, boolean z10, Context context) {
        return new k8(jVar, str, z10, context);
    }

    public j8 a(j8 j8Var, JSONObject jSONObject) {
        if (j8Var == null) {
            String strOptString = jSONObject.optString("customReferenceData", null);
            if (strOptString != null && strOptString.length() > 256) {
                a("Bad value", "customReferenceData more then 256 symbols");
                strOptString = null;
            }
            j8Var = j8.a(jSONObject.optString("contentUrl", null), strOptString);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        if (jSONArrayOptJSONArray != null) {
            a(jSONArrayOptJSONArray, j8Var);
        }
        return j8Var;
    }

    public final void a(JSONArray jSONArray, j8 j8Var) {
        ob obVarA;
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                if (!jSONObjectOptJSONObject.has("url")) {
                    a("Required field", "VerificationScriptResource has no url");
                } else {
                    String strOptString = jSONObjectOptJSONObject.optString("url");
                    if (jSONObjectOptJSONObject.has("vendorKey") && jSONObjectOptJSONObject.has("params")) {
                        String strOptString2 = jSONObjectOptJSONObject.optString("vendorKey");
                        String strOptString3 = jSONObjectOptJSONObject.optString("params");
                        if (TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
                            gb.a("VerificationScriptResource has empty param: vendorKey=" + strOptString2 + ", verificationParameters=" + strOptString3);
                        } else {
                            obVarA = ob.a(strOptString, strOptString2, strOptString3);
                        }
                    } else {
                        obVarA = ob.a(strOptString);
                    }
                    j8Var.f59963c.add(obVarA);
                }
            }
        }
    }

    public final void a(String str, String str2) {
        if (this.f60002a) {
            q5.a(str).f(str2).a(this.f60003b.i()).c(this.f60004c).b(this.f60005d);
        }
    }
}
