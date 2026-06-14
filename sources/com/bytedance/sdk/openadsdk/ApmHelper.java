package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.purchase.ADJPConstants;
import com.amazon.device.ads.DtbConstants;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.bch;
import com.bytedance.sdk.openadsdk.core.fs;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.settings.rq;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.multipro.mml.mml;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.ironsource.N6;
import com.ironsource.X1;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import net.pubnative.lite.sdk.models.Protocol;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ApmHelper {
    private static String lnr;
    private static boolean mml;
    private static qdl mo;
    private static ud mzz;
    private static volatile boolean qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static final AtomicBoolean f16748ud = new AtomicBoolean(false);

    private static class qdl {
        public final Throwable lnr;
        public final String qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public final String f16752ud;

        public qdl(String str, String str2, Throwable th2) {
            this.qdl = str;
            this.f16752ud = str2;
            this.lnr = th2;
        }
    }

    private interface ud {
        void qdl(String str, String str2, Throwable th2);
    }

    @NonNull
    public static Pair<String, String> generateRequestHeader() {
        String string = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(N6.V0, com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().ud());
            jSONObject.put("ipv6", mml.ud("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, ""));
            jSONObject.put("region", yt.mml().gt());
        } catch (JSONException unused) {
        }
        JSONObject jSONObjectEncryptType4WithNoWrapBase64 = PangleEncryptManager.encryptType4WithNoWrapBase64(jSONObject, new bch(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        String str = "0";
        if (jSONObjectEncryptType4WithNoWrapBase64 != null) {
            int iOptInt = jSONObjectEncryptType4WithNoWrapBase64.optInt("cypher");
            if (iOptInt == 4) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str = Protocol.VAST_1_0_WRAPPER;
            } else if (iOptInt == 3) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str = "3";
            } else {
                string = jSONObject.toString();
            }
        }
        return new Pair<>(str, string);
    }

    public static void initApm(final Context context, final InitConfig initConfig) {
        if (f16748ud.compareAndSet(false, true) && !qdl) {
            fco.qdl(new jpc("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!ApmHelper.qdl) {
                        rq rqVarMml = yt.mml();
                        boolean unused = ApmHelper.mml = rqVarMml.ji();
                        String strJl = gy.jl();
                        if (ApmHelper.mml && !TextUtils.isEmpty(strJl)) {
                            String unused2 = ApmHelper.lnr = initConfig.getAppId();
                            String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                            String strQdl = fs.qdl(context);
                            try {
                                Npth.setCrashWaitTime(com.bytedance.sdk.openadsdk.jyq.qdl.qdl("apm_crash_wait_time", 10000));
                                Npth.enableLoopMonitor(false);
                                Npth.enableAnrInfo(false);
                                Npth.enableNativeDump(false);
                                Npth.enableActivityDump(false);
                                Npth.enableMessageDump(false);
                                MonitorCrash.setCustomRequestHeaderCallback(new CustomRequestHeader() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                    @Override // com.apm.insight.CustomRequestHeader
                                    public void addRequestHeader(HttpURLConnection httpURLConnection) {
                                        Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
                                        httpURLConnection.setRequestProperty("cypher", (String) pairGenerateRequestHeader.first);
                                        httpURLConnection.setRequestProperty("transfer-param", (String) pairGenerateRequestHeader.second);
                                        httpURLConnection.setRequestProperty("x-pangle-target-idc", yt.mml().ca());
                                    }
                                });
                                final MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(context, "10000001", 7702L, BuildConfig.VERSION_NAME, strArr);
                                monitorCrashInitSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                    @Override // com.apm.insight.AttachUserData
                                    @Nullable
                                    public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                        Map<? extends String, ? extends String> mapJpc = ApmHelper.jpc();
                                        if (mapJpc.containsKey("render_type")) {
                                            monitorCrashInitSDK.addTags("render_type", mapJpc.get("render_type"));
                                            return mapJpc;
                                        }
                                        monitorCrashInitSDK.addTags("render_type", "-2");
                                        return mapJpc;
                                    }
                                });
                                if (rqVarMml.taz()) {
                                    monitorCrashInitSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                                }
                                monitorCrashInitSDK.config().setDeviceId(strQdl);
                                monitorCrashInitSDK.setReportUrl(strJl);
                                monitorCrashInitSDK.addTags("host_appid", ApmHelper.lnr);
                                monitorCrashInitSDK.addTags(ADJPConstants.KEY_SDK_VERSION, BuildConfig.VERSION_NAME);
                                ud unused3 = ApmHelper.mzz = new ud() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                    @Override // com.bytedance.sdk.openadsdk.ApmHelper.ud
                                    public void qdl(String str, String str2, Throwable th2) {
                                        monitorCrashInitSDK.reportCustomErr(str, str2, th2);
                                    }
                                };
                                boolean unused4 = ApmHelper.qdl = true;
                                ApmHelper.lnr(strQdl, strJl);
                                qdl qdlVar = ApmHelper.mo;
                                qdl unused5 = ApmHelper.mo = null;
                                if (qdlVar != null) {
                                    ApmHelper.mzz.qdl(qdlVar.qdl, qdlVar.f16752ud, qdlVar.lnr);
                                }
                            } catch (Throwable unused6) {
                                boolean unused7 = ApmHelper.qdl = false;
                            }
                        }
                    }
                    ApmHelper.f16748ud.set(false);
                }
            });
        }
    }

    public static boolean isIsInit() {
        return qdl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> jpc() {
        HashMap map = new HashMap();
        ljh ljhVarUd = com.bytedance.sdk.openadsdk.utils.ud.ud();
        if (ljhVarUd != null) {
            map.put("adType", String.valueOf(ljhVarUd.ok()));
            map.put("aid", String.valueOf(ljhVarUd.uhv()));
            map.put("cid", ljhVarUd.yre());
            map.put("reqId", ljhVarUd.cev());
            map.put("rit", ljhVarUd.kdv(X1.f42014f));
            int iRa = ljhVarUd.ra();
            if (ljhVarUd.dk() != 2) {
                iRa = -1;
            }
            map.put("render_type", String.valueOf(iRa));
        }
        return map;
    }

    public static void reportCustomError(String str, String str2, Throwable th2) {
        ud udVar = mzz;
        if (udVar != null) {
            udVar.qdl(str, str2, th2);
        } else {
            mo = new qdl(str, str2, th2);
        }
    }

    public static void reportPvFromBackGround() {
        if (mml) {
            ud(fs.qdl(yt.qdl()), gy.jl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lnr(String str, String str2) {
        ud(str, str2);
    }

    private static void ud(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        yt.lnr().qdl(ud(str), DtbConstants.HTTPS + str2 + "/monitor/collect/c/session?version_code=7702&device_platform=android&aid=10000001");
    }

    private static JSONObject ud(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put(ADJPConstants.KEY_SDK_VERSION, BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", lnr);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put("os", "Android");
            jSONObject2.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("apm_id", "20000001");
            jSONObject.putOpt(POBCTAOverlayData.KEY_CTA_HEADER, jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
            return jSONObject;
        } catch (JSONException e10) {
            aaj.lnr("ApmHelper", e10.getMessage());
            return jSONObject;
        }
    }
}
