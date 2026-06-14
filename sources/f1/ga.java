package f1;

import com.amazon.device.ads.DtbConstants;
import com.ironsource.C4240b4;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ga {
    public final boolean A;
    public final a B;
    public b C;
    public final String D;
    public final long E;
    public final long F;
    public final u G;
    public final ze H;
    public final n1 I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f69898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f69899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f69900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f69901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f69902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f69903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f69904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f69905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f69906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f69907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f69908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f69909m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f69910n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f69911o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f69912p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f69913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f69914r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f69915s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f69916t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f69917u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f69918v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f69919w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f69920x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f69921y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f69922z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f69923a;

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f69923a = jSONObject.optBoolean("bannerEnable", true);
            return aVar;
        }

        public boolean b() {
            return this.f69923a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashSet f69924a;

        public static b a(JSONObject jSONObject) {
            b bVar = new b();
            HashSet hashSet = new HashSet();
            hashSet.add(DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY);
            hashSet.add("coppa");
            hashSet.add("lgpd");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("privacyStandards");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                d(jSONArrayOptJSONArray, hashSet, length);
                c(hashSet, length);
            }
            bVar.f69924a = hashSet;
            return bVar;
        }

        public static void c(HashSet hashSet, int i10) {
            if (i10 == 0) {
                hashSet.clear();
            }
        }

        public static void d(JSONArray jSONArray, HashSet hashSet, int i10) {
            for (int i11 = 0; i11 < i10; i11++) {
                hashSet.add(jSONArray.getString(i11));
            }
        }

        public HashSet b() {
            return this.f69924a;
        }
    }

    public ga(JSONObject jSONObject) {
        this.f69897a = jSONObject.optString("configVariant");
        this.f69898b = jSONObject.optBoolean("prefetchDisable");
        this.f69899c = jSONObject.optBoolean("publisherDisable");
        this.B = a.a(jSONObject);
        try {
            this.C = b.a(jSONObject);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        this.D = jSONObject.optString("publisherWarning", null);
        this.E = jSONObject.optLong("maxBytes", 104857600L);
        this.F = jSONObject.optLong("ttl", 604800000L);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("invalidateFolderList");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String strOptString = jSONArrayOptJSONArray.optString(i10);
                if (!strOptString.isEmpty()) {
                    arrayList.add(strOptString);
                }
            }
        }
        this.f69900d = DesugarCollections.unmodifiableList(arrayList);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("trackingLevels");
        jSONObjectOptJSONObject = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        this.f69901e = jSONObjectOptJSONObject.optBoolean("critical", true);
        this.f69908l = jSONObjectOptJSONObject.optBoolean("includeStackTrace", true);
        this.f69902f = jSONObjectOptJSONObject.optBoolean("error");
        this.f69903g = jSONObjectOptJSONObject.optBoolean("debug");
        this.f69904h = jSONObjectOptJSONObject.optBoolean(com.taurusx.tax.g.b.f66095s);
        this.f69905i = jSONObjectOptJSONObject.optBoolean("system");
        this.f69906j = jSONObjectOptJSONObject.optBoolean("timing");
        this.f69907k = jSONObjectOptJSONObject.optBoolean("user");
        this.f69909m = jSONObjectOptJSONObject.optBoolean("loggerCallerInfoCache", true);
        this.G = i0.c(jSONObject);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("videoPreCaching");
        this.H = ze.b(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("omSdk");
        this.I = e2.b(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject(C4240b4.i.K);
        jSONObjectOptJSONObject4 = jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4;
        this.f69910n = jSONObjectOptJSONObject4.optInt("cacheMaxBytes", com.taurusx.tax.g.n.A);
        int iOptInt = jSONObjectOptJSONObject4.optInt("cacheMaxUnits", 10);
        this.f69911o = iOptInt > 0 ? iOptInt : 10;
        this.f69912p = (int) TimeUnit.SECONDS.toDays(jSONObjectOptJSONObject4.optInt("cacheTTLs", t5.f71133a));
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray("directories");
        if (jSONArrayOptJSONArray2 != null) {
            int length2 = jSONArrayOptJSONArray2.length();
            for (int i11 = 0; i11 < length2; i11++) {
                String strOptString2 = jSONArrayOptJSONArray2.optString(i11);
                if (!strOptString2.isEmpty()) {
                    arrayList2.add(strOptString2);
                }
            }
        }
        this.f69913q = DesugarCollections.unmodifiableList(arrayList2);
        this.f69914r = jSONObjectOptJSONObject4.optBoolean("enabled", i());
        this.f69915s = jSONObjectOptJSONObject4.optBoolean("inplayEnabled", true);
        this.f69916t = jSONObjectOptJSONObject4.optBoolean("interstitialEnabled", true);
        int iOptInt2 = jSONObjectOptJSONObject4.optInt("invalidatePendingImpression", 3);
        this.f69917u = iOptInt2 <= 0 ? 3 : iOptInt2;
        this.f69918v = jSONObjectOptJSONObject4.optBoolean("lockOrientation", true);
        this.f69919w = jSONObjectOptJSONObject4.optInt("prefetchSession", 3);
        this.f69920x = jSONObjectOptJSONObject4.optBoolean("rewardVideoEnabled", true);
        String strOptString3 = jSONObjectOptJSONObject4.optString("version", "v2");
        this.f69921y = strOptString3;
        this.f69922z = String.format("%s/%s%s", C4240b4.i.K, strOptString3, "/prefetch");
        this.A = jSONObjectOptJSONObject4.optBoolean("redirectOpenToNativeBrowser", false);
    }

    public static boolean i() {
        int[] iArr = {4, 4, 2};
        String strB = s3.d().b();
        if (strB != null && strB.length() > 0) {
            String[] strArrSplit = strB.replaceAll("[^\\d.]", "").split("\\.");
            for (int i10 = 0; i10 < strArrSplit.length && i10 < 3; i10++) {
                try {
                    if (Integer.parseInt(strArrSplit[i10]) > iArr[i10]) {
                        return true;
                    }
                    if (Integer.parseInt(strArrSplit[i10]) < iArr[i10]) {
                        return false;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    public a a() {
        return this.B;
    }

    public n1 b() {
        return this.I;
    }

    public ze c() {
        return this.H;
    }

    public boolean d() {
        return this.f69898b;
    }

    public boolean e() {
        return this.f69899c;
    }

    public String f() {
        return this.D;
    }

    public u g() {
        return this.G;
    }

    public boolean h() {
        return this.f69914r;
    }

    public boolean j() {
        return this.f69918v;
    }

    public me k() {
        return new me(this.f69897a, this.f69914r, this.f69921y);
    }
}
