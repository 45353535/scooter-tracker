package com.mbridge.msdk.videocommon.net;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.setting.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f53264a = "com.mbridge.msdk.videocommon.net.a";

    public void a(Context context, String str, String str2) {
        e eVar = new e();
        eVar.a("app_id", str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        try {
            com.mbridge.msdk.videocommon.setting.a aVarD = com.mbridge.msdk.videocommon.setting.b.b().d();
            if (aVarD == null) {
                eVar.a("vtag", "");
            } else {
                String strJ = aVarD.j();
                if (TextUtils.isEmpty(strJ)) {
                    strJ = "";
                }
                eVar.a("vtag", strJ);
            }
        } catch (Throwable th2) {
            q0.b(f53264a, th2.getMessage());
        }
        new com.mbridge.msdk.videocommon.net.b(context).get(1, d.h().T, eVar, new C0603a(str), "setting", 60000L);
        a(3, 2, "");
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.net.a$a, reason: collision with other inner class name */
    class C0603a extends com.mbridge.msdk.foundation.same.net.wrapper.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53265b;

        C0603a(String str) {
            this.f53265b = str;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            try {
                if (v0.a(jSONObject)) {
                    com.mbridge.msdk.videocommon.setting.b.b().b(false);
                    if (jSONObject.optInt("vtag_status", 0) == 1) {
                        String strD = com.mbridge.msdk.videocommon.setting.b.b().d(this.f53265b);
                        if (!TextUtils.isEmpty(strD)) {
                            try {
                                jSONObject = h.b().a(new JSONObject(strD), jSONObject);
                            } catch (Exception e10) {
                                q0.b(a.f53264a, e10.getMessage());
                            }
                        }
                    }
                    try {
                        jSONObject.put("current_time", System.currentTimeMillis());
                        com.mbridge.msdk.videocommon.setting.b.b().f(this.f53265b, jSONObject.toString());
                    } catch (JSONException e11) {
                        q0.b(a.f53264a, e11.getMessage());
                    }
                } else {
                    com.mbridge.msdk.videocommon.setting.b.b().f(this.f53265b);
                }
                a.this.a(1, 2, "");
            } catch (Throwable th2) {
                q0.b(a.f53264a, th2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            com.mbridge.msdk.videocommon.setting.b.b().b(false);
            q0.b(a.f53264a, str);
            a.this.a(2, 2, str);
        }
    }

    public void a(Context context, String str, String str2, String str3, c cVar) {
        e eVar = new e();
        eVar.a("app_id", str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        eVar.a("unit_ids", C4240b4.j.f42672d + str3 + C4240b4.j.f42674e);
        try {
            com.mbridge.msdk.videocommon.setting.c cVarD = com.mbridge.msdk.videocommon.setting.b.b().d(str, str3);
            if (cVarD == null) {
                eVar.a("vtag", "");
            } else {
                String strG = cVarD.G();
                if (TextUtils.isEmpty(strG)) {
                    strG = "";
                }
                eVar.a("vtag", strG);
            }
        } catch (Throwable th2) {
            q0.b(f53264a, th2.getMessage());
        }
        b bVar = new b(str, cVar);
        bVar.setUnitId(str3);
        new com.mbridge.msdk.videocommon.net.b(context).get(1, d.h().T, eVar, bVar, "setting", 60000L);
        a(3, 3, "");
    }

    class b extends com.mbridge.msdk.foundation.same.net.wrapper.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f53268c;

        /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.net.a$b$a, reason: collision with other inner class name */
        class RunnableC0604a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ JSONObject f53270a;

            RunnableC0604a(JSONObject jSONObject) {
                this.f53270a = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.videocommon.setting.b bVarB = com.mbridge.msdk.videocommon.setting.b.b();
                b bVar = b.this;
                bVarB.a(bVar.f53267b, bVar.unitId, this.f53270a.toString());
            }
        }

        b(String str, c cVar) {
            this.f53267b = str;
            this.f53268c = cVar;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            try {
                try {
                    com.mbridge.msdk.videocommon.setting.b.b().e(this.unitId);
                } catch (Exception e10) {
                    q0.b(a.f53264a, e10.getMessage());
                }
                if (v0.a(jSONObject)) {
                    if (jSONObject.optInt("vtag_status", 0) == 1) {
                        String strB = com.mbridge.msdk.videocommon.setting.b.b().b(this.f53267b, this.unitId);
                        if (!TextUtils.isEmpty(strB)) {
                            try {
                                jSONObject = h.b().a(new JSONObject(strB), jSONObject);
                            } catch (Exception e11) {
                                q0.b(a.f53264a, e11.getMessage());
                            }
                        }
                    }
                    if (com.mbridge.msdk.videocommon.setting.b.c(jSONObject.toString())) {
                        jSONObject.put("current_time", System.currentTimeMillis());
                        RunnableC0604a runnableC0604a = new RunnableC0604a(jSONObject);
                        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(runnableC0604a);
                        } else {
                            runnableC0604a.run();
                        }
                        c cVar = this.f53268c;
                        if (cVar != null) {
                            cVar.a("request success");
                        }
                    } else {
                        c cVar2 = this.f53268c;
                        if (cVar2 != null) {
                            cVar2.onFailed("data error");
                        }
                    }
                } else {
                    com.mbridge.msdk.videocommon.setting.b.b().g(this.f53267b, this.unitId);
                }
                a.this.a(1, 3, "");
            } catch (Throwable th2) {
                q0.b(a.f53264a, th2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            try {
                com.mbridge.msdk.videocommon.setting.b.b().e(this.unitId);
            } catch (Exception e10) {
                q0.b(a.f53264a, e10.getMessage());
            }
            if (!TextUtils.isEmpty(str)) {
                c cVar = this.f53268c;
                if (cVar != null) {
                    cVar.onFailed(str);
                }
            } else {
                c cVar2 = this.f53268c;
                if (cVar2 != null) {
                    cVar2.onFailed("request error");
                }
            }
            a.this.a(2, 3, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, String str) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(C4240b4.i.W, "2000112");
            eVar.a("st_net", Integer.valueOf(d.h().f48747t));
            eVar.a("result", Integer.valueOf(i10));
            eVar.a("type", Integer.valueOf(i11));
            eVar.a("url", d.h().f48746s ? d.h().U : d.h().T);
            eVar.a("reason", str);
            cVar.a("2000112", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000112", cVar);
        } catch (Throwable th2) {
            q0.b(f53264a, th2.getMessage());
        }
    }
}
