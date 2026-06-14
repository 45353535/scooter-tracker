package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.adjust.sdk.purchase.ADJPConstants;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.bqt;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.fs;
import com.bytedance.sdk.openadsdk.core.kdv;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.jyq;
import com.bytedance.sdk.openadsdk.utils.vu;
import com.ironsource.C4240b4;
import com.ironsource.N6;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.taurusx.tax.f.z;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class tvp extends com.bytedance.sdk.component.jpc.jpc {
    private final Set<mzz> lnr;
    private final qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final jpc f17480ud;

    public interface qdl {
        void qdl(boolean z10);
    }

    public tvp(qdl qdlVar, jpc jpcVar, mzz... mzzVarArr) {
        super("SetF");
        HashSet hashSet = new HashSet();
        this.lnr = hashSet;
        this.qdl = qdlVar;
        this.f17480ud = jpcVar;
        hashSet.addAll(Arrays.asList(mzzVarArr));
    }

    private JSONObject ud(JSONObject jSONObject) {
        return com.bytedance.sdk.component.utils.qdl.qdl(jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        Log.d("TTAD.SdkSettingsFetch", "Start Try");
        int iQdl = bqt.qdl(yt.qdl(), 0L);
        if (iQdl == 0) {
            Log.d("TTAD.SdkSettingsFetch", "No net");
            this.qdl.qdl(false);
            return;
        }
        JSONObject jSONObjectQdl = qdl(iQdl);
        com.bytedance.sdk.component.wd.ud.mml mmlVarUd = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().ud();
        try {
            mmlVarUd.ud(com.bytedance.sdk.openadsdk.jpc.mml.qdl(mmlVarUd, gy.qdl("/api/ad/union/sdk/settings/", false, true)));
            mmlVarUd.ud("User-Agent", gy.mml());
        } catch (Exception unused) {
        }
        String string = ud(jSONObjectQdl).toString();
        if (yt.mml().car() && kdv.qdl().mml() == 1) {
            gy.qdl("Pangle_Debug_Mode", string, yt.qdl());
        }
        mmlVarUd.qdl(string, yt.mml().jl());
        mmlVarUd.qdl(6);
        mmlVarUd.qdl("setting");
        com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.settings.tvp.1
            @Override // com.bytedance.sdk.openadsdk.yt.mml
            public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                qdlVar.ud("settings_fetch");
                return qdlVar;
            }
        });
        mmlVarUd.qdl(new com.bytedance.sdk.component.wd.qdl.qdl() { // from class: com.bytedance.sdk.openadsdk.core.settings.tvp.2
            @Override // com.bytedance.sdk.component.wd.qdl.qdl
            public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, com.bytedance.sdk.component.wd.ud udVar) {
                JSONObject jSONObject;
                int iOptInt;
                int iQdl2 = udVar.qdl();
                String strMml = udVar.mml();
                if (yt.mml().car() && kdv.qdl().mml() == 1) {
                    gy.qdl("Pangle_Debug_Mode", strMml, yt.qdl());
                }
                if (!udVar.mo() || TextUtils.isEmpty(strMml)) {
                    com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.settings.tvp.2.2
                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                            com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                            qdlVar.ud("settings_fetch");
                            return qdlVar;
                        }
                    });
                    if (lnrVar != null) {
                        jyq.qdl(lnrVar.mml());
                    }
                } else {
                    String strLnr = null;
                    try {
                        jSONObject = new JSONObject(strMml);
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null && (iOptInt = jSONObject.optInt("cypher", -1)) != -1) {
                        if (iOptInt == 3) {
                            strLnr = com.bytedance.sdk.component.utils.qdl.lnr(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                            if (!TextUtils.isEmpty(strLnr)) {
                                try {
                                    jSONObject = new JSONObject(strLnr);
                                } catch (Throwable unused3) {
                                }
                            }
                        }
                        try {
                            tvp.this.qdl(strLnr, udVar.lnr());
                        } catch (Throwable unused4) {
                        }
                        try {
                            tvp.this.qdl(jSONObject);
                            yt.mml().qdl(System.currentTimeMillis());
                            com.bytedance.sdk.openadsdk.yt.lnr.ud(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.settings.tvp.2.1
                                @Override // com.bytedance.sdk.openadsdk.yt.mml
                                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                                    qdlVar.ud("settings_fetch");
                                    return qdlVar;
                                }
                            });
                            jyq.ud();
                        } catch (Throwable unused5) {
                        }
                        tvp.this.qdl.qdl(true);
                        return;
                    }
                }
                if (!udVar.mo()) {
                    com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("settings_fetch", lnrVar.mml(), iQdl2, udVar.ud());
                }
                tvp.this.qdl.qdl(false);
            }

            @Override // com.bytedance.sdk.component.wd.qdl.qdl
            public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, IOException iOException) {
                tvp.this.qdl.qdl(false);
                com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.settings.tvp.2.3
                    @Override // com.bytedance.sdk.openadsdk.yt.mml
                    public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                        com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                        qdlVar.ud("settings_fetch");
                        return qdlVar;
                    }
                });
                if (lnrVar != null) {
                    jyq.qdl(lnrVar.mml());
                    com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("settings_fetch", lnrVar.mml(), -1, iOException != null ? iOException.getMessage() : null);
                }
            }
        });
        com.bytedance.sdk.openadsdk.core.rq.ud(fs.qdl(yt.qdl()));
        DeviceUtils.fs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(String str, Map<String, String> map) {
        int i10 = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                HashMap map2 = new HashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        map2.put(key.toLowerCase(Locale.US), entry.getValue());
                    }
                }
                String str2 = (String) map2.get("active-control");
                if (str2 != null) {
                    int i11 = Integer.parseInt(str2);
                    String str3 = (String) map2.get("ts");
                    if (str3 != null) {
                        long j10 = Long.parseLong(str3);
                        String str4 = (String) map2.get("pst");
                        String strQdl = com.bykv.vk.openvk.qdl.qdl.qdl.wd.ud.qdl(str + i11 + j10);
                        if (strQdl != null) {
                            if (strQdl.equalsIgnoreCase(str4)) {
                                i10 = i11;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        wd.qdl(i10);
    }

    public static JSONObject qdl(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            rq rqVarMml = yt.mml();
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("device_city", gy.ljh());
            com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().qdl(jSONObject);
            jSONObject.put("gdpr", com.bytedance.sdk.openadsdk.core.tvp.ud().to());
            jSONObject.put("pa_consent", com.bytedance.sdk.openadsdk.core.tvp.ud().rq());
            if (rqVarMml.bqt("mcc")) {
                jSONObject.put("mcc", vu.ud());
            }
            Context contextQdl = yt.qdl();
            jSONObject.put("conn_type", gy.wd(i10));
            jSONObject.put("os", 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
            jSONObject.put("aos_api_level", Build.VERSION.SDK_INT);
            jSONObject.put(ADJPConstants.KEY_SDK_VERSION, BuildConfig.VERSION_NAME);
            jSONObject.put("language", fs.ud());
            jSONObject.put("time_zone", gy.xmv());
            jSONObject.put("package_name", gy.mo());
            jSONObject.put(C4240b4.i.L, gy.qdl() ? 1 : 2);
            jSONObject.put("app_version", gy.jpc());
            jSONObject.put(z.f66061c, Build.MANUFACTURER);
            jSONObject.put(CommonUrlParts.UUID, fs.lnr(contextQdl));
            String strMml = com.bytedance.sdk.openadsdk.core.tvp.ud().mml();
            if (strMml != null) {
                jSONObject.put("app_id", strMml);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put("ts", jCurrentTimeMillis);
            String strConcat = "";
            if (strMml != null) {
                strConcat = strMml.concat(String.valueOf(jCurrentTimeMillis)).concat(BuildConfig.VERSION_NAME);
            }
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.mzz.qdl(strConcat));
            jSONObject.put("tcstring", rq.ud(contextQdl));
            jSONObject.put("tcf_gdpr", rq.qdl(contextQdl));
            jSONObject.put(EidRequestBuilder.REQUEST_FIELD_LMT, DeviceUtils.lnr());
            jSONObject.put("locale_language", DeviceUtils.mml());
            jSONObject.put(AppsFlyerProperties.CHANNEL, C4240b4.i.Z);
            JSONObject jSONObjectWd = rqVarMml.wd();
            if (jSONObjectWd != null) {
                jSONObject.put("digest", jSONObjectWd);
            }
            jSONObject.put("data_time", rqVarMml.jpc());
            jSONObject.put(CommonUrlParts.APP_SET_ID_SCOPE, mml.ud());
            jSONObject.put(CommonUrlParts.APP_SET_ID, mml.lnr());
            jSONObject.put("installed_source", mml.mml());
            if (rqVarMml.bqt(N6.V0)) {
                jSONObject.put("did", fs.qdl(yt.qdl()));
            }
            jSONObject.put(N6.V0, com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().ud());
            String strWd = com.bytedance.sdk.openadsdk.core.tvp.ud().wd();
            if (!TextUtils.isEmpty(strWd)) {
                jSONObject.put("mediation", strWd);
            }
            jSONObject.put(C4240b4.i.G, DeviceUtils.qdl(contextQdl, true));
            jSONObject.put("adx_id", com.bytedance.sdk.openadsdk.core.tvp.ud().bch());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public boolean qdl(@NonNull JSONObject jSONObject) {
        this.f17480ud.qdl(jSONObject);
        for (mzz mzzVar : this.lnr) {
            if (mzzVar != null) {
                mzzVar.qdl(jSONObject);
            }
        }
        return this.f17480ud.lnr;
    }

    public static boolean qdl() {
        return BinderPoolService.qdl;
    }
}
