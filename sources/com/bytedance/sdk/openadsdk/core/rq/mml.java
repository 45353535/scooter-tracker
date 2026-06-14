package com.bytedance.sdk.openadsdk.core.rq;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.fs;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mml {
    private static String qdl = "";

    private static JSONArray lnr(ljh ljhVar) {
        try {
            ljh.qdl qdlVarXdk = ljhVar.xdk();
            if (qdlVarXdk == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(qdlVarXdk.tvp());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("original_price", Double.valueOf(jSONObject.optDouble("original_price", 0.0d)));
            jSONObject2.putOpt("price_unit", jSONObject.optString("price_unit"));
            jSONObject2.putOpt(FirebaseAnalytics.Param.DISCOUNT, Double.valueOf(jSONObject.optDouble(FirebaseAnalytics.Param.DISCOUNT, 0.0d)));
            jSONObject2.putOpt("product_name", jSONObject.optString("dpa_product_name"));
            jSONObject2.putOpt("description", jSONObject.optString("dpa_description"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dpa_images");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                jSONObject2.putOpt("image", jSONArrayOptJSONArray.get(0));
            }
            jSONObject2.putOpt("brand_name", jSONObject.optString("dpa_brand_name"));
            jSONObject2.putOpt("sale_price_i18n", Integer.valueOf(jSONObject.optInt("sale_price_i18n")));
            jSONObject2.putOpt("real_price", Double.valueOf(jSONObject.optDouble("real_price", 0.0d)));
            jSONObject2.put("button_text", ljhVar.uvi());
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("dpa_related_products");
            if (jSONArrayOptJSONArray2 != null) {
                jSONArray.put(jSONObject2);
                for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                    try {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i10);
                        jSONObject3.put("button_text", ljhVar.uvi());
                        jSONArray.put(jSONObject3);
                    } catch (Throwable unused) {
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static boolean qdl(int i10) {
        return i10 == 10 || i10 == 9;
    }

    public static boolean ud(ljh ljhVar) {
        return ljhVar != null && ljhVar.ra() == 10;
    }

    public static JSONObject qdl(ljh ljhVar, String str) {
        JSONObject jSONObjectRdz = ljhVar.rdz();
        try {
            jSONObjectRdz.put("show_dislike", ljhVar.tvf());
            jSONObjectRdz.put("language", fs.ud());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String strJpc = tvp.ud().jpc();
                int iTvp = tvp.ud().tvp();
                jSONObject.put("app_name", strJpc);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(iTvp)));
                jSONObjectRdz.put("open_app_info", jSONObject);
            }
            jSONObjectRdz.put("os", "Android");
            JSONArray jSONArrayLnr = lnr(ljhVar);
            if (jSONArrayLnr != null) {
                jSONObjectRdz.put("dpa_data", jSONArrayLnr);
                return jSONObjectRdz;
            }
        } catch (Throwable th2) {
            aaj.lnr("UgenUtils", "parseUGenDataInfo exception", th2.getMessage());
        }
        return jSONObjectRdz;
    }

    public static boolean qdl(ljh ljhVar) {
        return ljhVar != null && ljhVar.ra() == 7;
    }

    public static String qdl() {
        return qdl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static JSONObject qdl(ljh ljhVar, com.bytedance.sdk.openadsdk.core.rq.wd.lnr lnrVar) {
        lnrVar.qdl("ad");
        String strBjy = "";
        qdl = "";
        ?? r42 = 0;
        try {
            ljh.qdl qdlVarXdk = ljhVar.xdk();
            if (qdlVarXdk != null) {
                strBjy = qdlVarXdk.bjy();
                if (TextUtils.isEmpty(strBjy) && !TextUtils.isEmpty(qdlVarXdk.rdp()) && !TextUtils.isEmpty(qdlVarXdk.mml())) {
                    strBjy = com.bytedance.sdk.openadsdk.core.rq.qdl.ud.qdl().qdl("ad", qdlVarXdk.mml(), qdlVarXdk.rdp());
                }
            }
            try {
                if (!TextUtils.isEmpty(strBjy)) {
                    try {
                        JSONObject jSONObject = new JSONObject(strBjy);
                        try {
                            qdl = "getTemplate success";
                            lnrVar.ud("local");
                            return jSONObject;
                        } catch (JSONException unused) {
                            String strConcat = "parse json exception data is ".concat(String.valueOf(strBjy));
                            qdl = strConcat;
                            lnrVar.qdl(2, strConcat, "local");
                            return null;
                        }
                    } catch (JSONException unused2) {
                    }
                } else {
                    String str = "local data is null id is " + qdlVarXdk.mml() + " md5 is " + qdlVarXdk.rdp();
                    qdl = str;
                    lnrVar.qdl(3, str, "net");
                    return null;
                }
            } catch (Throwable th2) {
                r42 = qdlVarXdk;
                th = th2;
                String str2 = "get template error " + th.getMessage();
                qdl = str2;
                lnrVar.qdl(2, str2, "local");
                return r42;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
