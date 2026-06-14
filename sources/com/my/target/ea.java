package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4424m2;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f59600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f59601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f59602c;

    public ea(u uVar, j jVar, Context context) {
        this.f59601b = uVar;
        this.f59602c = jVar;
        this.f59600a = context;
    }

    public static ea a(u uVar, j jVar, Context context) {
        return new ea(uVar, jVar, context);
    }

    public da a(JSONObject jSONObject, String str) {
        za zaVarA = za.a(h0.f59787e);
        db dbVarA = db.a(this.f59601b, this.f59602c, this.f59600a);
        boolean zHas = jSONObject.has("statistics");
        if (zHas) {
            dbVarA.a(zaVarA, jSONObject, str, -1.0f);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(FirebaseAnalytics.Param.ITEMS);
        if (jSONArrayOptJSONArray == null) {
            gb.a("ShoppableAdsDataParser: can't parse – ShoppableAdItems'");
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            gb.a("ShoppableAdsDataParser: can't parse – shoppableAdItems size is 0");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject == null) {
                gb.a("ShoppableAdsDataParser: can't parse – hasn't shoppableItemJson");
            } else {
                b4 b4VarA = a(jSONObjectOptJSONObject, dbVarA, str);
                if (b4VarA == null) {
                    gb.a("ShoppableAdsDataParser: can't parse shoppableAdsItem");
                    return null;
                }
                arrayList.add(b4VarA);
            }
        }
        if (arrayList.size() == 0) {
            gb.a("ShoppableAdsDataParser: can't parse – no one valid shoppableAdItem");
            return null;
        }
        if (!zHas || zaVarA.d("shoppableAdsItemShow") || zaVarA.d(C4424m2.f43623v)) {
            return da.a(arrayList, zaVarA);
        }
        gb.a("ShoppableAdsDataParser: hasn't show stat'");
        return null;
    }

    public b4 a(JSONObject jSONObject, db dbVar, String str) {
        try {
            String string = jSONObject.getString("url");
            if (TextUtils.isEmpty(string)) {
                gb.a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't url");
                return null;
            }
            String string2 = jSONObject.getString("id");
            if (TextUtils.isEmpty(string2)) {
                gb.a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't id");
                return null;
            }
            String string3 = jSONObject.getString("picture");
            if (TextUtils.isEmpty(string3)) {
                gb.a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't picture");
                return null;
            }
            String string4 = jSONObject.getString("text");
            if (TextUtils.isEmpty(string4)) {
                gb.a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't text");
                return null;
            }
            String string5 = jSONObject.has("oldPrice") ? jSONObject.getString("oldPrice") : null;
            String string6 = jSONObject.has("price") ? jSONObject.getString("price") : null;
            String string7 = jSONObject.has(Constants.DEEPLINK) ? jSONObject.getString(Constants.DEEPLINK) : null;
            String string8 = jSONObject.has("deeplink_fallback_url") ? jSONObject.getString("deeplink_fallback_url") : null;
            za zaVarA = za.a(h0.f59787e);
            dbVar.a(zaVarA, jSONObject, str, -1.0f);
            return b4.a(string, string2, string3, string4, string6, string5, string7, string8, zaVarA);
        } catch (Throwable th2) {
            gb.a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – " + th2.getMessage());
            return null;
        }
    }
}
