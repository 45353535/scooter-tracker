package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;

/* JADX INFO: loaded from: classes4.dex */
public final class iq3 implements i00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterstitialAdLoadListener f112087a;

    public iq3(InterstitialAdLoadListener interstitialAdLoadListener) {
        this.f112087a = interstitialAdLoadListener;
    }

    @Override // yads.i00
    public final void a(k4 k4Var) {
        new CallbackStackTraceMarker(new gq3(this, new AdRequestError(k4Var.f112578a, k4Var.f112580c, k4Var.f112581d)));
    }

    @Override // yads.i00
    public final void a(ub1 ub1Var) {
        new CallbackStackTraceMarker(new hq3(this, new zp3(ub1Var, new dn3(), new dk())));
    }
}
