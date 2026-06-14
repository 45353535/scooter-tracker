package com.appodeal.ads;

import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.my.target.common.menu.MenuActionType;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o2 {
    public static final x5 A;
    public static final x5 B;
    public static final x5 C;
    public static final x5 D;
    public static final x5 E;
    public static final x5 F;
    public static final x5 G;
    public static final x5 H;
    public static final x5 I;
    public static final x5 J;
    public static final x5 K;
    public static final x5 L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x5 f14208a = new x5("Appodeal", MobileAdsBridgeBase.initializeMethodName);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x5 f14209b = new x5("Appodeal", "setRequestCallbacks");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x5 f14210c = new x5("Appodeal", "setAdRevenueCallbacks");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x5 f14211d = new x5("Appodeal", "setInterstitialCallbacks");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x5 f14212e = new x5("Appodeal", "setRewardedVideoCallbacks");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x5 f14213f = new x5("Appodeal", "setBannerCallbacks");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x5 f14214g = new x5("Appodeal", "setMrecCallbacks");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x5 f14215h = new x5("Appodeal", "setNativeCallbacks");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x5 f14216i = new x5("Appodeal", "setNativeAdType");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x5 f14217j = new x5("Appodeal", Reporting.EventType.CACHE);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x5 f14218k = new x5("Appodeal", C4424m2.f43623v);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final x5 f14219l = new x5("Appodeal", MenuActionType.HIDE);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final x5 f14220m = new x5("Appodeal", "setAutoCache");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final x5 f14221n = new x5("Appodeal", "setTriggerOnLoadedOnPreCache");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final x5 f14222o = new x5("Appodeal", "setBannerViewId");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final x5 f14223p = new x5("Appodeal", "setSmartBanners");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final x5 f14224q = new x5("Appodeal", "set728x90Banners");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final x5 f14225r = new x5("Appodeal", "setBannerAnimation");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final x5 f14226s = new x5("Appodeal", "setBannerRotation");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final x5 f14227t = new x5("Appodeal", "setMrecViewId");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final x5 f14228u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final x5 f14229v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final x5 f14230w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final x5 f14231x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final x5 f14232y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final x5 f14233z;

    static {
        Intrinsics.checkNotNullParameter("Appodeal", "className");
        Intrinsics.checkNotNullParameter(C4240b4.i.f42655u0, "methodName");
        f14228u = new x5("Appodeal", "trackInAppPurchase");
        f14229v = new x5("Appodeal", "disableNetwork");
        f14230w = new x5("Appodeal", "setUserId");
        f14231x = new x5("Appodeal", "setTesting");
        f14232y = new x5("Appodeal", "setLogLevel");
        f14233z = new x5("Appodeal", "setCustomFilter");
        A = new x5("Appodeal", "canShow");
        B = new x5("Appodeal", "setFramework");
        C = new x5("Appodeal", "muteVideosIfCallsMuted");
        D = new x5("Appodeal", "startTestActivity");
        E = new x5("Appodeal", "setChildDirectedTreatment");
        F = new x5("Appodeal", "destroy");
        G = new x5("Appodeal", "setExtraData");
        H = new x5("Appodeal", "setSharedAdsInstanceAcrossActivities");
        I = new x5("Appodeal", "logEvent");
        J = new x5("Appodeal", "validateInAppPurchase");
        K = new x5("Appodeal", "setPurchaseListener");
        L = new x5("Appodeal", "getPredictedEcpm");
    }

    public static x5 a() {
        return f14229v;
    }

    public static x5 b() {
        return L;
    }

    public static x5 c() {
        return f14208a;
    }

    public static x5 d() {
        return I;
    }

    public static x5 e() {
        return C;
    }

    public static x5 f() {
        return f14224q;
    }

    public static x5 g() {
        return f14220m;
    }

    public static x5 h() {
        return f14225r;
    }

    public static x5 i() {
        return f14226s;
    }

    public static x5 j() {
        return f14222o;
    }

    public static x5 k() {
        return f14233z;
    }

    public static x5 l() {
        return B;
    }

    public static x5 m() {
        return f14232y;
    }

    public static x5 n() {
        return f14227t;
    }

    public static x5 o() {
        return f14216i;
    }

    public static x5 p() {
        return H;
    }

    public static x5 q() {
        return f14223p;
    }

    public static x5 r() {
        return f14231x;
    }

    public static x5 s() {
        return f14221n;
    }

    public static x5 t() {
        return f14218k;
    }

    public static x5 u() {
        return f14228u;
    }

    public static x5 v() {
        return J;
    }
}
