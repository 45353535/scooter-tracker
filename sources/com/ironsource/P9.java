package com.ironsource;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.ironsource.C4500q8;
import com.ironsource.N8;
import com.ironsource.O;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class P9 implements Zd, InterfaceC4580v4, InterfaceC4563u4, InterfaceC4529s4, InterfaceC4546t4, V9, Kc {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f41552m = "IronSourceAdsPublisherAgent";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static P9 f41553n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.ironsource.sdk.controller.e f41554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f41556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private W4 f41557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4417lc f41558e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C4291e4 f41560g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41559f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FeaturesManager f41561h = FeaturesManager.getInstance();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private N8.a f41562i = Ib.O().j();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private O.a f41563j = Ib.O().E();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private O f41564k = Ib.U().G();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC4466o8 f41565l = Ib.U().t();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ V4 f41568c;

        a(String str, String str2, V4 v42) {
            this.f41566a = str;
            this.f41567b = str2;
            this.f41568c = v42;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p92 = P9.this;
            p92.f41554a.a(this.f41566a, this.f41567b, this.f41568c, (InterfaceC4580v4) p92);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f41570a;

        b(JSONObject jSONObject) {
            this.f41570a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p92 = P9.this;
            p92.f41554a.a(this.f41570a, (InterfaceC4580v4) p92);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ V4 f41574c;

        c(String str, String str2, V4 v42) {
            this.f41572a = str;
            this.f41573b = str2;
            this.f41574c = v42;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p92 = P9.this;
            p92.f41554a.a(this.f41572a, this.f41573b, this.f41574c, (InterfaceC4563u4) p92);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41576a;

        d(String str) {
            this.f41576a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p92 = P9.this;
            p92.f41554a.a(this.f41576a, p92);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f41578a;

        e(JSONObject jSONObject) {
            this.f41578a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p92 = P9.this;
            p92.f41554a.a(this.f41578a, (InterfaceC4563u4) p92);
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ L9 f41580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f41581b;

        f(L9 l92, Map map) {
            this.f41580a = l92;
            this.f41581b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4500q8.e eVar = this.f41580a.i() ? C4500q8.e.Banner : C4500q8.e.Interstitial;
            V4 v4A = P9.this.f41557d.a(eVar, this.f41580a);
            C4533s8 c4533s8 = new C4533s8();
            c4533s8.a(D5.f40577x, Boolean.valueOf(this.f41580a.j())).a(D5.G, Boolean.valueOf(this.f41580a.m())).a(D5.f40575v, this.f41580a.g()).a(D5.f40576w, W9.a(this.f41580a)).a(D5.I, Long.valueOf(L.f41219a.b(this.f41580a.e())));
            C4618x8.a(Xd.f42074h, c4533s8.a());
            if (eVar == C4500q8.e.Banner) {
                P9 p92 = P9.this;
                p92.f41554a.a(p92.f41555b, p92.f41556c, v4A, (InterfaceC4546t4) p92);
                P9 p93 = P9.this;
                p93.f41554a.a(v4A, this.f41581b, (InterfaceC4546t4) p93);
                return;
            }
            P9 p94 = P9.this;
            p94.f41554a.a(p94.f41555b, p94.f41556c, v4A, (InterfaceC4563u4) p94);
            P9 p95 = P9.this;
            p95.f41554a.b(v4A, this.f41581b, p95);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ V4 f41583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f41584b;

        g(V4 v42, Map map) {
            this.f41583a = v42;
            this.f41584b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p92 = P9.this;
            p92.f41554a.a(this.f41583a, this.f41584b, (InterfaceC4563u4) p92);
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ L9 f41586a;

        h(L9 l92) {
            this.f41586a = l92;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4500q8.e eVar = this.f41586a.i() ? C4500q8.e.Banner : C4500q8.e.Interstitial;
            V4 v4A = P9.this.f41557d.a(eVar, this.f41586a);
            C4533s8 c4533s8 = new C4533s8();
            c4533s8.a(D5.f40577x, Boolean.valueOf(this.f41586a.j())).a(D5.f40575v, this.f41586a.g()).a(D5.f40576w, W9.a(this.f41586a)).a("isMultipleAdObjects", Boolean.valueOf(this.f41586a.l()));
            C4618x8.a(Xd.f42079m, c4533s8.a());
            if (eVar == C4500q8.e.Banner) {
                P9.this.f41554a.a(v4A);
            } else {
                v4A.a(false);
                P9.this.f41554a.b(v4A);
            }
        }
    }

    private P9(Context context, int i10) {
        c(context);
    }

    @Override // com.ironsource.InterfaceC4563u4
    public void onInterstitialAdRewarded(String str, int i10) {
        V4 v4D = d(C4500q8.e.Interstitial, str);
        Hc hcB = b(v4D);
        if (v4D == null || hcB == null) {
            return;
        }
        hcB.onInterstitialAdRewarded(str, i10);
    }

    @Override // com.ironsource.Zd, com.ironsource.V9
    public void onPause(Activity activity) {
        if (this.f41559f) {
            return;
        }
        b(activity);
    }

    @Override // com.ironsource.Zd, com.ironsource.V9
    public void onResume(Activity activity) {
        if (this.f41559f) {
            return;
        }
        c(activity);
    }

    public static V9 a(Context context, String str, String str2) {
        return a(str, str2, context);
    }

    public static synchronized P9 b(Context context) throws Exception {
        return a(context, 0);
    }

    private void c(Context context) {
        try {
            SDKUtils.getNetworkConfiguration();
            C4280da.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new C4403kf(SDKUtils.getNetworkConfiguration().optJSONObject(C4240b4.a.f42506k)));
            C4280da.e().d(SDKUtils.getSDKVersion());
            this.f41557d = new W4();
            C4291e4 c4291e4 = new C4291e4();
            this.f41560g = c4291e4;
            if (context instanceof Activity) {
                c4291e4.a((Activity) context);
            }
            int debugMode = this.f41561h.getDebugMode();
            this.f41558e = new C4417lc();
            this.f41554a = new com.ironsource.sdk.controller.e(context, this.f41560g, this.f41557d, S7.f41731a, debugMode, this.f41561h.getDataManagerConfig(), this.f41555b, this.f41556c, this.f41558e);
            Logger.enableLogging(debugMode);
            Logger.i(f41552m, "C'tor");
            a(context);
            this.f41558e.d();
            this.f41558e.e();
            this.f41558e.a(context);
            this.f41558e.b();
            this.f41558e.a();
            this.f41558e.b(context);
            this.f41558e.c();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC4563u4
    public void d(String str, String str2) {
        V4 v4D = d(C4500q8.e.Interstitial, str);
        if (v4D != null) {
            L9 l9C = v4D.c();
            this.f41563j.a(EnumC4422m0.SHOW_FAIL, l9C.e());
            if (c(l9C)) {
                this.f41562i.a(new Te(this.f41564k.a(l9C.e())));
            }
            Hc hcB = b(v4D);
            if (hcB != null) {
                hcB.onInterstitialShowFailed(str2);
            }
        }
    }

    public static synchronized V9 a(String str, String str2, Context context) {
        try {
            if (f41553n == null) {
                C4618x8.a(Xd.f42067a);
                f41553n = new P9(str, str2, context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f41553n;
    }

    private Hc b(V4 v42) {
        if (v42 == null) {
            return null;
        }
        return (Hc) v42.i();
    }

    @Override // com.ironsource.Zd
    public void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f41554a.a(new d(strOptString));
    }

    public static synchronized P9 a(Context context, int i10) throws Exception {
        try {
            Logger.i(f41552m, "getInstance()");
            if (f41553n == null) {
                f41553n = new P9(context, i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f41553n;
    }

    @Override // com.ironsource.InterfaceC4529s4
    public void b(C4500q8.e eVar, String str) {
        Hc hcB;
        V4 v4D = d(eVar, str);
        if (v4D != null) {
            if (eVar == C4500q8.e.RewardedVideo) {
                Mc mcC = c(v4D);
                if (mcC != null) {
                    mcC.d();
                    return;
                }
                return;
            }
            if (eVar != C4500q8.e.Interstitial || (hcB = b(v4D)) == null) {
                return;
            }
            hcB.onInterstitialClose();
        }
    }

    P9(String str, String str2, Context context) {
        this.f41555b = str;
        this.f41556c = str2;
        c(context);
    }

    @Override // com.ironsource.V9
    public com.ironsource.sdk.controller.e a() {
        return this.f41554a;
    }

    private Fc a(V4 v42) {
        if (v42 == null) {
            return null;
        }
        return (Fc) v42.i();
    }

    private V4 d(C4500q8.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f41557d.a(eVar, str);
    }

    @Override // com.ironsource.Zd
    public void a(String str, String str2, String str3, Map<String, String> map, Mc mc2) {
        this.f41555b = str;
        this.f41556c = str2;
        this.f41554a.a(new a(str, str2, this.f41557d.a(C4500q8.e.RewardedVideo, str3, map, mc2)));
    }

    @Override // com.ironsource.InterfaceC4580v4
    public void b(String str, String str2) {
        Mc mcC;
        V4 v4D = d(C4500q8.e.RewardedVideo, str);
        if (v4D == null || (mcC = c(v4D)) == null) {
            return;
        }
        mcC.a(str2);
    }

    @Override // com.ironsource.Zd
    public void a(JSONObject jSONObject) {
        this.f41554a.a(new b(jSONObject));
    }

    @Override // com.ironsource.InterfaceC4563u4
    public void b(String str) {
        V4 v4D = d(C4500q8.e.Interstitial, str);
        if (v4D != null) {
            L9 l9C = v4D.c();
            this.f41563j.a(EnumC4422m0.SHOW_SUCCESS, l9C.e());
            if (c(l9C)) {
                this.f41562i.a(new Ue(this.f41564k.a(l9C.e())));
            }
            Hc hcB = b(v4D);
            if (hcB != null) {
                hcB.onInterstitialShowSuccess();
            }
        }
    }

    @Override // com.ironsource.Zd
    public void a(String str, String str2, String str3, Map<String, String> map, Hc hc2) {
        this.f41555b = str;
        this.f41556c = str2;
        this.f41554a.a(new c(str, str2, this.f41557d.a(C4500q8.e.Interstitial, str3, map, hc2)));
    }

    @Override // com.ironsource.Zd
    public boolean a(String str) {
        return this.f41554a.a(str);
    }

    @Override // com.ironsource.Zd, com.ironsource.V9
    public void a(Activity activity) {
        try {
            Logger.i(f41552m, "release()");
            Z4.g();
            this.f41560g.b();
            this.f41554a.a((Context) activity);
            this.f41554a.a();
            this.f41554a = null;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
        }
        f41553n = null;
    }

    @Override // com.ironsource.X9
    public void b(Activity activity, L9 l92, Map<String, String> map) {
        if (Ib.U().g().c()) {
            this.f41560g.a(activity);
        }
        a(l92, map);
    }

    private Mc c(V4 v42) {
        if (v42 == null) {
            return null;
        }
        return (Mc) v42.i();
    }

    @Override // com.ironsource.Zd
    public void c(JSONObject jSONObject) {
        this.f41554a.a(new e(jSONObject));
    }

    private void b(L9 l92, Map<String, String> map) {
        Logger.d(f41552m, "loadOnNewInstance " + l92.e());
        this.f41554a.a(new f(l92, map));
    }

    @Override // com.ironsource.InterfaceC4580v4
    public void c(String str) {
        Mc mcC;
        V4 v4D = d(C4500q8.e.RewardedVideo, str);
        if (v4D == null || (mcC = c(v4D)) == null) {
            return;
        }
        mcC.c();
    }

    @Override // com.ironsource.InterfaceC4529s4
    public void a(C4500q8.e eVar, String str, Y0 y02) {
        Fc fcA;
        V4 v4D = d(eVar, str);
        if (v4D != null) {
            v4D.b(2);
            if (eVar == C4500q8.e.RewardedVideo) {
                Mc mcC = c(v4D);
                if (mcC != null) {
                    mcC.a(y02);
                    return;
                }
                return;
            }
            if (eVar == C4500q8.e.Interstitial) {
                Hc hcB = b(v4D);
                if (hcB != null) {
                    hcB.onInterstitialInitSuccess();
                    return;
                }
                return;
            }
            if (eVar != C4500q8.e.Banner || (fcA = a(v4D)) == null) {
                return;
            }
            fcA.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.X9
    public void b(L9 l92) {
        Logger.d(f41552m, "destroyInstance " + l92.e());
        if (c(l92)) {
            this.f41563j.a(EnumC4422m0.DESTROYED, l92.e());
            this.f41562i.a(new Qe(this.f41564k.a(l92.e())));
        }
        this.f41554a.a(new h(l92));
    }

    @Override // com.ironsource.InterfaceC4529s4
    public void c(C4500q8.e eVar, String str) {
        Mc mcC;
        V4 v4D = d(eVar, str);
        if (v4D != null) {
            if (eVar == C4500q8.e.Interstitial) {
                Hc hcB = b(v4D);
                if (hcB != null) {
                    hcB.onInterstitialOpen();
                    return;
                }
                return;
            }
            if (eVar != C4500q8.e.RewardedVideo || (mcC = c(v4D)) == null) {
                return;
            }
            mcC.b();
        }
    }

    @Override // com.ironsource.Kc
    public void b(Activity activity) {
        try {
            this.f41554a.e();
            this.f41554a.a((Context) activity);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC4546t4
    public void c(String str, String str2) {
        Fc fcA;
        V4 v4D = d(C4500q8.e.Banner, str);
        if (v4D == null || (fcA = a(v4D)) == null) {
            return;
        }
        fcA.onBannerLoadFail(str2);
    }

    @Override // com.ironsource.InterfaceC4529s4
    public void a(C4500q8.e eVar, String str, String str2) {
        Fc fcA;
        V4 v4D = d(eVar, str);
        C4533s8 c4533s8A = new C4533s8().a(D5.f40575v, str).a(D5.f40576w, eVar).a(D5.A, str2);
        if (v4D != null) {
            L l10 = L.f41219a;
            c4533s8A.a(D5.I, Long.valueOf(l10.b(v4D.h())));
            c4533s8A.a(D5.f40577x, Boolean.valueOf(C4635y8.a(v4D)));
            l10.a(v4D.h());
            v4D.b(3);
            if (eVar == C4500q8.e.RewardedVideo) {
                Mc mcC = c(v4D);
                if (mcC != null) {
                    mcC.b(str2);
                }
            } else if (eVar == C4500q8.e.Interstitial) {
                Hc hcB = b(v4D);
                if (hcB != null) {
                    hcB.onInterstitialInitFailed(str2);
                }
            } else if (eVar == C4500q8.e.Banner && (fcA = a(v4D)) != null) {
                fcA.onBannerLoadFail(str2);
            }
        }
        C4618x8.a(Xd.f42075i, c4533s8A.a());
    }

    private void c(L9 l92, Map<String, String> map) {
        try {
            map = a(map);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            C4533s8 c4533s8A = new C4533s8().a(D5.A, e10.getMessage()).a(D5.f40577x, Boolean.valueOf(l92.j())).a(D5.G, Boolean.valueOf(l92.m())).a(D5.f40575v, l92.g()).a(D5.f40576w, W9.a(l92)).a(D5.I, Long.valueOf(L.f41219a.b(l92.e())));
            L.f41219a.a(l92.e());
            C4618x8.a(Xd.f42077k, c4533s8A.a());
            IronLog.INTERNAL.error(e10.toString());
            Logger.d(f41552m, "loadInAppBiddingAd failed decoding  ADM " + e10.getMessage());
        }
        b(l92, map);
    }

    @Override // com.ironsource.Kc
    public void c(Activity activity) {
        this.f41560g.a(activity);
        this.f41554a.g();
        this.f41554a.b(activity);
    }

    @Override // com.ironsource.InterfaceC4580v4
    public void a(String str, int i10) {
        Mc mcC;
        V4 v4D = d(C4500q8.e.RewardedVideo, str);
        if (v4D == null || (mcC = c(v4D)) == null) {
            return;
        }
        mcC.a(i10);
    }

    public boolean c(L9 l92) {
        return l92.l() && !l92.i() && a(l92);
    }

    @Override // com.ironsource.InterfaceC4529s4
    public void a(C4500q8.e eVar, String str) {
        Fc fcA;
        V4 v4D = d(eVar, str);
        if (v4D != null) {
            if (eVar == C4500q8.e.RewardedVideo) {
                Mc mcC = c(v4D);
                if (mcC != null) {
                    mcC.a();
                    return;
                }
                return;
            }
            if (eVar == C4500q8.e.Interstitial) {
                Hc hcB = b(v4D);
                if (hcB != null) {
                    hcB.onInterstitialClick();
                    return;
                }
                return;
            }
            if (eVar != C4500q8.e.Banner || (fcA = a(v4D)) == null) {
                return;
            }
            fcA.onBannerClick();
        }
    }

    @Override // com.ironsource.InterfaceC4529s4
    public void a(C4500q8.e eVar, String str, String str2, JSONObject jSONObject) {
        Fc fcA;
        V4 v4D = d(eVar, str);
        if (v4D == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.i(f41552m, "Received Event Notification: " + str2 + " for demand source: " + v4D.f());
            if (eVar == C4500q8.e.Interstitial) {
                Hc hcB = b(v4D);
                if (hcB != null) {
                    jSONObject.put("demandSourceName", str);
                    hcB.onInterstitialEventNotificationReceived(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar == C4500q8.e.RewardedVideo) {
                Mc mcC = c(v4D);
                if (mcC != null) {
                    jSONObject.put("demandSourceName", str);
                    mcC.a(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar != C4500q8.e.Banner || (fcA = a(v4D)) == null) {
                return;
            }
            jSONObject.put("demandSourceName", str);
            if (str2.equalsIgnoreCase("impressions")) {
                fcA.onBannerShowSuccess();
            }
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC4563u4
    public void a(String str, JSONObject jSONObject) {
        C4500q8.e eVar = C4500q8.e.Interstitial;
        V4 v4D = d(eVar, str);
        C4533s8 c4533s8A = new C4533s8().a(D5.f40575v, str);
        if (v4D != null) {
            L9 l9C = v4D.c();
            this.f41563j.a(jSONObject, EnumC4422m0.LOAD_SUCCESS, l9C.e());
            if (c(l9C)) {
                this.f41562i.a(new Se(this.f41564k.a(l9C.e())));
            }
            C4533s8 c4533s8A2 = c4533s8A.a(D5.f40576w, C4635y8.a(v4D, eVar)).a(D5.f40577x, Boolean.valueOf(C4635y8.a(v4D)));
            L l10 = L.f41219a;
            c4533s8A2.a(D5.I, Long.valueOf(l10.b(v4D.h())));
            l10.a(v4D.h());
            Hc hcB = b(v4D);
            if (hcB != null) {
                hcB.onInterstitialLoadSuccess(v4D.c());
            }
        }
        C4618x8.a(Xd.f42078l, c4533s8A.a());
    }

    @Override // com.ironsource.InterfaceC4563u4
    public void a(String str, String str2) {
        Object obj;
        C4500q8.e eVar = C4500q8.e.Interstitial;
        V4 v4D = d(eVar, str);
        C4533s8 c4533s8 = new C4533s8();
        c4533s8.a(D5.A, str2).a(D5.f40575v, str);
        if (v4D != null) {
            C4533s8 c4533s8A = c4533s8.a(D5.f40576w, C4635y8.a(v4D, eVar));
            if (v4D.e() == 2) {
                obj = D5.E;
            } else {
                obj = D5.F;
            }
            C4533s8 c4533s8A2 = c4533s8A.a(D5.f40578y, obj).a(D5.f40577x, Boolean.valueOf(C4635y8.a(v4D)));
            L l10 = L.f41219a;
            c4533s8A2.a(D5.I, Long.valueOf(l10.b(v4D.h())));
            l10.a(v4D.h());
            Hc hcB = b(v4D);
            if (hcB != null) {
                hcB.onInterstitialLoadFailed(str2);
            }
        }
        C4618x8.a(Xd.f42073g, c4533s8.a());
    }

    @Override // com.ironsource.Zd
    public void a(String str, String str2, int i10) {
        C4500q8.e productType;
        V4 v4A;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (v4A = this.f41557d.a(productType, str2)) == null) {
            return;
        }
        v4A.c(i10);
    }

    @Override // com.ironsource.InterfaceC4546t4
    public void a(String str, C4346h8 c4346h8) {
        Fc fcA;
        V4 v4D = d(C4500q8.e.Banner, str);
        if (v4D == null || (fcA = a(v4D)) == null) {
            return;
        }
        fcA.onBannerLoadSuccess(v4D.c(), c4346h8);
    }

    @Override // com.ironsource.X9
    public void a(L9 l92, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        map.put(C4240b4.i.f42663y0, String.valueOf(jCurrentTimeMillis));
        L.f41219a.a(l92.e(), jCurrentTimeMillis);
        C4533s8 c4533s8 = new C4533s8();
        c4533s8.a(D5.f40577x, Boolean.valueOf(l92.j())).a(D5.G, Boolean.valueOf(l92.m())).a(D5.f40575v, l92.g()).a(D5.f40576w, W9.a(l92)).a(D5.I, Long.valueOf(jCurrentTimeMillis));
        C4618x8.a(Xd.f42072f, c4533s8.a());
        Logger.d(f41552m, "loadAd " + l92.e());
        N n10 = new N(l92);
        this.f41563j.a(n10);
        this.f41563j.a(new JSONObject(map), EnumC4422m0.LOAD_REQUEST, n10.c());
        if (c(l92)) {
            this.f41562i.a(new Re(n10));
        }
        if (l92.k()) {
            c(l92, map);
        } else {
            b(l92, map);
        }
    }

    private Map<String, String> a(Map<String, String> map) {
        map.put("adm", SDKUtils.decodeString(map.get("adm")));
        return map;
    }

    @Override // com.ironsource.X9
    public void a(Activity activity, L9 l92, Map<String, String> map) {
        this.f41560g.a(activity);
        Logger.i(f41552m, "showAd " + l92.e());
        V4 v4A = this.f41557d.a(C4500q8.e.Interstitial, l92.e());
        if (v4A == null) {
            return;
        }
        this.f41554a.a(new g(v4A, map));
    }

    @Override // com.ironsource.X9
    public boolean a(L9 l92) {
        Logger.d(f41552m, "isAdAvailable " + l92.e());
        V4 v4A = this.f41557d.a(C4500q8.e.Interstitial, l92.e());
        if (v4A == null) {
            return false;
        }
        return v4A.d();
    }

    public void a(Context context) {
        this.f41559f = false;
        Boolean boolC = this.f41565l.c(C4240b4.a.f42502g);
        if (boolC == null) {
            boolC = Boolean.FALSE;
        }
        boolean zBooleanValue = boolC.booleanValue();
        this.f41559f = zBooleanValue;
        if (zBooleanValue) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new C4354i(this));
            } catch (Throwable th2) {
                C4462o4.d().a(th2);
                C4533s8 c4533s8 = new C4533s8();
                c4533s8.a(D5.f40578y, th2.getMessage());
                C4618x8.a(Xd.f42087u, c4533s8.a());
            }
        }
    }
}
