package com.bytedance.sdk.openadsdk.bjy;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.bjy.qdl.mml;
import com.bytedance.sdk.openadsdk.core.fs;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.settings.rq;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.ironsource.C4240b4;
import com.taurusx.tax.y.z.w.s;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    private static volatile lnr qdl;

    private lnr() {
    }

    private boolean lnr(mml mmlVar) {
        return mmlVar == null;
    }

    public static void mml() {
        qdl("disk_log", false, new ud() { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.9
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j10 = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long jQdl = lnr.qdl(file2);
                        j10 += jQdl;
                        jSONObject.put(file2.getName(), jQdl);
                    }
                }
                if (j10 < 524288000) {
                    return null;
                }
                return mml.ud().qdl("disk_log").ud(jSONObject.toString());
            }
        });
    }

    public static lnr qdl() {
        if (qdl == null) {
            synchronized (lnr.class) {
                try {
                    if (qdl == null) {
                        qdl = new lnr();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return qdl;
    }

    public static void ud(final ljh ljhVar) {
        if (gy.qdl(ljhVar) == null || TextUtils.isEmpty(ljhVar.xmr())) {
            return;
        }
        qdl("download_gecko_start", false, new ud() { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.15
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            @Nullable
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", ljhVar.od());
                jSONObject.put("channel_name", ljhVar.xmr());
                return mml.ud().qdl("download_gecko_start").qdl(ljhVar.ok()).ud(jSONObject.toString());
            }
        });
    }

    public void lnr() {
        qdl("blind_mode_status", true, new ud() { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.7
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                return mml.ud().qdl("blind_mode_status");
            }
        });
    }

    public void ud(final mml mmlVar) {
        if (lnr(mmlVar)) {
            return;
        }
        mmlVar.qdl("show_backup_endcard");
        yt.mzz().qdl(new ud() { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.18
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                return mmlVar;
            }
        });
    }

    public static void qdl(final ljh ljhVar) {
        if (ljhVar == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        qdl("bidding_receive", false, new ud() { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.1
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            @Nullable
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", jCurrentTimeMillis);
                if (ljhVar.ok() == 3) {
                    jSONObject.put("is_icon_only", ljhVar.xmv() ? 1 : 0);
                }
                return mml.ud().qdl("bidding_receive").ud(jSONObject.toString());
            }
        });
    }

    public static void ud() {
        fco.lnr(new jpc("showFailLog") { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    lnr.qdl().qdl("show_fail_log", new JSONObject());
                } catch (Throwable th2) {
                    aaj.lnr("StatsLogManager", th2.getMessage());
                }
            }
        });
    }

    public static void qdl(ljh ljhVar, final long j10) {
        if (ljhVar == null) {
            return;
        }
        qdl("bidding_load", false, new ud() { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.10
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            @Nullable
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j10);
                return mml.ud().qdl("bidding_load").ud(jSONObject.toString());
            }
        });
    }

    public static void qdl(final String str, final com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar) {
        if (qdlVar == null) {
            return;
        }
        qdl(str, false, new ud() { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.14
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            @Nullable
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObjectLnr = qdlVar.lnr();
                if (jSONObjectLnr == null) {
                    jSONObjectLnr = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.mml.mzz.ud.lnr lnrVarMml = qdlVar.mml();
                if (lnrVarMml != null) {
                    lnrVarMml.qdl(jSONObjectLnr);
                }
                return mml.ud().qdl(str).qdl(qdlVar.qdl().ok()).ud(jSONObjectLnr.toString());
            }
        });
    }

    public static void qdl(final ljh ljhVar, final JSONObject jSONObject) {
        if (gy.qdl(ljhVar) == null || TextUtils.isEmpty(ljhVar.xmr())) {
            return;
        }
        qdl("download_gecko_end", false, new ud() { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.16
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            @Nullable
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", ljhVar.od());
                jSONObject2.put("channel_name", ljhVar.xmr());
                jSONObject2.put("data", jSONObject);
                return mml.ud().qdl("download_gecko_end").qdl(ljhVar.ok()).ud(jSONObject2.toString());
            }
        });
    }

    public void qdl(final mml mmlVar) {
        if (lnr(mmlVar)) {
            return;
        }
        mmlVar.qdl("express_ad_render");
        yt.mzz().qdl(new ud() { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.17
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                return mmlVar;
            }
        });
    }

    public void qdl(final String str) {
        qdl("click_playable_test_tool", false, new ud() { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.2
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return mml.ud().qdl("click_playable_test_tool").ud(jSONObject.toString());
            }
        });
    }

    public void qdl(final String str, final int i10, final String str2) {
        qdl("use_playable_test_tool_error", false, new ud() { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.3
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_message", str2);
                } catch (Throwable unused) {
                }
                return mml.ud().qdl("use_playable_test_tool_error").ud(jSONObject.toString());
            }
        });
    }

    public void qdl(final long j10, final long j11) {
        final long j12 = j11 - j10;
        qdl("general_label", false, new ud() { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.4
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                int i10 = !rdp.f17417ud.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j10);
                    jSONObject.put("endtime", j11);
                    jSONObject.put("start_type", i10);
                } catch (Throwable unused) {
                }
                return mml.ud().qdl("general_label").jpc(String.valueOf(j12)).ud(jSONObject.toString());
            }
        });
    }

    public void qdl(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        qdl(str, false, new ud() { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.6
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                return mml.ud().qdl(str).ud(jSONObject.toString());
            }
        });
    }

    public void qdl(final JSONObject jSONObject) {
        if (jSONObject == null) {
            aaj.qdl("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object objOpt = jSONObject.opt("device_ad_mediation_platform");
        if (!(objOpt instanceof String) || TextUtils.isEmpty((String) objOpt)) {
            aaj.qdl("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
        } else {
            aaj.qdl("adRevenuePangle", "pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            qdl("ad_revenue", true, new ud() { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.8
                @Override // com.bytedance.sdk.openadsdk.bjy.ud
                public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                    try {
                        jSONObject.put("event", 272);
                        jSONObject.put(CommonUrlParts.UUID, fs.lnr(yt.qdl()));
                        String strQdl = "";
                        try {
                            if (fs.qdl(yt.qdl()) != null) {
                                strQdl = fs.qdl(yt.qdl());
                            }
                        } catch (Throwable th2) {
                            th2.getMessage();
                        }
                        jSONObject.put("device_id", strQdl);
                        jSONObject.put("platform", "android");
                        jSONObject.put("partner", "PangleSDK");
                    } catch (Throwable th3) {
                        th3.getMessage();
                    }
                    return mml.ud().qdl("ad_revenue").ud(jSONObject.toString());
                }
            });
        }
    }

    public static long qdl(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long jQdl = 0;
        for (File file2 : file.listFiles()) {
            jQdl += qdl(file2);
        }
        return jQdl;
    }

    public static void qdl(String str, boolean z10, ud udVar) {
        qdl(str, z10, 100, udVar);
    }

    public static void qdl(String str, boolean z10, int i10, ud udVar) {
        int iQdl = rq.lnr().qdl(str, i10);
        if (TextUtils.isEmpty(str) || iQdl == 0 || udVar == null) {
            return;
        }
        boolean z11 = iQdl == 100;
        if (!z11) {
            z11 = ((int) ((Math.random() * 100.0d) + 1.0d)) <= iQdl;
        }
        if (z11) {
            yt.mzz().qdl(udVar, z10);
        }
    }

    public static void qdl(long j10, long j11, final String str, final int i10) {
        if (j10 == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long j12 = jElapsedRealtime - j10;
        final long j13 = jElapsedRealtime - j11;
        final long j14 = j11 - j10;
        qdl("ad_show_cost_time", false, new ud() { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.11
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j12);
                jSONObject.put("renderDuration", j13);
                jSONObject.put("showToRenderDuration", j14);
                jSONObject.put(s.z.f67720z, str);
                jSONObject.put("renderType", i10);
                return mml.ud().qdl("ad_show_cost_time").ud(jSONObject.toString());
            }
        });
    }

    public static void qdl(int i10, String str) {
        qdl(i10, str, 0, (String) null);
    }

    public static void qdl(final int i10, final String str, final int i11, final String str2) {
        qdl("ipv6_req", false, (ud) new ud<com.bytedance.sdk.openadsdk.bjy.qdl.lnr>() { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.12
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            @Nullable
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i12 = i10;
                if (i12 == 1) {
                    str3 = "success";
                } else if (i12 == -1) {
                    jSONObject.put("error_code", i11);
                    jSONObject.put("error_msg", str2);
                    str3 = C4240b4.g.f42582e;
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("status", str3);
                return mml.ud().qdl("ipv6_req").ud(jSONObject.toString());
            }
        });
    }

    public static void qdl(final String str, final boolean z10) {
        qdl("img_error_param", false, new ud() { // from class: com.bytedance.sdk.openadsdk.bjy.lnr.13
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            @Nullable
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z10 ? 1 : 0);
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
                } catch (Throwable unused) {
                }
                return mml.ud().qdl("img_error_param").ud(jSONObject.toString());
            }
        });
    }
}
