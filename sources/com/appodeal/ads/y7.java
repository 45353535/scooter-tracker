package com.appodeal.ads;

import android.app.Activity;
import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.analytics.models.AdImpressionEvent;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.analytics.models.GeneralAdImpressionParams;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y7 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tc f15285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s7 f15286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.segments.o f15287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f15288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t7 f15289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t7 f15290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l0 f15291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ac f15292i;

    public y7(ac acVar, tc tcVar, s7 s7Var, com.appodeal.ads.segments.o oVar, Activity activity, t7 t7Var, t7 t7Var2, l0 l0Var) {
        this.f15292i = acVar;
        this.f15285b = tcVar;
        this.f15286c = s7Var;
        this.f15287d = oVar;
        this.f15288e = activity;
        this.f15289f = t7Var;
        this.f15290g = t7Var2;
        this.f15291h = l0Var;
    }

    public static Event a(tc adRequest, s7 adObject, com.appodeal.ads.segments.o placement) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(placement, "placement");
        AdType adTypeU = adRequest.u();
        Intrinsics.checkNotNullExpressionValue(adTypeU, "getType(...)");
        String strS = adRequest.s();
        Intrinsics.checkNotNullExpressionValue(strS, "getImpressionId(...)");
        String strValueOf = String.valueOf(placement.f14494a);
        String str = adObject.f14937c.f15227d;
        Intrinsics.checkNotNullExpressionValue(str, "getStatus(...)");
        String str2 = adObject.f14937c.f15234k;
        String str3 = str2 == null ? "" : str2;
        ImpressionLevelData impressionLevelData = adObject.f14943i;
        String demandSource = impressionLevelData != null ? impressionLevelData.getDemandSource() : null;
        return new AdImpressionEvent.AdViewRender(new GeneralAdImpressionParams(adTypeU, strS, strValueOf, str, str3, demandSource == null ? "" : demandSource, adObject.f14937c.f15229f));
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppodealAnalytics appodealAnalytics = AppodealAnalytics.INSTANCE;
        final tc tcVar = this.f15285b;
        final s7 s7Var = this.f15286c;
        final com.appodeal.ads.segments.o oVar = this.f15287d;
        appodealAnalytics.internalEvent(new Function0() { // from class: com.appodeal.ads.x7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y7.a(tcVar, s7Var, oVar);
            }
        });
        this.f15292i.t(this.f15288e, this.f15285b, this.f15286c, this.f15289f, this.f15290g, this.f15291h, false);
    }
}
