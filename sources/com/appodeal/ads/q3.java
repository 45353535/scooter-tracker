package com.appodeal.ads;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Handler;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.analytics.models.AdImpressionEvent;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.analytics.models.GeneralAdImpressionParams;
import com.appodeal.ads.analytics.models.SdkInternalEvent;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAd;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.utils.Log;
import java.util.EnumMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class q3 extends zd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f14290a = new AtomicBoolean(false);

    public static Event e(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.SHOWING_IN_PROGRESS);
    }

    public static /* synthetic */ com.appodeal.ads.analytics.breadcrumbs.e l(te teVar, c3 c3Var) {
        return new com.appodeal.ads.analytics.breadcrumbs.b(LogConstants.EVENT_SHOW, teVar.u(), c3Var);
    }

    public static Event m(te adRequest, c3 adObject, com.appodeal.ads.segments.o placement) {
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

    public static Unit n(l0 l0Var, te teVar, c3 c3Var) {
        l0Var.f13567g.q(teVar, c3Var, null, new ShowError.SdkShowError("Ad network onShow callback wasn't triggered"));
        return null;
    }

    public static void o() {
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdFullscreenRenderReset", "name");
        f14290a.set(false);
    }

    public static Event q(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.AD_REQUEST_ERROR);
    }

    public static Event r(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.PLACEMENT_ERROR);
    }

    public static Event s(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.SHOW);
    }

    public static Event t(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.NOT_READY_ERROR);
    }

    @Override // com.appodeal.ads.zd
    public final boolean c(Activity activity, l0 l0Var) {
        return false;
    }

    @Override // com.appodeal.ads.zd
    public final boolean d(final Activity activity, de deVar, final l0 l0Var) {
        final te teVarA = l0Var.A();
        if (teVarA == null) {
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.i3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return q3.q(l0Var);
                }
            });
            return false;
        }
        final com.appodeal.ads.segments.o oVar = deVar.f13256a;
        l0Var.m(LogConstants.EVENT_SHOW, "isDebug: " + deVar.f13257b + ", isLoaded: " + teVarA.f14911w + ", isLoading: " + teVarA.w() + ", placement: '" + oVar.f14495b + "'");
        if (!oVar.d(activity, l0Var.f13566f, teVarA)) {
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.j3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return q3.r(l0Var);
                }
            });
            return false;
        }
        if (teVarA.i(oVar.f14495b)) {
            String str = oVar.f14495b;
            uc ucVar = (str == null || !teVarA.f14904p.containsKey(str)) ? teVarA.f14906r : (uc) teVarA.f14904p.get(str);
            teVarA.f14906r = ucVar;
            final c3 c3Var = (c3) ucVar;
            if (c3Var != null) {
                l0Var.f13582v = teVarA;
                com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.k3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q3.l(teVarA, c3Var);
                    }
                });
                Runnable task = new Runnable() { // from class: com.appodeal.ads.l3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13589b.p(activity, oVar, teVarA, c3Var, l0Var);
                    }
                };
                Handler handler = b6.f13134a;
                Intrinsics.checkNotNullParameter(task, "task");
                b6.f13134a.post(task);
                AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.m3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q3.s(l0Var);
                    }
                });
                return true;
            }
        }
        AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.n3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q3.t(l0Var);
            }
        });
        return false;
    }

    @Override // com.appodeal.ads.zd
    public final boolean f(Activity activity, de deVar, final l0 l0Var) {
        AtomicBoolean atomicBoolean = f14290a;
        if (atomicBoolean.getAndSet(true)) {
            Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_SHOW_ERROR, "Can't show " + l0Var.f13566f.getDisplayName() + ". Fullscreen ad is already shown");
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.g3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return q3.e(l0Var);
                }
            });
            return false;
        }
        boolean zF = super.f(activity, deVar, l0Var);
        atomicBoolean.set(zF);
        if (zF) {
            Runnable task = new Runnable() { // from class: com.appodeal.ads.h3
                @Override // java.lang.Runnable
                public final void run() {
                    q3.o();
                }
            };
            Handler handler = b6.f13134a;
            Intrinsics.checkNotNullParameter(task, "task");
            b6.f13134a.postDelayed(task, 15000L);
        }
        return zF;
    }

    public final void p(Activity activity, final com.appodeal.ads.segments.o oVar, final te teVar, final c3 c3Var, final l0 l0Var) {
        Object value;
        com.appodeal.ads.utils.session.f fVar;
        com.appodeal.ads.utils.session.e eVar;
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdFullscreenRenderPlay", "name");
        AudioManager audioManager = (AudioManager) activity.getSystemService("audio");
        if (audioManager != null && db.f13243e && audioManager.getStreamVolume(2) == 0) {
            db.f13244f = audioManager.getStreamVolume(3);
            audioManager.setStreamVolume(3, 0, 0);
        }
        AdType adTypeU = teVar.u();
        oVar.getClass();
        if (com.appodeal.ads.segments.o.e(adTypeU)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObjectOptJSONObject = oVar.f14496c.optJSONObject("impression_interval");
            if ((jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt("fullscreen", -1) * 1000 : -1) > 0) {
                oVar.f14499f = jCurrentTimeMillis;
            }
            com.appodeal.ads.segments.o.f14493j = jCurrentTimeMillis;
            long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
            com.appodeal.ads.utils.session.q qVar = oVar.f14500g.f15110a;
            if (qVar.f15104f.get()) {
                MutableStateFlow mutableStateFlow = (MutableStateFlow) qVar.f15107i.getValue();
                do {
                    value = mutableStateFlow.getValue();
                    fVar = (com.appodeal.ads.utils.session.f) value;
                    eVar = fVar.f15074b;
                } while (!mutableStateFlow.b(value, com.appodeal.ads.utils.session.f.b(fVar, null, com.appodeal.ads.utils.session.e.a(eVar, 0L, 0L, 0L, 0L, eVar.f15072i + 1, 255), null, 5)));
            }
            try {
                JSONArray jSONArrayB = oVar.b();
                jSONArrayB.put(jCurrentTimeMillis2);
                com.appodeal.ads.storage.e0 e0Var = oVar.f14501h;
                String key = String.valueOf(oVar.f14494a);
                String string = jSONArrayB.toString();
                e0Var.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(string, "string");
                com.appodeal.ads.storage.a0 a0Var = e0Var.f14800a;
                a0Var.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(string, "string");
                eg.i.d((CoroutineScope) a0Var.f14784b.getValue(), null, null, new com.appodeal.ads.storage.s(a0Var, key, string, null), 3, null);
            } catch (Exception e10) {
                Log.log(e10);
            }
        }
        AdType adType = teVar.u();
        AdNetwork network = c3Var.f14936b;
        Function0 callback = new Function0() { // from class: com.appodeal.ads.o3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q3.n(l0Var, teVar, c3Var);
            }
        };
        EnumMap enumMap = com.appodeal.ads.utils.k.f15028a;
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(callback, "callback");
        com.appodeal.ads.utils.k.f15028a.put(adType, eg.i.d(com.appodeal.ads.utils.k.f15029b, null, null, new com.appodeal.ads.utils.j(adType, network, callback, null), 3, null));
        UnifiedAd unifiedAd = c3Var.f14940f;
        if (unifiedAd != null) {
            UnifiedAdParams unifiedAdParams = c3Var.f14941g;
            if (unifiedAdParams != null) {
                unifiedAd.onPrepareToShow(activity, unifiedAdParams);
            } else {
                UnifiedAdCallback unifiedAdCallback = c3Var.f14942h;
                if (unifiedAdCallback != null) {
                    unifiedAdCallback.onAdShowFailed(new ShowError.SdkShowError("unifiedAdParams is null"));
                }
            }
        }
        AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.p3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q3.m(teVar, c3Var, oVar);
            }
        });
        UnifiedFullscreenAd unifiedFullscreenAd = (UnifiedFullscreenAd) c3Var.f14940f;
        UnifiedFullscreenAdCallback unifiedFullscreenAdCallback = (UnifiedFullscreenAdCallback) c3Var.f14942h;
        if (unifiedFullscreenAd != null && unifiedFullscreenAdCallback != null) {
            unifiedFullscreenAd.show(activity, unifiedFullscreenAdCallback);
        } else if (unifiedFullscreenAdCallback != null) {
            unifiedFullscreenAdCallback.onAdShowFailed(new ShowError.SdkShowError("unifiedAd is null"));
        }
    }
}
