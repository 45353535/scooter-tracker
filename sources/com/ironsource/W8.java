package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import java.text.DecimalFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class W8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f41972c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f41973d = "auctionId";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f41974e = "adUnit";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f41975f = "adFormat";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f41976g = "mediationAdUnitName";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f41977h = "mediationAdUnitId";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f41978i = "country";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f41979j = "ab";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f41980k = "segmentName";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f41981l = "placement";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f41982m = "adNetwork";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f41983n = "instanceName";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final String f41984o = "instanceId";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final String f41985p = "revenue";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final String f41986q = "precision";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final String f41987r = "encryptedCPM";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String f41988s = "creativeId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdInfo f41989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final DecimalFormat f41990b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public W8(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f41989a = adInfo;
        this.f41990b = new DecimalFormat("#.#####");
    }

    @NotNull
    public final String a() {
        return this.f41989a.getAb();
    }

    @NotNull
    public final String b() {
        return this.f41989a.getAdFormat();
    }

    @NotNull
    public final String c() {
        return this.f41989a.getAdNetwork();
    }

    @NotNull
    public final JSONObject d() {
        return this.f41989a.impressionData$mediationsdk_release();
    }

    @NotNull
    public final String e() {
        return this.f41989a.getAuctionId();
    }

    @NotNull
    public final String f() {
        return this.f41989a.getCountry();
    }

    @NotNull
    public final String g() {
        return this.f41989a.getCreativeId();
    }

    @NotNull
    public final String h() {
        return this.f41989a.getEncryptedCPM();
    }

    @NotNull
    public final String i() {
        return this.f41989a.getInstanceId();
    }

    @NotNull
    public final String j() {
        return this.f41989a.getInstanceName();
    }

    @NotNull
    public final String k() {
        return this.f41989a.getAdUnitId();
    }

    @NotNull
    public final String l() {
        return this.f41989a.getAdUnitName();
    }

    @NotNull
    public final String m() {
        return this.f41989a.getPlacementName();
    }

    @NotNull
    public final String n() {
        return this.f41989a.getImpressionPrecision$mediationsdk_release();
    }

    public final double o() {
        return this.f41989a.getImpressionRevenue$mediationsdk_release();
    }

    @NotNull
    public final String p() {
        return this.f41989a.getSegmentName();
    }

    @NotNull
    public String toString() {
        String strE = e();
        String strL = l();
        String strK = k();
        String strB = b();
        String strF = f();
        String strA = a();
        String strP = p();
        String strM = m();
        String strC = c();
        String strJ = j();
        String strI = i();
        o();
        return "auctionId: '" + strE + "', mediationAdUnitName: '" + strL + "', mediationAdUnitId: '" + strK + "', adFormat: '" + strB + "', country: '" + strF + "', ab: '" + strA + "', segmentName: '" + strP + "', placement: '" + strM + "', adNetwork: '" + strC + "', instanceName: '" + strJ + "', instanceId: '" + strI + "', revenue: " + this.f41990b.format(o()) + ", precision: '" + n() + "', encryptedCPM: '" + h() + "', creativeId: '" + g() + "'";
    }
}
