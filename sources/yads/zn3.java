package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;

/* JADX INFO: loaded from: classes4.dex */
public final class zn3 implements tz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BannerAdEventListener f118745a;

    public zn3(BannerAdEventListener bannerAdEventListener) {
        this.f118745a = bannerAdEventListener;
    }

    @Override // yads.tz
    public final void a(i5 i5Var) {
        new CallbackStackTraceMarker(new wn3(this, i5Var != null ? new ro3(i5Var) : null));
    }

    @Override // yads.tz
    public final void closeBannerAd() {
    }

    @Override // yads.tz
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new tn3(this));
    }

    @Override // yads.tz
    public final void onAdLoaded() {
        new CallbackStackTraceMarker(new vn3(this));
    }

    @Override // yads.tz
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new xn3(this));
    }

    @Override // yads.tz
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new yn3(this));
    }

    @Override // yads.tz
    public final void a(k4 k4Var) {
        new CallbackStackTraceMarker(new un3(this, new AdRequestError(k4Var.f112578a, k4Var.f112580c, k4Var.f112581d)));
    }
}
