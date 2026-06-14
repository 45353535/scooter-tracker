package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.mbridge.msdk.foundation.tools.m0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class n {
    public static int N = 1;
    public static int O;
    private String A;
    private String B;
    private int C;
    private String D;
    private String E;
    private String G;
    private String H;
    private String I;
    private int J;
    private long K;
    private String L;
    private int M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48506c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f48509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f48510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f48511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f48512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f48513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f48514k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f48515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f48516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f48517n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f48518o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f48519p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f48520q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f48521r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f48522s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f48524u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f48525v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f48526w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f48527x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f48528y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f48529z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f48504a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48507d = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f48523t = 0;
    private int F = 0;

    public n(String str, int i10, int i11, int i12, int i13, String str2, String str3, int i14, String str4, int i15, String str5) {
        this.f48520q = str;
        this.f48524u = i10;
        this.f48525v = str5;
        this.f48519p = i11;
        this.M = i12;
        this.J = i13;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f48526w = URLEncoder.encode(str2, D5.N);
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f48527x = str3;
        this.C = i14;
        this.f48512i = str4;
        this.K = i15;
    }

    public String A() {
        return this.H;
    }

    public String B() {
        return this.I;
    }

    public int C() {
        return this.J;
    }

    public long D() {
        return this.K;
    }

    public String E() {
        return this.L;
    }

    public int F() {
        return this.M;
    }

    public String a() {
        return this.f48505b;
    }

    public void b(String str) {
        this.f48509f = str;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f48510g = URLEncoder.encode(str);
    }

    public String d() {
        return this.f48509f;
    }

    public String e() {
        return this.f48510g;
    }

    public String f() {
        return this.f48511h;
    }

    public String g() {
        return this.f48512i;
    }

    public String h() {
        return this.f48513j;
    }

    public String i() {
        return this.f48514k;
    }

    public void j(String str) {
        this.f48520q = str;
    }

    public String k() {
        return this.f48516m;
    }

    public void l(String str) {
        this.f48525v = str;
    }

    public void m(String str) {
        this.f48527x = str;
    }

    public String n() {
        return this.f48520q;
    }

    public void o(String str) {
        this.f48529z = str;
    }

    public void p(String str) {
        this.A = str;
    }

    public int q() {
        return this.f48524u;
    }

    public String r() {
        return this.f48525v;
    }

    public String s() {
        return this.f48526w;
    }

    public String t() {
        return TextUtils.isEmpty(this.f48527x) ? "" : this.f48527x;
    }

    @NonNull
    public String toString() {
        return "RewardReportData [key=" + this.f48520q + ", networkType=" + this.f48524u + ", isCompleteView=" + this.f48519p + ", watchedMillis=" + this.M + ", videoLength=" + this.J + ", offerUrl=" + this.f48526w + ", reason=" + this.f48527x + ", result=" + this.C + ", duration=" + this.f48512i + ", videoSize=" + this.K + C4240b4.j.f42674e;
    }

    public void u(String str) {
        this.I = str;
    }

    public String v() {
        return this.f48529z;
    }

    public String w() {
        return this.A;
    }

    public int x() {
        return this.C;
    }

    public int y() {
        return this.F;
    }

    public String z() {
        return this.G;
    }

    public void a(String str) {
        this.f48505b = str;
    }

    public int b() {
        return this.f48506c;
    }

    public void d(String str) {
        this.f48511h = str;
    }

    public void e(String str) {
        this.f48512i = str;
    }

    public void f(String str) {
        this.f48513j = str;
    }

    public void g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f48514k = URLEncoder.encode(str, D5.N);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void h(String str) {
        this.f48515l = str;
    }

    public void i(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f48518o = URLEncoder.encode(str, D5.N);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String j() {
        return this.f48515l;
    }

    public void k(String str) {
        this.f48522s = str;
    }

    public String l() {
        return this.f48518o;
    }

    public int m() {
        return this.f48519p;
    }

    public void n(String str) {
        this.f48528y = str;
    }

    public String o() {
        return this.f48521r;
    }

    public int p() {
        return this.f48523t;
    }

    public void q(String str) {
        this.B = str;
    }

    public void r(String str) {
        this.D = str;
    }

    public void s(String str) {
        this.E = str;
    }

    public void t(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.G = URLEncoder.encode(str, D5.N);
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
    }

    public String u() {
        return this.f48528y;
    }

    public void v(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.L = URLEncoder.encode(str, D5.N);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        this.f48506c = i10;
    }

    public void b(int i10) {
        this.f48523t = i10;
    }

    public void c(int i10) {
        this.f48524u = i10;
    }

    public void d(int i10) {
        this.C = i10;
    }

    public void e(int i10) {
        this.F = i10;
    }

    public String a(String str, String str2) {
        Map<String, String> map;
        if (!TextUtils.isEmpty(str) && (map = this.f48504a) != null) {
            try {
                String str3 = map.get(str);
                if (!TextUtils.isEmpty(str3)) {
                    return str3;
                }
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f48504a == null) {
            this.f48504a = new HashMap();
        }
        try {
            this.f48504a.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public int c() {
        return this.f48508e;
    }

    public n() {
    }

    public n(String str, int i10, String str2, String str3, String str4) {
        this.f48520q = str;
        this.f48525v = str4;
        this.f48524u = i10;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f48526w = URLEncoder.encode(str2, D5.N);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.f48527x = str3;
    }

    public n(String str, int i10, int i11, String str2, int i12, String str3, int i13, String str4) {
        this.f48520q = str;
        this.f48524u = i10;
        this.f48525v = str4;
        this.J = i11;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f48526w = URLEncoder.encode(str2, D5.N);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.C = i12;
        this.f48512i = str3;
        this.K = i13;
    }

    public n(Context context, CampaignEx campaignEx, int i10, String str, long j10, int i11) {
        if (i11 == 1 || i11 == 287 || i11 == 94) {
            this.f48520q = "m_download_end";
        } else if (i11 == 95) {
            this.f48520q = "2000025";
        }
        int iS = m0.s(context);
        this.f48524u = iS;
        this.f48525v = m0.a(context, iS);
        this.J = campaignEx.getVideoLength();
        this.f48528y = campaignEx.getRequestId();
        this.f48529z = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.f48526w)) {
            try {
                this.f48526w = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), D5.N);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.C = i10;
        this.f48512i = str;
        this.K = j10 == 0 ? campaignEx.getVideoSize() : j10;
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7) {
        this.f48520q = str;
        this.f48516m = str2;
        this.H = str3;
        this.f48521r = str4;
        this.I = str5;
        this.f48509f = str6;
        this.f48524u = i10;
        this.f48525v = str7;
    }

    public n(String str) {
        this.f48517n = str;
    }

    public n(String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f48520q = str;
        this.C = i10;
        this.f48512i = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f48514k = URLEncoder.encode(str3, D5.N);
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f48509f = str4;
        this.I = str5;
        this.f48527x = str6;
        this.f48513j = str7;
        if (Integer.valueOf(str2).intValue() > com.mbridge.msdk.foundation.same.a.L) {
            this.C = 2;
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10) {
        this.f48520q = str;
        this.f48509f = str2;
        this.f48528y = str3;
        this.f48529z = str4;
        this.I = str5;
        this.f48524u = i10;
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6) {
        this.f48520q = str;
        this.f48509f = str2;
        this.f48528y = str3;
        this.f48529z = str4;
        this.I = str5;
        this.f48524u = i10;
        this.f48527x = str6;
        this.f48508e = i11;
    }
}
