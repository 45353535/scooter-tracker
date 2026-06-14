package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class i1 extends h1 {
    public i1(u uVar, j jVar, Context context) {
        super(uVar, jVar, 1, context);
    }

    public static i1 a(u uVar, j jVar, Context context) {
        return new i1(uVar, jVar, context);
    }

    public boolean b(JSONObject jSONObject, tb tbVar) {
        a4 a4VarB;
        try {
            List listA = a(jSONObject.getJSONArray(FirebaseAnalytics.Param.ITEMS));
            if (listA == null || listA.isEmpty() || (a4VarB = b(jSONObject.getJSONObject(POBCTAOverlayData.KEY_CTA_HEADER))) == null) {
                return false;
            }
            tbVar.a(new c4(a4VarB, listA, jSONObject.has("disclaimer") ? a(jSONObject.getJSONObject("disclaimer")) : null));
            return true;
        } catch (JSONException unused) {
        }
        return false;
    }

    public boolean a(JSONObject jSONObject, tb tbVar) {
        if (f(jSONObject, tbVar)) {
            return true;
        }
        float fO = tbVar.o();
        if (fO <= 0.0f) {
            a("Bad value", "wrong videoMotionBanner duration " + fO, tbVar.r());
            return false;
        }
        tbVar.u(jSONObject.optString("closeActionText", "Close"));
        tbVar.w(jSONObject.optString("replayActionText", tbVar.W()));
        tbVar.v(jSONObject.optString("closeDelayActionText", tbVar.O()));
        Boolean boolK = this.f59792a.k();
        tbVar.k(boolK != null ? boolK.booleanValue() : jSONObject.optBoolean("automute", tbVar.g0()));
        tbVar.n(jSONObject.optBoolean("showPlayerControls", tbVar.j0()));
        Boolean boolL = this.f59792a.l();
        tbVar.l(boolL != null ? boolL.booleanValue() : jSONObject.optBoolean("autoplay", tbVar.h0()));
        tbVar.m(jSONObject.optBoolean("hasCtaButton", tbVar.i0()));
        a(jSONObject, (k0) tbVar);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("shoppable");
        if (jSONObjectOptJSONObject != null) {
            tbVar.a(h(jSONObjectOptJSONObject, tbVar));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("shoppableAdsData");
        if (jSONObjectOptJSONObject2 != null) {
            tbVar.a(ea.a(this.f59792a, this.f59793b, this.f59794c).a(jSONObjectOptJSONObject2, tbVar.r()));
        }
        c(jSONObject, tbVar);
        try {
            return b(jSONObject.getJSONObject("videoMotionData"), tbVar);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public a4 b(JSONObject jSONObject) {
        String strA = n5.a(jSONObject, "icon");
        if (TextUtils.isEmpty(strA)) {
            gb.a("CommonVideoMotionParser: can't parse header, icon is empty");
            return null;
        }
        String strA2 = n5.a(jSONObject, "title");
        if (TextUtils.isEmpty(strA2)) {
            gb.a("CommonVideoMotionParser: can't parse header, title is empty");
            return null;
        }
        String strA3 = n5.a(jSONObject, "linkText");
        if (TextUtils.isEmpty(strA3)) {
            gb.a("CommonVideoMotionParser: can't parse header, link text is empty");
            return null;
        }
        String strA4 = n5.a(jSONObject, "ageRestrictionText");
        if (TextUtils.isEmpty(strA4)) {
            gb.a("CommonVideoMotionParser: can't parse header, age restriction is empty");
            return null;
        }
        String strA5 = n5.a(jSONObject, "adDisclaimerText");
        if (TextUtils.isEmpty(strA5)) {
            gb.a("CommonVideoMotionParser: can't parse header, ad disclaimer text is empty");
            return null;
        }
        if (!jSONObject.has("statistics")) {
            gb.a("CommonVideoMotionParser: can't parse header, hasn't stats key");
            return null;
        }
        db dbVar = new db(this.f59792a, this.f59793b, this.f59794c);
        za zaVarA = za.a(h0.f59787e);
        dbVar.a(zaVarA, jSONObject, "0", 0.0f);
        return new a4(strA, strA2, strA3, strA4, strA5, zaVarA, n5.a(jSONObject, "url"), n5.a(jSONObject, Constants.DEEPLINK), n5.a(jSONObject, "deeplink_fallback_url"));
    }

    public z3 a(JSONObject jSONObject) {
        String strA = n5.a(jSONObject, "text");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new z3(strA);
    }

    public List a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length <= 0) {
            gb.a("CommonVideoMotionParser: videoMotionItems size 0");
            return null;
        }
        for (int i10 = 0; i10 < length; i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String strA = n5.a(jSONObject, "id");
                if (!TextUtils.isEmpty(strA)) {
                    String strA2 = n5.a(jSONObject, "currency");
                    if (!TextUtils.isEmpty(strA2)) {
                        String strA3 = n5.a(jSONObject, "image");
                        if (!TextUtils.isEmpty(strA3)) {
                            String strA4 = n5.a(jSONObject, "text");
                            if (!TextUtils.isEmpty(strA4)) {
                                String strA5 = n5.a(jSONObject, "ctaText");
                                if (!TextUtils.isEmpty(strA5) && jSONObject.has("statistics")) {
                                    db dbVar = new db(this.f59792a, this.f59793b, this.f59794c);
                                    za zaVarA = za.a(h0.f59787e);
                                    dbVar.a(zaVarA, jSONObject, strA, 0.0f);
                                    arrayList.add(new d4(strA, n5.a(jSONObject, "price"), n5.a(jSONObject, "old_price"), strA2, strA3, strA4, strA5, zaVarA, n5.a(jSONObject, "url"), n5.a(jSONObject, Constants.DEEPLINK), n5.a(jSONObject, "deeplink_fallback_url")));
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return arrayList;
    }
}
