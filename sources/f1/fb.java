package f1;

import android.os.SystemClock;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fb {
    public final long A;
    public final int B;
    public final int C;
    public final int D;
    public final long E;
    public final long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f69813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f69814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f69815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f69816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f69817h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f69818i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f69819j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f69820k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f69821l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f69822m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f69823n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f69824o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f69825p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f69826q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f69827r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f69828s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f69829t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f69830u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f69831v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f69832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f69833x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f69834y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f69835z;

    public fb(String sessionId, int i10, String appId, String appVersion, String chartboostSdkVersion, boolean z10, String chartboostSdkGdpr, String chartboostSdkCcpa, String chartboostSdkCoppa, String chartboostSdkLgpd, String deviceId, String deviceMake, String deviceModel, String deviceOsVersion, String devicePlatform, String deviceCountry, String deviceLanguage, String deviceTimezone, String deviceConnectionType, String deviceOrientation, int i11, boolean z11, int i12, boolean z12, int i13, long j10, long j11, int i14, int i15, int i16, long j12, long j13) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(chartboostSdkVersion, "chartboostSdkVersion");
        Intrinsics.checkNotNullParameter(chartboostSdkGdpr, "chartboostSdkGdpr");
        Intrinsics.checkNotNullParameter(chartboostSdkCcpa, "chartboostSdkCcpa");
        Intrinsics.checkNotNullParameter(chartboostSdkCoppa, "chartboostSdkCoppa");
        Intrinsics.checkNotNullParameter(chartboostSdkLgpd, "chartboostSdkLgpd");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(deviceMake, "deviceMake");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceOsVersion, "deviceOsVersion");
        Intrinsics.checkNotNullParameter(devicePlatform, "devicePlatform");
        Intrinsics.checkNotNullParameter(deviceCountry, "deviceCountry");
        Intrinsics.checkNotNullParameter(deviceLanguage, "deviceLanguage");
        Intrinsics.checkNotNullParameter(deviceTimezone, "deviceTimezone");
        Intrinsics.checkNotNullParameter(deviceConnectionType, "deviceConnectionType");
        Intrinsics.checkNotNullParameter(deviceOrientation, "deviceOrientation");
        this.f69810a = sessionId;
        this.f69811b = i10;
        this.f69812c = appId;
        this.f69813d = appVersion;
        this.f69814e = chartboostSdkVersion;
        this.f69815f = z10;
        this.f69816g = chartboostSdkGdpr;
        this.f69817h = chartboostSdkCcpa;
        this.f69818i = chartboostSdkCoppa;
        this.f69819j = chartboostSdkLgpd;
        this.f69820k = deviceId;
        this.f69821l = deviceMake;
        this.f69822m = deviceModel;
        this.f69823n = deviceOsVersion;
        this.f69824o = devicePlatform;
        this.f69825p = deviceCountry;
        this.f69826q = deviceLanguage;
        this.f69827r = deviceTimezone;
        this.f69828s = deviceConnectionType;
        this.f69829t = deviceOrientation;
        this.f69830u = i11;
        this.f69831v = z11;
        this.f69832w = i12;
        this.f69833x = z12;
        this.f69834y = i13;
        this.f69835z = j10;
        this.A = j11;
        this.B = i14;
        this.C = i15;
        this.D = i16;
        this.E = j12;
        this.F = j13;
    }

    public final long A() {
        return this.f69835z;
    }

    public final String B() {
        return this.f69827r;
    }

    public final long C() {
        return this.F;
    }

    public final int D() {
        return this.f69832w;
    }

    public final int E() {
        return this.f69811b;
    }

    public final long a() {
        return this.E;
    }

    public final String b() {
        return this.f69810a;
    }

    public final int c() {
        return this.D;
    }

    public final int d() {
        return this.B;
    }

    public final int e() {
        return this.C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb)) {
            return false;
        }
        fb fbVar = (fb) obj;
        return Intrinsics.areEqual(this.f69810a, fbVar.f69810a) && this.f69811b == fbVar.f69811b && Intrinsics.areEqual(this.f69812c, fbVar.f69812c) && Intrinsics.areEqual(this.f69813d, fbVar.f69813d) && Intrinsics.areEqual(this.f69814e, fbVar.f69814e) && this.f69815f == fbVar.f69815f && Intrinsics.areEqual(this.f69816g, fbVar.f69816g) && Intrinsics.areEqual(this.f69817h, fbVar.f69817h) && Intrinsics.areEqual(this.f69818i, fbVar.f69818i) && Intrinsics.areEqual(this.f69819j, fbVar.f69819j) && Intrinsics.areEqual(this.f69820k, fbVar.f69820k) && Intrinsics.areEqual(this.f69821l, fbVar.f69821l) && Intrinsics.areEqual(this.f69822m, fbVar.f69822m) && Intrinsics.areEqual(this.f69823n, fbVar.f69823n) && Intrinsics.areEqual(this.f69824o, fbVar.f69824o) && Intrinsics.areEqual(this.f69825p, fbVar.f69825p) && Intrinsics.areEqual(this.f69826q, fbVar.f69826q) && Intrinsics.areEqual(this.f69827r, fbVar.f69827r) && Intrinsics.areEqual(this.f69828s, fbVar.f69828s) && Intrinsics.areEqual(this.f69829t, fbVar.f69829t) && this.f69830u == fbVar.f69830u && this.f69831v == fbVar.f69831v && this.f69832w == fbVar.f69832w && this.f69833x == fbVar.f69833x && this.f69834y == fbVar.f69834y && this.f69835z == fbVar.f69835z && this.A == fbVar.A && this.B == fbVar.B && this.C == fbVar.C && this.D == fbVar.D && this.E == fbVar.E && this.F == fbVar.F;
    }

    public final String f() {
        return this.f69812c;
    }

    public final boolean g() {
        return this.f69815f;
    }

    public final String h() {
        return this.f69817h;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.f69810a.hashCode() * 31) + this.f69811b) * 31) + this.f69812c.hashCode()) * 31) + this.f69813d.hashCode()) * 31) + this.f69814e.hashCode()) * 31) + androidx.compose.foundation.c.a(this.f69815f)) * 31) + this.f69816g.hashCode()) * 31) + this.f69817h.hashCode()) * 31) + this.f69818i.hashCode()) * 31) + this.f69819j.hashCode()) * 31) + this.f69820k.hashCode()) * 31) + this.f69821l.hashCode()) * 31) + this.f69822m.hashCode()) * 31) + this.f69823n.hashCode()) * 31) + this.f69824o.hashCode()) * 31) + this.f69825p.hashCode()) * 31) + this.f69826q.hashCode()) * 31) + this.f69827r.hashCode()) * 31) + this.f69828s.hashCode()) * 31) + this.f69829t.hashCode()) * 31) + this.f69830u) * 31) + androidx.compose.foundation.c.a(this.f69831v)) * 31) + this.f69832w) * 31) + androidx.compose.foundation.c.a(this.f69833x)) * 31) + this.f69834y) * 31) + androidx.collection.b.a(this.f69835z)) * 31) + androidx.collection.b.a(this.A)) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + androidx.collection.b.a(this.E)) * 31) + androidx.collection.b.a(this.F);
    }

    public final String i() {
        return this.f69818i;
    }

    public final String j() {
        return this.f69816g;
    }

    public final String k() {
        return this.f69819j;
    }

    public final String l() {
        return this.f69814e;
    }

    public final int m() {
        return this.f69834y;
    }

    public final int n() {
        return this.f69830u;
    }

    public final boolean o() {
        return this.f69831v;
    }

    public final String p() {
        return this.f69828s;
    }

    public final String q() {
        return this.f69825p;
    }

    public final String r() {
        return this.f69820k;
    }

    public final String s() {
        return this.f69826q;
    }

    public final long t() {
        return this.A;
    }

    public String toString() {
        return "EnvironmentData(sessionId=" + this.f69810a + ", sessionCount=" + this.f69811b + ", appId=" + this.f69812c + ", appVersion=" + this.f69813d + ", chartboostSdkVersion=" + this.f69814e + ", chartboostSdkAutocacheEnabled=" + this.f69815f + ", chartboostSdkGdpr=" + this.f69816g + ", chartboostSdkCcpa=" + this.f69817h + ", chartboostSdkCoppa=" + this.f69818i + ", chartboostSdkLgpd=" + this.f69819j + ", deviceId=" + this.f69820k + ", deviceMake=" + this.f69821l + ", deviceModel=" + this.f69822m + ", deviceOsVersion=" + this.f69823n + ", devicePlatform=" + this.f69824o + ", deviceCountry=" + this.f69825p + ", deviceLanguage=" + this.f69826q + ", deviceTimezone=" + this.f69827r + ", deviceConnectionType=" + this.f69828s + ", deviceOrientation=" + this.f69829t + ", deviceBatteryLevel=" + this.f69830u + ", deviceChargingStatus=" + this.f69831v + ", deviceVolume=" + this.f69832w + ", deviceMute=" + this.f69833x + ", deviceAudioOutput=" + this.f69834y + ", deviceStorage=" + this.f69835z + ", deviceLowMemoryWarning=" + this.A + ", sessionImpressionInterstitialCount=" + this.B + ", sessionImpressionRewardedCount=" + this.C + ", sessionImpressionBannerCount=" + this.D + ", sessionDuration=" + this.E + ", deviceUpTime=" + this.F + ")";
    }

    public final String u() {
        return this.f69821l;
    }

    public final String v() {
        return this.f69822m;
    }

    public final boolean w() {
        return this.f69833x;
    }

    public final String x() {
        return this.f69829t;
    }

    public final String y() {
        return this.f69823n;
    }

    public final String z() {
        return this.f69824o;
    }

    public /* synthetic */ fb(String str, int i10, String str2, String str3, String str4, boolean z10, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i11, boolean z11, int i12, boolean z12, int i13, long j10, long j11, int i14, int i15, int i16, long j12, long j13, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? "not available" : str, (i17 & 2) != 0 ? 0 : i10, (i17 & 4) != 0 ? "not available" : str2, (i17 & 8) != 0 ? "not available" : str3, (i17 & 16) != 0 ? "not available" : str4, (i17 & 32) != 0 ? false : z10, (i17 & 64) != 0 ? "not available" : str5, (i17 & 128) != 0 ? "not available" : str6, (i17 & 256) != 0 ? "not available" : str7, (i17 & 512) != 0 ? "not available" : str8, (i17 & 1024) != 0 ? "not available" : str9, (i17 & 2048) != 0 ? "not available" : str10, (i17 & 4096) != 0 ? "not available" : str11, (i17 & 8192) != 0 ? "not available" : str12, (i17 & 16384) != 0 ? "not available" : str13, (i17 & 32768) != 0 ? "not available" : str14, (i17 & 65536) != 0 ? "not available" : str15, (i17 & 131072) != 0 ? "not available" : str16, (i17 & 262144) != 0 ? "not available" : str17, (i17 & 524288) == 0 ? str18 : "not available", (i17 & 1048576) != 0 ? 0 : i11, (i17 & 2097152) != 0 ? false : z11, (i17 & 4194304) != 0 ? 0 : i12, (i17 & 8388608) != 0 ? false : z12, (i17 & 16777216) != 0 ? 0 : i13, (i17 & 33554432) != 0 ? 0L : j10, (i17 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? 0L : j11, (i17 & 134217728) != 0 ? 0 : i14, (i17 & 268435456) != 0 ? 0 : i15, (i17 & 536870912) != 0 ? 0 : i16, (i17 & 1073741824) == 0 ? j12 : 0L, (i17 & Integer.MIN_VALUE) != 0 ? SystemClock.uptimeMillis() : j13);
    }
}
