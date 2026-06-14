package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* JADX INFO: loaded from: classes4.dex */
public final class pq3 implements l00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAdEventListener f114749a;

    public pq3(NativeAdEventListener nativeAdEventListener) {
        this.f114749a = nativeAdEventListener;
    }

    @Override // yads.l00
    public final void a(i5 i5Var) {
        new CallbackStackTraceMarker(new mq3(this, i5Var != null ? new ro3(i5Var) : null));
    }

    @Override // yads.l00
    public final void closeNativeAd() {
    }

    @Override // yads.l00
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new lq3(this));
    }

    @Override // yads.l00
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new nq3(this));
    }

    @Override // yads.l00
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new oq3(this));
    }
}
