package com.taurusx.tax.w.s;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DtbConstants;
import com.appsflyer.AppsFlyerProperties;
import com.ironsource.C4240b4;
import com.taurusx.tax.a.z.y;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.c.w;
import com.taurusx.tax.c.y;
import com.taurusx.tax.c.z;
import com.taurusx.tax.g.n;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.w.c.y;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f67469z = "EventTrackHelper";

    public interface a {
        void z();

        void z(String str);
    }

    /* JADX INFO: renamed from: com.taurusx.tax.w.s.c$c, reason: collision with other inner class name */
    public class C0827c implements z.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JSONObject f67470c;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f67471o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f67472s;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f67473w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f67474y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f67475z;

        public C0827c(String str, Context context, String str2, JSONObject jSONObject, long j10, String str3) {
            this.f67475z = str;
            this.f67473w = context;
            this.f67474y = str2;
            this.f67470c = jSONObject;
            this.f67471o = j10;
            this.f67472s = str3;
        }

        @Override // com.taurusx.tax.c.z.w
        public void z(int i10, String str, String str2) {
            if (i10 < 200 || i10 >= 400) {
                LogUtil.v("taurusx", this.f67475z + "send track result code : [" + i10 + "], msg : " + str + " , url : " + this.f67474y);
                Context context = this.f67473w;
                if (context != null) {
                    com.taurusx.tax.w.s.y.z(context).z(this.f67470c.toString());
                } else {
                    com.taurusx.tax.w.s.y.z(TaurusXAds.getContext()).z(this.f67470c.toString());
                }
            } else {
                LogUtil.v("taurusx", this.f67475z + "send track result code : [" + i10 + "], msg : " + str);
                com.taurusx.tax.w.s.y.z(this.f67473w).z();
            }
            com.taurusx.tax.w.s.s.z().z(this.f67474y, i10, str, str2, this.f67471o, this.f67472s);
        }
    }

    public class o implements z.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67476a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f67477c;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ JSONObject f67478o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f67479s;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f67480w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ com.taurusx.tax.w.s.o f67481y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f67482z;

        public o(String str, Context context, com.taurusx.tax.w.s.o oVar, String str2, JSONObject jSONObject, long j10, String str3) {
            this.f67482z = str;
            this.f67480w = context;
            this.f67481y = oVar;
            this.f67477c = str2;
            this.f67478o = jSONObject;
            this.f67479s = j10;
            this.f67476a = str3;
        }

        @Override // com.taurusx.tax.c.z.w
        public void z(int i10, String str, String str2) {
            if (i10 < 200 || i10 >= 400) {
                LogUtil.v("taurusx", this.f67482z + "send track result code : [" + i10 + "], msg : " + str + " , url : " + this.f67477c);
                Context context = this.f67480w;
                if (context != null) {
                    com.taurusx.tax.w.s.y.z(context).z(this.f67478o.toString());
                } else {
                    com.taurusx.tax.w.s.y.z(TaurusXAds.getContext()).z(this.f67478o.toString());
                }
                this.f67481y.z();
            } else {
                LogUtil.v("taurusx", this.f67482z + "send track result code : [" + i10 + "], msg : " + str);
                com.taurusx.tax.w.s.y.z(this.f67480w).z();
                this.f67481y.w();
            }
            com.taurusx.tax.w.s.s.z().z(this.f67477c, i10, str, str2, this.f67479s, this.f67476a);
        }
    }

    public class s implements y.w {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f67483w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f67484z;

        public s(String str, String str2) {
            this.f67484z = str;
            this.f67483w = str2;
        }

        @Override // com.taurusx.tax.c.y.w
        public void onResult(int i10, int i11, String str, String str2) {
            LogUtil.v("taurusx", "send track result code : [" + i11 + "], msg : " + str);
        }
    }

    public class w implements z.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f67485c;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ JSONObject f67486o;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ a f67487w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Context f67488y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f67489z;

        public w(String str, a aVar, Context context, String str2, JSONObject jSONObject) {
            this.f67489z = str;
            this.f67487w = aVar;
            this.f67488y = context;
            this.f67485c = str2;
            this.f67486o = jSONObject;
        }

        @Override // com.taurusx.tax.c.z.w
        public void z(int i10, String str, String str2) {
            if (i10 >= 200 && i10 < 400) {
                LogUtil.v("taurusx", this.f67489z + "send track result code : [" + i10 + "], msg : " + str);
                a aVar = this.f67487w;
                if (aVar != null) {
                    aVar.z(str2);
                }
                com.taurusx.tax.w.s.y.z(this.f67488y).z();
                return;
            }
            LogUtil.v("taurusx", this.f67489z + "send track result code : [" + i10 + "], msg : " + str + " , url : " + this.f67485c);
            a aVar2 = this.f67487w;
            if (aVar2 != null) {
                aVar2.z();
            }
            try {
                this.f67486o.put("url", this.f67485c);
                this.f67486o.put("request", "post");
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            Context context = this.f67488y;
            if (context != null) {
                com.taurusx.tax.w.s.y.z(context).z(this.f67486o.toString());
            } else {
                com.taurusx.tax.w.s.y.z(TaurusXAds.getContext()).z(this.f67486o.toString());
            }
        }
    }

    public class y implements z.w {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f67490w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f67491z;

        public y(String str, String str2) {
            this.f67491z = str;
            this.f67490w = str2;
        }

        @Override // com.taurusx.tax.c.z.w
        public void z(int i10, String str, String str2) {
            if (i10 >= 200 && i10 < 400) {
                LogUtil.v("taurusx", this.f67491z + "send track result code : [" + i10 + "], msg : " + str);
                return;
            }
            LogUtil.v("taurusx", this.f67491z + "send track result code : [" + i10 + "], msg : " + str + " , url : " + this.f67490w);
        }
    }

    public class z implements z.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JSONObject f67492c;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f67493w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f67494y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f67495z;

        public z(String str, Context context, String str2, JSONObject jSONObject) {
            this.f67495z = str;
            this.f67493w = context;
            this.f67494y = str2;
            this.f67492c = jSONObject;
        }

        @Override // com.taurusx.tax.c.z.w
        public void z(int i10, String str, String str2) {
            if (i10 >= 200 && i10 < 400) {
                LogUtil.v("taurusx", this.f67495z + "send track result code : [" + i10 + "], msg : " + str);
                com.taurusx.tax.w.s.y.z(this.f67493w).z();
                return;
            }
            LogUtil.v("taurusx", this.f67495z + "send track result code : [" + i10 + "], msg : " + str + " , url : " + this.f67494y);
            try {
                this.f67492c.put("url", this.f67494y);
                this.f67492c.put("request", "post");
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            Context context = this.f67493w;
            if (context != null) {
                com.taurusx.tax.w.s.y.z(context).z(this.f67492c.toString());
            } else {
                com.taurusx.tax.w.s.y.z(TaurusXAds.getContext()).z(this.f67492c.toString());
            }
        }
    }

    public static void w(Context context, String str, String str2, long j10, com.taurusx.tax.w.c.y yVar) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = C4240b4.j.f42672d + str2 + "] ";
        }
        if (!str.toLowerCase().startsWith(DtbConstants.HTTPS) && !str.toLowerCase().startsWith("http://")) {
            LogUtil.v(f67469z, str3 + "error track url : " + str);
            return;
        }
        LogUtil.v(f67469z, str3 + "eventName: " + str2 + " event url : " + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("a", yVar.z());
            jSONObject.put("b", yVar.y());
            jSONObject.put("p", yVar.o());
            if (yVar.c() != null && yVar.c().w() != null) {
                jSONObject.put(n.M, yVar.c().w().t());
            }
            jSONObject.put(n.L, com.taurusx.tax.w.o.w.G());
            jSONObject.put("event_value", z(j10, ""));
            jSONObject.put(com.taurusx.tax.w.s.s.I, str2);
            jSONObject.put(com.taurusx.tax.w.s.s.J, System.currentTimeMillis() / 1000);
            if (!TextUtils.isEmpty(com.taurusx.tax.w.z.t().c())) {
                jSONObject.put(AppsFlyerProperties.CHANNEL, com.taurusx.tax.w.z.t().c());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        com.taurusx.tax.c.z.z(str, 2, (Map<String, String>) null, jSONObject.toString(), new z(str3, context, str, jSONObject));
    }

    public static void z(String str, String str2, JSONObject jSONObject) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = C4240b4.j.f42672d + str2 + "] ";
        }
        if (!str.toLowerCase().startsWith(DtbConstants.HTTPS) && !str.toLowerCase().startsWith("http://")) {
            LogUtil.v(f67469z, str3 + "error track url : " + str);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(com.taurusx.tax.w.s.s.I, str2);
            jSONObject2.put(com.taurusx.tax.w.s.s.J, System.currentTimeMillis() / 1000);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObject.opt(next));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        com.taurusx.tax.c.z.z(str, 2, (Map<String, String>) null, jSONObject2.toString(), new y(str3, str));
    }

    public static void z(Context context, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = C4240b4.j.f42672d + str2 + "] ";
        }
        String str4 = str3;
        if (!str.toLowerCase().startsWith(DtbConstants.HTTPS) && !str.toLowerCase().startsWith("http://")) {
            LogUtil.v(f67469z, str4 + "error track url : " + str);
            return;
        }
        LogUtil.v(f67469z, str4 + "trackName: " + str2 + " track url : " + str);
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject.put("url", str);
            jSONObject.put("request", "get");
            jSONObject.put(com.taurusx.tax.w.s.s.J, jCurrentTimeMillis);
            jSONObject.put("trackName", str2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        com.taurusx.tax.c.z.z(str, 2, null, new C0827c(str4, context, str, jSONObject, jCurrentTimeMillis, str2));
    }

    public static void w(Context context, String str, String str2, long j10, com.taurusx.tax.w.c.y yVar, JSONObject jSONObject, a aVar) {
        long j11;
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            j11 = j10;
            str3 = str;
            str4 = "";
        } else {
            j11 = j10;
            str3 = str;
            str4 = C4240b4.j.f42672d + str2 + "] ";
        }
        if (!str3.toLowerCase().startsWith(DtbConstants.HTTPS) && !str3.toLowerCase().startsWith("http://")) {
            LogUtil.v(f67469z, str4 + "error track url : " + str3);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("a", yVar.z());
            jSONObject2.put("b", yVar.y());
            jSONObject2.put("p", yVar.o());
            if (yVar.c() != null && yVar.c().w() != null) {
                jSONObject2.put(n.M, yVar.c().w().t());
            }
            jSONObject2.put(n.L, com.taurusx.tax.w.o.w.G());
            jSONObject2.put("event_value", z(j11, ""));
            jSONObject2.put(com.taurusx.tax.w.s.s.I, str2);
            jSONObject2.put(com.taurusx.tax.w.s.s.J, System.currentTimeMillis() / 1000);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObject.opt(next));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        com.taurusx.tax.c.z.z(str3, 2, (Map<String, String>) null, jSONObject2.toString(), new w(str4, aVar, context, str3, jSONObject2));
    }

    public static void z(Context context, String str, String str2, com.taurusx.tax.w.s.o oVar) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = C4240b4.j.f42672d + str2 + "] ";
        }
        String str4 = str3;
        if (!str.toLowerCase().startsWith(DtbConstants.HTTPS) && !str.toLowerCase().startsWith("http://")) {
            LogUtil.v(f67469z, str4 + "error track url : " + str);
            return;
        }
        LogUtil.v(f67469z, str4 + "track url : " + str);
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject.put("url", str);
            jSONObject.put("request", "get");
            jSONObject.put(com.taurusx.tax.w.s.s.J, jCurrentTimeMillis);
            jSONObject.put("trackName", str2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        com.taurusx.tax.c.z.z(str, 2, null, new o(str4, context, oVar, str, jSONObject, jCurrentTimeMillis, str2));
    }

    public static void z(Context context, List<String> list) {
        z(context, list, "");
    }

    public static void z(Context context, List<String> list, String str) {
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    z(context, str2, str);
                }
            }
        }
    }

    public static void z(Context context, String str, String str2, long j10, com.taurusx.tax.w.c.y yVar) {
        if (TextUtils.isEmpty(str) || yVar == null) {
            return;
        }
        w(context, str, str2, j10, yVar);
    }

    public static void z(Context context, String str, String str2, long j10, com.taurusx.tax.w.c.y yVar, JSONObject jSONObject, a aVar) {
        if (TextUtils.isEmpty(str) || yVar == null) {
            return;
        }
        w(context, str, str2, j10, yVar, jSONObject, aVar);
    }

    public static String z(long j10, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (j10 > 0) {
                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, j10);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("r", str);
            }
            if (jSONObject.length() > 0) {
                return jSONObject.toString();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject z(com.taurusx.tax.w.s.z zVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("c_dx", zVar.w());
            jSONObject.put("c_dy", zVar.y());
            jSONObject.put("c_ux", zVar.o());
            jSONObject.put("c_uy", zVar.s());
            jSONObject.put("c_t", zVar.z());
            jSONObject.put("c_w", zVar.a());
            jSONObject.put("c_h", zVar.c());
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public static String z(y.z zVar) {
        if (zVar != null) {
            return zVar.k();
        }
        return null;
    }

    public static void z(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        com.taurusx.tax.c.o oVar = new com.taurusx.tax.c.o(w.y.z.POST);
        oVar.w(com.taurusx.tax.w.o.w.F());
        oVar.z(com.taurusx.tax.a.z.w.c());
        y.w wVarZ = com.taurusx.tax.a.z.z.z(context, str5, str6);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ex_code", str);
            jSONObject.put("ex_info", str2);
            jSONObject.put("ex_time", str3);
            jSONObject.put("ex_spend_time", str4);
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject2.put("exceptions", jSONArray);
            wVarZ.c(jSONObject2);
        } catch (Exception unused) {
        }
        oVar.z(wVarZ);
        oVar.z("exception");
        com.taurusx.tax.c.y.w(oVar, 2, new s(str, str3));
    }
}
