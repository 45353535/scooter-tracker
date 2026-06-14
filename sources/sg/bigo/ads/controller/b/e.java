package sg.bigo.ads.controller.b;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.taurusx.tax.g.e0;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.n;
import sg.bigo.ads.api.a.o;
import sg.bigo.ads.api.core.k;
import sg.bigo.ads.api.core.l;
import sg.bigo.ads.api.core.r;
import sg.bigo.ads.api.core.s;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends sg.bigo.ads.common.e implements sg.bigo.ads.api.a.h {
    protected int A;
    protected boolean B;
    protected String C;
    protected String D;
    protected l E;
    protected sg.bigo.ads.api.a.g F;
    protected n G;
    protected o H;

    @Deprecated
    protected String I;
    protected Map<String, sg.bigo.ads.api.a.c> J;

    @Deprecated
    protected String K;
    protected String L;
    protected c M;
    protected int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg.bigo.ads.api.a.b f103346a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f103347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f103348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f103349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected sg.bigo.ads.common.a f103350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected sg.bigo.ads.common.a f103351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected sg.bigo.ads.common.s.a f103352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected sg.bigo.ads.common.a f103353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected long f103354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f103355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected long f103356n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f103357o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected String f103358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected String f103359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected int f103360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected String f103361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected String f103362t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected String f103363u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected String f103364v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected String f103365w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected String f103366x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Deprecated
    protected String f103367y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected String f103368z;

    public e(@NonNull Context context) {
        super(context);
        this.f103360r = 1;
        this.E = new l();
        this.F = new k();
        this.G = new r();
        this.H = new s();
        this.J = new HashMap();
        this.M = new c();
        this.f103346a = new b();
        this.S = 0;
        this.T = 0;
    }

    public static long E() {
        return sg.bigo.ads.common.utils.r.f102828a.a(30);
    }

    @Override // sg.bigo.ads.api.a.h
    public final int A() {
        return this.R;
    }

    public final void B() {
        L();
        K();
        M();
    }

    public final int C() {
        boolean z10 = Math.abs((sg.bigo.ads.common.utils.r.b() / 1000) - this.f103354l) > ((long) this.f103357o);
        return this.f103360r == 0 ? z10 ? 4 : 5 : z10 ? 3 : 2;
    }

    public final int D() {
        return this.A;
    }

    public final String F() {
        return this.f103368z;
    }

    public final String G() {
        return this.L;
    }

    public final boolean H() {
        return this.f103355m;
    }

    public final String I() {
        return this.C;
    }

    @NonNull
    public final n J() {
        return this.G;
    }

    public final sg.bigo.ads.common.a K() {
        if (this.f103350h == null) {
            this.f103350h = sg.bigo.ads.common.a.f102252a;
        }
        if (this.f103350h.a()) {
            sg.bigo.ads.common.n.d.a(0, new Runnable() { // from class: sg.bigo.ads.controller.b.e.1
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = e.this;
                    eVar.f103350h = sg.bigo.ads.common.o.c.a(eVar.f102308b);
                    e.this.a(0L);
                }
            });
        }
        return this.f103350h;
    }

    public final sg.bigo.ads.common.a L() {
        if (this.f103351i == null) {
            this.f103351i = sg.bigo.ads.common.a.f102252a;
        }
        if (this.f103351i.a()) {
            sg.bigo.ads.common.n.d.a(0, new Runnable() { // from class: sg.bigo.ads.controller.b.e.2
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = e.this;
                    eVar.f103351i = sg.bigo.ads.common.l.b.a(eVar.f102308b);
                    e.this.a(0L);
                }
            });
        }
        return this.f103351i;
    }

    public final sg.bigo.ads.common.a M() {
        if (this.f103353k == null) {
            this.f103353k = sg.bigo.ads.common.a.f102252a;
        }
        if (this.f103353k.a()) {
            sg.bigo.ads.common.n.d.a(0, new Runnable() { // from class: sg.bigo.ads.controller.b.e.3
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = e.this;
                    eVar.f103353k = sg.bigo.ads.common.k.a.a(eVar.f102308b);
                    e.this.a(0L);
                }
            });
        }
        return this.f103353k;
    }

    public final boolean N() {
        return this.f103354l != 0;
    }

    @Override // sg.bigo.ads.common.e
    public final String a() {
        return "bigoad_config.dat";
    }

    protected abstract void a(JSONObject jSONObject);

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f103350h = new sg.bigo.ads.common.a(parcel);
        this.f103351i = new sg.bigo.ads.common.a(parcel);
        this.f103352j = new sg.bigo.ads.common.s.a(this.f102308b, parcel);
        this.f103355m = parcel.readInt() != 0;
        this.f103356n = parcel.readLong();
        this.f103357o = parcel.readInt();
        this.f103358p = parcel.readString();
        this.f103359q = parcel.readString();
        this.f103360r = parcel.readInt();
        this.f103361s = parcel.readString();
        this.f103362t = parcel.readString();
        this.f103363u = parcel.readString();
        this.f103364v = parcel.readString();
        this.f103365w = parcel.readString();
        this.f103366x = parcel.readString();
        this.f103367y = parcel.readString();
        this.f103368z = parcel.readString();
        this.A = parcel.readInt();
        this.B = parcel.readInt() != 0;
        this.C = parcel.readString();
        this.f103354l = parcel.readLong();
        if (parcel.dataAvail() > 0) {
            this.E.b(parcel);
        }
        if (parcel.dataAvail() > 0) {
            this.D = parcel.readString();
        }
        if (parcel.dataAvail() > 0) {
            this.F.b(parcel);
        }
        this.I = sg.bigo.ads.common.n.a(parcel, "");
        this.J = sg.bigo.ads.common.n.a(parcel, sg.bigo.ads.api.a.c.f102104b, new HashMap());
        this.K = sg.bigo.ads.common.n.a(parcel, "");
        if (parcel.dataAvail() > 0) {
            this.G.b(parcel);
        }
        if (parcel.dataAvail() > 0) {
            this.H.b(parcel);
        }
        this.L = sg.bigo.ads.common.n.a(parcel, "");
        sg.bigo.ads.common.n.b(parcel, this.M);
        this.N = sg.bigo.ads.common.n.a(parcel, 0);
        sg.bigo.ads.common.n.b(parcel, this.f103346a);
        this.f103347e = sg.bigo.ads.common.n.a(parcel, 0);
        this.f103348f = sg.bigo.ads.common.n.a(parcel, 0);
        this.f103353k = new sg.bigo.ads.common.a(parcel);
        this.S = sg.bigo.ads.common.n.a(parcel, 0);
        this.T = sg.bigo.ads.common.n.a(parcel, 0);
        String strA = sg.bigo.ads.common.n.a(parcel, "");
        this.f103349g = strA;
        a(strA);
    }

    protected abstract void b(JSONObject jSONObject);

    protected abstract void c(JSONObject jSONObject);

    @Override // sg.bigo.ads.api.a.h
    public final boolean c() {
        return this.E.a(6);
    }

    protected abstract void d(JSONObject jSONObject);

    @Override // sg.bigo.ads.api.a.h
    public final boolean d() {
        return this.E.a(7);
    }

    @CallSuper
    public final int e(@NonNull JSONObject jSONObject) {
        this.f103355m = jSONObject.optInt("state", 1) == 1;
        this.f103356n = jSONObject.optLong("config_id", 0L);
        this.f103357o = jSONObject.optInt("conf_interval", 3600);
        this.f103358p = jSONObject.optString("token", "");
        this.f103359q = jSONObject.optString("anti_ban", "");
        this.f103360r = jSONObject.optInt("config_strategy", 1);
        this.f103361s = jSONObject.optString("abflags", "");
        this.f103362t = jSONObject.optString("country", "");
        this.L = jSONObject.optString("req_country", "");
        int iOptInt = jSONObject.optInt("app_flag", 0);
        int i10 = iOptInt != this.N ? 1 : 0;
        this.N = iOptInt;
        this.f103347e = jSONObject.optInt("ad_net", 0);
        this.f103348f = jSONObject.optInt("orientation", 0);
        this.S = jSONObject.optInt("token_v", 0);
        this.T = jSONObject.optInt("token_exp", 0);
        String strOptString = jSONObject.optString("host_retry_cfg", "");
        this.f103349g = strOptString;
        a(strOptString);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("creatives");
        if (jSONObjectOptJSONObject != null) {
            this.f103363u = jSONObjectOptJSONObject.toString();
        } else {
            this.f103363u = "";
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("track");
        if (jSONObjectOptJSONObject2 != null) {
            this.f103364v = jSONObjectOptJSONObject2.toString();
        } else {
            this.f103364v = "";
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("cb");
        if (jSONObjectOptJSONObject3 != null) {
            this.f103365w = jSONObjectOptJSONObject3.toString();
        } else {
            this.f103365w = "";
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject(Constants.REPORT);
        if (jSONObjectOptJSONObject4 != null) {
            this.f103366x = jSONObjectOptJSONObject4.toString();
        } else {
            this.f103366x = "";
        }
        this.f103367y = "";
        this.K = "";
        String strOptString2 = jSONObject.optString(e0.f66120c, "");
        if (!TextUtils.isEmpty(strOptString2)) {
            this.f103368z = strOptString2;
        }
        int iOptInt2 = jSONObject.optInt("concurrent_req_num", 3);
        this.A = iOptInt2;
        if (iOptInt2 <= 0) {
            this.A = Integer.MAX_VALUE;
        }
        this.B = jSONObject.optInt("neg_feedback", 1) == 1;
        this.C = jSONObject.optString("om_js_url", "");
        this.D = jSONObject.optString("banner_js_url", "");
        this.F.a(jSONObject.optJSONObject("free_material"));
        this.G.a(jSONObject.optJSONObject("u_running_conf"));
        this.H.a(jSONObject.optJSONObject("u_running_inf"));
        this.E.f102206a = jSONObject.optLong("global_switch", 0L);
        this.I = "";
        c cVar = this.M;
        String strOptString3 = jSONObject.optString("ad_fill_strategy");
        if (!TextUtils.isEmpty(strOptString3)) {
            try {
                JSONObject jSONObject2 = new JSONObject(strOptString3);
                cVar.f103324a = jSONObject2.optInt(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, 0);
                cVar.f103325b = jSONObject2.optString("white_dsp", "");
                cVar.f103326c = jSONObject2.optString("black_dsp", "");
                cVar.f103327d = jSONObject2.optInt("int_time", 0);
                cVar.f103328e = jSONObject2.optInt("rew_time", 0);
                cVar.f103329f = jSONObject2.optInt("spl_time", 0);
                cVar.f103330g = jSONObject2.optInt("nat_time", 0);
                cVar.f103331h = jSONObject2.optInt("pop_time", 0);
                cVar.f103332i.a(jSONObject2);
                cVar.f103333j.a(jSONObject2);
                cVar.f103334k.a(jSONObject2);
                cVar.f103335l.a(jSONObject2);
                cVar.f103336m.a(jSONObject2);
            } catch (JSONException unused) {
            }
        }
        this.f103346a.a(jSONObject.optString("ad_fill_cost_optimize_strategy"));
        String strOptString4 = jSONObject.optString("global_conf");
        JSONArray jSONArray = null;
        try {
            if (!q.a((CharSequence) strOptString4)) {
                jSONArray = new JSONArray(strOptString4);
            }
        } catch (JSONException unused2) {
        }
        HashMap map = new HashMap();
        for (int i11 = 0; jSONArray != null && i11 < jSONArray.length(); i11++) {
            JSONObject jSONObjectOptJSONObject5 = jSONArray.optJSONObject(i11);
            if (jSONObjectOptJSONObject5 != null) {
                String strOptString5 = jSONObjectOptJSONObject5.optString(C4240b4.i.W);
                if (!q.a((CharSequence) strOptString5)) {
                    map.put(strOptString5, new sg.bigo.ads.api.a.c(jSONObjectOptJSONObject5.optString("value", "")));
                }
            }
        }
        this.J = map;
        a(jSONObjectOptJSONObject2);
        b(jSONObjectOptJSONObject);
        c(jSONObjectOptJSONObject4);
        d(jSONObjectOptJSONObject3);
        this.f103354l = sg.bigo.ads.common.utils.r.b() / 1000;
        return i10;
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean f() {
        return this.E.a(5);
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean g() {
        return this.E.a(4);
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean h() {
        return this.E.a(22);
    }

    @Override // sg.bigo.ads.api.a.h
    public final long i() {
        return this.f103356n;
    }

    @Override // sg.bigo.ads.api.a.h
    public final String j() {
        return this.f103361s;
    }

    @Override // sg.bigo.ads.api.a.h
    public final String k() {
        return this.f103362t;
    }

    @Override // sg.bigo.ads.api.a.h
    public final String l() {
        return this.f103358p;
    }

    @Override // sg.bigo.ads.api.a.h
    @NonNull
    public final sg.bigo.ads.api.a.j n() {
        return this.E;
    }

    @Override // sg.bigo.ads.api.a.h
    public final String o() {
        return this.D;
    }

    @Override // sg.bigo.ads.api.a.h
    @NonNull
    public final sg.bigo.ads.api.a.g p() {
        return this.F;
    }

    @Override // sg.bigo.ads.api.a.h
    @NonNull
    public final sg.bigo.ads.api.a.b q() {
        return this.f103346a;
    }

    @Override // sg.bigo.ads.api.a.h
    public final sg.bigo.ads.api.a.d r() {
        return this.M;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int s() {
        return this.N;
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean t() {
        return this.f103347e == 1;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int u() {
        return this.f103348f;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int v() {
        return this.S;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int w() {
        return this.T;
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean x() {
        return 1 == this.O;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int y() {
        return this.P;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int z() {
        return this.Q;
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        if (this.f103350h == null) {
            this.f103350h = sg.bigo.ads.common.a.f102252a;
        }
        this.f103350h.a(parcel);
        if (this.f103351i == null) {
            this.f103351i = sg.bigo.ads.common.a.f102252a;
        }
        this.f103351i.a(parcel);
        if (this.f103352j == null) {
            this.f103352j = new sg.bigo.ads.common.s.a(this.f102308b);
        }
        this.f103352j.a(parcel);
        parcel.writeInt(this.f103355m ? 1 : 0);
        parcel.writeLong(this.f103356n);
        parcel.writeInt(this.f103357o);
        parcel.writeString(this.f103358p);
        parcel.writeString(this.f103359q);
        parcel.writeInt(this.f103360r);
        parcel.writeString(this.f103361s);
        parcel.writeString(this.f103362t);
        parcel.writeString(this.f103363u);
        parcel.writeString(this.f103364v);
        parcel.writeString(this.f103365w);
        parcel.writeString(this.f103366x);
        parcel.writeString(this.f103367y);
        parcel.writeString(this.f103368z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeString(this.C);
        parcel.writeLong(this.f103354l);
        this.E.a(parcel);
        parcel.writeString(this.D);
        this.F.a(parcel);
        parcel.writeString(this.I);
        Map<String, sg.bigo.ads.api.a.c> map = this.J;
        int size = map == null ? 0 : map.size();
        parcel.writeInt(size);
        if (size != 0) {
            for (Map.Entry<String, sg.bigo.ads.api.a.c> entry : map.entrySet()) {
                String key = entry.getKey();
                sg.bigo.ads.api.a.c value = entry.getValue();
                if (key == null || value == null) {
                    parcel.writeInt(0);
                } else {
                    sg.bigo.ads.common.n.a(parcel, value);
                    parcel.writeString(key);
                }
            }
        }
        parcel.writeString(this.K);
        this.G.a(parcel);
        this.H.a(parcel);
        parcel.writeString(this.L);
        sg.bigo.ads.common.n.a(parcel, this.M);
        parcel.writeInt(this.N);
        sg.bigo.ads.common.n.a(parcel, this.f103346a);
        parcel.writeInt(this.f103347e);
        parcel.writeInt(this.f103348f);
        if (this.f103353k == null) {
            this.f103353k = sg.bigo.ads.common.a.f102252a;
        }
        this.f103353k.a(parcel);
        parcel.writeInt(this.S);
        parcel.writeInt(this.T);
        parcel.writeString(this.f103349g);
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean e() {
        return d();
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.O = jSONObject.optInt("host_retry", 0);
            this.P = jSONObject.optInt("retry_times", 3);
            this.Q = jSONObject.optInt("retry_interval", 60);
            this.R = jSONObject.optInt("next_retry_interval", 7);
        } catch (JSONException unused) {
        }
    }
}
