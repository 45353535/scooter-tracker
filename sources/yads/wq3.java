package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;

/* JADX INFO: loaded from: classes4.dex */
public final class wq3 implements o00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAdLoadListener f117533a;

    public wq3(NativeAdLoadListener nativeAdLoadListener) {
        this.f117533a = nativeAdLoadListener;
    }

    public final void a(jz1 jz1Var) {
        new CallbackStackTraceMarker(new uq3(this, new com.yandex.mobile.ads.nativeads.d(jz1Var)));
    }

    public final void b(jz1 jz1Var) {
        new CallbackStackTraceMarker(new vq3(this, new com.yandex.mobile.ads.nativeads.d(jz1Var)));
    }

    public final void a(k4 k4Var) {
        new CallbackStackTraceMarker(new tq3(this, new AdRequestError(k4Var.f112578a, k4Var.f112580c, k4Var.f112581d)));
    }
}
