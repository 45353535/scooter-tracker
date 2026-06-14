package com.mbridge.msdk.setting;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.vungle.ads.internal.signals.SignalManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50604a = "j";

    class a extends com.mbridge.msdk.foundation.same.net.wrapper.d {
        a() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            if (jSONObject == null || !jSONObject.has(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I)) {
                return;
            }
            try {
                g0.a().a(jSONObject.getString(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I));
            } catch (Exception e10) {
                q0.b(j.f50604a, e10.getMessage());
            }
        }
    }

    class c extends com.mbridge.msdk.foundation.same.net.handler.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f50610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f50611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f50612d;

        c(Context context, String str, String str2) {
            this.f50610b = context;
            this.f50611c = str;
            this.f50612d = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void a(String str) {
            com.mbridge.msdk.foundation.same.net.utils.d.h().f48745r = false;
            q0.a(j.f50604a, "fetch CNDSettingHost failed, errorCode = " + str);
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void b(String str) {
            q0.a(j.f50604a, "fetch CNDSettingHost success, content = " + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host_ts", System.currentTimeMillis());
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host", str);
            for (String str2 : str.split(IOUtils.LINE_SEPARATOR_UNIX)) {
                if (!TextUtils.isEmpty(str2.trim()) && !com.mbridge.msdk.foundation.same.net.utils.d.h().f48748u.contains(str2.trim())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f48748u.add(str2.trim());
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f48751x.add(str2.trim());
                }
            }
            j.this.a(this.f50610b, this.f50611c, this.f50612d);
        }
    }

    private String b() {
        String str = com.mbridge.msdk.foundation.same.net.utils.d.h().f48746s ? com.mbridge.msdk.foundation.same.net.utils.d.h().R : com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f48746s && com.mbridge.msdk.foundation.same.net.utils.d.h().f48745r && com.mbridge.msdk.foundation.same.net.utils.d.h().f48750w < com.mbridge.msdk.foundation.same.net.utils.d.h().f48751x.size()) {
                String str2 = com.mbridge.msdk.foundation.same.net.utils.d.h().f48751x.get(com.mbridge.msdk.foundation.same.net.utils.d.h().f48750w);
                if (!TextUtils.isEmpty(str2)) {
                    if (!str2.startsWith("http")) {
                        if (str2.startsWith("https")) {
                        }
                    }
                    return str2 + "/setting";
                }
            }
        } catch (Throwable th2) {
            q0.b(f50604a, th2.getMessage());
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a();
        } catch (Throwable th2) {
            q0.b(f50604a, th2.getMessage());
        }
    }

    public void d(Context context, String str, String str2) {
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f48745r) {
                return;
            }
            com.mbridge.msdk.foundation.same.net.utils.d.h().f48745r = true;
            if (System.currentTimeMillis() >= com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("mkey_spare_host_ts").longValue() + SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host");
                if (!TextUtils.isEmpty(strA)) {
                    for (String str3 : strA.split(IOUtils.LINE_SEPARATOR_UNIX)) {
                        if (!TextUtils.isEmpty(str3.trim()) && !com.mbridge.msdk.foundation.same.net.utils.d.h().f48748u.contains(str3.trim())) {
                            com.mbridge.msdk.foundation.same.net.utils.d.h().f48748u.add(str3.trim());
                            com.mbridge.msdk.foundation.same.net.utils.d.h().f48751x.add(str3.trim());
                        }
                    }
                    a(context, str, str2);
                    return;
                }
            }
            new com.mbridge.msdk.foundation.same.net.wrapper.c(context.getApplicationContext()).get(0, com.mbridge.msdk.foundation.same.net.utils.d.h().f48726c, new com.mbridge.msdk.foundation.same.net.wrapper.e(), new c(context, str, str2), "setting", 60000L);
        } catch (Throwable th2) {
            com.mbridge.msdk.foundation.same.net.utils.d.h().f48745r = false;
            q0.b(f50604a, th2.getMessage());
        }
    }

    public void c(Context context, String str, String str2) {
        a(context, str, str2, "1", new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2) {
        if (!com.mbridge.msdk.foundation.same.net.utils.d.h().g()) {
            d(context, str, str2);
        } else {
            b(context, str, str2);
        }
    }

    public void a(Context context, String str, String str2, String str3, com.mbridge.msdk.foundation.same.net.wrapper.d dVar) {
        if (context == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        eVar.a("app_id", str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        try {
            g gVarB = h.b().b(str);
            String strW0 = gVarB.w0();
            if (TextUtils.isEmpty(strW0)) {
                strW0 = "";
            }
            eVar.a("vtag", strW0);
            eVar.a("current_pipeline_id", String.valueOf(gVarB.Z()));
        } catch (Throwable th2) {
            q0.b(f50604a, th2.getMessage());
        }
        if (com.mbridge.msdk.foundation.same.net.utils.d.h().f48745r) {
            eVar.a("st_net", com.mbridge.msdk.foundation.same.net.utils.d.h().f48747t + "");
        }
        eVar.a("only_p_info", str3);
        com.mbridge.msdk.setting.net.c cVar = new com.mbridge.msdk.setting.net.c(context);
        String str4 = com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f48746s && com.mbridge.msdk.foundation.same.net.utils.d.h().f48745r && com.mbridge.msdk.foundation.same.net.utils.d.h().f48750w < com.mbridge.msdk.foundation.same.net.utils.d.h().f48751x.size()) {
                String str5 = com.mbridge.msdk.foundation.same.net.utils.d.h().f48751x.get(com.mbridge.msdk.foundation.same.net.utils.d.h().f48750w);
                if (!TextUtils.isEmpty(str5) && (str5.startsWith("http") || str5.startsWith("https"))) {
                    str4 = str5 + "/setting";
                }
            }
        } catch (Throwable th3) {
            q0.b(f50604a, th3.getMessage());
        }
        cVar.get(1, str4, eVar, dVar, "setting", 60000L);
    }

    public void b(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        a(context, str, str2, "0", new b(str, context, str2));
        a(3, 0, "");
    }

    class d extends com.mbridge.msdk.foundation.same.net.wrapper.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f50614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f50615c;

        d(String str, String str2) {
            this.f50614b = str;
            this.f50615c = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            try {
                if (v0.a(jSONObject)) {
                    String strOptString = jSONObject.optString("vtag", "");
                    String strOptString2 = jSONObject.optString("rid", "");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("unitSetting");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
                        if (jSONObject.optInt("vtag_status", 0) == 1) {
                            String strF = h.b().f(this.f50614b, this.f50615c);
                            if (!TextUtils.isEmpty(strF)) {
                                try {
                                    jSONObjectOptJSONObject = h.b().a(new JSONObject(strF), jSONObjectOptJSONObject);
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                            }
                        }
                        jSONObjectOptJSONObject.put("current_time", System.currentTimeMillis());
                        jSONObjectOptJSONObject.put("vtag", strOptString);
                        jSONObjectOptJSONObject.put("rid", strOptString2);
                        h.b().a(this.f50614b, this.f50615c, jSONObjectOptJSONObject.toString());
                    }
                } else {
                    h.b().j(this.f50614b, this.f50615c);
                }
                j.this.a(1, 1, "");
            } catch (Exception e11) {
                q0.b(j.f50604a, e11.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            j.this.a(2, 1, "");
        }
    }

    class b extends com.mbridge.msdk.foundation.same.net.wrapper.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f50606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f50607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f50608d;

        b(String str, Context context, String str2) {
            this.f50606b = str;
            this.f50607c = context;
            this.f50608d = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            try {
                j.this.a(1, 0, "");
            } catch (Throwable th2) {
                q0.b(j.f50604a, th2.getMessage());
            }
            try {
                if (v0.a(jSONObject)) {
                    if (jSONObject.optInt("vtag_status", 0) == 1) {
                        String strE = h.b().e(this.f50606b);
                        if (!TextUtils.isEmpty(strE)) {
                            try {
                                jSONObject = h.b().a(new JSONObject(strE), jSONObject);
                            } catch (Exception e10) {
                                q0.b(j.f50604a, e10.getMessage());
                            }
                        }
                    }
                    k.a(jSONObject);
                    jSONObject.put("current_time", System.currentTimeMillis());
                    if (com.mbridge.msdk.foundation.same.net.utils.d.h().f48746s) {
                        if (TextUtils.isEmpty(jSONObject.optString("hst_st_t"))) {
                            jSONObject.put("hst_st_t", com.mbridge.msdk.foundation.same.net.utils.d.h().f48740m);
                        }
                    } else if (TextUtils.isEmpty(jSONObject.optString("hst_st"))) {
                        jSONObject.put("hst_st", com.mbridge.msdk.foundation.same.net.utils.d.h().f48736i);
                    }
                    h.b().h(this.f50606b, jSONObject.toString());
                    com.mbridge.msdk.foundation.same.net.utils.d.h().j();
                    k.a();
                    try {
                        if (!TextUtils.isEmpty(jSONObject.optString("mraid_js"))) {
                            com.mbridge.msdk.setting.util.a.a().a(this.f50607c, jSONObject.optString("mraid_js"));
                        }
                    } catch (Exception e11) {
                        q0.b(j.f50604a, e11.getMessage());
                    }
                    if (!TextUtils.isEmpty(jSONObject.optString("web_env_url"))) {
                        com.mbridge.msdk.setting.util.b.c().a(this.f50607c, jSONObject.optString("web_env_url"));
                    }
                    j.this.a(this.f50607c, this.f50606b);
                } else {
                    h.b().h(this.f50606b);
                }
                j.this.c();
            } catch (Exception e12) {
                q0.b(j.f50604a, e12.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            try {
                j.this.a(2, 0, str);
            } catch (Throwable th2) {
                q0.b(j.f50604a, th2.getMessage());
            }
            if (!com.mbridge.msdk.foundation.same.net.utils.d.h().f48746s) {
                com.mbridge.msdk.foundation.same.net.utils.d.h().f48749v++;
            } else {
                com.mbridge.msdk.foundation.same.net.utils.d.h().f48750w++;
            }
            j.this.a(this.f50607c, this.f50606b, this.f50608d);
            j.this.c();
            q0.b(j.f50604a, "get app setting error" + str);
        }
    }

    public void a(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = com.mbridge.msdk.foundation.controller.c.n().b();
            str2 = com.mbridge.msdk.foundation.controller.c.n().c();
        }
        if (h.b().g(str3, str) && h.b().a(str, 2, str3)) {
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            String str4 = C4240b4.j.f42672d + str3 + C4240b4.j.f42674e;
            eVar.a("unit_ids", str4);
            eVar.a("app_id", str);
            eVar.a("sign", SameMD5.getMD5(str + str2));
            try {
                String strJ = h.b().d(str, str4).J();
                if (TextUtils.isEmpty(strJ)) {
                    strJ = "";
                }
                eVar.a("vtag", strJ);
            } catch (Throwable th2) {
                q0.b(f50604a, th2.getMessage());
            }
            d dVar = new d(str, str3);
            dVar.setUnitId(str3);
            new com.mbridge.msdk.setting.net.c(context).get(1, com.mbridge.msdk.foundation.same.net.utils.d.h().Q, eVar, dVar, "setting", 60000L);
            a(3, 1, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str) {
        g gVarD;
        h hVarB = h.b();
        if (hVarB != null && (gVarD = hVarB.d(str)) != null) {
            MBridgeConstans.OMID_JS_SERVICE_URL = gVarD.U();
            MBridgeConstans.OMID_JS_H5_URL = gVarD.T();
        }
        com.mbridge.msdk.omsdk.b.b(context);
        com.mbridge.msdk.omsdk.b.c(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, String str) {
        String strB;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(C4240b4.i.W, "2000112");
            eVar.a("st_net", Integer.valueOf(com.mbridge.msdk.foundation.same.net.utils.d.h().f48747t));
            eVar.a("result", Integer.valueOf(i10));
            eVar.a("type", Integer.valueOf(i11));
            if (i11 == 0) {
                strB = b();
            } else {
                strB = com.mbridge.msdk.foundation.same.net.utils.d.h().f48746s ? com.mbridge.msdk.foundation.same.net.utils.d.h().R : com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
            }
            eVar.a("url", strB);
            eVar.a("reason", str);
            cVar.a("2000112", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000112", cVar);
        } catch (Throwable th2) {
            q0.b(f50604a, th2.getMessage());
        }
    }
}
