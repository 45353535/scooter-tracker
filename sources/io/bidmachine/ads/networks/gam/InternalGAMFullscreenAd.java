package io.bidmachine.ads.networks.gam;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam.InternalGAMAd;

/* JADX INFO: loaded from: classes12.dex */
public abstract class InternalGAMFullscreenAd extends InternalGAMAd {
    public InternalGAMFullscreenAd(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData) {
        super(gAMLoader, adsFormat, gAMUnitData);
    }

    public static /* synthetic */ void h(InternalGAMFullscreenAd internalGAMFullscreenAd, Activity activity, InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) {
        internalGAMFullscreenAd.getClass();
        try {
            internalGAMFullscreenAd.setStatus(InternalGAMAd.Status.Showing);
            internalGAMFullscreenAd.showAd(activity, internalGAMFullscreenAdPresentListener);
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
            internalGAMFullscreenAdPresentListener.onAdShowFailed(ae.a.l("Exception showing InternalGAM object", th2));
        }
    }

    public final void show(@NonNull final Activity activity, @NonNull final InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) {
        io.bidmachine.core.h.U(new Runnable() { // from class: io.bidmachine.ads.networks.gam.q
            @Override // java.lang.Runnable
            public final void run() {
                InternalGAMFullscreenAd.h(this.f79235b, activity, internalGAMFullscreenAdPresentListener);
            }
        });
    }

    @UiThread
    protected abstract void showAd(@NonNull Activity activity, @NonNull InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) throws Throwable;
}
