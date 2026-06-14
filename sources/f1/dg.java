package f1;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import f1.bb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class dg {
    public final String A;
    public final boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f69666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f69667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f69669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d2 f69670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f69671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f69672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f69673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f69674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f69675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f69676k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f69677l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f69678m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f69679n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f69680o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f69681p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f69682q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f9 f69683r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map f69684s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w0 f69685t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List f69686u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Map f69687v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f69688w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f69689x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a6 f69690y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final q0 f69691z;

    public dg(String name, String adId, String baseUrl, String impressionId, d2 infoIcon, String cgn, String creative, String mediaType, Map assets, String videoUrl, String videoFilename, String link, String deepLink, String to, int i10, String rewardCurrency, String template, f9 body, Map parameters, w0 renderingEngine, List scripts, Map events, String adm, String templateParams, a6 mtype, q0 clkp, String decodedAdm) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
        Intrinsics.checkNotNullParameter(cgn, "cgn");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(videoFilename, "videoFilename");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(rewardCurrency, "rewardCurrency");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(renderingEngine, "renderingEngine");
        Intrinsics.checkNotNullParameter(scripts, "scripts");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(templateParams, "templateParams");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(clkp, "clkp");
        Intrinsics.checkNotNullParameter(decodedAdm, "decodedAdm");
        this.f69666a = name;
        this.f69667b = adId;
        this.f69668c = baseUrl;
        this.f69669d = impressionId;
        this.f69670e = infoIcon;
        this.f69671f = cgn;
        this.f69672g = creative;
        this.f69673h = mediaType;
        this.f69674i = assets;
        this.f69675j = videoUrl;
        this.f69676k = videoFilename;
        this.f69677l = link;
        this.f69678m = deepLink;
        this.f69679n = to;
        this.f69680o = i10;
        this.f69681p = rewardCurrency;
        this.f69682q = template;
        this.f69683r = body;
        this.f69684s = parameters;
        this.f69685t = renderingEngine;
        this.f69686u = scripts;
        this.f69687v = events;
        this.f69688w = adm;
        this.f69689x = templateParams;
        this.f69690y = mtype;
        this.f69691z = clkp;
        this.A = decodedAdm;
        this.B = videoUrl.length() > 0 && this.f69676k.length() > 0;
    }

    public final int A() {
        return this.f69680o;
    }

    public final String B() {
        return this.f69681p;
    }

    public final List C() {
        return this.f69686u;
    }

    public final String D() {
        return this.f69682q;
    }

    public final String E() {
        return this.f69689x;
    }

    public final String a() {
        return this.f69679n;
    }

    public final String b() {
        return this.f69676k;
    }

    public final String c() {
        return this.f69675j;
    }

    public final boolean d() {
        return this.B;
    }

    public final Map e() {
        Map map = this.f69684s;
        Map map2 = this.f69674i;
        ArrayList arrayList = new ArrayList(map2.size());
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            f9 f9Var = (f9) entry.getValue();
            arrayList.add(TuplesKt.to(str, f9Var.f69807a + "/" + f9Var.f69808b));
        }
        return MapsKt.plus(map, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg)) {
            return false;
        }
        dg dgVar = (dg) obj;
        return Intrinsics.areEqual(this.f69666a, dgVar.f69666a) && Intrinsics.areEqual(this.f69667b, dgVar.f69667b) && Intrinsics.areEqual(this.f69668c, dgVar.f69668c) && Intrinsics.areEqual(this.f69669d, dgVar.f69669d) && Intrinsics.areEqual(this.f69670e, dgVar.f69670e) && Intrinsics.areEqual(this.f69671f, dgVar.f69671f) && Intrinsics.areEqual(this.f69672g, dgVar.f69672g) && Intrinsics.areEqual(this.f69673h, dgVar.f69673h) && Intrinsics.areEqual(this.f69674i, dgVar.f69674i) && Intrinsics.areEqual(this.f69675j, dgVar.f69675j) && Intrinsics.areEqual(this.f69676k, dgVar.f69676k) && Intrinsics.areEqual(this.f69677l, dgVar.f69677l) && Intrinsics.areEqual(this.f69678m, dgVar.f69678m) && Intrinsics.areEqual(this.f69679n, dgVar.f69679n) && this.f69680o == dgVar.f69680o && Intrinsics.areEqual(this.f69681p, dgVar.f69681p) && Intrinsics.areEqual(this.f69682q, dgVar.f69682q) && Intrinsics.areEqual(this.f69683r, dgVar.f69683r) && Intrinsics.areEqual(this.f69684s, dgVar.f69684s) && this.f69685t == dgVar.f69685t && Intrinsics.areEqual(this.f69686u, dgVar.f69686u) && Intrinsics.areEqual(this.f69687v, dgVar.f69687v) && Intrinsics.areEqual(this.f69688w, dgVar.f69688w) && Intrinsics.areEqual(this.f69689x, dgVar.f69689x) && this.f69690y == dgVar.f69690y && this.f69691z == dgVar.f69691z && Intrinsics.areEqual(this.A, dgVar.A);
    }

    public final String f() {
        return this.f69667b;
    }

    public final String g() {
        return this.A.length() == 0 ? "" : StringsKt.e0(this.A, "<VAST ", true) ? com.taurusx.tax.f.w.f66049y : "Inline";
    }

    public final String h() {
        return this.f69688w;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((this.f69666a.hashCode() * 31) + this.f69667b.hashCode()) * 31) + this.f69668c.hashCode()) * 31) + this.f69669d.hashCode()) * 31) + this.f69670e.hashCode()) * 31) + this.f69671f.hashCode()) * 31) + this.f69672g.hashCode()) * 31) + this.f69673h.hashCode()) * 31) + this.f69674i.hashCode()) * 31) + this.f69675j.hashCode()) * 31) + this.f69676k.hashCode()) * 31) + this.f69677l.hashCode()) * 31) + this.f69678m.hashCode()) * 31) + this.f69679n.hashCode()) * 31) + this.f69680o) * 31) + this.f69681p.hashCode()) * 31) + this.f69682q.hashCode()) * 31) + this.f69683r.hashCode()) * 31) + this.f69684s.hashCode()) * 31) + this.f69685t.hashCode()) * 31) + this.f69686u.hashCode()) * 31) + this.f69687v.hashCode()) * 31) + this.f69688w.hashCode()) * 31) + this.f69689x.hashCode()) * 31) + this.f69690y.hashCode()) * 31) + this.f69691z.hashCode()) * 31) + this.A.hashCode();
    }

    public final Map i() {
        return this.f69674i;
    }

    public final String j() {
        return this.f69668c;
    }

    public final f9 k() {
        return this.f69683r;
    }

    public final String l() {
        return this.f69671f;
    }

    public final q0 m() {
        return this.f69691z;
    }

    public final String n() {
        return this.f69672g;
    }

    public final String o() {
        return this.A;
    }

    public final String p() {
        return this.f69678m;
    }

    public final Map q() {
        return this.f69687v;
    }

    public final String r() {
        return this.f69669d;
    }

    public final d2 s() {
        return this.f69670e;
    }

    public final String t() {
        return this.f69677l;
    }

    public String toString() {
        return "AdUnit(name=" + this.f69666a + ", adId=" + this.f69667b + ", baseUrl=" + this.f69668c + ", impressionId=" + this.f69669d + ", infoIcon=" + this.f69670e + ", cgn=" + this.f69671f + ", creative=" + this.f69672g + ", mediaType=" + this.f69673h + ", assets=" + this.f69674i + ", videoUrl=" + this.f69675j + ", videoFilename=" + this.f69676k + ", link=" + this.f69677l + ", deepLink=" + this.f69678m + ", to=" + this.f69679n + ", rewardAmount=" + this.f69680o + ", rewardCurrency=" + this.f69681p + ", template=" + this.f69682q + ", body=" + this.f69683r + ", parameters=" + this.f69684s + ", renderingEngine=" + this.f69685t + ", scripts=" + this.f69686u + ", events=" + this.f69687v + ", adm=" + this.f69688w + ", templateParams=" + this.f69689x + ", mtype=" + this.f69690y + ", clkp=" + this.f69691z + ", decodedAdm=" + this.A + ")";
    }

    public final String u() {
        return this.f69673h;
    }

    public final a6 v() {
        return this.f69690y;
    }

    public final String w() {
        return this.f69666a;
    }

    public final Map x() {
        return this.f69684s;
    }

    public final String y() {
        JSONObject jSONObjectC = bb.c(new bb.a[0]);
        for (Map.Entry entry : e().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Intrinsics.checkNotNull(jSONObjectC);
            tb.b(jSONObjectC, str, str2);
        }
        String string = jSONObjectC.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final w0 z() {
        return this.f69685t;
    }

    public /* synthetic */ dg(String str, String str2, String str3, String str4, d2 d2Var, String str5, String str6, String str7, Map map, String str8, String str9, String str10, String str11, String str12, int i10, String str13, String str14, f9 f9Var, Map map2, w0 w0Var, List list, Map map3, String str15, String str16, a6 a6Var, q0 q0Var, String str17, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "https://live.chartboost.com" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? new d2(null, null, null, null, null, null, 63, null) : d2Var, (i11 & 32) != 0 ? "" : str5, (i11 & 64) != 0 ? "" : str6, (i11 & 128) != 0 ? "" : str7, (i11 & 256) != 0 ? new HashMap() : map, (i11 & 512) != 0 ? "" : str8, (i11 & 1024) != 0 ? "" : str9, (i11 & 2048) != 0 ? "" : str10, (i11 & 4096) != 0 ? "" : str11, (i11 & 8192) != 0 ? "" : str12, (i11 & 16384) != 0 ? 0 : i10, (i11 & 32768) != 0 ? "" : str13, (i11 & 65536) != 0 ? "" : str14, (i11 & 131072) != 0 ? new f9("", "", "") : f9Var, (i11 & 262144) != 0 ? new HashMap() : map2, (i11 & 524288) != 0 ? w0.f71427g : w0Var, (i11 & 1048576) != 0 ? CollectionsKt.emptyList() : list, (i11 & 2097152) != 0 ? new HashMap() : map3, (i11 & 4194304) != 0 ? "" : str15, (i11 & 8388608) != 0 ? "" : str16, (i11 & 16777216) != 0 ? a6.f69372c : a6Var, (i11 & 33554432) != 0 ? q0.f70797d : q0Var, (i11 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? "" : str17);
    }
}
