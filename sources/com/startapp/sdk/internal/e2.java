package com.startapp.sdk.internal;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e2 {
    public static String a(boolean z10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (z10) {
            jSONObject.put("isTestAd", z10);
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String strEncodeToString = Base64.encodeToString(StringsKt.I(string), 0);
        Intrinsics.checkNotNull(strEncodeToString);
        return strEncodeToString;
    }
}
