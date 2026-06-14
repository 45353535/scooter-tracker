package com.taurusx.tax.a.z;

import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.ironsource.N6;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.g.n;
import com.taurusx.tax.utils.TaurusXHelper;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.models.AdExperience;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class y {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public float J;
    public int K;
    public int L;
    public int M;
    public int N;
    public String O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public int T;
    public int U;
    public int V;
    public JSONObject W;
    public String X;
    public JSONObject Y;
    public JSONObject Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65723a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public JSONObject f65724a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f65725b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f65726b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f65727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f65728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f65729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f65730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f65731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f65732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f65733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f65734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f65735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f65736l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f65737m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f65738n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f65739o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f65740p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f65741q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f65742r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f65743s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f65744t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f65745u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f65746v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f65747w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f65748x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f65749y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f65750z;

    public static class w {
        public String A;
        public String B;
        public String C;
        public String D;
        public String E;
        public String F;
        public String G;
        public String H;
        public String I;
        public float J;
        public JSONObject K;
        public JSONObject L;
        public JSONObject M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public String R;
        public long S;
        public long T;
        public long U;
        public long V;
        public int W;
        public int X;
        public int Y;
        public JSONObject Z;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public String f65752a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f65753b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f65754b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f65755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f65756d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f65757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f65758f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f65759g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f65760h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f65761i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f65762j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f65764l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f65765m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f65767o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f65768p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public String f65769q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public String f65770r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f65771s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f65772t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public String f65774v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f65775w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f65776x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f65777y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f65778z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f65766n = Build.MODEL;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f65751a = Build.BRAND;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f65763k = 2;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f65773u = Build.VERSION.RELEASE;

        public w() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("1.12.2");
            sb2.append(TaurusXHelper.isDebugMode() ? "-SNAPSHOT" : "");
            this.f65778z = sb2.toString();
            this.f65775w = com.taurusx.tax.z.f67752c;
        }

        public w a(int i10) {
            this.f65760h = i10;
            return this;
        }

        public w c(int i10) {
            this.f65762j = i10;
            return this;
        }

        public w e(String str) {
            this.F = str;
            return this;
        }

        public w f(String str) {
            this.f65774v = str;
            return this;
        }

        public w g(String str) {
            this.f65761i = str;
            return this;
        }

        public w h(String str) {
            this.B = str;
            return this;
        }

        public w i(int i10) {
            this.f65772t = i10;
            return this;
        }

        public w k(String str) {
            this.f65755c = str;
            return this;
        }

        public w l(String str) {
            this.f65768p = str;
            return this;
        }

        public w m(String str) {
            this.f65770r = str;
            return this;
        }

        public w n(String str) {
            this.f65765m = str;
            return this;
        }

        public w o(String str) {
            this.G = str;
            return this;
        }

        public w p(String str) {
            this.f65769q = str;
            return this;
        }

        public w r(String str) {
            this.f65776x = str;
            return this;
        }

        public w s(int i10) {
            this.f65758f = i10;
            return this;
        }

        public w t(int i10) {
            this.f65759g = i10;
            return this;
        }

        public w u(String str) {
            this.A = str;
            return this;
        }

        public w v(String str) {
            this.H = str;
            return this;
        }

        public w w(String str) {
            this.f65777y = str;
            return this;
        }

        public w x(String str) {
            this.C = str;
            return this;
        }

        public w y(String str) {
            this.f65767o = str;
            return this;
        }

        public w z(float f10) {
            this.f65764l = f10;
            return this;
        }

        public w a(String str) {
            this.R = str;
            return this;
        }

        public w c(JSONObject jSONObject) {
            this.K = jSONObject;
            return this;
        }

        public w f(int i10) {
            this.X = i10;
            return this;
        }

        public w g(int i10) {
            this.Q = i10;
            return this;
        }

        public w i(String str) {
            this.E = str;
            return this;
        }

        public w m(int i10) {
            this.f65756d = i10;
            return this;
        }

        public w n(int i10) {
            this.P = i10;
            return this;
        }

        public w o(int i10) {
            this.O = i10;
            return this;
        }

        public w p(int i10) {
            this.W = i10;
            return this;
        }

        public w s(String str) {
            this.D = str;
            return this;
        }

        public w t(String str) {
            this.I = str;
            return this;
        }

        public w v(int i10) {
            this.Y = i10;
            return this;
        }

        public w w(int i10) {
            this.f65771s = i10;
            return this;
        }

        public w y(float f10) {
            this.J = f10;
            return this;
        }

        public w z(String str) {
            this.f65753b = str;
            return this;
        }

        public w c(long j10) {
            this.V = j10;
            return this;
        }

        public w w(float f10) {
            this.f65757e = f10;
            return this;
        }

        public w y(int i10) {
            this.N = i10;
            return this;
        }

        public w z(JSONObject jSONObject) {
            this.M = jSONObject;
            return this;
        }

        public w c(String str) {
            this.f65752a0 = str;
            return this;
        }

        public w w(JSONObject jSONObject) {
            this.L = jSONObject;
            return this;
        }

        public w y(long j10) {
            this.U = j10;
            return this;
        }

        public w z(long j10) {
            this.S = j10;
            return this;
        }

        public w w(long j10) {
            this.T = j10;
            return this;
        }

        public w y(JSONObject jSONObject) {
            this.Z = jSONObject;
            return this;
        }

        public void z(int i10) {
            this.f65754b0 = i10;
        }

        public y z() {
            return new y(this);
        }
    }

    public static w z() {
        return new w();
    }

    public JSONObject w() {
        Iterator<String> itKeys;
        Iterator<String> itKeys2;
        Iterator<String> itKeys3;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f65750z;
            if (str != null) {
                jSONObject.put("sdk_ver", str);
            }
        } catch (JSONException unused) {
        }
        try {
            int i10 = this.f65747w;
            if (i10 >= 0) {
                jSONObject.put("sdk_ver_code", i10);
            }
        } catch (JSONException unused2) {
        }
        try {
            String str2 = this.f65749y;
            if (str2 != null) {
                jSONObject.put("app_id", str2);
            }
        } catch (JSONException unused3) {
        }
        try {
            String str3 = this.f65727c;
            if (str3 != null) {
                jSONObject.put("pkg", str3);
            }
        } catch (JSONException unused4) {
        }
        try {
            String str4 = this.f65739o;
            if (str4 != null) {
                jSONObject.put(POBCoreNativeConstants.NATIVE_VERSION, str4);
            }
        } catch (JSONException unused5) {
        }
        try {
            int i11 = this.f65743s;
            if (i11 >= 0) {
                jSONObject.put("ver_code", i11);
            }
        } catch (JSONException unused6) {
        }
        try {
            String str5 = this.f65733i;
            if (str5 != null) {
                jSONObject.put(N6.V0, str5);
            }
        } catch (JSONException unused7) {
        }
        try {
            String str6 = this.f65746v;
            if (str6 != null) {
                jSONObject.put(CommonUrlParts.HUAWEI_OAID, str6);
            }
        } catch (JSONException unused8) {
        }
        try {
            String str7 = this.f65731g;
            if (str7 != null) {
                jSONObject.put("model", str7);
            }
        } catch (JSONException unused9) {
        }
        try {
            String str8 = this.f65744t;
            if (str8 != null) {
                jSONObject.put(AdExperience.BRAND, str8);
            }
        } catch (JSONException unused10) {
        }
        try {
            int i12 = this.f65730f;
            if (i12 > 0) {
                jSONObject.put(CommonUrlParts.SCREEN_WIDTH, i12);
            }
            int i13 = this.f65737m;
            if (i13 > 0) {
                jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, i13);
            }
            int i14 = this.f65740p;
            if (i14 > 0) {
                jSONObject.put("ppi", i14);
            }
        } catch (JSONException unused11) {
        }
        try {
            String str9 = this.f65729e;
            if (str9 != null) {
                jSONObject.put("idfa", str9);
            }
        } catch (JSONException unused12) {
        }
        try {
            String str10 = this.f65735k;
            if (str10 != null) {
                jSONObject.put("idfv", str10);
            }
        } catch (JSONException unused13) {
        }
        try {
            float f10 = this.f65745u;
            if (f10 != 0.0f) {
                jSONObject.put(N6.f41419s, f10);
            }
        } catch (JSONException unused14) {
        }
        try {
            float f11 = this.f65748x;
            if (f11 != 0.0f) {
                jSONObject.put("lon", f11);
            }
        } catch (JSONException unused15) {
        }
        try {
            int i15 = this.f65742r;
            if (i15 != 0) {
                jSONObject.put("conn", i15);
            }
        } catch (JSONException unused16) {
        }
        try {
            int i16 = this.f65723a;
            if (i16 != 0) {
                jSONObject.put("os", i16);
            }
        } catch (JSONException unused17) {
        }
        try {
            String str11 = this.f65738n;
            if (str11 != null) {
                jSONObject.put(N6.G, str11);
            }
        } catch (JSONException unused18) {
        }
        try {
            String str12 = this.f65732h;
            if (str12 != null) {
                jSONObject.put(N6.f41375d0, str12);
            }
        } catch (JSONException unused19) {
        }
        try {
            String str13 = this.f65741q;
            if (str13 != null) {
                jSONObject.put("ip", str13);
            }
        } catch (JSONException unused20) {
        }
        try {
            int i17 = this.f65734j;
            if (i17 != -1) {
                jSONObject.put("devtype", i17);
            }
            int i18 = this.f65742r;
            if (i18 != -1) {
                jSONObject.put("conn", i18);
            }
        } catch (JSONException unused21) {
        }
        try {
            if (TextUtils.isEmpty(this.f65736l)) {
                jSONObject.put("android_id", "");
            } else {
                jSONObject.put("android_id", this.f65736l);
            }
        } catch (JSONException unused22) {
        }
        try {
            int i19 = this.f65725b;
            if (i19 != -1) {
                jSONObject.put("orientation", i19);
            } else {
                jSONObject.put("orientation", -1);
            }
        } catch (JSONException unused23) {
        }
        try {
            if (TextUtils.isEmpty(this.f65728d)) {
                jSONObject.put("language", "");
            } else {
                jSONObject.put("language", this.f65728d);
            }
        } catch (JSONException unused24) {
        }
        try {
            if (!TextUtils.isEmpty(this.A)) {
                jSONObject.put(Reporting.Key.PLACEMENT_ID, this.A);
                jSONObject.put("ad_type", this.f65726b0);
            }
        } catch (JSONException unused25) {
        }
        try {
            if (!TextUtils.isEmpty(this.B)) {
                jSONObject.put("user_id", this.B);
            }
        } catch (JSONException unused26) {
        }
        try {
            if (!TextUtils.isEmpty(this.C)) {
                jSONObject.put("signature_sha1", this.C);
            }
        } catch (JSONException unused27) {
        }
        try {
            if (!TextUtils.isEmpty(this.D)) {
                jSONObject.put("country", this.D);
            }
        } catch (JSONException unused28) {
        }
        try {
            if (!TextUtils.isEmpty(this.E)) {
                jSONObject.put(EidRequestBuilder.REQUEST_FIELD_LMT, this.E);
            }
        } catch (JSONException unused29) {
        }
        try {
            if (!TextUtils.isEmpty(this.F)) {
                jSONObject.put("lmt_oaid", this.F);
            }
        } catch (JSONException unused30) {
        }
        try {
            if (!TextUtils.isEmpty(this.G)) {
                jSONObject.put(N6.Q0, this.G);
            }
        } catch (JSONException unused31) {
        }
        try {
            if (!TextUtils.isEmpty(this.H)) {
                jSONObject.put("mccmnc", this.H);
            }
        } catch (JSONException unused32) {
        }
        try {
            if (!TextUtils.isEmpty(this.I)) {
                jSONObject.put("hwv", this.I);
            }
        } catch (JSONException unused33) {
        }
        try {
            jSONObject.put("pxratio", this.J);
        } catch (JSONException unused34) {
        }
        try {
            jSONObject.put("ccpa_do_not_sell", this.K);
            jSONObject.put("coppa_is_age_restricted_user", this.L);
            jSONObject.put("gdpr_data_collection", this.M);
            jSONObject.put("lgpd_consent", this.N);
            jSONObject.put("cpu", this.O);
            jSONObject.put("fit", this.P);
            jSONObject.put("flt", this.Q);
            jSONObject.put("lbt", this.R);
            jSONObject.put("lit", this.S);
            jSONObject.put("vc", this.T);
            jSONObject.put("ls", this.U);
            jSONObject.put("zo", this.V);
            jSONObject.put("build", this.X);
            JSONObject jSONObject2 = this.W;
            if (jSONObject2 != null && jSONObject2.length() > 0) {
                jSONObject.put(n.Q, this.W);
            }
            if (!TextUtils.isEmpty(com.taurusx.tax.w.z.t().c())) {
                jSONObject.put(AppsFlyerProperties.CHANNEL, com.taurusx.tax.w.z.t().c());
            }
        } catch (JSONException unused35) {
        }
        try {
            JSONObject jSONObject3 = this.Y;
            if (jSONObject3 != null && jSONObject3.length() > 0 && (itKeys3 = this.Y.keys()) != null) {
                while (itKeys3.hasNext()) {
                    String next = itKeys3.next();
                    jSONObject.put(next, this.Y.opt(next));
                }
            }
        } catch (Exception unused36) {
        }
        try {
            JSONObject jSONObject4 = this.Z;
            if (jSONObject4 != null && jSONObject4.length() > 0 && (itKeys2 = this.Z.keys()) != null) {
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    jSONObject.put(next2, this.Z.opt(next2));
                }
            }
        } catch (Exception unused37) {
        }
        try {
            JSONObject jSONObject5 = this.f65724a0;
            if (jSONObject5 != null && jSONObject5.length() > 0 && (itKeys = this.f65724a0.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next3 = itKeys.next();
                    jSONObject.put(next3, this.f65724a0.opt(next3));
                }
            }
        } catch (Exception unused38) {
        }
        return jSONObject;
    }

    public y() {
        this.f65730f = -1;
        this.f65737m = -1;
        this.f65740p = -1;
        this.f65742r = 0;
        this.f65734j = 1;
    }

    public y(w wVar) {
        this.f65730f = -1;
        this.f65737m = -1;
        this.f65740p = -1;
        this.f65742r = 0;
        this.f65734j = 1;
        this.f65750z = wVar.f65778z;
        this.f65747w = wVar.f65775w;
        this.f65749y = wVar.f65777y;
        this.f65727c = wVar.f65755c;
        this.f65739o = wVar.f65767o;
        this.f65743s = wVar.f65771s;
        this.f65731g = wVar.f65766n;
        this.f65744t = wVar.f65751a;
        this.f65730f = wVar.f65772t;
        this.f65737m = wVar.f65759g;
        this.f65740p = wVar.f65758f;
        this.f65733i = wVar.f65765m;
        this.f65746v = wVar.f65768p;
        this.f65729e = wVar.f65761i;
        this.f65735k = wVar.f65774v;
        this.f65745u = wVar.f65764l;
        this.f65748x = wVar.f65757e;
        this.f65723a = wVar.f65763k;
        this.f65738n = wVar.f65773u;
        this.f65732h = wVar.f65776x;
        this.f65741q = wVar.f65770r;
        this.f65734j = wVar.f65760h;
        this.f65742r = wVar.f65762j;
        this.f65736l = wVar.f65753b;
        this.f65725b = wVar.f65756d;
        this.f65728d = wVar.f65769q;
        this.A = wVar.A;
        this.B = wVar.B;
        this.C = wVar.C;
        this.D = wVar.D;
        this.E = wVar.E;
        this.F = wVar.F;
        this.G = wVar.G;
        this.H = wVar.H;
        this.I = wVar.I;
        this.J = wVar.J;
        this.Y = wVar.K;
        this.Z = wVar.L;
        this.f65724a0 = wVar.M;
        this.K = wVar.N;
        this.L = wVar.O;
        this.M = wVar.P;
        this.N = wVar.Q;
        this.O = wVar.R;
        this.P = wVar.S;
        this.Q = wVar.T;
        this.R = wVar.U;
        this.S = wVar.V;
        this.T = wVar.W;
        this.U = wVar.X;
        this.V = wVar.Y;
        this.W = wVar.Z;
        this.f65726b0 = wVar.f65754b0;
        this.X = wVar.f65752a0;
    }
}
