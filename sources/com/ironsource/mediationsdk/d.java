package com.ironsource.mediationsdk;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.ironsource.A5;
import com.ironsource.C4238b2;
import com.ironsource.C4246ba;
import com.ironsource.C4306f2;
import com.ironsource.C4365ia;
import com.ironsource.C4424m2;
import com.ironsource.C4462o4;
import com.ironsource.C4649z5;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4634y7;
import com.ironsource.N6;
import com.ironsource.U1;
import com.ironsource.U9;
import com.ironsource.W0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class d {
    public static final boolean A = false;
    private static d B = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f43814c = "auctionId";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f43815d = "armData";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f43816e = "larmData";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f43817f = "isAdUnitCapped";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f43818g = "settings";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f43819h = "waterfall";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f43820i = "genericParams";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f43821j = "configurations";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f43822k = "instances";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f43823l = "${AUCTION_LOSS}";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f43824m = "${AUCTION_MBR}";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f43825n = "${AUCTION_PRICE}";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f43826o = "${DYNAMIC_DEMAND_SOURCE}";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f43827p = "${INSTANCE}";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f43828q = "${INSTANCE_TYPE}";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f43829r = "${PLACEMENT_NAME}";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f43830s = "adMarkup";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f43831t = "dynamicDemandSource";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f43832u = "params";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f43833v = "dlpl";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f43834w = "adUnit";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f43835x = "parallelLoad";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f43836y = "bidderExclusive";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f43837z = "showPriorityEnabled";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f43838a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4634y7 f43839b = Ib.U().i();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f43840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<C4424m2> f43841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C4424m2 f43842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f43843d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private JSONObject f43844e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f43845f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f43846g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private U1 f43847h;

        public a(String str) {
            this.f43840a = str;
        }

        public String a() {
            return this.f43840a;
        }

        public JSONObject b() {
            return this.f43844e;
        }

        public int c() {
            return this.f43845f;
        }

        public String d() {
            return this.f43846g;
        }

        public C4424m2 e() {
            return this.f43842c;
        }

        public JSONObject f() {
            return this.f43843d;
        }

        public U1 g() {
            return this.f43847h;
        }

        public List<C4424m2> h() {
            return this.f43841b;
        }

        public com.ironsource.mediationsdk.demandOnly.p a(String str) {
            U1 u12 = this.f43847h;
            if (u12 != null) {
                return u12.a(str);
            }
            return new p.b();
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f43848d = 15000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f43849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f43850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f43851c;

        public b(String str, String str2, String str3) {
            this.f43849a = str;
            this.f43850b = str2;
            this.f43851c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.f43849a + ";" + this.f43850b + ";" + this.f43851c;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f43851c).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                httpURLConnection.disconnect();
                Ib.U().q().a(new C4649z5(responseCode == 200 || responseCode == 204 ? A5.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : A5.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, new JSONObject().put(IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(IronSourceConstants.EVENTS_EXT1, str).put("errorCode", responseCode).put("reason", responseMessage)));
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error("Send auction url failed with params - " + str + ";" + e10.getMessage());
            }
        }
    }

    private enum c {
        NOT_SECURE,
        SECURE
    }

    public static d b() {
        return B;
    }

    public a a(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(strOptString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a(strOptString);
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.f43842c = new C4424m2(jSONObject2);
            jSONObjectOptJSONObject = jSONObject2.has(f43815d) ? jSONObject2.optJSONObject(f43815d) : null;
            if (jSONObject2.has("genericParams")) {
                aVar.f43843d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has("configurations")) {
                aVar.f43844e = jSONObject2.optJSONObject("configurations");
            }
            if (jSONObject2.has(f43822k)) {
                aVar.f43847h = new U1.a(jSONObject2.optJSONObject(f43822k));
            }
        }
        aVar.f43841b = new ArrayList();
        if (jSONObject.has(f43819h)) {
            JSONArray jSONArray = jSONObject.getJSONArray(f43819h);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                C4424m2 c4424m2 = new C4424m2(jSONArray.getJSONObject(i10), i10, jSONObjectOptJSONObject);
                if (!c4424m2.n()) {
                    aVar.f43845f = 1002;
                    aVar.f43846g = "waterfall " + i10;
                    IronLog.INTERNAL.verbose("AuctionResponseItem " + i10 + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
                aVar.f43841b.add(c4424m2);
            }
        }
        return aVar;
    }

    public String c(String str) {
        String string = "";
        try {
            if (!TextUtils.isEmpty(str) && C4365ia.a(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("params")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("parameters = " + jSONObject2);
                    if (jSONObject2.has("dynamicDemandSource")) {
                        string = jSONObject2.getString("dynamicDemandSource");
                        ironLog.verbose("demand source = " + string);
                        return string;
                    }
                }
            }
            return "";
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
            return string;
        }
    }

    public Map<String, String> b(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        map.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
        }
        return map;
    }

    private c a() {
        c cVar = c.SECURE;
        return Build.VERSION.SDK_INT >= 28 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() ? c.NOT_SECURE : cVar : (ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0 ? c.NOT_SECURE : cVar;
    }

    JSONObject a(i iVar) throws JSONException {
        IronSource.a aVar;
        boolean z10;
        List<String> list;
        IronSource.a aVarC = iVar.c();
        boolean zT = iVar.t();
        Map<String, Object> mapH = iVar.h();
        List<String> listL = iVar.l();
        h hVarE = iVar.e();
        int iO = iVar.o();
        ISBannerSize iSBannerSizeF = iVar.f();
        C4246ba c4246baN = iVar.n();
        boolean zP = iVar.p();
        boolean zQ = iVar.q();
        ArrayList<C4306f2> arrayListK = iVar.k();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = mapH.keySet().iterator();
        while (true) {
            aVar = aVarC;
            z10 = zT;
            String strA = "";
            list = listL;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            ISBannerSize iSBannerSize = iSBannerSizeF;
            JSONObject jSONObject3 = new JSONObject();
            C4246ba c4246ba = c4246baN;
            jSONObject3.put(N6.f41438y0, 2);
            jSONObject3.put(N6.f41411p0, new JSONObject((Map) mapH.get(next)));
            if (hVarE != null) {
                strA = hVarE.a(next);
            }
            jSONObject3.put(N6.B0, strA);
            jSONObject3.put("ts", zQ ? 1 : 0);
            jSONObject2.put(next, jSONObject3);
            aVarC = aVar;
            zT = z10 ? 1 : 0;
            listL = list;
            iSBannerSizeF = iSBannerSize;
            c4246baN = c4246ba;
        }
        ISBannerSize iSBannerSize2 = iSBannerSizeF;
        C4246ba c4246ba2 = c4246baN;
        int i10 = 2;
        for (String str : list) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(N6.f41438y0, 1);
            jSONObject4.put(N6.B0, hVarE != null ? hVarE.a(str) : "");
            jSONObject2.put(str, jSONObject4);
        }
        for (C4306f2 c4306f2 : arrayListK) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(N6.f41438y0, c4306f2.e() ? i10 : 1);
            Map<String, Object> mapF = c4306f2.f();
            if (!mapF.isEmpty()) {
                jSONObject5.put(N6.f41411p0, new JSONObject(mapF));
            }
            jSONObject5.put(N6.B0, hVarE != null ? hVarE.a(c4306f2.g()) : "");
            jSONObject5.put("ts", zQ ? 1 : 0);
            if (!c4306f2.h().isEmpty()) {
                jSONObject5.put(f43833v, c4306f2.h());
            }
            jSONObject2.put(c4306f2.g(), jSONObject5);
            i10 = 2;
        }
        jSONObject.put(N6.f41435x0, jSONObject2);
        if (iVar.v()) {
            jSONObject.put(N6.f41436x1, 1);
        }
        if (iVar.s()) {
            jSONObject.put("do", 1);
        }
        new U9().b(ContextProvider.getInstance().getApplicationContext());
        JSONObject jSONObjectA = new C4238b2(W0.a(aVar)).a();
        a(jSONObjectA, false);
        jSONObjectA.put(N6.f41441z0, iO);
        jSONObjectA.put(N6.A0, a().ordinal());
        if (c4246ba2 != null) {
            jSONObjectA.put(N6.f41394j1, c4246ba2.i());
        }
        jSONObject.put(N6.f41426u0, jSONObjectA);
        if (iSBannerSize2 != null) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(N6.f41417r0, iSBannerSize2.getDescription());
            jSONObject6.put(N6.f41423t0, iSBannerSize2.getWidth());
            jSONObject6.put(N6.f41420s0, iSBannerSize2.getHeight());
            jSONObject.put(N6.f41414q0, jSONObject6);
        }
        jSONObject.put(N6.f41399l0, aVar.toString());
        if (iVar.b() != null) {
            jSONObject.put("adf", iVar.b());
        }
        if (iVar.d() != null) {
            jSONObject.put("mediationAdUnitId", iVar.d());
        }
        if (iVar.u() != null) {
            jSONObject.put(N6.f41408o0, iVar.u());
        }
        jSONObject.put(N6.f41429v0, !z10 ? 1 : 0);
        if (iVar.g() != null) {
            jSONObject.put(N6.f41424t1, new JSONObject().put(N6.f41427u1, iVar.g()));
        } else {
            Object objRemove = jSONObjectA.remove(N6.f41424t1);
            if (objRemove != null) {
                jSONObject.put(N6.f41424t1, objRemove);
            }
        }
        if (zP) {
            jSONObject.put(N6.f41418r1, 1);
        }
        return jSONObject;
    }

    public String a(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7) {
        return str.replace("${AUCTION_PRICE}", str4).replace("${AUCTION_LOSS}", str6).replace("${AUCTION_MBR}", str5).replace(f43827p, str2).replace(f43828q, Integer.toString(i10)).replace(f43826o, str3).replace(f43829r, str7);
    }

    public String a(String str, int i10, C4424m2 c4424m2, String str2, String str3, String str4) {
        String strI = c4424m2.i();
        return a(str, c4424m2.c(), i10, b().c(c4424m2.k()), strI, b().a(strI, str2), str3, str4);
    }

    public void a(String str, String str2, String str3) {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b(str, str2, str3));
    }

    public String a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("adMarkup")) {
                    return jSONObject.getString("adMarkup");
                }
            }
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
        }
        return str;
    }

    private String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        double d10 = Double.parseDouble(str);
        return Double.parseDouble(str2) == 0.0d ? "" : String.valueOf(Math.round((d10 / r7) * 1000.0d) / 1000.0d);
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString(N6.f41400l1)) || !this.f43838a.compareAndSet(false, true)) {
            return;
        }
        Ib.U().q().a(new C4649z5(A5.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.a(z10, true, -1)));
    }
}
