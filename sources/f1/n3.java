package f1;

import android.os.Build;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f70518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f70519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f70520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f70521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f70522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f70523i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f70524j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f70525k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f70526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final JSONObject f70527m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f70528n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f70529o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f70530p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i9 f70531q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v0 f70532r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jd f70533s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final kf f70534t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z8 f70535u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b9 f70536v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final me f70537w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ne f70538x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l7 f70539y;

    public n3(String str, String str2, kf kfVar, z8 z8Var, i9 i9Var, jd jdVar, b9 b9Var, v0 v0Var, me meVar, ne neVar, l7 l7Var) {
        String str3;
        this.f70534t = kfVar;
        this.f70535u = z8Var;
        this.f70531q = i9Var;
        this.f70533s = jdVar;
        this.f70536v = b9Var;
        this.f70532r = v0Var;
        this.f70522h = str;
        this.f70523i = str2;
        this.f70537w = meVar;
        this.f70538x = neVar;
        this.f70539y = l7Var;
        String str4 = Build.PRODUCT;
        if ("sdk".equals(str4) || "google_sdk".equals(str4) || ((str3 = Build.MANUFACTURER) != null && str3.contains("Genymotion"))) {
            this.f70515a = "Android Simulator";
        } else {
            this.f70515a = Build.MODEL;
        }
        String str5 = Build.MANUFACTURER;
        this.f70525k = str5 == null ? "unknown" : str5;
        this.f70524j = str5 + " " + Build.MODEL;
        this.f70526l = neVar.b();
        this.f70516b = "Android " + Build.VERSION.RELEASE;
        this.f70517c = Locale.getDefault().getCountry();
        this.f70518d = Locale.getDefault().getLanguage();
        this.f70521g = "9.10.2";
        this.f70519e = neVar.i();
        this.f70520f = neVar.g();
        this.f70528n = e(i9Var);
        this.f70527m = b(i9Var);
        this.f70529o = g3.a();
        this.f70530p = z8Var.a();
    }

    public me a() {
        return this.f70537w;
    }

    public final JSONObject b(i9 i9Var) {
        return i9Var != null ? c(i9Var, new ma()) : new JSONObject();
    }

    public JSONObject c(i9 i9Var, ma maVar) {
        return maVar != null ? maVar.a(i9Var) : new JSONObject();
    }

    public ne d() {
        return this.f70538x;
    }

    public final String e(i9 i9Var) {
        return i9Var != null ? i9Var.d() : "";
    }

    public kf f() {
        return this.f70534t;
    }

    public l7 g() {
        return this.f70539y;
    }

    public Integer h() {
        return Integer.valueOf(this.f70538x.f());
    }

    public v0 i() {
        return this.f70532r;
    }

    public z8 j() {
        return this.f70535u;
    }

    public jd k() {
        return this.f70533s;
    }

    public int l() {
        jd jdVar = this.f70533s;
        if (jdVar != null) {
            return jdVar.f();
        }
        return -1;
    }

    public b9 m() {
        return this.f70536v;
    }
}
