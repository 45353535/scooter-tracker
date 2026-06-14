package f1;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import f1.d2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f70072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f70073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f70075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f70076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f70077f;

    public i4(y base64Wrapper) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f70072a = base64Wrapper;
        this.f70073b = "";
        this.f70075d = "";
        this.f70076e = "";
        this.f70077f = "";
    }

    public final dg a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            throw new JSONException("Missing response");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject(C4240b4.i.K);
        JSONArray jSONArray = jSONObject2.getJSONArray("elements");
        Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
        d(jSONArray, linkedHashMap, linkedHashMap2);
        String string = jSONObject2.getString("template");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String strOptString = jSONObject.optString("name");
        String string2 = jSONObject.getString("ad_id");
        String str = this.f70076e;
        String strOptString2 = jSONObject.optString("baseurl");
        d2 d2VarF = f(jSONObject.optJSONObject("infoicon"));
        String string3 = jSONObject.getString("cgn");
        String string4 = jSONObject.getString(Reporting.Key.CREATIVE);
        String strOptString3 = jSONObject.optString("media-type");
        String str2 = this.f70073b;
        String strB = w4.b(str2);
        String string5 = jSONObject.getString(POBCoreNativeConstants.NATIVE_LINK);
        String strOptString4 = jSONObject.optString("deep-link");
        String string6 = jSONObject.getString(TypedValues.TransitionType.S_TO);
        int i10 = this.f70074c;
        String str3 = this.f70075d;
        f9 f9Var = (f9) linkedHashMap.get("body");
        if (f9Var == null) {
            throw new IllegalStateException("WebView AdUnit does not have a template html body asset");
        }
        w0 w0VarA = w0.f71423c.a(jSONObject.optString("renderingengine"));
        List listB = b(jSONObject.optJSONArray("scripts"));
        Map mapE = e(jSONObject.optJSONObject("events"));
        a6 a6VarA = w4.a(jSONObject.optInt("mtype"));
        q0 q0VarA = q0.f70796c.a(jSONObject.optInt("clkp"));
        String str4 = this.f70077f;
        Intrinsics.checkNotNull(strOptString);
        Intrinsics.checkNotNull(string2);
        Intrinsics.checkNotNull(strOptString2);
        Intrinsics.checkNotNull(string3);
        Intrinsics.checkNotNull(string4);
        Intrinsics.checkNotNull(strOptString3);
        Intrinsics.checkNotNull(string5);
        Intrinsics.checkNotNull(strOptString4);
        Intrinsics.checkNotNull(string6);
        return new dg(strOptString, string2, strOptString2, str, d2VarF, string3, string4, strOptString3, linkedHashMap, str2, strB, string5, strOptString4, string6, i10, str3, string, f9Var, linkedHashMap2, w0VarA, listB, mapE, null, null, a6VarA, q0VarA, str4, 12582912, null);
    }

    public final List b(JSONArray jSONArray) {
        List listA;
        return (jSONArray == null || (listA = vd.a(jSONArray)) == null) ? CollectionsKt.emptyList() : listA;
    }

    public final void c(String str) {
        int i10;
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i10 = 0;
        }
        this.f70074c = i10;
    }

    public final void d(JSONArray jSONArray, Map map, Map map2) throws JSONException {
        for (JSONObject jSONObject : vd.a(jSONArray)) {
            String string = jSONObject.getString("name");
            String string2 = jSONObject.getString("type");
            String string3 = jSONObject.getString("value");
            String strOptString = jSONObject.optString("param");
            if (string2 != null) {
                int iHashCode = string2.hashCode();
                if (iHashCode != -1333900842) {
                    if (iHashCode != 3213227) {
                        if (iHashCode == 106436749 && string2.equals("param")) {
                            Intrinsics.checkNotNull(strOptString);
                            Intrinsics.checkNotNull(string3);
                            map2.put(strOptString, string3);
                            if (string != null) {
                                int iHashCode2 = string.hashCode();
                                if (iHashCode2 != -1422292723) {
                                    if (iHashCode2 != -1389119727) {
                                        if (iHashCode2 != -878282975) {
                                            if (iHashCode2 == -315925656 && string.equals(CampaignEx.JSON_KEY_REWARD_AMOUNT)) {
                                                c(string3);
                                            }
                                        } else if (string.equals("reward_currency")) {
                                            this.f70075d = string3;
                                        }
                                    } else if (string.equals(Reporting.Key.IMP_ID)) {
                                        this.f70076e = string3;
                                    }
                                } else if (string.equals("adm.js")) {
                                    this.f70077f = this.f70072a.b(string3);
                                }
                            }
                        }
                    } else if (string2.equals("html")) {
                        Intrinsics.checkNotNull(strOptString);
                        if (strOptString.length() == 0) {
                            strOptString = "body";
                        }
                    }
                } else if (string2.equals("preCachedVideo")) {
                    Intrinsics.checkNotNull(string3);
                    this.f70073b = string3;
                }
                Intrinsics.checkNotNull(strOptString);
                map.put(strOptString, new f9(string2, string, string3));
            }
            Intrinsics.checkNotNull(strOptString);
            if (strOptString.length() == 0) {
                strOptString = string;
            }
            Intrinsics.checkNotNull(strOptString);
            map.put(strOptString, new f9(string2, string, string3));
        }
    }

    public final Map e(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys;
        HashMap map = new HashMap();
        if (jSONObject != null && (itKeys = jSONObject.keys()) != null) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String string = jSONArray.getString(i10);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    arrayList.add(string);
                }
                Intrinsics.checkNotNull(next);
                map.put(next, arrayList);
            }
        }
        return map;
    }

    public final d2 f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new d2(null, null, null, null, null, null, 63, null);
        }
        String strOptString = jSONObject.optString("imageurl");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString("clickthroughUrl");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        return new d2(strOptString, strOptString2, d2.b.f69571c.a(jSONObject.optInt(C4240b4.i.L)), g(jSONObject.optJSONObject("margin")), g(jSONObject.optJSONObject("padding")), g(jSONObject.optJSONObject("size")));
    }

    public final d2.a g(JSONObject jSONObject) {
        return jSONObject != null ? new d2.a(jSONObject.optDouble(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH), jSONObject.optDouble("h")) : new d2.a(0.0d, 0.0d, 3, null);
    }
}
