package com.taurusx.tax.w.s;

import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.taurusx.tax.g.k;
import com.taurusx.tax.g.m;
import com.taurusx.tax.g.n;
import com.taurusx.tax.g.q;
import com.taurusx.tax.g.x;
import com.taurusx.tax.y.z.w.s;
import java.util.UUID;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class s {
    public static final String A = "1021";
    public static final String B = "1022";
    public static final String C = "1023";
    public static final String D = "1024";
    public static final String E = "1025";
    public static final String F = "1026";
    public static final String G = "1027";
    public static final String H = "1099";
    public static final String I = "event_name";
    public static final String J = "event_time";
    public static final String K = "cost_time";
    public static final String L = "error_code";
    public static final String M = "error_message";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f67496a = "1001";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f67497b = "1018";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f67498d = "1019";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f67499e = "1011";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f67500f = "1005";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f67501g = "1004";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f67502h = "1016";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f67503i = "1008";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f67504j = "1017";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f67505k = "1012";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f67506l = "1010";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f67507m = "1006";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f67508n = "1002";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f67509o = "TaxCustomEvent";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f67510p = "1007";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f67511q = "1020";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f67512r = "1015";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f67513s = "1000";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f67514t = "1003";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f67515u = "1013";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f67516v = "1009";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f67517x = "1014";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.taurusx.tax.w.c.y f67518c;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f67519w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f67520y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f67521z;

    public class w implements Runnable {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ long f67523w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ boolean f67524y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f67525z;

        public w(String str, long j10, boolean z10) {
            this.f67525z = str;
            this.f67523w = j10;
            this.f67524y = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(this.f67525z) || s.this.y(s.F)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(s.I, s.F);
                jSONObject.put(s.J, System.currentTimeMillis());
                jSONObject.put("play_duration", this.f67523w);
                k.z zVarZ = k.z(this.f67525z);
                jSONObject.put("video_duration", zVarZ.f66144c);
                jSONObject.put("video_bytes", zVarZ.f66147z);
                jSONObject.put("video_width", zVarZ.f66145w);
                jSONObject.put("video_height", zVarZ.f66146y);
                jSONObject.put(CampaignEx.KEY_SHOW_TYPE, this.f67524y ? 2 : 1);
                s.this.z(jSONObject);
                com.taurusx.tax.w.z.t().a().w(jSONObject);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public class z implements Runnable {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f67526w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f67528z;

        public z(String str, boolean z10) {
            this.f67528z = str;
            this.f67526w = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(this.f67528z) || s.this.y(s.E)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(s.I, s.E);
                jSONObject.put(s.J, System.currentTimeMillis());
                k.z zVarZ = k.z(this.f67528z);
                jSONObject.put("video_duration", zVarZ.f66144c);
                jSONObject.put("video_bytes", zVarZ.f66147z);
                jSONObject.put("video_width", zVarZ.f66145w);
                jSONObject.put("video_height", zVarZ.f66146y);
                jSONObject.put(CampaignEx.KEY_SHOW_TYPE, this.f67526w ? 2 : 1);
                s.this.z(jSONObject);
                com.taurusx.tax.w.z.t().a().w(jSONObject);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public s() {
        this.f67521z = UUID.randomUUID().toString();
        this.f67519w = "";
        this.f67520y = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y(String str) {
        JSONArray jSONArrayD = com.taurusx.tax.w.o.w.D();
        for (int i10 = 0; i10 < jSONArrayD.length(); i10++) {
            try {
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (str.equalsIgnoreCase(jSONArrayD.getString(i10))) {
                return true;
            }
        }
        return false;
    }

    public void c() {
        if (y(f67511q)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, f67511q);
            jSONObject.put(J, System.currentTimeMillis());
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void o() {
        if (y(f67499e)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, f67499e);
            jSONObject.put(J, System.currentTimeMillis());
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void s() {
        if (y(A)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, A);
            jSONObject.put(J, System.currentTimeMillis());
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void w(com.taurusx.tax.w.c.y yVar) {
        if (yVar != null) {
            if (yVar.z() != null) {
                this.f67519w = yVar.z();
            }
            if (yVar.o() != null) {
                this.f67520y = yVar.o();
            }
            this.f67518c = yVar;
        }
    }

    public static s z(com.taurusx.tax.w.c.y yVar) {
        if (yVar != null) {
            return new s(yVar);
        }
        return new s();
    }

    public s(String str, String str2) {
        this.f67521z = UUID.randomUUID().toString();
        this.f67519w = "";
        this.f67520y = "";
        if (str != null) {
            this.f67519w = str;
        }
        if (str2 != null) {
            this.f67520y = str2;
        }
    }

    public static s z(String str) {
        if (str != null) {
            return new s(str, "");
        }
        return new s();
    }

    public void y() {
        if (y(f67505k)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, f67505k);
            jSONObject.put(J, System.currentTimeMillis());
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String w() {
        return this.f67519w;
    }

    public static s z() {
        return new s();
    }

    public void w(long j10, int i10, String str) {
        if (y(B)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, B);
            jSONObject.put(J, System.currentTimeMillis());
            jSONObject.put(K, j10);
            jSONObject.put("error_code", i10);
            jSONObject.put("error_message", str);
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(JSONObject jSONObject) throws JSONException {
        String str = this.f67519w;
        if (str == null) {
            str = "";
        }
        jSONObject.put("pid", str);
        String str2 = this.f67521z;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("request", str2);
        String str3 = this.f67520y;
        jSONObject.put("p", str3 != null ? str3 : "");
        com.taurusx.tax.w.c.y yVar = this.f67518c;
        if (yVar != null && yVar.c() != null && this.f67518c.c().w() != null) {
            jSONObject.put(n.M, this.f67518c.c().w().t());
        }
        jSONObject.put(n.L, com.taurusx.tax.w.o.w.G());
    }

    public s(com.taurusx.tax.w.c.y yVar) {
        this.f67521z = UUID.randomUUID().toString();
        this.f67519w = "";
        this.f67520y = "";
        this.f67518c = yVar;
        if (yVar != null) {
            this.f67519w = yVar.z();
            this.f67520y = this.f67518c.o();
        }
    }

    public void y(String str, boolean z10) {
        m.y(new z(str, z10));
    }

    public void z(long j10, long j11) {
        if (y(f67513s)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, f67513s);
            jSONObject.put(J, j10);
            jSONObject.put(K, j11);
            q.z(com.taurusx.tax.w.z.t().o()).w(jSONObject);
            q.z(com.taurusx.tax.w.z.t().o()).z(jSONObject);
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void w(com.taurusx.tax.w.s.z zVar, a aVar, String str, boolean z10) {
        z(G, zVar, aVar, str, z10);
    }

    public void w(String str, boolean z10) {
        if (y(D)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, D);
            jSONObject.put(J, System.currentTimeMillis());
            jSONObject.put("error_message", str);
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void z(long j10, long j11, boolean z10, int i10, int i11, String str) {
        if (y(f67504j)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, f67504j);
            jSONObject.put(J, j10);
            jSONObject.put(K, j11);
            jSONObject.put(TypedValues.TransitionType.S_FROM, z10 ? 2 : 1);
            jSONObject.put("req_count", i10);
            jSONObject.put("error_code", i11);
            jSONObject.put("error_message", str);
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public JSONObject w(String str) {
        if (y(H)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            jSONObject.put(I, H);
            jSONObject.put(J, jCurrentTimeMillis);
            jSONObject.put(s.z.f67719y, str);
            jSONObject.put("ts", jCurrentTimeMillis);
            jSONObject.put("us", jCurrentTimeMillis * 1000);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void z(int i10, String str) {
        if (y(f67498d)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, f67498d);
            jSONObject.put(J, System.currentTimeMillis());
            jSONObject.put("error_code", i10);
            jSONObject.put("error_message", str);
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void z(int i10) {
        if (y(f67496a)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, f67496a);
            jSONObject.put(J, System.currentTimeMillis());
            jSONObject.put("file_type", i10);
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void z(int i10, long j10, int i11, int i12, String str, long j11) {
        if (y(f67508n)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, f67508n);
            jSONObject.put(J, System.currentTimeMillis());
            jSONObject.put("file_type", i10);
            jSONObject.put(K, j10);
            jSONObject.put("req_count", i11);
            jSONObject.put("error_code", i12);
            jSONObject.put("error_message", str);
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, j11);
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void z(long j10, int i10, int i11, String str) {
        if (y(f67501g)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, f67501g);
            jSONObject.put(J, System.currentTimeMillis());
            jSONObject.put(Reporting.Key.CACHE_TIME, j10);
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, i10);
            jSONObject.put("error_code", i11);
            jSONObject.put("error_message", str);
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void z(long j10, long j11, boolean z10, int i10, String str) {
        if (y(f67500f)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, f67500f);
            jSONObject.put(J, System.currentTimeMillis());
            jSONObject.put(K, j10);
            jSONObject.put(Reporting.Key.CACHE_TIME, j11);
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, z10 ? 2 : 1);
            jSONObject.put("error_code", i10);
            jSONObject.put("error_message", str);
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void z(float f10, float f11, long j10, int i10, JSONArray jSONArray, boolean z10) {
        if (y(f67507m)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, f67507m);
            jSONObject.put(J, System.currentTimeMillis());
            jSONObject.put("x", x.z(f10, 0.0f));
            jSONObject.put("y", x.z(f11, 0.0f));
            jSONObject.put("ect", i10);
            jSONObject.put(K, j10);
            if (jSONArray != null && jSONArray.length() > 0) {
                jSONObject.put("play_track", jSONArray);
            }
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, z10 ? 2 : 1);
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void z(JSONArray jSONArray, boolean z10) {
        if (y(f67516v)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, f67516v);
            jSONObject.put(J, System.currentTimeMillis());
            if (jSONArray != null && jSONArray.length() > 0) {
                jSONObject.put("play_track", jSONArray);
            }
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, z10 ? 2 : 1);
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void z(String str, int i10, String str2, String str3, long j10, String str4) {
        if (y(f67506l)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, f67506l);
            jSONObject.put(J, System.currentTimeMillis());
            jSONObject.put("third_party_url", str);
            jSONObject.put("http_code", i10);
            jSONObject.put("http_msg", str2);
            jSONObject.put("result", str3);
            jSONObject.put("third_party_request_time_ms", j10);
            jSONObject.put("tracking_name", str4);
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void z(long j10, int i10, String str) {
        if (y(f67510p)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, f67510p);
            jSONObject.put(J, System.currentTimeMillis());
            jSONObject.put(K, j10);
            jSONObject.put("error_code", i10);
            jSONObject.put("error_message", str);
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void z(long j10, String str, boolean z10) {
        if (y(f67515u)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, f67515u);
            jSONObject.put(J, System.currentTimeMillis());
            jSONObject.put(K, j10);
            if (TextUtils.isEmpty(str)) {
                str = "adcontent";
            }
            jSONObject.put(TypedValues.TransitionType.S_FROM, str);
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, z10 ? 2 : 1);
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void z(String str, boolean z10) {
        if (TextUtils.isEmpty(str) || y(f67517x)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, f67517x);
            jSONObject.put(J, System.currentTimeMillis());
            jSONObject.put("redirect_url", str);
            jSONObject.put("auto_redirect", z10);
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void z(com.taurusx.tax.w.s.z zVar, a aVar, String str, boolean z10) {
        z(f67512r, zVar, aVar, str, z10);
    }

    private void z(String str, com.taurusx.tax.w.s.z zVar, a aVar, String str2, boolean z10) {
        if (zVar == null || aVar == null || y(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(I, str);
            jSONObject.put(J, System.currentTimeMillis());
            jSONObject.put("device_name", aVar.f67465s);
            jSONObject.put("device_id", aVar.f67464o);
            jSONObject.put("down_time", aVar.f67467y);
            jSONObject.put("up_time", aVar.f67463c);
            jSONObject.put("down_ts", aVar.f67468z);
            jSONObject.put("up_ts", aVar.f67466w);
            jSONObject.put("down_x", zVar.w());
            jSONObject.put("down_y", zVar.y());
            jSONObject.put("up_x", zVar.o());
            jSONObject.put("up_y", zVar.s());
            if (TextUtils.isEmpty(str2)) {
                str2 = "adcontent";
            }
            jSONObject.put(TypedValues.TransitionType.S_FROM, str2);
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, z10 ? 2 : 1);
            z(jSONObject);
            Log.d(f67509o, "sendClickAd event : " + aVar);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void z(String str, long j10, boolean z10) {
        m.y(new w(str, j10, z10));
    }

    public void z(int i10, int i11) {
        if (y(C)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(I, C);
            jSONObject.put(J, System.currentTimeMillis());
            jSONObject.put("use_ad_type", i10);
            jSONObject.put("origin_ad_type", i11);
            z(jSONObject);
            com.taurusx.tax.w.z.t().a().w(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
