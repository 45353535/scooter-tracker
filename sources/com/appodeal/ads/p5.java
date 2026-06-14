package com.appodeal.ads;

import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.analytics.models.AdUnitsEvent;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.analytics.models.GeneralAdUnitParams;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.revenue.RevenueInfo;
import com.appodeal.ads.revenue.RevenuePrecision;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k7 f14270a;

    public p5() {
        k7 requestApi = k7.f13545a;
        Intrinsics.checkNotNullParameter(requestApi, "requestApi");
        this.f14270a = requestApi;
    }

    public static final Event a(te adRequest, uc adObject, RevenueInfo revenueInfo) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(revenueInfo, "revenueInfo");
        GeneralAdUnitParams generalAdUnitParamsA = com.appodeal.ads.analytics.helper.a.a(adRequest, adObject);
        Double dValueOf = Double.valueOf(revenueInfo.getRevenue());
        String revenuePrecision = revenueInfo.getRevenuePrecision();
        return new AdUnitsEvent.AdUnitRevenue.AdUnitImpressionRevenue(generalAdUnitParamsA, dValueOf, Intrinsics.areEqual(revenuePrecision, RevenuePrecision.Exact.getPrecisionName()) ? AdUnitsEvent.AdUnitRevenue.Precision.EXACT : Intrinsics.areEqual(revenuePrecision, RevenuePrecision.PublisherDefined.getPrecisionName()) ? AdUnitsEvent.AdUnitRevenue.Precision.PUBLISHER_DEFINED : Intrinsics.areEqual(revenuePrecision, RevenuePrecision.Estimated.getPrecisionName()) ? AdUnitsEvent.AdUnitRevenue.Precision.ESTIMATED : AdUnitsEvent.AdUnitRevenue.Precision.UNDEFINED, revenueInfo.getDemandSource(), null, 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.appodeal.ads.revenue.RevenueInfo b(org.json.JSONObject r21, java.lang.String r22, com.appodeal.ads.modules.common.internal.adtype.AdType r23) {
        /*
            java.lang.String r0 = "optString(...)"
            r1 = 0
            kotlin.Result$Companion r2 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L7f
            java.lang.String r2 = "report_exact_revenue"
            r3 = r21
            org.json.JSONObject r2 = r3.optJSONObject(r2)     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L93
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L7f
            if (r3 <= 0) goto L16
            goto L17
        L16:
            r2 = r1
        L17:
            if (r2 == 0) goto L93
            java.lang.String r3 = "network_name"
            java.lang.String r5 = r2.optString(r3)     // Catch: java.lang.Throwable -> L7f
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r3 = "demand_source"
            java.lang.String r6 = r2.optString(r3)     // Catch: java.lang.Throwable -> L7f
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r3 = "unit_name"
            java.lang.String r7 = r2.optString(r3)     // Catch: java.lang.Throwable -> L7f
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r3 = "placement_name"
            java.lang.String r8 = r2.optString(r3)     // Catch: java.lang.Throwable -> L7f
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r3 = "placement_id"
            int r9 = r2.optInt(r3)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r3 = "revenue"
            double r12 = r2.optDouble(r3)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r3 = "precision"
            java.lang.String r14 = r2.optString(r3)     // Catch: java.lang.Throwable -> L7f
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r0)     // Catch: java.lang.Throwable -> L7f
            int r15 = r23.getCode()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r16 = r23.getCodeName()     // Catch: java.lang.Throwable -> L7f
            com.appodeal.ads.segments.j0 r0 = com.appodeal.ads.segments.s0.g()     // Catch: java.lang.Throwable -> L7f
            long r10 = r0.f14483a     // Catch: java.lang.Throwable -> L7f
            com.appodeal.ads.adnetworks.MediationAdNetwork$Companion r0 = com.appodeal.ads.adnetworks.MediationAdNetwork.INSTANCE     // Catch: java.lang.Throwable -> L7f
            r2 = r22
            com.appodeal.ads.adnetworks.MediationAdNetwork r0 = r0.getByName(r2)     // Catch: java.lang.Throwable -> L7f
            if (r0 != 0) goto L6c
            r0 = -1
            goto L74
        L6c:
            int[] r2 = com.appodeal.ads.h5.f13386a     // Catch: java.lang.Throwable -> L7f
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L7f
            r0 = r2[r0]     // Catch: java.lang.Throwable -> L7f
        L74:
            r2 = 1
            if (r0 == r2) goto L84
            r2 = 2
            if (r0 == r2) goto L81
            com.appodeal.ads.revenue.RevenuePlatform r0 = com.appodeal.ads.revenue.RevenuePlatform.APPODEAL     // Catch: java.lang.Throwable -> L7f
        L7c:
            r17 = r0
            goto L87
        L7f:
            r0 = move-exception
            goto L99
        L81:
            com.appodeal.ads.revenue.RevenuePlatform r0 = com.appodeal.ads.revenue.RevenuePlatform.LEVEL_PLAY     // Catch: java.lang.Throwable -> L7f
            goto L7c
        L84:
            com.appodeal.ads.revenue.RevenuePlatform r0 = com.appodeal.ads.revenue.RevenuePlatform.APPLOVIN_MAX     // Catch: java.lang.Throwable -> L7f
            goto L7c
        L87:
            com.appodeal.ads.revenue.RevenueInfo r4 = new com.appodeal.ads.revenue.RevenueInfo     // Catch: java.lang.Throwable -> L7f
            r19 = 2048(0x800, float:2.87E-42)
            r20 = 0
            r18 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L7f
            goto L94
        L93:
            r4 = r1
        L94:
            java.lang.Object r0 = kotlin.Result.b(r4)     // Catch: java.lang.Throwable -> L7f
            goto La3
        L99:
            kotlin.Result$Companion r2 = kotlin.Result.f93230c
            java.lang.Object r0 = kotlin.d.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
        La3:
            boolean r2 = kotlin.Result.i(r0)
            if (r2 == 0) goto Laa
            goto Lab
        Laa:
            r1 = r0
        Lab:
            com.appodeal.ads.revenue.RevenueInfo r1 = (com.appodeal.ads.revenue.RevenueInfo) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.p5.b(org.json.JSONObject, java.lang.String, com.appodeal.ads.modules.common.internal.adtype.AdType):com.appodeal.ads.revenue.RevenueInfo");
    }

    public static final Unit c(final uc ucVar, p5 p5Var, l0 l0Var, final te teVar, JSONObject jSONObject) {
        final RevenueInfo revenueInfoB;
        String name = ucVar.k().getName();
        if (jSONObject != null) {
            AdType adTypeS = l0Var.s();
            Intrinsics.checkNotNullExpressionValue(adTypeS, "getAdType(...)");
            p5Var.getClass();
            revenueInfoB = b(jSONObject, name, adTypeS);
        } else {
            revenueInfoB = null;
        }
        if (revenueInfoB == null) {
            LogExtKt.logInternal$default("ShowRequestUseCase", "Failed to parse revenue info for " + name, null, 4, null);
        } else {
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.o5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p5.a(teVar, ucVar, revenueInfoB);
                }
            });
            h2.o(revenueInfoB);
        }
        return Unit.f93236a;
    }

    public static final Event e(te adRequest, uc adObject, RevenueInfo revenueInfo) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(revenueInfo, "revenueInfo");
        GeneralAdUnitParams generalAdUnitParamsA = com.appodeal.ads.analytics.helper.a.a(adRequest, adObject);
        Double dValueOf = Double.valueOf(revenueInfo.getRevenue());
        String revenuePrecision = revenueInfo.getRevenuePrecision();
        return new AdUnitsEvent.AdUnitRevenue.AdUnitShowValued(generalAdUnitParamsA, dValueOf, Intrinsics.areEqual(revenuePrecision, RevenuePrecision.Exact.getPrecisionName()) ? AdUnitsEvent.AdUnitRevenue.Precision.EXACT : Intrinsics.areEqual(revenuePrecision, RevenuePrecision.PublisherDefined.getPrecisionName()) ? AdUnitsEvent.AdUnitRevenue.Precision.PUBLISHER_DEFINED : Intrinsics.areEqual(revenuePrecision, RevenuePrecision.Estimated.getPrecisionName()) ? AdUnitsEvent.AdUnitRevenue.Precision.ESTIMATED : AdUnitsEvent.AdUnitRevenue.Precision.UNDEFINED, revenueInfo.getDemandSource(), null, 16, null);
    }

    public static final Unit f(final uc ucVar, p5 p5Var, l0 l0Var, final te teVar, JSONObject jSONObject) {
        final RevenueInfo revenueInfoB;
        String name = ucVar.k().getName();
        if (jSONObject != null) {
            AdType adTypeS = l0Var.s();
            Intrinsics.checkNotNullExpressionValue(adTypeS, "getAdType(...)");
            p5Var.getClass();
            revenueInfoB = b(jSONObject, name, adTypeS);
        } else {
            revenueInfoB = null;
        }
        if (revenueInfoB == null) {
            LogExtKt.logInternal$default("ShowRequestUseCase", "Failed to parse revenue info for " + name, null, 4, null);
        } else {
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.m5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p5.e(teVar, ucVar, revenueInfoB);
                }
            });
            h2.o(revenueInfoB);
        }
        return Unit.f93236a;
    }

    public final void d(final uc adObject, final te adRequest, com.appodeal.ads.segments.o placement, final l0 adTypeController) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(adTypeController, "adTypeController");
        k7 k7Var = this.f14270a;
        Double dValueOf = Double.valueOf(adTypeController.C());
        Function1 onImpression = new Function1() { // from class: com.appodeal.ads.n5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p5.c(adObject, this, adTypeController, adRequest, (JSONObject) obj);
            }
        };
        k7Var.getClass();
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(onImpression, "onImpression");
        eg.i.d(k7.q(), new eg.e0("ApdShowRequest"), null, new p6(new h8(adObject, adRequest, placement, dValueOf), onImpression, null), 2, null);
    }

    public final void g(final uc adObject, final te adRequest, com.appodeal.ads.segments.o placement, final l0 adTypeController) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(adTypeController, "adTypeController");
        k7 k7Var = this.f14270a;
        Double dValueOf = Double.valueOf(adTypeController.C());
        Function1 onImpression = new Function1() { // from class: com.appodeal.ads.l5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p5.f(adObject, this, adTypeController, adRequest, (JSONObject) obj);
            }
        };
        k7Var.getClass();
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(onImpression, "onImpression");
        eg.i.d(k7.q(), new eg.e0("ApdShowValuedRequest"), null, new t6(new m8(adObject, adRequest, placement, dValueOf), onImpression, null), 2, null);
    }
}
