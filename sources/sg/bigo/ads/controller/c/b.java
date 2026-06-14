package sg.bigo.ads.controller.c;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes4.dex */
public class b implements sg.bigo.ads.api.core.b {

    @Nullable
    private JSONObject A;

    @Nullable
    private List<sg.bigo.ads.api.core.b> B;
    private final long C;
    private final long E;

    @NonNull
    private final sg.bigo.ads.api.core.g F;
    private long G;
    private int H;
    private int I;
    private boolean K;
    private long L;
    private sg.bigo.ads.api.a.m M;
    private final String N;
    private String O;
    private boolean P;
    private boolean Q;
    private String R;
    private final double T;
    private String U;
    private final boolean V;
    private String W;
    private String X;
    private String Y;
    private b.d Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected final sg.bigo.ads.api.a.l f103403a;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private int f103404aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private String f103405ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private int f103406ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private int f103407ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private boolean f103408ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private int f103409af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private boolean f103410ag;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private int f103412ai;
    private int aj;
    private sg.bigo.ads.api.core.p ak;
    private String al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private String ar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    protected String f103413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    protected String f103414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    protected String f103415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    protected String f103416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    protected final String f103417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f103418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f103419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected long f103420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    protected String f103421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    protected String f103422k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    protected b.e f103423l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    protected b.f[] f103424m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    protected b.f[] f103425n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    protected b.f[] f103426o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    protected b.f[] f103427p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    protected List<b.c> f103428q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    protected String f103429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected long f103430s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    protected String f103431t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    protected String f103432u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    protected b.InterfaceC1253b f103433v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected b.a f103434w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f103435x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Map<String, String> f103436y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f103437z;
    private int J = 0;
    private int S = 2;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private int f103411ah = 1;
    private sg.bigo.ads.api.core.i aq = new sg.bigo.ads.api.core.i();
    private final long D = SystemClock.elapsedRealtime();

    protected b(long j10, @NonNull sg.bigo.ads.api.core.g gVar, @NonNull sg.bigo.ads.api.a.l lVar, @NonNull JSONObject jSONObject) {
        this.am = 1;
        this.an = 0;
        this.ao = 1;
        this.f103437z = 0;
        this.ar = "";
        this.E = j10;
        this.F = gVar;
        this.f103403a = lVar;
        this.f103413b = jSONObject.optString("ad_id", "");
        this.f103414c = jSONObject.optString("title", "");
        this.f103415d = jSONObject.optString("description", "");
        this.f103416e = jSONObject.optString("cta", "");
        String strOptString = jSONObject.optString("dsp_name", "");
        this.f103417f = strOptString;
        this.V = "BigoDsp".equalsIgnoreCase(strOptString);
        this.f103418g = jSONObject.optInt("adx_type", 0);
        this.f103419h = jSONObject.optInt("ad_type", -1);
        this.f103420i = jSONObject.optLong("sid");
        this.f103421j = jSONObject.optString("creative_id", "");
        this.f103422k = jSONObject.optString("series_id", "");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("privacy");
        if (jSONObjectOptJSONObject != null) {
            this.f103423l = new o(jSONObjectOptJSONObject);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("track_clicks_third");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject2 != null) {
                    arrayList.add(new q(jSONObjectOptJSONObject2));
                }
            }
            b.f[] fVarArr = new b.f[arrayList.size()];
            this.f103425n = fVarArr;
            this.f103425n = (b.f[]) arrayList.toArray(fVarArr);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("track_impls_third");
        if (jSONArrayOptJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i11);
                if (jSONObjectOptJSONObject3 != null) {
                    arrayList2.add(new q(jSONObjectOptJSONObject3));
                }
            }
            b.f[] fVarArr2 = new b.f[arrayList2.size()];
            this.f103424m = fVarArr2;
            this.f103424m = (b.f[]) arrayList2.toArray(fVarArr2);
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("ad_nurls");
        if (jSONArrayOptJSONArray3 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray3.optJSONObject(i12);
                if (jSONObjectOptJSONObject4 != null) {
                    arrayList3.add(new q(jSONObjectOptJSONObject4));
                }
            }
            b.f[] fVarArr3 = new b.f[arrayList3.size()];
            this.f103426o = fVarArr3;
            this.f103426o = (b.f[]) arrayList3.toArray(fVarArr3);
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("ad_lurls");
        if (jSONArrayOptJSONArray4 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (int i13 = 0; i13 < jSONArrayOptJSONArray4.length(); i13++) {
                JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray4.optJSONObject(i13);
                if (jSONObjectOptJSONObject5 != null) {
                    arrayList4.add(new q(jSONObjectOptJSONObject5));
                }
            }
            b.f[] fVarArr4 = new b.f[arrayList4.size()];
            this.f103427p = fVarArr4;
            this.f103427p = (b.f[]) arrayList4.toArray(fVarArr4);
        }
        this.f103428q = new ArrayList();
        JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("om_data");
        if (jSONArrayOptJSONArray5 != null) {
            this.f103428q = new ArrayList();
            for (int i14 = 0; i14 < jSONArrayOptJSONArray5.length(); i14++) {
                this.f103428q.add(new m(jSONArrayOptJSONArray5.optJSONObject(i14)));
            }
        }
        this.f103429r = jSONObject.optString("enc_price", "");
        this.f103433v = new k(jSONObject);
        this.f103434w = new f(jSONObject);
        this.f103430s = jSONObject.optLong("switch_bit_map", 0L);
        this.f103431t = jSONObject.optString("abflags", "");
        this.C = jSONObject.optLong("expired_interval", 0L);
        this.f103432u = jSONObject.optString("mapping_slot", "");
        this.G = jSONObject.optLong("probe_interval");
        this.H = jSONObject.optInt("playable_ad_switch", 0);
        this.f103435x = jSONObject.optString("req_slot");
        String strOptString2 = jSONObject.optString("interstitial_style_getad_config");
        if (!TextUtils.isEmpty(strOptString2)) {
            try {
                this.M = new sg.bigo.ads.controller.b.j(new JSONObject(strOptString2));
            } catch (JSONException unused) {
            }
        }
        this.aq.a(jSONObject.optString("ad_form"));
        this.O = jSONObject.optString(C4240b4.i.F0);
        this.N = jSONObject.optString("sdk_style_id");
        this.P = jSONObject.optInt("banner_show_ad", 0) == 1;
        this.Q = jSONObject.optInt("banner_show_domain", 0) == 1;
        this.R = jSONObject.optString("ru_ad_marker");
        this.T = (jSONObject.optLong(Reporting.Key.BID_PRICE, 0L) * 1.0d) / 1.0E8d;
        this.U = jSONObject.optString("adx_country");
        this.aj = jSONObject.optInt("orientation", 0);
        if (sg.bigo.ads.api.core.a.d(this.f103419h)) {
            this.A = jSONObject;
        }
        this.W = jSONObject.optString("ad_bundle_id", "");
        this.X = jSONObject.optString("pop_h5");
        this.Y = jSONObject.optString("pop_img");
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("pop_page");
        if (jSONObjectOptJSONObject6 != null) {
            this.Z = new n(jSONObjectOptJSONObject6);
        }
        int iOptInt = jSONObject.optInt("ad_resp_type");
        this.f103404aa = iOptInt;
        if (iOptInt == 2) {
            a(jSONObject, j10, gVar, lVar);
        }
        this.f103436y = sg.bigo.ads.common.utils.l.a(jSONObject.optString("pub_extra_info"));
        this.al = jSONObject.optString("dsp_extra");
        this.am = jSONObject.optInt("native_banner_fill_strategy", 1);
        this.an = jSONObject.optInt("guide_type", 0);
        this.ao = jSONObject.optInt("native_banner_click_type", 0);
        this.ap = jSONObject.optInt("is_interactive", 0);
        this.f103437z = jSONObject.optInt("vpaid_imp_method", 0);
        this.ar = jSONObject.optString("sponsored", "");
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String A() {
        return this.f103422k;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.e B() {
        return this.f103423l;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.f[] C() {
        return this.f103424m;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.f[] D() {
        return this.f103425n;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.f[] E() {
        return this.f103426o;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.f[] F() {
        return this.f103427p;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final List<b.c> G() {
        return this.f103428q;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String H() {
        return this.f103429r;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String I() {
        return this.f103431t;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean J() {
        return (!this.K || this.L <= 0) ? SystemClock.elapsedRealtime() - this.D >= this.C * 1000 : System.currentTimeMillis() > this.L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    @Override // sg.bigo.ads.api.core.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long K() {
        /*
            r9 = this;
            boolean r0 = r9.K
            r1 = 0
            if (r0 == 0) goto L1e
            long r3 = r9.L
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1e
            long r5 = r9.C
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1c
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            goto L26
        L1c:
            r5 = r1
            goto L26
        L1e:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r9.D
            long r5 = r3 - r5
        L26:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2b
            return r5
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.c.b.K():long");
    }

    @Override // sg.bigo.ads.api.core.b
    public final long L() {
        return this.C;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String M() {
        return this.f103432u;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final b.InterfaceC1253b N() {
        return this.f103433v;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.a O() {
        return this.f103434w;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int P() {
        return this.f103404aa;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String Q() {
        return this.f103405ab;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int R() {
        return this.f103406ac;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void S() {
        this.f103406ac = this.f103407ad;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void T() {
        this.f103408ae = true;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean U() {
        return this.f103408ae;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int V() {
        return this.f103409af;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int W() {
        return this.f103411ah;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int X() {
        return this.f103412ai;
    }

    @Override // sg.bigo.ads.api.core.b
    public final sg.bigo.ads.api.core.p Y() {
        return this.ak;
    }

    @Override // sg.bigo.ads.api.core.b
    public final long Z() {
        return this.E;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final long a() {
        return sg.bigo.ads.api.a.i.f102116a.i();
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final sg.bigo.ads.api.core.g aa() {
        return this.F;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String ab() {
        return !sg.bigo.ads.common.utils.q.a((CharSequence) this.N) ? this.N : this.f103403a.p();
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean ac() {
        return this.H == 1;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int ad() {
        return this.I;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int ae() {
        return this.J;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final JSONObject af() {
        return this.A;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void ag() {
        this.K = true;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean ah() {
        return this.K;
    }

    @Override // sg.bigo.ads.api.core.b
    public final double ai() {
        return this.T;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int aj() {
        return this.f103403a.v();
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean ak() {
        return this.f103403a.v() == 2;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean al() {
        return this.V;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final List<sg.bigo.ads.api.core.b> am() {
        return this.B;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String an() {
        return this.al;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int ao() {
        return this.am;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int ap() {
        return this.an;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int aq() {
        return this.ao;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean ar() {
        return this.aj == 1;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int as() {
        return this.ap;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int at() {
        return this.f103437z;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String au() {
        return this.ar;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final String b() {
        return this.f103403a.l();
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final String c() {
        return this.f103403a.n();
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final sg.bigo.ads.api.a.l d() {
        return this.f103403a;
    }

    @Override // sg.bigo.ads.api.core.b
    public final sg.bigo.ads.api.a.m e() {
        return this.M;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final sg.bigo.ads.api.a.e f() {
        return this.aq;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int g() {
        return this.S;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean h() {
        sg.bigo.ads.api.a.m mVar = this.M;
        return mVar != null && mVar.a("endpage.ad_component_layout") == 5;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String i() {
        return this.O;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean j() {
        return this.P;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean k() {
        return this.Q;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String l() {
        return this.R;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String m() {
        return this.U;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String n() {
        return this.W;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String o() {
        return this.X;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String p() {
        return this.Y;
    }

    @Override // sg.bigo.ads.api.core.b
    public final b.d q() {
        return this.Z;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final String r() {
        return this.f103413b;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public String s() {
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) this.f103414c)) {
            return this.f103414c;
        }
        b.d dVar = this.Z;
        return (dVar == null || sg.bigo.ads.common.utils.q.a((CharSequence) dVar.b())) ? this.f103414c : this.Z.b();
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public String t() {
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) this.f103415d)) {
            return this.f103415d;
        }
        b.d dVar = this.Z;
        return (dVar == null || sg.bigo.ads.common.utils.q.a((CharSequence) dVar.c())) ? this.f103415d : this.Z.c();
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String u() {
        return this.f103416e;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final String v() {
        return this.f103417f;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int w() {
        return this.f103418g;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int x() {
        return this.f103419h;
    }

    @Override // sg.bigo.ads.api.core.b
    public final long y() {
        return this.f103420i;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String z() {
        return this.f103421j;
    }

    @Nullable
    public static b a(long j10, @NonNull sg.bigo.ads.api.core.g gVar, @NonNull sg.bigo.ads.api.a.l lVar, String str) {
        try {
            return a(j10, gVar, lVar, new JSONObject(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // sg.bigo.ads.api.core.b
    public final String b(String str) {
        if (str == null) {
            return "";
        }
        Map<String, String> map = this.f103436y;
        String str2 = map != null ? map.get(str) : "";
        return str2 == null ? "" : str2;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void c(int i10) {
        this.f103409af = i10;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void d(int i10) {
        this.I = i10;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void e(int i10) {
        this.J = i10;
    }

    @Nullable
    public static b a(long j10, sg.bigo.ads.api.core.g gVar, sg.bigo.ads.api.a.l lVar, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("adx_type", 0);
        if (iOptInt != 1 && iOptInt != 2) {
            if (iOptInt == 3) {
                return new d(j10, gVar, lVar, jSONObject);
            }
            if (iOptInt != 5) {
                return null;
            }
        }
        return new l(j10, gVar, lVar, jSONObject);
    }

    @Override // sg.bigo.ads.api.core.b
    public final void b(int i10) {
        this.f103407ad = i10;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(int i10, int i11, boolean z10) {
        if (!this.f103410ag || z10) {
            this.f103410ag = true;
            this.f103411ah = i10;
            this.f103412ai = i11;
        }
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(long j10) {
        this.L = j10;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(String str) {
        this.f103405ab = str;
    }

    private void a(JSONObject jSONObject, long j10, sg.bigo.ads.api.core.g gVar, sg.bigo.ads.api.a.l lVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        ArrayList arrayList = null;
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    b bVarA = a(j10, gVar, lVar, jSONObjectOptJSONObject);
                    if (bVarA != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        bVarA.f103404aa = this.f103404aa;
                        arrayList.add(bVarA);
                    } else {
                        sg.bigo.ads.core.d.b.a(1005, 10205, "Error ad in ads");
                    }
                }
            }
        }
        this.B = arrayList;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(@NonNull sg.bigo.ads.api.a.m mVar) {
        this.M = mVar;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(sg.bigo.ads.api.core.p pVar) {
        this.ak = pVar;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(boolean z10) {
        this.S = z10 ? 1 : 2;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean a(int i10) {
        return (this.f103430s & ((long) i10)) > 0;
    }
}
