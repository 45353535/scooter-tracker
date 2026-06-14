package io.bidmachine.ads.networks.gam_dynamic;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.InternalAd;
import io.bidmachine.protobuf.Waterfall;

/* JADX INFO: loaded from: classes12.dex */
public abstract class InternalFullscreenAd extends InternalAd {
    public InternalFullscreenAd(@NonNull NetworkParams networkParams, @NonNull TaskExecutor taskExecutor, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull InternalAdListener internalAdListener) {
        super(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener);
    }

    public static /* synthetic */ void i(InternalFullscreenAd internalFullscreenAd, Activity activity, InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        internalFullscreenAd.getClass();
        try {
            internalFullscreenAd.setStatus(InternalAd.Status.Showing);
            internalFullscreenAd.showAd(activity, internalFullscreenAdPresentListener);
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
            internalFullscreenAdPresentListener.onAdShowFailed(ae.a.l("Exception showing InternalAd object", th2));
        }
    }

    public final void show(@NonNull final Activity activity, @NonNull final InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        io.bidmachine.core.h.U(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.s
            @Override // java.lang.Runnable
            public final void run() {
                InternalFullscreenAd.i(this.f79310b, activity, internalFullscreenAdPresentListener);
            }
        });
    }

    @UiThread
    protected abstract void showAd(@NonNull Activity activity, @NonNull InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) throws Throwable;
}
