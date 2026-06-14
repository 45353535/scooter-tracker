package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;

/* JADX INFO: loaded from: classes4.dex */
public final class ko3 implements tz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClosableBannerAdEventListener f112799a;

    public ko3(ClosableBannerAdEventListener closableBannerAdEventListener) {
        this.f112799a = closableBannerAdEventListener;
    }

    @Override // yads.tz
    public final void a(i5 i5Var) {
        new CallbackStackTraceMarker(new ho3(this, i5Var != null ? new ro3(i5Var) : null));
    }

    @Override // yads.tz
    public final void closeBannerAd() {
        new CallbackStackTraceMarker(new do3(this));
    }

    @Override // yads.tz
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new eo3(this));
    }

    @Override // yads.tz
    public final void onAdLoaded() {
        new CallbackStackTraceMarker(new go3(this));
    }

    @Override // yads.tz
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new io3(this));
    }

    @Override // yads.tz
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new jo3(this));
    }

    @Override // yads.tz
    public final void a(k4 k4Var) {
        new CallbackStackTraceMarker(new fo3(this, new AdRequestError(k4Var.f112578a, k4Var.f112580c, k4Var.f112581d)));
    }
}
