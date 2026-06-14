package com.my.tracker.personalize;

import android.text.TextUtils;
import com.applovin.impl.uc;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.my.tracker.obfuscated.x2;
import java.util.ArrayList;
import java.util.Iterator;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
final class d extends b {
    d() {
    }

    static String a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                String str2 = "No value for key: " + str;
                x2.a("PersonalizePlacementsParser: " + str2);
                return str2;
            }
        }
        return null;
    }

    static c b(JSONObject jSONObject) {
        String strA = a(jSONObject, AppLovinEventParameters.PRODUCT_IDENTIFIER, "payload", "value", "discount_value", "price", "discount_price");
        if (strA != null) {
            return new c(null, strA);
        }
        String strOptString = jSONObject.optString(AppLovinEventParameters.PRODUCT_IDENTIFIER);
        if (TextUtils.isEmpty(strOptString)) {
            return a("Invalid value for key: ", AppLovinEventParameters.PRODUCT_IDENTIFIER);
        }
        String strOptString2 = jSONObject.optString("payload");
        if (TextUtils.isEmpty(strOptString2)) {
            return a("Invalid value for key: ", "payload");
        }
        return new c(new PersonalizeItem(strOptString, strOptString2, jSONObject.optDouble("price"), jSONObject.optDouble("discount_price"), jSONObject.optInt("value"), jSONObject.optInt("discount_value")), null);
    }

    static c c(JSONObject jSONObject) {
        String strA = a(jSONObject, "offer_id", "subitems");
        if (strA != null) {
            return new c(null, strA);
        }
        int iOptInt = jSONObject.optInt("offer_id");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subitems");
        if (jSONArrayOptJSONArray == null) {
            return a("No value for key: ", "subitems");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            c cVarB = b(jSONArrayOptJSONArray.optJSONObject(i10));
            String strA2 = cVarB.a();
            if (TextUtils.isEmpty(strA2)) {
                PersonalizeItem personalizeItem = (PersonalizeItem) cVarB.b();
                if (personalizeItem == null) {
                    String str = "Can't parse item " + i10 + " without errors";
                    arrayList2.add(str);
                    x2.a("PersonalizePlacementsParser: " + str);
                } else {
                    arrayList.add(personalizeItem);
                }
            } else {
                String str2 = "Can't parse item " + i10 + " with errors: " + strA2;
                arrayList2.add(str2);
                x2.a("PersonalizePlacementsParser: " + str2);
            }
        }
        return arrayList2.size() > 0 ? new c(null, uc.a(", ", arrayList2)) : new c(new PersonalizeOffer(iOptInt, arrayList), null);
    }

    static c d(JSONObject jSONObject) {
        String strA = a(jSONObject, Reporting.Key.PLACEMENT_ID, "test_id", FirebaseAnalytics.Param.GROUP_ID, "offer");
        if (strA != null) {
            return new c(null, strA);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("offer");
        if (jSONObjectOptJSONObject == null) {
            return a("Invalid value for key: ", "offer");
        }
        c cVarC = c(jSONObjectOptJSONObject);
        String strA2 = cVarC.a();
        if (strA2 != null) {
            x2.a("PersonalizePlacementsParser: Can't parse offer's object with error: " + strA2);
            return new c(null, strA2);
        }
        PersonalizeOffer personalizeOffer = (PersonalizeOffer) cVarC.b();
        if (personalizeOffer == null) {
            return a("Can't parse offer's object without error from parser", null);
        }
        String strOptString = jSONObject.optString(Reporting.Key.PLACEMENT_ID);
        return TextUtils.isEmpty(strOptString) ? a("Invalid value for key: ", Reporting.Key.PLACEMENT_ID) : new c(new PersonalizePlacement(strOptString, jSONObject.optInt(FirebaseAnalytics.Param.GROUP_ID), jSONObject.optInt("test_id"), personalizeOffer), null);
    }

    static c a(String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            sb2.append(str);
        }
        String string = sb2.toString();
        x2.a("PersonalizePlacementsParser: " + string);
        return new c(null, string);
    }

    @Override // com.my.tracker.personalize.b
    c a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("errors");
        ArrayList arrayList = new ArrayList();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                arrayList.add(next + ": " + jSONObjectOptJSONObject.optString(next));
            }
            return new c(null, uc.a(", ", arrayList));
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        if (jSONArrayOptJSONArray == null) {
            return a("No value for key: ", "data");
        }
        if (jSONArrayOptJSONArray.length() == 0) {
            return a("No placements in the list");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            c cVarD = d(jSONArrayOptJSONArray.optJSONObject(i10));
            String strA = cVarD.a();
            if (strA != null) {
                x2.a("PersonalizePlacementsParser: Placement parsing error: " + strA);
            } else {
                PersonalizePlacement personalizePlacement = (PersonalizePlacement) cVarD.b();
                if (personalizePlacement != null) {
                    arrayList2.add(personalizePlacement);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return a("No placements in the list");
        }
        return new c(arrayList2, null);
    }
}
