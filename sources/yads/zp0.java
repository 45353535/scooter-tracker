package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zp0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zp0 f118750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zp0 f118751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zp0 f118752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ zp0[] f118753f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118754b;

    static {
        zp0 zp0Var = new zp0(0, "AD_POD_SKIP", "AdPodSkipFeatureToggle");
        zp0 zp0Var2 = new zp0(1, "INTERSTITIAL_PRELOADING", "InterstitialPreloading");
        zp0 zp0Var3 = new zp0(2, "REWARDED_PRELOADING", "RewardedPreloading");
        zp0 zp0Var4 = new zp0(3, "FIRST_VIDEO_PRELOADING_STRATEGY", "FirstVideoPreloadingStrategyFeatureToggle");
        f118750c = zp0Var4;
        zp0 zp0Var5 = new zp0(4, "TESTING_NEW_ADAPTER", "TestingNewAdapterFeatureToggle");
        f118751d = zp0Var5;
        zp0 zp0Var6 = new zp0(5, "FALLBACK_FOR_VIDEO", "FallbackForVideoFeatureToggle");
        f118752e = zp0Var6;
        zp0[] zp0VarArr = {zp0Var, zp0Var2, zp0Var3, zp0Var4, zp0Var5, zp0Var6, new zp0(6, "BACKGROUND_NATIVE_VIDEO_PRELOADING", "BackgroundNativeVideoPreloading"), new zp0(7, "DONT_WAIT_FOR_WEB_VIEW_LOAD_FINISH_ON_PRELOADING", "DontWaitForWebViewLoadFinishOnPreloading")};
        f118753f = zp0VarArr;
        qf.a.a(zp0VarArr);
    }

    public zp0(int i10, String str, String str2) {
        this.f118754b = str2;
    }

    public static zp0 valueOf(String str) {
        return (zp0) Enum.valueOf(zp0.class, str);
    }

    public static zp0[] values() {
        return (zp0[]) f118753f.clone();
    }
}
