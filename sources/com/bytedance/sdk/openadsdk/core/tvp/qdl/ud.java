package com.bytedance.sdk.openadsdk.core.tvp.qdl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.fs;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.model.ekw;
import com.bytedance.sdk.openadsdk.core.model.exc;
import com.bytedance.sdk.openadsdk.core.model.jl;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.rq.wd.lnr;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    public static String qdl = "https://pag_open_icon_id/appicon.png";

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static String f17534ud = "";

    public static boolean lnr() {
        return true;
    }

    public static String qdl() {
        return f17534ud;
    }

    public static JSONObject ud() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("language", fs.ud());
            jSONObject.put("xSetting", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            hkc.ud(jSONObject3);
            jSONObject3.put("platform", "android");
            jSONObject.put("xAppInfo", jSONObject3);
            return jSONObject;
        } catch (Exception e10) {
            aaj.lnr("TemplateUtils", e10.getMessage());
            return jSONObject;
        }
    }

    private static JSONObject lnr(ljh ljhVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            hkc.qdl(jSONObject, ljhVar);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject qdl(float f10, float f11, boolean z10, @NonNull ljh ljhVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f10);
            jSONObject2.put("height", f11);
            if (z10) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put(Reporting.Key.CREATIVE, qdl(false, ljhVar));
            jSONObject.put("template_Plugin", ud(ljhVar.xdk()));
            jSONObject.put("diff_template_Plugin", qdl(ljhVar.xdk()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String ud(ljh.qdl qdlVar) {
        com.bytedance.sdk.component.adexpress.qdl.lnr.ud udVarLnr;
        if (qdlVar != null) {
            String strWd = qdlVar.wd();
            return (!TextUtils.isEmpty(strWd) || (udVarLnr = com.bytedance.sdk.component.adexpress.qdl.ud.ud.lnr(qdlVar.mml())) == null) ? strWd : udVarLnr.mzz();
        }
        return "";
    }

    public static JSONObject qdl(ljh ljhVar) {
        return qdl(ljhVar, false, (JSONObject) null);
    }

    public static JSONObject qdl(ljh ljhVar, boolean z10, JSONObject jSONObject) {
        JSONObject jSONObjectQdl = null;
        if (ljhVar == null) {
            return null;
        }
        try {
            jSONObjectQdl = qdl(ljhVar, false, z10);
            if (jSONObjectQdl == null) {
                jSONObjectQdl = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            hkc.ud(jSONObject2);
            jSONObject2.put("platform", "android");
            jSONObjectQdl.put("xAppInfo", jSONObject2);
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectQdl.put(next, jSONObject.get(next));
                }
            }
            JSONObject jSONObjectUd = hkc.ud(ljhVar);
            jSONObjectUd.put("language", fs.ud());
            jSONObjectQdl.put("xSetting", jSONObjectUd);
            return jSONObjectQdl;
        } catch (Throwable th2) {
            th2.getMessage();
            return jSONObjectQdl;
        }
    }

    public static Map<String, String> ud(ljh ljhVar) {
        HashMap map = null;
        if (ljhVar == null) {
            return null;
        }
        List<jl> listVm = ljhVar.vm();
        if (listVm != null && listVm.size() > 0) {
            map = new HashMap();
            for (jl jlVar : listVm) {
                if (jlVar != null) {
                    map.put(jlVar.qdl(), jlVar.wd());
                }
            }
            jl jlVarHcs = ljhVar.hcs();
            if (jlVarHcs != null) {
                map.put(jlVarHcs.qdl(), jlVarHcs.wd());
            }
        }
        return map;
    }

    private static JSONObject qdl(ljh ljhVar, boolean z10, boolean z11) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = null;
        if (ljhVar != null) {
            try {
                String strJbc = ljhVar.jbc();
                if (strJbc != null) {
                    JSONObject jSONObject2 = new JSONObject(strJbc);
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("creatives");
                    if (!z10 && !z11) {
                        jSONObject = new JSONObject();
                    } else {
                        JSONObject jSONObject3 = (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= ljhVar.lnr() || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(ljhVar.lnr())) == null) ? null : new JSONObject(jSONObjectOptJSONObject.toString());
                        if (jSONObject3 == null) {
                            return null;
                        }
                        jSONObject = jSONObject3;
                    }
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 1) {
                        jSONArrayOptJSONArray.remove(0);
                        jSONObject.put("xRestCreatives", jSONArrayOptJSONArray);
                    }
                    jSONObject2.remove("creatives");
                    jSONObject.put("xRestResponse", jSONObject2);
                }
            } catch (Throwable th2) {
                aaj.qdl("TemplateUtils", "filterTemplateInfo", th2);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static JSONObject qdl(float f10, float f11, boolean z10, ljh ljhVar, String str, lnr lnrVar) {
        f17534ud = "";
        if (ljhVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectQdl = qdl(f10, f11, z10, ljhVar, str);
            if (lnrVar != null) {
                lnrVar.qdl("adv3");
            }
            ekw ekwVarKr = ljhVar.kr();
            if (ekwVarKr != null) {
                String strMml = ekwVarKr.mml();
                if (!TextUtils.isEmpty(strMml)) {
                    jSONObjectQdl.put("xTemplate", new JSONObject(strMml));
                    f17534ud = "getTemplate success by local data";
                    if (lnrVar != null) {
                        lnrVar.ud("local");
                        return jSONObjectQdl;
                    }
                } else {
                    String strQdl = com.bytedance.sdk.openadsdk.core.rq.qdl.ud.qdl().qdl("adv3", ekwVarKr.qdl(), ekwVarKr.ud());
                    if (!TextUtils.isEmpty(strQdl)) {
                        jSONObjectQdl.put("xTemplate", new JSONObject(strQdl));
                        f17534ud = "getTemplate success by db data";
                        if (lnrVar != null) {
                            lnrVar.ud("local");
                            return jSONObjectQdl;
                        }
                    } else {
                        String str2 = "local db data is null id is " + ekwVarKr.qdl() + " md5 is " + ekwVarKr.ud();
                        f17534ud = str2;
                        if (lnrVar != null) {
                            lnrVar.qdl(3, str2, "net");
                        }
                    }
                }
            }
            return jSONObjectQdl;
        } catch (Exception e10) {
            String str3 = "load template exception " + e10.getMessage();
            f17534ud = str3;
            if (lnrVar != null) {
                lnrVar.qdl(3, str3, "net");
            }
            return null;
        }
    }

    public static JSONObject qdl(float f10, float f11, boolean z10, ljh ljhVar, String str) {
        if (ljhVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectQdl = qdl(ljhVar, true, true);
            if (jSONObjectQdl == null) {
                return null;
            }
            try {
                qdl(jSONObjectQdl, ljhVar, str);
                JSONObject jSONObjectUd = hkc.ud(ljhVar);
                jSONObjectUd.put("language", fs.ud());
                jSONObjectQdl.put("xSetting", jSONObjectUd);
                jSONObjectQdl.put("xAdInfo", qdl(str, lnr(ljhVar), ljhVar));
                JSONObject jSONObject = new JSONObject();
                hkc.ud(jSONObject);
                jSONObject.put("platform", "android");
                jSONObjectQdl.put("xAppInfo", jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", f10);
                jSONObject2.put("height", f11);
                if (z10) {
                    jSONObject2.put("isLandscape", true);
                }
                jSONObjectQdl.put("xSize", jSONObject2);
                return jSONObjectQdl;
            } catch (Throwable unused) {
                return jSONObjectQdl;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static void qdl(JSONObject jSONObject, ljh ljhVar, String str) {
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarTdy;
        if (ljhVar == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("h265_video")) {
                jSONObject.remove("h265_video");
            }
            if (!jSONObject.has("video") || (udVarTdy = ljhVar.tdy()) == null) {
                return;
            }
            JSONObject jSONObjectJl = udVarTdy.jl();
            if (jSONObjectJl != null) {
                if ("open_ad".equals(str)) {
                    jSONObjectJl.put("video_duration", yt.mml().ljh(String.valueOf(ljhVar.fz())));
                } else {
                    jSONObjectJl.put("video_duration", udVarTdy.mo() * ((double) udVarTdy.oth()));
                }
            }
            jSONObject.put("video", jSONObjectJl);
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private static JSONObject qdl(String str, JSONObject jSONObject, ljh ljhVar) {
        if (ljhVar != null) {
            try {
                if ("open_ad".equals(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("app_name", tvp.ud().jpc());
                    int iTvp = tvp.ud().tvp();
                    if (iTvp != 0) {
                        int iRa = ljhVar.ra();
                        if (9 == iRa) {
                            jSONObject2.put("app_icon", qdl);
                        } else if (10 == iRa) {
                            jSONObject2.put("app_icon", "@".concat(String.valueOf(iTvp)));
                        }
                    }
                    jSONObject.put("open_app_info", jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject qdl(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(UserMetadata.KEYDATA_FILENAME);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (jSONObject.has(strOptString)) {
                        jSONObject3.put(strOptString, jSONObject.opt(strOptString));
                    }
                }
                jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                jSONObject3.put("xSize", jSONObject.opt("xSize"));
                jSONObject3.put("dynamic_configs", jSONObject.opt("dynamic_configs"));
                jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                jSONObject3.put("xRestCreatives", jSONObject.opt("xRestCreatives"));
                jSONObject3.put("xRestResponse", jSONObject.opt("xRestResponse"));
                return jSONObject3;
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String qdl(ljh.qdl qdlVar) {
        if (qdlVar != null) {
            return qdlVar.jpc();
        }
        return "";
    }

    public static JSONObject qdl(boolean z10, @NonNull ljh ljhVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", ljhVar.uvi());
            if (ljhVar.hcs() != null) {
                if (ljhVar.hcs() != null && !TextUtils.isEmpty(ljhVar.hcs().qdl())) {
                    jSONObject.put("icon", ljhVar.hcs().qdl());
                } else {
                    jSONObject.put("icon", "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (ljhVar.vm() != null) {
                for (int i10 = 0; i10 < ljhVar.vm().size(); i10++) {
                    jl jlVar = ljhVar.vm().get(i10);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", jlVar.lnr());
                    jSONObject2.put("width", jlVar.ud());
                    jSONObject2.put("url", jlVar.qdl());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", ljhVar.vxg());
            jSONObject.put("interaction_type", ljhVar.ygv());
            jSONObject.put("interaction_method", ljhVar.tid());
            jSONObject.put("is_compliance_template", lnr());
            jSONObject.put("title", ljhVar.gsv());
            jSONObject.put("description", ljhVar.hvi());
            jSONObject.put("source", ljhVar.ca());
            JSONObject jSONObject3 = new JSONObject();
            exc excVarOth = ljhVar.oth();
            if (excVarOth == null) {
                excVarOth = new exc();
            }
            jSONObject3.put("ceiling_time", excVarOth.mml());
            jSONObject3.put("ceiling_ratio", excVarOth.mzz());
            jSONObject3.put("expand_ratio", excVarOth.mo());
            jSONObject.put("interaction_params", jSONObject3);
            if (ljhVar.fhs() != null) {
                jSONObject.put("comment_num", ljhVar.fhs().mzz());
                jSONObject.put(FirebaseAnalytics.Param.SCORE, ljhVar.fhs().mml());
                jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, ljhVar.fhs().mo());
                jSONObject.put("app", ljhVar.fhs().jpc());
            }
            com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarTdy = ljhVar.tdy();
            if (udVarTdy != null) {
                JSONObject jSONObjectJl = udVarTdy.jl();
                jSONObjectJl.put("video_duration", udVarTdy.mo() * ((double) udVarTdy.oth()));
                jSONObject.put("video", jSONObjectJl);
            }
            if (ljhVar.xdk() != null) {
                jSONObject.put("dynamic_creative", ljhVar.xdk().tvp());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String qdl(ljh ljhVar, String str) {
        List<jl> listVm;
        if (ljhVar != null && (listVm = ljhVar.vm()) != null && listVm.size() > 0) {
            for (jl jlVar : listVm) {
                if (jlVar != null && TextUtils.equals(str, jlVar.qdl())) {
                    return jlVar.wd();
                }
            }
        }
        return null;
    }
}
