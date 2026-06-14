package com.mbridge.msdk.foundation.same.net.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.tracker.network.toolbox.i;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.u;
import com.mbridge.msdk.tracker.x;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class d {
    public String A;
    private String B;
    public String C;
    public String D;
    private String E;
    public String F;
    private String G;
    public String H;
    private String I;
    public String J;
    public String K;
    private String L;
    public String M;
    private String N;
    public String O;
    private String P;
    public String Q;
    public String R;
    private String S;
    public String T;
    public String U;
    private String V;
    public String W;
    public String X;
    private String Y;
    public String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48722a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f48723a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48724b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f48725b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f48726c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f48727c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f48728d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f48729d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f48730e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f48731e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f48732f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f48733f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f48734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f48735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f48736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f48737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f48738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f48739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f48740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f48741n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f48742o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f48743p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f48744q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f48745r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f48746s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f48747t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<String> f48748u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f48749v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f48750w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList<String> f48751x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f48752y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f48753z;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f48754a = new d();
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    private void b() {
        this.M = this.f48732f + this.L;
    }

    private void c() {
        this.A = this.f48752y + this.f48753z;
        this.H = this.f48752y + this.G;
        i.b().f(this.f48752y);
    }

    public static d h() {
        return b.f48754a;
    }

    public void d(int i10) {
        this.f48733f0 = i10;
    }

    public void e() {
        this.Q = this.f48736i + this.P;
        this.C = this.f48736i + this.B;
        this.T = this.f48736i + this.S;
        this.J = this.f48736i + this.I;
        this.W = this.f48736i + this.V;
    }

    public void f() {
        this.R = this.f48740m + this.P;
        this.D = this.f48740m + this.B;
        this.U = this.f48740m + this.S;
        this.K = this.f48740m + this.I;
        this.X = this.f48740m + this.V;
    }

    public boolean g() {
        try {
            if (this.f48746s) {
                ArrayList<String> arrayList = this.f48751x;
                if (arrayList != null && this.f48750w <= arrayList.size() - 1) {
                    if (!a(this.f48751x.get(this.f48750w))) {
                        this.f48740m = this.f48751x.get(this.f48750w);
                        f();
                    }
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.f48748u;
                if (arrayList2 != null && this.f48749v <= arrayList2.size() - 1) {
                    this.f48736i = this.f48748u.get(this.f48749v);
                    e();
                    return true;
                }
            }
            if (this.f48745r) {
                this.f48749v = 0;
                this.f48750w = 0;
            }
            return false;
        } catch (Throwable th2) {
            q0.a("RequestUrlUtil", th2.getMessage());
            return false;
        }
    }

    public int i() {
        return this.f48733f0;
    }

    public void j() {
        HashMap<String, String> mapC;
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD != null) {
            com.mbridge.msdk.setting.a aVarJ = gVarD.j();
            if (aVarJ != null) {
                this.f48739l = aVarJ.f();
                this.f48743p = aVarJ.g();
                this.f48735h = aVarJ.e();
                a();
            }
            com.mbridge.msdk.setting.d dVarY = gVarD.y();
            if (dVarY != null) {
                this.f48738k = dVarY.d();
                this.f48742o = dVarY.e();
                this.f48732f = dVarY.c();
                b();
                a(gVarD);
            }
            this.f48746s = gVarD.o0() == 2;
            this.f48747t = gVarD.o0();
            a(!gVarD.b(2));
            if (gVarD.C() != null && gVarD.C().size() > 0 && (mapC = gVarD.C()) != null && mapC.size() > 0) {
                if (mapC.containsKey("v") && !TextUtils.isEmpty(mapC.get("v")) && a(mapC.get("v"))) {
                    this.f48730e = mapC.get("v");
                    d();
                }
                if (mapC.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(mapC.get(CampaignEx.JSON_KEY_HB)) && a(mapC.get(CampaignEx.JSON_KEY_HB))) {
                    this.f48752y = mapC.get(CampaignEx.JSON_KEY_HB);
                    c();
                }
                if (mapC.containsKey("lg") && !TextUtils.isEmpty(mapC.get("lg"))) {
                    String str = mapC.get("lg");
                    if (a(str)) {
                        this.f48728d = str;
                    } else {
                        this.f48737j = str;
                    }
                }
                if (mapC.containsKey("lgt") && !TextUtils.isEmpty(mapC.get("lgt"))) {
                    String str2 = mapC.get("lgt");
                    if (a(str2)) {
                        String strB = b(str2);
                        if (!TextUtils.isEmpty(strB)) {
                            this.f48737j = strB;
                        }
                    } else {
                        this.f48737j = str2;
                    }
                }
            }
            String strU = gVarD.u();
            if (!TextUtils.isEmpty(strU)) {
                this.f48736i = strU;
                e();
                this.f48748u.add(0, strU);
            }
            String strV = gVarD.v();
            if (TextUtils.isEmpty(strV)) {
                return;
            }
            this.f48740m = strV;
            f();
            this.f48751x.add(0, strV);
        }
    }

    private d() {
        this.f48722a = "RequestUrlUtil";
        this.f48724b = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.f48726c = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.f48728d = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.f48730e = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f48732f = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f48734g = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.f48735h = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.f48736i = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.f48737j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.f48738k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.f48739l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.f48740m = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.f48741n = 9377;
        this.f48742o = 9377;
        this.f48743p = 9988;
        this.f48744q = 9377;
        this.f48745r = false;
        this.f48746s = false;
        this.f48747t = 1;
        this.f48748u = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.f48749v = 0;
        this.f48750w = 0;
        this.f48751x = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.f48752y = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.f48753z = "/bid";
        this.A = this.f48752y + this.f48753z;
        this.B = "/sdk/customid";
        this.C = this.f48736i + this.B;
        this.D = this.f48740m + this.B;
        this.E = "/image";
        this.F = this.f48730e + this.E;
        this.G = "/load";
        this.H = this.f48752y + this.G;
        this.I = "/mapping";
        this.J = this.f48736i + this.I;
        this.K = this.f48740m + this.I;
        this.L = "";
        this.M = this.f48735h + this.L;
        this.N = "/batchPaidEvent";
        this.O = this.f48735h + this.N;
        this.P = "/setting";
        this.Q = this.f48736i + this.P;
        this.R = this.f48740m + this.P;
        this.S = "/rewardsetting";
        this.T = this.f48736i + this.S;
        this.U = this.f48740m + this.S;
        this.V = "/appwall/setting";
        this.W = this.f48736i + this.V;
        this.X = this.f48740m + this.V;
        this.Y = "/openapi/ad/v3";
        this.Z = this.f48730e + this.Y;
        this.f48723a0 = "/openapi/ad/v4";
        this.f48725b0 = this.f48730e + this.f48723a0;
        this.f48727c0 = "/openapi/ad/v5";
        this.f48729d0 = this.f48730e + this.f48727c0;
        this.f48731e0 = true;
        this.f48733f0 = 0;
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Throwable th2) {
            q0.b("RequestUrlUtil", th2.getMessage());
            return "";
        }
    }

    private void d() {
        this.Z = this.f48730e + this.Y;
        this.f48725b0 = this.f48730e + this.f48723a0;
        this.f48729d0 = this.f48730e + this.f48727c0;
        this.F = this.f48730e + this.E;
    }

    public void c(int i10) {
        this.f48744q = i10;
    }

    public String a(String str, int i10) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("_");
                if (strArrSplit.length > 1) {
                    return a(true, strArrSplit[1]);
                }
                return a(true, "");
            }
        } catch (Exception e10) {
            q0.b("RequestUrlUtil", e10.getMessage());
        }
        return i10 % 2 == 0 ? this.f48729d0 : this.Z;
    }

    public void b(int i10) {
        this.f48741n = i10;
    }

    public String a(boolean z10, String str) {
        if (z10) {
            if (this.H.contains(JsonUtils.EMPTY_JSON) && !TextUtils.isEmpty(str)) {
                return this.H.replace(JsonUtils.EMPTY_JSON, str + TokenBuilder.TOKEN_DELIMITER);
            }
            return this.H.replace(JsonUtils.EMPTY_JSON, "");
        }
        return this.A.replace(JsonUtils.EMPTY_JSON, "");
    }

    public void a(boolean z10) {
        this.f48731e0 = z10;
    }

    private void a() {
        this.O = this.f48735h + this.N;
    }

    private void a(g gVar) {
        com.mbridge.msdk.setting.d dVarY;
        if (gVar == null || (dVarY = gVar.y()) == null || dVarY.a() == 1) {
            return;
        }
        int iB = s0.a().b("monitor", "type", s0.a().b("t_r_t", 1));
        if (iB != 0 && iB != 1) {
            iB = 0;
        }
        u.a().a(com.mbridge.msdk.foundation.controller.c.n().d(), new x.b().a(new com.mbridge.msdk.foundation.same.report.d()).a(new n()).a(iB, a(iB)).a(s0.a().b("t_m_e_t", 604800000)).b(s0.a().b("t_m_e_s", 50)).d(s0.a().b("t_m_r_c", 50)).c(s0.a().b("t_m_t", 15000)).e(s0.a().b("t_m_r_t_s", 1)).a(), dVarY.b() * 1000, com.mbridge.msdk.foundation.same.report.c.b());
    }

    private p a(int i10) {
        if (i10 == 1) {
            return new p(new m((byte) 2), h().f48738k, h().f48742o);
        }
        return new p(new com.mbridge.msdk.tracker.network.toolbox.h(), h().M, 0);
    }
}
