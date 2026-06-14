package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.analytics.models.PublicApiEvent;
import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.inapp.InAppPurchaseValidateCallback;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.common.internal.domain.ParsePriceUseCase;
import com.appodeal.ads.network.NetworkStatus;
import com.appodeal.ads.revenue.AdRevenueCallbacks;
import com.appodeal.ads.revenue.RevenueInfo;
import com.appodeal.ads.utils.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f13367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f13368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static TestActivity f13369c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static AdRevenueCallbacks f13371e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f13373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f13374h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Lazy f13370d = lf.i.a(new Function0() { // from class: com.appodeal.ads.f2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return h2.S();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f13372f = "android";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Lazy f13375i = lf.i.a(new Function0() { // from class: com.appodeal.ads.g2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return h2.g();
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LinkedHashSet f13376j = new LinkedHashSet();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Lazy f13377k = lf.i.a(new Function0() { // from class: com.appodeal.ads.v1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return h2.T();
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Lazy f13378l = lf.i.a(new Function0() { // from class: com.appodeal.ads.w1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return h2.Q();
        }
    });

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final MutableStateFlow f13379m = hg.l0.a(Boolean.FALSE);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ArrayList f13380n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Lazy f13381o = lf.i.a(new Function0() { // from class: com.appodeal.ads.x1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return h2.U();
        }
    });

    public static final String A() {
        return f13374h;
    }

    public static void B(int i10, boolean z10) {
        o2.s().a("triggerOnLoadedOnPrecache for " + z6.b(i10) + ": " + z10);
        Iterator it = ((List) f13375i.getValue()).iterator();
        while (it.hasNext()) {
            l0 l0VarA = f6.a((l0) it.next(), i10);
            if (l0VarA != null) {
                l0VarA.v(z10);
            }
        }
    }

    public static void C(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (StringsKt.y0(key)) {
            o2.G.b("key is blank");
        } else {
            o2.G.a(null);
            ExtraData.INSTANCE.putExtra(key, obj);
        }
    }

    public static void D(boolean z10) {
        o2.f().a("728x90 Banners: " + z10);
        ee.f13291c = z10;
    }

    public static boolean E(int i10) {
        boolean zF;
        List list = (List) f13375i.getValue();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final l0 l0VarA = f6.a((l0) it.next(), i10);
                if (l0VarA != null) {
                    AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.d2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return h2.F(l0VarA);
                        }
                    });
                    zF = l0VarA.F();
                } else {
                    zF = false;
                }
                if (zF) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final Event F(l0 l0Var) {
        AdType adType = l0Var.f13566f;
        Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
        return new PublicApiEvent.SdkApiIsLoaded(adType, l0Var.F());
    }

    public static final Event G(AdType adType) {
        return new PublicApiEvent.SdkApiCanShow(adType, PublicApiEvent.Result.CONNECTION_ERROR);
    }

    public static final String H() {
        return f13372f;
    }

    public static void I(int i10) {
        o2.j().a("Banner ViewId: " + i10);
        ee.d().r(i10);
        ee.d().C();
    }

    public static void J(boolean z10) {
        o2.h().a("Banner animation: " + z10);
        ee.d().x(z10);
    }

    public static final Event K(AdType adType) {
        return new PublicApiEvent.SdkApiHide(adType);
    }

    public static final Log.LogLevel L() {
        String str = db.f13239a;
        Log.LogLevel logLevel = (Log.LogLevel) com.appodeal.ads.utils.debug.m.f15004e.getValue();
        return logLevel == null ? db.f13242d : logLevel;
    }

    public static void M(int i10) {
        o2.n().a("Mrec ViewId: " + i10);
        ve.c().r(i10);
        ve.c().C();
    }

    public static final void N(boolean z10) {
        o2.p().a("value: " + z10);
        com.appodeal.ads.context.n.f13203b.b(z10);
        db.f13250l = z10;
    }

    public static final String O() {
        return f13373g;
    }

    public static void P(boolean z10) {
        o2.q().a("smart Banners: " + z10);
        ee.f13290b = z10;
    }

    public static final ParsePriceUseCase Q() {
        return new ParsePriceUseCase();
    }

    public static void R(boolean z10) {
        o2.r().a("testing: " + z10);
        db.d(z10);
    }

    public static final d9 S() {
        return new d9();
    }

    public static final CoroutineScope T() {
        return kotlinx.coroutines.i.a(eg.o0.c());
    }

    public static final c5 U() {
        return new c5();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double a(com.appodeal.ads.l0 r7, java.lang.String r8) {
        /*
            com.appodeal.ads.x5 r0 = com.appodeal.ads.o2.b()
            boolean r1 = com.appodeal.ads.h2.f13368b
            r2 = 0
            if (r1 != 0) goto L10
            java.lang.String r7 = "Appodeal is not initialized"
            r0.b(r7)
            return r2
        L10:
            com.appodeal.ads.network.NetworkStatus r1 = com.appodeal.ads.network.NetworkStatus.INSTANCE
            boolean r1 = r1.isConnected()
            if (r1 != 0) goto L1e
            java.lang.String r7 = "no Internet"
            r0.b(r7)
            return r2
        L1e:
            com.appodeal.ads.modules.common.internal.adtype.AdType r1 = r7.s()
            java.lang.String r4 = "getAdType(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            com.appodeal.ads.te r4 = r7.A()
            if (r4 == 0) goto L3a
            double r5 = r4.f14907s
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            boolean r4 = r4.v()
            if (r4 == 0) goto L3a
            goto L3b
        L3a:
            r5 = 0
        L3b:
            if (r5 != 0) goto L56
            java.lang.String r7 = r1.getDisplayName()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = ". Predicted eCPM is 0.0, ad was not load"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r0.a(r7)
            return r2
        L56:
            com.appodeal.ads.segments.o r4 = com.appodeal.ads.segments.q.a(r8)
            com.appodeal.ads.context.o r6 = com.appodeal.ads.context.o.f13205b
            com.appodeal.ads.context.t r6 = r6.f13206a
            android.content.Context r6 = r6.getApplicationContext()
            com.appodeal.ads.te r7 = r7.A()
            boolean r7 = r4.d(r6, r1, r7)
            if (r7 != 0) goto L8d
            java.lang.String r7 = r1.getDisplayName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r7 = ". Predicted eCPM is 0.0, since canShow for Placement: "
            r1.append(r7)
            r1.append(r8)
            java.lang.String r7 = " = false."
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.a(r7)
            return r2
        L8d:
            java.lang.String r7 = r1.getDisplayName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r7 = ". Predicted eCPM is "
            r1.append(r7)
            r1.append(r5)
            java.lang.String r7 = " for Placement: "
            r1.append(r7)
            r1.append(r8)
            java.lang.String r7 = r1.toString()
            r0.a(r7)
            double r7 = r5.doubleValue()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.h2.a(com.appodeal.ads.l0, java.lang.String):double");
    }

    public static final Event b(l0 l0Var) {
        AdType adType = l0Var.f13566f;
        Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
        return new PublicApiEvent.SdkApiCanShow(adType, PublicApiEvent.Result.NOT_READY_ERROR);
    }

    public static final Event c(l0 l0Var, boolean z10) {
        AdType adType = l0Var.f13566f;
        Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
        return new PublicApiEvent.SdkApiCanShow(adType, z10 ? PublicApiEvent.Result.CAN_SHOW : PublicApiEvent.Result.PLACEMENT_ERROR);
    }

    public static final Event d(AdType adType) {
        return new PublicApiEvent.SdkApiCache(adType);
    }

    public static final Event e(AdType adType, boolean z10) {
        return new PublicApiEvent.SdkApiShow(adType, z10 ? PublicApiEvent.Result.SHOW : PublicApiEvent.Result.SHOW_ERROR);
    }

    public static ArrayList f(int i10) {
        Log.log(LogConstants.KEY_SDK_PUBLIC, "Get", "NativeAds: " + i10, Log.LogLevel.verbose);
        ArrayList arrayListB = t1.b(i10);
        Intrinsics.checkNotNullExpressionValue(arrayListB, "getNativeAds(...)");
        return arrayListB;
    }

    public static final List g() {
        return CollectionsKt.listOf((Object[]) new l0[]{ee.a(), t1.a(), h6.a(), af.a(), ve.a()});
    }

    public static void h(int i10, int i11) {
        o2.i().a("Banner rotations: left=" + i10 + ", right=" + i11);
        db.f13246h = i10;
        db.f13247i = i11;
    }

    public static void i(int i10, boolean z10) {
        o2.g().a("auto cache for " + z6.b(i10) + ": " + z10);
        Iterator it = ((List) f13375i.getValue()).iterator();
        while (it.hasNext()) {
            l0 l0VarA = f6.a((l0) it.next(), i10);
            if (l0VarA != null) {
                l0VarA.o(z10);
            }
        }
    }

    public static void j(Activity activity, int i10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (j2.w() < 21) {
            return;
        }
        o2.f14219l.a(z6.b(i10));
        for (final AdType adType : f6.b(i10)) {
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.b2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h2.K(adType);
                }
            });
        }
        com.appodeal.ads.context.n nVar = com.appodeal.ads.context.n.f13203b;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.appodeal.ads.context.j jVar = nVar.f13204a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        jVar.f13198b = new WeakReference(activity);
        Iterator it = f6.b(i10).iterator();
        while (it.hasNext()) {
            int i11 = Cif.f13437a[((AdType) it.next()).ordinal()];
            if (i11 == 1) {
                ee.d().c(activity, ee.a());
            } else if (i11 == 2) {
                ve.c().c(activity, ve.a());
            } else if (i11 != 3 && i11 != 4 && i11 != 5) {
                throw new lf.m();
            }
        }
    }

    public static void k(Activity activity, int i10, int i11) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (j2.w() < 21) {
            return;
        }
        o2.f14217j.a(null);
        for (final AdType adType : f6.b(i10)) {
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.e2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h2.d(adType);
                }
            });
        }
        com.appodeal.ads.context.n nVar = com.appodeal.ads.context.n.f13203b;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.appodeal.ads.context.j jVar = nVar.f13204a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        jVar.f13198b = new WeakReference(activity);
        Iterator it = ((List) f13375i.getValue()).iterator();
        while (it.hasNext()) {
            l0 l0VarA = f6.a((l0) it.next(), i10);
            if (l0VarA != null) {
                l0VarA.d(activity, i11);
            }
        }
    }

    public static void l(Context context, double d10, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!f13368b && !f13367a) {
            o2.u().b("Appodeal is not initialized");
            return;
        }
        if (str == null) {
            o2.u().b("currency is null");
            return;
        }
        if (zc.f15321a.isUserProtected()) {
            o2.u().b("The user did not accept the agreement");
            return;
        }
        o2.u().a("inapp purchase, amount: " + d10 + ", currency: " + str);
        k7.g(context, d10, str);
    }

    public static void m(Context context, InAppPurchase purchase, InAppPurchaseValidateCallback inAppPurchaseValidateCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        o2.v().a("purchase: " + purchase);
        eg.i.d((CoroutineScope) f13377k.getValue(), new eg.e0("ApdSdkCoreServicesValidateInAppPurchase"), null, new k0(purchase, inAppPurchaseValidateCallback, context, null), 2, null);
    }

    public static final void n(NativeMediaViewContentType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        o2.o().a("NativeAd type: " + value);
        t1.f14852b = value;
    }

    public static final void o(RevenueInfo revenueInfo) {
        Intrinsics.checkNotNullParameter(revenueInfo, "revenueInfo");
        eg.i.d((CoroutineScope) f13377k.getValue(), new eg.e0("ApdSdkCoreOnImpression"), null, new v(revenueInfo, null), 2, null);
    }

    public static final void p(Log.LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        db.b(logLevel);
        o2.m().a("log level: " + logLevel);
    }

    public static void q(String endpoint) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Log.log(LogConstants.KEY_SDK_PUBLIC, LogConstants.EVENT_SET, "Bidon self-host endpoint: \"" + endpoint + "\"", Log.LogLevel.verbose);
        ((com.appodeal.ads.bidon.c) ((com.appodeal.ads.bidon.b) com.appodeal.ads.bidon.e.f13152a.getValue())).a(endpoint);
    }

    public static void r(String network, int i10) {
        Intrinsics.checkNotNullParameter(network, "network");
        if (StringsKt.y0(network)) {
            o2.a().b("network is blank");
            return;
        }
        o2.a().a(network + " - " + z6.b(i10));
        Iterator it = ((List) f13375i.getValue()).iterator();
        while (it.hasNext()) {
            l0 l0VarA = f6.a((l0) it.next(), i10);
            if (l0VarA != null) {
                l0VarA.k(network);
            }
        }
    }

    public static void s(String name, Object obj) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (StringsKt.y0(name)) {
            o2.k().b("name is blank");
            return;
        }
        o2.k().a("set custom filter: " + name + ", value: " + obj);
        com.appodeal.ads.segments.g0.b(name, obj);
    }

    public static void t(String str, String str2, String str3) {
        String str4;
        f13372f = str;
        f13373g = str2;
        f13374h = str3;
        if (str3 != null) {
            str4 = "framework: " + str + ", pluginVersion: " + str2 + ", engineVersion: " + str3;
        } else {
            str4 = "framework: " + str + ", pluginVersion: " + str2;
        }
        o2.l().a(str4);
    }

    public static void u(String eventName, Map map, int i10) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (StringsKt.y0(eventName)) {
            o2.d().b("event name is blank");
            return;
        }
        ArrayList arrayListA = ya.a(i10);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListA, 10));
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayList.add(((la) it.next()).d());
        }
        if (arrayList.isEmpty()) {
            o2.d().b("No services were found");
            return;
        }
        o2.d().a("event: " + eventName + ", params: " + map + " for services: " + arrayList);
        eg.i.d((CoroutineScope) f13377k.getValue(), new eg.e0("ApdSdkCoreServicesLogEvent"), null, new o(arrayList, eventName, map, null), 2, null);
    }

    public static void v(boolean z10) {
        o2.e().a("muteVideosIfCallsMuted: " + z10);
        db.f13243e = z10;
    }

    public static boolean w(int i10, String placementName) {
        final boolean zD;
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        if (!f13368b) {
            o2.A.b("Appodeal is not initialized");
            for (final AdType adType : f6.b(i10)) {
                AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.u1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h2.z(adType);
                    }
                });
            }
            return false;
        }
        if (!NetworkStatus.INSTANCE.isConnected()) {
            o2.A.b("no Internet");
            for (final AdType adType2 : f6.b(i10)) {
                AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.y1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h2.G(adType2);
                    }
                });
            }
            return false;
        }
        o2.A.a(null);
        com.appodeal.ads.segments.o oVarA = com.appodeal.ads.segments.q.a(placementName);
        List<l0> list = (List) f13375i.getValue();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (final l0 l0Var : list) {
                l0 l0VarA = f6.a(l0Var, i10);
                te teVarA = l0VarA != null ? l0VarA.A() : null;
                if (teVarA == null) {
                    zD = false;
                } else if (teVarA.v()) {
                    zD = oVarA.d(com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext(), l0Var.f13566f, teVarA);
                    AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.a2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return h2.c(l0Var, zD);
                        }
                    });
                } else {
                    AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.z1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return h2.b(l0Var);
                        }
                    });
                    zD = false;
                }
                if (zD) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean x(Activity activity, int i10, String placementName) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        if (j2.w() < 21) {
            return false;
        }
        com.appodeal.ads.context.n.f13203b.a(activity);
        ((c5) f13381o.getValue()).getClass();
        final boolean zA = c5.a(activity, i10, placementName);
        for (final AdType adType : f6.b(i10)) {
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.c2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h2.e(adType, zA);
                }
            });
        }
        o2.t().a(z6.b(i10) + ", result: " + zA);
        return zA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double y(com.appodeal.ads.l0 r4) {
        /*
            com.appodeal.ads.x5 r0 = com.appodeal.ads.o2.b()
            com.appodeal.ads.te r1 = r4.A()
            if (r1 == 0) goto L17
            double r2 = r1.f14907s
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            boolean r1 = r1.v()
            if (r1 == 0) goto L17
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 != 0) goto L39
            com.appodeal.ads.modules.common.internal.adtype.AdType r4 = r4.s()
            java.lang.String r4 = r4.getDisplayName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = ". Predicted eCPM is 0.0, ad was not load"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.a(r4)
            r0 = 0
            return r0
        L39:
            com.appodeal.ads.modules.common.internal.adtype.AdType r4 = r4.s()
            java.lang.String r4 = r4.getDisplayName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = ". Predicted eCPM is "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r4 = r1.toString()
            r0.a(r4)
            double r0 = r2.doubleValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.h2.y(com.appodeal.ads.l0):double");
    }

    public static final Event z(AdType adType) {
        return new PublicApiEvent.SdkApiCanShow(adType, PublicApiEvent.Result.NOT_INITIALIZED);
    }
}
