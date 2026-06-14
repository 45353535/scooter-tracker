package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m6 extends ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterstitialCallbacks f13642a;

    @Override // com.appodeal.ads.ka
    public final void a(te teVar, uc ucVar) {
        q7 adRequest = (q7) teVar;
        l7 adObject = (l7) ucVar;
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        String str = LogConstants.EVENT_NOTIFY_CLOSED;
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str2 = String.format("finished: %s", Arrays.copyOf(new Object[]{Boolean.valueOf(adRequest.f14913y)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        Log.log("Interstitial", str, str2, Log.LogLevel.verbose);
        InterstitialCallbacks interstitialCallbacks = this.f13642a;
        if (interstitialCallbacks != null) {
            interstitialCallbacks.onInterstitialClosed();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void b(te teVar, uc ucVar, Object obj) {
        q7 adRequest = (q7) teVar;
        l7 adObject = (l7) ucVar;
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Log.log("Interstitial", LogConstants.EVENT_NOTIFY_CLICKED, Log.LogLevel.verbose);
        InterstitialCallbacks interstitialCallbacks = this.f13642a;
        if (interstitialCallbacks != null) {
            interstitialCallbacks.onInterstitialClicked();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void c(te teVar, uc ucVar) {
        q7 adRequest = (q7) teVar;
        l7 adObject = (l7) ucVar;
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Log.log("Interstitial", LogConstants.EVENT_NOTIFY_EXPIRED, Log.LogLevel.verbose);
        InterstitialCallbacks interstitialCallbacks = this.f13642a;
        if (interstitialCallbacks != null) {
            interstitialCallbacks.onInterstitialExpired();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void d(te teVar, uc ucVar, Object obj) {
        Log.log("Interstitial", LogConstants.EVENT_NOTIFY_SHOW_FAILED, Log.LogLevel.verbose);
        InterstitialCallbacks interstitialCallbacks = this.f13642a;
        if (interstitialCallbacks != null) {
            interstitialCallbacks.onInterstitialShowFailed();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void f(te teVar, uc ucVar, Object obj) {
        Log.log("Interstitial", LogConstants.EVENT_NOTIFY_SHOWN, Log.LogLevel.verbose);
        InterstitialCallbacks interstitialCallbacks = this.f13642a;
        if (interstitialCallbacks != null) {
            interstitialCallbacks.onInterstitialShown();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void g(te teVar, uc ucVar) {
        Log.log("Interstitial", LogConstants.EVENT_NOTIFY_LOAD_FAILED, Log.LogLevel.verbose);
        InterstitialCallbacks interstitialCallbacks = this.f13642a;
        if (interstitialCallbacks != null) {
            interstitialCallbacks.onInterstitialFailedToLoad();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void h(te teVar, uc ucVar) {
        q7 adRequest = (q7) teVar;
        l7 adObject = (l7) ucVar;
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        String str = LogConstants.EVENT_NOTIFY_LOADED;
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str2 = String.format("isPrecache: %s", Arrays.copyOf(new Object[]{Boolean.valueOf(adObject.f14937c.f15228e)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        Log.log("Interstitial", str, str2, Log.LogLevel.verbose);
        InterstitialCallbacks interstitialCallbacks = this.f13642a;
        if (interstitialCallbacks != null) {
            interstitialCallbacks.onInterstitialLoaded(adObject.f14937c.f15228e);
        }
    }
}
