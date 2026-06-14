package com.appodeal.ads;

import android.app.Activity;
import android.os.Handler;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class D0 extends AdNetwork {
    public D0(C0 c02) {
        super(c02);
    }

    public static void a(final ContextProvider contextProvider, h hVar, final AdNetworkInitializationListener adNetworkInitializationListener) {
        final te teVar = hVar.f13360a;
        if (teVar == null) {
            adNetworkInitializationListener.onInitializationFailed(LoadingError.AdTypeNotSupportedInAdapter);
            return;
        }
        final l0 l0Var = hVar.f13361b;
        if (l0Var == null) {
            adNetworkInitializationListener.onInitializationFailed(LoadingError.AdTypeNotSupportedInAdapter);
            return;
        }
        Runnable task = new Runnable() { // from class: com.appodeal.ads.t
            @Override // java.lang.Runnable
            public final void run() {
                D0.a(contextProvider, teVar, l0Var, adNetworkInitializationListener);
            }
        };
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter(task, "task");
        b6.f13134a.post(task);
        adNetworkInitializationListener.onInitializationFinished();
    }

    @Override // com.appodeal.ads.AdNetwork
    public final AdUnitParams getAdUnitParams(ContextProvider contextProvider, AdUnit adUnit, AdNetworkMediationParams adNetworkMediationParams) {
        return new a();
    }

    @Override // com.appodeal.ads.AdNetwork
    public final InitializeParams getInitializeParams(JSONObject jSONObject) {
        return new h();
    }

    @Override // com.appodeal.ads.AdNetwork
    public final String getRecommendedVersion() {
        return "1";
    }

    @Override // com.appodeal.ads.AdNetwork
    public final String getVersion() {
        return "1";
    }

    @Override // com.appodeal.ads.AdNetwork
    public final /* bridge */ /* synthetic */ void initialize(ContextProvider contextProvider, InitializeParams initializeParams, AdNetworkMediationParams adNetworkMediationParams, AdNetworkInitializationListener adNetworkInitializationListener) {
        a(contextProvider, (h) initializeParams, adNetworkInitializationListener);
    }

    @Override // com.appodeal.ads.AdNetwork
    public final boolean isInitialized() {
        return true;
    }

    public static void a(ContextProvider contextProvider, final te teVar, final l0 l0Var, AdNetworkInitializationListener adNetworkInitializationListener) {
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdDebugAdapter", "name");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity != null) {
            com.appodeal.ads.utils.debug.q.b(resumedActivity, teVar, new Function2() { // from class: com.appodeal.ads.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return D0.a(l0Var, teVar, (Integer) obj, (Boolean) obj2);
                }
            });
        } else {
            adNetworkInitializationListener.onInitializationFailed(LoadingError.InternalError);
        }
    }

    public static /* synthetic */ Unit a(l0 l0Var, te teVar, Integer num, Boolean bool) {
        l0Var.j(teVar, num.intValue(), bool.booleanValue(), true);
        return null;
    }
}
