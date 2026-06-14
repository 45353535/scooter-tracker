package f1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yc f71244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o6 f71245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f71246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h3 f71247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final eb f71248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gd f71249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d4 f71250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i6 f71251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x5 f71252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u3 f71253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b8 f71254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dg f71255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bf f71256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f71257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final pc f71258o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a4 f71259p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u7 f71260q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ag f71261r;

    public u8(yc urlResolver, o6 intentResolver, h1 clickRequest, h3 clickTracking, eb completeRequest, gd mediaType, d4 openMeasurementImpressionCallback, i6 appRequest, x5 downloader, u3 viewProtocol, b8 impressionCounter, dg adUnit, bf adTypeTraits, String location, pc impressionCallback, a4 impressionClickCallback, u7 adUnitRendererImpressionCallback, ag eventTracker) {
        Intrinsics.checkNotNullParameter(urlResolver, "urlResolver");
        Intrinsics.checkNotNullParameter(intentResolver, "intentResolver");
        Intrinsics.checkNotNullParameter(clickRequest, "clickRequest");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        Intrinsics.checkNotNullParameter(completeRequest, "completeRequest");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(viewProtocol, "viewProtocol");
        Intrinsics.checkNotNullParameter(impressionCounter, "impressionCounter");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adTypeTraits, "adTypeTraits");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(impressionCallback, "impressionCallback");
        Intrinsics.checkNotNullParameter(impressionClickCallback, "impressionClickCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f71244a = urlResolver;
        this.f71245b = intentResolver;
        this.f71246c = clickRequest;
        this.f71247d = clickTracking;
        this.f71248e = completeRequest;
        this.f71249f = mediaType;
        this.f71250g = openMeasurementImpressionCallback;
        this.f71251h = appRequest;
        this.f71252i = downloader;
        this.f71253j = viewProtocol;
        this.f71254k = impressionCounter;
        this.f71255l = adUnit;
        this.f71256m = adTypeTraits;
        this.f71257n = location;
        this.f71258o = impressionCallback;
        this.f71259p = impressionClickCallback;
        this.f71260q = adUnitRendererImpressionCallback;
        this.f71261r = eventTracker;
    }

    public final bf a() {
        return this.f71256m;
    }

    public final dg b() {
        return this.f71255l;
    }

    public final u7 c() {
        return this.f71260q;
    }

    public final i6 d() {
        return this.f71251h;
    }

    public final h1 e() {
        return this.f71246c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8)) {
            return false;
        }
        u8 u8Var = (u8) obj;
        return Intrinsics.areEqual(this.f71244a, u8Var.f71244a) && Intrinsics.areEqual(this.f71245b, u8Var.f71245b) && Intrinsics.areEqual(this.f71246c, u8Var.f71246c) && Intrinsics.areEqual(this.f71247d, u8Var.f71247d) && Intrinsics.areEqual(this.f71248e, u8Var.f71248e) && this.f71249f == u8Var.f71249f && Intrinsics.areEqual(this.f71250g, u8Var.f71250g) && Intrinsics.areEqual(this.f71251h, u8Var.f71251h) && Intrinsics.areEqual(this.f71252i, u8Var.f71252i) && Intrinsics.areEqual(this.f71253j, u8Var.f71253j) && Intrinsics.areEqual(this.f71254k, u8Var.f71254k) && Intrinsics.areEqual(this.f71255l, u8Var.f71255l) && Intrinsics.areEqual(this.f71256m, u8Var.f71256m) && Intrinsics.areEqual(this.f71257n, u8Var.f71257n) && Intrinsics.areEqual(this.f71258o, u8Var.f71258o) && Intrinsics.areEqual(this.f71259p, u8Var.f71259p) && Intrinsics.areEqual(this.f71260q, u8Var.f71260q) && Intrinsics.areEqual(this.f71261r, u8Var.f71261r);
    }

    public final h3 f() {
        return this.f71247d;
    }

    public final eb g() {
        return this.f71248e;
    }

    public final x5 h() {
        return this.f71252i;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.f71244a.hashCode() * 31) + this.f71245b.hashCode()) * 31) + this.f71246c.hashCode()) * 31) + this.f71247d.hashCode()) * 31) + this.f71248e.hashCode()) * 31) + this.f71249f.hashCode()) * 31) + this.f71250g.hashCode()) * 31) + this.f71251h.hashCode()) * 31) + this.f71252i.hashCode()) * 31) + this.f71253j.hashCode()) * 31) + this.f71254k.hashCode()) * 31) + this.f71255l.hashCode()) * 31) + this.f71256m.hashCode()) * 31) + this.f71257n.hashCode()) * 31) + this.f71258o.hashCode()) * 31) + this.f71259p.hashCode()) * 31) + this.f71260q.hashCode()) * 31) + this.f71261r.hashCode();
    }

    public final ag i() {
        return this.f71261r;
    }

    public final pc j() {
        return this.f71258o;
    }

    public final a4 k() {
        return this.f71259p;
    }

    public final b8 l() {
        return this.f71254k;
    }

    public final o6 m() {
        return this.f71245b;
    }

    public final String n() {
        return this.f71257n;
    }

    public final gd o() {
        return this.f71249f;
    }

    public final d4 p() {
        return this.f71250g;
    }

    public final yc q() {
        return this.f71244a;
    }

    public final u3 r() {
        return this.f71253j;
    }

    public String toString() {
        return "ImpressionDependency(urlResolver=" + this.f71244a + ", intentResolver=" + this.f71245b + ", clickRequest=" + this.f71246c + ", clickTracking=" + this.f71247d + ", completeRequest=" + this.f71248e + ", mediaType=" + this.f71249f + ", openMeasurementImpressionCallback=" + this.f71250g + ", appRequest=" + this.f71251h + ", downloader=" + this.f71252i + ", viewProtocol=" + this.f71253j + ", impressionCounter=" + this.f71254k + ", adUnit=" + this.f71255l + ", adTypeTraits=" + this.f71256m + ", location=" + this.f71257n + ", impressionCallback=" + this.f71258o + ", impressionClickCallback=" + this.f71259p + ", adUnitRendererImpressionCallback=" + this.f71260q + ", eventTracker=" + this.f71261r + ")";
    }
}
