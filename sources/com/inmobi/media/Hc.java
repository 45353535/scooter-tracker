package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.Hc;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Hc extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rg f37011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3630cd f37012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f37013c;

    public Hc(InMobiNative inMobiNative, Rg publisherListenersModel, C3630cd nativeFlowManagerNotifier) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        Intrinsics.checkNotNullParameter(publisherListenersModel, "publisherListenersModel");
        Intrinsics.checkNotNullParameter(nativeFlowManagerNotifier, "nativeFlowManagerNotifier");
        this.f37011a = publisherListenersModel;
        this.f37012b = nativeFlowManagerNotifier;
        this.f37013c = new WeakReference(inMobiNative);
    }

    public static final Unit b(Hc hc2, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f37011a.f37669a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFullScreenDismissed(inMobiNative);
        }
        return Unit.f93236a;
    }

    public static final Unit c(Hc hc2, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f37011a.f37669a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFullScreenDisplayed(inMobiNative);
        }
        return Unit.f93236a;
    }

    public static final Unit d(Hc hc2, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f37011a.f37669a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onUserWillLeaveApplication(inMobiNative);
        }
        return Unit.f93236a;
    }

    public static final Unit e(Hc hc2, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hc2.f37011a.f37670b;
        if (videoEventListener != null) {
            videoEventListener.onVideoCompleted(inMobiNative);
        }
        return Unit.f93236a;
    }

    public static final Unit f(Hc hc2, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hc2.f37011a.f37670b;
        if (videoEventListener != null) {
            videoEventListener.onVideoPaused(inMobiNative);
        }
        return Unit.f93236a;
    }

    public static final Unit g(Hc hc2, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hc2.f37011a.f37670b;
        if (videoEventListener != null) {
            videoEventListener.onVideoResumed(inMobiNative);
        }
        return Unit.f93236a;
    }

    public static final Unit h(Hc hc2, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hc2.f37011a.f37670b;
        if (videoEventListener != null) {
            videoEventListener.onVideoStarted(inMobiNative);
        }
        return Unit.f93236a;
    }

    public final void a(Function1 function1) {
        InMobiNative inMobiNative = (InMobiNative) this.f37013c.get();
        if (inMobiNative == null) {
            Kb.a((byte) 1, "NativeCallbacks", "Lost reference to InMobiNative! callback cannot be given");
        } else {
            function1.invoke(inMobiNative);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final byte getType() {
        return (byte) 0;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdClicked(Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        a(new Function1() { // from class: w3.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hc.a(this.f107160b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdDismissed() {
        a(new Function1() { // from class: w3.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hc.b(this.f106999b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdDisplayed(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        a(new Function1() { // from class: w3.i1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hc.c(this.f107097b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdFetchFailed(InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        onAdLoadFailed(status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdFetchSuccessful(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        a(new Function1() { // from class: w3.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hc.a(this.f106984b, info, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdImpression(final C3740gk c3740gk) {
        a(new Function1() { // from class: w3.k1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hc.a(this.f107135b, c3740gk, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdLoadFailed(final InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        a(new Function1() { // from class: w3.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hc.a(this.f107010b, status, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAudioStateChanged(final boolean z10) {
        a(new Function1() { // from class: w3.g1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hc.a(z10, this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onUserLeftApplication() {
        a(new Function1() { // from class: w3.h1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hc.d(this.f107077b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoCompleted() {
        a(new Function1() { // from class: w3.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hc.e(this.f107044b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoPaused() {
        a(new Function1() { // from class: w3.j1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hc.f(this.f107112b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoResumed() {
        a(new Function1() { // from class: w3.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hc.g(this.f107200b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoStarted() {
        a(new Function1() { // from class: w3.m1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hc.h(this.f107180b, (InMobiNative) obj);
            }
        });
    }

    public static final Unit a(Hc hc2, AdMetaInfo adMetaInfo, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        Ac ac2 = hc2.f37012b.f38336a.f38443d.f36938b;
        ac2.getClass();
        InterfaceC3636cj interfaceC3636cj = ac2.f36566c;
        O6 o62 = interfaceC3636cj instanceof O6 ? (O6) interfaceC3636cj : null;
        if (o62 != null) {
            InterfaceC3878m9 interfaceC3878m9L = o62.l();
            if (interfaceC3878m9L != null) {
                ((C3903n9) interfaceC3878m9L).a("AUM-FetchedState", "Inflate Called");
            }
            Yc yc2 = (Yc) o62;
            InterfaceC3878m9 interfaceC3878m9L2 = yc2.l();
            if (interfaceC3878m9L2 != null) {
                ((C3903n9) interfaceC3878m9L2).a("AUM-NativeFetchedState", "transitionToLoadingState Called - starting ad inflation");
            }
            yc2.f38051j.a(new Cd(yc2.f38047f, yc2.f38048g, yc2.f38049h, yc2.f38050i, yc2.f38051j), yc2);
        }
        NativeAdEventListener nativeAdEventListener = hc2.f37011a.f37669a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFetchSuccessful(inMobiNative, adMetaInfo);
        }
        return Unit.f93236a;
    }

    public final void a(final C3605be pubData, final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(pubData, "pubData");
        Intrinsics.checkNotNullParameter(info, "info");
        a(new Function1() { // from class: w3.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hc.a(this.f107028b, pubData, info, (InMobiNative) obj);
            }
        });
    }

    public static final Unit a(Hc hc2, C3605be pubData, AdMetaInfo adMetaInfo, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        C3630cd c3630cd = hc2.f37012b;
        c3630cd.getClass();
        Intrinsics.checkNotNullParameter(pubData, "pubData");
        c3630cd.f38336a.f38444e = pubData;
        NativeAdEventListener nativeAdEventListener = hc2.f37011a.f37669a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdLoadSucceeded(inMobiNative, adMetaInfo);
        }
        return Unit.f93236a;
    }

    public static final Unit a(Hc hc2, InMobiAdRequestStatus inMobiAdRequestStatus, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f37011a.f37669a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdLoadFailed(inMobiNative, inMobiAdRequestStatus);
        }
        return Unit.f93236a;
    }

    public static final Unit a(Hc hc2, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f37011a.f37669a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdClicked(inMobiNative);
        }
        InMobiNative.LockScreenListener lockScreenListener = hc2.f37011a.f37671c;
        if (lockScreenListener != null) {
            lockScreenListener.onActionRequired(inMobiNative);
        }
        return Unit.f93236a;
    }

    public static final Unit a(boolean z10, Hc hc2, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hc2.f37011a.f37670b;
        if (videoEventListener != null) {
            videoEventListener.onAudioStateChanged(inMobiNative, z10);
        }
        return Unit.f93236a;
    }

    public static final Unit a(Hc hc2, C3740gk c3740gk, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f37011a.f37669a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdImpression(inMobiNative);
        }
        if (c3740gk != null) {
            c3740gk.c();
        }
        return Unit.f93236a;
    }
}
