package com.appodeal.ads;

import android.os.Handler;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.analytics.models.AdImpressionEvent;
import com.appodeal.ads.analytics.models.AdUnitsEvent;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.analytics.models.GeneralAdImpressionParams;
import com.appodeal.ads.analytics.models.MediationEvent;
import com.appodeal.ads.analytics.models.WaterfallResult;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.utils.EventsTracker;
import com.appodeal.ads.utils.Log;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ka f13408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5 f13409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l0 f13410c;

    public i2(ka listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        p5 impressionUseCase = new p5();
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(impressionUseCase, "impressionUseCase");
        this.f13408a = listener;
        this.f13409b = impressionUseCase;
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e C(i2 i2Var, uc ucVar) {
        AdType adType = i2Var.c().f13566f;
        Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
        return new com.appodeal.ads.analytics.breadcrumbs.b(LogConstants.EVENT_EXPIRED, adType, ucVar);
    }

    public static final Event D(te adRequest) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        uc ucVar = adRequest.f14906r;
        WaterfallResult loaded = ucVar != null ? new WaterfallResult.Loaded(ucVar.f14937c.f15229f) : WaterfallResult.NoFill.INSTANCE;
        AdType adTypeU = adRequest.u();
        Intrinsics.checkNotNullExpressionValue(adTypeU, "getType(...)");
        String strS = adRequest.s();
        Intrinsics.checkNotNullExpressionValue(strS, "getImpressionId(...)");
        String str = adRequest.f14898j;
        if (str == null) {
            str = "";
        }
        return new MediationEvent.WaterfallFinish(adTypeU, strS, str, loaded);
    }

    public static final Event E(te adRequest, uc adObject, com.appodeal.ads.segments.o placement) {
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
        return new AdImpressionEvent.AdRewarded(new GeneralAdImpressionParams(adTypeU, strS, strValueOf, str, str3, demandSource == null ? "" : demandSource, adObject.f14937c.f15229f));
    }

    public static final void F(i2 i2Var, te teVar, uc ucVar) {
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdNotifyAdLoaded", "name");
        i2Var.f13408a.h(teVar, ucVar);
    }

    public static final void G(i2 i2Var, te teVar, uc ucVar, Object obj) {
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdNotifyAdShowFailed", "name");
        ka kaVar = i2Var.f13408a;
        LoadingError loadingError = LoadingError.NoFill;
        kaVar.d(teVar, ucVar, obj);
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e K(i2 i2Var, uc ucVar) {
        AdType adType = i2Var.c().f13566f;
        Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
        return new com.appodeal.ads.analytics.breadcrumbs.b(LogConstants.EVENT_FINISHED, adType, ucVar);
    }

    public static final Event L(te adRequest) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        uc ucVar = adRequest.f14906r;
        WaterfallResult loaded = ucVar != null ? new WaterfallResult.Loaded(ucVar.f14937c.f15229f) : WaterfallResult.NoFill.INSTANCE;
        AdType adTypeU = adRequest.u();
        Intrinsics.checkNotNullExpressionValue(adTypeU, "getType(...)");
        String strS = adRequest.s();
        Intrinsics.checkNotNullExpressionValue(strS, "getImpressionId(...)");
        String str = adRequest.f14898j;
        if (str == null) {
            str = "";
        }
        return new MediationEvent.WaterfallFinish(adTypeU, strS, str, loaded);
    }

    public static final Event M(te adRequest, uc adObject, com.appodeal.ads.segments.o placement) {
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
        return new AdImpressionEvent.AdShowFailed(new GeneralAdImpressionParams(adTypeU, strS, strValueOf, str, str3, demandSource == null ? "" : demandSource, adObject.f14937c.f15229f), null, null);
    }

    public static final void N(i2 i2Var, te teVar, uc expiredAdObject) {
        Intrinsics.checkNotNullParameter(expiredAdObject, "expiredAdObject");
        i2Var.i0(teVar, expiredAdObject);
    }

    public static final void O(i2 i2Var, te teVar, uc ucVar, Object obj) {
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdNotifyAdLoadFailed", "name");
        i2Var.f13408a.f(teVar, ucVar, obj);
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e S(i2 i2Var, uc ucVar) {
        AdType adType = i2Var.c().f13566f;
        Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
        return new com.appodeal.ads.analytics.breadcrumbs.b(LogConstants.EVENT_LOAD_FAILED, adType, ucVar);
    }

    public static final Event T(te adRequest, uc adObject, com.appodeal.ads.segments.o placement) {
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
        return new AdImpressionEvent.AdShown(new GeneralAdImpressionParams(adTypeU, strS, strValueOf, str, str3, demandSource == null ? "" : demandSource, adObject.f14937c.f15229f));
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e W(i2 i2Var, uc ucVar) {
        AdType adType = i2Var.c().f13566f;
        Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
        return new com.appodeal.ads.analytics.breadcrumbs.b(LogConstants.EVENT_LOADED, adType, ucVar);
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e Z(i2 i2Var, uc ucVar) {
        AdType adType = i2Var.c().f13566f;
        Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
        return new com.appodeal.ads.analytics.breadcrumbs.b(LogConstants.EVENT_WATERFALL_FINISH, adType, ucVar);
    }

    public static final int a(uc o12, uc o22) {
        Intrinsics.checkNotNullParameter(o12, "o1");
        Intrinsics.checkNotNullParameter(o22, "o2");
        return Double.compare(o22.f14937c.f15229f, o12.f14937c.f15229f);
    }

    public static final int b(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e c0(i2 i2Var, uc ucVar) {
        AdType adType = i2Var.c().f13566f;
        Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
        return new com.appodeal.ads.analytics.breadcrumbs.b(LogConstants.EVENT_WATERFALL_FINISH, adType, ucVar);
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e d(i2 i2Var, uc ucVar) {
        AdType adType = i2Var.c().f13566f;
        Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
        return new com.appodeal.ads.analytics.breadcrumbs.b(LogConstants.EVENT_CLICKED, adType, ucVar);
    }

    public static final Event e(te adRequest, uc adObject, com.appodeal.ads.segments.o placement) {
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
        return new AdImpressionEvent.AdClicked(new GeneralAdImpressionParams(adTypeU, strS, strValueOf, str, str3, demandSource == null ? "" : demandSource, adObject.f14937c.f15229f));
    }

    public static final Event f(te adRequest, uc adObject, com.appodeal.ads.segments.o placement, ShowError showError) {
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
        return new AdImpressionEvent.AdShowFailed(new GeneralAdImpressionParams(adTypeU, strS, strValueOf, str, str3, demandSource == null ? "" : demandSource, adObject.f14937c.f15229f), null, ((ShowError.SdkShowError) showError).getMessage());
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e f0(i2 i2Var, uc ucVar) {
        AdType adType = i2Var.c().f13566f;
        Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
        return new com.appodeal.ads.analytics.breadcrumbs.b(LogConstants.EVENT_WATERFALL_FINISH, adType, ucVar);
    }

    public static void g0(te teVar, uc ucVar) {
        if (!ucVar.l()) {
            if (ucVar.f14937c.f15228e) {
                teVar.f14912x = true;
            } else {
                teVar.f14911w = true;
            }
            com.appodeal.ads.utils.h.a(teVar.f14906r);
            teVar.f14906r = ucVar;
            return;
        }
        teVar.getClass();
        for (int i10 = 0; i10 < ucVar.f14939e.size(); i10++) {
            try {
                String str = (String) ucVar.f14939e.get(i10);
                uc ucVar2 = (uc) teVar.f14904p.get(str);
                if (ucVar2 == null) {
                    teVar.f14904p.put(str, ucVar);
                } else if (ucVar.f14937c.f15229f > ucVar2.f14937c.f15229f) {
                    teVar.f14904p.put(str, ucVar);
                }
            } catch (Exception e10) {
                Log.log(e10);
            }
        }
        teVar.f14891c.remove(ucVar);
    }

    public static final void h(i2 i2Var) {
        try {
            Handler handler = b6.f13134a;
            Intrinsics.checkNotNullParameter("ApdReloadAdAfterFailed", "name");
            te teVarA = i2Var.c().A();
            if (teVarA == null || teVarA.h()) {
                i2Var.c().t(com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext());
            }
            l0 l0VarC = i2Var.c();
            if (l0VarC.C() > 0.0d) {
                l0VarC.f13585y = (int) (l0VarC.f13585y * l0VarC.f13583w);
            } else {
                l0VarC.f13585y = (int) (l0VarC.f13585y * l0VarC.f13584x);
            }
            if (l0VarC.f13585y >= 100000) {
                l0VarC.f13585y = 100000;
            }
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    public static final void i(i2 i2Var, te teVar, uc ucVar) {
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdNotifyAdClosed", "name");
        i2Var.f13408a.a(teVar, ucVar);
    }

    public static final void j(i2 i2Var, te teVar, uc ucVar, LoadingError loadingError) {
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdNotifyAdLoadFailed", "name");
        i2Var.f13408a.g(teVar, ucVar);
    }

    public static final Event j0(te adRequest, uc adUnit) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new AdUnitsEvent.AdUnitExpired(com.appodeal.ads.analytics.helper.a.a(adRequest, adUnit));
    }

    public static final void k(i2 i2Var, te teVar, uc ucVar, Object obj) {
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdNotifyAdClicked", "name");
        i2Var.f13408a.b(teVar, ucVar, obj);
    }

    public static void l(te teVar) {
        char c10 = 2;
        boolean z10 = true;
        int i10 = 0;
        ArrayList arrayList = new ArrayList();
        for (te teVar2 = teVar; teVar2 != null; teVar2 = teVar2.G) {
            CopyOnWriteArrayList copyOnWriteArrayList = teVar2.f14905q;
            Intrinsics.checkNotNullExpressionValue(copyOnWriteArrayList, "getLoadedAdObjects(...)");
            arrayList.addAll(copyOnWriteArrayList);
        }
        final Function2 function2 = new Function2() { // from class: com.appodeal.ads.q0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(i2.a((uc) obj, (uc) obj2));
            }
        };
        CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.appodeal.ads.r0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return i2.b(function2, obj, obj2);
            }
        });
        uc ucVar = arrayList.isEmpty() ? null : (uc) arrayList.get(0);
        if (ucVar != null) {
            if (ucVar.f14940f != null && !ucVar.l() && !ucVar.f14951q) {
                ucVar.f14951q = true;
                String str = ucVar.f14937c.f15226c;
                if (!TextUtils.isEmpty(str) && TextUtils.getTrimmedLength(str) > 5) {
                    str = str.substring(0, 5) + APSSharedUtil.TRUNCATE_SEPARATOR;
                }
                Log.log(ucVar.f14935a.u().getDisplayName(), LogConstants.EVENT_NOTIFY_MEDIATION_RESULT, String.format(Locale.ENGLISH, "(winner): %s - eCPM: %.2f, id: %s", z6.d(ucVar.f14937c.f15227d), Double.valueOf(ucVar.f14937c.f15229f), str));
                ucVar.f14940f.onMediationWin();
            }
            arrayList.remove(ucVar);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                uc ucVar2 = (uc) it.next();
                String str2 = ucVar.f14938d;
                double d10 = ucVar.f14937c.f15229f;
                if (ucVar2.f14940f != null && !ucVar2.l() && !ucVar2.f14951q) {
                    ucVar2.f14951q = z10;
                    String str3 = ucVar2.f14937c.f15226c;
                    if (!TextUtils.isEmpty(str3) && TextUtils.getTrimmedLength(str3) > 5) {
                        str3 = str3.substring(i10, 5) + APSSharedUtil.TRUNCATE_SEPARATOR;
                    }
                    String displayName = ucVar2.f14935a.u().getDisplayName();
                    String str4 = LogConstants.EVENT_NOTIFY_MEDIATION_RESULT;
                    Locale locale = Locale.ENGLISH;
                    char c11 = c10;
                    String strD = z6.d(ucVar2.f14937c.f15227d);
                    byte b10 = z10 ? 1 : 0;
                    int i11 = i10;
                    Double dValueOf = Double.valueOf(ucVar2.f14937c.f15229f);
                    Object[] objArr = new Object[3];
                    objArr[i11] = strD;
                    objArr[b10 == true ? 1 : 0] = dValueOf;
                    objArr[c11] = str3;
                    Log.log(displayName, str4, String.format(locale, "(loser): %s - eCPM: %.2f, id: %s", objArr));
                    ucVar2.f14940f.onMediationLoss(str2, d10);
                    it = it;
                    c10 = c11;
                    z10 = b10 == true ? 1 : 0;
                    i10 = i11;
                }
            }
        }
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e s(i2 i2Var, uc ucVar) {
        AdType adType = i2Var.c().f13566f;
        Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
        return new com.appodeal.ads.analytics.breadcrumbs.b(LogConstants.EVENT_CLOSED, adType, ucVar);
    }

    public static final Event t(te adRequest, uc adObject, com.appodeal.ads.segments.o placement) {
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
        return new AdImpressionEvent.AdClosed(new GeneralAdImpressionParams(adTypeU, strS, strValueOf, str, str3, demandSource == null ? "" : demandSource, adObject.f14937c.f15229f));
    }

    public static final Event u(te adRequest, uc adObject, com.appodeal.ads.segments.o placement, ShowError showError) {
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
        return new AdImpressionEvent.AdShowFailed(new GeneralAdImpressionParams(adTypeU, strS, strValueOf, str, str3, demandSource == null ? "" : demandSource, adObject.f14937c.f15229f), ((ShowError.NetworkShowError) showError).getMessage(), null);
    }

    public static final void v(i2 i2Var, te teVar, uc ucVar) {
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdNotifyAdExpired", "name");
        i2Var.f13408a.c(teVar, ucVar);
    }

    public static final void w(i2 i2Var, te teVar, uc ucVar, Object obj) {
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdNotifyAdFinished", "name");
        i2Var.f13408a.e(teVar, ucVar);
    }

    public final void A(final te teVar, final uc ucVar, final Object obj) {
        Runnable task = new Runnable() { // from class: com.appodeal.ads.i1
            @Override // java.lang.Runnable
            public final void run() {
                i2.w(this.f13404b, teVar, ucVar, obj);
            }
        };
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter(task, "task");
        b6.f13134a.post(task);
    }

    public boolean B() {
        return this instanceof z5;
    }

    public final void H(final te adRequest, final uc adObject) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Runnable task = new Runnable() { // from class: com.appodeal.ads.s0
            @Override // java.lang.Runnable
            public final void run() {
                i2.F(this.f14444b, adRequest, adObject);
            }
        };
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter(task, "task");
        b6.f13134a.post(task);
    }

    public final void I(te teVar, uc ucVar, LoadingError loadingError) {
        x2 x2Var = ucVar != null ? ucVar.f14937c : null;
        if (loadingError == null) {
            loadingError = LoadingError.NoFill;
        }
        n(teVar, ucVar, x2Var, loadingError);
    }

    public final void J(final te teVar, final uc ucVar, final Object obj) {
        Runnable task = new Runnable() { // from class: com.appodeal.ads.g1
            @Override // java.lang.Runnable
            public final void run() {
                i2.G(this.f13335b, teVar, ucVar, obj);
            }
        };
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter(task, "task");
        b6.f13134a.post(task);
    }

    public void P(te adRequest, uc adObject) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
    }

    public final void Q(te teVar, final uc ucVar, LoadingError loadingError) {
        UnifiedAd unifiedAd;
        if (loadingError == null) {
            loadingError = LoadingError.InternalError;
        }
        try {
            te teVar2 = c().f13581u;
            if (teVar2 == null || teVar2 != teVar) {
                return;
            }
            c().l(LogConstants.EVENT_LOAD_FAILED_SOFT, ucVar, loadingError);
            if (teVar != null) {
                teVar.A();
                teVar.f14911w = false;
                teVar.f14912x = false;
            }
            if (ucVar != null && (unifiedAd = ucVar.f14940f) != null) {
                unifiedAd.onError(loadingError);
            }
            final te adRequest = c().A();
            if (adRequest == null) {
                g(c().f13585y);
                com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.p1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i2.f0(this.f14263b, ucVar);
                    }
                });
                z(teVar, ucVar, loadingError);
                return;
            }
            uc ucVar2 = adRequest.f14906r;
            if (adRequest.v() && ucVar2 != null) {
                d9 d9Var = (d9) h2.f13370d.getValue();
                AdType adType = c().f13566f;
                Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
                d9Var.getClass();
                Intrinsics.checkNotNullParameter(adType, "adType");
                Intrinsics.checkNotNullParameter(adRequest, "adRequest");
                eg.i.d((CoroutineScope) d9Var.f13236a.getValue(), null, null, new q8(d9Var, adType, adRequest, null), 3, null);
                AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.l1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i2.D(adRequest);
                    }
                });
                com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.m1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i2.Z(this.f13632b, ucVar);
                    }
                });
                X(adRequest, ucVar2);
                l(teVar);
                c().f13585y = 5000;
                return;
            }
            te teVar3 = c().f13582v;
            if (teVar3 != null && teVar3 == adRequest) {
                c().f13585y = 5000;
                return;
            }
            g(c().f13585y);
            d9 d9Var2 = (d9) h2.f13370d.getValue();
            AdType adType2 = c().f13566f;
            Intrinsics.checkNotNullExpressionValue(adType2, "getAdType(...)");
            d9Var2.getClass();
            Intrinsics.checkNotNullParameter(adType2, "adType");
            Intrinsics.checkNotNullParameter(adRequest, "adRequest");
            eg.i.d((CoroutineScope) d9Var2.f13236a.getValue(), null, null, new q8(d9Var2, adType2, adRequest, null), 3, null);
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.n1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.L(adRequest);
                }
            });
            com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.o1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.c0(this.f14206b, ucVar);
                }
            });
            z(teVar, ucVar, loadingError);
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    public final void R(final te teVar, final uc ucVar, final Object obj) {
        Runnable task = new Runnable() { // from class: com.appodeal.ads.f1
            @Override // java.lang.Runnable
            public final void run() {
                i2.O(this.f13303b, teVar, ucVar, obj);
            }
        };
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter(task, "task");
        b6.f13134a.post(task);
    }

    public com.appodeal.ads.segments.o U(te adRequest, uc adObject, Object obj) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        com.appodeal.ads.segments.o oVarY = c().y();
        Intrinsics.checkNotNullExpressionValue(oVarY, "getLastPlacement(...)");
        return oVarY;
    }

    public void V(te adRequest, uc adObject) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        if (c().f13572l) {
            c().t(com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext());
        }
    }

    public void X(te adRequest, uc adObject) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        H(adRequest, adObject);
    }

    public final void Y(final te adRequest, final uc adObject, Object obj) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        try {
            com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.K(this.f14915b, adObject);
                }
            });
            if (adRequest.f14913y) {
                return;
            }
            adRequest.f14913y = true;
            adRequest.f14902n = System.currentTimeMillis();
            adObject.getClass();
            com.appodeal.ads.utils.q.b(adObject);
            UnifiedAd unifiedAd = adObject.f14940f;
            if (unifiedAd != null) {
                unifiedAd.onFinished();
            }
            if (adObject.f14950p == 0) {
                adObject.f14950p = System.currentTimeMillis();
            }
            c().l(LogConstants.EVENT_FINISHED, adObject, null);
            final com.appodeal.ads.segments.o oVarU = U(adRequest, adObject, obj);
            k7 k7Var = k7.f13545a;
            k7.i(adObject, adRequest, oVarU, Double.valueOf(c().C()));
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.v0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.E(adRequest, adObject, oVarU);
                }
            });
            Intrinsics.checkNotNullParameter(adRequest, "adRequest");
            Intrinsics.checkNotNullParameter(adObject, "adObject");
            A(adRequest, adObject, obj);
            b0(adRequest, adObject, obj);
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    public void a0(te teVar, uc adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        if (c().f13572l) {
            c().t(com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext());
        }
    }

    public final void b0(te adRequest, uc adObject, Object obj) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        try {
            if (adRequest.f14910v.get() && !adRequest.C && adObject.f14937c.f15238o) {
                ImpressionLevelData impressionLevelData = adObject.f14943i;
                if ((impressionLevelData != null ? impressionLevelData.getRevenue() : null) != null) {
                    c().l(LogConstants.EVENT_AD_REVENUE, adObject, null);
                    adRequest.C = true;
                    this.f13409b.g(adObject, adRequest, U(adRequest, adObject, obj), c());
                }
            }
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    public final l0 c() {
        l0 l0Var = this.f13410c;
        if (l0Var != null) {
            return l0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public void d0(te adRequest, uc adObject) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
    }

    public final void e0(final te adRequest, final uc adObject, Object obj) {
        te teVar;
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        try {
            if (adRequest.f14910v.get()) {
                return;
            }
            adRequest.f14910v.set(true);
            adRequest.f14900l = System.currentTimeMillis();
            adRequest.A();
            if (!adRequest.A) {
                c().u(adRequest, adObject);
            }
            if (!(this instanceof u) && ((teVar = c().f13581u) == null || teVar != adRequest)) {
                x(c().f13581u);
            }
            l(adRequest);
            AdType adType = c().f13566f;
            Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
            EnumMap enumMap = com.appodeal.ads.utils.k.f15028a;
            Intrinsics.checkNotNullParameter(adType, "adType");
            Job job = (Job) com.appodeal.ads.utils.k.f15028a.remove(adType);
            if (job != null) {
                Job.a.a(job, null, 1, null);
            }
            c().l(LogConstants.EVENT_SHOWN, adObject, null);
            adRequest.f14911w = false;
            adRequest.f14912x = false;
            if (B()) {
                UnifiedAd unifiedAd = adObject.f14940f;
                if (unifiedAd != null) {
                    unifiedAd.onShow();
                }
                if (adObject.f14947m == 0) {
                    adObject.f14947m = System.currentTimeMillis();
                }
            }
            adObject.p();
            EventsTracker.get().a(c().f13566f, adObject, EventsTracker.EventType.Impression);
            final com.appodeal.ads.segments.o oVarU = U(adRequest, adObject, obj);
            this.f13409b.d(adObject, adRequest, oVarU, c());
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.z0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.T(adRequest, adObject, oVarU);
                }
            });
            d0(adRequest, adObject);
            R(adRequest, adObject, obj);
            b0(adRequest, adObject, obj);
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    public final void g(int i10) {
        if (c().f13572l) {
            Runnable task = new Runnable() { // from class: com.appodeal.ads.p0
                @Override // java.lang.Runnable
                public final void run() {
                    i2.h(this.f14262b);
                }
            };
            long j10 = i10;
            Handler handler = b6.f13134a;
            Intrinsics.checkNotNullParameter(task, "task");
            b6.f13134a.postDelayed(task, j10);
        }
    }

    public final void h0(final te teVar, final uc adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        try {
            com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.a1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.s(this.f11866b, adObject);
                }
            });
            if (teVar == null || teVar.f14914z) {
                return;
            }
            teVar.f14914z = true;
            final com.appodeal.ads.segments.o oVarU = U(teVar, adObject, null);
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.b1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.t(teVar, adObject, oVarU);
                }
            });
            UnifiedAd unifiedAd = adObject.f14940f;
            if (unifiedAd != null) {
                unifiedAd.onHide();
            }
            c().l(LogConstants.EVENT_CLOSED, adObject, null);
            P(teVar, adObject);
            m(teVar, adObject);
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    public final void i0(final te adRequest, final uc adObject) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.r1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i2.C(this.f14313b, adObject);
            }
        });
        if (c().f13568h.contains(adRequest)) {
            c().l(LogConstants.EVENT_EXPIRED, adObject, null);
            if (adObject.l()) {
                com.appodeal.ads.utils.h.a(adObject);
                adRequest.n(adObject.f14937c.f15226c);
                adObject.q();
                return;
            }
            uc ucVar = adRequest.f14906r;
            if (ucVar == null || ucVar != adObject) {
                return;
            }
            adRequest.p();
            te.g(adRequest.f14905q);
            te.g(adRequest.f14904p.values());
            adRequest.z();
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.o0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.j0(adRequest, adObject);
                }
            });
            V(adRequest, adObject);
            y(adRequest, adObject);
        }
    }

    public final void k0(final te adRequest, final uc adObject) {
        uc ucVar;
        uc ucVar2;
        uc ucVar3;
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        try {
            com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.n0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.W(this.f13793b, adObject);
                }
            });
            if (!adRequest.F && !adRequest.f14910v.get() && !adRequest.A) {
                te teVar = c().f13582v;
                if (teVar != null && teVar == adRequest) {
                    if (adObject == null || (ucVar3 = adRequest.f14906r) == null || ucVar3 != adObject) {
                        adObject.q();
                        return;
                    }
                    return;
                }
                if (adObject.f14945k == 3) {
                    adObject.q();
                    return;
                }
                if (adRequest.f14893e.contains(adObject)) {
                    adRequest.f14893e.remove(adObject);
                }
                adObject.f14945k = 2;
                c().l(LogConstants.EVENT_LOADED, adObject, null);
                UnifiedAd unifiedAd = adObject.f14940f;
                if (unifiedAd != null) {
                    unifiedAd.onLoaded();
                }
                if (!adRequest.f14905q.contains(adObject)) {
                    adRequest.f14905q.add(adObject);
                }
                adRequest.t(adObject);
                he heVar = adRequest.H;
                heVar.getClass();
                if (!adObject.l() && ((ucVar = heVar.f13148a) == null || ucVar.f14937c.f15229f < adObject.f14937c.f15229f)) {
                    heVar.f13148a = adObject;
                }
                uc ucVar4 = adRequest.H.f13148a;
                if (ucVar4 == null) {
                    ucVar4 = adObject;
                }
                if (ucVar4.l() || (ucVar2 = adRequest.f14906r) == null || ucVar2 == adObject || ucVar2.f14937c.f15229f < ucVar4.f14937c.f15229f) {
                    adRequest.f14907s = ucVar4.f14937c.f15229f;
                    Intrinsics.checkNotNull(ucVar4);
                    g0(adRequest, ucVar4);
                }
                d9 d9Var = (d9) h2.f13370d.getValue();
                AdType adType = c().f13566f;
                Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
                d9Var.getClass();
                Intrinsics.checkNotNullParameter(adType, "adType");
                Intrinsics.checkNotNullParameter(adObject, "adObject");
                try {
                    eg.i.d((CoroutineScope) d9Var.f13236a.getValue(), null, null, new g8(d9Var, adType, adObject, true, null), 3, null);
                    te teVar2 = c().f13581u;
                    if (teVar2 == null || teVar2 != adRequest) {
                        adRequest.A();
                        c().u(adRequest, adObject);
                        return;
                    }
                    if (!adRequest.f14895g && adRequest.f14893e.isEmpty()) {
                        if (adRequest.f14889a.isEmpty() || !l0(adRequest, adObject)) {
                            adRequest.A();
                            adRequest.f14909u.set(true);
                            c().u(adRequest, adObject);
                        } else {
                            c().j(adRequest, 0, false, false);
                        }
                    }
                    com.appodeal.ads.utils.h.b(adObject, new com.appodeal.ads.utils.g() { // from class: com.appodeal.ads.y0
                        @Override // com.appodeal.ads.utils.g
                        public final void a(uc ucVar5) {
                            i2.N(this.f15266a, adRequest, ucVar5);
                        }
                    });
                    if (adObject.l()) {
                        return;
                    }
                    if (c().f13577q && adObject.f14937c.f15228e) {
                        X(adRequest, adObject);
                    }
                    c().f13585y = 5000;
                    return;
                } catch (Exception e10) {
                    e = e10;
                    adObject = adObject;
                    Log.log(e);
                    Q(adRequest, adObject, LoadingError.InternalError);
                    return;
                }
            }
            adObject.q();
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final boolean l0(te teVar, uc ucVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (!ucVar.f14937c.f15228e && !ucVar.l()) {
            c().getClass();
            JSONObject jSONObject = (!(!teVar.f14910v.get() && !teVar.f14911w && teVar.f14912x) || (arrayList2 = teVar.f14890b) == null || arrayList2.size() <= 0) ? null : (JSONObject) teVar.f14890b.get(0);
            if (jSONObject == null && (arrayList = teVar.f14889a) != null && arrayList.size() > 0) {
                jSONObject = (JSONObject) teVar.f14889a.get(0);
            }
            if (jSONObject == null || jSONObject.optDouble("ecpm", 0.0d) <= ucVar.f14937c.f15229f) {
                return false;
            }
        }
        return true;
    }

    public final void m(final te teVar, final uc ucVar) {
        Runnable task = new Runnable() { // from class: com.appodeal.ads.k1
            @Override // java.lang.Runnable
            public final void run() {
                i2.i(this.f13531b, teVar, ucVar);
            }
        };
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter(task, "task");
        b6.f13134a.post(task);
    }

    public boolean m0(te adRequest, uc adObject) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return !adRequest.f14913y && c().w() > 0;
    }

    public final void n(te teVar, final uc adObject, x2 x2Var, LoadingError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.j1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.S(this.f13489b, adObject);
                }
            });
            if (teVar != null && !teVar.F && !teVar.f14910v.get()) {
                if (teVar.f14893e.contains(adObject)) {
                    teVar.f14893e.remove(adObject);
                }
                if (adObject == null || adObject.f14945k == 1) {
                    c().l(LogConstants.EVENT_LOAD_FAILED, adObject, error);
                    if (adObject != null) {
                        adObject.f14945k = 3;
                        d9 d9Var = (d9) h2.f13370d.getValue();
                        AdType adType = c().f13566f;
                        Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
                        d9Var.getClass();
                        Intrinsics.checkNotNullParameter(adType, "adType");
                        Intrinsics.checkNotNullParameter(adObject, "adObject");
                        try {
                            eg.i.d((CoroutineScope) d9Var.f13236a.getValue(), null, null, new g8(d9Var, adType, adObject, false, null), 3, null);
                            UnifiedAd unifiedAd = adObject.f14940f;
                            if (unifiedAd != null) {
                                unifiedAd.onError(error);
                            }
                            adObject.q();
                        } catch (Exception e10) {
                            e = e10;
                            adObject = adObject;
                            Log.log(e);
                            Q(teVar, adObject, LoadingError.InternalError);
                            return;
                        }
                    }
                    if (x2Var != null) {
                        teVar.f(x2Var, error);
                    }
                    te teVar2 = c().f13581u;
                    if (teVar2 == null || teVar2 != teVar) {
                        teVar.A();
                        c().u(teVar, adObject);
                        return;
                    }
                    if (teVar.f14895g || !teVar.f14893e.isEmpty()) {
                        return;
                    }
                    if (!teVar.f14890b.isEmpty()) {
                        c().j(teVar, 0, true, false);
                    } else {
                        if (!teVar.f14889a.isEmpty()) {
                            c().j(teVar, 0, false, false);
                            return;
                        }
                        teVar.A();
                        teVar.f14909u.set(true);
                        c().u(teVar, adObject);
                    }
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final void o(final te teVar, final uc ucVar, final LoadingError loadingError) {
        Runnable task = new Runnable() { // from class: com.appodeal.ads.q1
            @Override // java.lang.Runnable
            public final void run() {
                i2.j(this.f14284b, teVar, ucVar, loadingError);
            }
        };
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter(task, "task");
        b6.f13134a.post(task);
    }

    public final void p(final te teVar, final uc ucVar, final Object obj) {
        Runnable task = new Runnable() { // from class: com.appodeal.ads.h1
            @Override // java.lang.Runnable
            public final void run() {
                i2.k(this.f13363b, teVar, ucVar, obj);
            }
        };
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter(task, "task");
        b6.f13134a.post(task);
    }

    public final void q(final te teVar, final uc adObject, Object obj, final ShowError showError) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        try {
            l0 l0VarC = c();
            LoadingError loadingError = LoadingError.ShowFailed;
            l0VarC.l(LogConstants.EVENT_LOAD_FAILED_SOFT, adObject, loadingError);
            if (teVar != null) {
                teVar.A();
                teVar.f14911w = false;
                teVar.f14912x = false;
                final com.appodeal.ads.segments.o oVarU = U(teVar, adObject, obj);
                if (showError instanceof ShowError.NetworkShowError) {
                    AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.c1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i2.u(teVar, adObject, oVarU, showError);
                        }
                    });
                } else if (showError instanceof ShowError.SdkShowError) {
                    AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.d1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i2.f(teVar, adObject, oVarU, showError);
                        }
                    });
                } else {
                    AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.e1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i2.M(teVar, adObject, oVarU);
                        }
                    });
                }
            }
            AdType adType = c().f13566f;
            Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
            EnumMap enumMap = com.appodeal.ads.utils.k.f15028a;
            Intrinsics.checkNotNullParameter(adType, "adType");
            Job job = (Job) com.appodeal.ads.utils.k.f15028a.remove(adType);
            if (job != null) {
                Job.a.a(job, null, 1, null);
            }
            UnifiedAd unifiedAd = adObject.f14940f;
            if (unifiedAd != null) {
                unifiedAd.onError(loadingError);
            }
            a0(teVar, adObject);
            J(teVar, adObject, obj);
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    public final void r(final te adRequest, final uc adObject, Object obj, UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        try {
            com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.w0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.d(this.f15167b, adObject);
                }
            });
            if (!adRequest.f14910v.get()) {
                e0(adRequest, adObject, obj);
            }
            if (m0(adRequest, adObject)) {
                Y(adRequest, adObject, obj);
            }
            if (adRequest.D) {
                if (unifiedAdCallbackClickTrackListener != null) {
                    unifiedAdCallbackClickTrackListener.onTrackError();
                    return;
                }
                return;
            }
            adRequest.D = true;
            adRequest.f14901m = System.currentTimeMillis();
            d9 d9Var = (d9) h2.f13370d.getValue();
            AdType adType = c().f13566f;
            Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
            d9Var.getClass();
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(adObject, "adObject");
            eg.i.d((CoroutineScope) d9Var.f13236a.getValue(), null, null, new u7(d9Var, adType, adObject, null), 3, null);
            c().l(LogConstants.EVENT_CLICKED, adObject, null);
            com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext();
            adObject.n();
            final com.appodeal.ads.segments.o oVarU = U(adRequest, adObject, obj);
            k7 k7Var = k7.f13545a;
            k7.j(adObject, adRequest, oVarU, Double.valueOf(c().C()), unifiedAdCallbackClickTrackListener);
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.x0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.e(adRequest, adObject, oVarU);
                }
            });
            Intrinsics.checkNotNullParameter(adRequest, "adRequest");
            Intrinsics.checkNotNullParameter(adObject, "adObject");
            p(adRequest, adObject, obj);
            b0(adRequest, adObject, obj);
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    public final void x(te teVar) {
        if (teVar == null || teVar.F) {
            return;
        }
        Iterator it = teVar.f14891c.iterator();
        while (it.hasNext()) {
            ((uc) it.next()).q();
        }
        Iterator it2 = teVar.f14892d.iterator();
        while (it2.hasNext()) {
            ((uc) it2.next()).q();
        }
        Iterator it3 = teVar.f14893e.iterator();
        while (it3.hasNext()) {
            ((uc) it3.next()).q();
        }
        teVar.p();
        te.g(teVar.f14905q);
        te.g(teVar.f14904p.values());
        teVar.A();
        c().u(teVar, null);
        teVar.F = true;
        teVar.z();
    }

    public final void y(final te teVar, final uc ucVar) {
        Runnable task = new Runnable() { // from class: com.appodeal.ads.t0
            @Override // java.lang.Runnable
            public final void run() {
                i2.v(this.f14848b, teVar, ucVar);
            }
        };
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter(task, "task");
        b6.f13134a.post(task);
    }

    public void z(te teVar, uc ucVar, LoadingError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        o(teVar, ucVar, error);
    }
}
