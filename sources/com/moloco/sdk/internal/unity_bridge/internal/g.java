package com.moloco.sdk.internal.unity_bridge.internal;

import android.os.Handler;
import android.os.Looper;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback;
import com.moloco.sdk.internal.unity_bridge.internal.g;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bf.a f55756a = new bf.a(0, 1, null);

    public static final class a implements AdLoad.Listener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f55758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterstitialAd f55759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Handler f55760d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MolocoUnityLoadCallback f55761e;

        public a(String str, InterstitialAd interstitialAd, Handler handler, MolocoUnityLoadCallback molocoUnityLoadCallback) {
            this.f55758b = str;
            this.f55759c = interstitialAd;
            this.f55760d = handler;
            this.f55761e = molocoUnityLoadCallback;
        }

        public static final void a(MolocoUnityLoadCallback molocoUnityLoadCallback, String str) {
            molocoUnityLoadCallback.onAdLoadSuccess(str);
        }

        public static final void b(MolocoUnityLoadCallback molocoUnityLoadCallback, String str, MolocoAdError molocoAdError) {
            molocoUnityLoadCallback.onAdLoadFailed(str, molocoAdError.toString());
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadFailed(final MolocoAdError molocoAdError) {
            Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
            Handler handler = this.f55760d;
            final MolocoUnityLoadCallback molocoUnityLoadCallback = this.f55761e;
            final String str = this.f55758b;
            handler.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.e
                @Override // java.lang.Runnable
                public final void run() {
                    g.a.b(molocoUnityLoadCallback, str, molocoAdError);
                }
            });
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadSuccess(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            g.this.f55756a.put(this.f55758b, this.f55759c);
            Handler handler = this.f55760d;
            final MolocoUnityLoadCallback molocoUnityLoadCallback = this.f55761e;
            final String str = this.f55758b;
            handler.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.a.a(molocoUnityLoadCallback, str);
                }
            });
        }
    }

    public static final class b implements InterstitialAdShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Handler f55762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MolocoUnityShowCallback f55763b;

        public b(Handler handler, MolocoUnityShowCallback molocoUnityShowCallback) {
            this.f55762a = handler;
            this.f55763b = molocoUnityShowCallback;
        }

        public static final void a(MolocoUnityShowCallback molocoUnityShowCallback, MolocoAd molocoAd) {
            molocoUnityShowCallback.onAdClicked(molocoAd.getAdUnitId());
        }

        public static final void b(MolocoUnityShowCallback molocoUnityShowCallback, MolocoAdError molocoAdError) {
            molocoUnityShowCallback.onAdShowFailed(molocoAdError.getAdUnitId(), molocoAdError.toString());
        }

        public static final void c(MolocoUnityShowCallback molocoUnityShowCallback, MolocoAd molocoAd) {
            molocoUnityShowCallback.onAdHidden(molocoAd.getAdUnitId());
        }

        public static final void d(MolocoUnityShowCallback molocoUnityShowCallback, MolocoAd molocoAd) {
            molocoUnityShowCallback.onAdShowSuccess(molocoAd.getAdUnitId());
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdClicked(final MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            Handler handler = this.f55762a;
            final MolocoUnityShowCallback molocoUnityShowCallback = this.f55763b;
            handler.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.j
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.a(molocoUnityShowCallback, molocoAd);
                }
            });
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdHidden(final MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            Handler handler = this.f55762a;
            final MolocoUnityShowCallback molocoUnityShowCallback = this.f55763b;
            handler.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.h
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.c(molocoUnityShowCallback, molocoAd);
                }
            });
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowFailed(final MolocoAdError molocoAdError) {
            Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
            Handler handler = this.f55762a;
            final MolocoUnityShowCallback molocoUnityShowCallback = this.f55763b;
            handler.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.i
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.b(molocoUnityShowCallback, molocoAdError);
                }
            });
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowSuccess(final MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            Handler handler = this.f55762a;
            final MolocoUnityShowCallback molocoUnityShowCallback = this.f55763b;
            handler.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.k
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.d(molocoUnityShowCallback, molocoAd);
                }
            });
        }
    }

    public static final Unit c(Handler handler, g gVar, final String str, String str2, final MolocoUnityLoadCallback molocoUnityLoadCallback, InterstitialAd interstitialAd, final MolocoAdError.AdCreateError adCreateError) {
        if (adCreateError != null) {
            handler.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.c
                @Override // java.lang.Runnable
                public final void run() {
                    g.e(molocoUnityLoadCallback, str, adCreateError);
                }
            });
            return Unit.f93236a;
        }
        Intrinsics.checkNotNull(interstitialAd, "null cannot be cast to non-null type com.moloco.sdk.publisher.InterstitialAd");
        gVar.g(interstitialAd, str, str2, handler, molocoUnityLoadCallback);
        return Unit.f93236a;
    }

    public static final void d(MolocoUnityLoadCallback molocoUnityLoadCallback, String str) {
        molocoUnityLoadCallback.onAdLoadSuccess(str);
    }

    public static final void e(MolocoUnityLoadCallback molocoUnityLoadCallback, String str, MolocoAdError.AdCreateError adCreateError) {
        molocoUnityLoadCallback.onAdLoadFailed(str, adCreateError.toString());
    }

    public static final void f(MolocoUnityShowCallback molocoUnityShowCallback, String str) {
        molocoUnityShowCallback.onAdShowFailed(str, "Ad cannot be shown as it was not loaded");
    }

    public final Handler a() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            return new Handler(looperMyLooper);
        }
        throw new IllegalStateException("Can't create handler inside thread " + Thread.currentThread() + " that has not called Looper.prepare()");
    }

    public final void g(InterstitialAd interstitialAd, final String str, String str2, Handler handler, final MolocoUnityLoadCallback molocoUnityLoadCallback) {
        InterstitialAd interstitialAd2 = (InterstitialAd) this.f55756a.get(str);
        if (interstitialAd2 != null) {
            if (interstitialAd2.isLoaded()) {
                handler.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.d(molocoUnityLoadCallback, str);
                    }
                });
                return;
            }
            interstitialAd2.destroy();
        }
        interstitialAd.load(str2, new a(str, interstitialAd, handler, molocoUnityLoadCallback));
    }

    public final void h(final String adUnitId, final MolocoUnityShowCallback callback) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Handler handlerA = a();
        InterstitialAd interstitialAd = (InterstitialAd) this.f55756a.get(adUnitId);
        if (interstitialAd != null && interstitialAd.isLoaded()) {
            interstitialAd.show(new b(handlerA, callback));
            return;
        }
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        handlerA.post(new Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.b
            @Override // java.lang.Runnable
            public final void run() {
                g.f(callback, adUnitId);
            }
        });
    }

    public final void i(String mediation, final String adUnitId, final String bidResponse, final MolocoUnityLoadCallback unityLoadCallback) {
        Intrinsics.checkNotNullParameter(mediation, "mediation");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        Intrinsics.checkNotNullParameter(unityLoadCallback, "unityLoadCallback");
        final Handler handlerA = a();
        Moloco.createInterstitial$default(new MediationInfo(mediation), adUnitId, null, new Function2() { // from class: com.moloco.sdk.internal.unity_bridge.internal.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g.c(handlerA, this, adUnitId, bidResponse, unityLoadCallback, (InterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
            }
        }, 4, null);
    }
}
