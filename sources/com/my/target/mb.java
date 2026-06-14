package com.my.target;

import android.text.TextUtils;
import com.ironsource.sdk.controller.f;
import com.my.target.c;
import com.my.target.common.menu.MenuActionType;
import com.my.target.common.models.ImageData;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class mb {
    public static mb a() {
        return new mb();
    }

    public final c.a b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f.b.f45109c);
        if (jSONObjectOptJSONObject == null) {
            throw new JSONException("VastAdChoicesParser: adId json object is mandatory");
        }
        String strA = n5.a(jSONObjectOptJSONObject, "text");
        if (TextUtils.isEmpty(strA)) {
            throw new JSONException("VastAdChoicesParser: adId:text json field is mandatory");
        }
        String strA2 = n5.a(jSONObjectOptJSONObject, "copyText");
        if (TextUtils.isEmpty(strA2)) {
            throw new JSONException("VastAdChoicesParser: adId:copyText json field is mandatory");
        }
        gb.a("VastAdChoicesParser: parsed adId: name = " + strA + ", copyText = " + strA2);
        return c.a.a(strA, MenuActionType.COPY, null, null, strA2, null, false);
    }

    public final c c(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adInfo");
        if (jSONObjectOptJSONObject == null) {
            throw new JSONException("VastAdChoicesParser: adInfo json object is mandatory");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(d(jSONObjectOptJSONObject));
        arrayList.add(b(jSONObjectOptJSONObject));
        ImageData imageDataE = e(jSONObjectOptJSONObject);
        c.a aVarF = f(jSONObjectOptJSONObject);
        if (aVarF != null) {
            arrayList.add(aVarF);
        }
        c cVarA = c.a(imageDataE, "");
        cVarA.a(arrayList);
        gb.a("VastAdChoicesParser: parsed adInfo");
        return cVarA;
    }

    public final c.a d(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("advertiserInfo");
        if (jSONObjectOptJSONObject == null) {
            throw new JSONException("VastAdChoicesParser: advertiserInfo json object is mandatory");
        }
        String strA = n5.a(jSONObjectOptJSONObject, "text");
        if (TextUtils.isEmpty(strA)) {
            throw new JSONException("VastAdChoicesParser: advertiserInfo:text json field is mandatory");
        }
        String strA2 = n5.a(jSONObjectOptJSONObject, "url");
        if (!TextUtils.isEmpty(strA2) && lb.e(strA2)) {
            gb.a("VastAdChoicesParser: parsed advertiserInfo: name = " + strA + ", clickLink = " + strA2);
            return c.a.a(strA, "default", null, strA2, null, null, true);
        }
        throw new JSONException("VastAdChoicesParser: Invalid url (" + strA2 + ") in advertiserInfo" + StringUtils.PROCESS_POSTFIX_DELIMITER + "url");
    }

    public final ImageData e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("icon");
        if (jSONObjectOptJSONObject == null) {
            throw new JSONException("VastAdChoicesParser: icon json object is mandatory");
        }
        String strA = n5.a(jSONObjectOptJSONObject, "url");
        if (TextUtils.isEmpty(strA) || !lb.e(strA)) {
            throw new JSONException("VastAdChoicesParser: Invalid iconLink in adChoices = " + strA);
        }
        gb.a("VastAdChoicesParser: parsed icon: url = " + strA);
        return ImageData.newImageData(strA);
    }

    public final c.a f(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("recommendationInfo");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        String strA = n5.a(jSONObjectOptJSONObject, "text");
        if (TextUtils.isEmpty(strA)) {
            throw new JSONException("VastAdChoicesParser: recommendationInfo:text json field is mandatory");
        }
        String strA2 = n5.a(jSONObjectOptJSONObject, "url");
        if (!TextUtils.isEmpty(strA2) && lb.e(strA2)) {
            gb.a("VastAdChoicesParser: parsed recommendationInfo: name = " + strA + ", clickLink = " + strA2);
            return c.a.a(strA, "default", null, strA2, null, null, true);
        }
        throw new JSONException("VastAdChoicesParser: Invalid url (" + strA2 + ") in recommendationInfo" + StringUtils.PROCESS_POSTFIX_DELIMITER + "url");
    }

    public c a(JSONObject jSONObject) throws JSONException {
        c cVarC = c(jSONObject);
        gb.a("VastAdChoicesParser: parsed adChoices");
        return cVarC;
    }
}
