package io.bidmachine.ads.networks.gam_dynamic;

import android.app.Activity;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appodeal.ads.modules.common.internal.LogConstants;
import io.bidmachine.ContextProvider;
import io.bidmachine.RendererConfiguration;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
abstract class GAMFullscreenAd extends od.h {

    @NonNull
    protected final GAMNetwork gamNetwork;

    @Nullable
    @VisibleForTesting(otherwise = 4)
    protected InternalFullscreenAd internalFullscreenAd;

    protected GAMFullscreenAd(@NonNull GAMNetwork gAMNetwork) {
        this.gamNetwork = gAMNetwork;
    }

    @Override // od.b
    @Nullable
    public Map<String, Object> getCustomParams() {
        InternalFullscreenAd internalFullscreenAd = this.internalFullscreenAd;
        if (internalFullscreenAd != null) {
            return internalFullscreenAd.getCustomParamsMap();
        }
        return null;
    }

    @Nullable
    protected abstract InternalFullscreenAdPresentListener getPresentListener();

    @Override // od.b
    @CallSuper
    public void onDestroy() {
        InternalFullscreenAd internalFullscreenAd = this.internalFullscreenAd;
        if (internalFullscreenAd != null) {
            internalFullscreenAd.destroy();
            this.internalFullscreenAd = null;
        }
    }

    @Override // od.b
    public void onShown() {
        super.onShown();
        InternalFullscreenAd internalFullscreenAd = this.internalFullscreenAd;
        if (internalFullscreenAd != null) {
            internalFullscreenAd.onAdShown();
        }
    }

    @Override // od.h
    public void show(@NonNull ContextProvider contextProvider, @NonNull od.i iVar, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            iVar.onAdShowFailed(ae.a.i(LogConstants.MSG_ACTIVITY_IS_NULL));
            return;
        }
        InternalFullscreenAd internalFullscreenAd = this.internalFullscreenAd;
        if (internalFullscreenAd == null) {
            iVar.onAdShowFailed(ae.a.i("Fullscreen object is null"));
            return;
        }
        if (internalFullscreenAd.isExpired()) {
            iVar.onAdShowFailed(ae.a.i("Fullscreen object is expired"));
            return;
        }
        if (!this.internalFullscreenAd.isLoaded()) {
            iVar.onAdShowFailed(ae.a.i("Fullscreen object not loaded"));
            return;
        }
        InternalFullscreenAdPresentListener presentListener = getPresentListener();
        if (presentListener == null) {
            iVar.onAdShowFailed(ae.a.i("Fullscreen listener is null"));
        } else {
            this.internalFullscreenAd.show(activity, presentListener);
        }
    }
}
