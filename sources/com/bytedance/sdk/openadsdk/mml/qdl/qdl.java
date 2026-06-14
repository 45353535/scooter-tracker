package com.bytedance.sdk.openadsdk.mml.qdl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.fs;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.bch;
import com.bytedance.sdk.openadsdk.utils.bqt;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.vu;
import com.ironsource.N6;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.taurusx.tax.g.e0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private final Context lnr;
    private final boolean mml;
    private final String mzz;
    private long qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f17732ud;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.mml.qdl.qdl$qdl, reason: collision with other inner class name */
    private static class C0291qdl {
        private static final qdl qdl = new qdl();
    }

    private boolean lnr() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private int mml() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / Constants.ONE_HOUR;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    private String mo() {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (bqt.mzz()) {
                sb2.append("MIUI-");
            } else if (bqt.ud()) {
                sb2.append("FLYME-");
            } else {
                String strRdp = bqt.rdp();
                if (bqt.qdl(strRdp)) {
                    sb2.append("EMUI-");
                }
                if (!TextUtils.isEmpty(strRdp)) {
                    sb2.append(strRdp);
                    sb2.append(TokenBuilder.TOKEN_DELIMITER);
                }
            }
            sb2.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb2.toString();
    }

    private String mzz() {
        return DeviceUtils.lnr(this.lnr) ? "tv" : DeviceUtils.ud(this.lnr) ? "android_pad" : "android";
    }

    public static qdl qdl() {
        return C0291qdl.qdl;
    }

    public List<com.bytedance.sdk.openadsdk.mml.qdl> ud(List<com.bytedance.sdk.openadsdk.mml.qdl> list) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.mml.qdl qdlVar : list) {
            try {
                JSONObject jSONObjectLnr = qdlVar.lnr();
                jSONObjectLnr.putOpt("_ad_staging_flag", 1);
                arrayList.add(new com.bytedance.sdk.openadsdk.mml.qdl(qdlVar.qdl, jSONObjectLnr));
            } catch (Exception e10) {
                aaj.lnr("AdLogParamsGenerate", e10.getMessage());
            }
        }
        return arrayList;
    }

    private qdl() {
        this.mml = lnr();
        this.lnr = yt.qdl().getApplicationContext();
        this.mzz = mzz();
    }

    public String qdl(List<com.bytedance.sdk.openadsdk.mml.qdl> list) {
        return gy.mzz((list.size() <= 0 || list.get(0) == null || list.get(0).lnr() == null) ? "" : list.get(0).lnr().optString("app_log_url"));
    }

    private void qdl(com.bytedance.sdk.openadsdk.mml.qdl qdlVar, boolean z10) {
        if (qdlVar == null) {
            return;
        }
        try {
            String strOptString = z10 ? qdlVar.lnr().optJSONObject("params").optString("log_extra", "") : qdlVar.lnr().optString("log_extra", "");
            long jQdl = ljh.qdl(strOptString);
            int iMml = ljh.mml(strOptString);
            if (jQdl == 0) {
                jQdl = this.qdl;
            }
            this.qdl = jQdl;
            if (iMml == 0) {
                iMml = this.f17732ud;
            }
            this.f17732ud = iMml;
        } catch (Exception e10) {
            aaj.lnr("AdLogParamsGenerate", "getInfoFromLogExtra exception", e10.getMessage());
        }
    }

    @SuppressLint({"HardwareIds"})
    public JSONObject ud() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(N6.f41375d0, gy.mml());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", gy.jpc());
            jSONObject.put("sim_op", qdl(this.lnr));
            jSONObject.put("root", this.mml ? 1 : 0);
            jSONObject.put("timezone", mml());
            jSONObject.put("access", bch.qdl(this.lnr));
            jSONObject.put("os", "Android");
            jSONObject.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put(CommonUrlParts.DEVICE_TYPE, this.mzz);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("language", Locale.getDefault().getLanguage());
            jSONObject.put("resolution", ax.mzz(this.lnr) + "x" + ax.lnr(this.lnr));
            jSONObject.put("display_density", qdl(ax.to(this.lnr)));
            jSONObject.put("density_dpi", ax.to(this.lnr));
            jSONObject.put("aid", "1371");
            jSONObject.put("device_id", fs.qdl(this.lnr));
            jSONObject.put("rom", mo());
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("ut", this.f17732ud);
            jSONObject.put(e0.f66120c, this.qdl);
            jSONObject.put("google_aid", com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().ud());
            jSONObject.put("locale_language", DeviceUtils.mml());
            jSONObject.put("screen_bright", Math.ceil(DeviceUtils.mzz() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !DeviceUtils.ud() ? 1 : 0);
            com.bytedance.sdk.openadsdk.core.settings.rq rqVarMml = yt.mml();
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.ljh.qdl(this.lnr, "tt_choose_language"));
            if (rqVarMml.bqt("mnc")) {
                jSONObject.put("mnc", vu.lnr());
            }
            if (rqVarMml.bqt("mcc")) {
                jSONObject.put("mcc", vu.ud());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public JSONObject qdl(List<com.bytedance.sdk.openadsdk.mml.qdl> list, long j10, JSONObject jSONObject, boolean z10) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            qdl(list.get(0), z10);
            jSONObject2.put(POBCTAOverlayData.KEY_CTA_HEADER, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<com.bytedance.sdk.openadsdk.mml.qdl> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().qdl(z10));
            }
            if (z10) {
                jSONObject2.put("event_v3", jSONArray);
                jSONObject2.put("magic_tag", "ss_app_log");
            } else {
                jSONObject2.put("event", jSONArray);
            }
            jSONObject2.put("_gen_time", j10);
            jSONObject2.put("local_time", j10 / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public List<com.bytedance.sdk.openadsdk.mml.qdl> qdl(List<com.bytedance.sdk.openadsdk.mml.qdl> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.mml.qdl qdlVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObjectLnr = qdlVar.lnr();
                jSONObject.putOpt("event", jSONObjectLnr.optString("label"));
                long jOptLong = jSONObjectLnr.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(jOptLong));
                jSONObject.putOpt("datetime", com.bytedance.sdk.openadsdk.mml.mo.lnr.format(new Date(jOptLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> itKeys = jSONObjectLnr.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, jSONObjectLnr.opt(next));
                    }
                }
                if (z10) {
                    jSONObject2.putOpt("_ad_staging_flag", 3);
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new com.bytedance.sdk.openadsdk.mml.mo(qdlVar.qdl, jSONObject));
            } catch (Exception e10) {
                aaj.lnr("AdLogParamsGenerate", e10.getMessage());
            }
        }
        return arrayList;
    }

    private String qdl(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            return telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    private String qdl(int i10) {
        if (i10 == 120) {
            return "ldpi";
        }
        if (i10 == 160) {
            return "mdpi";
        }
        if (i10 == 240) {
            return "hdpi";
        }
        if (i10 == 320) {
            return "xhdpi";
        }
        if (i10 == 480) {
            return "xxhdpi";
        }
        if (i10 != 640) {
            return "mdpi";
        }
        return "xxxhdpi";
    }
}
