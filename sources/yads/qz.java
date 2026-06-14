package yads;

import com.mobilefuse.sdk.MobileFuseNativeAdKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class qz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pz f115220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qz f115221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final qz f115222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final qz f115223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qz f115224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qz f115225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final qz f115226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final qz f115227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ qz[] f115228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f115229l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f115230b;

    static {
        qz qzVar = new qz(0, "BANNER", "banner");
        f115221d = qzVar;
        qz qzVar2 = new qz(1, "INTERSTITIAL", "interstitial");
        f115222e = qzVar2;
        qz qzVar3 = new qz(2, com.taurusx.tax.w.s.w.f67531f, "rewarded");
        f115223f = qzVar3;
        qz qzVar4 = new qz(3, MobileFuseNativeAdKt.AD_TYPE, "native");
        f115224g = qzVar4;
        qz qzVar5 = new qz(4, "INSTREAM", com.taurusx.tax.w.o.w.f67354a);
        f115225h = qzVar5;
        qz qzVar6 = new qz(5, "APPOPENAD", "appopenad");
        f115226i = qzVar6;
        qz qzVar7 = new qz(6, "RETAIL_MEDIA", "retail");
        qz qzVar8 = new qz(7, "FEED", "feed");
        f115227j = qzVar8;
        qz[] qzVarArr = {qzVar, qzVar2, qzVar3, qzVar4, qzVar5, qzVar6, qzVar7, qzVar8};
        f115228k = qzVarArr;
        f115229l = qf.a.a(qzVarArr);
        f115220c = new pz();
    }

    public qz(int i10, String str, String str2) {
        this.f115230b = str2;
    }

    public static qz valueOf(String str) {
        return (qz) Enum.valueOf(qz.class, str);
    }

    public static qz[] values() {
        return (qz[]) f115228k.clone();
    }
}
