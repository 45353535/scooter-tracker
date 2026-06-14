package com.mbridge.msdk.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.k0;
import com.my.target.common.menu.MenuActionType;
import io.bidmachine.ads.networks.nast.NastAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static int f50491e1 = 1500;
    private boolean E0;
    private long F;
    private JSONArray G0;
    private ArrayList<Integer> H;
    private JSONObject H0;
    private d I;
    private C0564b J;
    private long J0;
    private HashMap<String, String> O;
    private long O0;
    private String P;
    private boolean P0;
    private int U;
    private String V0;
    private String X;
    private Map<String, String> Y;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f50497b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f50500c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private String f50503d1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f50511h0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private String f50517k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f50518l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private String f50519l0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<com.mbridge.msdk.foundation.entity.a> f50522n;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f50525o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f50526p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f50527p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.setting.a f50528q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f50529q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f50530r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f50531r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Map<String, a> f50532s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f50533s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f50534t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f50536u;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private long f50539v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private long f50541w0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50492a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONArray f50495b = new JSONArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONArray f50498c = new JSONArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f50501d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50504e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50506f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f50508g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f50510h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f50512i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f50514j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f50516k = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f50520m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f50524o = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f50538v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f50540w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f50542x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f50544y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f50546z = "";
    private String A = "";
    private String B = "";
    private int C = 120;
    private String D = com.mbridge.msdk.foundation.same.net.utils.d.h().f48736i;
    private String E = com.mbridge.msdk.foundation.same.net.utils.d.h().f48740m;
    private int G = f50491e1;
    private int K = 0;
    private long L = 86400;
    private int M = 0;
    private int N = 3;
    private boolean Q = true;
    private int R = 0;
    private boolean S = false;
    private boolean T = false;
    private int V = 0;
    private int W = 0;
    private String Z = NastAdapter.ADAPTER_SDK_VERSION_NAME;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f50493a0 = 30;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f50496b0 = 9377;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f50499c0 = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f50502d0 = 5;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f50505e0 = 1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f50507f0 = 8000;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private String f50509g0 = "";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f50513i0 = 10;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int f50515j0 = 120;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private String f50521m0 = "";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private String f50523n0 = "";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private String f50535t0 = "";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private String f50537u0 = "";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private List<Integer> f50543x0 = new ArrayList();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f50545y0 = 3;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f50547z0 = 0;
    private int A0 = 3;
    private int B0 = 0;
    private int C0 = 10;
    private int D0 = 600;
    private int F0 = 0;
    private String I0 = "";
    private int K0 = 8000;
    private int L0 = 1;
    private long M0 = 10;
    private int N0 = 3;
    private int Q0 = 1;
    private int R0 = 1;
    private int S0 = 1;
    private int T0 = 1;
    private String U0 = "";
    private int W0 = 1300;
    private int X0 = 0;
    private int Y0 = 0;
    private long Z0 = 3600;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private String f50494a1 = "";

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f50548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f50549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f50550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<String> f50551d;

        public List<String> a() {
            return this.f50548a;
        }

        public List<String> b() {
            return this.f50549b;
        }

        public List<String> c() {
            return this.f50550c;
        }

        public List<String> d() {
            return this.f50551d;
        }

        public void a(JSONObject jSONObject) {
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("x");
                if (jSONArrayOptJSONArray != null) {
                    this.f50550c = d0.a(jSONArrayOptJSONArray);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("y");
                if (jSONArrayOptJSONArray2 != null) {
                    this.f50551d = d0.a(jSONArrayOptJSONArray2);
                }
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("width");
                if (jSONArrayOptJSONArray3 != null) {
                    this.f50549b = d0.a(jSONArrayOptJSONArray3);
                }
                JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("height");
                if (jSONArrayOptJSONArray4 != null) {
                    this.f50548a = d0.a(jSONArrayOptJSONArray4);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public static String a(Context context, String str) {
        try {
            g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD != null && gVarD.G() != null) {
                String host = Uri.parse(str).getHost();
                Iterator<Map.Entry<String, String>> it = gVarD.G().entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (!TextUtils.isEmpty(host) && host.contains(key)) {
                        String str2 = gVarD.G().get(key);
                        return TextUtils.isEmpty(str2) ? "" : str2.replace("{gaid}", com.mbridge.msdk.foundation.tools.g.d());
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public long A() {
        return this.L;
    }

    public int A0() {
        return this.Y0;
    }

    public int B() {
        return this.N;
    }

    public boolean B0() {
        return this.Q;
    }

    public HashMap<String, String> C() {
        return this.O;
    }

    public boolean C0() {
        return this.f50534t;
    }

    public void D(int i10) {
        this.f50497b1 = i10;
    }

    public boolean D0() {
        return this.f50540w;
    }

    public int E() {
        return this.U;
    }

    public boolean E0() {
        return this.S;
    }

    public int F() {
        return this.V;
    }

    public boolean F0() {
        return this.f50492a;
    }

    public Map<String, String> G() {
        return this.Y;
    }

    public boolean G0() {
        return (TextUtils.isEmpty(this.B) || TextUtils.isEmpty(this.f50546z) || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.f50542x)) ? false : true;
    }

    public JSONArray H() {
        return this.f50495b;
    }

    public boolean H0() {
        return (TextUtils.isEmpty(this.B) || TextUtils.isEmpty(this.f50546z) || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.f50544y)) ? false : true;
    }

    public JSONArray I() {
        return this.f50498c;
    }

    public boolean I0() {
        return this.T;
    }

    public String J() {
        return this.Z;
    }

    public boolean J0() {
        return this.E0;
    }

    public int K() {
        return this.f50505e0;
    }

    public boolean K0() {
        return this.P0;
    }

    public int L() {
        return this.f50507f0;
    }

    public void L0() {
        String language = Locale.getDefault().getLanguage();
        if (!H0()) {
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                this.B = "Confirm to close? ";
                this.f50546z = "You will not be rewarded after closing the window";
                this.A = "Close it";
                this.f50544y = "Continue";
            } else {
                this.B = "确认关闭？";
                this.f50546z = "关闭后您将不会获得任何奖励噢~ ";
                this.A = "确认关闭";
                this.f50544y = "继续观看";
            }
        }
        if (G0()) {
            return;
        }
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            this.B = "Confirm to close? ";
            this.f50546z = "You will not be rewarded after closing the window";
            this.A = "Close it";
            this.f50542x = "Continue";
            return;
        }
        this.B = "确认关闭？";
        this.f50546z = "关闭后您将不会获得任何奖励噢~ ";
        this.A = "确认关闭";
        this.f50542x = "继续试玩";
    }

    public int M() {
        return this.f50511h0;
    }

    public int N() {
        return this.f50515j0;
    }

    public String O() {
        return this.f50517k0;
    }

    public String P() {
        return this.f50519l0;
    }

    public String Q() {
        return this.f50494a1;
    }

    public long R() {
        return this.Z0;
    }

    public int S() {
        return this.f50497b1;
    }

    public String T() {
        return this.f50521m0;
    }

    public String U() {
        return this.f50523n0;
    }

    public int V() {
        return this.f50525o0;
    }

    public int W() {
        return this.f50527p0;
    }

    public int X() {
        return this.f50531r0;
    }

    public int Y() {
        return this.f50533s0;
    }

    public void Z(int i10) {
        this.X0 = i10;
    }

    public long a0() {
        return this.f50539v0;
    }

    public void b(Map<String, String> map) {
        this.Y = map;
    }

    public long b0() {
        if (this.f50541w0 <= 0) {
            this.f50541w0 = 7200L;
        }
        return this.f50541w0;
    }

    public void c(int i10) {
        this.f50504e = i10;
    }

    public int c0() {
        return this.f50545y0;
    }

    public void d(long j10) {
        this.Z0 = j10;
    }

    public int d0() {
        return this.f50547z0;
    }

    public void e(int i10) {
        this.f50508g = i10;
    }

    public int e0() {
        return this.A0;
    }

    public void f(int i10) {
        this.f50510h = i10;
    }

    public int f0() {
        return this.B0;
    }

    public void g(int i10) {
        this.f50518l = i10;
    }

    public int g0() {
        return this.C0;
    }

    public void h(int i10) {
        this.f50520m = i10;
    }

    public int h0() {
        return this.D0;
    }

    public void i(int i10) {
        this.f50524o = i10;
    }

    public int i0() {
        return this.F0;
    }

    public com.mbridge.msdk.setting.a j() {
        return this.f50528q;
    }

    public JSONArray j0() {
        return this.G0;
    }

    public String k() {
        return this.f50530r;
    }

    public JSONObject k0() {
        return this.H0;
    }

    public Map<String, a> l() {
        return this.f50532s;
    }

    public String l0() {
        return this.I0;
    }

    public int m() {
        return this.f50536u;
    }

    public long m0() {
        return this.J0;
    }

    public int n() {
        return this.f50538v;
    }

    public int n0() {
        return this.K0;
    }

    public String o() {
        return this.f50542x;
    }

    public int o0() {
        return this.L0;
    }

    public String p() {
        return this.f50544y;
    }

    public long p0() {
        return this.M0 * 1000;
    }

    public String q() {
        return this.f50546z;
    }

    public int q0() {
        return this.N0;
    }

    public String r() {
        return this.A;
    }

    public long r0() {
        return this.O0;
    }

    public String s() {
        return this.B;
    }

    public int s0() {
        return this.Q0;
    }

    public void t(String str) {
        this.f50494a1 = str;
    }

    public int t0() {
        return this.R0;
    }

    public String toString() {
        return " cfc=" + this.f50536u + " getpf=" + this.L + " rurl=" + this.E0;
    }

    public String u() {
        return this.D;
    }

    public int u0() {
        return this.S0;
    }

    public String v() {
        return this.E;
    }

    public int v0() {
        return this.T0;
    }

    public long w() {
        return this.F;
    }

    public String w0() {
        return this.U0;
    }

    public ArrayList<Integer> x() {
        return this.H;
    }

    public String x0() {
        return this.V0;
    }

    public d y() {
        return this.I;
    }

    public int y0() {
        return this.W0;
    }

    public C0564b z() {
        return this.J;
    }

    public int z0() {
        return this.X0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04e4 A[Catch: Exception -> 0x054b, TryCatch #3 {Exception -> 0x054b, blocks: (B:125:0x04c2, B:127:0x04e4, B:128:0x04e6, B:130:0x04eb, B:131:0x04ed, B:133:0x04f2, B:134:0x04f4, B:136:0x04f9, B:137:0x04fb, B:140:0x0507), top: B:188:0x04c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04eb A[Catch: Exception -> 0x054b, TryCatch #3 {Exception -> 0x054b, blocks: (B:125:0x04c2, B:127:0x04e4, B:128:0x04e6, B:130:0x04eb, B:131:0x04ed, B:133:0x04f2, B:134:0x04f4, B:136:0x04f9, B:137:0x04fb, B:140:0x0507), top: B:188:0x04c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04f2 A[Catch: Exception -> 0x054b, TryCatch #3 {Exception -> 0x054b, blocks: (B:125:0x04c2, B:127:0x04e4, B:128:0x04e6, B:130:0x04eb, B:131:0x04ed, B:133:0x04f2, B:134:0x04f4, B:136:0x04f9, B:137:0x04fb, B:140:0x0507), top: B:188:0x04c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04f9 A[Catch: Exception -> 0x054b, TryCatch #3 {Exception -> 0x054b, blocks: (B:125:0x04c2, B:127:0x04e4, B:128:0x04e6, B:130:0x04eb, B:131:0x04ed, B:133:0x04f2, B:134:0x04f4, B:136:0x04f9, B:137:0x04fb, B:140:0x0507), top: B:188:0x04c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05bb A[Catch: Exception -> 0x0292, TryCatch #8 {Exception -> 0x0292, blocks: (B:5:0x0018, B:9:0x006d, B:14:0x00cb, B:37:0x017b, B:38:0x017e, B:40:0x028c, B:52:0x02cb, B:56:0x02e9, B:58:0x0306, B:60:0x030c, B:61:0x0312, B:63:0x0318, B:65:0x031e, B:66:0x0325, B:67:0x0328, B:69:0x032e, B:70:0x0338, B:89:0x039d, B:91:0x03a5, B:94:0x03ac, B:96:0x03b2, B:97:0x03ba, B:99:0x03c0, B:101:0x03cc, B:103:0x03d2, B:111:0x0461, B:124:0x04ac, B:142:0x0554, B:150:0x0578, B:164:0x05af, B:166:0x05bb, B:167:0x05c6, B:169:0x05d2, B:170:0x05dd, B:172:0x05e3, B:163:0x05ac, B:159:0x05a4, B:153:0x0594, B:149:0x0575, B:123:0x04a3, B:88:0x0394, B:43:0x0295, B:45:0x02a0, B:47:0x02a6, B:48:0x02ac, B:50:0x02b2, B:51:0x02c8, B:13:0x00c6, B:8:0x0069, B:160:0x05a7, B:143:0x0566, B:147:0x0571, B:151:0x058a, B:72:0x0344, B:73:0x0356, B:75:0x035c, B:77:0x0368, B:79:0x0372, B:81:0x0380, B:84:0x038a, B:86:0x0390, B:154:0x0597, B:157:0x05a0, B:112:0x047c, B:116:0x048d, B:120:0x0498), top: B:198:0x0018, inners: #2, #5, #6, #9, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05d2 A[Catch: Exception -> 0x0292, TryCatch #8 {Exception -> 0x0292, blocks: (B:5:0x0018, B:9:0x006d, B:14:0x00cb, B:37:0x017b, B:38:0x017e, B:40:0x028c, B:52:0x02cb, B:56:0x02e9, B:58:0x0306, B:60:0x030c, B:61:0x0312, B:63:0x0318, B:65:0x031e, B:66:0x0325, B:67:0x0328, B:69:0x032e, B:70:0x0338, B:89:0x039d, B:91:0x03a5, B:94:0x03ac, B:96:0x03b2, B:97:0x03ba, B:99:0x03c0, B:101:0x03cc, B:103:0x03d2, B:111:0x0461, B:124:0x04ac, B:142:0x0554, B:150:0x0578, B:164:0x05af, B:166:0x05bb, B:167:0x05c6, B:169:0x05d2, B:170:0x05dd, B:172:0x05e3, B:163:0x05ac, B:159:0x05a4, B:153:0x0594, B:149:0x0575, B:123:0x04a3, B:88:0x0394, B:43:0x0295, B:45:0x02a0, B:47:0x02a6, B:48:0x02ac, B:50:0x02b2, B:51:0x02c8, B:13:0x00c6, B:8:0x0069, B:160:0x05a7, B:143:0x0566, B:147:0x0571, B:151:0x058a, B:72:0x0344, B:73:0x0356, B:75:0x035c, B:77:0x0368, B:79:0x0372, B:81:0x0380, B:84:0x038a, B:86:0x0390, B:154:0x0597, B:157:0x05a0, B:112:0x047c, B:116:0x048d, B:120:0x0498), top: B:198:0x0018, inners: #2, #5, #6, #9, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05e3 A[Catch: Exception -> 0x0292, TRY_LEAVE, TryCatch #8 {Exception -> 0x0292, blocks: (B:5:0x0018, B:9:0x006d, B:14:0x00cb, B:37:0x017b, B:38:0x017e, B:40:0x028c, B:52:0x02cb, B:56:0x02e9, B:58:0x0306, B:60:0x030c, B:61:0x0312, B:63:0x0318, B:65:0x031e, B:66:0x0325, B:67:0x0328, B:69:0x032e, B:70:0x0338, B:89:0x039d, B:91:0x03a5, B:94:0x03ac, B:96:0x03b2, B:97:0x03ba, B:99:0x03c0, B:101:0x03cc, B:103:0x03d2, B:111:0x0461, B:124:0x04ac, B:142:0x0554, B:150:0x0578, B:164:0x05af, B:166:0x05bb, B:167:0x05c6, B:169:0x05d2, B:170:0x05dd, B:172:0x05e3, B:163:0x05ac, B:159:0x05a4, B:153:0x0594, B:149:0x0575, B:123:0x04a3, B:88:0x0394, B:43:0x0295, B:45:0x02a0, B:47:0x02a6, B:48:0x02ac, B:50:0x02b2, B:51:0x02c8, B:13:0x00c6, B:8:0x0069, B:160:0x05a7, B:143:0x0566, B:147:0x0571, B:151:0x058a, B:72:0x0344, B:73:0x0356, B:75:0x035c, B:77:0x0368, B:79:0x0372, B:81:0x0380, B:84:0x038a, B:86:0x0390, B:154:0x0597, B:157:0x05a0, B:112:0x047c, B:116:0x048d, B:120:0x0498), top: B:198:0x0018, inners: #2, #5, #6, #9, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0344 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028c A[Catch: Exception -> 0x0292, TryCatch #8 {Exception -> 0x0292, blocks: (B:5:0x0018, B:9:0x006d, B:14:0x00cb, B:37:0x017b, B:38:0x017e, B:40:0x028c, B:52:0x02cb, B:56:0x02e9, B:58:0x0306, B:60:0x030c, B:61:0x0312, B:63:0x0318, B:65:0x031e, B:66:0x0325, B:67:0x0328, B:69:0x032e, B:70:0x0338, B:89:0x039d, B:91:0x03a5, B:94:0x03ac, B:96:0x03b2, B:97:0x03ba, B:99:0x03c0, B:101:0x03cc, B:103:0x03d2, B:111:0x0461, B:124:0x04ac, B:142:0x0554, B:150:0x0578, B:164:0x05af, B:166:0x05bb, B:167:0x05c6, B:169:0x05d2, B:170:0x05dd, B:172:0x05e3, B:163:0x05ac, B:159:0x05a4, B:153:0x0594, B:149:0x0575, B:123:0x04a3, B:88:0x0394, B:43:0x0295, B:45:0x02a0, B:47:0x02a6, B:48:0x02ac, B:50:0x02b2, B:51:0x02c8, B:13:0x00c6, B:8:0x0069, B:160:0x05a7, B:143:0x0566, B:147:0x0571, B:151:0x058a, B:72:0x0344, B:73:0x0356, B:75:0x035c, B:77:0x0368, B:79:0x0372, B:81:0x0380, B:84:0x038a, B:86:0x0390, B:154:0x0597, B:157:0x05a0, B:112:0x047c, B:116:0x048d, B:120:0x0498), top: B:198:0x0018, inners: #2, #5, #6, #9, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0295 A[Catch: Exception -> 0x0292, TryCatch #8 {Exception -> 0x0292, blocks: (B:5:0x0018, B:9:0x006d, B:14:0x00cb, B:37:0x017b, B:38:0x017e, B:40:0x028c, B:52:0x02cb, B:56:0x02e9, B:58:0x0306, B:60:0x030c, B:61:0x0312, B:63:0x0318, B:65:0x031e, B:66:0x0325, B:67:0x0328, B:69:0x032e, B:70:0x0338, B:89:0x039d, B:91:0x03a5, B:94:0x03ac, B:96:0x03b2, B:97:0x03ba, B:99:0x03c0, B:101:0x03cc, B:103:0x03d2, B:111:0x0461, B:124:0x04ac, B:142:0x0554, B:150:0x0578, B:164:0x05af, B:166:0x05bb, B:167:0x05c6, B:169:0x05d2, B:170:0x05dd, B:172:0x05e3, B:163:0x05ac, B:159:0x05a4, B:153:0x0594, B:149:0x0575, B:123:0x04a3, B:88:0x0394, B:43:0x0295, B:45:0x02a0, B:47:0x02a6, B:48:0x02ac, B:50:0x02b2, B:51:0x02c8, B:13:0x00c6, B:8:0x0069, B:160:0x05a7, B:143:0x0566, B:147:0x0571, B:151:0x058a, B:72:0x0344, B:73:0x0356, B:75:0x035c, B:77:0x0368, B:79:0x0372, B:81:0x0380, B:84:0x038a, B:86:0x0390, B:154:0x0597, B:157:0x05a0, B:112:0x047c, B:116:0x048d, B:120:0x0498), top: B:198:0x0018, inners: #2, #5, #6, #9, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0318 A[Catch: Exception -> 0x0292, TryCatch #8 {Exception -> 0x0292, blocks: (B:5:0x0018, B:9:0x006d, B:14:0x00cb, B:37:0x017b, B:38:0x017e, B:40:0x028c, B:52:0x02cb, B:56:0x02e9, B:58:0x0306, B:60:0x030c, B:61:0x0312, B:63:0x0318, B:65:0x031e, B:66:0x0325, B:67:0x0328, B:69:0x032e, B:70:0x0338, B:89:0x039d, B:91:0x03a5, B:94:0x03ac, B:96:0x03b2, B:97:0x03ba, B:99:0x03c0, B:101:0x03cc, B:103:0x03d2, B:111:0x0461, B:124:0x04ac, B:142:0x0554, B:150:0x0578, B:164:0x05af, B:166:0x05bb, B:167:0x05c6, B:169:0x05d2, B:170:0x05dd, B:172:0x05e3, B:163:0x05ac, B:159:0x05a4, B:153:0x0594, B:149:0x0575, B:123:0x04a3, B:88:0x0394, B:43:0x0295, B:45:0x02a0, B:47:0x02a6, B:48:0x02ac, B:50:0x02b2, B:51:0x02c8, B:13:0x00c6, B:8:0x0069, B:160:0x05a7, B:143:0x0566, B:147:0x0571, B:151:0x058a, B:72:0x0344, B:73:0x0356, B:75:0x035c, B:77:0x0368, B:79:0x0372, B:81:0x0380, B:84:0x038a, B:86:0x0390, B:154:0x0597, B:157:0x05a0, B:112:0x047c, B:116:0x048d, B:120:0x0498), top: B:198:0x0018, inners: #2, #5, #6, #9, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x032e A[Catch: Exception -> 0x0292, TryCatch #8 {Exception -> 0x0292, blocks: (B:5:0x0018, B:9:0x006d, B:14:0x00cb, B:37:0x017b, B:38:0x017e, B:40:0x028c, B:52:0x02cb, B:56:0x02e9, B:58:0x0306, B:60:0x030c, B:61:0x0312, B:63:0x0318, B:65:0x031e, B:66:0x0325, B:67:0x0328, B:69:0x032e, B:70:0x0338, B:89:0x039d, B:91:0x03a5, B:94:0x03ac, B:96:0x03b2, B:97:0x03ba, B:99:0x03c0, B:101:0x03cc, B:103:0x03d2, B:111:0x0461, B:124:0x04ac, B:142:0x0554, B:150:0x0578, B:164:0x05af, B:166:0x05bb, B:167:0x05c6, B:169:0x05d2, B:170:0x05dd, B:172:0x05e3, B:163:0x05ac, B:159:0x05a4, B:153:0x0594, B:149:0x0575, B:123:0x04a3, B:88:0x0394, B:43:0x0295, B:45:0x02a0, B:47:0x02a6, B:48:0x02ac, B:50:0x02b2, B:51:0x02c8, B:13:0x00c6, B:8:0x0069, B:160:0x05a7, B:143:0x0566, B:147:0x0571, B:151:0x058a, B:72:0x0344, B:73:0x0356, B:75:0x035c, B:77:0x0368, B:79:0x0372, B:81:0x0380, B:84:0x038a, B:86:0x0390, B:154:0x0597, B:157:0x05a0, B:112:0x047c, B:116:0x048d, B:120:0x0498), top: B:198:0x0018, inners: #2, #5, #6, #9, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03b2 A[Catch: Exception -> 0x0292, TryCatch #8 {Exception -> 0x0292, blocks: (B:5:0x0018, B:9:0x006d, B:14:0x00cb, B:37:0x017b, B:38:0x017e, B:40:0x028c, B:52:0x02cb, B:56:0x02e9, B:58:0x0306, B:60:0x030c, B:61:0x0312, B:63:0x0318, B:65:0x031e, B:66:0x0325, B:67:0x0328, B:69:0x032e, B:70:0x0338, B:89:0x039d, B:91:0x03a5, B:94:0x03ac, B:96:0x03b2, B:97:0x03ba, B:99:0x03c0, B:101:0x03cc, B:103:0x03d2, B:111:0x0461, B:124:0x04ac, B:142:0x0554, B:150:0x0578, B:164:0x05af, B:166:0x05bb, B:167:0x05c6, B:169:0x05d2, B:170:0x05dd, B:172:0x05e3, B:163:0x05ac, B:159:0x05a4, B:153:0x0594, B:149:0x0575, B:123:0x04a3, B:88:0x0394, B:43:0x0295, B:45:0x02a0, B:47:0x02a6, B:48:0x02ac, B:50:0x02b2, B:51:0x02c8, B:13:0x00c6, B:8:0x0069, B:160:0x05a7, B:143:0x0566, B:147:0x0571, B:151:0x058a, B:72:0x0344, B:73:0x0356, B:75:0x035c, B:77:0x0368, B:79:0x0372, B:81:0x0380, B:84:0x038a, B:86:0x0390, B:154:0x0597, B:157:0x05a0, B:112:0x047c, B:116:0x048d, B:120:0x0498), top: B:198:0x0018, inners: #2, #5, #6, #9, #10, #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.setting.g b(org.json.JSONObject r19) {
        /*
            Method dump skipped, instruction units count: 1524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.setting.b.b(org.json.JSONObject):com.mbridge.msdk.setting.g");
    }

    public void A(int i10) {
        if (i10 > 0) {
            this.f50513i0 = i10;
        }
    }

    public void B(int i10) {
        this.f50511h0 = i10;
    }

    public void C(int i10) {
        this.f50515j0 = i10;
    }

    public int D() {
        return this.R;
    }

    public void E(int i10) {
        this.f50525o0 = i10;
    }

    public void F(int i10) {
        this.f50529q0 = i10;
    }

    public void G(int i10) {
        this.f50527p0 = i10;
    }

    public void H(int i10) {
        this.f50531r0 = i10;
    }

    public void I(int i10) {
        this.f50533s0 = i10;
    }

    public void J(int i10) {
        this.f50500c1 = i10;
    }

    public void K(int i10) {
        this.f50545y0 = i10;
    }

    public void L(int i10) {
        this.f50547z0 = i10;
    }

    public void M(int i10) {
        this.A0 = i10;
    }

    public void N(int i10) {
        this.B0 = i10;
    }

    public void O(int i10) {
        this.C0 = i10;
    }

    public void P(int i10) {
        this.D0 = i10;
    }

    public void Q(int i10) {
        this.F0 = i10;
    }

    public void R(int i10) {
        this.K0 = i10;
    }

    public void S(int i10) {
        this.L0 = i10;
    }

    public void T(int i10) {
        this.N0 = i10;
    }

    public void U(int i10) {
        this.Q0 = i10;
    }

    public void V(int i10) {
        this.R0 = i10;
    }

    public void W(int i10) {
        this.S0 = i10;
    }

    public void X(int i10) {
        this.T0 = i10;
    }

    public void Y(int i10) {
        this.W0 = i10;
    }

    public int Z() {
        return this.f50500c1;
    }

    public void a0(int i10) {
        this.Y0 = i10;
    }

    public void c(String str) {
        this.f50512i = str;
    }

    public void d(int i10) {
        this.f50506f = i10;
    }

    public void e(String str) {
        this.f50516k = str;
    }

    public int f() {
        return this.f50520m;
    }

    public List<com.mbridge.msdk.foundation.entity.a> g() {
        return this.f50522n;
    }

    public int h() {
        return this.f50524o;
    }

    public long i() {
        return this.f50526p;
    }

    public void j(int i10) {
        this.f50536u = i10;
    }

    public void k(int i10) {
        this.f50538v = i10;
    }

    public void l(int i10) {
        this.C = i10;
    }

    public void m(String str) {
        this.E = str;
    }

    public void n(int i10) {
        this.K = i10;
    }

    public void o(int i10) {
        this.M = i10;
        com.mbridge.msdk.foundation.same.net.utils.d.h().d(i10);
    }

    public void p(int i10) {
        this.N = i10;
    }

    public void q(int i10) {
        this.R = i10;
    }

    public void r(int i10) {
        this.U = i10;
    }

    public void s(int i10) {
        this.V = i10;
    }

    public int t() {
        return this.C;
    }

    public void u(int i10) {
        this.f50493a0 = i10;
    }

    public void v(int i10) {
        this.f50496b0 = i10;
        com.mbridge.msdk.foundation.same.net.utils.d.h().b(i10);
        com.mbridge.msdk.foundation.same.net.utils.d.h().c(i10);
    }

    public void w(int i10) {
        this.f50499c0 = i10;
    }

    public void x(int i10) {
        this.f50502d0 = i10;
    }

    public void y(int i10) {
        this.f50505e0 = i10;
    }

    public void z(int i10) {
        this.f50507f0 = i10;
    }

    public void A(String str) {
        this.U0 = str;
    }

    public void B(String str) {
        this.V0 = str;
    }

    public String c() {
        return this.f50514j;
    }

    public void d(String str) {
        this.f50514j = str;
    }

    public int e() {
        return this.f50518l;
    }

    public void f(String str) {
        this.f50530r = str;
    }

    public void g(String str) {
        this.f50542x = str;
    }

    public void h(String str) {
        this.f50544y = str;
    }

    public void i(String str) {
        this.f50546z = str;
    }

    public void j(String str) {
        this.A = str;
    }

    public void k(String str) {
        this.B = str;
    }

    public void l(String str) {
        this.D = str;
    }

    public void m(int i10) {
        this.G = i10;
        com.mbridge.msdk.click.utils.a.f46632d = i10;
    }

    public void n(String str) {
        this.f50503d1 = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e.a().b(k0.a(str));
    }

    public void p(String str) {
        this.X = str;
    }

    public void q(String str) {
        this.Z = str;
    }

    public void r(String str) {
        this.f50517k0 = str;
    }

    public void s(String str) {
        this.f50519l0 = str;
    }

    public void t(int i10) {
        this.W = i10;
    }

    public void u(String str) {
        this.f50521m0 = str;
    }

    public void w(String str) {
        this.f50535t0 = str;
    }

    public void x(String str) {
        this.f50537u0 = str;
    }

    public void y(String str) {
        this.I0 = str;
    }

    public void z(String str) {
        if (TextUtils.isEmpty(this.f50509g0)) {
            return;
        }
        this.f50509g0 = str;
        if (TextUtils.isEmpty(com.mbridge.msdk.foundation.controller.c.n().j())) {
            com.mbridge.msdk.foundation.controller.c.n().d(this.f50509g0);
        }
    }

    public void c(long j10) {
        this.L = j10;
    }

    public String d() {
        return this.f50516k;
    }

    public void e(long j10) {
        this.f50539v0 = j10;
    }

    public void f(long j10) {
        this.f50541w0 = j10;
    }

    public void g(long j10) {
        this.J0 = j10;
    }

    public void h(long j10) {
        this.M0 = j10;
    }

    public void i(long j10) {
        this.O0 = j10;
    }

    public void o(String str) {
        this.P = str;
    }

    public void c(JSONArray jSONArray) {
        this.G0 = jSONArray;
    }

    public void d(boolean z10) {
        this.S = z10;
    }

    public void e(boolean z10) {
        this.f50492a = z10;
    }

    public void f(boolean z10) {
        this.T = z10;
    }

    public void g(boolean z10) {
        this.E0 = z10;
    }

    public void h(boolean z10) {
        this.P0 = z10;
    }

    public void v(String str) {
        this.f50523n0 = str;
    }

    public void c(JSONObject jSONObject) {
        this.H0 = jSONObject;
    }

    public void c(boolean z10) {
        this.f50540w = z10;
    }

    public static Map<String, a> a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                a aVar = new a();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    aVar.a(jSONObjectOptJSONObject);
                }
                map.put(next, aVar);
            }
            return map;
        } catch (JSONException e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return null;
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                e11.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.setting.b$b, reason: collision with other inner class name */
    public static class C0564b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f50552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONArray f50553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f50554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f50555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f50556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f50557f;

        public static C0564b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C0564b c0564b = new C0564b();
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            c0564b.f50557f = jSONObject.optString("title", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_title", TypedValues.Custom.S_STRING)));
            c0564b.f50552a = jSONObject.optString(MenuActionType.CANCEL, contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_close_close", TypedValues.Custom.S_STRING)));
            c0564b.f50555d = jSONObject.optString("submit", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_close_submit", TypedValues.Custom.S_STRING)));
            c0564b.f50556e = jSONObject.optString("submit_notice", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_submit_notice", TypedValues.Custom.S_STRING)));
            c0564b.f50554c = jSONObject.optString("privacy", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_privacy_des", TypedValues.Custom.S_STRING)));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("content");
            c0564b.f50553b = jSONArrayOptJSONArray;
            if (jSONArrayOptJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                c0564b.f50553b = jSONArray;
                jSONArray.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_not_play", TypedValues.Custom.S_STRING)));
                c0564b.f50553b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_sound_problems", TypedValues.Custom.S_STRING)));
                c0564b.f50553b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_misleading", TypedValues.Custom.S_STRING)));
                c0564b.f50553b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_fraud", TypedValues.Custom.S_STRING)));
                c0564b.f50553b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_por_violence", TypedValues.Custom.S_STRING)));
                c0564b.f50553b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_other", TypedValues.Custom.S_STRING)));
            }
            return c0564b;
        }

        public JSONArray b() {
            return this.f50553b;
        }

        public String c() {
            return this.f50554c;
        }

        public String d() {
            return this.f50555d;
        }

        public String e() {
            return this.f50556e;
        }

        public String f() {
            return this.f50557f;
        }

        public String a() {
            return this.f50552a;
        }
    }

    public void a(int i10) {
        this.f50543x0.add(Integer.valueOf(i10));
    }

    private static void a(JSONObject jSONObject) {
        FastKV fastKVBuild = null;
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            try {
                fastKVBuild = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), k0.a("H+tU+FeXHM==")).build();
            } catch (Exception unused) {
            }
        }
        if (fastKVBuild != null) {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (jSONObject == null || contextD == null) {
                    return;
                }
                String strOptString = jSONObject.optString("b");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.V, strOptString)) {
                    com.mbridge.msdk.foundation.same.a.V = strOptString;
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b", com.mbridge.msdk.foundation.same.a.V);
                    try {
                        fastKVBuild.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                    } catch (Exception unused2) {
                    }
                }
                String strOptString2 = jSONObject.optString(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
                if (TextUtils.isEmpty(strOptString2) || TextUtils.equals(com.mbridge.msdk.foundation.same.a.f48595g, strOptString2)) {
                    return;
                }
                com.mbridge.msdk.foundation.same.a.f48595g = strOptString2;
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, com.mbridge.msdk.foundation.same.a.f48595g);
                try {
                    fastKVBuild.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f48595g);
                    return;
                } catch (Exception unused3) {
                    return;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        try {
            Context contextD2 = com.mbridge.msdk.foundation.controller.c.n().d();
            if (jSONObject == null || contextD2 == null) {
                return;
            }
            String strOptString3 = jSONObject.optString("b");
            if (!TextUtils.isEmpty(strOptString3) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.V, strOptString3)) {
                com.mbridge.msdk.foundation.same.a.V = strOptString3;
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b", com.mbridge.msdk.foundation.same.a.V);
                SharedPreferences sharedPreferences = contextD2.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
                if (sharedPreferences != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                    editorEdit.apply();
                }
            }
            String strOptString4 = jSONObject.optString(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
            if (TextUtils.isEmpty(strOptString4) || TextUtils.equals(com.mbridge.msdk.foundation.same.a.f48595g, strOptString4)) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.f48595g = strOptString4;
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, com.mbridge.msdk.foundation.same.a.f48595g);
            SharedPreferences sharedPreferences2 = contextD2.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
            if (sharedPreferences2 != null) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                editorEdit2.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f48595g);
                editorEdit2.apply();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public String a() {
        return this.f50501d;
    }

    public void a(List<com.mbridge.msdk.foundation.entity.a> list) {
        this.f50522n = list;
    }

    public void a(long j10) {
        this.f50526p = j10;
    }

    public void a(com.mbridge.msdk.setting.a aVar) {
        this.f50528q = aVar;
    }

    public void a(Map<String, a> map) {
        this.f50532s = map;
    }

    public void a(ArrayList<Integer> arrayList) {
        this.H = arrayList;
    }

    public void a(d dVar) {
        this.I = dVar;
    }

    public void a(C0564b c0564b) {
        this.J = c0564b;
    }

    public void a(HashMap<String, String> map) {
        this.O = map;
    }

    public void a(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            jSONArray.put("2000088");
        }
        this.f50495b = jSONArray;
    }

    public void a(boolean z10) {
        this.Q = z10;
    }

    public void b(String str) {
        this.f50501d = str;
    }

    public String b() {
        return this.f50512i;
    }

    public void b(long j10) {
        this.F = j10;
    }

    public void b(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            jSONArray.put("2000041");
            jSONArray.put("2000042");
            jSONArray.put("2000032");
            jSONArray.put("2000079");
        }
        this.f50498c = jSONArray;
    }

    public void b(boolean z10) {
        this.f50534t = z10;
    }

    public boolean b(int i10) {
        return this.f50543x0.contains(Integer.valueOf(i10));
    }
}
