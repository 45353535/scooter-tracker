package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class nu1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mu1 f114046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final nu1 f114047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ nu1[] f114048e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114049b;

    static {
        nu1 nu1Var = new nu1(0, "AD_VIDEO_COMPLETE", "advideocomplete");
        nu1 nu1Var2 = new nu1(1, "IMPRESSION_TRACKING_START", "impressionTrackingStart");
        nu1 nu1Var3 = new nu1(2, "IMPRESSION_TRACKING_SUCCESS", "impressionTrackingSuccess");
        nu1 nu1Var4 = new nu1(3, "CLOSE", "close");
        nu1 nu1Var5 = new nu1(4, "OPEN", "open");
        nu1 nu1Var6 = new nu1(5, "REWARDED_AD_COMPLETE", "rewardedAdComplete");
        nu1 nu1Var7 = new nu1(6, "USE_CUSTOM_CLOSE", "usecustomclose");
        nu1 nu1Var8 = new nu1(7, "UNSPECIFIED", "");
        f114047d = nu1Var8;
        nu1[] nu1VarArr = {nu1Var, nu1Var2, nu1Var3, nu1Var4, nu1Var5, nu1Var6, nu1Var7, nu1Var8, new nu1(8, "AD_RENDERED", "adRendered")};
        f114048e = nu1VarArr;
        qf.a.a(nu1VarArr);
        f114046c = new mu1();
    }

    public nu1(int i10, String str, String str2) {
        this.f114049b = str2;
    }

    public static nu1 valueOf(String str) {
        return (nu1) Enum.valueOf(nu1.class, str);
    }

    public static nu1[] values() {
        return (nu1[]) f114048e.clone();
    }

    public final String a() {
        return this.f114049b;
    }
}
