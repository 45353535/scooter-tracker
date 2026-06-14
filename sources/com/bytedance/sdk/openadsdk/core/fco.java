package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ud;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.mml.ud;
import com.bytedance.sdk.openadsdk.multipro.ud.qdl;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.taurusx.tax.g.n;
import com.taurusx.tax.y.z.w.z;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class fco {
    private static boolean qdl;

    public static void qdl(boolean z10) {
        qdl = z10;
    }

    private static com.bytedance.sdk.openadsdk.bjy.qdl.ud qdl(int i10, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        com.bytedance.sdk.openadsdk.bjy.qdl.ud udVar = new com.bytedance.sdk.openadsdk.bjy.qdl.ud();
        udVar.qdl(ud.qdl.qdl);
        udVar.qdl(ljhVar);
        udVar.ud(com.bytedance.sdk.openadsdk.utils.gy.qdl(ljhVar));
        udVar.qdl(i10);
        udVar.qdl(false);
        udVar.ud(ljhVar.ygv());
        return udVar;
    }

    public static boolean qdl(Context context, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i10, @Nullable PAGNativeAd pAGNativeAd, @Nullable com.bytedance.sdk.openadsdk.core.mml.qdl qdlVar, String str, @Nullable com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo moVar, boolean z10, int i11) {
        String strQdl;
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdl(-1, ljhVar));
        if (context != null && ljhVar != null && i10 != -1) {
            com.bytedance.sdk.openadsdk.core.model.exu exuVarBo = ljhVar.bo();
            HashMap map = new HashMap();
            if (ljhVar.ikv() == 0) {
                map.put("dpl_probability_jump", Boolean.valueOf(i11 >= 11));
            }
            if (i11 != 0 && ljhVar.uj()) {
                map.put("dsp_click_type", Integer.valueOf(i11));
            }
            if (exuVarBo != null && !TextUtils.isEmpty(exuVarBo.qdl())) {
                if (qdl(context, ljhVar, i10, str, z10, map)) {
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdl(2, ljhVar));
                    com.bytedance.sdk.openadsdk.utils.mzz.qdl(ljhVar);
                    return true;
                }
                if (exuVarBo.lnr() != 2 || ljhVar.vxg() == 5 || ljhVar.vxg() == 15) {
                    if (exuVarBo.lnr() == 1 && !TextUtils.isEmpty(exuVarBo.ud())) {
                        strQdl = exuVarBo.ud();
                    } else {
                        strQdl = qdl(ljhVar);
                    }
                } else if (moVar != null) {
                    if (!moVar.qdl(ljhVar)) {
                        if (moVar.mml(ljhVar)) {
                            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str, "open_fallback_url", map);
                            com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdl(3, ljhVar));
                            com.bytedance.sdk.openadsdk.utils.mzz.qdl(ljhVar);
                            return true;
                        }
                        strQdl = qdl(exuVarBo, ljhVar);
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdl(3, ljhVar));
                    } else {
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str, "open_fallback_url", map);
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdl(3, ljhVar));
                        com.bytedance.sdk.openadsdk.utils.mzz.qdl(ljhVar);
                        return true;
                    }
                } else {
                    strQdl = qdl(exuVarBo, ljhVar);
                }
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str, "open_fallback_url", map);
            } else {
                strQdl = qdl(ljhVar);
            }
            String str2 = strQdl;
            if (ljhVar.ikv() == 0 && !TextUtils.isEmpty(str2) && str2.contains("play.google.com/store")) {
                String strSubstring = str2.substring(str2.indexOf("?id=") + 4);
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdl(4, ljhVar));
                boolean zQdl = com.bytedance.sdk.openadsdk.exc.qdl.qdl.mml.qdl(context, str2, strSubstring, str, ljhVar);
                if (zQdl) {
                    com.bytedance.sdk.openadsdk.utils.mzz.qdl(ljhVar);
                }
                return zQdl;
            }
            boolean zQdl2 = qdl(context, ljhVar, i10, pAGNativeAd, qdlVar, str, z10, str2);
            if (zQdl2) {
                com.bytedance.sdk.openadsdk.utils.mzz.qdl(ljhVar);
            }
            return zQdl2;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdl(1, ljhVar));
        return false;
    }

    private static String qdl(com.bytedance.sdk.openadsdk.core.model.exu exuVar, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (!TextUtils.isEmpty(exuVar.ud())) {
            return exuVar.ud();
        }
        return qdl(ljhVar);
    }

    private static String qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (ljhVar.uj() && ljhVar.aoy() != null) {
            return ljhVar.aoy().tvp();
        }
        return ljhVar.od();
    }

    public static boolean qdl(Context context, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i10, String str, boolean z10, Map<String, Object> map) {
        if (ljhVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.exu exuVarBo = ljhVar.bo();
        if (exuVarBo != null && !TextUtils.isEmpty(exuVarBo.qdl())) {
            if (map == null) {
                map = new HashMap<>();
            }
            Map<String, Object> map2 = map;
            String strQdl = exuVarBo.qdl();
            if (com.bytedance.sdk.openadsdk.exc.qdl.qdl.lnr.qdl()) {
                return com.bytedance.sdk.openadsdk.exc.qdl.qdl.lnr.qdl(context, strQdl, ljhVar, i10, map2, z10);
            }
            Uri uri = Uri.parse(strQdl);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            if (com.bytedance.sdk.openadsdk.utils.gy.mml(context)) {
                gy.ud udVarQdl = com.bytedance.sdk.openadsdk.utils.gy.qdl(context, intent);
                if (udVarQdl.f17854ud > 0) {
                    if (yt.mml().to()) {
                        com.bytedance.sdk.openadsdk.utils.gy.qdl(ljhVar, str);
                    }
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    map2.put("can_query_install", 1);
                    map2.put("matched_count", Integer.valueOf(udVarQdl.f17854ud));
                    map2.put("url", strQdl);
                    ComponentName componentName = udVarQdl.qdl;
                    if (componentName != null) {
                        intent.setComponent(componentName);
                    }
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str, "open_url_app", map2);
                    try {
                        context.startActivity(intent);
                        com.bytedance.sdk.openadsdk.mml.exu.qdl().qdl(map2).qdl(ljhVar, str);
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl("dp_start_act_success", ljhVar, str, map2);
                        return true;
                    } catch (Exception e10) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("exception", e10.getMessage());
                            jSONObject.put(n.f66171o, intent.toString());
                            jSONObject.put("can_query_install", 1);
                        } catch (Exception unused) {
                        }
                        mml.qdl(ljhVar, str, -4, jSONObject);
                        if (!yt.mml().to()) {
                            qdl(context, ljhVar.od(), ljhVar, i10, str, z10);
                        }
                        return false;
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(n.f66171o, intent.toString());
                    jSONObject2.put("can_query_install", 1);
                } catch (Exception unused2) {
                }
                mml.qdl(ljhVar, str, -3, jSONObject2);
            } else {
                try {
                    if (yt.mml().to()) {
                        com.bytedance.sdk.openadsdk.utils.gy.qdl(ljhVar, str);
                    }
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    map2.put("can_query_install", 0);
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str, "open_url_app", map2);
                    context.startActivity(intent);
                    com.bytedance.sdk.openadsdk.mml.exu.qdl().qdl(map2).qdl(ljhVar, str);
                    return true;
                } catch (Throwable unused3) {
                }
            }
            return false;
        }
        mml.qdl(ljhVar, str, exuVarBo == null ? -1 : -2, exuVarBo != null ? exuVarBo.mml() : null);
        return false;
    }

    public static boolean qdl(Context context, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i10, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.mml.qdl qdlVar, String str, boolean z10, String str2) {
        if (TextUtils.isEmpty(str2) && !com.bytedance.sdk.openadsdk.core.model.vu.ud(ljhVar)) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdl(5, ljhVar));
            return false;
        }
        int iYgv = ljhVar.ygv();
        if (iYgv != 2 && iYgv != 8) {
            com.bytedance.sdk.component.utils.ud.qdl(context, qdl(context, str2, ljhVar, i10, pAGNativeAd, qdlVar, str, z10), null);
            qdl = false;
            return true;
        }
        return com.bytedance.sdk.openadsdk.utils.oth.qdl(context, str2, ljhVar, ud.qdl.qdl);
    }

    public static void qdl(Context context, String str, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i10, String str2, boolean z10) {
        com.bytedance.sdk.component.utils.ud.qdl(context, qdl(context, str, ljhVar, i10, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.mml.qdl) null, str2, z10), null);
    }

    public static void qdl(Context context, String str, final com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i10, final String str2, boolean z10, exc excVar) {
        com.bytedance.sdk.component.utils.ud.qdl(context, qdl(context, str, ljhVar, i10, null, null, str2, z10, true, excVar), new ud.InterfaceC0240ud() { // from class: com.bytedance.sdk.openadsdk.core.fco.1
            @Override // com.bytedance.sdk.component.utils.ud.InterfaceC0240ud
            public void qdl() {
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str2, 3, (JSONObject) null);
            }

            @Override // com.bytedance.sdk.component.utils.ud.InterfaceC0240ud
            public void qdl(Throwable th2) {
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str2, -2, (JSONObject) null);
            }
        });
    }

    private static Intent qdl(Context context, String str, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i10, @Nullable PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.mml.qdl qdlVar, String str2, boolean z10) {
        return qdl(context, str, ljhVar, i10, pAGNativeAd, qdlVar, str2, z10, false, null);
    }

    public static boolean qdl(Context context, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str, int i10, int i11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", i11);
            com.bytedance.sdk.openadsdk.mml.lnr.mo(ljhVar, str, jSONObject);
            Intent intentQdl = qdl(context, ljhVar, str, i10);
            if (intentQdl == null) {
                return false;
            }
            return com.bytedance.sdk.component.utils.ud.qdl(context, intentQdl, null, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Intent qdl(Context context, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str, int i10) {
        if (context == null || ljhVar == null || !com.bytedance.sdk.openadsdk.core.model.vu.ud(ljhVar)) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
        intent.putExtra("ad_pending_download", false);
        String strRq = com.bytedance.sdk.openadsdk.core.model.vu.rq(ljhVar);
        if (!TextUtils.isEmpty(strRq)) {
            if (strRq.contains("?")) {
                strRq = strRq + "&orientation=portrait";
            } else {
                strRq = strRq + "?orientation=portrait";
            }
        }
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            intent.putExtra("url", strRq);
            intent.putExtra("event_tag", str);
            intent.putExtra("source", i10);
            intent.putExtra("gecko_id", ljhVar.xmr());
            intent.putExtra("web_title", ljhVar.gsv());
            intent.putExtra(z.C0835z.f67724y, ljhVar.yre());
            intent.putExtra("log_extra", ljhVar.ir());
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, ljhVar.rdz().toString());
            return intent;
        }
        ljhVar.mzz(strRq);
        ljhVar.mo(str);
        ljhVar.ud(i10);
        intent.putExtra("meta_index", koa.qdl().qdl(ljhVar));
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Intent qdl(Context context, String str, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i10, @Nullable PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.mml.qdl qdlVar, String str2, boolean z10, boolean z11, exc excVar) {
        Intent intent;
        if (!z11 && com.bytedance.sdk.openadsdk.core.model.vu.ud(ljhVar) && (pAGNativeAd != 0 || qdlVar != null)) {
            intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
            boolean zQdl = qdl(ljhVar, z10);
            intent.putExtra("ad_pending_download", zQdl);
            String strRq = com.bytedance.sdk.openadsdk.core.model.vu.rq(ljhVar);
            if (!TextUtils.isEmpty(strRq)) {
                if (strRq.contains("?")) {
                    str = strRq + "&orientation=portrait";
                } else {
                    str = strRq + "?orientation=portrait";
                }
            }
            ljhVar.ud(zQdl);
        } else if (!z11 && ljhVar.ygv() == 3 && ((ljhVar.taz() == 2 || (ljhVar.taz() == 1 && qdl)) && !ljhVar.cwa())) {
            intent = new Intent(context, (Class<?>) TTVideoLandingPageLink2Activity.class);
        } else {
            intent = new Intent(context, (Class<?>) TTLandingPageActivity.class);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            intent.putExtra("url", str);
            intent.putExtra("event_tag", str2);
            intent.putExtra("source", i10);
            intent.putExtra("gecko_id", ljhVar.xmr());
            if (!z11 || excVar == null) {
                intent.putExtra("web_title", ljhVar.gsv());
            } else {
                intent.putExtra("web_title", excVar.ud());
                intent.putExtra("only_loading", excVar.qdl());
            }
            intent.putExtra(z.C0835z.f67724y, ljhVar.yre());
            intent.putExtra("log_extra", ljhVar.ir());
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, ljhVar.rdz().toString());
        } else {
            if (z11 && excVar != null) {
                ljhVar.aaj(excVar.ud());
                ljhVar.qdl(excVar.qdl());
            }
            ljhVar.mzz(str);
            ljhVar.mo(str2);
            ljhVar.ud(i10);
            intent.putExtra("meta_index", koa.qdl().qdl(ljhVar));
        }
        if (ljhVar.vxg() == 5 || ljhVar.vxg() == 15 || ljhVar.vxg() == 50) {
            com.bytedance.sdk.openadsdk.multipro.ud.qdl qdlVarLnr = null;
            if (pAGNativeAd != 0) {
                if (pAGNativeAd instanceof qdl.InterfaceC0295qdl) {
                    qdlVarLnr = ((qdl.InterfaceC0295qdl) pAGNativeAd).mo();
                } else if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.qdl.ud.qdl.ud) {
                    qdlVarLnr = ((com.bytedance.sdk.openadsdk.qdl.ud.qdl.ud) pAGNativeAd).ud();
                }
                if (qdlVarLnr != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, qdlVarLnr.qdl().toString());
                }
            }
            if (qdlVar != null && qdlVar.ud() && (qdlVarLnr = qdlVar.lnr()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, qdlVarLnr.qdl().toString());
            }
            if (qdlVarLnr != null) {
                intent.putExtra("video_is_auto_play", qdlVarLnr.mml);
                if (com.bytedance.sdk.component.utils.bjy.mml()) {
                    qdlVarLnr.qdl().toString();
                }
            }
        }
        return intent;
    }

    private static boolean qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, boolean z10) {
        if (z10 && ljhVar != null && ljhVar.ygv() == 4) {
            return com.bytedance.sdk.openadsdk.core.model.vu.ud(ljhVar);
        }
        return false;
    }
}
