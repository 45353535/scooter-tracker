package com.appodeal.ads.networking.binders;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements q {
    public final long A;
    public final long B;
    public final long C;
    public final long D;
    public final long E;
    public final long F;
    public final double G;
    public final boolean H;
    public final Boolean I;
    public final JSONObject J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f14026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f14027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Long f14028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f14029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f14030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f14031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f14032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final double f14033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f14034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f14035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f14036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f14037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f14038u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f14039v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f14040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f14041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f14042y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final double f14043z;

    public e(String appKey, String sdk, String osVersion, String osv, String platform, String android2, int i10, String packageName, String str, Integer num, Long l10, String str2, String str3, String str4, String str5, double d10, String deviceType, boolean z10, String manufacturer, String deviceModelManufacturer, boolean z11, String str6, int i11, int i12, String str7, double d11, long j10, long j11, long j12, long j13, long j14, long j15, double d12, boolean z12, Boolean bool, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(sdk, "sdk");
        Intrinsics.checkNotNullParameter("Android", "os");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(osv, "osv");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(android2, "android");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(deviceModelManufacturer, "deviceModelManufacturer");
        this.f14018a = appKey;
        this.f14019b = sdk;
        this.f14020c = osVersion;
        this.f14021d = osv;
        this.f14022e = platform;
        this.f14023f = android2;
        this.f14024g = i10;
        this.f14025h = packageName;
        this.f14026i = str;
        this.f14027j = num;
        this.f14028k = l10;
        this.f14029l = str2;
        this.f14030m = str3;
        this.f14031n = str4;
        this.f14032o = str5;
        this.f14033p = d10;
        this.f14034q = deviceType;
        this.f14035r = z10;
        this.f14036s = manufacturer;
        this.f14037t = deviceModelManufacturer;
        this.f14038u = z11;
        this.f14039v = str6;
        this.f14040w = i11;
        this.f14041x = i12;
        this.f14042y = str7;
        this.f14043z = d11;
        this.A = j10;
        this.B = j11;
        this.C = j12;
        this.D = j13;
        this.E = j14;
        this.F = j15;
        this.G = d12;
        this.H = z12;
        this.I = bool;
        this.J = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f14018a, eVar.f14018a) && Intrinsics.areEqual(this.f14019b, eVar.f14019b) && Intrinsics.areEqual("Android", "Android") && Intrinsics.areEqual(this.f14020c, eVar.f14020c) && Intrinsics.areEqual(this.f14021d, eVar.f14021d) && Intrinsics.areEqual(this.f14022e, eVar.f14022e) && Intrinsics.areEqual(this.f14023f, eVar.f14023f) && this.f14024g == eVar.f14024g && Intrinsics.areEqual(this.f14025h, eVar.f14025h) && Intrinsics.areEqual(this.f14026i, eVar.f14026i) && Intrinsics.areEqual(this.f14027j, eVar.f14027j) && Intrinsics.areEqual(this.f14028k, eVar.f14028k) && Intrinsics.areEqual(this.f14029l, eVar.f14029l) && Intrinsics.areEqual(this.f14030m, eVar.f14030m) && Intrinsics.areEqual(this.f14031n, eVar.f14031n) && Intrinsics.areEqual(this.f14032o, eVar.f14032o) && Double.compare(this.f14033p, eVar.f14033p) == 0 && Intrinsics.areEqual(this.f14034q, eVar.f14034q) && this.f14035r == eVar.f14035r && Intrinsics.areEqual(this.f14036s, eVar.f14036s) && Intrinsics.areEqual(this.f14037t, eVar.f14037t) && this.f14038u == eVar.f14038u && Intrinsics.areEqual(this.f14039v, eVar.f14039v) && this.f14040w == eVar.f14040w && this.f14041x == eVar.f14041x && Intrinsics.areEqual(this.f14042y, eVar.f14042y) && Double.compare(this.f14043z, eVar.f14043z) == 0 && this.A == eVar.A && this.B == eVar.B && this.C == eVar.C && this.D == eVar.D && this.E == eVar.E && this.F == eVar.F && Double.compare(this.G, eVar.G) == 0 && this.H == eVar.H && Intrinsics.areEqual(this.I, eVar.I) && Intrinsics.areEqual(this.J, eVar.J);
    }

    public final int hashCode() {
        int iA = com.appodeal.ads.initializing.f.a(this.f14025h, (this.f14024g + com.appodeal.ads.initializing.f.a(this.f14023f, com.appodeal.ads.initializing.f.a(this.f14022e, com.appodeal.ads.initializing.f.a(this.f14021d, com.appodeal.ads.initializing.f.a(this.f14020c, (((this.f14019b.hashCode() + (this.f14018a.hashCode() * 31)) * 31) + 803262031) * 31, 31), 31), 31), 31)) * 31, 31);
        String str = this.f14026i;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f14027j;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l10 = this.f14028k;
        int iA2 = com.appodeal.ads.initializing.f.a(this.f14029l, (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31, 31);
        String str2 = this.f14030m;
        int iHashCode3 = (iA2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14031n;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14032o;
        int iA3 = (androidx.compose.foundation.c.a(this.f14038u) + com.appodeal.ads.initializing.f.a(this.f14037t, com.appodeal.ads.initializing.f.a(this.f14036s, (androidx.compose.foundation.c.a(this.f14035r) + com.appodeal.ads.initializing.f.a(this.f14034q, (androidx.collection.a.a(this.f14033p) + ((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, 31)) * 31, 31), 31)) * 31;
        String str5 = this.f14039v;
        int iHashCode5 = (this.f14041x + ((this.f14040w + ((iA3 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31)) * 31;
        String str6 = this.f14042y;
        int iA4 = (androidx.compose.foundation.c.a(this.H) + ((androidx.collection.a.a(this.G) + com.appodeal.ads.networking.e.a(this.F, com.appodeal.ads.networking.e.a(this.E, com.appodeal.ads.networking.e.a(this.D, com.appodeal.ads.networking.e.a(this.C, com.appodeal.ads.networking.e.a(this.B, com.appodeal.ads.networking.e.a(this.A, (androidx.collection.a.a(this.f14043z) + ((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31, 31), 31), 31), 31), 31), 31)) * 31)) * 31;
        Boolean bool = this.I;
        int iHashCode6 = (iA4 + (bool == null ? 0 : bool.hashCode())) * 31;
        JSONObject jSONObject = this.J;
        return iHashCode6 + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    public final String toString() {
        return "Base(appKey=" + this.f14018a + ", sdk=" + this.f14019b + ", os=Android, osVersion=" + this.f14020c + ", osv=" + this.f14021d + ", platform=" + this.f14022e + ", android=" + this.f14023f + ", androidLevel=" + this.f14024g + ", packageName=" + this.f14025h + ", packageVersion=" + this.f14026i + ", versionCode=" + this.f14027j + ", installTime=" + this.f14028k + ", installer=" + this.f14029l + ", appodealFramework=" + this.f14030m + ", appodealFrameworkVersion=" + this.f14031n + ", appodealPluginVersion=" + this.f14032o + ", screenPxRatio=" + this.f14033p + ", deviceType=" + this.f14034q + ", httpAllowed=" + this.f14035r + ", manufacturer=" + this.f14036s + ", deviceModelManufacturer=" + this.f14037t + ", rooted=" + this.f14038u + ", webviewVersion=" + this.f14039v + ", screenWidth=" + this.f14040w + ", screenHeight=" + this.f14041x + ", crr=" + this.f14042y + ", battery=" + this.f14043z + ", storageSize=" + this.A + ", storageFree=" + this.B + ", storageUsed=" + this.C + ", ramSize=" + this.D + ", ramFree=" + this.E + ", ramUsed=" + this.F + ", cpuUsage=" + this.G + ", coppa=" + this.H + ", testMode=" + this.I + ", extensions=" + this.J + ")";
    }
}
