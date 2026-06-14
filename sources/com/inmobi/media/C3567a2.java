package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C3567a2;
import com.inmobi.media.EnumC3571a6;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3567a2 extends AbstractC3845l1 implements Application.ActivityLifecycleCallbacks {
    public final String F;
    public final String G;
    public boolean H;
    public int I;
    public final C3593b2 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3567a2(Context context, C4093v0 placement, Dk dk) {
        super(context, placement, dk);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placement, "placement");
        String TAG = C3567a2.class.getSimpleName();
        this.F = TAG;
        this.G = "InMobi";
        this.J = new C3593b2();
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        long j10 = placement.f39711a;
        a(context, placement, dk);
    }

    public static final void a(C3567a2 c3567a2, GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, int i10) {
        int iIndexOf = c3567a2.f38922h.indexOf(gestureDetectorOnGestureListenerC3635ci);
        try {
            AbstractC3721g1 abstractC3721g1M = c3567a2.m();
            C3903n9 c3903n9 = c3567a2.f38923i;
            if (c3903n9 != null) {
                String TAG = c3567a2.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c3903n9.c(TAG, "callback onShowNextPodAd");
            }
            if (abstractC3721g1M != null) {
                abstractC3721g1M.a(i10, iIndexOf, gestureDetectorOnGestureListenerC3635ci);
            }
        } catch (Exception unused) {
            c3567a2.b(iIndexOf, false);
            c3567a2.e(iIndexOf);
        }
    }

    public static final void b(C3567a2 c3567a2) {
        try {
            if (c3567a2.f38916b == 7) {
                int i10 = c3567a2.I - 1;
                c3567a2.I = i10;
                if (i10 == 0) {
                    c3567a2.c((byte) 6);
                    AbstractC3721g1 abstractC3721g1M = c3567a2.m();
                    if (abstractC3721g1M != null) {
                        abstractC3721g1M.a();
                    }
                }
            }
        } catch (Exception e10) {
            C3903n9 c3903n9 = c3567a2.f38923i;
            if (c3903n9 != null) {
                String TAG = c3567a2.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c3903n9.b(TAG, "BannerAdUnit.onAdScreenDismissed threw unexpected error: " + e10.getMessage());
            }
        }
    }

    public static final void c(C3567a2 c3567a2) {
        try {
            byte b10 = c3567a2.f38916b;
            if (b10 != 6) {
                if (b10 == 7) {
                    c3567a2.I++;
                    return;
                }
                return;
            }
            c3567a2.I++;
            c3567a2.c((byte) 7);
            C3903n9 c3903n9 = c3567a2.f38923i;
            if (c3903n9 != null) {
                String TAG = c3567a2.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c3903n9.d(TAG, "AdUnit " + c3567a2 + " state - ACTIVE");
            }
            C3903n9 c3903n92 = c3567a2.f38923i;
            if (c3903n92 != null) {
                c3903n92.c(c3567a2.G, "Successfully displayed banner ad for placement Id : " + c3567a2.f38926l);
            }
            AbstractC3721g1 abstractC3721g1M = c3567a2.m();
            if (abstractC3721g1M != null) {
                c3567a2.a(abstractC3721g1M);
            }
        } catch (Exception e10) {
            C3903n9 c3903n93 = c3567a2.f38923i;
            if (c3903n93 != null) {
                String TAG2 = c3567a2.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3903n93.b(TAG2, "BannerAdUnit.onAdScreenDisplayed threw unexpected error: " + e10.getMessage());
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final void C() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "load " + this);
        }
        if (V()) {
            super.C();
        }
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final boolean E() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 == null) {
            return false;
        }
        String TAG = this.F;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        c3903n9.c(TAG, "missingPrerequisitesForAd " + this);
        return false;
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final void F() {
        AbstractC3721g1 abstractC3721g1M;
        super.F();
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            c3903n9.c(this.G, "Banner ad fetch successful for placement id: " + this.f38926l);
        }
        if (!Intrinsics.areEqual(s(), "html") && !Intrinsics.areEqual(s(), "htmlUrl")) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
        }
        if (this.f38916b != 2 || (abstractC3721g1M = m()) == null) {
            return;
        }
        c(abstractC3721g1M);
    }

    public boolean V() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "canProceedToLoad " + this);
        }
        E();
        byte b10 = this.f38916b;
        if (1 == b10 || 2 == b10) {
            Kb.a((byte) 1, this.G, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                String TAG2 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3903n92.b(TAG2, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            }
            if (1 == this.f38916b) {
                b((short) 2008);
            } else {
                b((short) 2011);
            }
            return false;
        }
        if (7 != b10) {
            C3903n9 c3903n93 = this.f38923i;
            if (c3903n93 != null) {
                c3903n93.c(this.G, "Fetching a Banner ad for placement id: " + this.f38926l);
            }
            D();
            return true;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
        C3903n9 c3903n94 = this.f38923i;
        if (c3903n94 != null) {
            String TAG3 = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            c3903n94.b(TAG3, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.f38926l.f39711a);
        }
        return false;
    }

    public final void W() {
        Fn viewableAd;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "onPause " + this);
        }
        byte b10 = this.f38916b;
        if (b10 == 4 || b10 == 6 || b10 == 7) {
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciI = i();
            Context contextN = n();
            if (gestureDetectorOnGestureListenerC3635ciI == null || contextN == null || (viewableAd = gestureDetectorOnGestureListenerC3635ciI.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextN, (byte) 1);
        }
    }

    public final void X() {
        Fn viewableAd;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "onResume " + this);
        }
        byte b10 = this.f38916b;
        if (b10 == 4 || b10 == 6 || b10 == 7) {
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciI = i();
            Context contextN = n();
            if (gestureDetectorOnGestureListenerC3635ciI == null || contextN == null || (viewableAd = gestureDetectorOnGestureListenerC3635ciI.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextN, (byte) 0);
        }
    }

    public final void Y() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "registerLifeCycleCallbacks " + this);
        }
        Context contextN = n();
        if (contextN != null) {
            Ji.a(contextN, this);
        }
    }

    public final void Z() {
        AdConfig adConfig;
        if (Intrinsics.areEqual(this.f38926l.f39716f, "AB") && (adConfig = this.f38917c) != null && adConfig.getSkipNetCheckHB()) {
            C3903n9 c3903n9 = this.f38923i;
            if (c3903n9 != null) {
                String TAG = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c3903n9.a(TAG, "renderAd without internet check");
            }
            a0();
            return;
        }
        C3903n9 c3903n92 = this.f38923i;
        if (c3903n92 != null) {
            String TAG2 = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c3903n92.a(TAG2, "renderAd");
        }
        a(new Function0() { // from class: w3.o5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3567a2.e(this.f107223b);
            }
        }, new Function1() { // from class: w3.p5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3567a2.a(this.f107240b, (EnumC3571a6) obj);
            }
        });
    }

    public final void a0() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "renderAdPostInternetCheck");
        }
        try {
            if (M()) {
                return;
            }
            C3994r1 c3994r1 = this.f38940z;
            c3994r1.getClass();
            c3994r1.f39429g = SystemClock.elapsedRealtime();
            Handler handler = this.f38924j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w3.q5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3567a2.f(this.f107261b);
                    }
                });
            }
        } catch (IllegalStateException e10) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                String TAG2 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3903n92.a(TAG2, "Exception while loading ad.", e10);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    public final void b0() {
        Application application;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "unregisterLifeCycleCallbacks " + this);
        }
        Context contextN = n();
        Activity activity = contextN instanceof Activity ? (Activity) contextN : null;
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final void d() {
        this.J.f38237a = false;
        super.d();
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final synchronized void e(GestureDetectorOnGestureListenerC3635ci renderView) {
        try {
            Intrinsics.checkNotNullParameter(renderView, "renderView");
            C3903n9 c3903n9 = this.f38923i;
            if (c3903n9 != null) {
                String TAG = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c3903n9.a(TAG, "onAdScreenDismissed " + this);
            }
            super.e(renderView);
            Handler handler = this.f38924j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w3.v5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3567a2.b(this.f107345b);
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final synchronized void f(GestureDetectorOnGestureListenerC3635ci renderView) {
        try {
            Intrinsics.checkNotNullParameter(renderView, "renderView");
            C3903n9 c3903n9 = this.f38923i;
            if (c3903n9 != null) {
                String TAG = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c3903n9.a(TAG, "onAdScreenDisplayed " + this);
            }
            super.f(renderView);
            Handler handler = this.f38924j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w3.u5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3567a2.c(this.f107333b);
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC3845l1, com.inmobi.media.AbstractC3686ei
    public void j(GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "onRenderViewVisible " + this);
        }
        super.j(renderView);
        Handler handler = this.f38924j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: w3.r5
                @Override // java.lang.Runnable
                public final void run() {
                    C3567a2.d(this.f107277b);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final HashMap k() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "adSpecificRequestParams getter " + this);
        }
        HashMap map = new HashMap();
        map.put("u-rt", this.H ? "1" : "0");
        map.put("mk-ad-slot", this.f38926l.f39718h);
        return map;
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public String l() {
        return "banner";
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final void o(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "handleRenderViewSignaledAdReady " + this);
        }
        super.o(gestureDetectorOnGestureListenerC3635ci);
        if (this.f38933s && this.f38922h.indexOf(gestureDetectorOnGestureListenerC3635ci) > 0 && this.f38916b == 6) {
            b((byte) 1);
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = (GestureDetectorOnGestureListenerC3635ci) this.f38922h.get(this.f38930p);
            if (gestureDetectorOnGestureListenerC3635ci2 != null) {
                gestureDetectorOnGestureListenerC3635ci2.a(true);
                return;
            }
            return;
        }
        if (this.f38916b != 2) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                String TAG2 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3903n92.a(TAG2, "AdUnit is not in available state, ignoring the ad ready signal - " + ((int) this.f38916b));
                return;
            }
            return;
        }
        b((byte) 1);
        c((byte) 4);
        C3903n9 c3903n93 = this.f38923i;
        if (c3903n93 != null) {
            String TAG3 = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            c3903n93.d(TAG3, "AdUnit " + this + " state - READY");
        }
        C3994r1 c3994r1 = this.f38940z;
        c3994r1.getClass();
        c3994r1.f39431i = SystemClock.elapsedRealtime();
        P();
        S();
        C3903n9 c3903n94 = this.f38923i;
        if (c3903n94 != null) {
            c3903n94.c(this.G, "Successfully loaded Banner ad markup in the WebView for placement id: " + this.f38926l);
        }
        AbstractC3721g1 abstractC3721g1M = m();
        if (abstractC3721g1M != null) {
            d(abstractC3721g1M);
        } else {
            C3903n9 c3903n95 = this.f38923i;
            if (c3903n95 != null) {
                String TAG4 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                c3903n95.b(TAG4, "AdUnit listener is null");
            }
        }
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "onActivityCreated " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "onActivityDestroyed " + this);
        }
        Context contextN = n();
        if (Intrinsics.areEqual(contextN, activity)) {
            Intrinsics.checkNotNull(contextN, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) contextN).getApplication().unregisterActivityLifecycleCallbacks(this);
            d();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "onActivityPaused " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "onActivityResumed " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "onActivitySaveInstanceState " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "onActivityStarted " + this);
        }
        if (Intrinsics.areEqual(n(), activity)) {
            X();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "onActivityStopped " + this);
        }
        if (Intrinsics.areEqual(n(), activity)) {
            W();
        }
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final GestureDetectorOnGestureListenerC3635ci q() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "htmlAdContainer getter " + this);
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = (this.f38922h.size() <= 0 || this.f38930p >= this.f38922h.size()) ? null : (GestureDetectorOnGestureListenerC3635ci) this.f38922h.get(this.f38930p);
        if (this.f38926l.f39720j && gestureDetectorOnGestureListenerC3635ci != null) {
            gestureDetectorOnGestureListenerC3635ci.k();
        }
        return gestureDetectorOnGestureListenerC3635ci;
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final byte t() {
        return (byte) 0;
    }

    public static final void d(C3567a2 c3567a2) {
        try {
            if (c3567a2.f38916b == 4) {
                c3567a2.c((byte) 6);
                C3903n9 c3903n9 = c3567a2.f38923i;
                if (c3903n9 != null) {
                    String TAG = c3567a2.F;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    c3903n9.d(TAG, "AdUnit " + c3567a2 + " state - RENDERED");
                }
            }
        } catch (Exception e10) {
            C3903n9 c3903n92 = c3567a2.f38923i;
            if (c3903n92 != null) {
                String TAG2 = c3567a2.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3903n92.b(TAG2, "BannerAdUnit.onRenderViewVisible threw unexpected error: " + e10.getMessage());
            }
        }
    }

    public static final Unit e(C3567a2 c3567a2) {
        C3903n9 c3903n9 = c3567a2.f38923i;
        if (c3903n9 != null) {
            String TAG = c3567a2.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "loadWithRetry success");
        }
        c3567a2.a0();
        return Unit.f93236a;
    }

    public static final void f(C3567a2 c3567a2) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        if (c3567a2.f38933s) {
            c3567a2.f38931q = System.currentTimeMillis();
            AdSet adSetR = c3567a2.r();
            if (adSetR != null && (ads = adSetR.getAds()) != null) {
                int i10 = 0;
                for (Object obj : ads) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    c3567a2.f38932r.add(Integer.valueOf(i10));
                    i10 = i11;
                }
            }
        }
        c3567a2.N();
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final void q(GestureDetectorOnGestureListenerC3635ci renderView) {
        int iIndexOf;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (this.f38933s && (iIndexOf = this.f38922h.indexOf(renderView)) > this.f38930p && renderView.I != Hn.f37036c) {
            this.f38932r.remove(Integer.valueOf(iIndexOf));
        } else {
            U();
            super.q(renderView);
        }
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final void a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, short s10) throws JSONException {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "handleRenderViewSignaledAdFailed " + this);
        }
        super.a(gestureDetectorOnGestureListenerC3635ci, s10);
        if (this.f38933s) {
            int iIndexOf = this.f38922h.indexOf(gestureDetectorOnGestureListenerC3635ci);
            a(iIndexOf, true);
            if (iIndexOf > 0 && this.f38916b == 6) {
                b((byte) 1);
                GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = (GestureDetectorOnGestureListenerC3635ci) this.f38922h.get(this.f38930p);
                if (gestureDetectorOnGestureListenerC3635ci2 != null) {
                    gestureDetectorOnGestureListenerC3635ci2.a(false);
                }
            }
        }
        if (this.f38916b == 2) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                c3903n92.c(this.G, "Failed to load the Banner markup in the WebView for placement id: " + this.f38926l);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
        }
    }

    @Override // com.inmobi.media.InterfaceC4118w0
    public final void b() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "closeAll " + this);
        }
    }

    public final boolean b(int i10, GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "isInValidShowPodIndex " + i10 + " " + this.f38932r + " " + this.f38922h.indexOf(gestureDetectorOnGestureListenerC3635ci) + " " + this + " ");
        }
        if (!this.f38932r.contains(Integer.valueOf(i10)) || i10 <= this.f38922h.indexOf(gestureDetectorOnGestureListenerC3635ci) || this.f38922h.get(i10) == null) {
            return true;
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = (GestureDetectorOnGestureListenerC3635ci) this.f38922h.get(i10);
        return (gestureDetectorOnGestureListenerC3635ci2 == null || gestureDetectorOnGestureListenerC3635ci2.B0) ? false : true;
    }

    public final void c(String str) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "setAdSize " + this);
        }
        C4093v0 c4093v0 = this.f38926l;
        Intrinsics.checkNotNull(str);
        c4093v0.getClass();
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        c4093v0.f39718h = str;
    }

    public final void b(boolean z10) {
        C3903n9 c3903n9;
        C3903n9 c3903n92 = this.f38923i;
        if (c3903n92 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n92.a(TAG, "load " + this);
        }
        if (z10 && (c3903n9 = this.f38923i) != null) {
            c3903n9.c(this.G, "Initiating Banner refresh for placement id: " + this.f38926l);
        }
        this.H = z10;
        C();
    }

    @Override // com.inmobi.media.InterfaceC4118w0
    public final void a(int i10, GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "loadPodAd " + this);
        }
        if (this.f38932r.contains(Integer.valueOf(i10)) && i10 > this.f38922h.indexOf(renderView)) {
            this.f38929o = i10;
            Handler handler = this.f38924j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w3.s5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3567a2.a(this.f107296b);
                    }
                });
                return;
            }
            return;
        }
        C3903n9 c3903n92 = this.f38923i;
        if (c3903n92 != null) {
            String TAG2 = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c3903n92.a(TAG2, "No more ads present in pod adSet or current adSet is not pod adSet");
        }
        ArrayList arrayList = this.f38922h;
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) arrayList.get(arrayList.indexOf(renderView));
        if (gestureDetectorOnGestureListenerC3635ci != null) {
            gestureDetectorOnGestureListenerC3635ci.a(false);
        }
    }

    public static final void a(C3567a2 c3567a2) {
        C3903n9 c3903n9 = c3567a2.f38923i;
        if (c3903n9 != null) {
            String TAG = c3567a2.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "start loading html ad");
        }
        c3567a2.N();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit a(com.inmobi.media.C3567a2 r4, com.inmobi.media.EnumC3571a6 r5) {
        /*
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.inmobi.media.n9 r0 = r4.f38923i
            if (r0 == 0) goto L24
            java.lang.String r1 = r4.F
            java.lang.String r2 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "loadWithRetry error - "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.b(r1, r2)
        L24:
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE
            r0.<init>(r1)
            java.lang.String r1 = "errorCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            int r5 = r5.ordinal()
            if (r5 == 0) goto L50
            r1 = 21
            if (r5 == r1) goto L4d
            switch(r5) {
                case 12: goto L4a;
                case 13: goto L47;
                case 14: goto L44;
                case 15: goto L41;
                case 16: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L50
        L3e:
            r5 = 2127(0x84f, float:2.98E-42)
            goto L52
        L41:
            r5 = 2126(0x84e, float:2.979E-42)
            goto L52
        L44:
            r5 = 2125(0x84d, float:2.978E-42)
            goto L52
        L47:
            r5 = 2124(0x84c, float:2.976E-42)
            goto L52
        L4a:
            r5 = 2123(0x84b, float:2.975E-42)
            goto L52
        L4d:
            r5 = 2229(0x8b5, float:3.123E-42)
            goto L52
        L50:
            r5 = 2122(0x84a, float:2.974E-42)
        L52:
            r1 = 1
            r4.a(r0, r1, r5)
            kotlin.Unit r4 = kotlin.Unit.f93236a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3567a2.a(com.inmobi.media.a2, com.inmobi.media.a6):kotlin.Unit");
    }

    @Override // com.inmobi.media.AbstractC3845l1, com.inmobi.media.InterfaceC4118w0
    public final void a(final int i10, final GestureDetectorOnGestureListenerC3635ci renderView, Context context) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "showPodAdAtIndex " + this + " index - " + i10);
        }
        if (!this.f38933s) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                String TAG2 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3903n92.b(TAG2, "Cannot show an pod ad as isPod is not set.");
            }
            ArrayList arrayList = this.f38922h;
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) arrayList.get(arrayList.indexOf(renderView));
            if (gestureDetectorOnGestureListenerC3635ci != null) {
                gestureDetectorOnGestureListenerC3635ci.b(false);
                return;
            }
            return;
        }
        if (b(i10, renderView)) {
            C3903n9 c3903n93 = this.f38923i;
            if (c3903n93 != null) {
                String TAG3 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                c3903n93.b(TAG3, "Cannot show an pod ad with invalid index passed");
            }
            ArrayList arrayList2 = this.f38922h;
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = (GestureDetectorOnGestureListenerC3635ci) arrayList2.get(arrayList2.indexOf(renderView));
            if (gestureDetectorOnGestureListenerC3635ci2 != null) {
                gestureDetectorOnGestureListenerC3635ci2.b(false);
                return;
            }
            return;
        }
        super.a(i10, renderView, context);
        Handler handler = this.f38924j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: w3.t5
                @Override // java.lang.Runnable
                public final void run() {
                    C3567a2.a(this.f107318b, renderView, i10);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public void a(V1 audioStatusInternal) {
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        AbstractC3721g1 abstractC3721g1M = m();
        if (abstractC3721g1M != null) {
            abstractC3721g1M.a(audioStatusInternal);
        }
        C3593b2 c3593b2 = this.J;
        c3593b2.getClass();
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        if (!c3593b2.f38237a && audioStatusInternal == V1.f37872e) {
            c3593b2.f38237a = true;
            W8 w82 = W8.f37936c;
            w82.f38537a = System.currentTimeMillis();
            w82.f38538b++;
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public void a(boolean z10) {
        W8 w82 = W8.f37936c;
        Context context = Ji.f37157a;
        if (context == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        Ea eaA = Da.a(context, "banner_audio_pref_file");
        Intrinsics.checkNotNullParameter("user_mute_count", C4240b4.i.W);
        int i10 = eaA.f36783a.getInt("user_mute_count", 0);
        eaA.a("user_mute_count", z10 ? Math.max(0, i10 - 1) : i10 + 1, false);
    }

    @Override // com.inmobi.media.AbstractC3845l1, com.inmobi.media.AbstractC3686ei
    public final void a(GestureDetectorOnGestureListenerC3635ci renderView, boolean z10) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.a(renderView, z10);
        byte b10 = this.f38916b;
        if (b10 != 4 && b10 != 6) {
            if (b10 == 7) {
                renderView.a(z10, b10 == 7 ? z10 ? (short) 2224 : (short) 2223 : (short) 2227);
            }
        } else {
            if (b10 == 4) {
                s = z10 ? (short) 2220 : (short) 2219;
            } else if (b10 == 6) {
                s = z10 ? (short) 2222 : (short) 2221;
            }
            J();
            renderView.a(z10, s);
        }
    }
}
